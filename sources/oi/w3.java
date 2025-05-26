package oi;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;

/* loaded from: classes3.dex */
public final class w3 extends k2 {

    /* renamed from: c, reason: collision with root package name */
    public final k f95244c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f95245d;

    public w3(u4 u4Var) {
        super(u4Var);
        this.f95244c = new k(this, zza(), "google_app_measurement_local.db", 1);
    }

    public static long z(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
            if (!cursor.moveToFirst()) {
                cursor.close();
                return -1L;
            }
            long j13 = cursor.getLong(0);
            cursor.close();
            return j13;
        } catch (Throwable th3) {
            if (cursor != null) {
                cursor.close();
            }
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b A[Catch: all -> 0x0056, SQLiteException -> 0x005a, SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00b8, TRY_ENTER, TryCatch #7 {SQLiteDatabaseLockedException -> 0x00b8, SQLiteFullException -> 0x005c, SQLiteException -> 0x005a, all -> 0x0056, blocks: (B:74:0x004b, B:76:0x0051, B:17:0x006b, B:19:0x008d, B:20:0x00a5), top: B:73:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b0  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.w3.A(int, byte[]):boolean");
    }

    public final void B() {
        int delete;
        p();
        try {
            SQLiteDatabase D = D();
            if (D == null || (delete = D.delete("messages", null, null)) <= 0) {
                return;
            }
            zzj().f95276n.b(Integer.valueOf(delete), "Reset local analytics data. records");
        } catch (SQLiteException e13) {
            zzj().f95268f.b(e13, "Error resetting local analytics data. error");
        }
    }

    public final boolean C() {
        p();
        if (this.f95245d || !zza().getDatabasePath("google_app_measurement_local.db").exists()) {
            return false;
        }
        int i13 = 5;
        for (int i14 = 0; i14 < 5; i14++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    try {
                        SQLiteDatabase D = D();
                        if (D == null) {
                            this.f95245d = true;
                            if (D != null) {
                                D.close();
                            }
                            return false;
                        }
                        D.beginTransaction();
                        D.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        D.setTransactionSuccessful();
                        D.endTransaction();
                        D.close();
                        return true;
                    } catch (SQLiteFullException e13) {
                        zzj().f95268f.b(e13, "Error deleting app launch break from local database");
                        this.f95245d = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i13);
                    i13 += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteException e14) {
                if (0 != 0) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Throwable th3) {
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                        throw th3;
                    }
                }
                zzj().f95268f.b(e14, "Error deleting app launch break from local database");
                this.f95245d = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        zzj().f95271i.c("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    public final SQLiteDatabase D() {
        if (this.f95245d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f95244c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f95245d = true;
        return null;
    }

    @Override // oi.k2
    public final boolean y() {
        return false;
    }
}
