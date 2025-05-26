package a;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class m0 implements s {
    public m0(int i13) {
        if (i13 == 1 && !l3.c.k()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
    }
}
