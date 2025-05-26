package ol1;

import bp1.h;
import ck2.i;
import dl1.b0;
import gb2.f;
import hk1.t;
import hk2.d0;
import io.reactivex.exceptions.CompositeException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import jk2.j1;
import jk2.v0;
import jk2.x;
import jk2.x0;
import kk2.a0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import m60.w;
import ps0.i0;
import uj2.f0;
import uj2.l;
import uj2.n;
import uj2.q;
import uj2.s;
import uj2.v;

/* loaded from: classes2.dex */
public final class d extends q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96449a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f96450b;

    public d(Object obj, int i13) {
        this.f96449a = i13;
        this.f96450b = obj;
    }

    @Override // uj2.q
    public final void G(v observer) {
        int i13 = 0;
        int i14 = 1;
        switch (this.f96449a) {
            case 0:
                Intrinsics.checkNotNullParameter(observer, "observer");
                b bVar = new b(observer);
                ((w) this.f96450b).h(bVar);
                uk2.d dVar = f.f64748b;
                i0 i0Var = new i0(1, c.f96444j);
                dVar.getClass();
                int i15 = 2;
                x xVar = new x(new j1(dVar, i0Var, i13), new ck2.a(1, c.f96445k), i15);
                Intrinsics.checkNotNullExpressionValue(xVar, "filter(...)");
                x xVar2 = new x(new j1(xVar, new b0(11, c.f96446l), i13), new b0(9, c.f96447m), i15);
                Intrinsics.checkNotNullExpressionValue(xVar2, "filter(...)");
                observer.b(new m60.x(bVar, nl.b.m(xVar2, "Error with the wrapped feedback subscription", new t(observer, 6))));
                break;
            case 1:
                ((l) ((n) this.f96450b)).f(new d0(observer));
                break;
            case 2:
                fk2.f fVar = new fk2.f(observer, i14);
                observer.b(fVar);
                try {
                    ((s) this.f96450b).o(fVar);
                    break;
                } catch (Throwable th3) {
                    h.H(th3);
                    fVar.d(th3);
                    return;
                }
            case 3:
                try {
                    Object call = ((Callable) this.f96450b).call();
                    i.b(call, "null ObservableSource supplied");
                    ((uj2.t) call).d(observer);
                    break;
                } catch (Throwable th4) {
                    h.H(th4);
                    bk2.d.error(th4, observer);
                    return;
                }
            case 4:
                Object[] objArr = (Object[]) this.f96450b;
                v0 v0Var = new v0(observer, objArr);
                observer.b(v0Var);
                if (!v0Var.f76723d) {
                    int length = objArr.length;
                    while (i13 < length && !v0Var.f76724e) {
                        Object obj = objArr[i13];
                        if (obj == null) {
                            v0Var.f76720a.onError(new NullPointerException(a.a.e("The element at index ", i13, " is null")));
                            break;
                        } else {
                            v0Var.f76720a.c(obj);
                            i13++;
                        }
                    }
                    if (!v0Var.f76724e) {
                        v0Var.f76720a.a();
                        break;
                    }
                }
                break;
            case 5:
                try {
                    Iterator it = ((Iterable) this.f96450b).iterator();
                    try {
                        if (!it.hasNext()) {
                            bk2.d.complete(observer);
                            break;
                        } else {
                            x0 x0Var = new x0(observer, it);
                            observer.b(x0Var);
                            if (!x0Var.f76742d) {
                                while (!x0Var.f76741c) {
                                    try {
                                        Object next = x0Var.f76740b.next();
                                        i.b(next, "The iterator returned a null value");
                                        x0Var.f76739a.c(next);
                                        if (x0Var.f76741c) {
                                            break;
                                        } else {
                                            try {
                                                if (!x0Var.f76740b.hasNext()) {
                                                    if (!x0Var.f76741c) {
                                                        x0Var.f76739a.a();
                                                        break;
                                                    }
                                                }
                                            } catch (Throwable th5) {
                                                h.H(th5);
                                                x0Var.f76739a.onError(th5);
                                                return;
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        h.H(th6);
                                        x0Var.f76739a.onError(th6);
                                        return;
                                    }
                                }
                                break;
                            }
                        }
                    } catch (Throwable th7) {
                        h.H(th7);
                        bk2.d.error(th7, observer);
                        return;
                    }
                } catch (Throwable th8) {
                    h.H(th8);
                    bk2.d.error(th8, observer);
                    return;
                }
                break;
            case 6:
                ((uj2.b0) ((f0) this.f96450b)).p(new a0(observer));
                break;
            case 7:
                ((q) this.f96450b).d(new qq2.a(observer));
                break;
            default:
                pq2.i clone = ((pq2.i) this.f96450b).clone();
                qq2.b bVar2 = new qq2.b(clone);
                observer.b(bVar2);
                if (!bVar2.f104881b) {
                    try {
                        Object e13 = clone.e();
                        if (!bVar2.f104881b) {
                            observer.c(e13);
                        }
                        if (!bVar2.f104881b) {
                            try {
                                observer.a();
                                break;
                            } catch (Throwable th9) {
                                th = th9;
                                i13 = 1;
                                h.H(th);
                                if (i13 != 0) {
                                    l0.R0(th);
                                    return;
                                }
                                if (bVar2.f104881b) {
                                    return;
                                }
                                try {
                                    observer.onError(th);
                                    return;
                                } catch (Throwable th10) {
                                    h.H(th10);
                                    l0.R0(new CompositeException(th, th10));
                                }
                            }
                        }
                    } catch (Throwable th11) {
                        th = th11;
                    }
                }
                break;
        }
    }

    public d(w eventManager) {
        this.f96449a = 0;
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f96450b = eventManager;
    }
}
