package kk2;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import lb.l0;
import uj2.f0;

/* loaded from: classes2.dex */
public final class l extends AtomicReference implements uj2.d0, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79957a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f79958b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f79959c;

    public /* synthetic */ l(int i13, Object obj, Object obj2) {
        this.f79957a = i13;
        this.f79958b = obj;
        this.f79959c = obj2;
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        int i13 = this.f79957a;
        Object obj = this.f79958b;
        switch (i13) {
            case 0:
                if (bk2.c.setOnce(this, cVar)) {
                    ((uj2.d0) obj).b(this);
                    break;
                }
                break;
            case 1:
                if (bk2.c.setOnce(this, cVar)) {
                    ((uj2.d0) obj).b(this);
                    break;
                }
                break;
            default:
                bk2.c.setOnce(this, cVar);
                break;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f79957a) {
            case 0:
                bk2.c.dispose(this);
                break;
            case 1:
                bk2.c.dispose(this);
                break;
            default:
                bk2.c.dispose(this);
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f79957a) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (get() == bk2.c.DISPOSED) {
                }
                break;
        }
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        int i13 = this.f79957a;
        Object obj = this.f79958b;
        Object obj2 = this.f79959c;
        switch (i13) {
            case 0:
                ((uj2.d0) obj).onError(th3);
                break;
            case 1:
                try {
                    Object apply = ((ak2.f) obj2).apply(th3);
                    ck2.i.b(apply, "The nextFunction returned a null SingleSource.");
                    ((uj2.b0) ((f0) apply)).p(new ek2.k(this, (uj2.d0) obj, 0));
                    break;
                } catch (Throwable th4) {
                    bp1.h.H(th4);
                    ((uj2.d0) obj).onError(new CompositeException(th3, th4));
                    return;
                }
            default:
                lazySet(bk2.c.DISPOSED);
                try {
                    ((ak2.e) obj2).accept(th3);
                    break;
                } catch (Throwable th5) {
                    bp1.h.H(th5);
                    l0.R0(new CompositeException(th3, th5));
                }
        }
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        int i13 = this.f79957a;
        Object obj2 = this.f79958b;
        switch (i13) {
            case 0:
                try {
                    Object apply = ((ak2.f) this.f79959c).apply(obj);
                    ck2.i.b(apply, "The single returned by the mapper is null");
                    f0 f0Var = (f0) apply;
                    if (!isDisposed()) {
                        ((uj2.b0) f0Var).p(new ek2.k(this, (uj2.d0) obj2, 1));
                        break;
                    }
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    ((uj2.d0) obj2).onError(th3);
                    return;
                }
                break;
            case 1:
                ((uj2.d0) obj2).onSuccess(obj);
                break;
            default:
                lazySet(bk2.c.DISPOSED);
                try {
                    ((ak2.e) obj2).accept(obj);
                    break;
                } catch (Throwable th4) {
                    bp1.h.H(th4);
                    l0.R0(th4);
                }
        }
    }
}
