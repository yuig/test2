package t3;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d5 implements i2.v, androidx.lifecycle.x {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f115942a;

    /* renamed from: b, reason: collision with root package name */
    public final i2.v f115943b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f115944c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.s f115945d;

    /* renamed from: e, reason: collision with root package name */
    public Function2 f115946e = c2.f115920a;

    public d5(c0 c0Var, i2.z zVar) {
        this.f115942a = c0Var;
        this.f115943b = zVar;
    }

    @Override // androidx.lifecycle.x
    public final void c(androidx.lifecycle.z zVar, androidx.lifecycle.q qVar) {
        if (qVar == androidx.lifecycle.q.ON_DESTROY) {
            dispose();
        } else {
            if (qVar != androidx.lifecycle.q.ON_CREATE || this.f115944c) {
                return;
            }
            d(this.f115946e);
        }
    }

    @Override // i2.v
    public final void d(Function2 function2) {
        i2.i iVar = new i2.i(8, this, function2);
        c0 c0Var = this.f115942a;
        n l13 = c0Var.l();
        if (l13 != null) {
            iVar.invoke(l13);
        }
        if (c0Var.isAttachedToWindow()) {
            return;
        }
        c0Var.T = iVar;
    }

    @Override // i2.v
    public final void dispose() {
        if (!this.f115944c) {
            this.f115944c = true;
            c0 c0Var = this.f115942a;
            c0Var.getClass();
            c0Var.setTag(u2.s.wrapped_composition_tag, null);
            androidx.lifecycle.s sVar = this.f115945d;
            if (sVar != null) {
                sVar.b(this);
            }
        }
        this.f115943b.dispose();
    }
}
