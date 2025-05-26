package ll;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class k implements uk.r {

    /* renamed from: a, reason: collision with root package name */
    public static final yk.d f83755a = yk.d.ALGORITHM_NOT_FIPS;

    public k(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!f83755a.isCompatible()) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given private key's length is not 32");
        }
        el.a.z2(el.a.N(bArr)).H();
    }
}
