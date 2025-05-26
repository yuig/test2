package so;

/* loaded from: classes3.dex */
public final class y1 implements yq.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bf2.d f114717b;

    public /* synthetic */ y1(bf2.d dVar, int i13) {
        this.f114716a = i13;
        this.f114717b = dVar;
    }

    public final yq.d a(String str, yq.n nVar, String str2, String str3) {
        int i13 = this.f114716a;
        bf2.d dVar = this.f114717b;
        switch (i13) {
            case 0:
                r8 r8Var = (r8) dVar;
                return new yq.d(str, nVar, str2, str3, (lu1.b) r8Var.f114090a.f113961v5.get(), (nx.f0) r8Var.f114090a.f113747j2.get());
            default:
                qb qbVar = (qb) dVar;
                return new yq.d(str, nVar, str2, str3, (lu1.b) qbVar.f114076a.f113961v5.get(), (nx.f0) qbVar.f114076a.f113747j2.get());
        }
    }
}
