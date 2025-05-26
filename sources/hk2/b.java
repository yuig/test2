package hk2;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import lb.l0;

/* loaded from: classes4.dex */
public final class b extends AtomicReference implements uj2.m, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69387a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f69388b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f69389c;

    /* renamed from: d, reason: collision with root package name */
    public Object f69390d;

    public b(ak2.e eVar, ak2.e eVar2, ak2.a aVar) {
        this.f69388b = eVar;
        this.f69389c = eVar2;
        this.f69390d = aVar;
    }

    @Override // uj2.m
    public final void a() {
        switch (this.f69387a) {
            case 0:
                lazySet(bk2.c.DISPOSED);
                try {
                    ((ak2.a) this.f69390d).run();
                    break;
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    l0.R0(th3);
                    return;
                }
            default:
                ((uj2.m) this.f69388b).a();
                break;
        }
    }

    @Override // uj2.m
    public final void b(xj2.c cVar) {
        switch (this.f69387a) {
            case 0:
                bk2.c.setOnce(this, cVar);
                break;
            default:
                if (bk2.c.validate((xj2.c) this.f69390d, cVar)) {
                    this.f69390d = cVar;
                    ((uj2.m) this.f69388b).b(this);
                    break;
                }
                break;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f69387a) {
            case 0:
                bk2.c.dispose(this);
                break;
            default:
                bk2.c.dispose(this);
                ((xj2.c) this.f69390d).dispose();
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f69387a) {
        }
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // uj2.m
    public final void onError(Throwable th3) {
        switch (this.f69387a) {
            case 0:
                lazySet(bk2.c.DISPOSED);
                try {
                    ((ak2.e) this.f69389c).accept(th3);
                    break;
                } catch (Throwable th4) {
                    bp1.h.H(th4);
                    l0.R0(new CompositeException(th3, th4));
                    return;
                }
            default:
                ((uj2.m) this.f69388b).onError(th3);
                break;
        }
    }

    @Override // uj2.m
    public final void onSuccess(Object obj) {
        int i13 = this.f69387a;
        Object obj2 = this.f69388b;
        switch (i13) {
            case 0:
                lazySet(bk2.c.DISPOSED);
                try {
                    ((ak2.e) obj2).accept(obj);
                    break;
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    l0.R0(th3);
                }
            default:
                try {
                    Object apply = ((ak2.f) this.f69389c).apply(obj);
                    ck2.i.b(apply, "The mapper returned a null MaybeSource");
                    uj2.n nVar = (uj2.n) apply;
                    if (!isDisposed()) {
                        ((uj2.l) nVar).f(new androidx.appcompat.widget.q(this, 1));
                        break;
                    }
                } catch (Exception e13) {
                    bp1.h.H(e13);
                    ((uj2.m) obj2).onError(e13);
                    return;
                }
                break;
        }
    }

    public b(uj2.m mVar, ak2.f fVar) {
        this.f69388b = mVar;
        this.f69389c = fVar;
    }
}
