package com.hjrz.user.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplyColumnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplyColumnExample() {
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

        public Criteria andSupplyCodeIsNull() {
            addCriterion("supplyCode is null");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeIsNotNull() {
            addCriterion("supplyCode is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeEqualTo(Integer value) {
            addCriterion("supplyCode =", value, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeNotEqualTo(Integer value) {
            addCriterion("supplyCode <>", value, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeGreaterThan(Integer value) {
            addCriterion("supplyCode >", value, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplyCode >=", value, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeLessThan(Integer value) {
            addCriterion("supplyCode <", value, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeLessThanOrEqualTo(Integer value) {
            addCriterion("supplyCode <=", value, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeIn(List<Integer> values) {
            addCriterion("supplyCode in", values, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeNotIn(List<Integer> values) {
            addCriterion("supplyCode not in", values, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeBetween(Integer value1, Integer value2) {
            addCriterion("supplyCode between", value1, value2, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("supplyCode not between", value1, value2, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyHeadIsNull() {
            addCriterion("supplyHead is null");
            return (Criteria) this;
        }

        public Criteria andSupplyHeadIsNotNull() {
            addCriterion("supplyHead is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyHeadEqualTo(String value) {
            addCriterion("supplyHead =", value, "supplyHead");
            return (Criteria) this;
        }

        public Criteria andSupplyHeadNotEqualTo(String value) {
            addCriterion("supplyHead <>", value, "supplyHead");
            return (Criteria) this;
        }

        public Criteria andSupplyHeadGreaterThan(String value) {
            addCriterion("supplyHead >", value, "supplyHead");
            return (Criteria) this;
        }

        public Criteria andSupplyHeadGreaterThanOrEqualTo(String value) {
            addCriterion("supplyHead >=", value, "supplyHead");
            return (Criteria) this;
        }

        public Criteria andSupplyHeadLessThan(String value) {
            addCriterion("supplyHead <", value, "supplyHead");
            return (Criteria) this;
        }

        public Criteria andSupplyHeadLessThanOrEqualTo(String value) {
            addCriterion("supplyHead <=", value, "supplyHead");
            return (Criteria) this;
        }

        public Criteria andSupplyHeadLike(String value) {
            addCriterion("supplyHead like", value, "supplyHead");
            return (Criteria) this;
        }

        public Criteria andSupplyHeadNotLike(String value) {
            addCriterion("supplyHead not like", value, "supplyHead");
            return (Criteria) this;
        }

        public Criteria andSupplyHeadIn(List<String> values) {
            addCriterion("supplyHead in", values, "supplyHead");
            return (Criteria) this;
        }

        public Criteria andSupplyHeadNotIn(List<String> values) {
            addCriterion("supplyHead not in", values, "supplyHead");
            return (Criteria) this;
        }

        public Criteria andSupplyHeadBetween(String value1, String value2) {
            addCriterion("supplyHead between", value1, value2, "supplyHead");
            return (Criteria) this;
        }

        public Criteria andSupplyHeadNotBetween(String value1, String value2) {
            addCriterion("supplyHead not between", value1, value2, "supplyHead");
            return (Criteria) this;
        }

        public Criteria andSupplyBrandIsNull() {
            addCriterion("supplyBrand is null");
            return (Criteria) this;
        }

        public Criteria andSupplyBrandIsNotNull() {
            addCriterion("supplyBrand is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyBrandEqualTo(String value) {
            addCriterion("supplyBrand =", value, "supplyBrand");
            return (Criteria) this;
        }

        public Criteria andSupplyBrandNotEqualTo(String value) {
            addCriterion("supplyBrand <>", value, "supplyBrand");
            return (Criteria) this;
        }

        public Criteria andSupplyBrandGreaterThan(String value) {
            addCriterion("supplyBrand >", value, "supplyBrand");
            return (Criteria) this;
        }

        public Criteria andSupplyBrandGreaterThanOrEqualTo(String value) {
            addCriterion("supplyBrand >=", value, "supplyBrand");
            return (Criteria) this;
        }

        public Criteria andSupplyBrandLessThan(String value) {
            addCriterion("supplyBrand <", value, "supplyBrand");
            return (Criteria) this;
        }

        public Criteria andSupplyBrandLessThanOrEqualTo(String value) {
            addCriterion("supplyBrand <=", value, "supplyBrand");
            return (Criteria) this;
        }

        public Criteria andSupplyBrandLike(String value) {
            addCriterion("supplyBrand like", value, "supplyBrand");
            return (Criteria) this;
        }

        public Criteria andSupplyBrandNotLike(String value) {
            addCriterion("supplyBrand not like", value, "supplyBrand");
            return (Criteria) this;
        }

        public Criteria andSupplyBrandIn(List<String> values) {
            addCriterion("supplyBrand in", values, "supplyBrand");
            return (Criteria) this;
        }

        public Criteria andSupplyBrandNotIn(List<String> values) {
            addCriterion("supplyBrand not in", values, "supplyBrand");
            return (Criteria) this;
        }

        public Criteria andSupplyBrandBetween(String value1, String value2) {
            addCriterion("supplyBrand between", value1, value2, "supplyBrand");
            return (Criteria) this;
        }

        public Criteria andSupplyBrandNotBetween(String value1, String value2) {
            addCriterion("supplyBrand not between", value1, value2, "supplyBrand");
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

        public Criteria andSupplyAliveStateIsNull() {
            addCriterion("supplyAliveState is null");
            return (Criteria) this;
        }

        public Criteria andSupplyAliveStateIsNotNull() {
            addCriterion("supplyAliveState is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyAliveStateEqualTo(String value) {
            addCriterion("supplyAliveState =", value, "supplyAliveState");
            return (Criteria) this;
        }

        public Criteria andSupplyAliveStateNotEqualTo(String value) {
            addCriterion("supplyAliveState <>", value, "supplyAliveState");
            return (Criteria) this;
        }

        public Criteria andSupplyAliveStateGreaterThan(String value) {
            addCriterion("supplyAliveState >", value, "supplyAliveState");
            return (Criteria) this;
        }

        public Criteria andSupplyAliveStateGreaterThanOrEqualTo(String value) {
            addCriterion("supplyAliveState >=", value, "supplyAliveState");
            return (Criteria) this;
        }

        public Criteria andSupplyAliveStateLessThan(String value) {
            addCriterion("supplyAliveState <", value, "supplyAliveState");
            return (Criteria) this;
        }

        public Criteria andSupplyAliveStateLessThanOrEqualTo(String value) {
            addCriterion("supplyAliveState <=", value, "supplyAliveState");
            return (Criteria) this;
        }

        public Criteria andSupplyAliveStateLike(String value) {
            addCriterion("supplyAliveState like", value, "supplyAliveState");
            return (Criteria) this;
        }

        public Criteria andSupplyAliveStateNotLike(String value) {
            addCriterion("supplyAliveState not like", value, "supplyAliveState");
            return (Criteria) this;
        }

        public Criteria andSupplyAliveStateIn(List<String> values) {
            addCriterion("supplyAliveState in", values, "supplyAliveState");
            return (Criteria) this;
        }

        public Criteria andSupplyAliveStateNotIn(List<String> values) {
            addCriterion("supplyAliveState not in", values, "supplyAliveState");
            return (Criteria) this;
        }

        public Criteria andSupplyAliveStateBetween(String value1, String value2) {
            addCriterion("supplyAliveState between", value1, value2, "supplyAliveState");
            return (Criteria) this;
        }

        public Criteria andSupplyAliveStateNotBetween(String value1, String value2) {
            addCriterion("supplyAliveState not between", value1, value2, "supplyAliveState");
            return (Criteria) this;
        }

        public Criteria andCreate_adminIsNull() {
            addCriterion("create_admin is null");
            return (Criteria) this;
        }

        public Criteria andCreate_adminIsNotNull() {
            addCriterion("create_admin is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_adminEqualTo(String value) {
            addCriterion("create_admin =", value, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminNotEqualTo(String value) {
            addCriterion("create_admin <>", value, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminGreaterThan(String value) {
            addCriterion("create_admin >", value, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminGreaterThanOrEqualTo(String value) {
            addCriterion("create_admin >=", value, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminLessThan(String value) {
            addCriterion("create_admin <", value, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminLessThanOrEqualTo(String value) {
            addCriterion("create_admin <=", value, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminLike(String value) {
            addCriterion("create_admin like", value, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminNotLike(String value) {
            addCriterion("create_admin not like", value, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminIn(List<String> values) {
            addCriterion("create_admin in", values, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminNotIn(List<String> values) {
            addCriterion("create_admin not in", values, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminBetween(String value1, String value2) {
            addCriterion("create_admin between", value1, value2, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminNotBetween(String value1, String value2) {
            addCriterion("create_admin not between", value1, value2, "create_admin");
            return (Criteria) this;
        }

        public Criteria andSupplyurlIsNull() {
            addCriterion("supplyurl is null");
            return (Criteria) this;
        }

        public Criteria andSupplyurlIsNotNull() {
            addCriterion("supplyurl is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyurlEqualTo(String value) {
            addCriterion("supplyurl =", value, "supplyurl");
            return (Criteria) this;
        }

        public Criteria andSupplyurlNotEqualTo(String value) {
            addCriterion("supplyurl <>", value, "supplyurl");
            return (Criteria) this;
        }

        public Criteria andSupplyurlGreaterThan(String value) {
            addCriterion("supplyurl >", value, "supplyurl");
            return (Criteria) this;
        }

        public Criteria andSupplyurlGreaterThanOrEqualTo(String value) {
            addCriterion("supplyurl >=", value, "supplyurl");
            return (Criteria) this;
        }

        public Criteria andSupplyurlLessThan(String value) {
            addCriterion("supplyurl <", value, "supplyurl");
            return (Criteria) this;
        }

        public Criteria andSupplyurlLessThanOrEqualTo(String value) {
            addCriterion("supplyurl <=", value, "supplyurl");
            return (Criteria) this;
        }

        public Criteria andSupplyurlLike(String value) {
            addCriterion("supplyurl like", value, "supplyurl");
            return (Criteria) this;
        }

        public Criteria andSupplyurlNotLike(String value) {
            addCriterion("supplyurl not like", value, "supplyurl");
            return (Criteria) this;
        }

        public Criteria andSupplyurlIn(List<String> values) {
            addCriterion("supplyurl in", values, "supplyurl");
            return (Criteria) this;
        }

        public Criteria andSupplyurlNotIn(List<String> values) {
            addCriterion("supplyurl not in", values, "supplyurl");
            return (Criteria) this;
        }

        public Criteria andSupplyurlBetween(String value1, String value2) {
            addCriterion("supplyurl between", value1, value2, "supplyurl");
            return (Criteria) this;
        }

        public Criteria andSupplyurlNotBetween(String value1, String value2) {
            addCriterion("supplyurl not between", value1, value2, "supplyurl");
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