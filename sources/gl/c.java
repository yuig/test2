package gl;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class c implements fl.e {

    /* renamed from: a, reason: collision with root package name */
    public static final yk.d f65725a = yk.d.ALGORITHM_NOT_FIPS;

    public c() {
        if (!f65725a.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
    }
}
