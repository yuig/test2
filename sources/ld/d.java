package ld;

import android.util.Log;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f82927b;

    /* renamed from: c, reason: collision with root package name */
    public c f82928c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f82926a = new byte[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];

    /* renamed from: d, reason: collision with root package name */
    public int f82929d = 0;

    public final boolean a() {
        return this.f82928c.f82916b != 0;
    }

    public final c b() {
        byte[] bArr;
        if (this.f82927b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f82928c;
        }
        StringBuilder sb3 = new StringBuilder();
        for (int i13 = 0; i13 < 6; i13++) {
            sb3.append((char) c());
        }
        if (sb3.toString().startsWith("GIF")) {
            this.f82928c.f82920f = this.f82927b.getShort();
            this.f82928c.f82921g = this.f82927b.getShort();
            int c13 = c();
            c cVar = this.f82928c;
            cVar.f82922h = (c13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0;
            cVar.f82923i = (int) Math.pow(2.0d, (c13 & 7) + 1);
            this.f82928c.f82924j = c();
            c cVar2 = this.f82928c;
            c();
            cVar2.getClass();
            if (this.f82928c.f82922h && !a()) {
                c cVar3 = this.f82928c;
                cVar3.f82915a = e(cVar3.f82923i);
                c cVar4 = this.f82928c;
                cVar4.f82925k = cVar4.f82915a[cVar4.f82924j];
            }
        } else {
            this.f82928c.f82916b = 1;
        }
        if (!a()) {
            boolean z13 = false;
            while (!z13 && !a() && this.f82928c.f82917c <= Integer.MAX_VALUE) {
                int c14 = c();
                if (c14 == 33) {
                    int c15 = c();
                    if (c15 == 1) {
                        f();
                    } else if (c15 == 249) {
                        this.f82928c.f82918d = new b();
                        c();
                        int c16 = c();
                        b bVar = this.f82928c.f82918d;
                        int i14 = (c16 & 28) >> 2;
                        bVar.f82910g = i14;
                        if (i14 == 0) {
                            bVar.f82910g = 1;
                        }
                        bVar.f82909f = (c16 & 1) != 0;
                        short s13 = this.f82927b.getShort();
                        if (s13 < 2) {
                            s13 = 10;
                        }
                        b bVar2 = this.f82928c.f82918d;
                        bVar2.f82912i = s13 * 10;
                        bVar2.f82911h = c();
                        c();
                    } else if (c15 == 254) {
                        f();
                    } else if (c15 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb4 = new StringBuilder();
                        int i15 = 0;
                        while (true) {
                            bArr = this.f82926a;
                            if (i15 >= 11) {
                                break;
                            }
                            sb4.append((char) bArr[i15]);
                            i15++;
                        }
                        if (sb4.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b13 = bArr[1];
                                    byte b14 = bArr[2];
                                    this.f82928c.getClass();
                                }
                                if (this.f82929d > 0) {
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (c14 == 44) {
                    c cVar5 = this.f82928c;
                    if (cVar5.f82918d == null) {
                        cVar5.f82918d = new b();
                    }
                    cVar5.f82918d.f82904a = this.f82927b.getShort();
                    this.f82928c.f82918d.f82905b = this.f82927b.getShort();
                    this.f82928c.f82918d.f82906c = this.f82927b.getShort();
                    this.f82928c.f82918d.f82907d = this.f82927b.getShort();
                    int c17 = c();
                    boolean z14 = (c17 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0;
                    int pow = (int) Math.pow(2.0d, (c17 & 7) + 1);
                    b bVar3 = this.f82928c.f82918d;
                    bVar3.f82908e = (c17 & 64) != 0;
                    if (z14) {
                        bVar3.f82914k = e(pow);
                    } else {
                        bVar3.f82914k = null;
                    }
                    this.f82928c.f82918d.f82913j = this.f82927b.position();
                    c();
                    f();
                    if (!a()) {
                        c cVar6 = this.f82928c;
                        cVar6.f82917c++;
                        cVar6.f82919e.add(cVar6.f82918d);
                    }
                } else if (c14 != 59) {
                    this.f82928c.f82916b = 1;
                } else {
                    z13 = true;
                }
            }
            c cVar7 = this.f82928c;
            if (cVar7.f82917c < 0) {
                cVar7.f82916b = 1;
            }
        }
        return this.f82928c;
    }

    public final int c() {
        try {
            return this.f82927b.get() & 255;
        } catch (Exception unused) {
            this.f82928c.f82916b = 1;
            return 0;
        }
    }

    public final void d() {
        int c13 = c();
        this.f82929d = c13;
        if (c13 <= 0) {
            return;
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            try {
                i14 = this.f82929d;
                if (i13 >= i14) {
                    return;
                }
                i14 -= i13;
                this.f82927b.get(this.f82926a, i13, i14);
                i13 += i14;
            } catch (Exception e13) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder t13 = a.a.t("Error Reading Block n: ", i13, " count: ", i14, " blockSize: ");
                    t13.append(this.f82929d);
                    Log.d("GifHeaderParser", t13.toString(), e13);
                }
                this.f82928c.f82916b = 1;
                return;
            }
        }
    }

    public final int[] e(int i13) {
        byte[] bArr = new byte[i13 * 3];
        int[] iArr = null;
        try {
            this.f82927b.get(bArr);
            iArr = new int[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
            int i14 = 0;
            int i15 = 0;
            while (i14 < i13) {
                int i16 = bArr[i15] & 255;
                int i17 = i15 + 2;
                int i18 = bArr[i15 + 1] & 255;
                i15 += 3;
                int i19 = i14 + 1;
                iArr[i14] = (i18 << 8) | (i16 << 16) | (-16777216) | (bArr[i17] & 255);
                i14 = i19;
            }
        } catch (BufferUnderflowException e13) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e13);
            }
            this.f82928c.f82916b = 1;
        }
        return iArr;
    }

    public final void f() {
        int c13;
        do {
            c13 = c();
            this.f82927b.position(Math.min(this.f82927b.position() + c13, this.f82927b.limit()));
        } while (c13 > 0);
    }
}
