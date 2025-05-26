package oa;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a */
    public final int f93835a;

    public c(int i13) {
        this.f93835a = i13;
    }

    public static void a(String str) {
        if (z.i(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i13 = 0;
        boolean z13 = false;
        while (i13 <= length) {
            boolean z14 = Intrinsics.i(str.charAt(!z13 ? i13 : length), 32) <= 0;
            if (z13) {
                if (!z14) {
                    break;
                } else {
                    length--;
                }
            } else if (z14) {
                i13++;
            } else {
                z13 = true;
            }
        }
        if (str.subSequence(i13, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            File file = new File(str);
            Intrinsics.checkNotNullParameter(file, "file");
            SQLiteDatabase.deleteDatabase(file);
        } catch (Exception e13) {
            Log.w("SupportSQLite", "delete failed: ", e13);
        }
    }

    public void b(pa.c db3) {
        Intrinsics.checkNotNullParameter(db3, "db");
    }

    public abstract void c(pa.c cVar);

    public abstract void d(pa.c cVar, int i13, int i14);

    public abstract void e(pa.c cVar);

    public abstract void f(pa.c cVar, int i13, int i14);
}
