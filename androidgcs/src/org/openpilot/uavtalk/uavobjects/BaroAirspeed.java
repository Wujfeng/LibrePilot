/**
 ******************************************************************************
 *
 * @file       uavobjecttemplate.cpp
 * @author     The OpenPilot Team, http://www.openpilot.org Copyright (C) 2010.
 * @brief      Template for an uavobject in java
 *             This is a autogenerated file!! Do not modify and expect a result.
 *             The raw data from the dynamic pressure sensor with pressure, temperature and airspeed.
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
The raw data from the dynamic pressure sensor with pressure, temperature and airspeed.

generated from baroairspeed.xml
 **/
public class BaroAirspeed extends UAVDataObject {

	public BaroAirspeed() {
		super(OBJID, ISSINGLEINST, ISSETTINGS, NAME);
		
		List<UAVObjectField> fields = new ArrayList<UAVObjectField>();
		

		List<String> AirspeedElemNames = new ArrayList<String>();
		AirspeedElemNames.add("0");
		fields.add( new UAVObjectField("Airspeed", "m/s", UAVObjectField.FieldType.FLOAT32, AirspeedElemNames, null) );

		List<String> SensorValueElemNames = new ArrayList<String>();
		SensorValueElemNames.add("0");
		fields.add( new UAVObjectField("SensorValue", "raw", UAVObjectField.FieldType.UINT16, SensorValueElemNames, null) );

		List<String> ZeroPointElemNames = new ArrayList<String>();
		ZeroPointElemNames.add("0");
		fields.add( new UAVObjectField("ZeroPoint", "raw", UAVObjectField.FieldType.UINT16, ZeroPointElemNames, null) );

		List<String> ConnectedElemNames = new ArrayList<String>();
		ConnectedElemNames.add("0");
		List<String> ConnectedEnumOptions = new ArrayList<String>();
		ConnectedEnumOptions.add("False");
		ConnectedEnumOptions.add("True");
		fields.add( new UAVObjectField("Connected", "", UAVObjectField.FieldType.ENUM, ConnectedElemNames, ConnectedEnumOptions) );


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
		    0 << UAVOBJ_TELEMETRY_ACKED_SHIFT |
		    0 << UAVOBJ_GCS_TELEMETRY_ACKED_SHIFT |
		    UAVObject.Metadata.UpdateModeNum(UAVObject.UpdateMode.UPDATEMODE_PERIODIC) << UAVOBJ_TELEMETRY_UPDATE_MODE_SHIFT |
		    UAVObject.Metadata.UpdateModeNum(UAVObject.UpdateMode.UPDATEMODE_MANUAL) << UAVOBJ_GCS_TELEMETRY_UPDATE_MODE_SHIFT;
    	metadata.flightTelemetryUpdatePeriod = 1000;
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

	}

	/**
	 * Create a clone of this object, a new instance ID must be specified.
	 * Do not use this function directly to create new instances, the
	 * UAVObjectManager should be used instead.
	 */
	public UAVDataObject clone(long instID) {
		// TODO: Need to get specific instance to clone
		try {
			BaroAirspeed obj = new BaroAirspeed();
			obj.initialize(instID, this.getMetaObject());
			return obj;
		} catch  (Exception e) {
			return null;
		}
	}

	/**
	 * Static function to retrieve an instance of the object.
	 */
	public BaroAirspeed GetInstance(UAVObjectManager objMngr, long instID)
	{
	    return (BaroAirspeed)(objMngr.getObject(BaroAirspeed.OBJID, instID));
	}

	// Constants
	protected static final long OBJID = 0x169EA4A;
	protected static final String NAME = "BaroAirspeed";
	protected static String DESCRIPTION = "The raw data from the dynamic pressure sensor with pressure, temperature and airspeed.";
	protected static final boolean ISSINGLEINST = 1 > 0;
	protected static final boolean ISSETTINGS = 0 > 0;
	protected static int NUMBYTES = 0;


}
