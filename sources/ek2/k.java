package ek2;

import java.util.concurrent.atomic.AtomicReference;
import uj2.d0;

/* loaded from: classes2.dex */
public final class k implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59436a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f59437b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f59438c;

    public /* synthetic */ k(AtomicReference atomicReference, d0 d0Var, int i13) {
        this.f59436a = i13;
        this.f59437b = atomicReference;
        this.f59438c = d0Var;
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        int i13 = this.f59436a;
        AtomicReference atomicReference = this.f59437b;
        switch (i13) {
            case 0:
                bk2.c.replace(atomicReference, cVar);
                break;
            default:
                bk2.c.replace(atomicReference, cVar);
                break;
        }
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        int i13 = this.f59436a;
        d0 d0Var = this.f59438c;
        switch (i13) {
            case 0:
                d0Var.onError(th3);
                break;
            default:
                d0Var.onError(th3);
                break;
        }
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        int i13 = this.f59436a;
        d0 d0Var = this.f59438c;
        switch (i13) {
            case 0:
                d0Var.onSuccess(obj);
                break;
            default:
                d0Var.onSuccess(obj);
                break;
        }
    }
}
