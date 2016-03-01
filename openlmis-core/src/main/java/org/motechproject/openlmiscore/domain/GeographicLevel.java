package org.motechproject.openlmiscore.domain;

import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;
import org.motechproject.mds.annotations.Ignore;

import javax.validation.constraints.NotNull;

@Entity
public class GeographicLevel {

    private static final Integer ROOT_LEVEL_NUMBER = 1;

    @Field
    @NotNull
    private String code;

    @Field
    @NotNull
    private String name;

    @Field
    @NotNull
    private Integer levelNumber;

    public GeographicLevel(String code, String name, Integer levelNumber) {
        this.code = code;
        this.name = name;
        this.levelNumber = levelNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(Integer levelNumber) {
        this.levelNumber = levelNumber;
    }

    @Ignore
    public boolean isRootLevel() {
        return this.levelNumber.equals(ROOT_LEVEL_NUMBER);
    }

    @Ignore
    public boolean isLowerInHierarchyThan(GeographicLevel level) {
        return this.getLevelNumber() > level.getLevelNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        GeographicLevel that = (GeographicLevel) o;

        if (!code.equals(that.code)) {
            return false;
        }
        if (!name.equals(that.name)) {
            return false;
        }
        return levelNumber.equals(that.levelNumber);

    }

    @Override
    public int hashCode() {
        int result = code.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + levelNumber.hashCode();
        return result;
    }
}
