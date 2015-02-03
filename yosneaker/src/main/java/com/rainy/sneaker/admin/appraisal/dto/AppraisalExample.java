package com.rainy.sneaker.admin.appraisal.dto;

import java.util.ArrayList;
import java.util.List;

import com.rainy.common.tools.db.Page;

public class AppraisalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public AppraisalExample() {
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

        public Criteria andAppraisalIdIsNull() {
            addCriterion("appraisal_id is null");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdIsNotNull() {
            addCriterion("appraisal_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdEqualTo(Integer value) {
            addCriterion("appraisal_id =", value, "appraisalId");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdNotEqualTo(Integer value) {
            addCriterion("appraisal_id <>", value, "appraisalId");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdGreaterThan(Integer value) {
            addCriterion("appraisal_id >", value, "appraisalId");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("appraisal_id >=", value, "appraisalId");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdLessThan(Integer value) {
            addCriterion("appraisal_id <", value, "appraisalId");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdLessThanOrEqualTo(Integer value) {
            addCriterion("appraisal_id <=", value, "appraisalId");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdIn(List<Integer> values) {
            addCriterion("appraisal_id in", values, "appraisalId");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdNotIn(List<Integer> values) {
            addCriterion("appraisal_id not in", values, "appraisalId");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdBetween(Integer value1, Integer value2) {
            addCriterion("appraisal_id between", value1, value2, "appraisalId");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("appraisal_id not between", value1, value2, "appraisalId");
            return (Criteria) this;
        }

        public Criteria andAppraisalTitleIsNull() {
            addCriterion("appraisal_title is null");
            return (Criteria) this;
        }

        public Criteria andAppraisalTitleIsNotNull() {
            addCriterion("appraisal_title is not null");
            return (Criteria) this;
        }

        public Criteria andAppraisalTitleEqualTo(String value) {
            addCriterion("appraisal_title =", value, "appraisalTitle");
            return (Criteria) this;
        }

        public Criteria andAppraisalTitleNotEqualTo(String value) {
            addCriterion("appraisal_title <>", value, "appraisalTitle");
            return (Criteria) this;
        }

        public Criteria andAppraisalTitleGreaterThan(String value) {
            addCriterion("appraisal_title >", value, "appraisalTitle");
            return (Criteria) this;
        }

        public Criteria andAppraisalTitleGreaterThanOrEqualTo(String value) {
            addCriterion("appraisal_title >=", value, "appraisalTitle");
            return (Criteria) this;
        }

        public Criteria andAppraisalTitleLessThan(String value) {
            addCriterion("appraisal_title <", value, "appraisalTitle");
            return (Criteria) this;
        }

        public Criteria andAppraisalTitleLessThanOrEqualTo(String value) {
            addCriterion("appraisal_title <=", value, "appraisalTitle");
            return (Criteria) this;
        }

        public Criteria andAppraisalTitleLike(String value) {
            addCriterion("appraisal_title like", value, "appraisalTitle");
            return (Criteria) this;
        }

        public Criteria andAppraisalTitleNotLike(String value) {
            addCriterion("appraisal_title not like", value, "appraisalTitle");
            return (Criteria) this;
        }

        public Criteria andAppraisalTitleIn(List<String> values) {
            addCriterion("appraisal_title in", values, "appraisalTitle");
            return (Criteria) this;
        }

        public Criteria andAppraisalTitleNotIn(List<String> values) {
            addCriterion("appraisal_title not in", values, "appraisalTitle");
            return (Criteria) this;
        }

        public Criteria andAppraisalTitleBetween(String value1, String value2) {
            addCriterion("appraisal_title between", value1, value2, "appraisalTitle");
            return (Criteria) this;
        }

        public Criteria andAppraisalTitleNotBetween(String value1, String value2) {
            addCriterion("appraisal_title not between", value1, value2, "appraisalTitle");
            return (Criteria) this;
        }

        public Criteria andAppraisalDescriptionIsNull() {
            addCriterion("appraisal_description is null");
            return (Criteria) this;
        }

        public Criteria andAppraisalDescriptionIsNotNull() {
            addCriterion("appraisal_description is not null");
            return (Criteria) this;
        }

        public Criteria andAppraisalDescriptionEqualTo(String value) {
            addCriterion("appraisal_description =", value, "appraisalDescription");
            return (Criteria) this;
        }

        public Criteria andAppraisalDescriptionNotEqualTo(String value) {
            addCriterion("appraisal_description <>", value, "appraisalDescription");
            return (Criteria) this;
        }

        public Criteria andAppraisalDescriptionGreaterThan(String value) {
            addCriterion("appraisal_description >", value, "appraisalDescription");
            return (Criteria) this;
        }

        public Criteria andAppraisalDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("appraisal_description >=", value, "appraisalDescription");
            return (Criteria) this;
        }

        public Criteria andAppraisalDescriptionLessThan(String value) {
            addCriterion("appraisal_description <", value, "appraisalDescription");
            return (Criteria) this;
        }

        public Criteria andAppraisalDescriptionLessThanOrEqualTo(String value) {
            addCriterion("appraisal_description <=", value, "appraisalDescription");
            return (Criteria) this;
        }

        public Criteria andAppraisalDescriptionLike(String value) {
            addCriterion("appraisal_description like", value, "appraisalDescription");
            return (Criteria) this;
        }

        public Criteria andAppraisalDescriptionNotLike(String value) {
            addCriterion("appraisal_description not like", value, "appraisalDescription");
            return (Criteria) this;
        }

        public Criteria andAppraisalDescriptionIn(List<String> values) {
            addCriterion("appraisal_description in", values, "appraisalDescription");
            return (Criteria) this;
        }

        public Criteria andAppraisalDescriptionNotIn(List<String> values) {
            addCriterion("appraisal_description not in", values, "appraisalDescription");
            return (Criteria) this;
        }

        public Criteria andAppraisalDescriptionBetween(String value1, String value2) {
            addCriterion("appraisal_description between", value1, value2, "appraisalDescription");
            return (Criteria) this;
        }

        public Criteria andAppraisalDescriptionNotBetween(String value1, String value2) {
            addCriterion("appraisal_description not between", value1, value2, "appraisalDescription");
            return (Criteria) this;
        }

        public Criteria andAppraisalImagesIsNull() {
            addCriterion("appraisal_images is null");
            return (Criteria) this;
        }

        public Criteria andAppraisalImagesIsNotNull() {
            addCriterion("appraisal_images is not null");
            return (Criteria) this;
        }

        public Criteria andAppraisalImagesEqualTo(String value) {
            addCriterion("appraisal_images =", value, "appraisalImages");
            return (Criteria) this;
        }

        public Criteria andAppraisalImagesNotEqualTo(String value) {
            addCriterion("appraisal_images <>", value, "appraisalImages");
            return (Criteria) this;
        }

        public Criteria andAppraisalImagesGreaterThan(String value) {
            addCriterion("appraisal_images >", value, "appraisalImages");
            return (Criteria) this;
        }

        public Criteria andAppraisalImagesGreaterThanOrEqualTo(String value) {
            addCriterion("appraisal_images >=", value, "appraisalImages");
            return (Criteria) this;
        }

        public Criteria andAppraisalImagesLessThan(String value) {
            addCriterion("appraisal_images <", value, "appraisalImages");
            return (Criteria) this;
        }

        public Criteria andAppraisalImagesLessThanOrEqualTo(String value) {
            addCriterion("appraisal_images <=", value, "appraisalImages");
            return (Criteria) this;
        }

        public Criteria andAppraisalImagesLike(String value) {
            addCriterion("appraisal_images like", value, "appraisalImages");
            return (Criteria) this;
        }

        public Criteria andAppraisalImagesNotLike(String value) {
            addCriterion("appraisal_images not like", value, "appraisalImages");
            return (Criteria) this;
        }

        public Criteria andAppraisalImagesIn(List<String> values) {
            addCriterion("appraisal_images in", values, "appraisalImages");
            return (Criteria) this;
        }

        public Criteria andAppraisalImagesNotIn(List<String> values) {
            addCriterion("appraisal_images not in", values, "appraisalImages");
            return (Criteria) this;
        }

        public Criteria andAppraisalImagesBetween(String value1, String value2) {
            addCriterion("appraisal_images between", value1, value2, "appraisalImages");
            return (Criteria) this;
        }

        public Criteria andAppraisalImagesNotBetween(String value1, String value2) {
            addCriterion("appraisal_images not between", value1, value2, "appraisalImages");
            return (Criteria) this;
        }

        public Criteria andAppraisalAuthorIdIsNull() {
            addCriterion("appraisal_author_id is null");
            return (Criteria) this;
        }

        public Criteria andAppraisalAuthorIdIsNotNull() {
            addCriterion("appraisal_author_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppraisalAuthorIdEqualTo(Integer value) {
            addCriterion("appraisal_author_id =", value, "appraisalAuthorId");
            return (Criteria) this;
        }

        public Criteria andAppraisalAuthorIdNotEqualTo(Integer value) {
            addCriterion("appraisal_author_id <>", value, "appraisalAuthorId");
            return (Criteria) this;
        }

        public Criteria andAppraisalAuthorIdGreaterThan(Integer value) {
            addCriterion("appraisal_author_id >", value, "appraisalAuthorId");
            return (Criteria) this;
        }

        public Criteria andAppraisalAuthorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("appraisal_author_id >=", value, "appraisalAuthorId");
            return (Criteria) this;
        }

        public Criteria andAppraisalAuthorIdLessThan(Integer value) {
            addCriterion("appraisal_author_id <", value, "appraisalAuthorId");
            return (Criteria) this;
        }

        public Criteria andAppraisalAuthorIdLessThanOrEqualTo(Integer value) {
            addCriterion("appraisal_author_id <=", value, "appraisalAuthorId");
            return (Criteria) this;
        }

        public Criteria andAppraisalAuthorIdIn(List<Integer> values) {
            addCriterion("appraisal_author_id in", values, "appraisalAuthorId");
            return (Criteria) this;
        }

        public Criteria andAppraisalAuthorIdNotIn(List<Integer> values) {
            addCriterion("appraisal_author_id not in", values, "appraisalAuthorId");
            return (Criteria) this;
        }

        public Criteria andAppraisalAuthorIdBetween(Integer value1, Integer value2) {
            addCriterion("appraisal_author_id between", value1, value2, "appraisalAuthorId");
            return (Criteria) this;
        }

        public Criteria andAppraisalAuthorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("appraisal_author_id not between", value1, value2, "appraisalAuthorId");
            return (Criteria) this;
        }

        public Criteria andAppraisalFollowerIdsIsNull() {
            addCriterion("appraisal_follower_ids is null");
            return (Criteria) this;
        }

        public Criteria andAppraisalFollowerIdsIsNotNull() {
            addCriterion("appraisal_follower_ids is not null");
            return (Criteria) this;
        }

        public Criteria andAppraisalFollowerIdsEqualTo(String value) {
            addCriterion("appraisal_follower_ids =", value, "appraisalFollowerIds");
            return (Criteria) this;
        }

        public Criteria andAppraisalFollowerIdsNotEqualTo(String value) {
            addCriterion("appraisal_follower_ids <>", value, "appraisalFollowerIds");
            return (Criteria) this;
        }

        public Criteria andAppraisalFollowerIdsGreaterThan(String value) {
            addCriterion("appraisal_follower_ids >", value, "appraisalFollowerIds");
            return (Criteria) this;
        }

        public Criteria andAppraisalFollowerIdsGreaterThanOrEqualTo(String value) {
            addCriterion("appraisal_follower_ids >=", value, "appraisalFollowerIds");
            return (Criteria) this;
        }

        public Criteria andAppraisalFollowerIdsLessThan(String value) {
            addCriterion("appraisal_follower_ids <", value, "appraisalFollowerIds");
            return (Criteria) this;
        }

        public Criteria andAppraisalFollowerIdsLessThanOrEqualTo(String value) {
            addCriterion("appraisal_follower_ids <=", value, "appraisalFollowerIds");
            return (Criteria) this;
        }

        public Criteria andAppraisalFollowerIdsLike(String value) {
            addCriterion("appraisal_follower_ids like", value, "appraisalFollowerIds");
            return (Criteria) this;
        }

        public Criteria andAppraisalFollowerIdsNotLike(String value) {
            addCriterion("appraisal_follower_ids not like", value, "appraisalFollowerIds");
            return (Criteria) this;
        }

        public Criteria andAppraisalFollowerIdsIn(List<String> values) {
            addCriterion("appraisal_follower_ids in", values, "appraisalFollowerIds");
            return (Criteria) this;
        }

        public Criteria andAppraisalFollowerIdsNotIn(List<String> values) {
            addCriterion("appraisal_follower_ids not in", values, "appraisalFollowerIds");
            return (Criteria) this;
        }

        public Criteria andAppraisalFollowerIdsBetween(String value1, String value2) {
            addCriterion("appraisal_follower_ids between", value1, value2, "appraisalFollowerIds");
            return (Criteria) this;
        }

        public Criteria andAppraisalFollowerIdsNotBetween(String value1, String value2) {
            addCriterion("appraisal_follower_ids not between", value1, value2, "appraisalFollowerIds");
            return (Criteria) this;
        }

        public Criteria andAppraisalTitleLikeInsensitive(String value) {
            addCriterion("upper(appraisal_title) like", value.toUpperCase(), "appraisalTitle");
            return (Criteria) this;
        }

        public Criteria andAppraisalDescriptionLikeInsensitive(String value) {
            addCriterion("upper(appraisal_description) like", value.toUpperCase(), "appraisalDescription");
            return (Criteria) this;
        }

        public Criteria andAppraisalImagesLikeInsensitive(String value) {
            addCriterion("upper(appraisal_images) like", value.toUpperCase(), "appraisalImages");
            return (Criteria) this;
        }

        public Criteria andAppraisalFollowerIdsLikeInsensitive(String value) {
            addCriterion("upper(appraisal_follower_ids) like", value.toUpperCase(), "appraisalFollowerIds");
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