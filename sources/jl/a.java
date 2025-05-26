package jl;

import java.security.spec.ECParameterSpec;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f76788c = new a("NIST_P256", el.f.f59479a);

    /* renamed from: d, reason: collision with root package name */
    public static final a f76789d = new a("NIST_P384", el.f.f59480b);

    /* renamed from: e, reason: collision with root package name */
    public static final a f76790e = new a("NIST_P521", el.f.f59481c);

    /* renamed from: a, reason: collision with root package name */
    public final String f76791a;

    /* renamed from: b, reason: collision with root package name */
    public final ECParameterSpec f76792b;

    public a(String str, ECParameterSpec eCParameterSpec) {
        this.f76791a = str;
        this.f76792b = eCParameterSpec;
    }

    public final String toString() {
        return this.f76791a;
    }
}
