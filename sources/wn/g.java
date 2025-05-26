package wn;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f130442a;

    /* renamed from: b, reason: collision with root package name */
    public final String f130443b;

    /* renamed from: c, reason: collision with root package name */
    public final String f130444c;

    /* renamed from: d, reason: collision with root package name */
    public final String f130445d;

    /* renamed from: e, reason: collision with root package name */
    public final String f130446e;

    /* renamed from: f, reason: collision with root package name */
    public final String f130447f;

    /* renamed from: g, reason: collision with root package name */
    public final String f130448g;

    public g(jf2.c cVar) {
        this.f130442a = (String) cVar.f75872a;
        this.f130443b = (String) cVar.f75873b;
        this.f130444c = (String) cVar.f75874c;
        this.f130445d = (String) cVar.f75875d;
        this.f130446e = (String) cVar.f75876e;
        this.f130447f = (String) cVar.f75877f;
        this.f130448g = (String) cVar.f75878g;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("JWK{keyType='");
        sb3.append(this.f130442a);
        sb3.append("', algorithm='");
        sb3.append(this.f130443b);
        sb3.append("', use='");
        sb3.append(this.f130444c);
        sb3.append("', keyId='");
        sb3.append(this.f130445d);
        sb3.append("', curve='");
        sb3.append(this.f130446e);
        sb3.append("', x='");
        sb3.append(this.f130447f);
        sb3.append("', y='");
        return a.a.p(sb3, this.f130448g, "'}");
    }
}
