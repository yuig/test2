package nj2;

/* loaded from: classes4.dex */
public final class l implements ui2.q {

    /* renamed from: a, reason: collision with root package name */
    public final jf2.c f91031a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91032b;

    /* renamed from: c, reason: collision with root package name */
    public String f91033c;

    /* renamed from: d, reason: collision with root package name */
    public String f91034d;

    public l(jf2.c cVar, String str) {
        this.f91031a = cVar;
        this.f91032b = str;
    }

    @Override // ui2.q
    public final ui2.q a(String str) {
        this.f91033c = str;
        return this;
    }

    @Override // ui2.q
    public final ui2.q b(String str) {
        this.f91034d = str;
        return this;
    }

    @Override // ui2.q
    public final ui2.p build() {
        String str = this.f91033c;
        String str2 = this.f91034d;
        return (ui2.p) this.f91031a.g(qi2.a.f104005d, this.f91032b, str, str2);
    }
}
