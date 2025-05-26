package pn;

import java.util.concurrent.atomic.AtomicReference;
import uj2.v;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100717a;

    /* renamed from: b, reason: collision with root package name */
    public final v f100718b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f100719c;

    public /* synthetic */ d(v vVar, v vVar2, int i13) {
        this.f100717a = i13;
        this.f100718b = vVar;
        this.f100719c = vVar2;
    }

    @Override // uj2.v
    public final void a() {
        int i13 = this.f100717a;
        v vVar = this.f100718b;
        switch (i13) {
            case 0:
                vVar.a();
                break;
            default:
                ((uk2.f) vVar).a();
                break;
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        switch (this.f100717a) {
            case 0:
                this.f100718b.b(cVar);
                Object obj = ((a) this.f100719c).f100711a;
                if (obj != null && !cVar.isDisposed()) {
                    this.f100718b.c(obj);
                    break;
                }
                break;
            default:
                bk2.c.setOnce((AtomicReference) this.f100719c, cVar);
                break;
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        int i13 = this.f100717a;
        v vVar = this.f100718b;
        switch (i13) {
            case 0:
                vVar.c(obj);
                break;
            default:
                ((uk2.f) vVar).c(obj);
                break;
        }
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        int i13 = this.f100717a;
        v vVar = this.f100718b;
        switch (i13) {
            case 0:
                vVar.onError(th3);
                break;
            default:
                ((uk2.f) vVar).onError(th3);
                break;
        }
    }
}
