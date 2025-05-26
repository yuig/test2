package ll;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* loaded from: classes3.dex */
public final class a0 implements uk.r {

    /* renamed from: f, reason: collision with root package name */
    public static final yk.d f83672f = yk.d.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f83673g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f83674h = {0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f83675i = {1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f83676a;

    /* renamed from: b, reason: collision with root package name */
    public final RSAPublicKey f83677b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83678c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f83679d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f83680e;

    public a0(RSAPrivateCrtKey rSAPrivateCrtKey, u uVar, byte[] bArr, byte[] bArr2) {
        if (!f83672f.isCompatible()) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        j0.d(uVar);
        j0.b(rSAPrivateCrtKey.getModulus().bitLength());
        j0.c(rSAPrivateCrtKey.getPublicExponent());
        this.f83676a = rSAPrivateCrtKey;
        j0.d(uVar);
        this.f83678c = uVar + "withRSA";
        this.f83677b = (RSAPublicKey) ((KeyFactory) s.f83774h.a("RSA")).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
        this.f83679d = bArr;
        this.f83680e = bArr2;
    }

    public final byte[] a(byte[] bArr) {
        s sVar = s.f83770d;
        String str = this.f83678c;
        Signature signature = (Signature) sVar.a(str);
        signature.initSign(this.f83676a);
        signature.update(bArr);
        byte[] bArr2 = this.f83680e;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] sign = signature.sign();
        Signature signature2 = (Signature) sVar.a(str);
        signature2.initVerify(this.f83677b);
        signature2.update(bArr);
        if (bArr2.length > 0) {
            signature2.update(bArr2);
        }
        if (!signature2.verify(sign)) {
            throw new RuntimeException("Security bug: RSA signature computation error");
        }
        byte[] bArr3 = this.f83679d;
        return bArr3.length == 0 ? sign : kg.t.u(bArr3, sign);
    }
}
