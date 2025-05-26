package k9;

import a7.o0;
import a7.q;
import androidx.media3.common.ParserException;
import com.google.android.gms.internal.measurement.q4;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.c0;
import d7.d0;
import d7.u;
import java.util.ArrayList;
import java.util.Arrays;
import pk.c1;
import q8.m0;
import q8.n0;

/* loaded from: classes3.dex */
public final class k extends i {

    /* renamed from: n, reason: collision with root package name */
    public j f78709n;

    /* renamed from: o, reason: collision with root package name */
    public int f78710o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f78711p;

    /* renamed from: q, reason: collision with root package name */
    public n0 f78712q;

    /* renamed from: r, reason: collision with root package name */
    public bn0.a f78713r;

    @Override // k9.i
    public final void a(long j13) {
        this.f78697g = j13;
        this.f78711p = j13 != 0;
        n0 n0Var = this.f78712q;
        this.f78710o = n0Var != null ? n0Var.f102975e : 0;
    }

    @Override // k9.i
    public final long b(d0 d0Var) {
        byte b13 = d0Var.f53806a[0];
        if ((b13 & 1) == 1) {
            return -1L;
        }
        j jVar = this.f78709n;
        bf.b.w(jVar);
        boolean z13 = jVar.f78707d[(b13 >> 1) & (255 >>> (8 - jVar.f78708e))].f102963a;
        n0 n0Var = jVar.f78704a;
        int i13 = !z13 ? n0Var.f102975e : n0Var.f102976f;
        long j13 = this.f78711p ? (this.f78710o + i13) / 4 : 0;
        byte[] bArr = d0Var.f53806a;
        int length = bArr.length;
        int i14 = d0Var.f53808c + 4;
        if (length < i14) {
            byte[] copyOf = Arrays.copyOf(bArr, i14);
            d0Var.I(copyOf.length, copyOf);
        } else {
            d0Var.J(i14);
        }
        byte[] bArr2 = d0Var.f53806a;
        int i15 = d0Var.f53808c;
        bArr2[i15 - 4] = (byte) (j13 & 255);
        bArr2[i15 - 3] = (byte) ((j13 >>> 8) & 255);
        bArr2[i15 - 2] = (byte) ((j13 >>> 16) & 255);
        bArr2[i15 - 1] = (byte) ((j13 >>> 24) & 255);
        this.f78711p = true;
        this.f78710o = i13;
        return j13;
    }

    @Override // k9.i
    public final boolean c(d0 d0Var, long j13, q4 q4Var) {
        j jVar;
        if (this.f78709n != null) {
            ((androidx.media3.common.b) q4Var.f31594b).getClass();
            return false;
        }
        n0 n0Var = this.f78712q;
        int i13 = 4;
        if (n0Var == null) {
            ig1.b.p1(1, d0Var, false);
            d0Var.q();
            int y13 = d0Var.y();
            int q13 = d0Var.q();
            int m13 = d0Var.m();
            int i14 = m13 <= 0 ? -1 : m13;
            int m14 = d0Var.m();
            int i15 = m14 <= 0 ? -1 : m14;
            d0Var.m();
            int y14 = d0Var.y();
            int pow = (int) Math.pow(2.0d, y14 & 15);
            int pow2 = (int) Math.pow(2.0d, (y14 & RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM) >> 4);
            d0Var.y();
            this.f78712q = new n0(y13, q13, i14, i15, pow, pow2, Arrays.copyOf(d0Var.f53806a, d0Var.f53808c));
        } else {
            bn0.a aVar = this.f78713r;
            if (aVar == null) {
                this.f78713r = ig1.b.V0(d0Var, true, true);
            } else {
                int i16 = d0Var.f53808c;
                byte[] bArr = new byte[i16];
                System.arraycopy(d0Var.f53806a, 0, bArr, 0, i16);
                int i17 = 5;
                ig1.b.p1(5, d0Var, false);
                int y15 = d0Var.y() + 1;
                c0 c0Var = new c0(d0Var.f53806a, 1, 0);
                c0Var.o(d0Var.f53807b * 8);
                int i18 = 0;
                while (true) {
                    int i19 = 16;
                    if (i18 >= y15) {
                        int i23 = 6;
                        int g13 = c0Var.g(6) + 1;
                        for (int i24 = 0; i24 < g13; i24++) {
                            if (c0Var.g(16) != 0) {
                                throw ParserException.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int g14 = c0Var.g(6) + 1;
                        int i25 = 0;
                        while (true) {
                            int i26 = 3;
                            if (i25 < g14) {
                                int g15 = c0Var.g(i19);
                                if (g15 == 0) {
                                    int i27 = 8;
                                    c0Var.o(8);
                                    c0Var.o(16);
                                    c0Var.o(16);
                                    c0Var.o(6);
                                    c0Var.o(8);
                                    int g16 = c0Var.g(4) + 1;
                                    int i28 = 0;
                                    while (i28 < g16) {
                                        c0Var.o(i27);
                                        i28++;
                                        i27 = 8;
                                    }
                                } else {
                                    if (g15 != 1) {
                                        throw ParserException.a("floor type greater than 1 not decodable: " + g15, null);
                                    }
                                    int g17 = c0Var.g(i17);
                                    int[] iArr = new int[g17];
                                    int i29 = -1;
                                    for (int i33 = 0; i33 < g17; i33++) {
                                        int g18 = c0Var.g(i13);
                                        iArr[i33] = g18;
                                        if (g18 > i29) {
                                            i29 = g18;
                                        }
                                    }
                                    int i34 = i29 + 1;
                                    int[] iArr2 = new int[i34];
                                    int i35 = 0;
                                    while (i35 < i34) {
                                        iArr2[i35] = c0Var.g(i26) + 1;
                                        int g19 = c0Var.g(2);
                                        int i36 = 8;
                                        if (g19 > 0) {
                                            c0Var.o(8);
                                        }
                                        int i37 = i34;
                                        int i38 = 0;
                                        while (i38 < (1 << g19)) {
                                            c0Var.o(i36);
                                            i38++;
                                            i36 = 8;
                                        }
                                        i35++;
                                        i34 = i37;
                                        i26 = 3;
                                    }
                                    c0Var.o(2);
                                    int g23 = c0Var.g(4);
                                    int i39 = 0;
                                    int i43 = 0;
                                    for (int i44 = 0; i44 < g17; i44++) {
                                        i39 += iArr2[iArr[i44]];
                                        while (i43 < i39) {
                                            c0Var.o(g23);
                                            i43++;
                                        }
                                    }
                                }
                                i25++;
                                i23 = 6;
                                i13 = 4;
                                i19 = 16;
                                i17 = 5;
                            } else {
                                int g24 = c0Var.g(i23) + 1;
                                int i45 = 0;
                                while (i45 < g24) {
                                    if (c0Var.g(16) > 2) {
                                        throw ParserException.a("residueType greater than 2 is not decodable", null);
                                    }
                                    c0Var.o(24);
                                    c0Var.o(24);
                                    c0Var.o(24);
                                    int g25 = c0Var.g(i23) + 1;
                                    int i46 = 8;
                                    c0Var.o(8);
                                    int[] iArr3 = new int[g25];
                                    for (int i47 = 0; i47 < g25; i47++) {
                                        iArr3[i47] = ((c0Var.f() ? c0Var.g(5) : 0) * 8) + c0Var.g(3);
                                    }
                                    int i48 = 0;
                                    while (i48 < g25) {
                                        int i49 = 0;
                                        while (i49 < i46) {
                                            if ((iArr3[i48] & (1 << i49)) != 0) {
                                                c0Var.o(i46);
                                            }
                                            i49++;
                                            i46 = 8;
                                        }
                                        i48++;
                                        i46 = 8;
                                    }
                                    i45++;
                                    i23 = 6;
                                }
                                int g26 = c0Var.g(i23) + 1;
                                for (int i53 = 0; i53 < g26; i53++) {
                                    int g27 = c0Var.g(16);
                                    if (g27 != 0) {
                                        u.c("VorbisUtil", "mapping type other than 0 not supported: " + g27);
                                    } else {
                                        int g28 = c0Var.f() ? c0Var.g(4) + 1 : 1;
                                        boolean f13 = c0Var.f();
                                        int i54 = n0Var.f102971a;
                                        if (f13) {
                                            int g29 = c0Var.g(8) + 1;
                                            for (int i55 = 0; i55 < g29; i55++) {
                                                int i56 = i54 - 1;
                                                c0Var.o(ig1.b.u0(i56));
                                                c0Var.o(ig1.b.u0(i56));
                                            }
                                        }
                                        if (c0Var.g(2) != 0) {
                                            throw ParserException.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (g28 > 1) {
                                            for (int i57 = 0; i57 < i54; i57++) {
                                                c0Var.o(4);
                                            }
                                        }
                                        for (int i58 = 0; i58 < g28; i58++) {
                                            c0Var.o(8);
                                            c0Var.o(8);
                                            c0Var.o(8);
                                        }
                                    }
                                }
                                int g33 = c0Var.g(6);
                                int i59 = g33 + 1;
                                m0[] m0VarArr = new m0[i59];
                                for (int i63 = 0; i63 < i59; i63++) {
                                    boolean f14 = c0Var.f();
                                    c0Var.g(16);
                                    c0Var.g(16);
                                    c0Var.g(8);
                                    m0VarArr[i63] = new m0(f14);
                                }
                                if (!c0Var.f()) {
                                    throw ParserException.a("framing bit after modes not set as expected", null);
                                }
                                jVar = new j(n0Var, aVar, bArr, m0VarArr, ig1.b.u0(g33));
                            }
                        }
                    } else {
                        if (c0Var.g(24) != 5653314) {
                            throw ParserException.a("expected code book to start with [0x56, 0x43, 0x42] at " + c0Var.e(), null);
                        }
                        int g34 = c0Var.g(16);
                        int g35 = c0Var.g(24);
                        if (c0Var.f()) {
                            c0Var.o(5);
                            for (int i64 = 0; i64 < g35; i64 += c0Var.g(ig1.b.u0(g35 - i64))) {
                            }
                        } else {
                            boolean f15 = c0Var.f();
                            for (int i65 = 0; i65 < g35; i65++) {
                                if (!f15) {
                                    c0Var.o(5);
                                } else if (c0Var.f()) {
                                    c0Var.o(5);
                                }
                            }
                        }
                        int g36 = c0Var.g(4);
                        if (g36 > 2) {
                            throw ParserException.a("lookup type greater than 2 not decodable: " + g36, null);
                        }
                        if (g36 == 1 || g36 == 2) {
                            c0Var.o(32);
                            c0Var.o(32);
                            int g37 = c0Var.g(4) + 1;
                            c0Var.o(1);
                            c0Var.o((int) ((g36 == 1 ? g34 != 0 ? (long) Math.floor(Math.pow(g35, 1.0d / g34)) : 0L : g34 * g35) * g37));
                        }
                        i18++;
                    }
                }
            }
        }
        jVar = null;
        this.f78709n = jVar;
        if (jVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        n0 n0Var2 = jVar.f78704a;
        arrayList.add(n0Var2.f102977g);
        arrayList.add(jVar.f78706c);
        a7.n0 S0 = ig1.b.S0(c1.s((String[]) jVar.f78705b.f23561d));
        q qVar = new q();
        qVar.f1180m = o0.r("audio/ogg");
        qVar.f1181n = o0.r("audio/vorbis");
        qVar.f1175h = n0Var2.f102974d;
        qVar.f1176i = n0Var2.f102973c;
        qVar.D = n0Var2.f102971a;
        qVar.E = n0Var2.f102972b;
        qVar.f1184q = arrayList;
        qVar.f1178k = S0;
        q4Var.f31594b = new androidx.media3.common.b(qVar);
        return true;
    }

    @Override // k9.i
    public final void d(boolean z13) {
        super.d(z13);
        if (z13) {
            this.f78709n = null;
            this.f78712q = null;
            this.f78713r = null;
        }
        this.f78710o = 0;
        this.f78711p = false;
    }
}
