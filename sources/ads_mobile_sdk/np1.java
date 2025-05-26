package ads_mobile_sdk;

import a.zb;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.SystemClock;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class np1 extends SQLiteOpenHelper {

    /* renamed from: f, reason: collision with root package name */
    public static final String f8911f = StringsKt.i0("\n      CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)\n      ").toString();

    /* renamed from: a, reason: collision with root package name */
    public final j0 f8912a;

    /* renamed from: b, reason: collision with root package name */
    public final zb f8913b;

    /* renamed from: c, reason: collision with root package name */
    public final xp1 f8914c;

    /* renamed from: d, reason: collision with root package name */
    public final cx2 f8915d;

    /* renamed from: e, reason: collision with root package name */
    public final mo2.a f8916e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np1(Context context, j0 backgroundScope, int i13, zb clock, xp1 offlineWorkManager, cx2 pinger) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(offlineWorkManager, "offlineWorkManager");
        Intrinsics.checkNotNullParameter(pinger, "pinger");
        this.f8912a = backgroundScope;
        this.f8913b = clock;
        this.f8914c = offlineWorkManager;
        this.f8915d = pinger;
        this.f8916e = mo2.d.a();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        sqLiteDatabase.execSQL(f8911f);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sqLiteDatabase, int i13, int i14) {
        Intrinsics.f(sqLiteDatabase);
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i13, int i14) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public static final void a(np1 np1Var, SQLiteDatabase sQLiteDatabase) {
        np1Var.getClass();
        sQLiteDatabase.beginTransaction();
        try {
            String[] a13 = np1Var.a(sQLiteDatabase);
            fp1 fp1Var = fp1.f5235a;
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{String.valueOf(1)});
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            for (String str : a13) {
                if (str != null) {
                    cx2 cx2Var = np1Var.f8915d;
                    Uri uri = Uri.parse(str);
                    Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                    cx2Var.getClass();
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    cx2Var.f4060f.g(uri);
                }
            }
        } catch (Throwable th3) {
            sQLiteDatabase.endTransaction();
            throw th3;
        }
    }

    public final String[] a(SQLiteDatabase sQLiteDatabase) {
        fp1 fp1Var = fp1.f5235a;
        Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"timestamp", "url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
        Intrinsics.checkNotNullExpressionValue(query, "query(...)");
        String[] strArr = new String[query.getCount()];
        int i13 = 0;
        while (query.moveToNext()) {
            int columnIndex = query.getColumnIndex("timestamp");
            int columnIndex2 = query.getColumnIndex("url");
            if (columnIndex2 != -1) {
                long j13 = query.getLong(columnIndex);
                String string = query.getString(columnIndex2);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                strArr[i13] = a(j13, string);
            }
            i13++;
        }
        query.close();
        return strArr;
    }

    public final String a(long j13, String str) {
        if (str == null) {
            return "";
        }
        Uri parse = Uri.parse(str);
        this.f8913b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - j13;
        String encodedQuery = parse.getEncodedQuery();
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        clearQuery.appendQueryParameter("bd", String.valueOf(elapsedRealtime));
        return a.a.D(clearQuery.build().toString(), "&", encodedQuery);
    }
}
