package kk2;

import oi.o6;

/* loaded from: classes2.dex */
public final class d implements uj2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final bk2.a f79925a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.d0 f79926b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f79927c;

    public d(e eVar, bk2.a aVar, uj2.d0 d0Var) {
        this.f79927c = eVar;
        this.f79925a = aVar;
        this.f79926b = d0Var;
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        bk2.a aVar = this.f79925a;
        aVar.getClass();
        bk2.c.replace(aVar, cVar);
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        e eVar = this.f79927c;
        xj2.c c13 = eVar.f79935d.c(new o6(19, this, th3), eVar.f79936e ? eVar.f79933b : 0L, eVar.f79934c);
        bk2.a aVar = this.f79925a;
        aVar.getClass();
        bk2.c.replace(aVar, c13);
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        e eVar = this.f79927c;
        xj2.c c13 = eVar.f79935d.c(new lb.x(15, this, obj), eVar.f79933b, eVar.f79934c);
        bk2.a aVar = this.f79925a;
        aVar.getClass();
        bk2.c.replace(aVar, c13);
    }
}
