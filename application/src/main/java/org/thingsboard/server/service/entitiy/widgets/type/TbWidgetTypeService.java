/**
 * Copyright © 2016-2024 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.service.entitiy.widgets.type;

import org.thingsboard.server.common.data.User;
import org.thingsboard.server.common.data.exception.ThingsboardException;
import org.thingsboard.server.common.data.id.TenantId;
import org.thingsboard.server.common.data.id.WidgetsBundleId;
import org.thingsboard.server.common.data.widget.WidgetExportData;
import org.thingsboard.server.common.data.widget.WidgetTypeDetails;
import org.thingsboard.server.common.data.widget.WidgetsExportData;
import org.thingsboard.server.service.entitiy.SimpleTbEntityService;
import org.thingsboard.server.service.security.model.SecurityUser;

import java.util.List;

public interface TbWidgetTypeService extends SimpleTbEntityService<WidgetTypeDetails> {

    WidgetTypeDetails save(WidgetTypeDetails widgetTypeDetails, boolean updateExistingByFqn, User user) throws Exception;

    WidgetExportData exportWidgetType(TenantId tenantId, WidgetTypeDetails widgetTypeDetails, SecurityUser user) throws ThingsboardException;

    WidgetsExportData exportBundleWidgetTypes(TenantId tenantId, WidgetsBundleId bundleId, SecurityUser user) throws ThingsboardException;

    WidgetTypeDetails importWidgetType(WidgetExportData exportData, SecurityUser user) throws Exception;

    List<WidgetTypeDetails> importWidgetTypes(WidgetsExportData exportData, SecurityUser user) throws Exception;

}
