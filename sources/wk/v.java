package wk;

import el.c1;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import vk.s0;

/* loaded from: classes3.dex */
public final class v implements uk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130091a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f130092b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f130093c;

    public v(int i13, byte[] bArr, byte[] bArr2) {
        this.f130091a = i13;
        if (i13 != 2) {
            this.f130093c = new r(bArr, 0);
            this.f130092b = bArr2;
        } else {
            this.f130093c = new r(bArr, 1);
            this.f130092b = bArr2;
        }
    }

    public static v c(vk.y yVar) {
        return new v(1, ((ml.a) yVar.f126071c.f83754b).b(), yVar.f126072d.b());
    }

    public static v d(s0 s0Var) {
        return new v(2, ((ml.a) s0Var.f126040c.f83754b).b(), s0Var.f126041d.b());
    }

    @Override // uk.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int i13 = this.f130091a;
        byte[] bArr3 = this.f130092b;
        Object obj = this.f130093c;
        switch (i13) {
            case 0:
                return bArr3.length == 0 ? ((uk.a) obj).a(bArr, bArr2) : kg.t.u(bArr3, ((uk.a) obj).a(bArr, bArr2));
            case 1:
                ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] s13 = jk.r.s(12);
                allocate.put(s13);
                ((r) obj).b(allocate, s13, bArr, bArr2);
                byte[] array = allocate.array();
                return bArr3.length == 0 ? array : kg.t.u(bArr3, array);
            default:
                ByteBuffer allocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] s14 = jk.r.s(24);
                allocate2.put(s14);
                ((r) obj).b(allocate2, s14, bArr, bArr2);
                byte[] array2 = allocate2.array();
                return bArr3.length == 0 ? array2 : kg.t.u(bArr3, array2);
        }
    }

    @Override // uk.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int i13 = this.f130091a;
        byte[] bArr3 = this.f130092b;
        switch (i13) {
            case 0:
                int length = bArr3.length;
                Object obj = this.f130093c;
                if (length == 0) {
                    return ((uk.a) obj).b(bArr, bArr2);
                }
                if (c1.b(bArr3, bArr)) {
                    return ((uk.a) obj).b(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("wrong prefix");
            case 1:
                if (bArr3.length == 0) {
                    return e(bArr, bArr2);
                }
                if (c1.b(bArr3, bArr)) {
                    return e(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            default:
                if (bArr3.length == 0) {
                    return f(bArr, bArr2);
                }
                if (c1.b(bArr3, bArr)) {
                    return f(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
    }

    public final byte[] e(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        return ((r) this.f130093c).a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), copyOf, bArr2);
    }

    public final byte[] f(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 24);
        return ((r) this.f130093c).a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
    }

    public v(uk.a aVar, byte[] bArr) {
        this.f130091a = 0;
        this.f130093c = aVar;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f130092b = bArr;
    }
}
