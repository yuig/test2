package kl;

import el.c1;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import jl.a0;
import ll.j0;
import uk.s;

/* loaded from: classes3.dex */
public final class k implements s {

    /* renamed from: f, reason: collision with root package name */
    public static final yk.d f80048f = yk.d.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f80049g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f80050h = {0};

    /* renamed from: i, reason: collision with root package name */
    public static final Provider f80051i;

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f80052a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80053b;

    /* renamed from: c, reason: collision with root package name */
    public final PSSParameterSpec f80054c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f80055d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f80056e;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        if ((!java.util.Objects.equals(java.lang.System.getProperty("java.vendor"), "The Android Project") ? null : el.a.G()).intValue() <= 23) goto L12;
     */
    static {
        /*
            yk.d r0 = yk.d.ALGORITHM_REQUIRES_BORINGCRYPTO
            kl.k.f80048f = r0
            r0 = 0
            byte[] r1 = new byte[r0]
            kl.k.f80049g = r1
            r1 = 1
            byte[] r1 = new byte[r1]
            r1[r0] = r0
            kl.k.f80050h = r1
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
            r2 = 23
            if (r0 > r2) goto L38
            goto L3c
        L38:
            java.security.Provider r1 = el.a.u2()
        L3c:
            kl.k.f80051i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kl.k.<clinit>():void");
    }

    public k(RSAPublicKey rSAPublicKey, a0 a0Var, a0 a0Var2, int i13, byte[] bArr, byte[] bArr2) {
        if (!f80048f.isCompatible()) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!a0Var.equals(a0Var2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        j0.b(rSAPublicKey.getModulus().bitLength());
        j0.c(rSAPublicKey.getPublicExponent());
        this.f80052a = rSAPublicKey;
        this.f80053b = b(a0Var);
        this.f80054c = c(a0Var, a0Var2, i13);
        this.f80055d = bArr;
        this.f80056e = bArr2;
    }

    public static String b(a0 a0Var) {
        if (a0Var == a0.f76793b) {
            return "SHA256withRSA/PSS";
        }
        if (a0Var == a0.f76794c) {
            return "SHA384withRSA/PSS";
        }
        if (a0Var == a0.f76795d) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: " + a0Var);
    }

    public static PSSParameterSpec c(a0 a0Var, a0 a0Var2, int i13) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        a0 a0Var3 = a0.f76793b;
        a0 a0Var4 = a0.f76795d;
        a0 a0Var5 = a0.f76794c;
        if (a0Var == a0Var3) {
            str = "SHA-256";
        } else if (a0Var == a0Var5) {
            str = "SHA-384";
        } else {
            if (a0Var != a0Var4) {
                throw new IllegalArgumentException("Unsupported MD hash: " + a0Var);
            }
            str = "SHA-512";
        }
        if (a0Var2 == a0Var3) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (a0Var2 == a0Var5) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (a0Var2 != a0Var4) {
                throw new IllegalArgumentException("Unsupported MGF1 hash: " + a0Var2);
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i13, 1);
    }

    @Override // uk.s
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f80055d;
        if (!c1.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f80053b, f80051i);
        signature.initVerify(this.f80052a);
        signature.setParameter(this.f80054c);
        signature.update(bArr2);
        byte[] bArr4 = this.f80056e;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        if (!signature.verify(bArr, bArr3.length, bArr.length - bArr3.length)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
