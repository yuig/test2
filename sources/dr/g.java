package dr;

/* loaded from: classes3.dex */
public final class g implements ap.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f56176b;

    public g(k kVar, int i13) {
        this.f56176b = kVar;
        this.f56175a = i13;
    }

    @Override // ap.c
    public final void o() {
        k kVar = this.f56176b;
        kVar.f56198m.a(nl.b.k(kVar.A.h(), "Error during onSyncContactButtonClicked permissions", new ap.e(3)));
    }

    @Override // ap.c
    public final boolean r() {
        u();
        return false;
    }

    @Override // ap.c
    public final void u() {
        k kVar = this.f56176b;
        kVar.f56200o.remove(this.f56175a);
        kVar.notifyDataSetChanged();
    }
}
