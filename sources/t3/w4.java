package t3;

import android.view.View;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class w4 implements androidx.lifecycle.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f116253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2.x1 f116254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i2.o2 f116255c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f116256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f116257e;

    public w4(ho2.c cVar, i2.x1 x1Var, i2.o2 o2Var, kotlin.jvm.internal.j0 j0Var, View view) {
        this.f116253a = cVar;
        this.f116254b = x1Var;
        this.f116255c = o2Var;
        this.f116256d = j0Var;
        this.f116257e = view;
    }

    @Override // androidx.lifecycle.x
    public final void c(androidx.lifecycle.z zVar, androidx.lifecycle.q qVar) {
        boolean z13;
        int i13 = s4.f116190a[qVar.ordinal()];
        ao2.m mVar = null;
        if (i13 == 1) {
            kotlin.jvm.internal.j.z(this.f116253a, null, ao2.l0.UNDISPATCHED, new v4(this.f116256d, this.f116255c, zVar, this, this.f116257e, null), 1);
            return;
        }
        if (i13 != 2) {
            if (i13 != 3) {
                if (i13 != 4) {
                    return;
                }
                this.f116255c.v();
                return;
            } else {
                i2.o2 o2Var = this.f116255c;
                synchronized (o2Var.f71209b) {
                    o2Var.f71224q = true;
                    Unit unit = Unit.f80348a;
                }
                return;
            }
        }
        i2.x1 x1Var = this.f116254b;
        if (x1Var != null) {
            i2.e1 e1Var = x1Var.f71356b;
            synchronized (e1Var.f71101a) {
                try {
                    synchronized (e1Var.f71101a) {
                        z13 = e1Var.f71104d;
                    }
                    if (!z13) {
                        List list = e1Var.f71102b;
                        e1Var.f71102b = e1Var.f71103c;
                        e1Var.f71103c = list;
                        e1Var.f71104d = true;
                        int size = list.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            bl2.c cVar = (bl2.c) list.get(i14);
                            xk2.q qVar2 = xk2.s.f135225b;
                            cVar.resumeWith(Unit.f80348a);
                        }
                        list.clear();
                        Unit unit2 = Unit.f80348a;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        i2.o2 o2Var2 = this.f116255c;
        synchronized (o2Var2.f71209b) {
            if (o2Var2.f71224q) {
                o2Var2.f71224q = false;
                mVar = o2Var2.x();
            }
        }
        if (mVar != null) {
            xk2.q qVar3 = xk2.s.f135225b;
            mVar.resumeWith(Unit.f80348a);
        }
    }
}
