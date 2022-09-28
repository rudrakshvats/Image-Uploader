/*************************************************************************
 *
 * SATIN CREDITCARE NETWORK LIMITED CONFIDENTIAL
 * __________________
 *
 *  [2018] SATIN CREDITCARE NETWORK LIMITED
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains the property of SATIN CREDITCARE NETWORK LIMITED, and
 * The intellectual and technical concepts contained herein are proprietary to SATIN CREDITCARE NETWORK LIMITED
 * and may be covered by India and Foreign Patents, patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission
 * is obtained from SATIN CREDITCARE NETWORK LIMITED.
 */
package com.image_uploader.constant;

public final class Constant {

    public static final String DATE_FORMAT = "dd-MM-yyyy";
    public static final String DATE_TIME_FORMAT = "dd-MM-yyyy HH:mm:ss";

    public static final String SATIN = "Satin Creditcare Network Ltd.";
    /**
     * Reports message constant variables
     */
    public static final String REPORT_MESSAGE_START = "This report has been";
    public static final String REPORT_MESSAGE_APPROVAL = " approved by ";
    public static final String REPORT_MESSAGE_REJECT = " rejected by ";
    public static final String REPORT_MESSAGE_DELETE = " deleted by ";
    public static final String REPORT_MESSAGE_CLOSE = " closed by ";
    public static final String REPORT_MESSAGE_SUBMIT = " submitted by ";
    public static final String REPORT_MESSAGE_PAYMENT_PROCESS = " processed for payment by ";
    public static final String REPORT_MESSAGE_AMOUNT_CHANGE = "Amount has been decreased to ";
    public static final String REPORT_MESSAGE_VOUCHER = "Your expense vouchers have been submitted for approval on ";
    public static final String REPORT_MESSAGE_CLOSED = "This report has been closed by ";

    /**
     * EMAIL CONSTANT VARIABLES
     */
    public static final String EXPENSE_APPROVAL_MESSAGE = "Expense has been approved";
    public static final String EXPENSE_SUBMIT_MESSAGE = "Expense has been submitted successfully";
    public static final String EXPENSE_REJECT_MESSAGE = "Expense has been rejected";
    public static final String EXPENSE_DELETE_MESSAGE = "Expense has been deleted successfully";
    public static final String EXPENSE_CLOSE_MESSAGE = "Expense has been closed";
    public static final String REPORT_SUBMIT_SUBJECT = "has submitted the report";
    public static final String REPORT_APPROVE_SUBJECT = "has approved the report";
    public static final String REPORT_REJECT_SUBJECT = "has rejected your report.";
    public static final String THANKS_AND_REGARDS = "Thanks and Regards";
    public static final String PAYMENT_EMAIL_BODY = "The payment for this report has been successfully processed by: ";
    public static final String TEAM_EMS = "Team EMS";
    public static final String PAYMENT_PROCESSED = "Payment Processed for your report";
    public static final String REPORT_COMMENT_SUBJECT = "New Comment on your Report";
    public static final String PAYMENT_NOT_PROCESSED = "Payment Not Processed for your report";
    public static final String SUBORDINATE_STATUS_SUBJECT = "Status of your subordinate";
    public static final String PAYMENT_PROCESSED_TIMELINE_MESSAGE = "Payment of this report has been processed with UTR No: ";

    /*
    EXCEPTION CONSTANT VARIABLES
     */
    public static final String HEADER_APPROVAL_REJECTION = "Current Employee is not authorised to approve this report";
    public static final String CSO_APPROVAL_REJECTION = "Current Employee is not authorised to approve this CSO";
    public static final String SELECT_EXPENSE = "Please Select an Expense!";
    public static final String EXPENSE_LIMIT = "Atmost 50 Expenses allowed to save";
    public static final String EXPENSE_NOT_FOUND = "No expense found for this Report Id";
    public static final String REPORT_ALREADY_SAVED = "Report Already Saved";
    public static final String ID_MISMATCH = "Id Mismatch";
    public static final String L4_MANAGER_NOT_FOUND = "L4 Manager Not Found";
    public static final String L3_MANAGER_NOT_FOUND = "L3 Manager Not Found";

    public static final String DYCO_MANAGER_NOT_FOUND = "Dycoo Manager Not Found";
    public static final String HR_MANAGER_NOT_FOUND = "HR Manager Not Found";
    public static final String L5_MANAGER_NOT_FOUND = "L5 Manager Not Found";
    public static final String EXPENSE_NOT_FOUND_FOR_EMPLOYEE = "No expense found for this employee";
    public static final String RECORD_NOT_FOUND = "No Records Found";
    public static final String INVALID_PAGE_SIZE = "invalid page size: ";
    public static final String INVALID_GSTIN = "Please enter valid GSTIN Number";
    public static final String SUB_CATEGORY_ID_NOT_EXIST = "SubCategoryId does not exist";
    public static final String ALL_EXPENSES_DELETED = "All Expenses Deleted";
    public static final String NO_CITY_FOUND = "No City found";
    public static final String L4_MANAGER_ERROR = "L4 Manager not found";
    public static final String NO_DOCUMENT_FOUND = "No Document Found";
    public static final String DOCUMENT_DELETED = "Document Deleted";
    public static final String NO_EXPENSE_FOUND = "No Expense Found";
    public static final String EXPENSE_DELETED = "Expense Deleted";
    public static final String POLICY_NOT_DEFINED = "No Policy defined for you. Please contact to admin";
    public static final String ROLE_ID_NOT_FOUND = "No RoleId found";
    public static final String POLICY_NOT_FOUND = "No Policies Found";
    public static final String NO_RULES_FOUND = "No Rules Found for this Policy Id";
    public static final String ERROR_MSG = "Something went Wrong, Please try Later";
    public static final String POLICY_EXISTS = "Policy Already Exists";
    public static final String REQUIRED = "Either Designation or Employees are required";
    public static final String POLICY_NAME_ERROR = "Policy Name Too Large";
    public static final String NO_RULE_FOUND = "Rule Not Found";
    public static final String DUPLICATE_SUB_CATEGORY = "Duplicate Sub Category";
    public static final String RULE_EXISTS = "Rule Already Exists";
    public static final String Payment_Status = "Pending";
    public static final String REPORT_CLOSED = "Report Closed";
    public static final String NO_POLICY_FOUND = "No Policy Found";
    public static final String FILL_POLICY_NAME = "Please enter policy name";
    public static final String FILE_ERROR = "Please select a file";
    public static final String NOT_AUTHORIZED = "You are not authorize to change details";
    public static final String NOT_AUTHORIZED_FOR_EXPENSE = "You are not authorized to save Expense Before Approval Date";
    public static final String NOT_YOUR_SUBORDINATE = "Employee is Not Your Subordinate";
    public static final String NO_LMS_ACCOUNT_KEY = "LMS Account Key not found";
    public static final String DELETE_NOT_ALLOWED = "You are not authorized to delete expense";
    public static final String NO_AUTHORIZATION = "Authorization required";
    public static final String CSO_AUTHORIZATION = " You are not eligible for this transaction";
    public static final String NO_BRANCH_ID = "Branch Id not found";
    public static final String INVOICE_AND_GSTIN_NO = "Merchant GSTIN No and Invoice Number already exists for ";
    public static final String SPEND_TYPE_ERROR = "Please select Spend Account";
    public static final String DUPLICATE_RECORD = "Duplicate record found!";
    public static final String FILE_SIZE_ERROR = "File size must be 1 Mb or less";
    public static final String POLICY_EMPLOYEE_ERROR="Employees are required";
    public static final String DESIGNATION_ERROR="Designation is required";
    public static final String ROLES_ERROR="Roles are Required";
    public static final String SUCCESSFULLY_UPDATED="Insert Successfully";
    public static final String EXPENSE_BOOKING_DATE_ERROR="Please Select Expense Booking Date";
    public static final String CSO_SUBMIT_ERROR = "Request already submitted!";
    public static final String CSO_APPROVE_ERROR = "Request already approved!";

    public static final String CSO_TRAVEL_ERROR="Rate per Km Not Found";

    public static final String FLEXI_AUTHORIZATION = "You are not authorized to create Flexi report";
    public static final String NO_REGION_FOUND = "No region found!";
    public static final String NO_DEPARTMENT_FOUND = "No department found for this department Id";

    /*
    KEYWORDS
     */
    public static final Long DISTANCE_LIMIT = 300L;

    public static final Long PETTYCASH_MONEYREQUEST_AMOUNT =2500L;
    public static final String CSO_Travel_Amount="D_CSO_TRAVEL_AMOUNT";
    public static final Long FILE_SIZE = 1000000L;
    public static final Long LMS_VOUCHER_STATUS=-1L;
    public static final String APPROVAL_LIMIT_DOMAIN="D_EMS_MANAGER_APPROVAL_AMOUNT_LIMIT";
    public static final String CSO_EXPENSE_DATE_CHECK="D_EMS_CSO_REPORT_DATE";
    public static final String SUBORDINATE_REPORT_WEBSITE_LOOKUP_DOMAIN = "D_EMS_SUBORDINATE_EXPENSE_WEBSITE";
    public static final String CMD_Id="20002";
    public static final String AS = " as ";
    public static final String ON = " on ";
    public static final String ZERO = "0";
    public static final String ONE = "1";
    public static final String HR_TRAVEL="HR_TRAVEL";
    public static final String TEN = "10";
    public static final String FILE = "file";
    public static final String EXPENSE = "expense";
    public static final String PAGE_NUMBER = "pageNumber";
    public static final String PAGE_SIZE = "pageSize";
    public static final String FROM_DATE = "from";
    public static final String TO_DATE = "to";
    public static final String CategoryId = "categoryId";
    public static final String LMS_AccountKey = "lmsAccountKey";
    public static final String DesignationID = "designationId";
    public static final String DepartmentId = "departmentId";
    public static final String HR_REMARKS="HR has been";
    public static final String APPROVED="approved";
    public static final String CLOSED="closed";
    public static final String HOLD="hold";

    public static final String DELETE="delete";
    public static final String HrExcelStatusError=" Please check Excel Status. Status must be in [ APPROVED,CLOSED,HOLD,DELETE ]";
    public static final String Y = "Y";
    public static final String N = "N";
    public static final String PAID = "PAID";
    public static final String ACTIVE = "ACTIVE";
    public static final String INACTIVE = "INACTIVE";
    public static final String TWO_WHEELER = "2Wheeler";
    public static final String A = "A";
    public static final String FROM = " from ";
    public static final String BY = " by ";
    public static final String WITH = " with remarks: ";
    public static final String SEPARATOR = "/";
    public static final String UNDER_SCORE = "_";
    public static final String COMPANY_ID_NOT_FOUND ="CompanyId not found";
    public static final String DASH=" - ";
    public static final String REMAINING_PART = "&previousPage=MySubOrdinate";

    /*
    PARAMETERS
     */
    public static final String EXPENSE_DETAIL_ID = "expenseDetailId";
    public static final String SPEND_TYPE = "spendType";
    public static final String EXPENSE_ID = "expenseId";
    public static final String APPROVE_REJECT = "approveReject";
    public static final String EMP_ID = "empId";
    public static final String STATUS = "status";
    public static final String APPROVE_STATUS ="approveStatus";
    public static final String ID = "id";
    public static final String POLICY_NAME = "policyName";
    public static final String RM_ID = "rmId";
    public static final String POLICY_ID = "policyId";
    public static final String REIMBURSEMENT = "Reimbursement";
    public static final String RULE_ID = "ruleId";
    public static final String GSTIN = "gstin";
    public static final String REMARKS = "remarks";
    public static final String AccompanyId = "accompanyId";
    public static final String AMOUNT = "Amount";
    public static final String DPM_ID = "dpmId";
    public static final String EAM_ID = "eamId";
    public static final String DOC_ID = "docId";
    public static final String REPORT_ID = "reportId";
    public static final String MTID = "mtId";
    public static final String MANAGE_TRAVEL_REQUEST = "manageTravelRequest";
    public static final String LOOKUP_DOMAIN_TAX_PERCENTAGES = "D_EMS_TAX_PERCENTAGES";
    public static final String LOOKUP_DOMAIN_L1_APPROVED_LIMIT = "D_EMS_L1_APPROVAL_LIMIT";
    public static final String LOOKUP_DOMAIN_DISTANCE_LIMIT = "D_EMS_DISTANCE_TYPE";
    public static final  String FromImage="fromImage";
    public static final  String ToImage="toImage";
    public static final String WITH_RECEIPT = "withReceipt";

    public static final String LEVEL = "level";
    public static final String REGION_ID = "regionId";
    public static final String DEPARTMENT_ID = "departmentId";
    public static final String TYPE = "type";
    public static final String PETTY_CASH = "pettyCash";
    public static final String VENDOR_PAYMENTS = "vendorPayments";

    /*
    MANAGERS
     */
    public static final String L1 = "L1";
    public static final String L2 = "L2";
    public static final String L3 = "L3";
    public static final String L4 = "L4";
    public static final String L5 = "L5";
    public static final String L6 = "L6";
    public static final String HR = "HR";
    public static final String TEAM = "Team";

    /**
     * EMS STATEMENTS
     */
    public static final String CSO_REPORT_PURPOSE = "CSO Travel Claim";

    /**
     * EMPLOYEE LEAVE/REGULARIZATION RELATED MAIL TEMPLATE AND SUBJECT TO AVOID
     * SALARY DEDUCTION
     */

    /**
     * WEEKLY ATTENDANCE STATUS RELATED MAIL TEMPLATE AND SUBJECT SALARY DEDUCTION
     */
    public static final String STATUS_UPDATE = "Status Updated";
    public static final String BIRTHDAY_GROUP_EMAIL_SUBJECT = "Happy Birthday -";

    /*
    GOOGLE CLOUD CONSTANTS
     */
    public static final String PRIVATE_KEY = "private_key";
    public static final String CLIENT_EMAIL = "client_email";

    public static final String EXCOM="excom";

    /*
    BASE CONTROLLER CONSTANTS
     */
    public static final String CONTENT_DISPOSITION = "Content-Disposition";

    /*
    CONTROLLER CONSTANTS
     */
    public static final String CITIES_FETCHED = "Cities Fetched Successfully";
    public static final String EXPENSE_SAVED = "Expense Saved Successfully";
    public static final String EXPENSES_FETCHED = "Expenses Fetched Successfully";
    public static final String REPORTS_FETCHED = "Reports Fetched Successfully";
    public static final String MESSAGES_UPDATED = "Message Updated";
    public static final String POLICY_DELETED = "Policy Deleted";
    public static final String ROLE_DELETED = "Roles Deleted";
    public static final String Place = "place";
    public static final String Destination = "destinations";
    public static final String Origin = "origins";
    public static final String RECORD_DELETED = "Deleted";
    public static final String CSO_EXPENSE_ERROR="Please Submit Previous Expense";
    public static final String MOVE_REPORT_MESSAGE = " has moved this report to ";

    /*
    API CONSTANTS
     */
    public static final String REPORT_SCHEDULER="/reportScheduler";
    public static final String TRAVEL_EXPENSE_SCHEDULER="/travelExpenseScheduler";
    public static final String GET_POLICY_BY_POLICY_ID="/getPolicyByPolicyId";
    public static final String EmployeeDetails = "/getEmployeeDetails";
    public static final String GET_ALL_ACCOUNTS = "/getAllAccounts";
    public static final String GET_ALL_ACCOUNT = "/getAllAccount";
    public static final String GET_ALL_CITIES = "/getAllCities";
    public static final String GET_ALL_DESIGNATIONS = "/getAllDesignations";
    public static final String GET_ALL_DEPARTMENTS = "/getAllDepartments";
    public static final String GET_ALL_REGIONS = "/getAllRegions";
    public static final String GET_ALL_REGIONS_V2 = "/getAllRegions_v2";
    public static final String GET_GST_STATES = "/getGSTStates";
    public static final String GET_GST_SAC = "/getGSTSAC";
    public static final String IS_FLEXI_POLICY_APPLICABLE = "/isFlexiPolicyApplicable";
    public static final String EXPENSE_APPROVAL_MAPPING = "/expenseApprovalMapping";
    public static final String DOWNLOAD_PAYMENT_DETAILS = "/downloadPaymentDetails";
    public static final String UPDATE_PAYMENT_DETAILS = "/updatePaymentDetails";
    public static final String SAVE_EXPENSE_DETAIL = "/saveExpenseDetail";
    public static final String GET_ALL_EXPENSE = "/getAllExpense";
    public static final String DELETE_DOCUMENT = "/deleteDocument";
    public static final String DELETE_EXPENSE = "/deleteExpense";
    public static final String SAVE_EXPENSE_HEADER = "/saveExpenseHeader";
    public static final String GET_ALL_EXPENSE_BY_HEADER_ID = "/getAllExpenseByHeaderId";
    public static final String GET_HEADER_BY_EMP_ID = "/getHeaderByEmpId";
    public static final String GET_EXPENSES_FOR_MY_SUBORDINATE = "/getExpensesForMySubordinate";
    public static final String GET_EXPENSES_FOR_L5 = "/getExpensesForL5";
    public static final String API_HEADER_APPROVAL_REJECTION = "/headerApprovalRejection";
    public static final String MONEY_REQUEST = "/moneyRequest";
    public static final String GET_GST_PERCENTAGES = "/getGSTPercentages";
    public static final String PAYMENT_PROCESSING_BY_L5 = "/paymentProcessingByL5";
    public static final String GET_EXPENSES_FOR_FINANCE_TEAM = "/getExpensesForFinanceTeam";
    public static final String GET_CASH_ON_HAND_AMOUNT = "/getCashOnHandAmount";
    public static final String GET_ALL_POLICIES = "/getAllPolicies";
    public static final String GET_ALL_RULES_BY_POLICY_ID = "/getAllRulesByPolicyId";
    public static final String GET_POLICY_BY_NAME_SEARCH = "/getPolicyByNameSearch";
    public static final String SAVE_POLICY = "/savePolicy";
    public static final String GET_ALL_MESSAGES_BY_EXPENSE_ID = "/getAllMessagesByExpenseId";
    public static final String SAVE_MESSAGE_BY_EXPENSE_ID = "/saveMessageByExpenseId";
    public static final String UPDATE_MESSAGE = "/updateMessage";
    public static final String GET_RULE_BY_ID = "/getRuleById";
    public static final String SAVE_RULE = "/saveRule";
    public static final String SAVE_POLICY_RULES = "/savePolicyRules";
    public static final String UPDATE_STATUS = "/updateStatus";
    public static final String GET_SUPPLIER_BY_GSTIN = "/getSupplierByGSTIN";
    public static final String UPDATE_POLICY = "/updatePolicy";
    public static final String SAVE_CSO_EXPENSE = "/saveCsoExpense";
    public static final String CSO_REPORT_CAN_NOT_SAVED = "Please fill end reading for conveyance type expense to create report";
    public static final String APPROVE_REJECT_CSO = "/approveAndRejectCSO";
    public static final String GET_CSO="/getCso";

    public static final String SEARCH_APPROVAL_MAPPING_BY_LEVEL = "/searchApprovalMappingByLevel";
    public static final String GET_POLICY_WITH_RULE_BY_EXPENSE_ID = "/getPolicyWithRuleByExpenseId";
    public static final String GET_ALL_DEPTS = "/getAllDepts";
    public static final String APPROVE_SUCCESSFULLY="APPROVE SUCCESSFULLY";
    public static final String REJECT_SUCCESSFULLY="REJECT SUCCESSFULLY";
    public static final String RETRACT_SUCCESSFULLY ="RETRACT SUCCESSFULLY";
    public static final String GET_TRAVEL_EXPENSE_FOR_HR = "/getTravelExpenseForHR";
    public static final String UPLOAD_TRAVEL_EXPENSE_EXCEL_FOR_HR ="/uploadTravelExpenseExcel" ;
    public static final String MANAGER_ERROR ="reporting manager not found" ;
    public static final String REPORT_ERROR = "Report already submitted";
    public static final String REPORT_SUBMIT_ERROR = "Report can't be submit before 25th of the month";
    public static final String HR_EXCEL_STATUS_ERROR = "Status Error for This  ";
    public static final String HR_EXCEL_UPLOAD ="hrprocessedfilesfortravel" ;
    public static final String SPEND_TYPE_ERROR_ ="SpendType does not match" ;
    public static final String REPORT_NOT_FOUND = "Report Not Found";
    public static final String REPORT_NOT_FOUND_ERROR = "Report Not Found ";
    public static final String REPORT_ACTIVE_ERROR = "ActiveAndInactive Status Error";
    public static final String REPORT_STATUS_ERROR ="Report Status Not Match" ;
    public static final String MANAGERS_NOT_FOUND =" Managers Not Found" ;
    public static final String GET_EXPENSE_BY_TASK_ID ="/getExpenseDetailsByTaskId" ;
    public static final String TASK_ID ="taskId" ;

    public static final String SEARCH ="search" ;

    public static final String IS_PETTY_CASH = "isPettyCash";
    public static final String COMPLETED ="COMPLETED" ;
    public static final String DELETED="DELETED";
    public static final String MONTH = "month";
    public static final String HO_REGION ="00000" ;
    public static final String ENABLE_OR_DISABLE_REPORT = "D_EMS_ENABLE_CSO_REPORT";
    public static final String NOT_CREATE_REPORT = "Travel expense Claim is currently Unavailable. Please contact to HR";
    public static final String EMS_CONVEYANCE_MONTH = "D_EMS_CONVEYANCE_MONTH";
    public static final String DUPLICATE_REPORT = "Duplicate Report Found ";

    public static final String IS_FLEXI_APPLICABLE="Flexi";

    public static final String B="B";

    public static final String E="E";

    public static final String IS_PETTY_CASH_APPLICABLE ="PettyCash";
    public static final String POLICY_DESIGNATION_ERROR ="Designation Required!" ;
    public static final String PETTY_CASH_AUTHORIZATION ="You are not authorized to create PettyCash Report" ;
    public static final String LOOKUP_DOMAIN_MANAGE_TRAVEL = "D_EMS_MANAGE_TRAVEL_ROLE";
    public static final String SPEND_TYPE_ERROR_MESSAGE = "Spend Type Error";
    public static final String EXCOM_ERROR = "PettyCash report can't move to excom member";
    public static final String MOVE_REPORT_SUCCESS ="Report Moved Successfully" ;
    public static final String MOVE_REPORT_ERROR = "Report can only be moved L2 and L3";
    public static final String MONEY_REQUEST_PURPOSE ="Money Request" ;
    public static final String EDIT_PAYABLE_AMOUNT ="/editPayableAmount" ;
    public static final String REPORT_ID_NOT_FOUND ="ReportId not found" ;
    public static final String GET_PAYABLE_AMOUNT ="/getPayableAmount" ;
    public static final String COH_ERROR ="Payable Amount Should be greater than Zero" ;
    public static final String TRAVEL_EXPENSE_ERROR ="You are not eligible to create report" ;
    public static final String PENDING ="PENDING" ;

    public static final String REGIONAL_MANAGER_REF="D_EMS_FUNCTIONAL_TITLE_REGIONAL_MANAGER";
    public static final String PAYMENT_PROCESSED_ERROR = "Only Bank mode can be processed.Please click on action for change payment mode.";
    public static final String PETTY_CASH_ERROR = "PettyCash Report can not processed.Please click on action";
    public static final String PAYABLE_AMOUNT_ERROR = "Payable amount can't be greater than report amount";

    public static final String HR_AMOUNT_ERROR = "Updated amount can't be greater than report amount for this reportId= ";
    public static final String PAYABLE_AMOUNT_PROCESSED_MSG = "Payable Amount Processed Successfully";
    public static final String EXPENSE_DELETE_ERROR = "You can not delete expense after Approved by L1.";

    public static final String EXPENSE_DELETE_ERROR_MSG = "You can not delete expense after Voucher creation.";
    public static final String APPROVAL_CHAIN_ERROR = "Approval Chain Not Found";
    public static final String AMOUNT_ERROR = "Amount must be greater then Zero";
    public static final String ERROR_GET_L1_MANAGER ="L1 Manager Not Found" ;
    public static final String REPORT_MOVE_ERROR ="Report can't move for " ;
    public static final String GET_ALL_EMPLOYEE_FOR_EMS = "/getAllEmployeesForEMS";
    public static final String USER_ID_ERROR ="Please enter valid User" ;

    public static String Payment_Updated = "Payment_Updated";
    public static final String NO_POLICY_DEFINED_FOR_THIS_EXPENSE = "No policy defined for this expense";

    public static String LedgerAccount="23170020";
    public static final String DOT=".";
    public static String LedgerSubAccount="002009";
    public static final String CLOSE_REPORT = "/closeReport";
    public static final String DELETE_POLICY = "/deletePolicy";
    public static final String GET_ROLES_BY_POLICY_ID = "/getRolesByPolicyId";
    public static final String DELETE_ROLES_BY_POLICY_DESIGNATION_ID = "/deleteRolesByPolicyDesignationId";
    public static final String GET_SUBCATEGORY_WISE_AMOUNT = "/getSubCategoryWiseAmount";
    public static final String GET_RECENT_DOCUMENT_LIST = "/getRecentDocumentList";
    public static final String Check_RoleId_And_DesignationId = "Please Check RoleId And DesignationId";
    public static final String SUBSCRIBE_OR_UNSUBSCRIBE = "/updateEmailSubscription";
    public static final String GET_EMAIL_SUBSCRIPTION = "/getEmailSubscription";
    public static final String Search_BY_URL = "/searchByURL";
    public static final String DELETE_EXPENSE_APPROVAL_MAPPING = "/deleteExpenseApprovalMapping";
    public static final String GET_EXPENSE_APPROVAL_MAPPING = "/getExpenseApprovalMapping";
    public static final String GET_PROCESSED_PAYMENTS_FROM_DOC_ID = "/getProcessedPaymentsFromDocId";
    public static final String VIEW_REPORT_PDF = "/viewReportPDF";
    public static final String GET_SUBORDINATE_LIST = "/getSubordinateList";
    public static final String SAVE_MANAGE_TRAVEL = "/saveManageTravel";
    public static final String SEARCH_MANAGE_TRAVEL = "/searchManageTravel";
    public static final String DELETE_MANAGE_TRAVEL = "/deleteManageTravel";
    public static final String VIEW_REPORT_EXPENSES_EXCEL = "/viewReportExpensesExcel";
    public static final String UPDATE_APPROVAL_MAPPING_EMPLOYEE = "/updateApprovalMappingEmployee";
    public static final String Search_Google_Distance = "/searchByGoogleDistance";
    public static final String DOWNLOAD_EXPENSES_EXCEL = "/downloadExpensesExcel";
    public static final String URL_First = "https://maps.googleapis.com/maps/api/place/textsearch/json?query=";
    public static final String URL_End = "&key=AIzaSyCNVwqxmn-3SGotjMPU2i8OyNjlC_sAHLc";
    public static final String URL_1 = "https://maps.googleapis.com/maps/api/distancematrix/json?destinations=";
    public static final String URL_2 = "&origins=";
    public static final String URL_3 = "&key=AIzaSyCNVwqxmn-3SGotjMPU2i8OyNjlC_sAHLc";
    public static final String GET_BRANCH_DETAILS = "getBranchDetails";

    /*
    EMS
     */
    public static final String EMS = "/ems";

    /* GCP_Files */
    public static final String GCP_Expense_Files = "expensefiles";
    public static final String CSO_DOCUMENT = "csofiles";
    public static final String GCP_Payment_Files = "paymentfiles";

    /**
     * TEMPLATE NAMES
     */
    public static final String REPORT_SUBMISSION_TEMPLATE = "report_submission";
    public static final String REPORT_APPROVAL_TEMPLATE = "report_approval";
    public static final String REPORT_REJECTION_TEMPLATE = "report_rejection";
    public static final String PAYMENT_PROCESS_TEMPLATE = "payment_processed";
    public static final String REPORT_COMMENT_TEMPLATE = "comment_on_report";
    public static final String PAYMENT_NOT_PROCESS_TEMPLATE = "payment_not_processed";
    public static final String REPORT_DETAIL_TEMPLATE = "report_detail";
    public static final String SUBORDINATE_REPORTS_TEMPLATE = "subordinate_reports";
    public static final String MOVE_REPORT ="/moveReport";
}
