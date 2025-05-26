package com.amazonaws.mobileconnectors.s3.transferutility;

import a.c;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

/* loaded from: classes3.dex */
class TransferDBBase {

    /* renamed from: e, reason: collision with root package name */
    public static final Log f28644e = LogFactory.a(TransferDBBase.class);

    /* renamed from: f, reason: collision with root package name */
    public static final Object f28645f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Uri f28646a;

    /* renamed from: b, reason: collision with root package name */
    public final UriMatcher f28647b;

    /* renamed from: c, reason: collision with root package name */
    public final TransferDatabaseHelper f28648c;

    /* renamed from: d, reason: collision with root package name */
    public SQLiteDatabase f28649d;

    public TransferDBBase(Context context) {
        String packageName = context.getApplicationContext().getPackageName();
        TransferDatabaseHelper transferDatabaseHelper = new TransferDatabaseHelper(context);
        this.f28648c = transferDatabaseHelper;
        this.f28649d = transferDatabaseHelper.getWritableDatabase();
        this.f28646a = Uri.parse("content://" + packageName + "/transfers");
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.f28647b = uriMatcher;
        uriMatcher.addURI(packageName, "transfers", 10);
        uriMatcher.addURI(packageName, "transfers/#", 20);
        uriMatcher.addURI(packageName, "transfers/part/#", 30);
        uriMatcher.addURI(packageName, "transfers/state/*", 40);
    }

    public final void a() {
        synchronized (f28645f) {
            try {
                if (!this.f28649d.isOpen()) {
                    this.f28649d = this.f28648c.getWritableDatabase();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final Cursor b(Uri uri) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("awstransfer");
        int match = this.f28647b.match(uri);
        if (match == 10) {
            sQLiteQueryBuilder.appendWhere("part_num=0");
        } else if (match == 20) {
            sQLiteQueryBuilder.appendWhere("_id=" + uri.getLastPathSegment());
        } else if (match == 30) {
            sQLiteQueryBuilder.appendWhere("main_upload_id=" + uri.getLastPathSegment());
        } else {
            if (match != 40) {
                throw new IllegalArgumentException(c.g("Unknown URI: ", uri));
            }
            sQLiteQueryBuilder.appendWhere("state=");
            sQLiteQueryBuilder.appendWhereEscapeString(uri.getLastPathSegment());
        }
        a();
        return sQLiteQueryBuilder.query(this.f28649d, null, null, null, null, null, null);
    }

    public final synchronized int c(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int update;
        try {
            int match = this.f28647b.match(uri);
            a();
            if (match == 10) {
                update = this.f28649d.update("awstransfer", contentValues, str, strArr);
            } else {
                if (match != 20) {
                    throw new IllegalArgumentException("Unknown URI: " + uri);
                }
                String lastPathSegment = uri.getLastPathSegment();
                if (TextUtils.isEmpty(str)) {
                    update = this.f28649d.update("awstransfer", contentValues, "_id=" + lastPathSegment, null);
                } else {
                    update = this.f28649d.update("awstransfer", contentValues, "_id=" + lastPathSegment + " and " + str, strArr);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return update;
    }
}
