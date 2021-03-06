package com.gi.giengine.map;

import java.io.File;
import java.io.Serializable;
import java.net.URL;
import java.util.HashMap;

import org.geotools.arcsde.ArcSDEDataStoreFactory;
import org.geotools.coverage.grid.io.AbstractGridCoverage2DReader;
import org.geotools.coverage.grid.io.AbstractGridFormat;
import org.geotools.coverage.grid.io.GridFormatFinder;
import org.geotools.data.DataStore;
import org.geotools.data.DataStoreFinder;
import org.geotools.data.FeatureSource;
import org.geotools.data.mysql.MySQLDataStoreFactory;
import org.geotools.data.oracle.OracleDataStoreFactory;
import org.geotools.data.postgis.PostgisDataStoreFactory;
import org.geotools.data.wfs.WFSDataStoreFactory;
import org.geotools.map.DefaultMapLayer;
import org.geotools.map.FeatureSourceMapLayer;
import org.geotools.map.MapLayer;
import org.geotools.styling.Style;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;

public class DataSourceEngine {

	public static DataStore getDataStoreFromFile(File file) throws Exception{
		// Vector
		HashMap<String, Serializable> params = new HashMap<String, Serializable>();
		params.put("url", file.toURI().toURL());
		DataStore ds = DataStoreFinder.getDataStore(params);
		return ds;
	}

	public static AbstractGridCoverage2DReader getGridCoverage2DReaderFromFile(File file) throws Exception{
		// Raster
		AbstractGridFormat format = GridFormatFinder.findFormat(file);
		AbstractGridCoverage2DReader reader = format.getReader(file);
		return reader;
	}	

	public static DataStore getDataStoreFromWFS(String url) throws Exception {
		String getCapabilities = url;
		if (url.contains("?")) {
			getCapabilities += "&request=GetCapabilities";
		} else {
			getCapabilities += "?request=GetCapabilities";
		}
		URL endPoint = new URL(getCapabilities);
		HashMap<String, Serializable> params = new HashMap<String, Serializable>();
		params.put(WFSDataStoreFactory.URL.key, endPoint);
		WFSDataStoreFactory dsFactory = new WFSDataStoreFactory();
		DataStore ds = dsFactory.createDataStore(params);
		return ds;
	}

	public static DataStore getDataStoreFromPostGIS(String host, int port, String user,
			String passwd, String database, String schema) throws Exception {
		HashMap<String, Serializable> params = new HashMap<String, Serializable>();
		params.put(PostgisDataStoreFactory.DBTYPE.key, "postgis");
		params.put(PostgisDataStoreFactory.HOST.key, host);
		params.put(PostgisDataStoreFactory.PORT.key, port);
		params.put(PostgisDataStoreFactory.USER.key, user);
		params.put(PostgisDataStoreFactory.PASSWD.key, passwd);
		params.put(PostgisDataStoreFactory.DATABASE.key, database);
		params.put(PostgisDataStoreFactory.SCHEMA.key, schema);
		PostgisDataStoreFactory dsFactory = new PostgisDataStoreFactory();
		DataStore ds = dsFactory.createDataStore(params);
		return ds;
	}

	public static DataStore getDataStoreFromMySQL(String host, int port, String user,
			String passwd, String database) throws Exception{
		HashMap<String, Serializable> params = new HashMap<String, Serializable>();
		params.put(MySQLDataStoreFactory.DBTYPE.key, "mysql");
		params.put(MySQLDataStoreFactory.HOST.key, host);
		params.put(MySQLDataStoreFactory.PORT.key, port);
		params.put(MySQLDataStoreFactory.USER.key, user);
		params.put(MySQLDataStoreFactory.PASSWD.key, passwd);
		params.put(MySQLDataStoreFactory.DATABASE.key, database);
		MySQLDataStoreFactory dsFactory = new MySQLDataStoreFactory();
		DataStore ds = dsFactory.createDataStore(params);
		return ds;
	}

	public static DataStore getDataStoreFromArcSDE(String server, int port,
			String instance, String user, String passwd) throws Exception {
		HashMap<String, Serializable> params = new HashMap<String, Serializable>();
		params.put(ArcSDEDataStoreFactory.DBTYPE_PARAM.key, "arcsde");
		params.put(ArcSDEDataStoreFactory.SERVER_PARAM.key, server);
		params.put(ArcSDEDataStoreFactory.PORT_PARAM.key, port);
		params.put(ArcSDEDataStoreFactory.INSTANCE_PARAM.key, instance);
		params.put(ArcSDEDataStoreFactory.USER_PARAM.key, user);
		params.put(ArcSDEDataStoreFactory.PASSWORD_PARAM.key, passwd);
		ArcSDEDataStoreFactory dsFactory = new ArcSDEDataStoreFactory();
		DataStore ds = dsFactory.createDataStore(params);
		return ds;
	}

	public static DataStore getDataStoreFromOracle(String host, int port, String user,
			String passwd, String instance)
			throws Exception {
		HashMap<String, Serializable> params = new HashMap<String, Serializable>();
		params.put("dbtype", "oracle");
		params.put("host", host);
		params.put("port", port);
		params.put("user", user);
		params.put("passwd", passwd);
		params.put("instance", instance);
		OracleDataStoreFactory dsFactory = new OracleDataStoreFactory();
		DataStore ds = dsFactory.createDataStore(params);
		return ds;
	}
	
	
	
	
}
