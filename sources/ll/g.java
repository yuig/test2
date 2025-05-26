package ll;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;

/* loaded from: classes3.dex */
public final class g implements uk.r {

    /* renamed from: g, reason: collision with root package name */
    public static final yk.d f83718g = yk.d.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f83719h = new byte[0];

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f83720i = {0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f83721j = {1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    public final ECPrivateKey f83722a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83723b;

    /* renamed from: c, reason: collision with root package name */
    public final o f83724c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f83725d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f83726e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f83727f;

    public g(ECPrivateKey eCPrivateKey, u uVar, o oVar, byte[] bArr, byte[] bArr2) {
        if (!f83718g.isCompatible()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.f83722a = eCPrivateKey;
        j0.d(uVar);
        this.f83723b = uVar + "withECDSA";
        this.f83724c = oVar;
        this.f83725d = bArr;
        this.f83726e = bArr2;
        this.f83727f = el.a.u2();
    }

    public final byte[] a(byte[] bArr) {
        String str = this.f83723b;
        Provider provider = this.f83727f;
        Signature signature = provider != null ? Signature.getInstance(str, provider) : (Signature) s.f83770d.a(str);
        ECPrivateKey eCPrivateKey = this.f83722a;
        signature.initSign(eCPrivateKey);
        signature.update(bArr);
        byte[] bArr2 = this.f83726e;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] sign = signature.sign();
        if (this.f83724c == o.IEEE_P1363) {
            int D = el.a.D(eCPrivateKey.getParams().getCurve()) * 2;
            if (!el.a.k2(sign)) {
                throw new GeneralSecurityException("Invalid DER encoding");
            }
            byte[] bArr3 = new byte[D];
            int i13 = (sign[1] & 255) >= 128 ? 3 : 2;
            int i14 = i13 + 1;
            int i15 = i13 + 2;
            int i16 = sign[i14];
            int i17 = sign[i15] == 0 ? 1 : 0;
            System.arraycopy(sign, i15 + i17, bArr3, ((D / 2) - i16) + i17, i16 - i17);
            int i18 = i16 + 1 + i15;
            int i19 = i18 + 1;
            int i23 = sign[i18];
            int i24 = sign[i19] != 0 ? 0 : 1;
            System.arraycopy(sign, i19 + i24, bArr3, (D - i23) + i24, i23 - i24);
            sign = bArr3;
        }
        byte[] bArr4 = this.f83725d;
        return bArr4.length == 0 ? sign : kg.t.u(bArr4, sign);
    }
}
