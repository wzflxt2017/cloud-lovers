package com.wangzefeng.lovers.java.domain;

public class Workflow {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column workflow.workflow_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer workflowId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column workflow.workflow_key
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String workflowKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column workflow.workflow_name
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String workflowName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column workflow.workflow_describe
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String workflowDescribe;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column workflow.order_number
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer orderNumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column workflow.workflow_id
     *
     * @return the value of workflow.workflow_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getWorkflowId() {
        return workflowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column workflow.workflow_id
     *
     * @param workflowId the value for workflow.workflow_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setWorkflowId(Integer workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column workflow.workflow_key
     *
     * @return the value of workflow.workflow_key
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public String getWorkflowKey() {
        return workflowKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column workflow.workflow_key
     *
     * @param workflowKey the value for workflow.workflow_key
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setWorkflowKey(String workflowKey) {
        this.workflowKey = workflowKey == null ? null : workflowKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column workflow.workflow_name
     *
     * @return the value of workflow.workflow_name
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public String getWorkflowName() {
        return workflowName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column workflow.workflow_name
     *
     * @param workflowName the value for workflow.workflow_name
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName == null ? null : workflowName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column workflow.workflow_describe
     *
     * @return the value of workflow.workflow_describe
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public String getWorkflowDescribe() {
        return workflowDescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column workflow.workflow_describe
     *
     * @param workflowDescribe the value for workflow.workflow_describe
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setWorkflowDescribe(String workflowDescribe) {
        this.workflowDescribe = workflowDescribe == null ? null : workflowDescribe.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column workflow.order_number
     *
     * @return the value of workflow.order_number
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getOrderNumber() {
        return orderNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column workflow.order_number
     *
     * @param orderNumber the value for workflow.order_number
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }
}