package ll;

import el.c1;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class q implements uk.a {

    /* renamed from: a, reason: collision with root package name */
    public final v f83762a;

    /* renamed from: b, reason: collision with root package name */
    public final uk.p f83763b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83764c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f83765d;

    public q(a aVar, z zVar, int i13, byte[] bArr) {
        this.f83762a = aVar;
        this.f83763b = zVar;
        this.f83764c = i13;
        this.f83765d = bArr;
    }

    public static q c(vk.f fVar) {
        byte[] b13 = ((ml.a) fVar.f125945c.f83754b).b();
        vk.l lVar = fVar.f125944b;
        a aVar = new a(b13, lVar.f125986c);
        y yVar = new y("HMAC" + lVar.f125989f, new SecretKeySpec(((ml.a) fVar.f125946d.f83754b).b(), "HMAC"));
        int i13 = lVar.f125987d;
        return new q(aVar, new z(yVar, i13), i13, fVar.f125947e.b());
    }

    @Override // uk.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        a aVar = (a) this.f83762a;
        aVar.getClass();
        int length = bArr.length;
        int i13 = aVar.f83670b;
        int i14 = Integer.MAX_VALUE - i13;
        if (length > i14) {
            throw new GeneralSecurityException(a.a.d("plaintext length can not exceed ", i14));
        }
        byte[] bArr3 = new byte[bArr.length + i13];
        byte[] s13 = jk.r.s(i13);
        System.arraycopy(s13, 0, bArr3, 0, i13);
        aVar.a(bArr, 0, bArr.length, bArr3, aVar.f83670b, s13, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return kg.t.u(this.f83765d, bArr3, this.f83763b.b(kg.t.u(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // uk.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f83765d;
        int length2 = bArr3.length;
        int i13 = this.f83764c;
        if (length < length2 + i13) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!c1.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr3.length, bArr.length - i13);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i13, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f83763b.a(copyOfRange2, kg.t.u(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        a aVar = (a) this.f83762a;
        aVar.getClass();
        int length3 = copyOfRange.length;
        int i14 = aVar.f83670b;
        if (length3 < i14) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr4 = new byte[i14];
        System.arraycopy(copyOfRange, 0, bArr4, 0, i14);
        int length4 = copyOfRange.length;
        int i15 = aVar.f83670b;
        byte[] bArr5 = new byte[length4 - i15];
        aVar.a(copyOfRange, i15, copyOfRange.length - i15, bArr5, 0, bArr4, false);
        return bArr5;
    }
}
