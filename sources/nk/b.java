package nk;

/* loaded from: classes3.dex */
public final class b extends x {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fi.h f91060g;

    public b(fi.h hVar) {
        this.f91060g = hVar;
    }

    @Override // nk.x
    public final void b() {
        fi.h hVar = this.f91060g;
        c cVar = (c) hVar.f62187b;
        cVar.f91063b.c("unlinkToDeath", new Object[0]);
        cVar.f91075n.asBinder().unlinkToDeath(cVar.f91072k, 0);
        c cVar2 = (c) hVar.f62187b;
        cVar2.f91075n = null;
        cVar2.f91068g = false;
    }
}
