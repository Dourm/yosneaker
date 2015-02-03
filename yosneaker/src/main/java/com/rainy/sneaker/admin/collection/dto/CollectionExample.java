package com.rainy.sneaker.admin.collection.dto;

import java.util.ArrayList;
import java.util.List;

import com.rainy.common.tools.db.Page;

public class CollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public CollectionExample() {
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

        public Criteria andCollectionIdIsNull() {
            addCriterion("collection_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIsNotNull() {
            addCriterion("collection_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdEqualTo(Integer value) {
            addCriterion("collection_id =", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotEqualTo(Integer value) {
            addCriterion("collection_id <>", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThan(Integer value) {
            addCriterion("collection_id >", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection_id >=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThan(Integer value) {
            addCriterion("collection_id <", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("collection_id <=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIn(List<Integer> values) {
            addCriterion("collection_id in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotIn(List<Integer> values) {
            addCriterion("collection_id not in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdBetween(Integer value1, Integer value2) {
            addCriterion("collection_id between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("collection_id not between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleIdIsNull() {
            addCriterion("collection_article_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleIdIsNotNull() {
            addCriterion("collection_article_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleIdEqualTo(Integer value) {
            addCriterion("collection_article_id =", value, "collectionArticleId");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleIdNotEqualTo(Integer value) {
            addCriterion("collection_article_id <>", value, "collectionArticleId");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleIdGreaterThan(Integer value) {
            addCriterion("collection_article_id >", value, "collectionArticleId");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection_article_id >=", value, "collectionArticleId");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleIdLessThan(Integer value) {
            addCriterion("collection_article_id <", value, "collectionArticleId");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("collection_article_id <=", value, "collectionArticleId");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleIdIn(List<Integer> values) {
            addCriterion("collection_article_id in", values, "collectionArticleId");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleIdNotIn(List<Integer> values) {
            addCriterion("collection_article_id not in", values, "collectionArticleId");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("collection_article_id between", value1, value2, "collectionArticleId");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("collection_article_id not between", value1, value2, "collectionArticleId");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountIdIsNull() {
            addCriterion("collection_account_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountIdIsNotNull() {
            addCriterion("collection_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountIdEqualTo(Integer value) {
            addCriterion("collection_account_id =", value, "collectionAccountId");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountIdNotEqualTo(Integer value) {
            addCriterion("collection_account_id <>", value, "collectionAccountId");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountIdGreaterThan(Integer value) {
            addCriterion("collection_account_id >", value, "collectionAccountId");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection_account_id >=", value, "collectionAccountId");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountIdLessThan(Integer value) {
            addCriterion("collection_account_id <", value, "collectionAccountId");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("collection_account_id <=", value, "collectionAccountId");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountIdIn(List<Integer> values) {
            addCriterion("collection_account_id in", values, "collectionAccountId");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountIdNotIn(List<Integer> values) {
            addCriterion("collection_account_id not in", values, "collectionAccountId");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("collection_account_id between", value1, value2, "collectionAccountId");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("collection_account_id not between", value1, value2, "collectionAccountId");
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