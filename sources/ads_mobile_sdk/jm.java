package ads_mobile_sdk;

import a.e7;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class jm implements a.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final e7 f6875a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6876b;

    public jm(byte[] bArr, byte[] bArr2) {
        this.f6875a = new e7(bArr);
        this.f6876b = bArr2;
    }

    @Override // a.y9
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f6876b;
        if (bArr3.length == 0) {
            if (bArr.length < 28) {
                throw new GeneralSecurityException("ciphertext too short");
            }
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            return this.f6875a.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), copyOf, bArr2);
        }
        if (!sx2.a(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, this.f6876b.length, bArr.length);
        if (copyOfRange.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf2 = Arrays.copyOf(copyOfRange, 12);
        return this.f6875a.a(ByteBuffer.wrap(copyOfRange, 12, copyOfRange.length - 12), copyOf2, bArr2);
    }
}
