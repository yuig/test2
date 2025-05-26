package d8;

/* loaded from: classes3.dex */
public final class b extends h8.b {

    /* renamed from: d, reason: collision with root package name */
    public final e8.b f53944d;

    public b(e8.b bVar, int i13) {
        super(i13, bVar.f57711k - 1);
        this.f53944d = bVar;
    }

    @Override // h8.q
    public final long g() {
        a();
        return this.f53944d.f57715o[(int) this.f68004c];
    }

    @Override // h8.q
    public final long k() {
        return this.f53944d.c((int) this.f68004c) + g();
    }
}
