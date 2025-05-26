package q21;

import android.widget.LinearLayout;
import com.pinterest.api.model.f30;
import h32.y1;
import h32.z1;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.c0;
import nx.d0;
import nx.v;
import uj2.q;
import ye2.o;

/* loaded from: classes5.dex */
public abstract class a extends LinearLayout implements o21.d, v, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public o f102122a;

    /* renamed from: b, reason: collision with root package name */
    public d0 f102123b;

    /* renamed from: c, reason: collision with root package name */
    public q f102124c;

    /* renamed from: d, reason: collision with root package name */
    public String f102125d;

    /* renamed from: e, reason: collision with root package name */
    public p21.f f102126e;

    /* renamed from: f, reason: collision with root package name */
    public w f102127f;

    /* renamed from: g, reason: collision with root package name */
    public zs1.a f102128g;

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f102122a == null) {
            this.f102122a = new o(this);
        }
        return this.f102122a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f102122a == null) {
            this.f102122a = new o(this);
        }
        return this.f102122a.generatedComponent();
    }

    @Override // nx.v
    public final c0 markImpressionEnd() {
        String uid;
        z1 z1Var;
        c0 c0Var;
        p21.f fVar = this.f102126e;
        if (fVar != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            f30 f30Var = fVar.f98692a;
            if (f30Var == null || (uid = f30Var.getUid()) == null || uid.length() == 0) {
                c0Var = null;
            } else {
                z1 z1Var2 = fVar.f98714w;
                if (z1Var2 != null) {
                    String b13 = fVar.f98698g.b(f30Var);
                    y1 y1Var = new y1(z1Var2);
                    y1Var.f67439e = Long.valueOf(((pb0.g) fVar.f98699h).a());
                    String str = fVar.f98715x;
                    ur.b bVar = (ur.b) fVar.f98713v;
                    bs1.c.Q1(y1Var, f30Var, str, -1L, measuredWidth, measuredHeight, fVar.f98693b, b13, null, false, false, false, fVar.f98709r, es.h.c(bVar.f123060c, fVar.f98692a), ((es.c) bVar.f123058a).j0(fVar.f98692a) ? new h32.f() : null, null, ((vr.b) bVar.f123059b).g(fVar.f98692a), ((es.v) bVar.f123060c).o(fVar.f98692a), null, null, 823040);
                    y1Var.f67435c = f30Var.getUid();
                    y1Var.f67430J = b13;
                    z1 a13 = y1Var.a();
                    HashMap q33 = fVar.q3(fVar.f98694c);
                    nx.q o23 = q33 != null ? bs1.c.o2(q33) : null;
                    String str2 = fVar.f98709r;
                    c0Var = new c0(a13, new nx.c(fVar.f98703l, o23, str2 != null ? p21.f.s3(fVar, f30Var.getUid(), str2) : null, null, 8));
                    z1Var = null;
                } else {
                    z1Var = null;
                    c0Var = null;
                }
                fVar.f98714w = z1Var;
            }
            if (c0Var != null) {
                if (this.f102128g != null) {
                    String str3 = c0Var.f92383a.f67482c;
                    return c0Var;
                }
                Intrinsics.r("impressionDebugUtils");
                throw null;
            }
        }
        return null;
    }

    @Override // nx.v
    public final c0 markImpressionStart() {
        c0 c0Var;
        p21.f fVar = this.f102126e;
        if (fVar != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            z1 z1Var = fVar.f98714w;
            HashMap hashMap = fVar.f98694c;
            if (z1Var != null) {
                HashMap q33 = fVar.q3(hashMap);
                c0Var = new c0(z1Var, new nx.c(fVar.f98703l, q33 != null ? bs1.c.o2(q33) : null, null, null, 12));
            } else {
                f30 f30Var = fVar.f98692a;
                if (f30Var == null) {
                    c0Var = null;
                } else {
                    y1 y1Var = new y1();
                    y1Var.f67433b = Long.valueOf(((pb0.g) fVar.f98699h).a());
                    String str = fVar.f98715x;
                    String b13 = fVar.f98698g.b(f30Var);
                    ur.b bVar = (ur.b) fVar.f98713v;
                    bs1.c.Q1(y1Var, f30Var, str, -1L, measuredWidth, measuredHeight, fVar.f98693b, b13, null, false, false, false, fVar.f98709r, es.h.c(bVar.f123060c, fVar.f98692a), ((es.c) bVar.f123058a).j0(fVar.f98692a) ? new h32.f() : null, null, ((vr.b) bVar.f123059b).g(fVar.f98692a), ((es.v) bVar.f123060c).o(fVar.f98692a), null, null, 823040);
                    z1 a13 = y1Var.a();
                    fVar.f98714w = a13;
                    HashMap q34 = fVar.q3(hashMap);
                    nx.q o23 = q34 != null ? bs1.c.o2(q34) : null;
                    String str2 = fVar.f98709r;
                    c0Var = new c0(a13, new nx.c(fVar.f98703l, o23, str2 != null ? p21.f.s3(fVar, f30Var.getUid(), str2) : null, null, 8));
                }
            }
            if (c0Var != null) {
                if (this.f102128g != null) {
                    String str3 = c0Var.f92383a.f67482c;
                    return c0Var;
                }
                Intrinsics.r("impressionDebugUtils");
                throw null;
            }
        }
        return null;
    }

    @Override // yk1.d, yk1.r
    public final void setPinalytics(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f102123b = pinalytics;
    }
}
