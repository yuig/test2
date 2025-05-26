package ads_mobile_sdk;

import a.a9;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class k13 implements a.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final a9 f7063a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f7064b;

    public k13(byte[] bArr, byte[] bArr2) {
        this.f7063a = new a9(bArr);
        this.f7064b = bArr2;
    }

    @Override // a.y9
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f7064b;
        if (bArr3.length == 0) {
            if (bArr.length < 40) {
                throw new GeneralSecurityException("ciphertext too short");
            }
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.f7063a.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
        }
        if (!sx2.a(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, this.f7064b.length, bArr.length);
        if (copyOfRange.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf2 = Arrays.copyOf(copyOfRange, 24);
        return this.f7063a.a(ByteBuffer.wrap(copyOfRange, 24, copyOfRange.length - 24), copyOf2, bArr2);
    }
}
