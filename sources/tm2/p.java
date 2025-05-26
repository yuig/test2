package tm2;

/* loaded from: classes4.dex */
public final class p extends zm2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118420a;

    public p(int i13) {
        this.f118420a = i13;
    }

    @Override // zm2.b0
    public final zm2.t a(zm2.h hVar, zm2.k kVar) {
        switch (this.f118420a) {
            case 0:
                return new t(hVar, kVar);
            case 1:
                return new y(hVar, kVar);
            default:
                return new u0(hVar, kVar);
        }
    }
}
