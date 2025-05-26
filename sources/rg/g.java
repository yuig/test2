package rg;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.firebase.messaging.a0;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g implements d, sg.b, c {

    /* renamed from: a, reason: collision with root package name */
    public final j f107943a;

    /* renamed from: b, reason: collision with root package name */
    public final tg.a f107944b;

    /* renamed from: c, reason: collision with root package name */
    public final b f107945c;

    public g(tg.a aVar, b bVar, j jVar) {
        this.f107943a = jVar;
        this.f107944b = aVar;
        this.f107945c = bVar;
    }

    public static byte[] d(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static Object g(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        j jVar = this.f107943a;
        Objects.requireNonNull(jVar);
        return (SQLiteDatabase) e(new a0(jVar, 11), new c3.e(1));
    }

    public final Object c(f fVar) {
        SQLiteDatabase a13 = a();
        a13.beginTransaction();
        try {
            Object apply = fVar.apply(a13);
            a13.setTransactionSuccessful();
            return apply;
        } finally {
            a13.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f107943a.close();
    }

    public final Object e(a0 a0Var, c3.e eVar) {
        long elapsedRealtime;
        long elapsedRealtime2;
        tg.c cVar = (tg.c) this.f107944b;
        switch (cVar.f117572a) {
            case 0:
                elapsedRealtime = SystemClock.elapsedRealtime();
                break;
            default:
                elapsedRealtime = System.currentTimeMillis();
                break;
        }
        while (true) {
            try {
                int i13 = a0Var.f33757a;
                Object obj = a0Var.f33758b;
                switch (i13) {
                    case 10:
                        ((SQLiteDatabase) obj).beginTransaction();
                        return null;
                    default:
                        return ((j) obj).getWritableDatabase();
                }
            } catch (SQLiteDatabaseLockedException e13) {
                switch (cVar.f117572a) {
                    case 0:
                        elapsedRealtime2 = SystemClock.elapsedRealtime();
                        break;
                    default:
                        elapsedRealtime2 = System.currentTimeMillis();
                        break;
                }
                if (elapsedRealtime2 >= this.f107945c.f107937c + elapsedRealtime) {
                    return eVar.apply(e13);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object f(sg.a aVar) {
        SQLiteDatabase a13 = a();
        e(new a0(a13, 10), new c3.e(0));
        try {
            aVar.c();
            a13.setTransactionSuccessful();
            a13.endTransaction();
            return null;
        } catch (Throwable th3) {
            a13.endTransaction();
            throw th3;
        }
    }
}
