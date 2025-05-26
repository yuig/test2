package com.google.android.recaptcha.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzei extends SQLiteOpenHelper {

    @NotNull
    public static final zzeg zza = new zzeg(null);
    private static final int zzb;

    @NotNull
    private static final String zzc;
    private static zzei zzd;

    static {
        int zzc2;
        String zzd2;
        zzc2 = zzeg.zzc("18.6.1");
        zzb = zzc2;
        zzd2 = zzeg.zzd("18.6.1");
        zzc = zzd2;
    }

    public /* synthetic */ zzei(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        super(context, zzc, (SQLiteDatabase.CursorFactory) null, zzb);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(@NotNull SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(@NotNull SQLiteDatabase sQLiteDatabase, int i13, int i14) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(@NotNull SQLiteDatabase sQLiteDatabase, int i13, int i14) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final int zza(@NotNull List list) {
        if (list.isEmpty()) {
            return 0;
        }
        return getWritableDatabase().delete("ce", "id IN ".concat(String.valueOf(CollectionsKt.Z(list, ", ", "(", ")", 0, null, zzeh.zza, 24))), null);
    }

    public final int zzb() {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", null);
        int i13 = -1;
        try {
            if (rawQuery.moveToNext()) {
                i13 = rawQuery.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th3) {
            rawQuery.close();
            throw th3;
        }
        rawQuery.close();
        return i13;
    }

    @NotNull
    public final List zzd() {
        Cursor query = getReadableDatabase().query("ce", null, null, null, null, null, "ts ASC");
        List arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    int i13 = query.getInt(query.getColumnIndexOrThrow("id"));
                    String string = query.getString(query.getColumnIndexOrThrow("ss"));
                    long j13 = query.getLong(query.getColumnIndexOrThrow("ts"));
                    Intrinsics.f(string);
                    arrayList.add(new zzej(string, j13, i13));
                } catch (Exception unused) {
                    arrayList = q0.f80391a;
                }
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    public final boolean zzf(@NotNull zzej zzejVar) {
        return zza(e0.b(zzejVar)) == 1;
    }
}
