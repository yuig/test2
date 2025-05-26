package mm;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import g4.u;
import gi.l1;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a */
    public ByteBuffer f87553a;

    /* renamed from: b */
    public int f87554b;

    /* renamed from: c */
    public int f87555c;

    /* renamed from: d */
    public int[] f87556d;

    /* renamed from: e */
    public int f87557e;

    /* renamed from: f */
    public boolean f87558f;

    /* renamed from: g */
    public boolean f87559g;

    /* renamed from: h */
    public int f87560h;

    /* renamed from: i */
    public int[] f87561i;

    /* renamed from: j */
    public int f87562j;

    /* renamed from: k */
    public int f87563k;

    /* renamed from: l */
    public final l1 f87564l;

    /* renamed from: m */
    public final u f87565m;

    public b() {
        a aVar = a.f87552c;
        if (u.f63478a == null) {
            u.f63478a = new u();
        }
        u uVar = u.f63478a;
        this.f87555c = 1;
        this.f87556d = null;
        this.f87557e = 0;
        this.f87558f = false;
        this.f87559g = false;
        this.f87561i = new int[16];
        this.f87562j = 0;
        this.f87563k = 0;
        this.f87564l = aVar;
        ByteBuffer a13 = aVar.a(1024);
        this.f87553a = a13;
        this.f87565m = uVar;
        this.f87554b = a13.capacity();
    }

    public final void a(int i13, byte b13) {
        if (b13 != 0) {
            k(1, 0);
            ByteBuffer byteBuffer = this.f87553a;
            int i14 = this.f87554b - 1;
            this.f87554b = i14;
            byteBuffer.put(i14, b13);
            n(i13);
        }
    }

    public final void b(int i13, float f13) {
        if (f13 != 0.0d) {
            k(4, 0);
            ByteBuffer byteBuffer = this.f87553a;
            int i14 = this.f87554b - 4;
            this.f87554b = i14;
            byteBuffer.putFloat(i14, f13);
            n(i13);
        }
    }

    public final void c(int i13) {
        k(4, 0);
        int j13 = (j() - i13) + 4;
        ByteBuffer byteBuffer = this.f87553a;
        int i14 = this.f87554b - 4;
        this.f87554b = i14;
        byteBuffer.putInt(i14, j13);
    }

    public final void d(int i13, int i14) {
        if (i14 != 0) {
            c(i14);
            n(i13);
        }
    }

    public final void e(short s13) {
        k(2, 0);
        ByteBuffer byteBuffer = this.f87553a;
        int i13 = this.f87554b - 2;
        this.f87554b = i13;
        byteBuffer.putShort(i13, s13);
    }

    public final int f(CharSequence charSequence) {
        char c13;
        char c14;
        int i13;
        int i14;
        int i15;
        int i16;
        char charAt;
        this.f87565m.getClass();
        int length = charSequence.length();
        int i17 = 0;
        int i18 = 0;
        while (i18 < length && charSequence.charAt(i18) < 128) {
            i18++;
        }
        int i19 = length;
        while (true) {
            c13 = 55296;
            c14 = 2048;
            if (i18 >= length) {
                break;
            }
            char charAt2 = charSequence.charAt(i18);
            if (charAt2 < 2048) {
                i19 += (127 - charAt2) >>> 31;
                i18++;
            } else {
                int length2 = charSequence.length();
                int i23 = 0;
                while (i18 < length2) {
                    char charAt3 = charSequence.charAt(i18);
                    if (charAt3 < 2048) {
                        i23 += (127 - charAt3) >>> 31;
                    } else {
                        i23 += 2;
                        if (55296 <= charAt3 && charAt3 <= 57343) {
                            if (Character.codePointAt(charSequence, i18) < 65536) {
                                throw new d(i18, length2);
                            }
                            i18++;
                        }
                    }
                    i18++;
                }
                i19 += i23;
            }
        }
        if (i19 < length) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i19 + 4294967296L));
        }
        k(1, 0);
        ByteBuffer byteBuffer = this.f87553a;
        int i24 = this.f87554b - 1;
        this.f87554b = i24;
        byteBuffer.put(i24, (byte) 0);
        p(1, i19, 1);
        ByteBuffer byteBuffer2 = this.f87553a;
        int i25 = this.f87554b - i19;
        this.f87554b = i25;
        byteBuffer2.position(i25);
        ByteBuffer byteBuffer3 = this.f87553a;
        if (byteBuffer3.hasArray()) {
            int arrayOffset = byteBuffer3.arrayOffset();
            byte[] array = byteBuffer3.array();
            int position = byteBuffer3.position() + arrayOffset;
            int remaining = byteBuffer3.remaining();
            int length3 = charSequence.length();
            int i26 = remaining + position;
            while (i17 < length3) {
                int i27 = i17 + position;
                if (i27 >= i26 || (charAt = charSequence.charAt(i17)) >= 128) {
                    break;
                }
                array[i27] = (byte) charAt;
                i17++;
            }
            if (i17 == length3) {
                i14 = position + length3;
            } else {
                i14 = position + i17;
                while (i17 < length3) {
                    char charAt4 = charSequence.charAt(i17);
                    if (charAt4 < 128 && i14 < i26) {
                        array[i14] = (byte) charAt4;
                        i14++;
                    } else if (charAt4 < c14 && i14 <= i26 - 2) {
                        int i28 = i14 + 1;
                        array[i14] = (byte) ((charAt4 >>> 6) | 960);
                        i14 += 2;
                        array[i28] = (byte) ((charAt4 & '?') | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                    } else {
                        if ((charAt4 >= c13 && 57343 >= charAt4) || i14 > i26 - 3) {
                            if (i14 > i26 - 4) {
                                if (55296 <= charAt4 && charAt4 <= 57343 && ((i15 = i17 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt4, charSequence.charAt(i15)))) {
                                    throw new d(i17, length3);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt4 + " at index " + i14);
                            }
                            int i29 = i17 + 1;
                            if (i29 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i29);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint = Character.toCodePoint(charAt4, charAt5);
                                    array[i14] = (byte) ((codePoint >>> 18) | RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM);
                                    array[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                                    int i33 = i14 + 3;
                                    array[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                                    i14 += 4;
                                    array[i33] = (byte) ((codePoint & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                                    i17 = i29;
                                } else {
                                    i16 = 1;
                                    i17 = i29;
                                }
                            } else {
                                i16 = 1;
                            }
                            throw new d(i17 - i16, length3);
                        }
                        array[i14] = (byte) ((charAt4 >>> '\f') | 480);
                        int i34 = i14 + 2;
                        array[i14 + 1] = (byte) (((charAt4 >>> 6) & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                        i14 += 3;
                        array[i34] = (byte) ((charAt4 & '?') | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                    }
                    i17++;
                    c13 = 55296;
                    c14 = 2048;
                }
            }
            byteBuffer3.position(i14 - arrayOffset);
        } else {
            int length4 = charSequence.length();
            int position2 = byteBuffer3.position();
            while (i17 < length4) {
                try {
                    char charAt6 = charSequence.charAt(i17);
                    if (charAt6 >= 128) {
                        break;
                    }
                    byteBuffer3.put(position2 + i17, (byte) charAt6);
                    i17++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i17 == length4) {
                byteBuffer3.position(position2 + i17);
            } else {
                position2 += i17;
                while (i17 < length4) {
                    char charAt7 = charSequence.charAt(i17);
                    if (charAt7 >= 128) {
                        if (charAt7 < 2048) {
                            int i35 = position2 + 1;
                            try {
                                byteBuffer3.put(position2, (byte) ((charAt7 >>> 6) | RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY));
                                byteBuffer3.put(i35, (byte) ((charAt7 & '?') | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
                                position2 = i35;
                                i13 = 1;
                            } catch (IndexOutOfBoundsException unused2) {
                                position2 = i35;
                            }
                        } else {
                            if (charAt7 >= 55296 && 57343 >= charAt7) {
                                int i36 = i17 + 1;
                                if (i36 != length4) {
                                    try {
                                        char charAt8 = charSequence.charAt(i36);
                                        if (Character.isSurrogatePair(charAt7, charAt8)) {
                                            int codePoint2 = Character.toCodePoint(charAt7, charAt8);
                                            int i37 = position2 + 1;
                                            try {
                                                byteBuffer3.put(position2, (byte) ((codePoint2 >>> 18) | RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM));
                                                int i38 = position2 + 2;
                                                try {
                                                    byteBuffer3.put(i37, (byte) (((codePoint2 >>> 12) & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
                                                    position2 += 3;
                                                    byteBuffer3.put(i38, (byte) (((codePoint2 >>> 6) & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
                                                    byteBuffer3.put(position2, (byte) ((codePoint2 & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
                                                    i17 = i36;
                                                } catch (IndexOutOfBoundsException unused3) {
                                                    i17 = i36;
                                                    position2 = i38;
                                                }
                                            } catch (IndexOutOfBoundsException unused4) {
                                                position2 = i37;
                                                i17 = i36;
                                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i17) + " at index " + (Math.max(i17, (position2 - byteBuffer3.position()) + 1) + byteBuffer3.position()));
                                            }
                                        } else {
                                            i17 = i36;
                                        }
                                    } catch (IndexOutOfBoundsException unused5) {
                                    }
                                }
                                throw new d(i17, length4);
                            }
                            int i39 = position2 + 1;
                            try {
                                byteBuffer3.put(position2, (byte) ((charAt7 >>> '\f') | RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL));
                                position2 += 2;
                                byteBuffer3.put(i39, (byte) (((charAt7 >>> 6) & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
                                byteBuffer3.put(position2, (byte) ((charAt7 & '?') | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
                            } catch (IndexOutOfBoundsException unused6) {
                                position2 = i39;
                            }
                            i13 = 1;
                            i17 += i13;
                            position2 += i13;
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i17) + " at index " + (Math.max(i17, (position2 - byteBuffer3.position()) + 1) + byteBuffer3.position()));
                    }
                    byteBuffer3.put(position2, (byte) charAt7);
                    i13 = 1;
                    i17 += i13;
                    position2 += i13;
                }
                byteBuffer3.position(position2);
            }
        }
        return h();
    }

    public final int g() {
        int i13;
        if (this.f87556d == null || !this.f87558f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        k(4, 0);
        ByteBuffer byteBuffer = this.f87553a;
        int i14 = this.f87554b - 4;
        this.f87554b = i14;
        byteBuffer.putInt(i14, 0);
        int j13 = j();
        int i15 = this.f87557e - 1;
        while (i15 >= 0 && this.f87556d[i15] == 0) {
            i15--;
        }
        for (int i16 = i15; i16 >= 0; i16--) {
            int i17 = this.f87556d[i16];
            e((short) (i17 != 0 ? j13 - i17 : 0));
        }
        e((short) (j13 - this.f87560h));
        e((short) ((i15 + 3) * 2));
        int i18 = 0;
        loop2: while (true) {
            if (i18 >= this.f87562j) {
                i13 = 0;
                break;
            }
            int capacity = this.f87553a.capacity() - this.f87561i[i18];
            int i19 = this.f87554b;
            short s13 = this.f87553a.getShort(capacity);
            if (s13 == this.f87553a.getShort(i19)) {
                for (int i23 = 2; i23 < s13; i23 += 2) {
                    if (this.f87553a.getShort(capacity + i23) != this.f87553a.getShort(i19 + i23)) {
                        break;
                    }
                }
                i13 = this.f87561i[i18];
                break loop2;
            }
            i18++;
        }
        if (i13 != 0) {
            int capacity2 = this.f87553a.capacity() - j13;
            this.f87554b = capacity2;
            this.f87553a.putInt(capacity2, i13 - j13);
        } else {
            int i24 = this.f87562j;
            int[] iArr = this.f87561i;
            if (i24 == iArr.length) {
                this.f87561i = Arrays.copyOf(iArr, i24 * 2);
            }
            int[] iArr2 = this.f87561i;
            int i25 = this.f87562j;
            this.f87562j = i25 + 1;
            iArr2[i25] = j();
            ByteBuffer byteBuffer2 = this.f87553a;
            byteBuffer2.putInt(byteBuffer2.capacity() - j13, j() - j13);
        }
        this.f87558f = false;
        return j13;
    }

    public final int h() {
        if (!this.f87558f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f87558f = false;
        int i13 = this.f87563k;
        ByteBuffer byteBuffer = this.f87553a;
        int i14 = this.f87554b - 4;
        this.f87554b = i14;
        byteBuffer.putInt(i14, i13);
        return j();
    }

    public final void i(int i13) {
        k(this.f87555c, 4);
        c(i13);
        this.f87553a.position(this.f87554b);
        this.f87559g = true;
    }

    public final int j() {
        return this.f87553a.capacity() - this.f87554b;
    }

    public final void k(int i13, int i14) {
        int i15;
        if (i13 > this.f87555c) {
            this.f87555c = i13;
        }
        int i16 = ((~((this.f87553a.capacity() - this.f87554b) + i14)) + 1) & (i13 - 1);
        while (this.f87554b < i16 + i13 + i14) {
            int capacity = this.f87553a.capacity();
            ByteBuffer byteBuffer = this.f87553a;
            int capacity2 = byteBuffer.capacity();
            if (capacity2 == 0) {
                i15 = 1024;
            } else {
                i15 = 2147483639;
                if (capacity2 == 2147483639) {
                    throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                }
                if (((-1073741824) & capacity2) == 0) {
                    i15 = capacity2 << 1;
                }
            }
            byteBuffer.position(0);
            l1 l1Var = this.f87564l;
            ByteBuffer a13 = l1Var.a(i15);
            a13.position(a13.clear().capacity() - capacity2);
            a13.put(byteBuffer);
            this.f87553a = a13;
            if (byteBuffer != a13) {
                l1Var.getClass();
            }
            this.f87554b = (this.f87553a.capacity() - capacity) + this.f87554b;
        }
        for (int i17 = 0; i17 < i16; i17++) {
            ByteBuffer byteBuffer2 = this.f87553a;
            int i18 = this.f87554b - 1;
            this.f87554b = i18;
            byteBuffer2.put(i18, (byte) 0);
        }
    }

    public final void l(int i13, int i14) {
        int capacity = this.f87553a.capacity() - i13;
        if (this.f87553a.getShort((capacity - this.f87553a.getInt(capacity)) + i14) == 0) {
            throw new AssertionError(a.a.e("FlatBuffers: field ", i14, " must be set"));
        }
    }

    public final byte[] m() {
        int i13 = this.f87554b;
        int capacity = this.f87553a.capacity() - this.f87554b;
        if (!this.f87559g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
        byte[] bArr = new byte[capacity];
        this.f87553a.position(i13);
        this.f87553a.get(bArr);
        return bArr;
    }

    public final void n(int i13) {
        this.f87556d[i13] = j();
    }

    public final void o(int i13) {
        if (this.f87558f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        int[] iArr = this.f87556d;
        if (iArr == null || iArr.length < i13) {
            this.f87556d = new int[i13];
        }
        this.f87557e = i13;
        Arrays.fill(this.f87556d, 0, i13, 0);
        this.f87558f = true;
        this.f87560h = j();
    }

    public final void p(int i13, int i14, int i15) {
        if (this.f87558f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        this.f87563k = i14;
        int i16 = i13 * i14;
        k(4, i16);
        k(i15, i16);
        this.f87558f = true;
    }
}
