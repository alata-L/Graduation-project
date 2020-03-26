package com.autolight.entity;

import java.util.ArrayList;
import java.util.List;

public class LightExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_light
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_light
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_light
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_light
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public LightExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_light
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_light
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_light
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_light
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_light
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_light
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_light
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_light
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_light
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_light
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_light
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andLight_idIsNull() {
            addCriterion("light_id is null");
            return (Criteria) this;
        }

        public Criteria andLight_idIsNotNull() {
            addCriterion("light_id is not null");
            return (Criteria) this;
        }

        public Criteria andLight_idEqualTo(Integer value) {
            addCriterion("light_id =", value, "light_id");
            return (Criteria) this;
        }

        public Criteria andLight_idNotEqualTo(Integer value) {
            addCriterion("light_id <>", value, "light_id");
            return (Criteria) this;
        }

        public Criteria andLight_idGreaterThan(Integer value) {
            addCriterion("light_id >", value, "light_id");
            return (Criteria) this;
        }

        public Criteria andLight_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("light_id >=", value, "light_id");
            return (Criteria) this;
        }

        public Criteria andLight_idLessThan(Integer value) {
            addCriterion("light_id <", value, "light_id");
            return (Criteria) this;
        }

        public Criteria andLight_idLessThanOrEqualTo(Integer value) {
            addCriterion("light_id <=", value, "light_id");
            return (Criteria) this;
        }

        public Criteria andLight_idIn(List<Integer> values) {
            addCriterion("light_id in", values, "light_id");
            return (Criteria) this;
        }

        public Criteria andLight_idNotIn(List<Integer> values) {
            addCriterion("light_id not in", values, "light_id");
            return (Criteria) this;
        }

        public Criteria andLight_idBetween(Integer value1, Integer value2) {
            addCriterion("light_id between", value1, value2, "light_id");
            return (Criteria) this;
        }

        public Criteria andLight_idNotBetween(Integer value1, Integer value2) {
            addCriterion("light_id not between", value1, value2, "light_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoom_idIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoom_idEqualTo(Integer value) {
            addCriterion("room_id =", value, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idNotEqualTo(Integer value) {
            addCriterion("room_id <>", value, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idGreaterThan(Integer value) {
            addCriterion("room_id >", value, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_id >=", value, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idLessThan(Integer value) {
            addCriterion("room_id <", value, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idLessThanOrEqualTo(Integer value) {
            addCriterion("room_id <=", value, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idIn(List<Integer> values) {
            addCriterion("room_id in", values, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idNotIn(List<Integer> values) {
            addCriterion("room_id not in", values, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idBetween(Integer value1, Integer value2) {
            addCriterion("room_id between", value1, value2, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idNotBetween(Integer value1, Integer value2) {
            addCriterion("room_id not between", value1, value2, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_nameIsNull() {
            addCriterion("room_name is null");
            return (Criteria) this;
        }

        public Criteria andRoom_nameIsNotNull() {
            addCriterion("room_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoom_nameEqualTo(String value) {
            addCriterion("room_name =", value, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameNotEqualTo(String value) {
            addCriterion("room_name <>", value, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameGreaterThan(String value) {
            addCriterion("room_name >", value, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameGreaterThanOrEqualTo(String value) {
            addCriterion("room_name >=", value, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameLessThan(String value) {
            addCriterion("room_name <", value, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameLessThanOrEqualTo(String value) {
            addCriterion("room_name <=", value, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameLike(String value) {
            addCriterion("room_name like", value, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameNotLike(String value) {
            addCriterion("room_name not like", value, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameIn(List<String> values) {
            addCriterion("room_name in", values, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameNotIn(List<String> values) {
            addCriterion("room_name not in", values, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameBetween(String value1, String value2) {
            addCriterion("room_name between", value1, value2, "room_name");
            return (Criteria) this;
        }

        public Criteria andRoom_nameNotBetween(String value1, String value2) {
            addCriterion("room_name not between", value1, value2, "room_name");
            return (Criteria) this;
        }

        public Criteria andLighttype_nameIsNull() {
            addCriterion("lighttype_name is null");
            return (Criteria) this;
        }

        public Criteria andLighttype_nameIsNotNull() {
            addCriterion("lighttype_name is not null");
            return (Criteria) this;
        }

        public Criteria andLighttype_nameEqualTo(String value) {
            addCriterion("lighttype_name =", value, "lighttype_name");
            return (Criteria) this;
        }

        public Criteria andLighttype_nameNotEqualTo(String value) {
            addCriterion("lighttype_name <>", value, "lighttype_name");
            return (Criteria) this;
        }

        public Criteria andLighttype_nameGreaterThan(String value) {
            addCriterion("lighttype_name >", value, "lighttype_name");
            return (Criteria) this;
        }

        public Criteria andLighttype_nameGreaterThanOrEqualTo(String value) {
            addCriterion("lighttype_name >=", value, "lighttype_name");
            return (Criteria) this;
        }

        public Criteria andLighttype_nameLessThan(String value) {
            addCriterion("lighttype_name <", value, "lighttype_name");
            return (Criteria) this;
        }

        public Criteria andLighttype_nameLessThanOrEqualTo(String value) {
            addCriterion("lighttype_name <=", value, "lighttype_name");
            return (Criteria) this;
        }

        public Criteria andLighttype_nameLike(String value) {
            addCriterion("lighttype_name like", value, "lighttype_name");
            return (Criteria) this;
        }

        public Criteria andLighttype_nameNotLike(String value) {
            addCriterion("lighttype_name not like", value, "lighttype_name");
            return (Criteria) this;
        }

        public Criteria andLighttype_nameIn(List<String> values) {
            addCriterion("lighttype_name in", values, "lighttype_name");
            return (Criteria) this;
        }

        public Criteria andLighttype_nameNotIn(List<String> values) {
            addCriterion("lighttype_name not in", values, "lighttype_name");
            return (Criteria) this;
        }

        public Criteria andLighttype_nameBetween(String value1, String value2) {
            addCriterion("lighttype_name between", value1, value2, "lighttype_name");
            return (Criteria) this;
        }

        public Criteria andLighttype_nameNotBetween(String value1, String value2) {
            addCriterion("lighttype_name not between", value1, value2, "lighttype_name");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_light
     *
     * @mbg.generated do_not_delete_during_merge Thu Mar 26 16:10:56 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_light
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}