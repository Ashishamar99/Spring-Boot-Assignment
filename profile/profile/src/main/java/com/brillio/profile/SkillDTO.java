package com.brillio.profile;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "skills")
public class SkillDTO {

    @Id
    String skillid;

    @Column
    String profileid;

    @Column
    String skillname;

    @Column
    String level;

    public String getSkillid() {
        return skillid;
    }

    public void setSkillid(String skillid) {
        this.skillid = skillid;
    }

    public String getProfileid() {
        return profileid;
    }

    public void setProfileid(String profileid) {
        this.profileid = profileid;
    }

    public String getSkillname() {
        return skillname;
    }

    public void setSkillname(String skillname) {
        this.skillname = skillname;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

//    @ManyToOne
//    @JoinColumn(name = "id")
//    List<ProfileDTO> profileList;
//
//    public List<ProfileDTO> getProfileList() {
//        return profileList;
//    }
//
//    public void setProfileList(List<ProfileDTO> profileList) {
//        this.profileList = profileList;
//    }
}
