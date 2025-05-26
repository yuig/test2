package hk2;

import java.util.concurrent.atomic.AtomicReference;
import uj2.f0;

/* loaded from: classes4.dex */
public final class a0 extends AtomicReference implements uj2.m, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69384a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f69385b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f69386c;

    public /* synthetic */ a0(int i13, Object obj, Object obj2) {
        this.f69384a = i13;
        this.f69385b = obj;
        this.f69386c = obj2;
    }

    @Override // uj2.m
    public final void a() {
        int i13 = this.f69384a;
        Object obj = this.f69385b;
        Object obj2 = this.f69386c;
        switch (i13) {
            case 0:
                xj2.c cVar = (xj2.c) get();
                if (cVar != bk2.c.DISPOSED && compareAndSet(cVar, null)) {
                    ((uj2.l) ((uj2.n) obj2)).f(new d((uj2.m) obj, this, 2));
                    break;
                }
                break;
            default:
                xj2.c cVar2 = (xj2.c) get();
                if (cVar2 != bk2.c.DISPOSED && compareAndSet(cVar2, null)) {
                    ((uj2.b0) ((f0) obj2)).p(new n((uj2.d0) obj, this));
                    break;
                }
                break;
        }
    }

    @Override // uj2.m
    public final void b(xj2.c cVar) {
        int i13 = this.f69384a;
        Object obj = this.f69385b;
        switch (i13) {
            case 0:
                if (bk2.c.setOnce(this, cVar)) {
                    ((uj2.m) obj).b(this);
                    break;
                }
                break;
            default:
                if (bk2.c.setOnce(this, cVar)) {
                    ((uj2.d0) obj).b(this);
                    break;
                }
                break;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f69384a) {
            case 0:
                bk2.c.dispose(this);
                break;
            default:
                bk2.c.dispose(this);
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f69384a) {
        }
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // uj2.m
    public final void onError(Throwable th3) {
        int i13 = this.f69384a;
        Object obj = this.f69385b;
        switch (i13) {
            case 0:
                ((uj2.m) obj).onError(th3);
                break;
            default:
                ((uj2.d0) obj).onError(th3);
                break;
        }
    }

    @Override // uj2.m
    public final void onSuccess(Object obj) {
        int i13 = this.f69384a;
        Object obj2 = this.f69385b;
        switch (i13) {
            case 0:
                ((uj2.m) obj2).onSuccess(obj);
                break;
            default:
                ((uj2.d0) obj2).onSuccess(obj);
                break;
        }
    }
}
