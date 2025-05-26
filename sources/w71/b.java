package w71;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import ja.f0;
import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128162a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f128163b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f128164c;

    public /* synthetic */ b(d dVar, f0 f0Var, int i13) {
        this.f128162a = i13;
        this.f128164c = dVar;
        this.f128163b = f0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i13 = this.f128162a;
        Boolean bool = null;
        x71.d dVar = null;
        bool = null;
        f0 f0Var = this.f128163b;
        d dVar2 = this.f128164c;
        switch (i13) {
            case 0:
                Cursor m03 = d7.b.m0(dVar2.f128168a, f0Var, false);
                try {
                    if (m03.moveToFirst()) {
                        Integer valueOf = m03.isNull(0) ? null : Integer.valueOf(m03.getInt(0));
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        }
                    }
                    if (bool != null) {
                        return bool;
                    }
                    throw new EmptyResultSetException("Query returned empty result set: ".concat(f0Var.c()));
                } finally {
                    m03.close();
                }
            default:
                Cursor m04 = d7.b.m0(dVar2.f128168a, f0Var, true);
                try {
                    int w13 = b7.c.w(m04, "id");
                    int w14 = b7.c.w(m04, "user_id");
                    int w15 = b7.c.w(m04, "last_updated_at");
                    g1.g gVar = new g1.g(0);
                    while (m04.moveToNext()) {
                        gVar.put(m04.getString(w13), null);
                    }
                    m04.moveToPosition(-1);
                    dVar2.d(gVar);
                    if (m04.moveToFirst()) {
                        String string = m04.getString(w13);
                        String string2 = m04.getString(w14);
                        Long valueOf2 = m04.isNull(w15) ? null : Long.valueOf(m04.getLong(w15));
                        d.a(dVar2).getClass();
                        Date date = valueOf2 != null ? new Date(valueOf2.longValue()) : null;
                        if (date == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                        }
                        dVar = new x71.d(new x71.a(string, string2, date), (x71.e) gVar.get(m04.getString(w13)));
                    }
                    if (dVar != null) {
                        return dVar;
                    }
                    throw new EmptyResultSetException("Query returned empty result set: " + f0Var.c());
                } catch (Throwable th3) {
                    throw th3;
                }
        }
    }

    public final void finalize() {
        int i13 = this.f128162a;
        f0 f0Var = this.f128163b;
        switch (i13) {
            case 0:
                f0Var.e();
                break;
            default:
                f0Var.e();
                break;
        }
    }
}
