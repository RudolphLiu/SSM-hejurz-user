package com.hjrz.user.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Email_contact_meExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Email_contact_meExample() {
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

        public Criteria andLinkCodeIsNull() {
            addCriterion("linkCode is null");
            return (Criteria) this;
        }

        public Criteria andLinkCodeIsNotNull() {
            addCriterion("linkCode is not null");
            return (Criteria) this;
        }

        public Criteria andLinkCodeEqualTo(Integer value) {
            addCriterion("linkCode =", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeNotEqualTo(Integer value) {
            addCriterion("linkCode <>", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeGreaterThan(Integer value) {
            addCriterion("linkCode >", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("linkCode >=", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeLessThan(Integer value) {
            addCriterion("linkCode <", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeLessThanOrEqualTo(Integer value) {
            addCriterion("linkCode <=", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeIn(List<Integer> values) {
            addCriterion("linkCode in", values, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeNotIn(List<Integer> values) {
            addCriterion("linkCode not in", values, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeBetween(Integer value1, Integer value2) {
            addCriterion("linkCode between", value1, value2, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("linkCode not between", value1, value2, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLink_user_nameIsNull() {
            addCriterion("link_user_name is null");
            return (Criteria) this;
        }

        public Criteria andLink_user_nameIsNotNull() {
            addCriterion("link_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andLink_user_nameEqualTo(String value) {
            addCriterion("link_user_name =", value, "link_user_name");
            return (Criteria) this;
        }

        public Criteria andLink_user_nameNotEqualTo(String value) {
            addCriterion("link_user_name <>", value, "link_user_name");
            return (Criteria) this;
        }

        public Criteria andLink_user_nameGreaterThan(String value) {
            addCriterion("link_user_name >", value, "link_user_name");
            return (Criteria) this;
        }

        public Criteria andLink_user_nameGreaterThanOrEqualTo(String value) {
            addCriterion("link_user_name >=", value, "link_user_name");
            return (Criteria) this;
        }

        public Criteria andLink_user_nameLessThan(String value) {
            addCriterion("link_user_name <", value, "link_user_name");
            return (Criteria) this;
        }

        public Criteria andLink_user_nameLessThanOrEqualTo(String value) {
            addCriterion("link_user_name <=", value, "link_user_name");
            return (Criteria) this;
        }

        public Criteria andLink_user_nameLike(String value) {
            addCriterion("link_user_name like", value, "link_user_name");
            return (Criteria) this;
        }

        public Criteria andLink_user_nameNotLike(String value) {
            addCriterion("link_user_name not like", value, "link_user_name");
            return (Criteria) this;
        }

        public Criteria andLink_user_nameIn(List<String> values) {
            addCriterion("link_user_name in", values, "link_user_name");
            return (Criteria) this;
        }

        public Criteria andLink_user_nameNotIn(List<String> values) {
            addCriterion("link_user_name not in", values, "link_user_name");
            return (Criteria) this;
        }

        public Criteria andLink_user_nameBetween(String value1, String value2) {
            addCriterion("link_user_name between", value1, value2, "link_user_name");
            return (Criteria) this;
        }

        public Criteria andLink_user_nameNotBetween(String value1, String value2) {
            addCriterion("link_user_name not between", value1, value2, "link_user_name");
            return (Criteria) this;
        }

        public Criteria andLink_user_emailIsNull() {
            addCriterion("link_user_email is null");
            return (Criteria) this;
        }

        public Criteria andLink_user_emailIsNotNull() {
            addCriterion("link_user_email is not null");
            return (Criteria) this;
        }

        public Criteria andLink_user_emailEqualTo(String value) {
            addCriterion("link_user_email =", value, "link_user_email");
            return (Criteria) this;
        }

        public Criteria andLink_user_emailNotEqualTo(String value) {
            addCriterion("link_user_email <>", value, "link_user_email");
            return (Criteria) this;
        }

        public Criteria andLink_user_emailGreaterThan(String value) {
            addCriterion("link_user_email >", value, "link_user_email");
            return (Criteria) this;
        }

        public Criteria andLink_user_emailGreaterThanOrEqualTo(String value) {
            addCriterion("link_user_email >=", value, "link_user_email");
            return (Criteria) this;
        }

        public Criteria andLink_user_emailLessThan(String value) {
            addCriterion("link_user_email <", value, "link_user_email");
            return (Criteria) this;
        }

        public Criteria andLink_user_emailLessThanOrEqualTo(String value) {
            addCriterion("link_user_email <=", value, "link_user_email");
            return (Criteria) this;
        }

        public Criteria andLink_user_emailLike(String value) {
            addCriterion("link_user_email like", value, "link_user_email");
            return (Criteria) this;
        }

        public Criteria andLink_user_emailNotLike(String value) {
            addCriterion("link_user_email not like", value, "link_user_email");
            return (Criteria) this;
        }

        public Criteria andLink_user_emailIn(List<String> values) {
            addCriterion("link_user_email in", values, "link_user_email");
            return (Criteria) this;
        }

        public Criteria andLink_user_emailNotIn(List<String> values) {
            addCriterion("link_user_email not in", values, "link_user_email");
            return (Criteria) this;
        }

        public Criteria andLink_user_emailBetween(String value1, String value2) {
            addCriterion("link_user_email between", value1, value2, "link_user_email");
            return (Criteria) this;
        }

        public Criteria andLink_user_emailNotBetween(String value1, String value2) {
            addCriterion("link_user_email not between", value1, value2, "link_user_email");
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

        public Criteria andLink_handle_stateIsNull() {
            addCriterion("link_handle_state is null");
            return (Criteria) this;
        }

        public Criteria andLink_handle_stateIsNotNull() {
            addCriterion("link_handle_state is not null");
            return (Criteria) this;
        }

        public Criteria andLink_handle_stateEqualTo(String value) {
            addCriterion("link_handle_state =", value, "link_handle_state");
            return (Criteria) this;
        }

        public Criteria andLink_handle_stateNotEqualTo(String value) {
            addCriterion("link_handle_state <>", value, "link_handle_state");
            return (Criteria) this;
        }

        public Criteria andLink_handle_stateGreaterThan(String value) {
            addCriterion("link_handle_state >", value, "link_handle_state");
            return (Criteria) this;
        }

        public Criteria andLink_handle_stateGreaterThanOrEqualTo(String value) {
            addCriterion("link_handle_state >=", value, "link_handle_state");
            return (Criteria) this;
        }

        public Criteria andLink_handle_stateLessThan(String value) {
            addCriterion("link_handle_state <", value, "link_handle_state");
            return (Criteria) this;
        }

        public Criteria andLink_handle_stateLessThanOrEqualTo(String value) {
            addCriterion("link_handle_state <=", value, "link_handle_state");
            return (Criteria) this;
        }

        public Criteria andLink_handle_stateLike(String value) {
            addCriterion("link_handle_state like", value, "link_handle_state");
            return (Criteria) this;
        }

        public Criteria andLink_handle_stateNotLike(String value) {
            addCriterion("link_handle_state not like", value, "link_handle_state");
            return (Criteria) this;
        }

        public Criteria andLink_handle_stateIn(List<String> values) {
            addCriterion("link_handle_state in", values, "link_handle_state");
            return (Criteria) this;
        }

        public Criteria andLink_handle_stateNotIn(List<String> values) {
            addCriterion("link_handle_state not in", values, "link_handle_state");
            return (Criteria) this;
        }

        public Criteria andLink_handle_stateBetween(String value1, String value2) {
            addCriterion("link_handle_state between", value1, value2, "link_handle_state");
            return (Criteria) this;
        }

        public Criteria andLink_handle_stateNotBetween(String value1, String value2) {
            addCriterion("link_handle_state not between", value1, value2, "link_handle_state");
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