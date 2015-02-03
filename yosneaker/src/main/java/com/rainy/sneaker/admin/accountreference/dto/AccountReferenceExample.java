package com.rainy.sneaker.admin.accountreference.dto;

import java.util.ArrayList;
import java.util.List;

import com.rainy.common.tools.db.Page;

public class AccountReferenceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public AccountReferenceExample() {
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

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
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

        public Criteria andAccountReferenceIdIsNull() {
            addCriterion("account_reference_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceIdIsNotNull() {
            addCriterion("account_reference_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceIdEqualTo(Integer value) {
            addCriterion("account_reference_id =", value, "accountReferenceId");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceIdNotEqualTo(Integer value) {
            addCriterion("account_reference_id <>", value, "accountReferenceId");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceIdGreaterThan(Integer value) {
            addCriterion("account_reference_id >", value, "accountReferenceId");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_reference_id >=", value, "accountReferenceId");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceIdLessThan(Integer value) {
            addCriterion("account_reference_id <", value, "accountReferenceId");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_reference_id <=", value, "accountReferenceId");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceIdIn(List<Integer> values) {
            addCriterion("account_reference_id in", values, "accountReferenceId");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceIdNotIn(List<Integer> values) {
            addCriterion("account_reference_id not in", values, "accountReferenceId");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceIdBetween(Integer value1, Integer value2) {
            addCriterion("account_reference_id between", value1, value2, "accountReferenceId");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_reference_id not between", value1, value2, "accountReferenceId");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceAccountIdIsNull() {
            addCriterion("account_reference_account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceAccountIdIsNotNull() {
            addCriterion("account_reference_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceAccountIdEqualTo(Integer value) {
            addCriterion("account_reference_account_id =", value, "accountReferenceAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceAccountIdNotEqualTo(Integer value) {
            addCriterion("account_reference_account_id <>", value, "accountReferenceAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceAccountIdGreaterThan(Integer value) {
            addCriterion("account_reference_account_id >", value, "accountReferenceAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_reference_account_id >=", value, "accountReferenceAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceAccountIdLessThan(Integer value) {
            addCriterion("account_reference_account_id <", value, "accountReferenceAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_reference_account_id <=", value, "accountReferenceAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceAccountIdIn(List<Integer> values) {
            addCriterion("account_reference_account_id in", values, "accountReferenceAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceAccountIdNotIn(List<Integer> values) {
            addCriterion("account_reference_account_id not in", values, "accountReferenceAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("account_reference_account_id between", value1, value2, "accountReferenceAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_reference_account_id not between", value1, value2, "accountReferenceAccountId");
            return (Criteria) this;
        }

        public Criteria andaccountReferenceFollowerIdIsNull() {
            addCriterion("account_reference_follower_id is null");
            return (Criteria) this;
        }

        public Criteria andaccountReferenceFollowerIdIsNotNull() {
            addCriterion("account_reference_follower_id is not null");
            return (Criteria) this;
        }

        public Criteria andaccountReferenceFollowerIdEqualTo(Integer value) {
            addCriterion("account_reference_follower_id =", value, "accountReferenceFollowerId");
            return (Criteria) this;
        }

        public Criteria andaccountReferenceFollowerIdNotEqualTo(Integer value) {
            addCriterion("account_reference_follower_id <>", value, "accountReferenceFollowerId");
            return (Criteria) this;
        }

        public Criteria andaccountReferenceFollowerIdGreaterThan(Integer value) {
            addCriterion("account_reference_follower_id >", value, "accountReferenceFollowerId");
            return (Criteria) this;
        }

        public Criteria andaccountReferenceFollowerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_reference_follower_id >=", value, "accountReferenceFollowerId");
            return (Criteria) this;
        }

        public Criteria andaccountReferenceFollowerIdLessThan(Integer value) {
            addCriterion("account_reference_follower_id <", value, "accountReferenceFollowerId");
            return (Criteria) this;
        }

        public Criteria andaccountReferenceFollowerIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_reference_follower_id <=", value, "accountReferenceFollowerId");
            return (Criteria) this;
        }

        public Criteria andaccountReferenceFollowerIdIn(List<Integer> values) {
            addCriterion("account_reference_follower_id in", values, "accountReferenceFollowerId");
            return (Criteria) this;
        }

        public Criteria andaccountReferenceFollowerIdNotIn(List<Integer> values) {
            addCriterion("account_reference_follower_id not in", values, "accountReferenceFollowerId");
            return (Criteria) this;
        }

        public Criteria andaccountReferenceFollowerIdBetween(Integer value1, Integer value2) {
            addCriterion("account_reference_follower_id between", value1, value2, "accountReferenceFollowerId");
            return (Criteria) this;
        }

        public Criteria andaccountReferenceFollowerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_reference_follower_id not between", value1, value2, "accountReferenceFollowerId");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceStatusIsNull() {
            addCriterion("account_reference_status is null");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceStatusIsNotNull() {
            addCriterion("account_reference_status is not null");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceStatusEqualTo(Integer value) {
            addCriterion("account_reference_status =", value, "accountReferenceStatus");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceStatusNotEqualTo(Integer value) {
            addCriterion("account_reference_status <>", value, "accountReferenceStatus");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceStatusGreaterThan(Integer value) {
            addCriterion("account_reference_status >", value, "accountReferenceStatus");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_reference_status >=", value, "accountReferenceStatus");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceStatusLessThan(Integer value) {
            addCriterion("account_reference_status <", value, "accountReferenceStatus");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceStatusLessThanOrEqualTo(Integer value) {
            addCriterion("account_reference_status <=", value, "accountReferenceStatus");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceStatusIn(List<Integer> values) {
            addCriterion("account_reference_status in", values, "accountReferenceStatus");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceStatusNotIn(List<Integer> values) {
            addCriterion("account_reference_status not in", values, "accountReferenceStatus");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceStatusBetween(Integer value1, Integer value2) {
            addCriterion("account_reference_status between", value1, value2, "accountReferenceStatus");
            return (Criteria) this;
        }

        public Criteria andAccountReferenceStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("account_reference_status not between", value1, value2, "accountReferenceStatus");
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