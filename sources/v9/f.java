package v9;

import a7.o0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.n0;
import java.util.Arrays;
import java.util.Collections;
import net.quikkly.android.utils.BitmapUtils;
import q8.k0;

/* loaded from: classes3.dex */
public final class f implements i {

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f124561x = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f124562a;

    /* renamed from: d, reason: collision with root package name */
    public final String f124565d;

    /* renamed from: e, reason: collision with root package name */
    public final int f124566e;

    /* renamed from: f, reason: collision with root package name */
    public final String f124567f;

    /* renamed from: g, reason: collision with root package name */
    public String f124568g;

    /* renamed from: h, reason: collision with root package name */
    public k0 f124569h;

    /* renamed from: i, reason: collision with root package name */
    public k0 f124570i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f124574m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f124575n;

    /* renamed from: q, reason: collision with root package name */
    public int f124578q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f124579r;

    /* renamed from: t, reason: collision with root package name */
    public int f124581t;

    /* renamed from: v, reason: collision with root package name */
    public k0 f124583v;

    /* renamed from: w, reason: collision with root package name */
    public long f124584w;

    /* renamed from: b, reason: collision with root package name */
    public final d7.c0 f124563b = new d7.c0(new byte[7], 0, 0);

    /* renamed from: c, reason: collision with root package name */
    public final d7.d0 f124564c = new d7.d0(Arrays.copyOf(f124561x, 10));

    /* renamed from: o, reason: collision with root package name */
    public int f124576o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f124577p = -1;

    /* renamed from: s, reason: collision with root package name */
    public long f124580s = -9223372036854775807L;

    /* renamed from: u, reason: collision with root package name */
    public long f124582u = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public int f124571j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f124572k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f124573l = RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;

    public f(String str, int i13, String str2, boolean z13) {
        this.f124562a = z13;
        this.f124565d = str;
        this.f124566e = i13;
        this.f124567f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    @Override // v9.i
    public final void e(d7.d0 d0Var) {
        int i13;
        byte b13;
        char c13;
        ?? r33;
        char c14;
        char c15;
        char c16;
        int i14;
        int i15;
        this.f124569h.getClass();
        int i16 = n0.f53866a;
        while (d0Var.a() > 0) {
            int i17 = this.f124571j;
            int i18 = 2;
            char c17 = 65535;
            int i19 = 4;
            int i23 = 1;
            int i24 = 0;
            d7.d0 d0Var2 = this.f124564c;
            d7.c0 c0Var = this.f124563b;
            if (i17 == 0) {
                byte[] bArr = d0Var.f53806a;
                int i25 = d0Var.f53807b;
                int i26 = d0Var.f53808c;
                while (true) {
                    if (i25 >= i26) {
                        d0Var.K(i25);
                        break;
                    }
                    i13 = i25 + 1;
                    b13 = bArr[i25];
                    int i27 = b13 & 255;
                    if (this.f124573l != 512 || (((65280 | ((((byte) i27) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) != 65520) {
                        c13 = c17;
                        r33 = i23;
                    } else {
                        if (this.f124575n) {
                            break;
                        }
                        int i28 = i25 - 1;
                        d0Var.K(i25);
                        byte[] bArr2 = c0Var.f53793b;
                        if (d0Var.a() >= i23) {
                            d0Var.i(bArr2, i24, i23);
                            c0Var.m(i19);
                            int g13 = c0Var.g(i23);
                            int i29 = this.f124576o;
                            if (i29 == -1 || g13 == i29) {
                                if (this.f124577p != -1) {
                                    byte[] bArr3 = c0Var.f53793b;
                                    if (d0Var.a() < i23) {
                                        break;
                                    }
                                    d0Var.i(bArr3, i24, i23);
                                    c0Var.m(2);
                                    i15 = 4;
                                    if (c0Var.g(4) == this.f124577p) {
                                        d0Var.K(i13);
                                    }
                                } else {
                                    i15 = 4;
                                }
                                byte[] bArr4 = c0Var.f53793b;
                                if (d0Var.a() >= i15) {
                                    d0Var.i(bArr4, i24, i15);
                                    c0Var.m(14);
                                    int g14 = c0Var.g(13);
                                    if (g14 >= 7) {
                                        byte[] bArr5 = d0Var.f53806a;
                                        int i33 = d0Var.f53808c;
                                        int i34 = i28 + g14;
                                        if (i34 < i33) {
                                            byte b14 = bArr5[i34];
                                            c13 = 65535;
                                            if (b14 != -1) {
                                                if (b14 == 73) {
                                                    int i35 = i34 + 1;
                                                    if (i35 != i33) {
                                                        if (bArr5[i35] == 68) {
                                                            int i36 = i34 + 2;
                                                            if (i36 != i33) {
                                                                if (bArr5[i36] == 51) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                int i37 = i34 + 1;
                                                if (i37 != i33) {
                                                    byte b15 = bArr5[i37];
                                                    if ((((65280 | ((b15 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b15 & 8) >> 3) == g13) {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                c13 = 65535;
                            }
                            r33 = true;
                        }
                        c13 = 65535;
                        r33 = true;
                    }
                    int i38 = this.f124573l;
                    int i39 = i27 | i38;
                    if (i39 == 329) {
                        c14 = 256;
                        c15 = 2;
                        c16 = 3;
                        i14 = 0;
                        this.f124573l = 768;
                    } else if (i39 == 511) {
                        c14 = 256;
                        c15 = 2;
                        c16 = 3;
                        i14 = 0;
                        this.f124573l = BitmapUtils.BITMAP_TO_JPEG_SIZE;
                    } else if (i39 == 836) {
                        c14 = 256;
                        c15 = 2;
                        c16 = 3;
                        i14 = 0;
                        this.f124573l = 1024;
                    } else {
                        if (i39 == 1075) {
                            this.f124571j = 2;
                            this.f124572k = 3;
                            this.f124581t = 0;
                            d0Var2.K(0);
                            d0Var.K(i13);
                            break;
                        }
                        c14 = 256;
                        if (i38 != 256) {
                            this.f124573l = RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                            c15 = 2;
                            c16 = 3;
                            i14 = 0;
                            i23 = r33;
                            c17 = c13;
                            i24 = i14;
                            i19 = 4;
                        } else {
                            c15 = 2;
                            c16 = 3;
                            i14 = 0;
                        }
                    }
                    i25 = i13;
                    i23 = r33;
                    c17 = c13;
                    i24 = i14;
                    i19 = 4;
                }
                this.f124578q = (b13 & 8) >> 3;
                this.f124574m = (b13 & 1) == 0;
                if (this.f124575n) {
                    this.f124571j = 3;
                    this.f124572k = 0;
                } else {
                    this.f124571j = 1;
                    this.f124572k = 0;
                }
                d0Var.K(i13);
            } else if (i17 != 1) {
                if (i17 == 2) {
                    byte[] bArr6 = d0Var2.f53806a;
                    int min = Math.min(d0Var.a(), 10 - this.f124572k);
                    d0Var.i(bArr6, this.f124572k, min);
                    int i43 = this.f124572k + min;
                    this.f124572k = i43;
                    if (i43 == 10) {
                        this.f124570i.d(10, 0, d0Var2);
                        d0Var2.K(6);
                        k0 k0Var = this.f124570i;
                        int x13 = d0Var2.x() + 10;
                        this.f124571j = 4;
                        this.f124572k = 10;
                        this.f124583v = k0Var;
                        this.f124584w = 0L;
                        this.f124581t = x13;
                    }
                } else if (i17 == 3) {
                    int i44 = this.f124574m ? 7 : 5;
                    byte[] bArr7 = c0Var.f53793b;
                    int min2 = Math.min(d0Var.a(), i44 - this.f124572k);
                    d0Var.i(bArr7, this.f124572k, min2);
                    int i45 = this.f124572k + min2;
                    this.f124572k = i45;
                    if (i45 == i44) {
                        c0Var.m(0);
                        if (this.f124579r) {
                            c0Var.o(10);
                        } else {
                            int g15 = c0Var.g(2) + 1;
                            if (g15 != 2) {
                                d7.u.g("AdtsReader", "Detected audio object type: " + g15 + ", but assuming AAC LC.");
                            } else {
                                i18 = g15;
                            }
                            c0Var.o(5);
                            byte[] b16 = q8.b.b(i18, this.f124577p, c0Var.g(3));
                            q8.a j13 = q8.b.j(new d7.c0(b16, 0, 0), false);
                            a7.q qVar = new a7.q();
                            qVar.f1168a = this.f124568g;
                            qVar.f1180m = o0.r(this.f124567f);
                            qVar.f1181n = o0.r("audio/mp4a-latm");
                            qVar.f1177j = j13.f102846c;
                            qVar.D = j13.f102845b;
                            qVar.E = j13.f102844a;
                            qVar.f1184q = Collections.singletonList(b16);
                            qVar.f1171d = this.f124565d;
                            qVar.f1173f = this.f124566e;
                            androidx.media3.common.b bVar = new androidx.media3.common.b(qVar);
                            this.f124580s = 1024000000 / bVar.F;
                            this.f124569h.b(bVar);
                            this.f124579r = true;
                        }
                        c0Var.o(4);
                        int g16 = c0Var.g(13);
                        int i46 = g16 - 7;
                        if (this.f124574m) {
                            i46 = g16 - 9;
                        }
                        k0 k0Var2 = this.f124569h;
                        long j14 = this.f124580s;
                        this.f124571j = 4;
                        this.f124572k = 0;
                        this.f124583v = k0Var2;
                        this.f124584w = j14;
                        this.f124581t = i46;
                    }
                } else {
                    if (i17 != 4) {
                        throw new IllegalStateException();
                    }
                    int min3 = Math.min(d0Var.a(), this.f124581t - this.f124572k);
                    this.f124583v.d(min3, 0, d0Var);
                    int i47 = this.f124572k + min3;
                    this.f124572k = i47;
                    if (i47 == this.f124581t) {
                        bf.b.t(this.f124582u != -9223372036854775807L);
                        this.f124583v.a(this.f124582u, 1, this.f124581t, 0, null);
                        this.f124582u += this.f124584w;
                        this.f124571j = 0;
                        this.f124572k = 0;
                        this.f124573l = RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                    }
                }
            } else if (d0Var.a() != 0) {
                c0Var.f53793b[0] = d0Var.f53806a[d0Var.f53807b];
                c0Var.m(2);
                int g17 = c0Var.g(4);
                int i48 = this.f124577p;
                if (i48 == -1 || g17 == i48) {
                    if (!this.f124575n) {
                        this.f124575n = true;
                        this.f124576o = this.f124578q;
                        this.f124577p = g17;
                    }
                    this.f124571j = 3;
                    this.f124572k = 0;
                } else {
                    this.f124575n = false;
                    this.f124571j = 0;
                    this.f124572k = 0;
                    this.f124573l = RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                }
            }
        }
    }

    @Override // v9.i
    public final void f() {
        this.f124582u = -9223372036854775807L;
        this.f124575n = false;
        this.f124571j = 0;
        this.f124572k = 0;
        this.f124573l = RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
    }

    @Override // v9.i
    public final void g(q8.u uVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f124568g = h0Var.f124635e;
        h0Var.b();
        k0 D = uVar.D(h0Var.f124634d, 1);
        this.f124569h = D;
        this.f124583v = D;
        if (!this.f124562a) {
            this.f124570i = new q8.r();
            return;
        }
        h0Var.a();
        h0Var.b();
        k0 D2 = uVar.D(h0Var.f124634d, 5);
        this.f124570i = D2;
        a7.q qVar = new a7.q();
        h0Var.b();
        qVar.f1168a = h0Var.f124635e;
        qVar.f1180m = o0.r(this.f124567f);
        qVar.f1181n = o0.r("application/id3");
        D2.b(new androidx.media3.common.b(qVar));
    }

    @Override // v9.i
    public final void h(boolean z13) {
    }

    @Override // v9.i
    public final void i(int i13, long j13) {
        this.f124582u = j13;
    }
}
