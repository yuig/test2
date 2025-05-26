package y2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import j1.q0;
import jk.r;
import k1.v0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import n4.k;
import s3.u1;
import u2.p;

/* loaded from: classes2.dex */
public final class c extends p implements b, u1, a {

    /* renamed from: n, reason: collision with root package name */
    public final d f136660n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f136661o;

    /* renamed from: p, reason: collision with root package name */
    public j f136662p;

    /* renamed from: q, reason: collision with root package name */
    public Function1 f136663q;

    public c(d dVar, Function1 function1) {
        this.f136660n = dVar;
        this.f136663q = function1;
        dVar.f136664a = this;
        dVar.f136666c = new q0(this, 21);
    }

    @Override // u2.p
    public final void E0() {
        j jVar = this.f136662p;
        if (jVar != null) {
            jVar.c();
        }
    }

    public final void M0() {
        j jVar = this.f136662p;
        if (jVar != null) {
            jVar.c();
        }
        this.f136661o = false;
        this.f136660n.f136665b = null;
        com.bumptech.glide.c.k0(this);
    }

    @Override // s3.u1
    public final void P() {
        M0();
    }

    @Override // y2.a
    public final n4.b b() {
        return com.bumptech.glide.c.U0(this).f110830r;
    }

    @Override // s3.r
    public final void e0() {
        M0();
    }

    @Override // s3.r
    public final void f(d3.e eVar) {
        boolean z13 = this.f136661o;
        d dVar = this.f136660n;
        if (!z13) {
            dVar.f136665b = null;
            com.bumptech.glide.c.L0(this, new v0(9, this, dVar));
            if (dVar.f136665b == null) {
                r.z("DrawResult not defined, did you forget to call onDraw?");
                throw null;
            }
            this.f136661o = true;
        }
        com.pinterest.framework.multisection.datasource.pagedlist.j jVar = dVar.f136665b;
        Intrinsics.f(jVar);
        jVar.f49143a.invoke(eVar);
    }

    @Override // y2.a
    public final long g() {
        return l0.y1(com.bumptech.glide.c.S0(this, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN).f102180c);
    }

    @Override // y2.a
    public final k getLayoutDirection() {
        return com.bumptech.glide.c.U0(this).f110831s;
    }
}
