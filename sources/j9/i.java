package j9;

import a.cb;
import a7.o0;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import com.google.firebase.messaging.a0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.d0;
import d7.n0;
import e7.w;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kh2.a1;
import pk.c1;
import pk.v2;
import pk.y0;
import q8.i0;
import q8.k0;
import q8.t;
import q8.u;

/* loaded from: classes.dex */
public final class i implements q8.s {
    public static final byte[] N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final androidx.media3.common.b O;
    public long A;
    public long B;
    public h C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public u I;

    /* renamed from: J, reason: collision with root package name */
    public k0[] f74986J;
    public k0[] K;
    public boolean L;
    public boolean M;

    /* renamed from: a, reason: collision with root package name */
    public final l9.j f74987a;

    /* renamed from: b, reason: collision with root package name */
    public final int f74988b;

    /* renamed from: c, reason: collision with root package name */
    public final p f74989c;

    /* renamed from: d, reason: collision with root package name */
    public final List f74990d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f74991e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f74992f;

    /* renamed from: g, reason: collision with root package name */
    public final d0 f74993g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f74994h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f74995i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f74996j;

    /* renamed from: k, reason: collision with root package name */
    public final d7.k0 f74997k;

    /* renamed from: l, reason: collision with root package name */
    public final tb.e f74998l;

    /* renamed from: m, reason: collision with root package name */
    public final d0 f74999m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque f75000n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayDeque f75001o;

    /* renamed from: p, reason: collision with root package name */
    public final w f75002p;

    /* renamed from: q, reason: collision with root package name */
    public final k0 f75003q;

    /* renamed from: r, reason: collision with root package name */
    public v2 f75004r;

    /* renamed from: s, reason: collision with root package name */
    public int f75005s;

    /* renamed from: t, reason: collision with root package name */
    public int f75006t;

    /* renamed from: u, reason: collision with root package name */
    public long f75007u;

    /* renamed from: v, reason: collision with root package name */
    public int f75008v;

    /* renamed from: w, reason: collision with root package name */
    public d0 f75009w;

    /* renamed from: x, reason: collision with root package name */
    public long f75010x;

    /* renamed from: y, reason: collision with root package name */
    public int f75011y;

    /* renamed from: z, reason: collision with root package name */
    public long f75012z;

    static {
        a7.q qVar = new a7.q();
        qVar.f1181n = o0.r("application/x-emsg");
        O = new androidx.media3.common.b(qVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(int i13, l9.j jVar) {
        this(jVar, i13, null, null, v2.f100502e, null);
        y0 y0Var = c1.f100372b;
    }

    public static int c(int i13) {
        int i14 = (i13 & 1) != 0 ? 64 : 0;
        return (i13 & 2) != 0 ? i14 | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN : i14;
    }

    public static DrmInitData e(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i13 = 0; i13 < size; i13++) {
            e7.d dVar = (e7.d) arrayList.get(i13);
            if (dVar.f57530b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = dVar.f57528c.f53806a;
                UUID p03 = a1.p0(bArr);
                if (p03 == null) {
                    d7.u.g("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new DrmInitData.SchemeData(p03, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new DrmInitData(arrayList2);
    }

    public static void h(d0 d0Var, r rVar) {
        d0Var.K(8);
        int k13 = d0Var.k();
        byte[] bArr = e.f74965a;
        if ((k13 & 1) == 1) {
            d0Var.L(8);
        }
        int C = d0Var.C();
        if (C == 1) {
            rVar.f75074c += e.d(k13) == 0 ? d0Var.A() : d0Var.D();
        } else {
            throw ParserException.a("Unexpected saio entry count: " + C, null);
        }
    }

    public static void k(q qVar, d0 d0Var, r rVar) {
        int i13;
        d0Var.K(8);
        int k13 = d0Var.k();
        byte[] bArr = e.f74965a;
        if ((k13 & 1) == 1) {
            d0Var.L(8);
        }
        int y13 = d0Var.y();
        int C = d0Var.C();
        if (C > rVar.f75076e) {
            StringBuilder s13 = a.a.s("Saiz sample count ", C, " is greater than fragment sample count");
            s13.append(rVar.f75076e);
            throw ParserException.a(s13.toString(), null);
        }
        int i14 = qVar.f75070d;
        if (y13 == 0) {
            boolean[] zArr = rVar.f75083l;
            i13 = 0;
            for (int i15 = 0; i15 < C; i15++) {
                int y14 = d0Var.y();
                i13 += y14;
                zArr[i15] = y14 > i14;
            }
        } else {
            i13 = y13 * C;
            Arrays.fill(rVar.f75083l, 0, C, y13 > i14);
        }
        Arrays.fill(rVar.f75083l, C, rVar.f75076e, false);
        if (i13 > 0) {
            rVar.f75085n.H(i13);
            rVar.f75082k = true;
            rVar.f75086o = true;
        }
    }

    public static void l(d0 d0Var, int i13, r rVar) {
        d0Var.K(i13 + 8);
        int k13 = d0Var.k();
        byte[] bArr = e.f74965a;
        if ((k13 & 1) != 0) {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z13 = (k13 & 2) != 0;
        int C = d0Var.C();
        if (C == 0) {
            Arrays.fill(rVar.f75083l, 0, rVar.f75076e, false);
            return;
        }
        if (C != rVar.f75076e) {
            StringBuilder s13 = a.a.s("Senc sample count ", C, " is different from fragment sample count");
            s13.append(rVar.f75076e);
            throw ParserException.a(s13.toString(), null);
        }
        Arrays.fill(rVar.f75083l, 0, C, z13);
        int a13 = d0Var.a();
        d0 d0Var2 = rVar.f75085n;
        d0Var2.H(a13);
        rVar.f75082k = true;
        rVar.f75086o = true;
        d0Var.i(d0Var2.f53806a, 0, d0Var2.f53808c);
        d0Var2.K(0);
        rVar.f75086o = false;
    }

    public static void m(d0 d0Var, r rVar, byte[] bArr) {
        d0Var.K(8);
        d0Var.i(bArr, 0, 16);
        if (Arrays.equals(bArr, N)) {
            l(d0Var, 16, rVar);
        }
    }

    @Override // q8.s
    public final void a() {
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        SparseArray sparseArray = this.f74991e;
        int size = sparseArray.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((h) sparseArray.valueAt(i13)).f();
        }
        this.f75001o.clear();
        this.f75011y = 0;
        this.f75002p.f57608d.clear();
        this.f75012z = j14;
        this.f75000n.clear();
        this.f75005s = 0;
        this.f75008v = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01a0, code lost:
    
        r14 = r30.F;
        r15 = r6.f75061g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01a4, code lost:
    
        if (r14 != 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a6, code lost:
    
        r14 = r30.K.length;
        r12 = r6.f75065k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ab, code lost:
    
        if (r14 > 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01af, code lost:
    
        if (r30.G != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b2, code lost:
    
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c9, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ca, code lost:
    
        r31.readFully(r13, r4, r12 + r14);
        r11.K(0);
        r6 = r11.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01d6, code lost:
    
        if (r6 < 0) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d8, code lost:
    
        r30.F = r6 - r14;
        r6 = r30.f74992f;
        r6.K(0);
        r10.d(4, 0, r6);
        r30.E += 4;
        r30.D += r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f1, code lost:
    
        if (r30.K.length <= 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f3, code lost:
    
        if (r14 <= 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01fb, code lost:
    
        if (e7.q.e(r15, r13[4]) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01fd, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0200, code lost:
    
        r30.H = r5;
        r10.d(r14, 0, r11);
        r30.E += r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x020b, code lost:
    
        if (r14 <= 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x020f, code lost:
    
        if (r30.G != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0215, code lost:
    
        if (e7.q.d(r13, r14, r15) == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0217, code lost:
    
        r30.G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x021a, code lost:
    
        r6 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01ff, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0227, code lost:
    
        throw androidx.media3.common.ParserException.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01b5, code lost:
    
        r14 = e7.q.f(r15);
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01c4, code lost:
    
        if ((r12 + r14) > (r30.D - r30.E)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01c6, code lost:
    
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0228, code lost:
    
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x022c, code lost:
    
        if (r30.H == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x022e, code lost:
    
        r5 = r30.f74994h;
        r5.H(r14);
        r31.readFully(r5.f53806a, 0, r30.F);
        r10.d(r30.F, 0, r5);
        r6 = r30.F;
        r18 = r4;
        r4 = e7.q.n(r5.e(), r5.f53806a);
        r5.K(0);
        r5.J(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0257, code lost:
    
        if (r15.f18767q != (-1)) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x025d, code lost:
    
        if (r9.c() == 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x025f, code lost:
    
        r9.d(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x026e, code lost:
    
        r9.a(r7, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0277, code lost:
    
        if ((r2.a() & 4) == 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0279, code lost:
    
        r9.b(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0287, code lost:
    
        r30.E += r6;
        r30.F -= r6;
        r6 = r16;
        r4 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0263, code lost:
    
        r4 = r9.c();
        r12 = r15.f18767q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0269, code lost:
    
        if (r4 == r12) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x026b, code lost:
    
        r9.d(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0280, code lost:
    
        r18 = r4;
        r6 = r10.e(r31, r14, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02a8, code lost:
    
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02ae, code lost:
    
        if (r30.G != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02b0, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02b3, code lost:
    
        r24 = r1;
        r1 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02b9, code lost:
    
        if (r1 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02bb, code lost:
    
        r27 = r1.f75069c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02c2, code lost:
    
        r10.a(r7, r24, r30.D, 0, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02cf, code lost:
    
        r1 = r30.f75001o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02d5, code lost:
    
        if (r1.isEmpty() != false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02d7, code lost:
    
        r1 = (j9.g) r1.removeFirst();
        r30.f75011y -= r1.f74972c;
        r4 = r1.f74971b;
        r5 = r1.f74970a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02e8, code lost:
    
        if (r4 == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02ea, code lost:
    
        r5 = r5 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02eb, code lost:
    
        if (r3 == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02ed, code lost:
    
        r5 = r3.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02f1, code lost:
    
        r4 = r30.f74986J;
        r15 = r4.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02f5, code lost:
    
        if (r14 >= r15) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02f7, code lost:
    
        r4[r14].a(r5, 1, r1.f74972c, r30.f75011y, null);
        r14 = r14 + 1;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x031b, code lost:
    
        if (r2.c() != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x031d, code lost:
    
        r30.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0320, code lost:
    
        r30.f75005s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0324, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02c0, code lost:
    
        r27 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0296, code lost:
    
        r4 = r30.E;
        r5 = r30.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x029a, code lost:
    
        if (r4 >= r5) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x029c, code lost:
    
        r30.E += r10.e(r31, r5 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0177, code lost:
    
        r7 = r4.f75080i[r2.f74978f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b1, code lost:
    
        r3 = r30.f75005s;
        r4 = r2.f74974b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
    
        if (r3 != 3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ba, code lost:
    
        if (r2.f74985m != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bc, code lost:
    
        r3 = r2.f74976d.f75092d[r2.f74978f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cb, code lost:
    
        r30.D = r3;
        r3 = r2.f74976d.f75089a.f75061g;
        r6 = java.util.Objects.equals(r3.f18765o, "video/avc");
        r7 = r30.f74988b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dd, code lost:
    
        if (r6 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e1, code lost:
    
        if ((r7 & 64) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e3, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f7, code lost:
    
        r30.G = !r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fe, code lost:
    
        if (r2.f74978f >= r2.f74981i) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0100, code lost:
    
        r31.p(r30.D);
        r2.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010c, code lost:
    
        if (r2.c() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x010e, code lost:
    
        r30.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0110, code lost:
    
        r30.f75005s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011d, code lost:
    
        if (r2.f74976d.f75089a.f75062h != 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011f, code lost:
    
        r30.D -= 8;
        r31.p(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0137, code lost:
    
        if ("audio/ac4".equals(r2.f74976d.f75089a.f75061g.f18765o) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0139, code lost:
    
        r30.E = r2.d(r30.D, 7);
        r3 = r30.D;
        r7 = r30.f74996j;
        q8.e.a(r3, r7);
        r2.f74973a.d(7, 0, r7);
        r30.E += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x015c, code lost:
    
        r30.D += r30.E;
        r30.f75005s = 4;
        r30.F = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0154, code lost:
    
        r30.E = r2.d(r30.D, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f5, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ee, code lost:
    
        if (java.util.Objects.equals(r3.f18765o, "video/hevc") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f2, code lost:
    
        if ((r7 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00c5, code lost:
    
        r3 = r4.f75079h[r2.f74978f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0168, code lost:
    
        r3 = r2.f74976d;
        r6 = r3.f75089a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x016e, code lost:
    
        if (r2.f74985m != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0170, code lost:
    
        r7 = r3.f75094f[r2.f74978f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017d, code lost:
    
        r3 = r30.f74997k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017f, code lost:
    
        if (r3 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0181, code lost:
    
        r7 = r3.a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0185, code lost:
    
        r4 = r6.f75065k;
        r10 = r2.f74973a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0189, code lost:
    
        if (r4 == 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018b, code lost:
    
        r11 = r30.f74993g;
        r13 = r11.f53806a;
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r4 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x019e, code lost:
    
        if (r30.E >= r30.D) goto L355;
     */
    @Override // q8.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(q8.t r31, q8.c0 r32) {
        /*
            Method dump skipped, instructions count: 1667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.i.d(q8.t, q8.c0):int");
    }

    @Override // q8.s
    public final void f(u uVar) {
        int i13;
        String str;
        int i14 = this.f74988b;
        if ((i14 & 32) == 0) {
            uVar = new l9.m(uVar, this.f74987a);
        }
        this.I = uVar;
        this.f75005s = 0;
        this.f75008v = 0;
        k0[] k0VarArr = new k0[2];
        this.f74986J = k0VarArr;
        k0 k0Var = this.f75003q;
        if (k0Var != null) {
            k0VarArr[0] = k0Var;
            i13 = 1;
        } else {
            i13 = 0;
        }
        int i15 = 100;
        if ((i14 & 4) != 0) {
            k0VarArr[i13] = uVar.D(100, 5);
            i15 = RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE;
            i13++;
        }
        k0[] k0VarArr2 = (k0[]) n0.a0(i13, this.f74986J);
        this.f74986J = k0VarArr2;
        for (k0 k0Var2 : k0VarArr2) {
            k0Var2.b(O);
        }
        List list = this.f74990d;
        this.K = new k0[list.size()];
        int i16 = 0;
        while (i16 < this.K.length) {
            k0 D = this.I.D(i15, 3);
            D.b((androidx.media3.common.b) list.get(i16));
            this.K[i16] = D;
            i16++;
            i15++;
        }
        p pVar = this.f74989c;
        if (pVar != null) {
            k0 D2 = this.I.D(0, pVar.f75056b);
            s sVar = new s(this.f74989c, new long[0], new int[0], 0, new long[0], new int[0], 0L);
            f fVar = new f(0, 0, 0, 0);
            String str2 = pVar.f75061g.f18765o;
            if (o0.q(str2)) {
                str = "video/mp4";
            } else if (o0.m(str2)) {
                str = "audio/mp4";
            } else {
                if (o0.o(str2)) {
                    if (Objects.equals(str2, "image/heic")) {
                        str = "image/heif";
                    } else if (Objects.equals(str2, "image/avif")) {
                        str = "image/avif";
                    }
                }
                str = "application/mp4";
            }
            this.f74991e.put(0, new h(D2, sVar, fVar, str));
            this.I.A();
        }
    }

    public final void g(d0 d0Var) {
        String str;
        long g03;
        long A;
        String str2;
        long j13;
        long j14;
        if (this.f74986J.length == 0) {
            return;
        }
        d0Var.K(8);
        int d2 = e.d(d0Var.k());
        if (d2 == 0) {
            String t13 = d0Var.t();
            t13.getClass();
            String t14 = d0Var.t();
            t14.getClass();
            long A2 = d0Var.A();
            long A3 = d0Var.A();
            RoundingMode roundingMode = RoundingMode.DOWN;
            long g04 = n0.g0(A3, 1000000L, A2, roundingMode);
            long j15 = this.B;
            long j16 = j15 != -9223372036854775807L ? j15 + g04 : -9223372036854775807L;
            str = t13;
            g03 = n0.g0(d0Var.A(), 1000L, A2, roundingMode);
            A = d0Var.A();
            str2 = t14;
            j13 = g04;
            j14 = j16;
        } else {
            if (d2 != 1) {
                cb.t("Skipping unsupported emsg version: ", d2, "FragmentedMp4Extractor");
                return;
            }
            long A4 = d0Var.A();
            long D = d0Var.D();
            RoundingMode roundingMode2 = RoundingMode.DOWN;
            long g05 = n0.g0(D, 1000000L, A4, roundingMode2);
            long g06 = n0.g0(d0Var.A(), 1000L, A4, roundingMode2);
            long A5 = d0Var.A();
            String t15 = d0Var.t();
            t15.getClass();
            String t16 = d0Var.t();
            t16.getClass();
            str = t15;
            g03 = g06;
            A = A5;
            str2 = t16;
            j14 = g05;
            j13 = -9223372036854775807L;
        }
        byte[] bArr = new byte[d0Var.a()];
        d0Var.i(bArr, 0, d0Var.a());
        d0 d0Var2 = new d0(this.f74998l.b(new a9.a(str, str2, g03, A, bArr)));
        int a13 = d0Var2.a();
        for (k0 k0Var : this.f74986J) {
            d0Var2.K(0);
            k0Var.d(a13, 0, d0Var2);
        }
        ArrayDeque arrayDeque = this.f75001o;
        if (j14 == -9223372036854775807L) {
            arrayDeque.addLast(new g(a13, j13, true));
            this.f75011y += a13;
            return;
        }
        if (!arrayDeque.isEmpty()) {
            arrayDeque.addLast(new g(a13, j14, false));
            this.f75011y += a13;
            return;
        }
        d7.k0 k0Var2 = this.f74997k;
        if (k0Var2 != null && !k0Var2.e()) {
            arrayDeque.addLast(new g(a13, j14, false));
            this.f75011y += a13;
            return;
        }
        if (k0Var2 != null) {
            j14 = k0Var2.a(j14);
        }
        for (k0 k0Var3 : this.f74986J) {
            k0Var3.a(j14, 1, a13, 0, null);
        }
    }

    @Override // q8.s
    public final boolean i(t tVar) {
        v2 v2Var;
        i0 b13 = o.b(tVar);
        if (b13 != null) {
            v2Var = c1.v(b13);
        } else {
            y0 y0Var = c1.f100372b;
            v2Var = v2.f100502e;
        }
        this.f75004r = v2Var;
        return b13 == null;
    }

    @Override // q8.s
    public final List j() {
        return this.f75004r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x039a, code lost:
    
        if ((r4 + d7.n0.g0(r0[0], 1000000, r7.f75057c, r43)) >= r7.f75059e) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x06d5, code lost:
    
        r5 = r0;
        r5.f75005s = 0;
        r5.f75008v = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x06db, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x061a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(long r54) {
        /*
            Method dump skipped, instructions count: 1756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.i.n(long):void");
    }

    public i(l9.j jVar, int i13, d7.k0 k0Var, p pVar, List list, k0 k0Var2) {
        this.f74987a = jVar;
        this.f74988b = i13;
        this.f74997k = k0Var;
        this.f74989c = pVar;
        this.f74990d = Collections.unmodifiableList(list);
        this.f75003q = k0Var2;
        this.f74998l = new tb.e(3);
        this.f74999m = new d0(16);
        this.f74992f = new d0(e7.q.f57591a);
        this.f74993g = new d0(6);
        this.f74994h = new d0();
        byte[] bArr = new byte[16];
        this.f74995i = bArr;
        this.f74996j = new d0(bArr);
        this.f75000n = new ArrayDeque();
        this.f75001o = new ArrayDeque();
        this.f74991e = new SparseArray();
        this.f75004r = v2.f100502e;
        this.A = -9223372036854775807L;
        this.f75012z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = u.Po;
        this.f74986J = new k0[0];
        this.K = new k0[0];
        this.f75002p = new w(new a0(this, 9));
    }
}
