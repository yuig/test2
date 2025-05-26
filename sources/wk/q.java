package wk;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130081a;

    /* renamed from: b, reason: collision with root package name */
    public int f130082b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f130083c;

    public q(int i13) {
        this.f130081a = i13;
        if (i13 != 3) {
            return;
        }
        this.f130083c = new kotlin.collections.v();
    }

    public final ByteBuffer a(int i13, byte[] bArr) {
        int[] b13 = b(n.e(bArr), i13);
        int[] iArr = (int[]) b13.clone();
        n.d(iArr);
        for (int i14 = 0; i14 < b13.length; i14++) {
            b13[i14] = b13[i14] + iArr[i14];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b13, 0, 16);
        return order;
    }

    public abstract int[] b(int[] iArr, int i13);

    public abstract int c();

    public final void d(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length != c()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + c());
        }
        int remaining = byteBuffer2.remaining();
        int i13 = remaining / 64;
        int i14 = i13 + 1;
        for (int i15 = 0; i15 < i14; i15++) {
            ByteBuffer a13 = a(this.f130082b + i15, bArr);
            if (i15 == i13) {
                kg.t.f1(byteBuffer, byteBuffer2, a13, remaining % 64);
            } else {
                kg.t.f1(byteBuffer, byteBuffer2, a13, 64);
            }
        }
    }

    public final String toString() {
        switch (this.f130081a) {
            case 1:
                return String.format("%s(0x%04x)", (String) this.f130083c, Integer.valueOf(this.f130082b));
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(String str, int i13, int i14) {
        this(str, i13);
        this.f130081a = 1;
    }

    public q(byte[] bArr, int i13) {
        this.f130081a = 0;
        if (bArr.length == 32) {
            this.f130083c = n.e(bArr);
            this.f130082b = i13;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public q(String str, int i13) {
        this.f130081a = 1;
        this.f130083c = str;
        this.f130082b = i13;
    }
}
