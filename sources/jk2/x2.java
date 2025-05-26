package jk2;

import java.util.Collection;

/* loaded from: classes4.dex */
public final class x2 implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76754a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f76755b;

    /* renamed from: c, reason: collision with root package name */
    public xj2.c f76756c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f76757d;

    public /* synthetic */ x2(Object obj, Collection collection, int i13) {
        this.f76754a = i13;
        this.f76757d = obj;
        this.f76755b = collection;
    }

    @Override // uj2.v
    public final void a() {
        int i13 = this.f76754a;
        Object obj = this.f76757d;
        switch (i13) {
            case 0:
                Collection collection = this.f76755b;
                this.f76755b = null;
                uj2.v vVar = (uj2.v) obj;
                vVar.c(collection);
                vVar.a();
                break;
            default:
                Collection collection2 = this.f76755b;
                this.f76755b = null;
                ((uj2.d0) obj).onSuccess(collection2);
                break;
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        int i13 = this.f76754a;
        Object obj = this.f76757d;
        switch (i13) {
            case 0:
                if (bk2.c.validate(this.f76756c, cVar)) {
                    this.f76756c = cVar;
                    ((uj2.v) obj).b(this);
                    break;
                }
                break;
            default:
                if (bk2.c.validate(this.f76756c, cVar)) {
                    this.f76756c = cVar;
                    ((uj2.d0) obj).b(this);
                    break;
                }
                break;
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        switch (this.f76754a) {
            case 0:
                this.f76755b.add(obj);
                break;
            default:
                this.f76755b.add(obj);
                break;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f76754a) {
            case 0:
                this.f76756c.dispose();
                break;
            default:
                this.f76756c.dispose();
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f76754a) {
        }
        return this.f76756c.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        int i13 = this.f76754a;
        Object obj = this.f76757d;
        switch (i13) {
            case 0:
                this.f76755b = null;
                ((uj2.v) obj).onError(th3);
                break;
            default:
                this.f76755b = null;
                ((uj2.d0) obj).onError(th3);
                break;
        }
    }
}
