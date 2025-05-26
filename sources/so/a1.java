package so;

/* loaded from: classes3.dex */
public final class a1 implements yw1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bf2.d f113320b;

    public /* synthetic */ a1(bf2.d dVar, int i13) {
        this.f113319a = i13;
        this.f113320b = dVar;
    }

    public final yw1.d a(com.pinterest.api.model.o4 o4Var, yx.c cVar) {
        int i13 = this.f113319a;
        bf2.d dVar = this.f113320b;
        switch (i13) {
            case 0:
                return new yw1.d(((r8) dVar).f114090a.j2(), o4Var, cVar);
            default:
                return new yw1.d(((qb) dVar).f114076a.j2(), o4Var, cVar);
        }
    }
}
