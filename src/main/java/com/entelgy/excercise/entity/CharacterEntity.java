package com.entelgy.excercise.entity;

import java.util.Objects;

//change string for objects
public class CharacterEntity {
private String species;
private String status;
private String originPlanet;
private String gender;
private String _id;
private String name;
private String series;
private String created;
private String url;
private String image;
private String __v;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOriginPlanet() {
        return originPlanet;
    }

    public void setOriginPlanet(String originPlanet) {
        this.originPlanet = originPlanet;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String get__v() {
        return __v;
    }

    public void set__v(String __v) {
        this.__v = __v;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharacterEntity that = (CharacterEntity) o;
        return Objects.equals(species, that.species) &&
                Objects.equals(status, that.status) &&
                Objects.equals(originPlanet, that.originPlanet) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(_id, that._id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(series, that.series) &&
                Objects.equals(created, that.created) &&
                Objects.equals(url, that.url) &&
                Objects.equals(image, that.image) &&
                Objects.equals(__v, that.__v);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, status, originPlanet, gender, _id, name, series, created, url, image, __v);
    }
}
