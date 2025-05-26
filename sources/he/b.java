package he;

import java.lang.reflect.Array;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68935a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f68936b;

    /* renamed from: c, reason: collision with root package name */
    public int f68937c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f68938d;

    public b(int i13, FloatBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f68938d = buffer;
        this.f68936b = i13;
        if (1 > i13 || i13 >= 5) {
            throw new IllegalArgumentException("there should be 1 to 4 components per item".toString());
        }
    }

    public final void a(int i13) {
        this.f68937c = i13;
        pe.i.J(new wd2.a(this, 0), "enable vertex attrib array");
        pe.i.J(new wd2.a(this, 1), "set vertex attrib pointer");
    }

    public final byte b(int i13, int i14) {
        return ((byte[][]) this.f68938d)[i14][i13];
    }

    public final void c() {
        pe.i.J(new wd2.a(this, 2), "");
    }

    public final void d(int i13, int i14, int i15) {
        ((byte[][]) this.f68938d)[i14][i13] = (byte) i15;
    }

    public final void e(int i13, int i14, boolean z13) {
        ((byte[][]) this.f68938d)[i14][i13] = z13 ? (byte) 1 : (byte) 0;
    }

    public final String toString() {
        switch (this.f68935a) {
            case 1:
                int i13 = this.f68936b;
                StringBuilder sb3 = new StringBuilder((i13 * 2 * this.f68937c) + 2);
                for (int i14 = 0; i14 < this.f68937c; i14++) {
                    byte[] bArr = ((byte[][]) this.f68938d)[i14];
                    for (int i15 = 0; i15 < i13; i15++) {
                        byte b13 = bArr[i15];
                        if (b13 == 0) {
                            sb3.append(" 0");
                        } else if (b13 != 1) {
                            sb3.append("  ");
                        } else {
                            sb3.append(" 1");
                        }
                    }
                    sb3.append('\n');
                }
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public b(int i13, int i14) {
        this.f68938d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i14, i13);
        this.f68936b = i13;
        this.f68937c = i14;
    }

    public b(byte[] bArr, int i13, int i14) {
        this.f68938d = bArr;
        this.f68936b = i13;
        this.f68937c = i14;
    }
}
