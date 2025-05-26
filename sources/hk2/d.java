package hk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class d implements uj2.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69397a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.m f69398b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f69399c;

    public /* synthetic */ d(AtomicReference atomicReference, uj2.m mVar, int i13) {
        this.f69397a = i13;
        this.f69399c = atomicReference;
        this.f69398b = mVar;
    }

    @Override // uj2.m
    public final void a() {
        int i13 = this.f69397a;
        uj2.m mVar = this.f69398b;
        switch (i13) {
            case 0:
                mVar.a();
                break;
            case 1:
                mVar.a();
                break;
            case 2:
                mVar.a();
                break;
            default:
                mVar.a();
                break;
        }
    }

    @Override // uj2.m
    public final void b(xj2.c cVar) {
        int i13 = this.f69397a;
        AtomicReference atomicReference = this.f69399c;
        switch (i13) {
            case 0:
                bk2.c.replace(atomicReference, cVar);
                break;
            case 1:
                bk2.c.setOnce(atomicReference, cVar);
                break;
            case 2:
                bk2.c.setOnce(atomicReference, cVar);
                break;
            default:
                bk2.c.replace(atomicReference, cVar);
                break;
        }
    }

    @Override // uj2.m
    public final void onError(Throwable th3) {
        int i13 = this.f69397a;
        uj2.m mVar = this.f69398b;
        switch (i13) {
            case 0:
                mVar.onError(th3);
                break;
            case 1:
                mVar.onError(th3);
                break;
            case 2:
                mVar.onError(th3);
                break;
            default:
                mVar.onError(th3);
                break;
        }
    }

    @Override // uj2.m
    public final void onSuccess(Object obj) {
        int i13 = this.f69397a;
        uj2.m mVar = this.f69398b;
        switch (i13) {
            case 0:
                mVar.onSuccess(obj);
                break;
            case 1:
                mVar.onSuccess(obj);
                break;
            case 2:
                mVar.onSuccess(obj);
                break;
            default:
                mVar.onSuccess(obj);
                break;
        }
    }

    public /* synthetic */ d(uj2.m mVar, AtomicReference atomicReference, int i13) {
        this.f69397a = i13;
        this.f69398b = mVar;
        this.f69399c = atomicReference;
    }
}
