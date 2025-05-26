package wk;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
import ll.j0;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final yk.d f130078b = yk.d.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f130079a;

    public o(byte[] bArr) {
        if (!f130078b.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        a.g gVar = f.f130054a;
        j0.a(bArr.length);
        this.f130079a = new SecretKeySpec(bArr, "AES");
    }
}
