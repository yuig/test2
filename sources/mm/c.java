package mm;

import g4.u;
import java.nio.ByteBuffer;
import kh2.u2;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public int f87566a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f87567b;

    /* renamed from: c, reason: collision with root package name */
    public int f87568c;

    /* renamed from: d, reason: collision with root package name */
    public int f87569d;

    /* renamed from: e, reason: collision with root package name */
    public final u f87570e;

    public c() {
        if (u.f63478a == null) {
            u.f63478a = new u();
        }
        this.f87570e = u.f63478a;
    }

    public final int a(int i13) {
        return this.f87567b.getInt(i13) + i13;
    }

    public final int b(int i13) {
        if (i13 < this.f87569d) {
            return this.f87567b.getShort(this.f87568c + i13);
        }
        return 0;
    }

    public final void c(int i13, ByteBuffer byteBuffer) {
        this.f87567b = byteBuffer;
        if (byteBuffer == null) {
            this.f87566a = 0;
            this.f87568c = 0;
            this.f87569d = 0;
        } else {
            this.f87566a = i13;
            int i14 = i13 - byteBuffer.getInt(i13);
            this.f87568c = i14;
            this.f87569d = this.f87567b.getShort(i14);
        }
    }

    public final String d(int i13) {
        ByteBuffer byteBuffer = this.f87567b;
        int i14 = byteBuffer.getInt(i13) + i13;
        int i15 = byteBuffer.getInt(i14);
        int i16 = i14 + 4;
        this.f87570e.getClass();
        if (!byteBuffer.hasArray()) {
            if ((i16 | i15 | ((byteBuffer.limit() - i16) - i15)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i16), Integer.valueOf(i15)));
            }
            int i17 = i16 + i15;
            char[] cArr = new char[i15];
            int i18 = 0;
            while (i16 < i17) {
                byte b13 = byteBuffer.get(i16);
                if (!u2.M0(b13)) {
                    break;
                }
                i16++;
                cArr[i18] = (char) b13;
                i18++;
            }
            int i19 = i18;
            while (i16 < i17) {
                int i23 = i16 + 1;
                byte b14 = byteBuffer.get(i16);
                if (u2.M0(b14)) {
                    int i24 = i19 + 1;
                    cArr[i19] = (char) b14;
                    while (i23 < i17) {
                        byte b15 = byteBuffer.get(i23);
                        if (!u2.M0(b15)) {
                            break;
                        }
                        i23++;
                        cArr[i24] = (char) b15;
                        i24++;
                    }
                    i19 = i24;
                    i16 = i23;
                } else if (b14 < -32) {
                    if (i23 >= i17) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    i16 += 2;
                    u2.c0(b14, byteBuffer.get(i23), cArr, i19);
                    i19++;
                } else if (b14 < -16) {
                    if (i23 >= i17 - 1) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    int i25 = i16 + 2;
                    i16 += 3;
                    u2.b0(b14, byteBuffer.get(i23), byteBuffer.get(i25), cArr, i19);
                    i19++;
                } else {
                    if (i23 >= i17 - 2) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    byte b16 = byteBuffer.get(i23);
                    int i26 = i16 + 3;
                    byte b17 = byteBuffer.get(i16 + 2);
                    i16 += 4;
                    u2.a0(b14, b16, b17, byteBuffer.get(i26), cArr, i19);
                    i19 += 2;
                }
            }
            return new String(cArr, 0, i19);
        }
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset() + i16;
        if ((arrayOffset | i15 | ((array.length - arrayOffset) - i15)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(array.length), Integer.valueOf(arrayOffset), Integer.valueOf(i15)));
        }
        int i27 = arrayOffset + i15;
        char[] cArr2 = new char[i15];
        int i28 = 0;
        while (arrayOffset < i27) {
            byte b18 = array[arrayOffset];
            if (!u2.M0(b18)) {
                break;
            }
            arrayOffset++;
            cArr2[i28] = (char) b18;
            i28++;
        }
        int i29 = i28;
        while (arrayOffset < i27) {
            int i33 = arrayOffset + 1;
            byte b19 = array[arrayOffset];
            if (u2.M0(b19)) {
                int i34 = i29 + 1;
                cArr2[i29] = (char) b19;
                while (i33 < i27) {
                    byte b23 = array[i33];
                    if (!u2.M0(b23)) {
                        break;
                    }
                    i33++;
                    cArr2[i34] = (char) b23;
                    i34++;
                }
                i29 = i34;
                arrayOffset = i33;
            } else if (b19 < -32) {
                if (i33 >= i27) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                arrayOffset += 2;
                u2.c0(b19, array[i33], cArr2, i29);
                i29++;
            } else if (b19 < -16) {
                if (i33 >= i27 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i35 = arrayOffset + 2;
                arrayOffset += 3;
                u2.b0(b19, array[i33], array[i35], cArr2, i29);
                i29++;
            } else {
                if (i33 >= i27 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b24 = array[i33];
                int i36 = arrayOffset + 3;
                byte b25 = array[arrayOffset + 2];
                arrayOffset += 4;
                u2.a0(b19, b24, b25, array[i36], cArr2, i29);
                i29 += 2;
            }
        }
        return new String(cArr2, 0, i29);
    }

    public final int e(int i13) {
        int i14 = i13 + this.f87566a;
        return this.f87567b.getInt(i14) + i14 + 4;
    }

    public final int f(int i13) {
        int i14 = i13 + this.f87566a;
        return this.f87567b.getInt(this.f87567b.getInt(i14) + i14);
    }
}
