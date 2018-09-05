package com.niudingfeng.financialplannerlin.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andPresaleDayIsNull() {
            addCriterion("presale_day is null");
            return (Criteria) this;
        }

        public Criteria andPresaleDayIsNotNull() {
            addCriterion("presale_day is not null");
            return (Criteria) this;
        }

        public Criteria andPresaleDayEqualTo(String value) {
            addCriterion("presale_day =", value, "presaleDay");
            return (Criteria) this;
        }

        public Criteria andPresaleDayNotEqualTo(String value) {
            addCriterion("presale_day <>", value, "presaleDay");
            return (Criteria) this;
        }

        public Criteria andPresaleDayGreaterThan(String value) {
            addCriterion("presale_day >", value, "presaleDay");
            return (Criteria) this;
        }

        public Criteria andPresaleDayGreaterThanOrEqualTo(String value) {
            addCriterion("presale_day >=", value, "presaleDay");
            return (Criteria) this;
        }

        public Criteria andPresaleDayLessThan(String value) {
            addCriterion("presale_day <", value, "presaleDay");
            return (Criteria) this;
        }

        public Criteria andPresaleDayLessThanOrEqualTo(String value) {
            addCriterion("presale_day <=", value, "presaleDay");
            return (Criteria) this;
        }

        public Criteria andPresaleDayLike(String value) {
            addCriterion("presale_day like", value, "presaleDay");
            return (Criteria) this;
        }

        public Criteria andPresaleDayNotLike(String value) {
            addCriterion("presale_day not like", value, "presaleDay");
            return (Criteria) this;
        }

        public Criteria andPresaleDayIn(List<String> values) {
            addCriterion("presale_day in", values, "presaleDay");
            return (Criteria) this;
        }

        public Criteria andPresaleDayNotIn(List<String> values) {
            addCriterion("presale_day not in", values, "presaleDay");
            return (Criteria) this;
        }

        public Criteria andPresaleDayBetween(String value1, String value2) {
            addCriterion("presale_day between", value1, value2, "presaleDay");
            return (Criteria) this;
        }

        public Criteria andPresaleDayNotBetween(String value1, String value2) {
            addCriterion("presale_day not between", value1, value2, "presaleDay");
            return (Criteria) this;
        }

        public Criteria andLimitIdIsNull() {
            addCriterion("limit_id is null");
            return (Criteria) this;
        }

        public Criteria andLimitIdIsNotNull() {
            addCriterion("limit_id is not null");
            return (Criteria) this;
        }

        public Criteria andLimitIdEqualTo(String value) {
            addCriterion("limit_id =", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdNotEqualTo(String value) {
            addCriterion("limit_id <>", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdGreaterThan(String value) {
            addCriterion("limit_id >", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdGreaterThanOrEqualTo(String value) {
            addCriterion("limit_id >=", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdLessThan(String value) {
            addCriterion("limit_id <", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdLessThanOrEqualTo(String value) {
            addCriterion("limit_id <=", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdLike(String value) {
            addCriterion("limit_id like", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdNotLike(String value) {
            addCriterion("limit_id not like", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdIn(List<String> values) {
            addCriterion("limit_id in", values, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdNotIn(List<String> values) {
            addCriterion("limit_id not in", values, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdBetween(String value1, String value2) {
            addCriterion("limit_id between", value1, value2, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdNotBetween(String value1, String value2) {
            addCriterion("limit_id not between", value1, value2, "limitId");
            return (Criteria) this;
        }

        public Criteria andExpectRateIsNull() {
            addCriterion("expect_rate is null");
            return (Criteria) this;
        }

        public Criteria andExpectRateIsNotNull() {
            addCriterion("expect_rate is not null");
            return (Criteria) this;
        }

        public Criteria andExpectRateEqualTo(String value) {
            addCriterion("expect_rate =", value, "expectRate");
            return (Criteria) this;
        }

        public Criteria andExpectRateNotEqualTo(String value) {
            addCriterion("expect_rate <>", value, "expectRate");
            return (Criteria) this;
        }

        public Criteria andExpectRateGreaterThan(String value) {
            addCriterion("expect_rate >", value, "expectRate");
            return (Criteria) this;
        }

        public Criteria andExpectRateGreaterThanOrEqualTo(String value) {
            addCriterion("expect_rate >=", value, "expectRate");
            return (Criteria) this;
        }

        public Criteria andExpectRateLessThan(String value) {
            addCriterion("expect_rate <", value, "expectRate");
            return (Criteria) this;
        }

        public Criteria andExpectRateLessThanOrEqualTo(String value) {
            addCriterion("expect_rate <=", value, "expectRate");
            return (Criteria) this;
        }

        public Criteria andExpectRateLike(String value) {
            addCriterion("expect_rate like", value, "expectRate");
            return (Criteria) this;
        }

        public Criteria andExpectRateNotLike(String value) {
            addCriterion("expect_rate not like", value, "expectRate");
            return (Criteria) this;
        }

        public Criteria andExpectRateIn(List<String> values) {
            addCriterion("expect_rate in", values, "expectRate");
            return (Criteria) this;
        }

        public Criteria andExpectRateNotIn(List<String> values) {
            addCriterion("expect_rate not in", values, "expectRate");
            return (Criteria) this;
        }

        public Criteria andExpectRateBetween(String value1, String value2) {
            addCriterion("expect_rate between", value1, value2, "expectRate");
            return (Criteria) this;
        }

        public Criteria andExpectRateNotBetween(String value1, String value2) {
            addCriterion("expect_rate not between", value1, value2, "expectRate");
            return (Criteria) this;
        }

        public Criteria andProductSizeIsNull() {
            addCriterion("product_size is null");
            return (Criteria) this;
        }

        public Criteria andProductSizeIsNotNull() {
            addCriterion("product_size is not null");
            return (Criteria) this;
        }

        public Criteria andProductSizeEqualTo(BigDecimal value) {
            addCriterion("product_size =", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeNotEqualTo(BigDecimal value) {
            addCriterion("product_size <>", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeGreaterThan(BigDecimal value) {
            addCriterion("product_size >", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("product_size >=", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeLessThan(BigDecimal value) {
            addCriterion("product_size <", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("product_size <=", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeIn(List<BigDecimal> values) {
            addCriterion("product_size in", values, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeNotIn(List<BigDecimal> values) {
            addCriterion("product_size not in", values, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_size between", value1, value2, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_size not between", value1, value2, "productSize");
            return (Criteria) this;
        }

        public Criteria andStartingPointIsNull() {
            addCriterion("starting_point is null");
            return (Criteria) this;
        }

        public Criteria andStartingPointIsNotNull() {
            addCriterion("starting_point is not null");
            return (Criteria) this;
        }

        public Criteria andStartingPointEqualTo(BigDecimal value) {
            addCriterion("starting_point =", value, "startingPoint");
            return (Criteria) this;
        }

        public Criteria andStartingPointNotEqualTo(BigDecimal value) {
            addCriterion("starting_point <>", value, "startingPoint");
            return (Criteria) this;
        }

        public Criteria andStartingPointGreaterThan(BigDecimal value) {
            addCriterion("starting_point >", value, "startingPoint");
            return (Criteria) this;
        }

        public Criteria andStartingPointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("starting_point >=", value, "startingPoint");
            return (Criteria) this;
        }

        public Criteria andStartingPointLessThan(BigDecimal value) {
            addCriterion("starting_point <", value, "startingPoint");
            return (Criteria) this;
        }

        public Criteria andStartingPointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("starting_point <=", value, "startingPoint");
            return (Criteria) this;
        }

        public Criteria andStartingPointIn(List<BigDecimal> values) {
            addCriterion("starting_point in", values, "startingPoint");
            return (Criteria) this;
        }

        public Criteria andStartingPointNotIn(List<BigDecimal> values) {
            addCriterion("starting_point not in", values, "startingPoint");
            return (Criteria) this;
        }

        public Criteria andStartingPointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("starting_point between", value1, value2, "startingPoint");
            return (Criteria) this;
        }

        public Criteria andStartingPointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("starting_point not between", value1, value2, "startingPoint");
            return (Criteria) this;
        }

        public Criteria andStartingMoneyIsNull() {
            addCriterion("starting_money is null");
            return (Criteria) this;
        }

        public Criteria andStartingMoneyIsNotNull() {
            addCriterion("starting_money is not null");
            return (Criteria) this;
        }

        public Criteria andStartingMoneyEqualTo(BigDecimal value) {
            addCriterion("starting_money =", value, "startingMoney");
            return (Criteria) this;
        }

        public Criteria andStartingMoneyNotEqualTo(BigDecimal value) {
            addCriterion("starting_money <>", value, "startingMoney");
            return (Criteria) this;
        }

        public Criteria andStartingMoneyGreaterThan(BigDecimal value) {
            addCriterion("starting_money >", value, "startingMoney");
            return (Criteria) this;
        }

        public Criteria andStartingMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("starting_money >=", value, "startingMoney");
            return (Criteria) this;
        }

        public Criteria andStartingMoneyLessThan(BigDecimal value) {
            addCriterion("starting_money <", value, "startingMoney");
            return (Criteria) this;
        }

        public Criteria andStartingMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("starting_money <=", value, "startingMoney");
            return (Criteria) this;
        }

        public Criteria andStartingMoneyIn(List<BigDecimal> values) {
            addCriterion("starting_money in", values, "startingMoney");
            return (Criteria) this;
        }

        public Criteria andStartingMoneyNotIn(List<BigDecimal> values) {
            addCriterion("starting_money not in", values, "startingMoney");
            return (Criteria) this;
        }

        public Criteria andStartingMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("starting_money between", value1, value2, "startingMoney");
            return (Criteria) this;
        }

        public Criteria andStartingMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("starting_money not between", value1, value2, "startingMoney");
            return (Criteria) this;
        }

        public Criteria andYyyCopiesIsNull() {
            addCriterion("yyy_copies is null");
            return (Criteria) this;
        }

        public Criteria andYyyCopiesIsNotNull() {
            addCriterion("yyy_copies is not null");
            return (Criteria) this;
        }

        public Criteria andYyyCopiesEqualTo(Integer value) {
            addCriterion("yyy_copies =", value, "yyyCopies");
            return (Criteria) this;
        }

        public Criteria andYyyCopiesNotEqualTo(Integer value) {
            addCriterion("yyy_copies <>", value, "yyyCopies");
            return (Criteria) this;
        }

        public Criteria andYyyCopiesGreaterThan(Integer value) {
            addCriterion("yyy_copies >", value, "yyyCopies");
            return (Criteria) this;
        }

        public Criteria andYyyCopiesGreaterThanOrEqualTo(Integer value) {
            addCriterion("yyy_copies >=", value, "yyyCopies");
            return (Criteria) this;
        }

        public Criteria andYyyCopiesLessThan(Integer value) {
            addCriterion("yyy_copies <", value, "yyyCopies");
            return (Criteria) this;
        }

        public Criteria andYyyCopiesLessThanOrEqualTo(Integer value) {
            addCriterion("yyy_copies <=", value, "yyyCopies");
            return (Criteria) this;
        }

        public Criteria andYyyCopiesIn(List<Integer> values) {
            addCriterion("yyy_copies in", values, "yyyCopies");
            return (Criteria) this;
        }

        public Criteria andYyyCopiesNotIn(List<Integer> values) {
            addCriterion("yyy_copies not in", values, "yyyCopies");
            return (Criteria) this;
        }

        public Criteria andYyyCopiesBetween(Integer value1, Integer value2) {
            addCriterion("yyy_copies between", value1, value2, "yyyCopies");
            return (Criteria) this;
        }

        public Criteria andYyyCopiesNotBetween(Integer value1, Integer value2) {
            addCriterion("yyy_copies not between", value1, value2, "yyyCopies");
            return (Criteria) this;
        }

        public Criteria andYyyMoneyIsNull() {
            addCriterion("yyy_money is null");
            return (Criteria) this;
        }

        public Criteria andYyyMoneyIsNotNull() {
            addCriterion("yyy_money is not null");
            return (Criteria) this;
        }

        public Criteria andYyyMoneyEqualTo(BigDecimal value) {
            addCriterion("yyy_money =", value, "yyyMoney");
            return (Criteria) this;
        }

        public Criteria andYyyMoneyNotEqualTo(BigDecimal value) {
            addCriterion("yyy_money <>", value, "yyyMoney");
            return (Criteria) this;
        }

        public Criteria andYyyMoneyGreaterThan(BigDecimal value) {
            addCriterion("yyy_money >", value, "yyyMoney");
            return (Criteria) this;
        }

        public Criteria andYyyMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yyy_money >=", value, "yyyMoney");
            return (Criteria) this;
        }

        public Criteria andYyyMoneyLessThan(BigDecimal value) {
            addCriterion("yyy_money <", value, "yyyMoney");
            return (Criteria) this;
        }

        public Criteria andYyyMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yyy_money <=", value, "yyyMoney");
            return (Criteria) this;
        }

        public Criteria andYyyMoneyIn(List<BigDecimal> values) {
            addCriterion("yyy_money in", values, "yyyMoney");
            return (Criteria) this;
        }

        public Criteria andYyyMoneyNotIn(List<BigDecimal> values) {
            addCriterion("yyy_money not in", values, "yyyMoney");
            return (Criteria) this;
        }

        public Criteria andYyyMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yyy_money between", value1, value2, "yyyMoney");
            return (Criteria) this;
        }

        public Criteria andYyyMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yyy_money not between", value1, value2, "yyyMoney");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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