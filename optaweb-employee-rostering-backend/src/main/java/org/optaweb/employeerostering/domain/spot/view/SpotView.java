/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
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

package org.optaweb.employeerostering.domain.spot.view;

import java.util.Set;

import org.optaweb.employeerostering.domain.common.AbstractPersistable;
import org.optaweb.employeerostering.domain.skill.Skill;

public class SpotView extends AbstractPersistable {

    private String name;

    private Set<Skill> requiredSkillSet;

    private Boolean heavyDuty;

    @SuppressWarnings("unused")
    public SpotView() {
    }

    public SpotView(Integer tenantId, String name, Set<Skill> requiredSkillSet, Boolean heavyDuty) {
        super(tenantId);
        this.name = name;
        this.requiredSkillSet = requiredSkillSet;
        this.heavyDuty = heavyDuty;
    }

    @Override
    public String toString() {
        return name;
    }

    // ************************************************************************
    // Simple getters and setters
    // ************************************************************************

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Skill> getRequiredSkillSet() {
        return requiredSkillSet;
    }

    public void setRequiredSkillSet(Set<Skill> requiredSkillSet) {
        this.requiredSkillSet = requiredSkillSet;
    }

    public Boolean getHeavyDuty () { return heavyDuty; }
}
