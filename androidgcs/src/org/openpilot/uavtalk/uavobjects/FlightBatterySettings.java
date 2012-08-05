/**
 ******************************************************************************
 *
 * @file       uavobjecttemplate.cpp
 * @author     The OpenPilot Team, http://www.openpilot.org Copyright (C) 2010.
 * @brief      Template for an uavobject in java
 *             This is a autogenerated file!! Do not modify and expect a result.
 *             Flight Battery configuration.
 *
 * @see        The GNU Public License (GPL) Version 3
 *
 *****************************************************************************/
/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package org.openpilot.uavtalk.uavobjects;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.openpilot.uavtalk.UAVObjectManager;
import org.openpilot.uavtalk.UAVObject;
import org.openpilot.uavtalk.UAVDataObject;
import org.openpilot.uavtalk.UAVObjectField;

/**
Flight Battery configuration.

generated from flightbatterysettings.xml
 **/
public class FlightBatterySettings extends UAVDataObject {

	public FlightBatterySettings() {
		super(OBJID, ISSINGLEINST, ISSETTINGS, NAME);
		
		List<UAVObjectField> fields = new ArrayList<UAVObjectField>();
		

		List<String> CapacityElemNames = new ArrayList<String>();
		CapacityElemNames.add("0");
		fields.add( new UAVObjectField("Capacity", "mAh", UAVObjectField.FieldType.UINT32, CapacityElemNames, null) );

		List<String> VoltageThresholdsElemNames = new ArrayList<String>();
		VoltageThresholdsElemNames.add("Warning");
		VoltageThresholdsElemNames.add("Alarm");
		fields.add( new UAVObjectField("VoltageThresholds", "V", UAVObjectField.FieldType.FLOAT32, VoltageThresholdsElemNames, null) );

		List<String> SensorCalibrationsElemNames = new ArrayList<String>();
		SensorCalibrationsElemNames.add("VoltageFactor");
		SensorCalibrationsElemNames.add("CurrentFactor");
		fields.add( new UAVObjectField("SensorCalibrations", "", UAVObjectField.FieldType.FLOAT32, SensorCalibrationsElemNames, null) );

		List<String> TypeElemNames = new ArrayList<String>();
		TypeElemNames.add("0");
		List<String> TypeEnumOptions = new ArrayList<String>();
		TypeEnumOptions.add("LiPo");
		TypeEnumOptions.add("A123");
		TypeEnumOptions.add("LiCo");
		TypeEnumOptions.add("LiFeSO4");
		TypeEnumOptions.add("None");
		fields.add( new UAVObjectField("Type", "", UAVObjectField.FieldType.ENUM, TypeElemNames, TypeEnumOptions) );

		List<String> NbCellsElemNames = new ArrayList<String>();
		NbCellsElemNames.add("0");
		fields.add( new UAVObjectField("NbCells", "", UAVObjectField.FieldType.UINT8, NbCellsElemNames, null) );

		List<String> SensorTypeElemNames = new ArrayList<String>();
		SensorTypeElemNames.add("BatteryCurrent");
		SensorTypeElemNames.add("BatteryVoltage");
		SensorTypeElemNames.add("BoardVoltage");
		List<String> SensorTypeEnumOptions = new ArrayList<String>();
		SensorTypeEnumOptions.add("Disabled");
		SensorTypeEnumOptions.add("Enabled");
		fields.add( new UAVObjectField("SensorType", "", UAVObjectField.FieldType.ENUM, SensorTypeElemNames, SensorTypeEnumOptions) );


		// Compute the number of bytes for this object
		int numBytes = 0;
		ListIterator<UAVObjectField> li = fields.listIterator();
		while(li.hasNext()) {
			numBytes += li.next().getNumBytes();
		}
		NUMBYTES = numBytes;

		// Initialize object
		initializeFields(fields, ByteBuffer.allocate(NUMBYTES), NUMBYTES);
		// Set the default field values
		setDefaultFieldValues();
		// Set the object description
		setDescription(DESCRIPTION);
	}

	/**
	 * Create a Metadata object filled with default values for this object
	 * @return Metadata object with default values
	 */
	public Metadata getDefaultMetadata() {
		UAVObject.Metadata metadata = new UAVObject.Metadata();
    	metadata.flags =
		    UAVObject.Metadata.AccessModeNum(UAVObject.AccessMode.ACCESS_READWRITE) << UAVOBJ_ACCESS_SHIFT |
		    UAVObject.Metadata.AccessModeNum(UAVObject.AccessMode.ACCESS_READWRITE) << UAVOBJ_GCS_ACCESS_SHIFT |
		    1 << UAVOBJ_TELEMETRY_ACKED_SHIFT |
		    1 << UAVOBJ_GCS_TELEMETRY_ACKED_SHIFT |
		    UAVObject.Metadata.UpdateModeNum(UAVObject.UpdateMode.UPDATEMODE_ONCHANGE) << UAVOBJ_TELEMETRY_UPDATE_MODE_SHIFT |
		    UAVObject.Metadata.UpdateModeNum(UAVObject.UpdateMode.UPDATEMODE_ONCHANGE) << UAVOBJ_GCS_TELEMETRY_UPDATE_MODE_SHIFT;
    	metadata.flightTelemetryUpdatePeriod = 0;
    	metadata.gcsTelemetryUpdatePeriod = 0;
    	metadata.loggingUpdatePeriod = 0;
 
		return metadata;
	}

	/**
	 * Initialize object fields with the default values.
	 * If a default value is not specified the object fields
	 * will be initialized to zero.
	 */
	public void setDefaultFieldValues()
	{
		getField("Capacity").setValue(2200);
		getField("VoltageThresholds").setValue(9.8,0);
		getField("VoltageThresholds").setValue(9.2,1);
		getField("SensorCalibrations").setValue(1,0);
		getField("SensorCalibrations").setValue(1,1);
		getField("Type").setValue("LiPo");
		getField("NbCells").setValue(3);
		getField("SensorType").setValue("Disabled",0);
		getField("SensorType").setValue("Disabled",1);
		getField("SensorType").setValue("Disabled",2);

	}

	/**
	 * Create a clone of this object, a new instance ID must be specified.
	 * Do not use this function directly to create new instances, the
	 * UAVObjectManager should be used instead.
	 */
	public UAVDataObject clone(long instID) {
		// TODO: Need to get specific instance to clone
		try {
			FlightBatterySettings obj = new FlightBatterySettings();
			obj.initialize(instID, this.getMetaObject());
			return obj;
		} catch  (Exception e) {
			return null;
		}
	}

	/**
	 * Static function to retrieve an instance of the object.
	 */
	public FlightBatterySettings GetInstance(UAVObjectManager objMngr, long instID)
	{
	    return (FlightBatterySettings)(objMngr.getObject(FlightBatterySettings.OBJID, instID));
	}

	// Constants
	protected static final long OBJID = 0x94AC6AD2;
	protected static final String NAME = "FlightBatterySettings";
	protected static String DESCRIPTION = "Flight Battery configuration.";
	protected static final boolean ISSINGLEINST = 1 > 0;
	protected static final boolean ISSETTINGS = 1 > 0;
	protected static int NUMBYTES = 0;


}
