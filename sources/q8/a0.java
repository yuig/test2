package q8;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;
import pk.c1;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f102847a;

    /* renamed from: b, reason: collision with root package name */
    public final int f102848b;

    /* renamed from: c, reason: collision with root package name */
    public final int f102849c;

    /* renamed from: d, reason: collision with root package name */
    public final int f102850d;

    /* renamed from: e, reason: collision with root package name */
    public final int f102851e;

    /* renamed from: f, reason: collision with root package name */
    public final int f102852f;

    /* renamed from: g, reason: collision with root package name */
    public final int f102853g;

    /* renamed from: h, reason: collision with root package name */
    public final int f102854h;

    /* renamed from: i, reason: collision with root package name */
    public final int f102855i;

    /* renamed from: j, reason: collision with root package name */
    public final float f102856j;

    /* renamed from: k, reason: collision with root package name */
    public final int f102857k;

    /* renamed from: l, reason: collision with root package name */
    public final String f102858l;

    /* renamed from: m, reason: collision with root package name */
    public final e7.n f102859m;

    public a0(List list, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23, float f13, int i24, String str, e7.n nVar) {
        this.f102847a = list;
        this.f102848b = i13;
        this.f102849c = i14;
        this.f102850d = i15;
        this.f102851e = i16;
        this.f102852f = i17;
        this.f102853g = i18;
        this.f102854h = i19;
        this.f102855i = i23;
        this.f102856j = f13;
        this.f102857k = i24;
        this.f102858l = str;
        this.f102859m = nVar;
    }

    public static a0 a(d7.d0 d0Var, boolean z13, e7.n nVar) {
        int i13;
        a10.e i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = 4;
        try {
            if (z13) {
                d0Var.L(4);
            } else {
                d0Var.L(21);
            }
            int y13 = d0Var.y() & 3;
            int y14 = d0Var.y();
            int d2 = d0Var.d();
            int i23 = 0;
            int i24 = 0;
            for (int i25 = 0; i25 < y14; i25++) {
                d0Var.L(1);
                int E = d0Var.E();
                for (int i26 = 0; i26 < E; i26++) {
                    int E2 = d0Var.E();
                    i24 += E2 + 4;
                    d0Var.L(E2);
                }
            }
            d0Var.K(d2);
            byte[] bArr = new byte[i24];
            e7.n nVar2 = nVar;
            int i27 = -1;
            int i28 = -1;
            int i29 = -1;
            int i33 = -1;
            int i34 = -1;
            int i35 = -1;
            int i36 = -1;
            int i37 = -1;
            float f13 = 1.0f;
            String str = null;
            int i38 = 0;
            int i39 = 0;
            while (i38 < y14) {
                int y15 = d0Var.y() & 63;
                int E3 = d0Var.E();
                int i43 = i23;
                e7.n nVar3 = nVar2;
                while (i43 < E3) {
                    int E4 = d0Var.E();
                    int i44 = y14;
                    System.arraycopy(e7.q.f57591a, i23, bArr, i39, i19);
                    int i45 = i39 + 4;
                    System.arraycopy(d0Var.c(), d0Var.d(), bArr, i45, E4);
                    if (y15 == 32 && i43 == 0) {
                        nVar3 = e7.q.k(bArr, i45, i45 + E4);
                        i13 = E3;
                    } else if (y15 == 33 && i43 == 0) {
                        e7.l j13 = e7.q.j(bArr, i45, i45 + E4, nVar3);
                        int i46 = j13.f57552a + 1;
                        int i47 = j13.f57554c + 8;
                        i29 = j13.f57555d + 8;
                        int i48 = j13.f57560i;
                        int i49 = j13.f57561j;
                        int i53 = j13.f57562k;
                        float f14 = j13.f57558g;
                        int i54 = j13.f57559h;
                        e7.j jVar = j13.f57553b;
                        if (jVar != null) {
                            i15 = i54;
                            i16 = i49;
                            i13 = E3;
                            i17 = i48;
                            i18 = i47;
                            str = d7.f.b(jVar.f57541a, jVar.f57543c, jVar.f57544d, jVar.f57546f, jVar.f57542b, jVar.f57545e);
                        } else {
                            i15 = i54;
                            i16 = i49;
                            i13 = E3;
                            i17 = i48;
                            i18 = i47;
                        }
                        i27 = i46;
                        i28 = i18;
                        i23 = 0;
                        int i55 = i15;
                        i35 = i53;
                        i33 = i17;
                        i37 = i55;
                        int i56 = i16;
                        f13 = f14;
                        i34 = i56;
                    } else {
                        i13 = E3;
                        if (y15 != 39 || i43 != 0 || (i14 = e7.q.i(bArr, i45, i45 + E4)) == null || nVar3 == null) {
                            i23 = 0;
                        } else {
                            c1 c1Var = nVar3.f57566a;
                            if (c1Var.isEmpty()) {
                                i23 = 0;
                                i36 = 0;
                            } else {
                                i23 = 0;
                                i36 = i14.f254a == ((e7.h) c1Var.get(0)).f57537b ? 4 : 5;
                            }
                        }
                    }
                    i39 = i45 + E4;
                    d0Var.L(E4);
                    i43++;
                    y14 = i44;
                    E3 = i13;
                    i19 = 4;
                }
                i38++;
                nVar2 = nVar3;
                i19 = 4;
            }
            return new a0(i24 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), y13 + 1, i27, i28, i29, i33, i34, i35, i36, f13, i37, str, nVar2);
        } catch (ArrayIndexOutOfBoundsException e13) {
            throw ParserException.a("Error parsing".concat(z13 ? "L-HEVC config" : "HEVC config"), e13);
        }
    }
}
