package kt0;

import android.view.View;
import h32.f1;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends xa.k {

    /* renamed from: a, reason: collision with root package name */
    public float f80827a = -1.0f;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f80828b;

    public g(q qVar) {
        this.f80828b = qVar;
    }

    @Override // xa.k, xa.i
    public final void A5(int i13) {
        q qVar = this.f80828b;
        Iterator it = qVar.C0.iterator();
        while (it.hasNext()) {
            bs1.c.R1((View) it.next(), true);
        }
        for (Map.Entry entry : qVar.D0.entrySet()) {
            ((View) entry.getKey()).setVisibility(((Number) entry.getValue()).intValue());
        }
        e0 e0Var = qVar.H0;
        if (e0Var != null) {
            f tabReason = qVar.Q0;
            Intrinsics.checkNotNullParameter(tabReason, "tabReason");
            e0Var.f80819m = i13;
            e s33 = e0Var.s3();
            if (s33 != null) {
                ((q) s33).s8(Integer.valueOf(e0Var.f80819m));
            }
            lt0.e currentSelectedTabData = (lt0.e) CollectionsKt.U(e0Var.f80819m, e0Var.f80816j);
            if (currentSelectedTabData != null) {
                t t33 = e0Var.t3();
                int i14 = e0Var.f80819m;
                Intrinsics.checkNotNullParameter(tabReason, "tabReason");
                Intrinsics.checkNotNullParameter(currentSelectedTabData, "currentSelectedTabData");
                int i15 = s.f80856a[tabReason.ordinal()];
                if (i15 == 1) {
                    t33.b("tap_tab_view", f1.TAP, currentSelectedTabData, i14);
                } else if (i15 == 2) {
                    t33.b("tab_swipe", f1.SWIPE, currentSelectedTabData, i14);
                }
            }
        }
        qVar.y8(f.RESET);
    }

    @Override // xa.k, xa.i
    public final void i(int i13, float f13, int i14) {
        int i15;
        int i16;
        q qVar = this.f80828b;
        if (qVar.J0 != -1) {
            if (q.m8(qVar, i13) || q.k8(qVar, i13) || q.l8(qVar, i13)) {
                if (f13 == 0.0f) {
                    this.f80827a = -1.0f;
                    return;
                }
                float f14 = this.f80827a;
                if (f14 == 2.0f) {
                    return;
                }
                if (f14 == -1.0f) {
                    this.f80827a = f13;
                    return;
                }
                if (q.k8(qVar, i13)) {
                    i16 = qVar.I0;
                    if (q.l8(qVar, i16) && f13 < this.f80827a) {
                        qVar.f7().f(new te1.c(true));
                        this.f80827a = 2.0f;
                    }
                }
                if (q.m8(qVar, i13)) {
                    i15 = qVar.I0;
                    if (!q.m8(qVar, i15) || f13 <= this.f80827a) {
                        return;
                    }
                    qVar.f7().f(new te1.c(true));
                    this.f80827a = 2.0f;
                }
            }
        }
    }

    @Override // xa.k, xa.i
    public final void i5(int i13) {
        q qVar = this.f80828b;
        if (i13 == 0) {
            qVar.y8(f.RESET);
        } else {
            if (i13 != 1) {
                return;
            }
            qVar.y8(f.SWIPE);
        }
    }
}
