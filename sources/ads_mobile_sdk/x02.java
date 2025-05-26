package ads_mobile_sdk;

import a.Cif;
import a.f2;
import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class x02 implements f2 {

    /* renamed from: a, reason: collision with root package name */
    public final a.n5 f13344a;

    /* renamed from: b, reason: collision with root package name */
    public final a.n5 f13345b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f13346c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13347d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13348e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13349f;

    public x02(a.n5 n5Var, a.n5 n5Var2, ExecutorService executorService, boolean z13, boolean z14, boolean z15) {
        this.f13344a = n5Var;
        this.f13345b = n5Var2;
        this.f13346c = executorService;
        this.f13347d = z13;
        this.f13348e = z14;
        this.f13349f = z15;
    }

    @Override // a.f2
    public final void a(InputEvent inputEvent) {
        gh2 gh2Var = (gh2) this.f13345b.get();
        k71 a13 = gh2Var.f5570a.a();
        if (a13 == null) {
            gh2Var.f5574e.b(xb0.EVENT_ID_DG_ENGINE_NULL_HANDLE);
        } else if (inputEvent instanceof MotionEvent) {
            try {
                a13.a((MotionEvent) inputEvent);
            } catch (xy2 e13) {
                ((x71) gh2Var.f5574e.f3595a).a(15004, -1L, e13, null);
            }
        }
    }

    @Override // a.f2
    public final com.google.common.util.concurrent.c0 b(Context context, String str, View view, Activity activity) {
        if (!this.f13347d) {
            c();
        }
        return ((gh2) this.f13345b.get()).a(context, str, view, activity);
    }

    public final void c() {
        try {
            com.google.common.util.concurrent.g.B(((ww2) this.f13344a.get()).a(), new Cif(this, 0), this.f13346c);
        } catch (Throwable th3) {
            new com.google.common.util.concurrent.x(th3);
        }
    }

    @Override // a.f2
    public final String b() {
        return (String) ((gh2) this.f13345b.get()).f5576g.get();
    }

    public final /* synthetic */ com.google.common.util.concurrent.c0 b(vw2 vw2Var) {
        return ((gh2) this.f13345b.get()).a();
    }

    @Override // a.f2
    public final com.google.common.util.concurrent.c0 a(Context context) {
        if (!this.f13347d) {
            c();
        }
        return ((gh2) this.f13345b.get()).a(context);
    }

    @Override // a.f2
    public final com.google.common.util.concurrent.c0 a(Context context, String str, View view, Activity activity) {
        if (!this.f13347d) {
            c();
        }
        return ((gh2) this.f13345b.get()).b(context, str, view, activity);
    }

    @Override // a.f2
    public final com.google.common.util.concurrent.c0 a() {
        if (this.f13349f) {
            com.google.common.util.concurrent.t z13 = com.google.common.util.concurrent.t.z(((ww2) this.f13344a.get()).a());
            a.y3 y3Var = new a.y3(8);
            com.google.common.util.concurrent.r rVar = com.google.common.util.concurrent.r.INSTANCE;
            z13.getClass();
            return com.google.common.util.concurrent.g.B(com.google.common.util.concurrent.a.A(z13, Throwable.class, y3Var, rVar), new Cif(this, 1), rVar);
        }
        com.google.common.util.concurrent.t a13 = ((gh2) this.f13345b.get()).a();
        c();
        return a13;
    }

    public final com.google.common.util.concurrent.c0 a(vw2 vw2Var) {
        if (this.f13348e && vw2Var == vw2.RESULT_UPDATED) {
            return ((gh2) this.f13345b.get()).a();
        }
        return com.google.common.util.concurrent.y.f33586b;
    }
}
