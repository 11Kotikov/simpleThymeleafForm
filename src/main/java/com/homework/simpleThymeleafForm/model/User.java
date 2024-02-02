package com.homework.simpleThymeleafForm.model;

public class User {
        private String name;
        private String location;
        private String occupation;
        private String favoriteBooks;
        private String favoriteMovies;
        private String dislikes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getFavoriteBooks() {
        return favoriteBooks;
    }

    public void setFavoriteBooks(String favoriteBooks) {
        this.favoriteBooks = favoriteBooks;
    }

    public String getFavoriteMovies() {
        return favoriteMovies;
    }

    public void setFavoriteMovies(String favoriteMovies) {
        this.favoriteMovies = favoriteMovies;
    }

    public String getDislikes() {
        return dislikes;
    }

    public void setDislikes(String dislikes) {
        this.dislikes = dislikes;
    }
}

