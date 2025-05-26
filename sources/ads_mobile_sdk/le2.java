package ads_mobile_sdk;

import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class le2 {

    /* renamed from: a, reason: collision with root package name */
    public final jl f7789a;

    public le2(jl jlVar) {
        this.f7789a = jlVar;
    }

    public final int a() {
        return this.f7789a.f6862a.length;
    }

    public final byte[] b() {
        return this.f7789a.a();
    }

    public static le2 a(int i13) {
        a.g gVar = a.c0.f27a;
        byte[] bArr = new byte[i13];
        ((SecureRandom) a.c0.f27a.get()).nextBytes(bArr);
        return new le2(jl.a(bArr, i13));
    }
}
