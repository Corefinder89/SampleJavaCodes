
package com.tryouts.jackson;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "gender",
    "verified",
    "userImage"
})
public class GetUserInfo {

    @JsonProperty("name")
    private Name name;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("verified")
    private Boolean verified;
    @JsonProperty("userImage")
    private String userImage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The gender
     */
    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    /**
     * 
     * @param gender
     *     The gender
     */
    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 
     * @return
     *     The verified
     */
    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    /**
     * 
     * @param verified
     *     The verified
     */
    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     * 
     * @return
     *     The userImage
     */
    @JsonProperty("userImage")
    public String getUserImage() {
        return userImage;
    }

    /**
     * 
     * @param userImage
     *     The userImage
     */
    @JsonProperty("userImage")
    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
