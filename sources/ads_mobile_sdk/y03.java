package ads_mobile_sdk;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class y03 implements a.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f13934a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13935b;

    /* renamed from: c, reason: collision with root package name */
    public final t02 f13936c;

    public y03(byte[] bArr, jl jlVar, int i13) {
        this.f13936c = new t02(bArr);
        this.f13934a = jlVar.a();
        this.f13935b = i13;
    }

    public static a.y9 a(b13 b13Var) {
        int i13 = b13Var.f2631a.f5354b;
        if (i13 < 8 || i13 > 12) {
            throw new GeneralSecurityException("invalid salt size");
        }
        return new y03(b13Var.f2632b.f7789a.a(), b13Var.f2633c, b13Var.f2631a.f5354b);
    }

    @Override // a.y9
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr3 = this.f13934a;
            if (length >= bArr3.length + this.f13935b + 28) {
                if (sx2.a(bArr3, bArr)) {
                    byte[] bArr4 = this.f13934a;
                    int length2 = bArr4.length + this.f13935b;
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr4.length, length2);
                    byte[] bArr5 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                    byte[] bArr6 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                    if (copyOfRange.length <= 12 && copyOfRange.length >= 8) {
                        System.arraycopy(copyOfRange, 0, bArr5, 4, copyOfRange.length);
                        System.arraycopy(copyOfRange, 0, bArr6, 4, copyOfRange.length);
                        byte[] bArr7 = new byte[32];
                        System.arraycopy(this.f13936c.a(16, bArr5), 0, bArr7, 0, 16);
                        System.arraycopy(this.f13936c.a(16, bArr6), 0, bArr7, 16, 16);
                        int i13 = 12 + length2;
                        return new hs0(bArr7).a(Arrays.copyOfRange(bArr, length2, i13), bArr, i13, bArr2);
                    }
                    throw new GeneralSecurityException("invalid salt size");
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new NullPointerException("ciphertext is null");
    }
}
