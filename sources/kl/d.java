package kl;

import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateCrtKey;
import ll.j0;
import ll.u;
import uk.r;

/* loaded from: classes3.dex */
public final class d implements r {
    public d(r rVar, byte[] bArr, byte[] bArr2) {
    }

    public d(RSAPrivateCrtKey rSAPrivateCrtKey, u uVar, u uVar2, int i13, byte[] bArr, byte[] bArr2) {
        if (yk.e.f139223b.get()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        j0.d(uVar);
        if (!uVar.equals(uVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        j0.b(rSAPrivateCrtKey.getModulus().bitLength());
        j0.c(rSAPrivateCrtKey.getPublicExponent());
    }
}
