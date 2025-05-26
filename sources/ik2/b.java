package ik2;

import java.util.concurrent.Callable;
import jk2.a2;
import jk2.s;
import jk2.w2;
import kk2.o;
import uj2.b0;
import uj2.f0;
import uj2.l;
import uj2.n;
import uj2.q;
import uj2.t;
import uj2.v;

/* loaded from: classes4.dex */
public final class b extends q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72421a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f72422b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f72423c;

    public b(int i13, Object obj, Object obj2) {
        this.f72421a = i13;
        this.f72422b = obj;
        this.f72423c = obj2;
    }

    @Override // uj2.q
    public final void G(v vVar) {
        int i13 = this.f72421a;
        Object obj = this.f72423c;
        Object obj2 = this.f72422b;
        switch (i13) {
            case 0:
                a aVar = new a(vVar, (t) obj);
                vVar.b(aVar);
                ((uj2.b) ((uj2.f) obj2)).j(aVar);
                break;
            case 1:
                c cVar = new c(vVar, (ak2.f) obj);
                vVar.b(cVar);
                ((l) ((n) obj2)).f(cVar);
                break;
            case 2:
                bk2.a aVar2 = new bk2.a();
                vVar.b(aVar2);
                ((t) obj2).d(new s(this, aVar2, vVar));
                break;
            case 3:
                try {
                    Object apply = ((ak2.f) obj).apply(obj2);
                    ck2.i.b(apply, "The mapper returned a null ObservableSource");
                    t tVar = (t) apply;
                    if (!(tVar instanceof Callable)) {
                        tVar.d(vVar);
                        break;
                    } else {
                        try {
                            Object call = ((Callable) tVar).call();
                            if (call != null) {
                                a2 a2Var = new a2(call, vVar);
                                vVar.b(a2Var);
                                a2Var.run();
                                break;
                            } else {
                                bk2.d.complete(vVar);
                                break;
                            }
                        } catch (Throwable th3) {
                            bp1.h.H(th3);
                            bk2.d.error(th3, vVar);
                            return;
                        }
                    }
                } catch (Throwable th4) {
                    bk2.d.error(th4, vVar);
                    return;
                }
            default:
                ((b0) ((f0) obj2)).p(new o(vVar, (ak2.f) obj));
                break;
        }
    }

    public b(t tVar, w2 w2Var) {
        this.f72421a = 2;
        this.f72423c = tVar;
        this.f72422b = w2Var;
    }
}
