package wn;

import java.util.List;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f130450a;

    /* renamed from: b, reason: collision with root package name */
    public final String f130451b;

    /* renamed from: c, reason: collision with root package name */
    public final String f130452c;

    /* renamed from: d, reason: collision with root package name */
    public final String f130453d;

    /* renamed from: e, reason: collision with root package name */
    public final List f130454e;

    /* renamed from: f, reason: collision with root package name */
    public final List f130455f;

    /* renamed from: g, reason: collision with root package name */
    public final List f130456g;

    public i(jf2.c cVar) {
        this.f130450a = (String) cVar.f75872a;
        this.f130451b = (String) cVar.f75873b;
        this.f130452c = (String) cVar.f75874c;
        this.f130453d = (String) cVar.f75875d;
        this.f130454e = (List) cVar.f75876e;
        this.f130455f = (List) cVar.f75877f;
        this.f130456g = (List) cVar.f75878g;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OpenIdDiscoveryDocument{issuer='");
        sb3.append(this.f130450a);
        sb3.append("', authorizationEndpoint='");
        sb3.append(this.f130451b);
        sb3.append("', tokenEndpoint='");
        sb3.append(this.f130452c);
        sb3.append("', jwksUri='");
        sb3.append(this.f130453d);
        sb3.append("', responseTypesSupported=");
        sb3.append(this.f130454e);
        sb3.append(", subjectTypesSupported=");
        sb3.append(this.f130455f);
        sb3.append(", idTokenSigningAlgValuesSupported=");
        return d7.g.k(sb3, this.f130456g, '}');
    }
}
