package com.amazonaws.mobileconnectors.s3.transferutility;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes3.dex */
abstract class TransferTable {
    public static void a(SQLiteDatabase sQLiteDatabase, int i13, int i14) {
        if (i13 < 2 && i14 >= 2) {
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN user_metadata text;");
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN expiration_time_rule_id text;");
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN http_expires_date text;");
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN sse_algorithm text;");
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN content_md5 text;");
        }
        if (i13 < 3 && i14 >= 3) {
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN kms_key text;");
        }
        if (i13 < 4 && i14 >= 4) {
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN canned_acl text;");
        }
        if (i13 < 5 && i14 >= 5) {
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN header_storage_class text;");
        }
        if (i13 >= 6 || i14 < 6) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN transfer_utility_options text;");
    }
}
