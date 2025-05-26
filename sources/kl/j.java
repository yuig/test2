package kl;

import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateCrtKey;
import jl.a0;
import ll.j0;
import uk.r;

/* loaded from: classes3.dex */
public final class j implements r {

    /* renamed from: a, reason: collision with root package name */
    public static final yk.d f80045a = yk.d.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f80046b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f80047c = {0};

    public j(RSAPrivateCrtKey rSAPrivateCrtKey, a0 a0Var, a0 a0Var2, int i13, byte[] bArr, byte[] bArr2) {
        if (!f80045a.isCompatible()) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        j0.b(rSAPrivateCrtKey.getModulus().bitLength());
        j0.c(rSAPrivateCrtKey.getPublicExponent());
        k.b(a0Var);
        k.c(a0Var, a0Var2, i13);
    }
}
