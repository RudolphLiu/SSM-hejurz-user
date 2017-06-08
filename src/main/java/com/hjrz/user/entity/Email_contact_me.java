package com.hjrz.user.entity;

import java.util.Date;

public class Email_contact_me {
    private Integer linkCode;

    private String link_user_name;

    private String link_user_email;

    private Date create_time;

    private String link_handle_state;

    private String link_message;

    public Integer getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(Integer linkCode) {
        this.linkCode = linkCode;
    }

    public String getLink_user_name() {
        return link_user_name;
    }

    public void setLink_user_name(String link_user_name) {
        this.link_user_name = link_user_name == null ? null : link_user_name.trim();
    }

    public String getLink_user_email() {
        return link_user_email;
    }

    public void setLink_user_email(String link_user_email) {
        this.link_user_email = link_user_email == null ? null : link_user_email.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getLink_handle_state() {
        return link_handle_state;
    }

    public void setLink_handle_state(String link_handle_state) {
        this.link_handle_state = link_handle_state == null ? null : link_handle_state.trim();
    }

    public String getLink_message() {
        return link_message;
    }

    public void setLink_message(String link_message) {
        this.link_message = link_message == null ? null : link_message.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Email_contact_me other = (Email_contact_me) that;
        return (this.getLinkCode() == null ? other.getLinkCode() == null : this.getLinkCode().equals(other.getLinkCode()))
            && (this.getLink_user_name() == null ? other.getLink_user_name() == null : this.getLink_user_name().equals(other.getLink_user_name()))
            && (this.getLink_user_email() == null ? other.getLink_user_email() == null : this.getLink_user_email().equals(other.getLink_user_email()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getLink_handle_state() == null ? other.getLink_handle_state() == null : this.getLink_handle_state().equals(other.getLink_handle_state()))
            && (this.getLink_message() == null ? other.getLink_message() == null : this.getLink_message().equals(other.getLink_message()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLinkCode() == null) ? 0 : getLinkCode().hashCode());
        result = prime * result + ((getLink_user_name() == null) ? 0 : getLink_user_name().hashCode());
        result = prime * result + ((getLink_user_email() == null) ? 0 : getLink_user_email().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getLink_handle_state() == null) ? 0 : getLink_handle_state().hashCode());
        result = prime * result + ((getLink_message() == null) ? 0 : getLink_message().hashCode());
        return result;
    }
}