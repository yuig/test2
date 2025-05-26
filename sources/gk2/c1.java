package gk2;

import java.util.Collection;

/* loaded from: classes4.dex */
public final class c1 implements uj2.k, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65359a = 1;

    /* renamed from: b, reason: collision with root package name */
    public xp2.c f65360b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f65361c;

    /* renamed from: d, reason: collision with root package name */
    public Object f65362d;

    public c1(uj2.m mVar) {
        this.f65361c = mVar;
    }

    @Override // xp2.b
    public final void a() {
        int i13 = this.f65359a;
        Object obj = this.f65361c;
        switch (i13) {
            case 0:
                this.f65360b = ok2.g.CANCELLED;
                Object obj2 = this.f65362d;
                if (obj2 == null) {
                    ((uj2.m) obj).a();
                    break;
                } else {
                    this.f65362d = null;
                    ((uj2.m) obj).onSuccess(obj2);
                    break;
                }
            default:
                this.f65360b = ok2.g.CANCELLED;
                ((uj2.d0) obj).onSuccess((Collection) this.f65362d);
                break;
        }
    }

    @Override // xp2.b
    public final void c(Object obj) {
        switch (this.f65359a) {
            case 0:
                this.f65362d = obj;
                break;
            default:
                ((Collection) this.f65362d).add(obj);
                break;
        }
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        int i13 = this.f65359a;
        Object obj = this.f65361c;
        switch (i13) {
            case 0:
                if (ok2.g.validate(this.f65360b, cVar)) {
                    this.f65360b = cVar;
                    ((uj2.m) obj).b(this);
                    cVar.request(Long.MAX_VALUE);
                    break;
                }
                break;
            default:
                if (ok2.g.validate(this.f65360b, cVar)) {
                    this.f65360b = cVar;
                    ((uj2.d0) obj).b(this);
                    cVar.request(Long.MAX_VALUE);
                    break;
                }
                break;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f65359a) {
            case 0:
                this.f65360b.cancel();
                this.f65360b = ok2.g.CANCELLED;
                break;
            default:
                this.f65360b.cancel();
                this.f65360b = ok2.g.CANCELLED;
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f65359a) {
            case 0:
                if (this.f65360b == ok2.g.CANCELLED) {
                    break;
                }
                break;
            default:
                if (this.f65360b == ok2.g.CANCELLED) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        int i13 = this.f65359a;
        Object obj = this.f65361c;
        switch (i13) {
            case 0:
                this.f65360b = ok2.g.CANCELLED;
                this.f65362d = null;
                ((uj2.m) obj).onError(th3);
                break;
            default:
                this.f65362d = null;
                this.f65360b = ok2.g.CANCELLED;
                ((uj2.d0) obj).onError(th3);
                break;
        }
    }

    public c1(uj2.d0 d0Var, Collection collection) {
        this.f65361c = d0Var;
        this.f65362d = collection;
    }
}
