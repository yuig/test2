package fi;

/* loaded from: classes3.dex */
public final class g extends c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f62185b;

    public g(h hVar) {
        this.f62185b = hVar;
    }

    @Override // fi.c
    public final void a() {
        h hVar = this.f62185b;
        i iVar = (i) hVar.f62187b;
        iVar.f62190b.c("unlinkToDeath", new Object[0]);
        iVar.f62201m.asBinder().unlinkToDeath(iVar.f62198j, 0);
        i iVar2 = (i) hVar.f62187b;
        iVar2.f62201m = null;
        iVar2.f62195g = false;
    }
}
