package nt0;

import android.graphics.Bitmap;
import android.util.Log;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f92261a;

    /* renamed from: b, reason: collision with root package name */
    public int f92262b;

    /* renamed from: c, reason: collision with root package name */
    public int f92263c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f92264d;

    /* renamed from: e, reason: collision with root package name */
    public int f92265e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f92266f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f92267g;

    /* renamed from: h, reason: collision with root package name */
    public int f92268h;

    /* renamed from: i, reason: collision with root package name */
    public int f92269i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f92270j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f92271k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f92272l;

    /* renamed from: m, reason: collision with root package name */
    public int f92273m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f92274n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f92275o;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f92276p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f92277q;

    /* renamed from: r, reason: collision with root package name */
    public int[] f92278r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f92279s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f92280t;

    /* renamed from: u, reason: collision with root package name */
    public a f92281u;

    /* renamed from: v, reason: collision with root package name */
    public Bitmap f92282v;

    /* renamed from: w, reason: collision with root package name */
    public Bitmap f92283w;

    /* renamed from: x, reason: collision with root package name */
    public int f92284x;

    /* renamed from: y, reason: collision with root package name */
    public int f92285y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23, types: [short] */
    /* JADX WARN: Type inference failed for: r3v25 */
    public final void a(a aVar, byte[] bArr) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        short s13;
        byte[] bArr2 = bArr;
        if (aVar != null) {
            this.f92271k.position(aVar.f92259j);
        }
        int i18 = aVar == null ? this.f92262b * this.f92263c : aVar.f92253d * aVar.f92252c;
        if (bArr2 == null || bArr2.length < i18) {
            bArr2 = new byte[i18];
        }
        if (this.f92274n == null) {
            this.f92274n = new short[4096];
        }
        if (this.f92275o == null) {
            this.f92275o = new byte[4096];
        }
        if (this.f92276p == null) {
            this.f92276p = new byte[4097];
        }
        int c13 = c();
        int i19 = 1 << c13;
        int i23 = i19 + 1;
        int i24 = i19 + 2;
        int i25 = c13 + 1;
        int i26 = (1 << i25) - 1;
        for (int i27 = 0; i27 < i19; i27++) {
            this.f92274n[i27] = 0;
            this.f92275o[i27] = (byte) i27;
        }
        int i28 = i25;
        int i29 = i26;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i43 = 0;
        int i44 = -1;
        int i45 = i24;
        while (i33 < i18) {
            if (i34 != 0) {
                i13 = i25;
                i14 = i23;
                int i46 = i39;
                i15 = i19;
                i16 = i46;
            } else if (i35 >= i28) {
                int i47 = i36 & i29;
                i36 >>= i28;
                i35 -= i28;
                if (i47 > i45 || i47 == i23) {
                    break;
                }
                if (i47 == i19) {
                    i28 = i25;
                    i45 = i24;
                    i29 = i26;
                    i44 = -1;
                } else if (i44 == -1) {
                    this.f92276p[i34] = this.f92275o[i47];
                    i44 = i47;
                    i39 = i44;
                    i34++;
                    i25 = i25;
                } else {
                    i13 = i25;
                    if (i47 == i45) {
                        i17 = i47;
                        this.f92276p[i34] = (byte) i39;
                        s13 = i44;
                        i34++;
                    } else {
                        i17 = i47;
                        s13 = i17;
                    }
                    while (s13 > i19) {
                        this.f92276p[i34] = this.f92275o[s13];
                        s13 = this.f92274n[s13];
                        i34++;
                        i19 = i19;
                    }
                    i15 = i19;
                    byte[] bArr3 = this.f92275o;
                    i16 = bArr3[s13] & 255;
                    if (i45 >= 4096) {
                        break;
                    }
                    int i48 = i34 + 1;
                    i14 = i23;
                    byte b13 = (byte) i16;
                    this.f92276p[i34] = b13;
                    this.f92274n[i45] = (short) i44;
                    bArr3[i45] = b13;
                    i45++;
                    if ((i45 & i29) == 0 && i45 < 4096) {
                        i28++;
                        i29 += i45;
                    }
                    i34 = i48;
                    i44 = i17;
                }
            } else {
                if (i37 == 0) {
                    i37 = d();
                    if (i37 <= 0) {
                        break;
                    } else {
                        i38 = 0;
                    }
                }
                i36 += (this.f92272l[i38] & 255) << i35;
                i35 += 8;
                i38++;
                i37--;
            }
            i34--;
            bArr2[i43] = this.f92276p[i34];
            i33++;
            i43++;
            i19 = i15;
            i23 = i14;
            i39 = i16;
            i25 = i13;
        }
        for (int i49 = i43; i49 < i18; i49++) {
            bArr2[i49] = 0;
        }
    }

    public final boolean b() {
        return this.f92261a != 0;
    }

    public final int c() {
        try {
            return this.f92271k.get() & 255;
        } catch (Exception unused) {
            this.f92261a = 1;
            return 0;
        }
    }

    public final int d() {
        int c13 = c();
        this.f92273m = c13;
        int i13 = 0;
        if (c13 > 0) {
            while (true) {
                try {
                    int i14 = this.f92273m;
                    if (i13 >= i14) {
                        break;
                    }
                    int i15 = i14 - i13;
                    this.f92271k.get(this.f92272l, i13, i15);
                    i13 += i15;
                } catch (Exception e13) {
                    Log.w("b", "Error Reading Block", e13);
                    this.f92261a = 1;
                }
            }
        }
        return i13;
    }

    public final int[] e(int i13) {
        byte[] bArr = new byte[i13 * 3];
        int[] iArr = null;
        try {
            this.f92271k.get(bArr);
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
            Log.w("b", "Format Error Reading Color Table", e13);
            this.f92261a = 1;
        }
        return iArr;
    }

    public final void f() {
        do {
            d();
            if (this.f92273m <= 0) {
                return;
            }
        } while (!b());
    }
}
