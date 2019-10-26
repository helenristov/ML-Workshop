// Databricks notebook source
// MAGIC %md
// MAGIC <div style="text-align: center; line-height: 0; padding-top: 9px;">
// MAGIC   <img src="https://cdn2.hubspot.net/hubfs/438089/docs/training/dblearning-banner.png" alt="Databricks Learning" width="555" height="64">
// MAGIC </div>

// COMMAND ----------

// MAGIC %md
// MAGIC &copy; 2018 Databricks, Inc. All rights reserved.<br/>

// COMMAND ----------

// MAGIC %md
// MAGIC ##![Spark Logo Tiny](https://kpistoropen.blob.core.windows.net/collateral/roadshow/logo_spark_tiny.png) Agenda for today's session
// MAGIC 
// MAGIC Today we will walk through a whole data flow for fictional retail company, Contoso. This data flow will cover common tasks for Data Engineers, Data Scientist, and Analysts  
// MAGIC 
// MAGIC ####The topics we will cover:
// MAGIC 
// MAGIC * Contoso, our customer
// MAGIC   - Challenges
// MAGIC   - Suggested architecture
// MAGIC * Azure Databricks overview
// MAGIC * Data sources: Azure Blob Storage
// MAGIC * Read data from Azure Blob Storage & do some transformations
// MAGIC * Streaming data Azure Blob Storage [STRETCH GOAL]
// MAGIC * Machine Learning - Product Recommendations; MLFlow
// MAGIC * Pipelines without and with Delta

// COMMAND ----------

// MAGIC %md 
// MAGIC ##![Spark Logo Tiny](https://kpistoropen.blob.core.windows.net/collateral/roadshow/logo_spark_tiny.png) Contoso
// MAGIC 
// MAGIC ### Business Challenges
// MAGIC * Total revenues have been down 10% YoY
// MAGIC * Online sales growing ~2% YoY, but at a slower rate than other retailers
// MAGIC * Company wide initiative to increase online traffic and conversion rate to meet that ~8-10% YoY growth target 
// MAGIC 
// MAGIC ### Technical Challenges
// MAGIC * Data sets getting too large for existing ETL and SQL users
// MAGIC * Data in many different systems, DBs, Datalakes, ERPs, etc
// MAGIC * KPIs, BI & Reports are stale - Takes days for ETL
// MAGIC * Not able to make realtime decisions
// MAGIC * Despite having a team of 5 Data Scientists, very little impact to the website or revenue

// COMMAND ----------

// MAGIC %md 
// MAGIC ###Suggested architecture
// MAGIC 
// MAGIC Azure Databricks pipeline in today's exercise. We will cover typical flows for Data Engineers, Data Scientist and Analysis  
// MAGIC 
// MAGIC ![arch](https://kpistoropen.blob.core.windows.net/collateral/roadshow/azure_roadshow_1.png)

// COMMAND ----------

// MAGIC %md 
// MAGIC ### Today our labs will be with this retail example, but this data transformation exists in all industries and verticals
// MAGIC * Financial Services: Alternative Data, Credit Risk, ATM/CC Fraud Detection
// MAGIC * Shipping, Travel & Transportation: IoT - Connected Trucks, Planes, Ships and Packages
// MAGIC * Health & Life Sciences: Medical Records, Genomics Data (growing faster than Moore's law) 
// MAGIC * Insurance: IoT - Connected Vehicles, Health Records, *etc.*
// MAGIC * Energy & Manufacturing: Preventative Maintenance
// MAGIC * IT Security: Log Monitoring and Alerts

// COMMAND ----------

// MAGIC %md
// MAGIC ## Next Step
// MAGIC 
// MAGIC [Azure Databricks Overview]($./0-02 Azure Databricks Overview)

// COMMAND ----------

// MAGIC %md
// MAGIC &copy; 2018 Databricks, Inc. All rights reserved.<br/>
// MAGIC Apache, Apache Spark, Spark and the Spark logo are trademarks of the <a href="http://www.apache.org/">Apache Software Foundation</a>.<br/>
// MAGIC <br/>
// MAGIC <a href="https://databricks.com/privacy-policy">Privacy Policy</a> | <a href="https://databricks.com/terms-of-use">Terms of Use</a> | <a href="http://help.databricks.com/">Support</a>
