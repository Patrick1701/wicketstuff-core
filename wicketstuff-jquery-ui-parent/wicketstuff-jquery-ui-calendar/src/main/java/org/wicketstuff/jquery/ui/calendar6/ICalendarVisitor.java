/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wicketstuff.jquery.ui.calendar6;


/**
 * Provides the ability for a {@link CalendarEvent} to be visited by a {@link CalendarModel}, after events have been retrieved by the {@link CalendarModelBehavior} (after {@link CalendarModel#load()}) <br>
 * A typical use is to set the css class-name ({@link CalendarEvent#setClassName(String)}) depending on another property.
 *
 * @author Sebastien Briquet - sebfz1
 *
 */
public interface ICalendarVisitor
{
	/**
	 * Visits the {@link CalendarEvent}
	 *
	 * @param event the {@link CalendarEvent}
	 */
	void visit(CalendarEvent event);
}
