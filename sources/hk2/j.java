package hk2;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class j implements uj2.m, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69413a;

    /* renamed from: b, reason: collision with root package name */
    public xj2.c f69414b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f69415c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f69416d;

    public /* synthetic */ j(int i13, Object obj, Object obj2) {
        this.f69413a = i13;
        this.f69415c = obj;
        this.f69416d = obj2;
    }

    @Override // uj2.m
    public final void a() {
        int i13 = this.f69413a;
        Object obj = this.f69415c;
        switch (i13) {
            case 0:
                ((uj2.m) obj).a();
                break;
            default:
                this.f69414b = bk2.c.DISPOSED;
                Object obj2 = this.f69416d;
                if (obj2 == null) {
                    ((uj2.d0) obj).onError(new NoSuchElementException("The MaybeSource is empty"));
                    break;
                } else {
                    ((uj2.d0) obj).onSuccess(obj2);
                    break;
                }
        }
    }

    @Override // uj2.m
    public final void b(xj2.c cVar) {
        int i13 = this.f69413a;
        Object obj = this.f69415c;
        switch (i13) {
            case 0:
                if (bk2.c.validate(this.f69414b, cVar)) {
                    this.f69414b = cVar;
                    ((uj2.m) obj).b(this);
                    break;
                }
                break;
            default:
                if (bk2.c.validate(this.f69414b, cVar)) {
                    this.f69414b = cVar;
                    ((uj2.d0) obj).b(this);
                    break;
                }
                break;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f69413a) {
            case 0:
                xj2.c cVar = this.f69414b;
                this.f69414b = bk2.c.DISPOSED;
                cVar.dispose();
                break;
            default:
                this.f69414b.dispose();
                this.f69414b = bk2.c.DISPOSED;
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f69413a) {
        }
        return this.f69414b.isDisposed();
    }

    @Override // uj2.m
    public final void onError(Throwable th3) {
        int i13 = this.f69413a;
        Object obj = this.f69415c;
        switch (i13) {
            case 0:
                ((uj2.m) obj).onError(th3);
                break;
            default:
                this.f69414b = bk2.c.DISPOSED;
                ((uj2.d0) obj).onError(th3);
                break;
        }
    }

    @Override // uj2.m
    public final void onSuccess(Object obj) {
        int i13 = this.f69413a;
        Object obj2 = this.f69415c;
        switch (i13) {
            case 0:
                try {
                    if (!((ak2.g) this.f69416d).test(obj)) {
                        ((uj2.m) obj2).a();
                        break;
                    } else {
                        ((uj2.m) obj2).onSuccess(obj);
                        break;
                    }
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    ((uj2.m) obj2).onError(th3);
                    return;
                }
            default:
                this.f69414b = bk2.c.DISPOSED;
                ((uj2.d0) obj2).onSuccess(obj);
                break;
        }
    }
}
