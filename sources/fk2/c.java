package fk2;

/* loaded from: classes2.dex */
public final class c extends uj2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62416a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f62417b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f62418c;

    public c(int i13, Object obj, Object obj2) {
        this.f62416a = i13;
        this.f62417b = obj;
        this.f62418c = obj2;
    }

    @Override // uj2.b
    public final void k(uj2.d dVar) {
        int i13 = this.f62416a;
        Object obj = this.f62418c;
        Object obj2 = this.f62417b;
        switch (i13) {
            case 0:
                uj2.b bVar = (uj2.b) ((uj2.f) obj2);
                bVar.j(new b(0, dVar, (uj2.f) obj));
                break;
            case 1:
                ((uj2.b) ((uj2.f) obj2)).j(new a(this, dVar, 1));
                break;
            case 2:
                y yVar = new y(dVar, (ak2.f) obj);
                dVar.b(yVar);
                ((uj2.b) ((uj2.f) obj2)).j(yVar);
                break;
            case 3:
                z zVar = new z(dVar, (uj2.f) obj2);
                dVar.b(zVar);
                xj2.c b13 = ((uj2.a0) obj).b(zVar);
                bk2.a aVar = zVar.f62494b;
                aVar.getClass();
                bk2.c.replace(aVar, b13);
                break;
            default:
                kk2.n nVar = new kk2.n(dVar, (ak2.f) obj);
                dVar.b(nVar);
                ((uj2.b0) ((uj2.f0) obj2)).p(nVar);
                break;
        }
    }
}
