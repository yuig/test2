package fk2;

/* loaded from: classes4.dex */
public final class l extends uj2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62456a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.f f62457b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f62458c;

    public l(uj2.f fVar, Object obj, int i13) {
        this.f62456a = i13;
        this.f62457b = fVar;
        this.f62458c = obj;
    }

    @Override // uj2.b
    public final void k(uj2.d dVar) {
        int i13 = this.f62456a;
        uj2.f fVar = this.f62457b;
        Object obj = this.f62458c;
        switch (i13) {
            case 0:
                ((uj2.b) fVar).j(new k(dVar, (ak2.a) obj));
                break;
            default:
                ((uj2.b) fVar).j(new v(dVar, (uj2.a0) obj));
                break;
        }
    }
}
