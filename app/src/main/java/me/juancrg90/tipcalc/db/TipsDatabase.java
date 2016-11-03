package me.juancrg90.tipcalc.db;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by JuanCrg90 on 11/2/16.
 */

@Database(name= TipsDatabase.NAME, version = TipsDatabase.VERSION)
public class TipsDatabase {
    public static final int VERSION = 1;
    public static final String NAME = "Tips";
}
