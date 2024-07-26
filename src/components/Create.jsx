import React, { useState } from "react";
import axios from "axios";
import {
  Typography,
  TextField,
  Button,
  Paper,
  Box,
  Grid
} from "@mui/material";
import { useNavigate } from "react-router-dom";

const initial = {
  postId: "",
  postProfile: "",
  reqExperience: 0,
  postTechStack: [],
  postDesc: "",
};

const Create = () => {
  const skillSet = [
    { name: "Javascript" },
    { name: "Java" },
    { name: "Python" },
    { name: "Django" },
    { name: "Spring Boot" },
    { name: "C++" },
    { name: "C" },
    { name: "AWS" },
    { name: "Redis" },
    { name: ".NET Framework" },
    { name: "Postman" },
    { name: "Flutter" },
    { name: "Dart" },
    { name: "Kafka" },
    { name: "Docker" }
  ];

  const navigate = useNavigate();
  const [form, setForm] = useState(initial);

  const handleSubmit = (e) => {
    e.preventDefault();
    axios
      .post("http://localhost:8080/jobPost", form)
      .then((resp) => {
        console.log(resp.data);
        navigate('/');
      })
      .catch((error) => {
        console.log(error);
      });
  };

  const { postId, postProfile, reqExperience, postDesc } = form;

  const handleChange = (e) => {
    const value = e.target.value;
    setForm((prevForm) => ({
      ...prevForm,
      postTechStack: prevForm.postTechStack.includes(value)
        ? prevForm.postTechStack.filter((item) => item !== value)
        : [...prevForm.postTechStack, value],
    }));
  };

  return (
    <Paper sx={{ padding: "2%" }} elevation={0}>
      <Typography sx={{ margin: "3% auto" }} align="center" variant="h5">
        Create New Post
      </Typography>
      <form autoComplete="off" noValidate onSubmit={handleSubmit}>
        <Box
          sx={{
            display: "flex",
            flexDirection: "column",
            alignItems: "center",
          }}
        >
          <TextField
            min="0"
            type="number"
            sx={{ width: "50%", margin: "2% auto" }}
            onChange={(e) => setForm({ ...form, postId: e.target.value })}
            label="Enter your Post ID"
            variant="outlined"
            value={postId}
          />
          <TextField
            type="text"
            sx={{ width: "50%", margin: "2% auto" }}
            required
            onChange={(e) => setForm({ ...form, postProfile: e.target.value })}
            label="Job Profile"
            variant="outlined"
            value={postProfile}
          />
          <TextField
            min="0"
            type="number"
            sx={{ width: "50%", margin: "2% auto" }}
            required
            onChange={(e) => setForm({ ...form, reqExperience: e.target.value })}
            label="Years of Experience"
            variant="outlined"
            value={reqExperience}
          />
          <TextField
            type="text"
            sx={{ width: "50%", margin: "2% auto" }}
            required
            multiline
            rows={4}
            onChange={(e) => setForm({ ...form, postDesc: e.target.value })}
            label="Job Description"
            variant="outlined"
            value={postDesc}
          />
          <Box sx={{ margin: "2% auto", width: "50%" }}>
            <Typography variant="h6" align="center">
              Please mention required skills
            </Typography>
            <Grid container spacing={2} sx={{ marginTop: 2 }}>
              {skillSet.map(({ name }, index) => (
                <Grid item xs={6} sm={4} key={index}>
                  <div>
                    <input
                      type="checkbox"
                      id={`custom-checkbox-${index}`}
                      name={name}
                      value={name}
                      onChange={handleChange}
                    />
                    <label htmlFor={`custom-checkbox-${index}`}>{name}</label>
                  </div>
                </Grid>
              ))}
            </Grid>
          </Box>
          <Button
            sx={{ width: "50%", margin: "2% auto" }}
            variant="contained"
            type="submit"
          >
            Submit
          </Button>
        </Box>
      </form>
    </Paper>
  );
};

export default Create;
