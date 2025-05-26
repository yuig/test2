package nj2;

/* loaded from: classes4.dex */
public final class k implements ui2.p {

    /* renamed from: a, reason: collision with root package name */
    public final s f91029a;

    /* renamed from: b, reason: collision with root package name */
    public final zi2.a f91030b;

    static {
        ui2.g.f122309a.c("noop");
    }

    public k(s sVar, zi2.a aVar, qj2.a aVar2) {
        this.f91029a = sVar;
        this.f91030b = aVar;
    }

    @Override // ui2.p
    public final ui2.k a(String str) {
        if (str == null || str.trim().isEmpty()) {
            str = "<unspecified span name>";
        }
        s sVar = this.f91029a;
        boolean z13 = sVar.f91057i != null;
        zi2.a aVar = this.f91030b;
        return z13 ? ui2.g.f122309a.c(aVar.f142032a).a(str) : new j(str, aVar, sVar, (p) sVar.f91054f.get());
    }
}
