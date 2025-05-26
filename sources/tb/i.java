package tb;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import ja.d0;
import ja.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f116977a;

    /* renamed from: b, reason: collision with root package name */
    public final b f116978b;

    /* renamed from: c, reason: collision with root package name */
    public final h f116979c;

    /* renamed from: d, reason: collision with root package name */
    public final h f116980d;

    public i(WorkDatabase workDatabase) {
        this.f116977a = workDatabase;
        this.f116978b = new b(this, workDatabase, 2);
        this.f116979c = new h(this, workDatabase, 0);
        this.f116980d = new h(this, workDatabase, 1);
    }

    public final g a(j id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        String str = id3.f116981a;
        f0 d2 = f0.d(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        d2.c1(1, str);
        d2.u1(2, id3.f116982b);
        d0 d0Var = this.f116977a;
        d0Var.b();
        Cursor m03 = d7.b.m0(d0Var, d2, false);
        try {
            return m03.moveToFirst() ? new g(m03.getString(b7.c.w(m03, "work_spec_id")), m03.getInt(b7.c.w(m03, "generation")), m03.getInt(b7.c.w(m03, "system_id"))) : null;
        } finally {
            m03.close();
            d2.e();
        }
    }

    public final void b(g gVar) {
        d0 d0Var = this.f116977a;
        d0Var.b();
        d0Var.c();
        try {
            this.f116978b.n(gVar);
            d0Var.r();
        } finally {
            d0Var.m();
        }
    }
}
