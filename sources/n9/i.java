package n9;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.c0;
import d7.d0;
import d7.n0;
import d7.u;
import java.util.ArrayList;
import java.util.List;
import l9.k;
import l9.l;
import pk.c1;
import pk.v2;
import pk.y0;

/* loaded from: classes3.dex */
public final class i implements l {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f89978h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f89979i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f89980j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f89981a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f89982b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f89983c;

    /* renamed from: d, reason: collision with root package name */
    public final b f89984d;

    /* renamed from: e, reason: collision with root package name */
    public final a f89985e;

    /* renamed from: f, reason: collision with root package name */
    public final h f89986f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f89987g;

    public i(List list) {
        d0 d0Var = new d0((byte[]) list.get(0));
        int E = d0Var.E();
        int E2 = d0Var.E();
        Paint paint = new Paint();
        this.f89981a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f89982b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f89983c = new Canvas();
        this.f89984d = new b(719, 575, 0, 719, 0, 575);
        this.f89985e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f89986f = new h(E, E2);
    }

    public static byte[] a(int i13, int i14, c0 c0Var) {
        byte[] bArr = new byte[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            bArr[i15] = (byte) c0Var.g(i14);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i13 = 1; i13 < 16; i13++) {
            if (i13 < 8) {
                iArr[i13] = e(255, (i13 & 1) != 0 ? 255 : 0, (i13 & 2) != 0 ? 255 : 0, (i13 & 4) != 0 ? 255 : 0);
            } else {
                int i14 = i13 & 1;
                int i15 = RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
                int i16 = i14 != 0 ? 127 : 0;
                int i17 = (i13 & 2) != 0 ? 127 : 0;
                if ((i13 & 4) == 0) {
                    i15 = 0;
                }
                iArr[i13] = e(255, i16, i17, i15);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int i13;
        int[] iArr = new int[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        iArr[0] = 0;
        for (int i14 = 0; i14 < 256; i14++) {
            if (i14 < 8) {
                iArr[i14] = e(63, (i14 & 1) != 0 ? 255 : 0, (i14 & 2) != 0 ? 255 : 0, (i14 & 4) == 0 ? 0 : 255);
            } else {
                int i15 = i14 & RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL;
                int i16 = RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE;
                if (i15 == 0) {
                    int i17 = ((i14 & 1) != 0 ? 85 : 0) + ((i14 & 16) != 0 ? 170 : 0);
                    int i18 = ((i14 & 2) != 0 ? 85 : 0) + ((i14 & 32) != 0 ? 170 : 0);
                    i13 = (i14 & 4) == 0 ? 0 : 85;
                    if ((i14 & 64) == 0) {
                        i16 = 0;
                    }
                    iArr[i14] = e(255, i17, i18, i13 + i16);
                } else if (i15 == 8) {
                    int i19 = ((i14 & 1) != 0 ? 85 : 0) + ((i14 & 16) != 0 ? 170 : 0);
                    int i23 = ((i14 & 2) != 0 ? 85 : 0) + ((i14 & 32) != 0 ? 170 : 0);
                    i13 = (i14 & 4) == 0 ? 0 : 85;
                    if ((i14 & 64) == 0) {
                        i16 = 0;
                    }
                    iArr[i14] = e(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK, i19, i23, i13 + i16);
                } else if (i15 == 128) {
                    iArr[i14] = e(255, ((i14 & 1) != 0 ? 43 : 0) + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK + ((i14 & 16) != 0 ? 85 : 0), ((i14 & 2) != 0 ? 43 : 0) + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK + ((i14 & 32) != 0 ? 85 : 0), ((i14 & 4) == 0 ? 0 : 43) + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK + ((i14 & 64) == 0 ? 0 : 85));
                } else if (i15 == 136) {
                    iArr[i14] = e(255, ((i14 & 1) != 0 ? 43 : 0) + ((i14 & 16) != 0 ? 85 : 0), ((i14 & 2) != 0 ? 43 : 0) + ((i14 & 32) != 0 ? 85 : 0), ((i14 & 4) == 0 ? 0 : 43) + ((i14 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int e(int i13, int i14, int i15, int i16) {
        return (i13 << 24) | (i14 << 16) | (i15 << 8) | i16;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0236 A[LOOP:3: B:89:0x0180->B:100:0x0236, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fd A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.i.f(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a g(int i13, c0 c0Var) {
        int g13;
        int i14;
        int g14;
        int i15;
        int i16;
        int i17 = 8;
        int g15 = c0Var.g(8);
        c0Var.o(8);
        int i18 = 2;
        int i19 = i13 - 2;
        int i23 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] b13 = b();
        int[] c13 = c();
        while (i19 > 0) {
            int g16 = c0Var.g(i17);
            int g17 = c0Var.g(i17);
            int[] iArr2 = (g17 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? iArr : (g17 & 64) != 0 ? b13 : c13;
            if ((g17 & 1) != 0) {
                i15 = c0Var.g(i17);
                i16 = c0Var.g(i17);
                g13 = c0Var.g(i17);
                g14 = c0Var.g(i17);
                i14 = i19 - 6;
            } else {
                int g18 = c0Var.g(6) << i18;
                int g19 = c0Var.g(4) << 4;
                g13 = c0Var.g(4) << 4;
                i14 = i19 - 4;
                g14 = c0Var.g(i18) << 6;
                i15 = g18;
                i16 = g19;
            }
            if (i15 == 0) {
                i16 = i23;
                g13 = i16;
                g14 = 255;
            }
            double d2 = i15;
            double d13 = i16 - 128;
            double d14 = g13 - 128;
            iArr2[g16] = e((byte) (255 - (g14 & 255)), n0.i((int) ((1.402d * d13) + d2), 0, 255), n0.i((int) ((d2 - (0.34414d * d14)) - (d13 * 0.71414d)), 0, 255), n0.i((int) ((d14 * 1.772d) + d2), 0, 255));
            i19 = i14;
            i23 = 0;
            g15 = g15;
            c13 = c13;
            i17 = 8;
            i18 = 2;
        }
        return new a(g15, iArr, b13, c13);
    }

    public static c h(c0 c0Var) {
        byte[] bArr;
        int g13 = c0Var.g(16);
        c0Var.o(4);
        int g14 = c0Var.g(2);
        boolean f13 = c0Var.f();
        c0Var.o(1);
        byte[] bArr2 = n0.f53868c;
        if (g14 == 1) {
            c0Var.o(c0Var.g(8) * 16);
        } else if (g14 == 0) {
            int g15 = c0Var.g(16);
            int g16 = c0Var.g(16);
            if (g15 > 0) {
                bArr2 = new byte[g15];
                c0Var.j(bArr2, g15);
            }
            if (g16 > 0) {
                bArr = new byte[g16];
                c0Var.j(bArr, g16);
                return new c(g13, f13, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(g13, f13, bArr2, bArr);
    }

    @Override // l9.l
    public final int E() {
        return 2;
    }

    @Override // l9.l
    public final void d() {
        h hVar = this.f89986f;
        hVar.f89971c.clear();
        hVar.f89972d.clear();
        hVar.f89973e.clear();
        hVar.f89974f.clear();
        hVar.f89975g.clear();
        hVar.f89976h = null;
        hVar.f89977i = null;
    }

    @Override // l9.l
    public final void w(byte[] bArr, int i13, int i14, k kVar, d7.i iVar) {
        h hVar;
        l9.a aVar;
        int i15;
        int i16;
        char c13;
        char c14;
        int i17;
        b bVar;
        ArrayList arrayList;
        h hVar2;
        int i18;
        int i19;
        int i23;
        int i24;
        int i25;
        f fVar;
        int i26;
        f fVar2;
        int i27;
        int i28;
        int i29;
        int i33;
        c0 c0Var = new c0(bArr, i13 + i14);
        c0Var.m(i13);
        while (true) {
            int b13 = c0Var.b();
            hVar = this.f89986f;
            if (b13 >= 48 && c0Var.g(8) == 15) {
                int g13 = c0Var.g(8);
                int i34 = 16;
                int g14 = c0Var.g(16);
                int g15 = c0Var.g(16);
                int d2 = c0Var.d() + g15;
                if (g15 * 8 > c0Var.b()) {
                    u.g("DvbParser", "Data field length exceeds limit");
                    c0Var.o(c0Var.b());
                } else {
                    switch (g13) {
                        case 16:
                            if (g14 == hVar.f89969a) {
                                d dVar = hVar.f89977i;
                                int g16 = c0Var.g(8);
                                int g17 = c0Var.g(4);
                                int g18 = c0Var.g(2);
                                c0Var.o(2);
                                int i35 = g15 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i35 > 0) {
                                    int g19 = c0Var.g(8);
                                    c0Var.o(8);
                                    i35 -= 6;
                                    sparseArray.put(g19, new e(c0Var.g(16), c0Var.g(16)));
                                }
                                d dVar2 = new d();
                                dVar2.f89951a = g16;
                                dVar2.f89952b = g17;
                                dVar2.f89953c = g18;
                                dVar2.f89954d = sparseArray;
                                if (g18 == 0) {
                                    if (dVar != null && dVar.f89952b != g17) {
                                        hVar.f89977i = dVar2;
                                        break;
                                    }
                                } else {
                                    hVar.f89977i = dVar2;
                                    hVar.f89971c.clear();
                                    hVar.f89972d.clear();
                                    hVar.f89973e.clear();
                                    break;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar.f89977i;
                            if (g14 == hVar.f89969a && dVar3 != null) {
                                int g23 = c0Var.g(8);
                                c0Var.o(4);
                                boolean f13 = c0Var.f();
                                c0Var.o(3);
                                int g24 = c0Var.g(16);
                                int g25 = c0Var.g(16);
                                c0Var.g(3);
                                int g26 = c0Var.g(3);
                                c0Var.o(2);
                                int g27 = c0Var.g(8);
                                int g28 = c0Var.g(8);
                                int g29 = c0Var.g(4);
                                int g33 = c0Var.g(2);
                                c0Var.o(2);
                                int i36 = g15 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i36 > 0) {
                                    int g34 = c0Var.g(i34);
                                    int g35 = c0Var.g(2);
                                    c0Var.g(2);
                                    int g36 = c0Var.g(12);
                                    c0Var.o(4);
                                    int g37 = c0Var.g(12);
                                    int i37 = i36 - 6;
                                    if (g35 == 1 || g35 == 2) {
                                        c0Var.g(8);
                                        c0Var.g(8);
                                        i36 -= 8;
                                    } else {
                                        i36 = i37;
                                    }
                                    sparseArray2.put(g34, new g(g36, g37));
                                    i34 = 16;
                                }
                                f fVar3 = new f(g23, f13, g24, g25, g26, g27, g28, g29, g33, sparseArray2);
                                int i38 = dVar3.f89953c;
                                SparseArray sparseArray3 = hVar.f89971c;
                                if (i38 == 0 && (fVar2 = (f) sparseArray3.get(g23)) != null) {
                                    int i39 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = fVar2.f89966j;
                                        if (i39 < sparseArray4.size()) {
                                            fVar3.f89966j.put(sparseArray4.keyAt(i39), (g) sparseArray4.valueAt(i39));
                                            i39++;
                                        }
                                    }
                                }
                                sparseArray3.put(fVar3.f89957a, fVar3);
                                break;
                            }
                            break;
                        case 18:
                            if (g14 != hVar.f89969a) {
                                if (g14 == hVar.f89970b) {
                                    a g38 = g(g15, c0Var);
                                    hVar.f89974f.put(g38.f89937a, g38);
                                    break;
                                }
                            } else {
                                a g39 = g(g15, c0Var);
                                hVar.f89972d.put(g39.f89937a, g39);
                                break;
                            }
                            break;
                        case 19:
                            if (g14 != hVar.f89969a) {
                                if (g14 == hVar.f89970b) {
                                    c h10 = h(c0Var);
                                    hVar.f89975g.put(h10.f89947a, h10);
                                    break;
                                }
                            } else {
                                c h13 = h(c0Var);
                                hVar.f89973e.put(h13.f89947a, h13);
                                break;
                            }
                            break;
                        case 20:
                            if (g14 == hVar.f89969a) {
                                c0Var.o(4);
                                boolean f14 = c0Var.f();
                                c0Var.o(3);
                                int g43 = c0Var.g(16);
                                int g44 = c0Var.g(16);
                                if (f14) {
                                    int g45 = c0Var.g(16);
                                    i27 = c0Var.g(16);
                                    i33 = c0Var.g(16);
                                    i28 = c0Var.g(16);
                                    i29 = g45;
                                } else {
                                    i27 = g43;
                                    i28 = g44;
                                    i29 = 0;
                                    i33 = 0;
                                }
                                hVar.f89976h = new b(g43, g44, i29, i27, i33, i28);
                                break;
                            }
                            break;
                    }
                    c0Var.p(d2 - c0Var.d());
                }
            }
        }
        d dVar4 = hVar.f89977i;
        if (dVar4 == null) {
            y0 y0Var = c1.f100372b;
            aVar = new l9.a(-9223372036854775807L, -9223372036854775807L, v2.f100502e);
        } else {
            b bVar2 = hVar.f89976h;
            if (bVar2 == null) {
                bVar2 = this.f89984d;
            }
            Bitmap bitmap = this.f89987g;
            Canvas canvas = this.f89983c;
            if (bitmap == null || bVar2.f89941a + 1 != bitmap.getWidth() || bVar2.f89942b + 1 != this.f89987g.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(bVar2.f89941a + 1, bVar2.f89942b + 1, Bitmap.Config.ARGB_8888);
                this.f89987g = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) dVar4.f89954d;
            int i43 = 0;
            while (i43 < sparseArray5.size()) {
                canvas.save();
                e eVar = (e) sparseArray5.valueAt(i43);
                f fVar4 = (f) hVar.f89971c.get(sparseArray5.keyAt(i43));
                int i44 = eVar.f89955a + bVar2.f89943c;
                int i45 = eVar.f89956b + bVar2.f89945e;
                int min = Math.min(fVar4.f89959c + i44, bVar2.f89944d);
                int i46 = fVar4.f89960d;
                int i47 = i45 + i46;
                canvas.clipRect(i44, i45, min, Math.min(i47, bVar2.f89946f));
                SparseArray sparseArray6 = hVar.f89972d;
                int i48 = fVar4.f89962f;
                a aVar2 = (a) sparseArray6.get(i48);
                if (aVar2 == null && (aVar2 = (a) hVar.f89974f.get(i48)) == null) {
                    aVar2 = this.f89985e;
                }
                int i49 = 0;
                while (true) {
                    SparseArray sparseArray7 = fVar4.f89966j;
                    if (i49 < sparseArray7.size()) {
                        int keyAt = sparseArray7.keyAt(i49);
                        g gVar = (g) sparseArray7.valueAt(i49);
                        SparseArray sparseArray8 = sparseArray5;
                        c cVar = (c) hVar.f89973e.get(keyAt);
                        if (cVar == null) {
                            cVar = (c) hVar.f89975g.get(keyAt);
                        }
                        if (cVar != null) {
                            Paint paint = cVar.f89948b ? null : this.f89981a;
                            hVar2 = hVar;
                            int i53 = gVar.f89967a + i44;
                            int i54 = gVar.f89968b + i45;
                            arrayList = arrayList2;
                            int i55 = fVar4.f89961e;
                            i18 = i49;
                            int[] iArr = i55 == 3 ? aVar2.f89940d : i55 == 2 ? aVar2.f89939c : aVar2.f89938b;
                            bVar = bVar2;
                            i23 = i46;
                            i19 = i47;
                            i24 = i45;
                            i25 = i44;
                            fVar = fVar4;
                            Paint paint2 = paint;
                            i26 = i43;
                            f(cVar.f89949c, iArr, i55, i53, i54, paint2, canvas);
                            f(cVar.f89950d, iArr, i55, i53, i54 + 1, paint2, canvas);
                        } else {
                            bVar = bVar2;
                            arrayList = arrayList2;
                            hVar2 = hVar;
                            i18 = i49;
                            i19 = i47;
                            i23 = i46;
                            i24 = i45;
                            i25 = i44;
                            fVar = fVar4;
                            i26 = i43;
                        }
                        i49 = i18 + 1;
                        fVar4 = fVar;
                        sparseArray5 = sparseArray8;
                        hVar = hVar2;
                        arrayList2 = arrayList;
                        bVar2 = bVar;
                        i47 = i19;
                        i45 = i24;
                        i44 = i25;
                        i43 = i26;
                        i46 = i23;
                    } else {
                        SparseArray sparseArray9 = sparseArray5;
                        b bVar3 = bVar2;
                        ArrayList arrayList3 = arrayList2;
                        h hVar3 = hVar;
                        int i56 = i47;
                        int i57 = i46;
                        int i58 = i45;
                        int i59 = i44;
                        f fVar5 = fVar4;
                        int i63 = i43;
                        boolean z13 = fVar5.f89958b;
                        int i64 = fVar5.f89959c;
                        if (z13) {
                            int i65 = fVar5.f89961e;
                            c13 = 3;
                            if (i65 == 3) {
                                i17 = aVar2.f89940d[fVar5.f89963g];
                                c14 = 2;
                            } else {
                                c14 = 2;
                                i17 = i65 == 2 ? aVar2.f89939c[fVar5.f89964h] : aVar2.f89938b[fVar5.f89965i];
                            }
                            Paint paint3 = this.f89982b;
                            paint3.setColor(i17);
                            i16 = i59;
                            i15 = i58;
                            canvas.drawRect(i16, i15, i16 + i64, i56, paint3);
                        } else {
                            i15 = i58;
                            i16 = i59;
                            c13 = 3;
                            c14 = 2;
                        }
                        Bitmap createBitmap2 = Bitmap.createBitmap(this.f89987g, i16, i15, i64, i57);
                        float f15 = bVar3.f89941a;
                        float f16 = i16 / f15;
                        float f17 = i15;
                        float f18 = bVar3.f89942b;
                        arrayList3.add(new c7.b(null, null, null, createBitmap2, f17 / f18, 0, 0, f16, 0, Integer.MIN_VALUE, -3.4028235E38f, i64 / f15, i57 / f18, false, -16777216, Integer.MIN_VALUE, 0.0f));
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        canvas.restore();
                        i43 = i63 + 1;
                        sparseArray5 = sparseArray9;
                        hVar = hVar3;
                        arrayList2 = arrayList3;
                        bVar2 = bVar3;
                    }
                }
            }
            aVar = new l9.a(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        iVar.accept(aVar);
    }
}
