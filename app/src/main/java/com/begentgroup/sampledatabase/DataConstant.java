package com.begentgroup.sampledatabase;

import android.provider.BaseColumns;

/**
 * Created by dongja94 on 2016-04-29.
 */
public class DataConstant {
    public interface PersonTable extends BaseColumns {
        public static final String TABLE_NAME = "person_table";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_PHONE = "phone";
        public static final String COLUMN_ADDRESS = "address";
        public static final String COLUMN_OFFICE = "office";
    }
}
