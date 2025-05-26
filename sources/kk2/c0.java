package kk2;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.Callable;
import l7.w0;
import lb.l0;
import uj2.f0;

/* loaded from: classes4.dex */
public final class c0 extends uj2.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Callable f79921a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f79922b;

    /* renamed from: c, reason: collision with root package name */
    public final ak2.e f79923c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f79924d = true;

    public c0(w0 w0Var, oo1.d dVar, zq1.c0 c0Var) {
        this.f79921a = w0Var;
        this.f79922b = dVar;
        this.f79923c = c0Var;
    }

    @Override // uj2.b0
    public final void q(uj2.d0 d0Var) {
        ak2.e eVar = this.f79923c;
        boolean z13 = this.f79924d;
        try {
            Object call = this.f79921a.call();
            try {
                Object apply = this.f79922b.apply(call);
                ck2.i.b(apply, "The singleFunction returned a null SingleSource");
                ((uj2.b0) ((f0) apply)).p(new b0(d0Var, call, z13, eVar));
            } catch (Throwable th3) {
                th = th3;
                bp1.h.H(th);
                if (z13) {
                    try {
                        eVar.accept(call);
                    } catch (Throwable th4) {
                        bp1.h.H(th4);
                        th = new CompositeException(th, th4);
                    }
                }
                bk2.d.error(th, d0Var);
                if (z13) {
                    return;
                }
                try {
                    eVar.accept(call);
                } catch (Throwable th5) {
                    bp1.h.H(th5);
                    l0.R0(th5);
                }
            }
        } catch (Throwable th6) {
            bp1.h.H(th6);
            bk2.d.error(th6, d0Var);
        }
    }
}
