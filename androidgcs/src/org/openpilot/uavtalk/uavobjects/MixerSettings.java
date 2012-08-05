/**
 ******************************************************************************
 *
 * @file       uavobjecttemplate.cpp
 * @author     The OpenPilot Team, http://www.openpilot.org Copyright (C) 2010.
 * @brief      Template for an uavobject in java
 *             This is a autogenerated file!! Do not modify and expect a result.
 *             Settings for the @ref ActuatorModule that controls the channel assignments for the mixer based on AircraftType
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
Settings for the @ref ActuatorModule that controls the channel assignments for the mixer based on AircraftType

generated from mixersettings.xml
 **/
public class MixerSettings extends UAVDataObject {

	public MixerSettings() {
		super(OBJID, ISSINGLEINST, ISSETTINGS, NAME);
		
		List<UAVObjectField> fields = new ArrayList<UAVObjectField>();
		

		List<String> MaxAccelElemNames = new ArrayList<String>();
		MaxAccelElemNames.add("0");
		fields.add( new UAVObjectField("MaxAccel", "units/sec", UAVObjectField.FieldType.FLOAT32, MaxAccelElemNames, null) );

		List<String> FeedForwardElemNames = new ArrayList<String>();
		FeedForwardElemNames.add("0");
		fields.add( new UAVObjectField("FeedForward", "", UAVObjectField.FieldType.FLOAT32, FeedForwardElemNames, null) );

		List<String> AccelTimeElemNames = new ArrayList<String>();
		AccelTimeElemNames.add("0");
		fields.add( new UAVObjectField("AccelTime", "ms", UAVObjectField.FieldType.FLOAT32, AccelTimeElemNames, null) );

		List<String> DecelTimeElemNames = new ArrayList<String>();
		DecelTimeElemNames.add("0");
		fields.add( new UAVObjectField("DecelTime", "ms", UAVObjectField.FieldType.FLOAT32, DecelTimeElemNames, null) );

		List<String> ThrottleCurve1ElemNames = new ArrayList<String>();
		ThrottleCurve1ElemNames.add("0");
		ThrottleCurve1ElemNames.add("25");
		ThrottleCurve1ElemNames.add("50");
		ThrottleCurve1ElemNames.add("75");
		ThrottleCurve1ElemNames.add("100");
		fields.add( new UAVObjectField("ThrottleCurve1", "percent", UAVObjectField.FieldType.FLOAT32, ThrottleCurve1ElemNames, null) );

		List<String> ThrottleCurve2ElemNames = new ArrayList<String>();
		ThrottleCurve2ElemNames.add("0");
		ThrottleCurve2ElemNames.add("25");
		ThrottleCurve2ElemNames.add("50");
		ThrottleCurve2ElemNames.add("75");
		ThrottleCurve2ElemNames.add("100");
		fields.add( new UAVObjectField("ThrottleCurve2", "percent", UAVObjectField.FieldType.FLOAT32, ThrottleCurve2ElemNames, null) );

		List<String> Curve2SourceElemNames = new ArrayList<String>();
		Curve2SourceElemNames.add("0");
		List<String> Curve2SourceEnumOptions = new ArrayList<String>();
		Curve2SourceEnumOptions.add("Throttle");
		Curve2SourceEnumOptions.add("Roll");
		Curve2SourceEnumOptions.add("Pitch");
		Curve2SourceEnumOptions.add("Yaw");
		Curve2SourceEnumOptions.add("Collective");
		Curve2SourceEnumOptions.add("Accessory0");
		Curve2SourceEnumOptions.add("Accessory1");
		Curve2SourceEnumOptions.add("Accessory2");
		Curve2SourceEnumOptions.add("Accessory3");
		Curve2SourceEnumOptions.add("Accessory4");
		Curve2SourceEnumOptions.add("Accessory5");
		fields.add( new UAVObjectField("Curve2Source", "", UAVObjectField.FieldType.ENUM, Curve2SourceElemNames, Curve2SourceEnumOptions) );

		List<String> Mixer1TypeElemNames = new ArrayList<String>();
		Mixer1TypeElemNames.add("0");
		List<String> Mixer1TypeEnumOptions = new ArrayList<String>();
		Mixer1TypeEnumOptions.add("Disabled");
		Mixer1TypeEnumOptions.add("Motor");
		Mixer1TypeEnumOptions.add("Servo");
		Mixer1TypeEnumOptions.add("CameraRoll");
		Mixer1TypeEnumOptions.add("CameraPitch");
		Mixer1TypeEnumOptions.add("CameraYaw");
		Mixer1TypeEnumOptions.add("Accessory0");
		Mixer1TypeEnumOptions.add("Accessory1");
		Mixer1TypeEnumOptions.add("Accessory2");
		Mixer1TypeEnumOptions.add("Accessory3");
		Mixer1TypeEnumOptions.add("Accessory4");
		Mixer1TypeEnumOptions.add("Accessory5");
		fields.add( new UAVObjectField("Mixer1Type", "", UAVObjectField.FieldType.ENUM, Mixer1TypeElemNames, Mixer1TypeEnumOptions) );

		List<String> Mixer1VectorElemNames = new ArrayList<String>();
		Mixer1VectorElemNames.add("ThrottleCurve1");
		Mixer1VectorElemNames.add("ThrottleCurve2");
		Mixer1VectorElemNames.add("Roll");
		Mixer1VectorElemNames.add("Pitch");
		Mixer1VectorElemNames.add("Yaw");
		fields.add( new UAVObjectField("Mixer1Vector", "", UAVObjectField.FieldType.INT8, Mixer1VectorElemNames, null) );

		List<String> Mixer2TypeElemNames = new ArrayList<String>();
		Mixer2TypeElemNames.add("0");
		List<String> Mixer2TypeEnumOptions = new ArrayList<String>();
		Mixer2TypeEnumOptions.add("Disabled");
		Mixer2TypeEnumOptions.add("Motor");
		Mixer2TypeEnumOptions.add("Servo");
		Mixer2TypeEnumOptions.add("CameraRoll");
		Mixer2TypeEnumOptions.add("CameraPitch");
		Mixer2TypeEnumOptions.add("CameraYaw");
		Mixer2TypeEnumOptions.add("Accessory0");
		Mixer2TypeEnumOptions.add("Accessory1");
		Mixer2TypeEnumOptions.add("Accessory2");
		Mixer2TypeEnumOptions.add("Accessory3");
		Mixer2TypeEnumOptions.add("Accessory4");
		Mixer2TypeEnumOptions.add("Accessory5");
		fields.add( new UAVObjectField("Mixer2Type", "", UAVObjectField.FieldType.ENUM, Mixer2TypeElemNames, Mixer2TypeEnumOptions) );

		List<String> Mixer2VectorElemNames = new ArrayList<String>();
		Mixer2VectorElemNames.add("ThrottleCurve1");
		Mixer2VectorElemNames.add("ThrottleCurve2");
		Mixer2VectorElemNames.add("Roll");
		Mixer2VectorElemNames.add("Pitch");
		Mixer2VectorElemNames.add("Yaw");
		fields.add( new UAVObjectField("Mixer2Vector", "", UAVObjectField.FieldType.INT8, Mixer2VectorElemNames, null) );

		List<String> Mixer3TypeElemNames = new ArrayList<String>();
		Mixer3TypeElemNames.add("0");
		List<String> Mixer3TypeEnumOptions = new ArrayList<String>();
		Mixer3TypeEnumOptions.add("Disabled");
		Mixer3TypeEnumOptions.add("Motor");
		Mixer3TypeEnumOptions.add("Servo");
		Mixer3TypeEnumOptions.add("CameraRoll");
		Mixer3TypeEnumOptions.add("CameraPitch");
		Mixer3TypeEnumOptions.add("CameraYaw");
		Mixer3TypeEnumOptions.add("Accessory0");
		Mixer3TypeEnumOptions.add("Accessory1");
		Mixer3TypeEnumOptions.add("Accessory2");
		Mixer3TypeEnumOptions.add("Accessory3");
		Mixer3TypeEnumOptions.add("Accessory4");
		Mixer3TypeEnumOptions.add("Accessory5");
		fields.add( new UAVObjectField("Mixer3Type", "", UAVObjectField.FieldType.ENUM, Mixer3TypeElemNames, Mixer3TypeEnumOptions) );

		List<String> Mixer3VectorElemNames = new ArrayList<String>();
		Mixer3VectorElemNames.add("ThrottleCurve1");
		Mixer3VectorElemNames.add("ThrottleCurve2");
		Mixer3VectorElemNames.add("Roll");
		Mixer3VectorElemNames.add("Pitch");
		Mixer3VectorElemNames.add("Yaw");
		fields.add( new UAVObjectField("Mixer3Vector", "", UAVObjectField.FieldType.INT8, Mixer3VectorElemNames, null) );

		List<String> Mixer4TypeElemNames = new ArrayList<String>();
		Mixer4TypeElemNames.add("0");
		List<String> Mixer4TypeEnumOptions = new ArrayList<String>();
		Mixer4TypeEnumOptions.add("Disabled");
		Mixer4TypeEnumOptions.add("Motor");
		Mixer4TypeEnumOptions.add("Servo");
		Mixer4TypeEnumOptions.add("CameraRoll");
		Mixer4TypeEnumOptions.add("CameraPitch");
		Mixer4TypeEnumOptions.add("CameraYaw");
		Mixer4TypeEnumOptions.add("Accessory0");
		Mixer4TypeEnumOptions.add("Accessory1");
		Mixer4TypeEnumOptions.add("Accessory2");
		Mixer4TypeEnumOptions.add("Accessory3");
		Mixer4TypeEnumOptions.add("Accessory4");
		Mixer4TypeEnumOptions.add("Accessory5");
		fields.add( new UAVObjectField("Mixer4Type", "", UAVObjectField.FieldType.ENUM, Mixer4TypeElemNames, Mixer4TypeEnumOptions) );

		List<String> Mixer4VectorElemNames = new ArrayList<String>();
		Mixer4VectorElemNames.add("ThrottleCurve1");
		Mixer4VectorElemNames.add("ThrottleCurve2");
		Mixer4VectorElemNames.add("Roll");
		Mixer4VectorElemNames.add("Pitch");
		Mixer4VectorElemNames.add("Yaw");
		fields.add( new UAVObjectField("Mixer4Vector", "", UAVObjectField.FieldType.INT8, Mixer4VectorElemNames, null) );

		List<String> Mixer5TypeElemNames = new ArrayList<String>();
		Mixer5TypeElemNames.add("0");
		List<String> Mixer5TypeEnumOptions = new ArrayList<String>();
		Mixer5TypeEnumOptions.add("Disabled");
		Mixer5TypeEnumOptions.add("Motor");
		Mixer5TypeEnumOptions.add("Servo");
		Mixer5TypeEnumOptions.add("CameraRoll");
		Mixer5TypeEnumOptions.add("CameraPitch");
		Mixer5TypeEnumOptions.add("CameraYaw");
		Mixer5TypeEnumOptions.add("Accessory0");
		Mixer5TypeEnumOptions.add("Accessory1");
		Mixer5TypeEnumOptions.add("Accessory2");
		Mixer5TypeEnumOptions.add("Accessory3");
		Mixer5TypeEnumOptions.add("Accessory4");
		Mixer5TypeEnumOptions.add("Accessory5");
		fields.add( new UAVObjectField("Mixer5Type", "", UAVObjectField.FieldType.ENUM, Mixer5TypeElemNames, Mixer5TypeEnumOptions) );

		List<String> Mixer5VectorElemNames = new ArrayList<String>();
		Mixer5VectorElemNames.add("ThrottleCurve1");
		Mixer5VectorElemNames.add("ThrottleCurve2");
		Mixer5VectorElemNames.add("Roll");
		Mixer5VectorElemNames.add("Pitch");
		Mixer5VectorElemNames.add("Yaw");
		fields.add( new UAVObjectField("Mixer5Vector", "", UAVObjectField.FieldType.INT8, Mixer5VectorElemNames, null) );

		List<String> Mixer6TypeElemNames = new ArrayList<String>();
		Mixer6TypeElemNames.add("0");
		List<String> Mixer6TypeEnumOptions = new ArrayList<String>();
		Mixer6TypeEnumOptions.add("Disabled");
		Mixer6TypeEnumOptions.add("Motor");
		Mixer6TypeEnumOptions.add("Servo");
		Mixer6TypeEnumOptions.add("CameraRoll");
		Mixer6TypeEnumOptions.add("CameraPitch");
		Mixer6TypeEnumOptions.add("CameraYaw");
		Mixer6TypeEnumOptions.add("Accessory0");
		Mixer6TypeEnumOptions.add("Accessory1");
		Mixer6TypeEnumOptions.add("Accessory2");
		Mixer6TypeEnumOptions.add("Accessory3");
		Mixer6TypeEnumOptions.add("Accessory4");
		Mixer6TypeEnumOptions.add("Accessory5");
		fields.add( new UAVObjectField("Mixer6Type", "", UAVObjectField.FieldType.ENUM, Mixer6TypeElemNames, Mixer6TypeEnumOptions) );

		List<String> Mixer6VectorElemNames = new ArrayList<String>();
		Mixer6VectorElemNames.add("ThrottleCurve1");
		Mixer6VectorElemNames.add("ThrottleCurve2");
		Mixer6VectorElemNames.add("Roll");
		Mixer6VectorElemNames.add("Pitch");
		Mixer6VectorElemNames.add("Yaw");
		fields.add( new UAVObjectField("Mixer6Vector", "", UAVObjectField.FieldType.INT8, Mixer6VectorElemNames, null) );

		List<String> Mixer7TypeElemNames = new ArrayList<String>();
		Mixer7TypeElemNames.add("0");
		List<String> Mixer7TypeEnumOptions = new ArrayList<String>();
		Mixer7TypeEnumOptions.add("Disabled");
		Mixer7TypeEnumOptions.add("Motor");
		Mixer7TypeEnumOptions.add("Servo");
		Mixer7TypeEnumOptions.add("CameraRoll");
		Mixer7TypeEnumOptions.add("CameraPitch");
		Mixer7TypeEnumOptions.add("CameraYaw");
		Mixer7TypeEnumOptions.add("Accessory0");
		Mixer7TypeEnumOptions.add("Accessory1");
		Mixer7TypeEnumOptions.add("Accessory2");
		Mixer7TypeEnumOptions.add("Accessory3");
		Mixer7TypeEnumOptions.add("Accessory4");
		Mixer7TypeEnumOptions.add("Accessory5");
		fields.add( new UAVObjectField("Mixer7Type", "", UAVObjectField.FieldType.ENUM, Mixer7TypeElemNames, Mixer7TypeEnumOptions) );

		List<String> Mixer7VectorElemNames = new ArrayList<String>();
		Mixer7VectorElemNames.add("ThrottleCurve1");
		Mixer7VectorElemNames.add("ThrottleCurve2");
		Mixer7VectorElemNames.add("Roll");
		Mixer7VectorElemNames.add("Pitch");
		Mixer7VectorElemNames.add("Yaw");
		fields.add( new UAVObjectField("Mixer7Vector", "", UAVObjectField.FieldType.INT8, Mixer7VectorElemNames, null) );

		List<String> Mixer8TypeElemNames = new ArrayList<String>();
		Mixer8TypeElemNames.add("0");
		List<String> Mixer8TypeEnumOptions = new ArrayList<String>();
		Mixer8TypeEnumOptions.add("Disabled");
		Mixer8TypeEnumOptions.add("Motor");
		Mixer8TypeEnumOptions.add("Servo");
		Mixer8TypeEnumOptions.add("CameraRoll");
		Mixer8TypeEnumOptions.add("CameraPitch");
		Mixer8TypeEnumOptions.add("CameraYaw");
		Mixer8TypeEnumOptions.add("Accessory0");
		Mixer8TypeEnumOptions.add("Accessory1");
		Mixer8TypeEnumOptions.add("Accessory2");
		Mixer8TypeEnumOptions.add("Accessory3");
		Mixer8TypeEnumOptions.add("Accessory4");
		Mixer8TypeEnumOptions.add("Accessory5");
		fields.add( new UAVObjectField("Mixer8Type", "", UAVObjectField.FieldType.ENUM, Mixer8TypeElemNames, Mixer8TypeEnumOptions) );

		List<String> Mixer8VectorElemNames = new ArrayList<String>();
		Mixer8VectorElemNames.add("ThrottleCurve1");
		Mixer8VectorElemNames.add("ThrottleCurve2");
		Mixer8VectorElemNames.add("Roll");
		Mixer8VectorElemNames.add("Pitch");
		Mixer8VectorElemNames.add("Yaw");
		fields.add( new UAVObjectField("Mixer8Vector", "", UAVObjectField.FieldType.INT8, Mixer8VectorElemNames, null) );

		List<String> Mixer9TypeElemNames = new ArrayList<String>();
		Mixer9TypeElemNames.add("0");
		List<String> Mixer9TypeEnumOptions = new ArrayList<String>();
		Mixer9TypeEnumOptions.add("Disabled");
		Mixer9TypeEnumOptions.add("Motor");
		Mixer9TypeEnumOptions.add("Servo");
		Mixer9TypeEnumOptions.add("CameraRoll");
		Mixer9TypeEnumOptions.add("CameraPitch");
		Mixer9TypeEnumOptions.add("CameraYaw");
		Mixer9TypeEnumOptions.add("Accessory0");
		Mixer9TypeEnumOptions.add("Accessory1");
		Mixer9TypeEnumOptions.add("Accessory2");
		Mixer9TypeEnumOptions.add("Accessory3");
		Mixer9TypeEnumOptions.add("Accessory4");
		Mixer9TypeEnumOptions.add("Accessory5");
		fields.add( new UAVObjectField("Mixer9Type", "", UAVObjectField.FieldType.ENUM, Mixer9TypeElemNames, Mixer9TypeEnumOptions) );

		List<String> Mixer9VectorElemNames = new ArrayList<String>();
		Mixer9VectorElemNames.add("ThrottleCurve1");
		Mixer9VectorElemNames.add("ThrottleCurve2");
		Mixer9VectorElemNames.add("Roll");
		Mixer9VectorElemNames.add("Pitch");
		Mixer9VectorElemNames.add("Yaw");
		fields.add( new UAVObjectField("Mixer9Vector", "", UAVObjectField.FieldType.INT8, Mixer9VectorElemNames, null) );

		List<String> Mixer10TypeElemNames = new ArrayList<String>();
		Mixer10TypeElemNames.add("0");
		List<String> Mixer10TypeEnumOptions = new ArrayList<String>();
		Mixer10TypeEnumOptions.add("Disabled");
		Mixer10TypeEnumOptions.add("Motor");
		Mixer10TypeEnumOptions.add("Servo");
		Mixer10TypeEnumOptions.add("CameraRoll");
		Mixer10TypeEnumOptions.add("CameraPitch");
		Mixer10TypeEnumOptions.add("CameraYaw");
		Mixer10TypeEnumOptions.add("Accessory0");
		Mixer10TypeEnumOptions.add("Accessory1");
		Mixer10TypeEnumOptions.add("Accessory2");
		Mixer10TypeEnumOptions.add("Accessory3");
		Mixer10TypeEnumOptions.add("Accessory4");
		Mixer10TypeEnumOptions.add("Accessory5");
		fields.add( new UAVObjectField("Mixer10Type", "", UAVObjectField.FieldType.ENUM, Mixer10TypeElemNames, Mixer10TypeEnumOptions) );

		List<String> Mixer10VectorElemNames = new ArrayList<String>();
		Mixer10VectorElemNames.add("ThrottleCurve1");
		Mixer10VectorElemNames.add("ThrottleCurve2");
		Mixer10VectorElemNames.add("Roll");
		Mixer10VectorElemNames.add("Pitch");
		Mixer10VectorElemNames.add("Yaw");
		fields.add( new UAVObjectField("Mixer10Vector", "", UAVObjectField.FieldType.INT8, Mixer10VectorElemNames, null) );


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
		getField("MaxAccel").setValue(1000);
		getField("FeedForward").setValue(0);
		getField("AccelTime").setValue(0);
		getField("DecelTime").setValue(0);
		getField("ThrottleCurve1").setValue(0,0);
		getField("ThrottleCurve1").setValue(0,1);
		getField("ThrottleCurve1").setValue(0,2);
		getField("ThrottleCurve1").setValue(0,3);
		getField("ThrottleCurve1").setValue(0,4);
		getField("ThrottleCurve2").setValue(0,0);
		getField("ThrottleCurve2").setValue(0.25,1);
		getField("ThrottleCurve2").setValue(0.5,2);
		getField("ThrottleCurve2").setValue(0.75,3);
		getField("ThrottleCurve2").setValue(1,4);
		getField("Curve2Source").setValue("Throttle");
		getField("Mixer1Type").setValue("Disabled");
		getField("Mixer1Vector").setValue(0,0);
		getField("Mixer1Vector").setValue(0,1);
		getField("Mixer1Vector").setValue(0,2);
		getField("Mixer1Vector").setValue(0,3);
		getField("Mixer1Vector").setValue(0,4);
		getField("Mixer2Type").setValue("Disabled");
		getField("Mixer2Vector").setValue(0,0);
		getField("Mixer2Vector").setValue(0,1);
		getField("Mixer2Vector").setValue(0,2);
		getField("Mixer2Vector").setValue(0,3);
		getField("Mixer2Vector").setValue(0,4);
		getField("Mixer3Type").setValue("Disabled");
		getField("Mixer3Vector").setValue(0,0);
		getField("Mixer3Vector").setValue(0,1);
		getField("Mixer3Vector").setValue(0,2);
		getField("Mixer3Vector").setValue(0,3);
		getField("Mixer3Vector").setValue(0,4);
		getField("Mixer4Type").setValue("Disabled");
		getField("Mixer4Vector").setValue(0,0);
		getField("Mixer4Vector").setValue(0,1);
		getField("Mixer4Vector").setValue(0,2);
		getField("Mixer4Vector").setValue(0,3);
		getField("Mixer4Vector").setValue(0,4);
		getField("Mixer5Type").setValue("Disabled");
		getField("Mixer5Vector").setValue(0,0);
		getField("Mixer5Vector").setValue(0,1);
		getField("Mixer5Vector").setValue(0,2);
		getField("Mixer5Vector").setValue(0,3);
		getField("Mixer5Vector").setValue(0,4);
		getField("Mixer6Type").setValue("Disabled");
		getField("Mixer6Vector").setValue(0,0);
		getField("Mixer6Vector").setValue(0,1);
		getField("Mixer6Vector").setValue(0,2);
		getField("Mixer6Vector").setValue(0,3);
		getField("Mixer6Vector").setValue(0,4);
		getField("Mixer7Type").setValue("Disabled");
		getField("Mixer7Vector").setValue(0,0);
		getField("Mixer7Vector").setValue(0,1);
		getField("Mixer7Vector").setValue(0,2);
		getField("Mixer7Vector").setValue(0,3);
		getField("Mixer7Vector").setValue(0,4);
		getField("Mixer8Type").setValue("Disabled");
		getField("Mixer8Vector").setValue(0,0);
		getField("Mixer8Vector").setValue(0,1);
		getField("Mixer8Vector").setValue(0,2);
		getField("Mixer8Vector").setValue(0,3);
		getField("Mixer8Vector").setValue(0,4);
		getField("Mixer9Type").setValue("Disabled");
		getField("Mixer9Vector").setValue(0,0);
		getField("Mixer9Vector").setValue(0,1);
		getField("Mixer9Vector").setValue(0,2);
		getField("Mixer9Vector").setValue(0,3);
		getField("Mixer9Vector").setValue(0,4);
		getField("Mixer10Type").setValue("Disabled");
		getField("Mixer10Vector").setValue(0,0);
		getField("Mixer10Vector").setValue(0,1);
		getField("Mixer10Vector").setValue(0,2);
		getField("Mixer10Vector").setValue(0,3);
		getField("Mixer10Vector").setValue(0,4);

	}

	/**
	 * Create a clone of this object, a new instance ID must be specified.
	 * Do not use this function directly to create new instances, the
	 * UAVObjectManager should be used instead.
	 */
	public UAVDataObject clone(long instID) {
		// TODO: Need to get specific instance to clone
		try {
			MixerSettings obj = new MixerSettings();
			obj.initialize(instID, this.getMetaObject());
			return obj;
		} catch  (Exception e) {
			return null;
		}
	}

	/**
	 * Static function to retrieve an instance of the object.
	 */
	public MixerSettings GetInstance(UAVObjectManager objMngr, long instID)
	{
	    return (MixerSettings)(objMngr.getObject(MixerSettings.OBJID, instID));
	}

	// Constants
	protected static final long OBJID = 0x5D16D6C4;
	protected static final String NAME = "MixerSettings";
	protected static String DESCRIPTION = "Settings for the @ref ActuatorModule that controls the channel assignments for the mixer based on AircraftType";
	protected static final boolean ISSINGLEINST = 1 > 0;
	protected static final boolean ISSETTINGS = 1 > 0;
	protected static int NUMBYTES = 0;


}
