package kl;

import el.c1;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import jl.t;
import ll.j0;
import uk.s;

/* loaded from: classes3.dex */
public final class h implements s {

    /* renamed from: e, reason: collision with root package name */
    public static final yk.d f80029e = yk.d.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f80030f = new byte[0];

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f80031g = {0};

    /* renamed from: h, reason: collision with root package name */
    public static final Provider f80032h;

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f80033a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80034b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f80035c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f80036d;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        if ((!java.util.Objects.equals(java.lang.System.getProperty("java.vendor"), "The Android Project") ? null : el.a.G()).intValue() <= 21) goto L12;
     */
    static {
        /*
            yk.d r0 = yk.d.ALGORITHM_REQUIRES_BORINGCRYPTO
            kl.h.f80029e = r0
            r0 = 0
            byte[] r1 = new byte[r0]
            kl.h.f80030f = r1
            r1 = 1
            byte[] r1 = new byte[r1]
            r1[r0] = r0
            kl.h.f80031g = r1
            java.lang.String r0 = "java.vendor"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            java.lang.String r2 = "The Android Project"
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L38
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r0 = java.util.Objects.equals(r0, r2)
            r1 = 0
            if (r0 != 0) goto L2b
            r0 = r1
            goto L2f
        L2b:
            java.lang.Integer r0 = el.a.G()
        L2f:
            int r0 = r0.intValue()
            r2 = 21
            if (r0 > r2) goto L38
            goto L3c
        L38:
            java.security.Provider r1 = el.a.u2()
        L3c:
            kl.h.f80032h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kl.h.<clinit>():void");
    }

    public h(RSAPublicKey rSAPublicKey, t tVar, byte[] bArr, byte[] bArr2) {
        String str;
        if (!f80029e.isCompatible()) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        j0.b(rSAPublicKey.getModulus().bitLength());
        j0.c(rSAPublicKey.getPublicExponent());
        this.f80033a = rSAPublicKey;
        if (tVar == t.f76896b) {
            str = "SHA256withRSA";
        } else if (tVar == t.f76897c) {
            str = "SHA384withRSA";
        } else {
            if (tVar != t.f76898d) {
                throw new GeneralSecurityException("unknown hash type");
            }
            str = "SHA512withRSA";
        }
        this.f80034b = str;
        this.f80035c = bArr;
        this.f80036d = bArr2;
    }

    @Override // uk.s
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f80035c;
        if (!c1.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Provider provider = f80032h;
        if (provider == null) {
            throw new GeneralSecurityException("Conscrypt Provider not found");
        }
        Signature signature = Signature.getInstance(this.f80034b, provider);
        signature.initVerify(this.f80033a);
        signature.update(bArr2);
        byte[] bArr4 = this.f80036d;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
