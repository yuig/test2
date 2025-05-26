package com.bugsnag.android.repackaged.dslplatform.json;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f29592e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public int f29593a;

    /* renamed from: b, reason: collision with root package name */
    public OutputStream f29594b;

    /* renamed from: d, reason: collision with root package name */
    public final m f29596d = new m();

    /* renamed from: c, reason: collision with root package name */
    public byte[] f29595c = new byte[4096];

    public final void a(int i13, int i14) {
        OutputStream outputStream = this.f29594b;
        if (outputStream == null) {
            byte[] bArr = this.f29595c;
            this.f29595c = Arrays.copyOf(bArr, (bArr.length / 2) + bArr.length + i14);
            return;
        }
        try {
            outputStream.write(this.f29595c, 0, i13);
            this.f29593a = 0;
            byte[] bArr2 = this.f29595c;
            if (i14 > bArr2.length) {
                this.f29595c = Arrays.copyOf(bArr2, (bArr2.length / 2) + bArr2.length + i14);
            }
        } catch (IOException e13) {
            throw new SerializationException("Unable to write to target stream.", e13);
        }
    }

    public final byte[] b(int i13) {
        int i14 = this.f29593a;
        if (i14 + i13 >= this.f29595c.length) {
            a(i14, i13);
        }
        return this.f29595c;
    }

    public final void c(String str) {
        int length = str.length();
        int i13 = this.f29593a;
        if (i13 + length >= this.f29595c.length) {
            a(i13, length);
        }
        str.getBytes(0, length, this.f29595c, this.f29593a);
        this.f29593a += length;
    }

    public final void d(byte b13) {
        int i13 = this.f29593a;
        if (i13 == this.f29595c.length) {
            a(i13, 0);
        }
        byte[] bArr = this.f29595c;
        int i14 = this.f29593a;
        this.f29593a = i14 + 1;
        bArr[i14] = b13;
    }

    public final void e() {
        int i13 = this.f29593a;
        if (i13 + 4 >= this.f29595c.length) {
            a(i13, 0);
        }
        int i14 = this.f29593a;
        byte[] bArr = this.f29595c;
        bArr[i14] = 110;
        bArr[i14 + 1] = 117;
        bArr[i14 + 2] = 108;
        bArr[i14 + 3] = 108;
        this.f29593a = i14 + 4;
    }

    public final void f(int i13, int i14, int i15, CharSequence charSequence) {
        byte[] bArr = this.f29595c;
        int i16 = i13;
        int i17 = i14;
        while (i16 < i15) {
            char charAt = charSequence.charAt(i16);
            if (charAt == '\"') {
                int i18 = i17 + 1;
                bArr[i17] = 92;
                i17 += 2;
                bArr[i18] = 34;
            } else if (charAt == '\\') {
                int i19 = i17 + 1;
                bArr[i17] = 92;
                i17 += 2;
                bArr[i19] = 92;
            } else if (charAt < ' ') {
                if (charAt == '\b') {
                    int i23 = i17 + 1;
                    bArr[i17] = 92;
                    i17 += 2;
                    bArr[i23] = 98;
                } else if (charAt == '\t') {
                    int i24 = i17 + 1;
                    bArr[i17] = 92;
                    i17 += 2;
                    bArr[i24] = 116;
                } else if (charAt == '\n') {
                    int i25 = i17 + 1;
                    bArr[i17] = 92;
                    i17 += 2;
                    bArr[i25] = 110;
                } else if (charAt == '\f') {
                    int i26 = i17 + 1;
                    bArr[i17] = 92;
                    i17 += 2;
                    bArr[i26] = 102;
                } else if (charAt == '\r') {
                    int i27 = i17 + 1;
                    bArr[i17] = 92;
                    i17 += 2;
                    bArr[i27] = 114;
                } else {
                    bArr[i17] = 92;
                    bArr[i17 + 1] = 117;
                    bArr[i17 + 2] = 48;
                    bArr[i17 + 3] = 48;
                    switch (charAt) {
                        case 0:
                            bArr[i17 + 4] = 48;
                            bArr[i17 + 5] = 48;
                            break;
                        case 1:
                            bArr[i17 + 4] = 48;
                            bArr[i17 + 5] = 49;
                            break;
                        case 2:
                            bArr[i17 + 4] = 48;
                            bArr[i17 + 5] = 50;
                            break;
                        case 3:
                            bArr[i17 + 4] = 48;
                            bArr[i17 + 5] = 51;
                            break;
                        case 4:
                            bArr[i17 + 4] = 48;
                            bArr[i17 + 5] = 52;
                            break;
                        case 5:
                            bArr[i17 + 4] = 48;
                            bArr[i17 + 5] = 53;
                            break;
                        case 6:
                            bArr[i17 + 4] = 48;
                            bArr[i17 + 5] = 54;
                            break;
                        case 7:
                            bArr[i17 + 4] = 48;
                            bArr[i17 + 5] = 55;
                            break;
                        case '\b':
                        case '\t':
                        case '\n':
                        case '\f':
                        case '\r':
                        default:
                            bArr[i17 + 4] = 49;
                            bArr[i17 + 5] = 70;
                            break;
                        case 11:
                            bArr[i17 + 4] = 48;
                            bArr[i17 + 5] = 66;
                            break;
                        case 14:
                            bArr[i17 + 4] = 48;
                            bArr[i17 + 5] = 69;
                            break;
                        case 15:
                            bArr[i17 + 4] = 48;
                            bArr[i17 + 5] = 70;
                            break;
                        case 16:
                            bArr[i17 + 4] = 49;
                            bArr[i17 + 5] = 48;
                            break;
                        case 17:
                            bArr[i17 + 4] = 49;
                            bArr[i17 + 5] = 49;
                            break;
                        case 18:
                            bArr[i17 + 4] = 49;
                            bArr[i17 + 5] = 50;
                            break;
                        case 19:
                            bArr[i17 + 4] = 49;
                            bArr[i17 + 5] = 51;
                            break;
                        case 20:
                            bArr[i17 + 4] = 49;
                            bArr[i17 + 5] = 52;
                            break;
                        case 21:
                            bArr[i17 + 4] = 49;
                            bArr[i17 + 5] = 53;
                            break;
                        case 22:
                            bArr[i17 + 4] = 49;
                            bArr[i17 + 5] = 54;
                            break;
                        case 23:
                            bArr[i17 + 4] = 49;
                            bArr[i17 + 5] = 55;
                            break;
                        case 24:
                            bArr[i17 + 4] = 49;
                            bArr[i17 + 5] = 56;
                            break;
                        case 25:
                            bArr[i17 + 4] = 49;
                            bArr[i17 + 5] = 57;
                            break;
                        case 26:
                            bArr[i17 + 4] = 49;
                            bArr[i17 + 5] = 65;
                            break;
                        case 27:
                            bArr[i17 + 4] = 49;
                            bArr[i17 + 5] = 66;
                            break;
                        case 28:
                            bArr[i17 + 4] = 49;
                            bArr[i17 + 5] = 67;
                            break;
                        case 29:
                            bArr[i17 + 4] = 49;
                            bArr[i17 + 5] = 68;
                            break;
                        case 30:
                            bArr[i17 + 4] = 49;
                            bArr[i17 + 5] = 69;
                            break;
                    }
                    i17 += 6;
                }
            } else if (charAt < 127) {
                bArr[i17] = (byte) charAt;
                i17++;
            } else {
                int codePointAt = Character.codePointAt(charSequence, i16);
                if (Character.isSupplementaryCodePoint(codePointAt)) {
                    i16++;
                }
                if (codePointAt == 127) {
                    bArr[i17] = (byte) codePointAt;
                    i17++;
                } else if (codePointAt <= 2047) {
                    int i28 = i17 + 1;
                    bArr[i17] = (byte) (((codePointAt >> 6) & 31) | RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
                    i17 += 2;
                    bArr[i28] = (byte) ((codePointAt & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                } else if (codePointAt < 55296 || (codePointAt > 57343 && codePointAt <= 65535)) {
                    bArr[i17] = (byte) (((codePointAt >> 12) & 15) | RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL);
                    int i29 = i17 + 2;
                    bArr[i17 + 1] = (byte) (((codePointAt >> 6) & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                    i17 += 3;
                    bArr[i29] = (byte) ((codePointAt & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                } else {
                    if (codePointAt < 65536 || codePointAt > 1114111) {
                        throw new SerializationException("Unknown unicode codepoint in string! " + Integer.toHexString(codePointAt));
                    }
                    bArr[i17] = (byte) (((codePointAt >> 18) & 7) | RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM);
                    bArr[i17 + 1] = (byte) (((codePointAt >> 12) & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                    int i33 = i17 + 3;
                    bArr[i17 + 2] = (byte) (((codePointAt >> 6) & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                    i17 += 4;
                    bArr[i33] = (byte) ((codePointAt & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                }
            }
            i16++;
        }
        bArr[i17] = 34;
        this.f29593a = i17 + 1;
    }

    public final void g(String str) {
        int length = str.length();
        int i13 = this.f29593a;
        int i14 = length << 2;
        int i15 = length << 1;
        if (i13 + i14 + i15 + 2 >= this.f29595c.length) {
            a(i13, i14 + i15 + 2);
        }
        byte[] bArr = this.f29595c;
        int i16 = this.f29593a;
        bArr[i16] = 34;
        int i17 = i16 + 1;
        int i18 = 0;
        while (i18 < length) {
            char charAt = str.charAt(i18);
            if (charAt <= 31 || charAt == '\"' || charAt == '\\' || charAt >= '~') {
                f(i18, i17, length, str);
                return;
            } else {
                bArr[i17] = (byte) charAt;
                i18++;
                i17++;
            }
        }
        bArr[i17] = 34;
        this.f29593a = i17 + 1;
    }

    public final String toString() {
        return new String(this.f29595c, 0, this.f29593a, f29592e);
    }
}
