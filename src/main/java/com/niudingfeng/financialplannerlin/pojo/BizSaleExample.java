package com.niudingfeng.financialplannerlin.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BizSaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BizSaleExample() {
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

        public Criteria andSaleIdIsNull() {
            addCriterion("sale_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleIdIsNotNull() {
            addCriterion("sale_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleIdEqualTo(String value) {
            addCriterion("sale_id =", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotEqualTo(String value) {
            addCriterion("sale_id <>", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThan(String value) {
            addCriterion("sale_id >", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThanOrEqualTo(String value) {
            addCriterion("sale_id >=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThan(String value) {
            addCriterion("sale_id <", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThanOrEqualTo(String value) {
            addCriterion("sale_id <=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLike(String value) {
            addCriterion("sale_id like", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotLike(String value) {
            addCriterion("sale_id not like", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdIn(List<String> values) {
            addCriterion("sale_id in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotIn(List<String> values) {
            addCriterion("sale_id not in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdBetween(String value1, String value2) {
            addCriterion("sale_id between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotBetween(String value1, String value2) {
            addCriterion("sale_id not between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
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

        public Criteria andLimitIdIsNull() {
            addCriterion("limit_Id is null");
            return (Criteria) this;
        }

        public Criteria andLimitIdIsNotNull() {
            addCriterion("limit_Id is not null");
            return (Criteria) this;
        }

        public Criteria andLimitIdEqualTo(String value) {
            addCriterion("limit_Id =", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdNotEqualTo(String value) {
            addCriterion("limit_Id <>", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdGreaterThan(String value) {
            addCriterion("limit_Id >", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdGreaterThanOrEqualTo(String value) {
            addCriterion("limit_Id >=", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdLessThan(String value) {
            addCriterion("limit_Id <", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdLessThanOrEqualTo(String value) {
            addCriterion("limit_Id <=", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdLike(String value) {
            addCriterion("limit_Id like", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdNotLike(String value) {
            addCriterion("limit_Id not like", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdIn(List<String> values) {
            addCriterion("limit_Id in", values, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdNotIn(List<String> values) {
            addCriterion("limit_Id not in", values, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdBetween(String value1, String value2) {
            addCriterion("limit_Id between", value1, value2, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdNotBetween(String value1, String value2) {
            addCriterion("limit_Id not between", value1, value2, "limitId");
            return (Criteria) this;
        }

        public Criteria andContractAmoIsNull() {
            addCriterion("contract_amo is null");
            return (Criteria) this;
        }

        public Criteria andContractAmoIsNotNull() {
            addCriterion("contract_amo is not null");
            return (Criteria) this;
        }

        public Criteria andContractAmoEqualTo(BigDecimal value) {
            addCriterion("contract_amo =", value, "contractAmo");
            return (Criteria) this;
        }

        public Criteria andContractAmoNotEqualTo(BigDecimal value) {
            addCriterion("contract_amo <>", value, "contractAmo");
            return (Criteria) this;
        }

        public Criteria andContractAmoGreaterThan(BigDecimal value) {
            addCriterion("contract_amo >", value, "contractAmo");
            return (Criteria) this;
        }

        public Criteria andContractAmoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("contract_amo >=", value, "contractAmo");
            return (Criteria) this;
        }

        public Criteria andContractAmoLessThan(BigDecimal value) {
            addCriterion("contract_amo <", value, "contractAmo");
            return (Criteria) this;
        }

        public Criteria andContractAmoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("contract_amo <=", value, "contractAmo");
            return (Criteria) this;
        }

        public Criteria andContractAmoIn(List<BigDecimal> values) {
            addCriterion("contract_amo in", values, "contractAmo");
            return (Criteria) this;
        }

        public Criteria andContractAmoNotIn(List<BigDecimal> values) {
            addCriterion("contract_amo not in", values, "contractAmo");
            return (Criteria) this;
        }

        public Criteria andContractAmoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("contract_amo between", value1, value2, "contractAmo");
            return (Criteria) this;
        }

        public Criteria andContractAmoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("contract_amo not between", value1, value2, "contractAmo");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNull() {
            addCriterion("contract_no is null");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNotNull() {
            addCriterion("contract_no is not null");
            return (Criteria) this;
        }

        public Criteria andContractNoEqualTo(String value) {
            addCriterion("contract_no =", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotEqualTo(String value) {
            addCriterion("contract_no <>", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThan(String value) {
            addCriterion("contract_no >", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("contract_no >=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThan(String value) {
            addCriterion("contract_no <", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThanOrEqualTo(String value) {
            addCriterion("contract_no <=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLike(String value) {
            addCriterion("contract_no like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotLike(String value) {
            addCriterion("contract_no not like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoIn(List<String> values) {
            addCriterion("contract_no in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotIn(List<String> values) {
            addCriterion("contract_no not in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoBetween(String value1, String value2) {
            addCriterion("contract_no between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotBetween(String value1, String value2) {
            addCriterion("contract_no not between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andJkMoneyIsNull() {
            addCriterion("Jk_Money is null");
            return (Criteria) this;
        }

        public Criteria andJkMoneyIsNotNull() {
            addCriterion("Jk_Money is not null");
            return (Criteria) this;
        }

        public Criteria andJkMoneyEqualTo(BigDecimal value) {
            addCriterion("Jk_Money =", value, "jkMoney");
            return (Criteria) this;
        }

        public Criteria andJkMoneyNotEqualTo(BigDecimal value) {
            addCriterion("Jk_Money <>", value, "jkMoney");
            return (Criteria) this;
        }

        public Criteria andJkMoneyGreaterThan(BigDecimal value) {
            addCriterion("Jk_Money >", value, "jkMoney");
            return (Criteria) this;
        }

        public Criteria andJkMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Jk_Money >=", value, "jkMoney");
            return (Criteria) this;
        }

        public Criteria andJkMoneyLessThan(BigDecimal value) {
            addCriterion("Jk_Money <", value, "jkMoney");
            return (Criteria) this;
        }

        public Criteria andJkMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Jk_Money <=", value, "jkMoney");
            return (Criteria) this;
        }

        public Criteria andJkMoneyIn(List<BigDecimal> values) {
            addCriterion("Jk_Money in", values, "jkMoney");
            return (Criteria) this;
        }

        public Criteria andJkMoneyNotIn(List<BigDecimal> values) {
            addCriterion("Jk_Money not in", values, "jkMoney");
            return (Criteria) this;
        }

        public Criteria andJkMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Jk_Money between", value1, value2, "jkMoney");
            return (Criteria) this;
        }

        public Criteria andJkMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Jk_Money not between", value1, value2, "jkMoney");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("pay_type like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("pay_type not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNull() {
            addCriterion("pay_date is null");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNotNull() {
            addCriterion("pay_date is not null");
            return (Criteria) this;
        }

        public Criteria andPayDateEqualTo(String value) {
            addCriterion("pay_date =", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotEqualTo(String value) {
            addCriterion("pay_date <>", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThan(String value) {
            addCriterion("pay_date >", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThanOrEqualTo(String value) {
            addCriterion("pay_date >=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThan(String value) {
            addCriterion("pay_date <", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThanOrEqualTo(String value) {
            addCriterion("pay_date <=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLike(String value) {
            addCriterion("pay_date like", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotLike(String value) {
            addCriterion("pay_date not like", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIn(List<String> values) {
            addCriterion("pay_date in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotIn(List<String> values) {
            addCriterion("pay_date not in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateBetween(String value1, String value2) {
            addCriterion("pay_date between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotBetween(String value1, String value2) {
            addCriterion("pay_date not between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayingBankIsNull() {
            addCriterion("paying_bank is null");
            return (Criteria) this;
        }

        public Criteria andPayingBankIsNotNull() {
            addCriterion("paying_bank is not null");
            return (Criteria) this;
        }

        public Criteria andPayingBankEqualTo(String value) {
            addCriterion("paying_bank =", value, "payingBank");
            return (Criteria) this;
        }

        public Criteria andPayingBankNotEqualTo(String value) {
            addCriterion("paying_bank <>", value, "payingBank");
            return (Criteria) this;
        }

        public Criteria andPayingBankGreaterThan(String value) {
            addCriterion("paying_bank >", value, "payingBank");
            return (Criteria) this;
        }

        public Criteria andPayingBankGreaterThanOrEqualTo(String value) {
            addCriterion("paying_bank >=", value, "payingBank");
            return (Criteria) this;
        }

        public Criteria andPayingBankLessThan(String value) {
            addCriterion("paying_bank <", value, "payingBank");
            return (Criteria) this;
        }

        public Criteria andPayingBankLessThanOrEqualTo(String value) {
            addCriterion("paying_bank <=", value, "payingBank");
            return (Criteria) this;
        }

        public Criteria andPayingBankLike(String value) {
            addCriterion("paying_bank like", value, "payingBank");
            return (Criteria) this;
        }

        public Criteria andPayingBankNotLike(String value) {
            addCriterion("paying_bank not like", value, "payingBank");
            return (Criteria) this;
        }

        public Criteria andPayingBankIn(List<String> values) {
            addCriterion("paying_bank in", values, "payingBank");
            return (Criteria) this;
        }

        public Criteria andPayingBankNotIn(List<String> values) {
            addCriterion("paying_bank not in", values, "payingBank");
            return (Criteria) this;
        }

        public Criteria andPayingBankBetween(String value1, String value2) {
            addCriterion("paying_bank between", value1, value2, "payingBank");
            return (Criteria) this;
        }

        public Criteria andPayingBankNotBetween(String value1, String value2) {
            addCriterion("paying_bank not between", value1, value2, "payingBank");
            return (Criteria) this;
        }

        public Criteria andPayingAcountIsNull() {
            addCriterion("paying_acount is null");
            return (Criteria) this;
        }

        public Criteria andPayingAcountIsNotNull() {
            addCriterion("paying_acount is not null");
            return (Criteria) this;
        }

        public Criteria andPayingAcountEqualTo(String value) {
            addCriterion("paying_acount =", value, "payingAcount");
            return (Criteria) this;
        }

        public Criteria andPayingAcountNotEqualTo(String value) {
            addCriterion("paying_acount <>", value, "payingAcount");
            return (Criteria) this;
        }

        public Criteria andPayingAcountGreaterThan(String value) {
            addCriterion("paying_acount >", value, "payingAcount");
            return (Criteria) this;
        }

        public Criteria andPayingAcountGreaterThanOrEqualTo(String value) {
            addCriterion("paying_acount >=", value, "payingAcount");
            return (Criteria) this;
        }

        public Criteria andPayingAcountLessThan(String value) {
            addCriterion("paying_acount <", value, "payingAcount");
            return (Criteria) this;
        }

        public Criteria andPayingAcountLessThanOrEqualTo(String value) {
            addCriterion("paying_acount <=", value, "payingAcount");
            return (Criteria) this;
        }

        public Criteria andPayingAcountLike(String value) {
            addCriterion("paying_acount like", value, "payingAcount");
            return (Criteria) this;
        }

        public Criteria andPayingAcountNotLike(String value) {
            addCriterion("paying_acount not like", value, "payingAcount");
            return (Criteria) this;
        }

        public Criteria andPayingAcountIn(List<String> values) {
            addCriterion("paying_acount in", values, "payingAcount");
            return (Criteria) this;
        }

        public Criteria andPayingAcountNotIn(List<String> values) {
            addCriterion("paying_acount not in", values, "payingAcount");
            return (Criteria) this;
        }

        public Criteria andPayingAcountBetween(String value1, String value2) {
            addCriterion("paying_acount between", value1, value2, "payingAcount");
            return (Criteria) this;
        }

        public Criteria andPayingAcountNotBetween(String value1, String value2) {
            addCriterion("paying_acount not between", value1, value2, "payingAcount");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNumberIsNull() {
            addCriterion("user_number is null");
            return (Criteria) this;
        }

        public Criteria andUserNumberIsNotNull() {
            addCriterion("user_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserNumberEqualTo(String value) {
            addCriterion("user_number =", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotEqualTo(String value) {
            addCriterion("user_number <>", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberGreaterThan(String value) {
            addCriterion("user_number >", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_number >=", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLessThan(String value) {
            addCriterion("user_number <", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLessThanOrEqualTo(String value) {
            addCriterion("user_number <=", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLike(String value) {
            addCriterion("user_number like", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotLike(String value) {
            addCriterion("user_number not like", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberIn(List<String> values) {
            addCriterion("user_number in", values, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotIn(List<String> values) {
            addCriterion("user_number not in", values, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberBetween(String value1, String value2) {
            addCriterion("user_number between", value1, value2, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotBetween(String value1, String value2) {
            addCriterion("user_number not between", value1, value2, "userNumber");
            return (Criteria) this;
        }

        public Criteria andSubmitFlagIsNull() {
            addCriterion("submit_flag is null");
            return (Criteria) this;
        }

        public Criteria andSubmitFlagIsNotNull() {
            addCriterion("submit_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitFlagEqualTo(String value) {
            addCriterion("submit_flag =", value, "submitFlag");
            return (Criteria) this;
        }

        public Criteria andSubmitFlagNotEqualTo(String value) {
            addCriterion("submit_flag <>", value, "submitFlag");
            return (Criteria) this;
        }

        public Criteria andSubmitFlagGreaterThan(String value) {
            addCriterion("submit_flag >", value, "submitFlag");
            return (Criteria) this;
        }

        public Criteria andSubmitFlagGreaterThanOrEqualTo(String value) {
            addCriterion("submit_flag >=", value, "submitFlag");
            return (Criteria) this;
        }

        public Criteria andSubmitFlagLessThan(String value) {
            addCriterion("submit_flag <", value, "submitFlag");
            return (Criteria) this;
        }

        public Criteria andSubmitFlagLessThanOrEqualTo(String value) {
            addCriterion("submit_flag <=", value, "submitFlag");
            return (Criteria) this;
        }

        public Criteria andSubmitFlagLike(String value) {
            addCriterion("submit_flag like", value, "submitFlag");
            return (Criteria) this;
        }

        public Criteria andSubmitFlagNotLike(String value) {
            addCriterion("submit_flag not like", value, "submitFlag");
            return (Criteria) this;
        }

        public Criteria andSubmitFlagIn(List<String> values) {
            addCriterion("submit_flag in", values, "submitFlag");
            return (Criteria) this;
        }

        public Criteria andSubmitFlagNotIn(List<String> values) {
            addCriterion("submit_flag not in", values, "submitFlag");
            return (Criteria) this;
        }

        public Criteria andSubmitFlagBetween(String value1, String value2) {
            addCriterion("submit_flag between", value1, value2, "submitFlag");
            return (Criteria) this;
        }

        public Criteria andSubmitFlagNotBetween(String value1, String value2) {
            addCriterion("submit_flag not between", value1, value2, "submitFlag");
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