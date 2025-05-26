package ll;

import el.c1;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class h implements uk.s {

    /* renamed from: g, reason: collision with root package name */
    public static final yk.d f83731g = yk.d.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f83732h = new byte[0];

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f83733i = {0};

    /* renamed from: j, reason: collision with root package name */
    public static final pd.d0 f83734j;

    /* renamed from: k, reason: collision with root package name */
    public static final pd.d0 f83735k;

    /* renamed from: l, reason: collision with root package name */
    public static final pd.d0 f83736l;

    /* renamed from: a, reason: collision with root package name */
    public final ECPublicKey f83737a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83738b;

    /* renamed from: c, reason: collision with root package name */
    public final o f83739c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f83740d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f83741e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f83742f;

    static {
        qq2.c a13 = pd.d0.a();
        a13.a(u.SHA256, jl.b.f76797b);
        a13.a(u.SHA384, jl.b.f76798c);
        a13.a(u.SHA512, jl.b.f76799d);
        f83734j = a13.b();
        qq2.c a14 = pd.d0.a();
        a14.a(o.IEEE_P1363, jl.c.f76806b);
        a14.a(o.DER, jl.c.f76807c);
        f83735k = a14.b();
        qq2.c a15 = pd.d0.a();
        a15.a(n.NIST_P256, jl.a.f76788c);
        a15.a(n.NIST_P384, jl.a.f76789d);
        a15.a(n.NIST_P521, jl.a.f76790e);
        f83736l = a15.b();
    }

    public h(ECPublicKey eCPublicKey, u uVar, o oVar, byte[] bArr, byte[] bArr2) {
        if (!f83731g.isCompatible()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        el.f.b(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        j0.d(uVar);
        this.f83738b = uVar + "withECDSA";
        this.f83737a = eCPublicKey;
        this.f83739c = oVar;
        this.f83740d = bArr;
        this.f83741e = bArr2;
        this.f83742f = el.a.u2();
    }

    public static h b(jl.g gVar) {
        n nVar = (n) f83736l.c(gVar.f76844c.f76829b);
        ECPoint eCPoint = gVar.f76845d;
        ECPublicKey L = el.a.L(nVar, eCPoint.getAffineX().toByteArray(), eCPoint.getAffineY().toByteArray());
        jl.e eVar = gVar.f76844c;
        return new h(L, (u) f83734j.c(eVar.f76830c), (o) f83735k.c(eVar.f76828a), gVar.f76846e.b(), eVar.f76831d.equals(jl.d.f76818d) ? f83733i : f83732h);
    }

    @Override // uk.s
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f83740d;
        if (bArr3.length == 0) {
            c(bArr, bArr2);
        } else {
            if (!c1.b(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            c(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        }
    }

    public final void c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int i13;
        o oVar = this.f83739c;
        o oVar2 = o.IEEE_P1363;
        ECPublicKey eCPublicKey = this.f83737a;
        if (oVar == oVar2) {
            if (bArr.length != el.a.D(eCPublicKey.getParams().getCurve()) * 2) {
                throw new GeneralSecurityException("Invalid signature");
            }
            if (bArr.length % 2 != 0 || bArr.length == 0 || bArr.length > 132) {
                throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
            }
            byte[] H2 = el.a.H2(Arrays.copyOf(bArr, bArr.length / 2));
            byte[] H22 = el.a.H2(Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length));
            int length = H2.length + 4 + H22.length;
            if (length >= 128) {
                bArr3 = new byte[length + 3];
                bArr3[0] = 48;
                bArr3[1] = -127;
                bArr3[2] = (byte) length;
                i13 = 3;
            } else {
                bArr3 = new byte[length + 2];
                bArr3[0] = 48;
                bArr3[1] = (byte) length;
                i13 = 2;
            }
            int i14 = i13 + 1;
            bArr3[i13] = 2;
            int i15 = i13 + 2;
            bArr3[i14] = (byte) H2.length;
            System.arraycopy(H2, 0, bArr3, i15, H2.length);
            int length2 = i15 + H2.length;
            bArr3[length2] = 2;
            bArr3[length2 + 1] = (byte) H22.length;
            System.arraycopy(H22, 0, bArr3, length2 + 2, H22.length);
            bArr = bArr3;
        }
        if (!el.a.k2(bArr)) {
            throw new GeneralSecurityException("Invalid signature");
        }
        String str = this.f83738b;
        Provider provider = this.f83742f;
        Signature signature = provider != null ? Signature.getInstance(str, provider) : (Signature) s.f83770d.a(str);
        signature.initVerify(eCPublicKey);
        signature.update(bArr2);
        byte[] bArr4 = this.f83741e;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(bArr)) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
