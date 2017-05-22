package com.hjrz.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User_detail_infoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public User_detail_infoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andUser_detail_CodeIsNull() {
            addCriterion("user_detail_Code is null");
            return (Criteria) this;
        }

        public Criteria andUser_detail_CodeIsNotNull() {
            addCriterion("user_detail_Code is not null");
            return (Criteria) this;
        }

        public Criteria andUser_detail_CodeEqualTo(Integer value) {
            addCriterion("user_detail_Code =", value, "user_detail_Code");
            return (Criteria) this;
        }

        public Criteria andUser_detail_CodeNotEqualTo(Integer value) {
            addCriterion("user_detail_Code <>", value, "user_detail_Code");
            return (Criteria) this;
        }

        public Criteria andUser_detail_CodeGreaterThan(Integer value) {
            addCriterion("user_detail_Code >", value, "user_detail_Code");
            return (Criteria) this;
        }

        public Criteria andUser_detail_CodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_detail_Code >=", value, "user_detail_Code");
            return (Criteria) this;
        }

        public Criteria andUser_detail_CodeLessThan(Integer value) {
            addCriterion("user_detail_Code <", value, "user_detail_Code");
            return (Criteria) this;
        }

        public Criteria andUser_detail_CodeLessThanOrEqualTo(Integer value) {
            addCriterion("user_detail_Code <=", value, "user_detail_Code");
            return (Criteria) this;
        }

        public Criteria andUser_detail_CodeIn(List<Integer> values) {
            addCriterion("user_detail_Code in", values, "user_detail_Code");
            return (Criteria) this;
        }

        public Criteria andUser_detail_CodeNotIn(List<Integer> values) {
            addCriterion("user_detail_Code not in", values, "user_detail_Code");
            return (Criteria) this;
        }

        public Criteria andUser_detail_CodeBetween(Integer value1, Integer value2) {
            addCriterion("user_detail_Code between", value1, value2, "user_detail_Code");
            return (Criteria) this;
        }

        public Criteria andUser_detail_CodeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_detail_Code not between", value1, value2, "user_detail_Code");
            return (Criteria) this;
        }

        public Criteria andUser_basic_CodeIsNull() {
            addCriterion("user_basic_Code is null");
            return (Criteria) this;
        }

        public Criteria andUser_basic_CodeIsNotNull() {
            addCriterion("user_basic_Code is not null");
            return (Criteria) this;
        }

        public Criteria andUser_basic_CodeEqualTo(Integer value) {
            addCriterion("user_basic_Code =", value, "user_basic_Code");
            return (Criteria) this;
        }

        public Criteria andUser_basic_CodeNotEqualTo(Integer value) {
            addCriterion("user_basic_Code <>", value, "user_basic_Code");
            return (Criteria) this;
        }

        public Criteria andUser_basic_CodeGreaterThan(Integer value) {
            addCriterion("user_basic_Code >", value, "user_basic_Code");
            return (Criteria) this;
        }

        public Criteria andUser_basic_CodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_basic_Code >=", value, "user_basic_Code");
            return (Criteria) this;
        }

        public Criteria andUser_basic_CodeLessThan(Integer value) {
            addCriterion("user_basic_Code <", value, "user_basic_Code");
            return (Criteria) this;
        }

        public Criteria andUser_basic_CodeLessThanOrEqualTo(Integer value) {
            addCriterion("user_basic_Code <=", value, "user_basic_Code");
            return (Criteria) this;
        }

        public Criteria andUser_basic_CodeIn(List<Integer> values) {
            addCriterion("user_basic_Code in", values, "user_basic_Code");
            return (Criteria) this;
        }

        public Criteria andUser_basic_CodeNotIn(List<Integer> values) {
            addCriterion("user_basic_Code not in", values, "user_basic_Code");
            return (Criteria) this;
        }

        public Criteria andUser_basic_CodeBetween(Integer value1, Integer value2) {
            addCriterion("user_basic_Code between", value1, value2, "user_basic_Code");
            return (Criteria) this;
        }

        public Criteria andUser_basic_CodeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_basic_Code not between", value1, value2, "user_basic_Code");
            return (Criteria) this;
        }

        public Criteria andUser_emailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUser_emailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUser_emailEqualTo(String value) {
            addCriterion("user_email =", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailGreaterThan(String value) {
            addCriterion("user_email >", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailLessThan(String value) {
            addCriterion("user_email <", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailLike(String value) {
            addCriterion("user_email like", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailNotLike(String value) {
            addCriterion("user_email not like", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailIn(List<String> values) {
            addCriterion("user_email in", values, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_realnameIsNull() {
            addCriterion("user_realname is null");
            return (Criteria) this;
        }

        public Criteria andUser_realnameIsNotNull() {
            addCriterion("user_realname is not null");
            return (Criteria) this;
        }

        public Criteria andUser_realnameEqualTo(String value) {
            addCriterion("user_realname =", value, "user_realname");
            return (Criteria) this;
        }

        public Criteria andUser_realnameNotEqualTo(String value) {
            addCriterion("user_realname <>", value, "user_realname");
            return (Criteria) this;
        }

        public Criteria andUser_realnameGreaterThan(String value) {
            addCriterion("user_realname >", value, "user_realname");
            return (Criteria) this;
        }

        public Criteria andUser_realnameGreaterThanOrEqualTo(String value) {
            addCriterion("user_realname >=", value, "user_realname");
            return (Criteria) this;
        }

        public Criteria andUser_realnameLessThan(String value) {
            addCriterion("user_realname <", value, "user_realname");
            return (Criteria) this;
        }

        public Criteria andUser_realnameLessThanOrEqualTo(String value) {
            addCriterion("user_realname <=", value, "user_realname");
            return (Criteria) this;
        }

        public Criteria andUser_realnameLike(String value) {
            addCriterion("user_realname like", value, "user_realname");
            return (Criteria) this;
        }

        public Criteria andUser_realnameNotLike(String value) {
            addCriterion("user_realname not like", value, "user_realname");
            return (Criteria) this;
        }

        public Criteria andUser_realnameIn(List<String> values) {
            addCriterion("user_realname in", values, "user_realname");
            return (Criteria) this;
        }

        public Criteria andUser_realnameNotIn(List<String> values) {
            addCriterion("user_realname not in", values, "user_realname");
            return (Criteria) this;
        }

        public Criteria andUser_realnameBetween(String value1, String value2) {
            addCriterion("user_realname between", value1, value2, "user_realname");
            return (Criteria) this;
        }

        public Criteria andUser_realnameNotBetween(String value1, String value2) {
            addCriterion("user_realname not between", value1, value2, "user_realname");
            return (Criteria) this;
        }

        public Criteria andUser_sexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUser_sexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUser_sexEqualTo(String value) {
            addCriterion("user_sex =", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexGreaterThan(String value) {
            addCriterion("user_sex >", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexLessThan(String value) {
            addCriterion("user_sex <", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexLike(String value) {
            addCriterion("user_sex like", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexNotLike(String value) {
            addCriterion("user_sex not like", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexIn(List<String> values) {
            addCriterion("user_sex in", values, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_addressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUser_addressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUser_addressEqualTo(String value) {
            addCriterion("user_address =", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressGreaterThan(String value) {
            addCriterion("user_address >", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressLessThan(String value) {
            addCriterion("user_address <", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressLike(String value) {
            addCriterion("user_address like", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressNotLike(String value) {
            addCriterion("user_address not like", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressIn(List<String> values) {
            addCriterion("user_address in", values, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "user_address");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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