package ll;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* loaded from: classes3.dex */
public abstract class d0 implements uk.s {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f83704a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f83705b;

    /* renamed from: c, reason: collision with root package name */
    public static final pd.d0 f83706c;

    static {
        yk.d dVar = yk.d.ALGORITHM_NOT_FIPS;
        f83704a = new byte[0];
        f83705b = new byte[]{0};
        qq2.c a13 = pd.d0.a();
        a13.a(u.SHA256, jl.t.f76896b);
        a13.a(u.SHA384, jl.t.f76897c);
        a13.a(u.SHA512, jl.t.f76898d);
        f83706c = a13.b();
    }

    public static uk.s b(jl.x xVar) {
        Provider provider = kl.h.f80032h;
        boolean z13 = provider != null;
        jl.u uVar = jl.u.f76902d;
        if (!z13) {
            KeyFactory keyFactory = (KeyFactory) s.f83774h.a("RSA");
            BigInteger bigInteger = xVar.f76918d;
            jl.v vVar = xVar.f76917c;
            return new c0((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, vVar.f76907b)), (u) f83706c.c(vVar.f76909d), xVar.f76919e.b(), vVar.f76908c.equals(uVar) ? f83705b : f83704a);
        }
        if (provider == null) {
            throw new GeneralSecurityException("RSA-PKCS1.5 using Conscrypt is not supported.");
        }
        KeyFactory keyFactory2 = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger2 = xVar.f76918d;
        jl.v vVar2 = xVar.f76917c;
        return new kl.h((RSAPublicKey) keyFactory2.generatePublic(new RSAPublicKeySpec(bigInteger2, vVar2.f76907b)), vVar2.f76909d, xVar.f76919e.b(), vVar2.f76908c.equals(uVar) ? kl.h.f80031g : kl.h.f80030f);
    }
}
