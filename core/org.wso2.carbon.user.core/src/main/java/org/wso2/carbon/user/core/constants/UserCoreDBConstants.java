/*
 *  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.user.core.constants;

public class UserCoreDBConstants {

    public static final String CASCADE_DELETE_ENABLED = "isCascadeDeleteEnabled";
    public static final String SQL_STATEMENT_PARAMETER_PLACEHOLDER = "?";
    public static final String CASE_INSENSITIVE_SQL_STATEMENT_PARAMETER_PLACEHOLDER = "LOWER(?)";

    public static final String IS_EXISTING_ROLE_PERMISSION_MAPPING =
            "SELECT UM_ID, UM_IS_ALLOWED FROM UM_ROLE_PERMISSION WHERE UM_ROLE_NAME=? " +
                    "AND UM_PERMISSION_ID = (SELECT UM_ID FROM UM_PERMISSION WHERE UM_RESOURCE_ID = ? AND UM_ACTION = ? AND " +
                    "UM_TENANT_ID=?) AND UM_TENANT_ID=? AND UM_DOMAIN_ID=(SELECT UM_DOMAIN_ID FROM UM_DOMAIN WHERE " +
                    "UM_TENANT_ID=? AND UM_DOMAIN_NAME=?)";

    public static final String IS_EXISTING_USER_PERMISSION_MAPPING =
            "SELECT UM_ID, UM_IS_ALLOWED FROM UM_USER_PERMISSION WHERE UM_USER_NAME=? " +
                    "AND UM_PERMISSION_ID = (SELECT UM_ID FROM UM_PERMISSION WHERE UM_RESOURCE_ID = ? AND UM_ACTION = ? AND " +
                    "UM_TENANT_ID=?) AND UM_TENANT_ID=?";
}
