package com.hjrz.user.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User_basic_infoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public User_basic_infoExample() {
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

        public Criteria andUser_login_phoneIsNull() {
            addCriterion("user_login_phone is null");
            return (Criteria) this;
        }

        public Criteria andUser_login_phoneIsNotNull() {
            addCriterion("user_login_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUser_login_phoneEqualTo(String value) {
            addCriterion("user_login_phone =", value, "user_login_phone");
            return (Criteria) this;
        }

        public Criteria andUser_login_phoneNotEqualTo(String value) {
            addCriterion("user_login_phone <>", value, "user_login_phone");
            return (Criteria) this;
        }

        public Criteria andUser_login_phoneGreaterThan(String value) {
            addCriterion("user_login_phone >", value, "user_login_phone");
            return (Criteria) this;
        }

        public Criteria andUser_login_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_phone >=", value, "user_login_phone");
            return (Criteria) this;
        }

        public Criteria andUser_login_phoneLessThan(String value) {
            addCriterion("user_login_phone <", value, "user_login_phone");
            return (Criteria) this;
        }

        public Criteria andUser_login_phoneLessThanOrEqualTo(String value) {
            addCriterion("user_login_phone <=", value, "user_login_phone");
            return (Criteria) this;
        }

        public Criteria andUser_login_phoneLike(String value) {
            addCriterion("user_login_phone like", value, "user_login_phone");
            return (Criteria) this;
        }

        public Criteria andUser_login_phoneNotLike(String value) {
            addCriterion("user_login_phone not like", value, "user_login_phone");
            return (Criteria) this;
        }

        public Criteria andUser_login_phoneIn(List<String> values) {
            addCriterion("user_login_phone in", values, "user_login_phone");
            return (Criteria) this;
        }

        public Criteria andUser_login_phoneNotIn(List<String> values) {
            addCriterion("user_login_phone not in", values, "user_login_phone");
            return (Criteria) this;
        }

        public Criteria andUser_login_phoneBetween(String value1, String value2) {
            addCriterion("user_login_phone between", value1, value2, "user_login_phone");
            return (Criteria) this;
        }

        public Criteria andUser_login_phoneNotBetween(String value1, String value2) {
            addCriterion("user_login_phone not between", value1, value2, "user_login_phone");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUser_passwordEqualTo(String value) {
            addCriterion("user_password =", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordGreaterThan(String value) {
            addCriterion("user_password >", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLessThan(String value) {
            addCriterion("user_password <", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLike(String value) {
            addCriterion("user_password like", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotLike(String value) {
            addCriterion("user_password not like", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIn(List<String> values) {
            addCriterion("user_password in", values, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_info_stateIsNull() {
            addCriterion("user_info_state is null");
            return (Criteria) this;
        }

        public Criteria andUser_info_stateIsNotNull() {
            addCriterion("user_info_state is not null");
            return (Criteria) this;
        }

        public Criteria andUser_info_stateEqualTo(String value) {
            addCriterion("user_info_state =", value, "user_info_state");
            return (Criteria) this;
        }

        public Criteria andUser_info_stateNotEqualTo(String value) {
            addCriterion("user_info_state <>", value, "user_info_state");
            return (Criteria) this;
        }

        public Criteria andUser_info_stateGreaterThan(String value) {
            addCriterion("user_info_state >", value, "user_info_state");
            return (Criteria) this;
        }

        public Criteria andUser_info_stateGreaterThanOrEqualTo(String value) {
            addCriterion("user_info_state >=", value, "user_info_state");
            return (Criteria) this;
        }

        public Criteria andUser_info_stateLessThan(String value) {
            addCriterion("user_info_state <", value, "user_info_state");
            return (Criteria) this;
        }

        public Criteria andUser_info_stateLessThanOrEqualTo(String value) {
            addCriterion("user_info_state <=", value, "user_info_state");
            return (Criteria) this;
        }

        public Criteria andUser_info_stateLike(String value) {
            addCriterion("user_info_state like", value, "user_info_state");
            return (Criteria) this;
        }

        public Criteria andUser_info_stateNotLike(String value) {
            addCriterion("user_info_state not like", value, "user_info_state");
            return (Criteria) this;
        }

        public Criteria andUser_info_stateIn(List<String> values) {
            addCriterion("user_info_state in", values, "user_info_state");
            return (Criteria) this;
        }

        public Criteria andUser_info_stateNotIn(List<String> values) {
            addCriterion("user_info_state not in", values, "user_info_state");
            return (Criteria) this;
        }

        public Criteria andUser_info_stateBetween(String value1, String value2) {
            addCriterion("user_info_state between", value1, value2, "user_info_state");
            return (Criteria) this;
        }

        public Criteria andUser_info_stateNotBetween(String value1, String value2) {
            addCriterion("user_info_state not between", value1, value2, "user_info_state");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeLessThan(Date value) {
            addCriterion("last_login_time <", value, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "last_login_time");
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