package j9;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.d0;
import d7.n0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import pk.c1;
import pk.v2;
import pk.y0;
import q8.e0;
import q8.f0;
import q8.i0;
import q8.l0;
import q8.t;
import q8.u;

/* loaded from: classes3.dex */
public final class l implements q8.s, e0 {
    public static final /* synthetic */ int G = 0;
    public k[] A;
    public long[][] B;
    public int C;
    public long D;
    public int E;
    public e9.a F;

    /* renamed from: a, reason: collision with root package name */
    public final l9.j f75021a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75022b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f75023c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f75024d;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f75025e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f75026f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f75027g;

    /* renamed from: h, reason: collision with root package name */
    public final n f75028h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f75029i;

    /* renamed from: j, reason: collision with root package name */
    public v2 f75030j;

    /* renamed from: k, reason: collision with root package name */
    public int f75031k;

    /* renamed from: l, reason: collision with root package name */
    public int f75032l;

    /* renamed from: m, reason: collision with root package name */
    public long f75033m;

    /* renamed from: n, reason: collision with root package name */
    public int f75034n;

    /* renamed from: o, reason: collision with root package name */
    public d0 f75035o;

    /* renamed from: p, reason: collision with root package name */
    public int f75036p;

    /* renamed from: q, reason: collision with root package name */
    public int f75037q;

    /* renamed from: r, reason: collision with root package name */
    public int f75038r;

    /* renamed from: s, reason: collision with root package name */
    public int f75039s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f75040t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f75041u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f75042v;

    /* renamed from: w, reason: collision with root package name */
    public long f75043w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f75044x;

    /* renamed from: y, reason: collision with root package name */
    public long f75045y;

    /* renamed from: z, reason: collision with root package name */
    public u f75046z;

    public l(int i13, l9.j jVar) {
        this.f75021a = jVar;
        this.f75022b = i13;
        y0 y0Var = c1.f100372b;
        this.f75030j = v2.f100502e;
        this.f75031k = (i13 & 4) != 0 ? 3 : 0;
        this.f75028h = new n();
        this.f75029i = new ArrayList();
        this.f75026f = new d0(16);
        this.f75027g = new ArrayDeque();
        this.f75023c = new d0(e7.q.f57591a);
        this.f75024d = new d0(6);
        this.f75025e = new d0();
        this.f75036p = -1;
        this.f75046z = u.Po;
        this.A = new k[0];
    }

    public static int m(int i13) {
        int i14 = (i13 & 1) != 0 ? 32 : 0;
        return (i13 & 2) != 0 ? i14 | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN : i14;
    }

    @Override // q8.s
    public final void a() {
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        this.f75027g.clear();
        this.f75034n = 0;
        this.f75036p = -1;
        this.f75037q = 0;
        this.f75038r = 0;
        this.f75039s = 0;
        this.f75040t = false;
        if (j13 == 0) {
            if (this.f75031k != 3) {
                this.f75031k = 0;
                this.f75034n = 0;
                return;
            } else {
                n nVar = this.f75028h;
                nVar.f75051a.clear();
                nVar.f75052b = 0;
                this.f75029i.clear();
                return;
            }
        }
        for (k kVar : this.A) {
            s sVar = kVar.f75017b;
            int e13 = n0.e(sVar.f75094f, j14, false);
            while (true) {
                if (e13 < 0) {
                    e13 = -1;
                    break;
                } else if ((sVar.f75095g[e13] & 1) != 0) {
                    break;
                } else {
                    e13--;
                }
            }
            if (e13 == -1) {
                e13 = sVar.a(j14);
            }
            kVar.f75020e = e13;
            l0 l0Var = kVar.f75019d;
            if (l0Var != null) {
                l0Var.f102951b = false;
                l0Var.f102952c = 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x04f7, code lost:
    
        if (r3 != false) goto L266;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x039e A[SYNTHETIC] */
    @Override // q8.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(q8.t r34, q8.c0 r35) {
        /*
            Method dump skipped, instructions count: 1842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.l.d(q8.t, q8.c0):int");
    }

    @Override // q8.e0
    public final q8.d0 e(long j13) {
        long j14;
        long j15;
        long j16;
        long j17;
        boolean z13;
        int[] iArr;
        long j18;
        int a13;
        l lVar = this;
        long j19 = j13;
        k[] kVarArr = lVar.A;
        int length = kVarArr.length;
        f0 f0Var = f0.f102913c;
        if (length == 0) {
            return new q8.d0(f0Var, f0Var);
        }
        int i13 = lVar.C;
        boolean z14 = false;
        if (i13 != -1) {
            s sVar = kVarArr[i13].f75017b;
            int e13 = n0.e(sVar.f75094f, j19, false);
            while (true) {
                if (e13 < 0) {
                    e13 = -1;
                    break;
                }
                if ((sVar.f75095g[e13] & 1) != 0) {
                    break;
                }
                e13--;
            }
            if (e13 == -1) {
                e13 = sVar.a(j19);
            }
            if (e13 == -1) {
                return new q8.d0(f0Var, f0Var);
            }
            long[] jArr = sVar.f75094f;
            long j23 = jArr[e13];
            long[] jArr2 = sVar.f75091c;
            j14 = jArr2[e13];
            if (j23 >= j19 || e13 >= sVar.f75090b - 1 || (a13 = sVar.a(j19)) == -1 || a13 == e13) {
                j18 = -9223372036854775807L;
                j16 = -1;
            } else {
                j18 = jArr[a13];
                j16 = jArr2[a13];
            }
            j15 = j18;
            j19 = j23;
        } else {
            j14 = Long.MAX_VALUE;
            j15 = -9223372036854775807L;
            j16 = -1;
        }
        int i14 = 0;
        long j24 = j14;
        while (true) {
            k[] kVarArr2 = lVar.A;
            if (i14 >= kVarArr2.length) {
                break;
            }
            if (i14 != lVar.C) {
                s sVar2 = kVarArr2[i14].f75017b;
                int e14 = n0.e(sVar2.f75094f, j19, z14);
                while (true) {
                    iArr = sVar2.f75095g;
                    if (e14 < 0) {
                        e14 = -1;
                        break;
                    }
                    if ((iArr[e14] & 1) != 0) {
                        break;
                    }
                    e14--;
                }
                if (e14 == -1) {
                    e14 = sVar2.a(j19);
                }
                long[] jArr3 = sVar2.f75091c;
                if (e14 == -1) {
                    j17 = j19;
                } else {
                    j17 = j19;
                    j24 = Math.min(jArr3[e14], j24);
                }
                if (j15 != -9223372036854775807L) {
                    z13 = false;
                    int e15 = n0.e(sVar2.f75094f, j15, false);
                    while (true) {
                        if (e15 < 0) {
                            e15 = -1;
                            break;
                        }
                        if ((iArr[e15] & 1) != 0) {
                            break;
                        }
                        e15--;
                    }
                    if (e15 == -1) {
                        e15 = sVar2.a(j15);
                    }
                    if (e15 != -1) {
                        j16 = Math.min(jArr3[e15], j16);
                    }
                } else {
                    z13 = false;
                }
            } else {
                j17 = j19;
                z13 = z14;
            }
            i14++;
            lVar = this;
            z14 = z13;
            j19 = j17;
        }
        f0 f0Var2 = new f0(j19, j24);
        return j15 == -9223372036854775807L ? new q8.d0(f0Var2, f0Var2) : new q8.d0(f0Var2, new f0(j15, j16));
    }

    @Override // q8.s
    public final void f(u uVar) {
        if ((this.f75022b & 16) == 0) {
            uVar = new l9.m(uVar, this.f75021a);
        }
        this.f75046z = uVar;
    }

    @Override // q8.e0
    public final boolean h() {
        return true;
    }

    @Override // q8.s
    public final boolean i(t tVar) {
        v2 v2Var;
        i0 c13 = o.c(tVar, false, (this.f75022b & 2) != 0);
        if (c13 != null) {
            v2Var = c1.v(c13);
        } else {
            y0 y0Var = c1.f100372b;
            v2Var = v2.f100502e;
        }
        this.f75030j = v2Var;
        return c13 == null;
    }

    @Override // q8.s
    public final List j() {
        return this.f75030j;
    }

    @Override // q8.e0
    public final long l() {
        return this.D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x023f, code lost:
    
        r32 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0421, code lost:
    
        if (r2 == null) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0423, code lost:
    
        r9.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0426, code lost:
    
        r5 = r28;
        r7 = r29;
        r2 = r30;
        r0 = r31;
        r3 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0257, code lost:
    
        if (r6 != 1953655662) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0259, code lost:
    
        r2 = kh2.s0.L0(r6, r8, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0263, code lost:
    
        if (r6 != 1953329263) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0265, code lost:
    
        r0 = kh2.s0.N0(r6, "TBPM", r8, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x026d, code lost:
    
        r8.K(r11);
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0275, code lost:
    
        if (r6 != 1668311404) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0277, code lost:
    
        r0 = kh2.s0.N0(r6, "TCMP", r8, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0282, code lost:
    
        if (r6 != 1668249202) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0284, code lost:
    
        r2 = kh2.s0.K0(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x028c, code lost:
    
        if (r6 != 1631670868) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x028e, code lost:
    
        r2 = kh2.s0.P0(r6, r8, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0298, code lost:
    
        if (r6 != 1936682605) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x029a, code lost:
    
        r2 = kh2.s0.P0(r6, r8, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02a4, code lost:
    
        if (r6 != 1936679276) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02a6, code lost:
    
        r2 = kh2.s0.P0(r6, r8, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02b0, code lost:
    
        if (r6 != 1936679282) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02b2, code lost:
    
        r2 = kh2.s0.P0(r6, r8, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02bc, code lost:
    
        if (r6 != 1936679265) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02be, code lost:
    
        r2 = kh2.s0.P0(r6, r8, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02c9, code lost:
    
        if (r6 != 1936679791) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02cb, code lost:
    
        r2 = kh2.s0.P0(r6, r8, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02d6, code lost:
    
        if (r6 != 1920233063) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02d8, code lost:
    
        r0 = kh2.s0.N0(r6, "ITUNESADVISORY", r8, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02e3, code lost:
    
        if (r6 != 1885823344) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02e5, code lost:
    
        r0 = kh2.s0.N0(r6, "ITUNESGAPLESS", r8, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02f2, code lost:
    
        if (r6 != 1936683886) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f4, code lost:
    
        r2 = kh2.s0.P0(r6, r8, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02ff, code lost:
    
        if (r6 != 1953919848) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0301, code lost:
    
        r2 = kh2.s0.P0(r6, r8, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x030c, code lost:
    
        if (r6 != 757935405) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x030e, code lost:
    
        r0 = null;
        r2 = null;
        r5 = -1;
        r6 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0312, code lost:
    
        r14 = r8.f53807b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0314, code lost:
    
        if (r14 >= r11) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0316, code lost:
    
        r20 = r8.k();
        r7 = r8.k();
        r32 = r3;
        r8.L(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0327, code lost:
    
        if (r7 != 1835360622) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0329, code lost:
    
        r0 = r8.u(r20 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0350, code lost:
    
        r3 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0339, code lost:
    
        if (r7 != 1851878757) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x033b, code lost:
    
        r2 = r8.u(r20 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0345, code lost:
    
        if (r7 != 1684108385) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0347, code lost:
    
        r6 = r20;
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x034b, code lost:
    
        r8.L(r20 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0354, code lost:
    
        r32 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0358, code lost:
    
        if (r0 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x035a, code lost:
    
        if (r2 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x035d, code lost:
    
        if (r5 != (-1)) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0375, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0376, code lost:
    
        r8.K(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0360, code lost:
    
        r8.K(r5);
        r8.L(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0372, code lost:
    
        r2 = new d9.l(r0, r2, r8.u(r6 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x037b, code lost:
    
        r32 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03f9, code lost:
    
        d7.u.b("MetadataUtil", "Skipped unknown metadata entry: " + e7.e.h(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x040c, code lost:
    
        r8.K(r11);
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x021e, code lost:
    
        r5 = d9.k.a(kh2.s0.M0(r8) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0228, code lost:
    
        if (r5 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x022a, code lost:
    
        r2 = new d9.o("TCON", null, pk.c1.v(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0235, code lost:
    
        d7.u.g("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x023b, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0251, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0435, code lost:
    
        r8.K(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0438, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0212, code lost:
    
        r32 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0380, code lost:
    
        r5 = 16777215 & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0387, code lost:
    
        if (r5 != 6516084) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0389, code lost:
    
        r2 = kh2.s0.J0(r6, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0391, code lost:
    
        if (r5 == 7233901) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0396, code lost:
    
        if (r5 != 7631467) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x039d, code lost:
    
        if (r5 == 6516589) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03a2, code lost:
    
        if (r5 != 7828084) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03a9, code lost:
    
        if (r5 != 6578553) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03ab, code lost:
    
        r2 = kh2.s0.P0(r6, r8, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03b5, code lost:
    
        if (r5 != 4280916) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03b7, code lost:
    
        r2 = kh2.s0.P0(r6, r8, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03c1, code lost:
    
        if (r5 != 7630703) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03c3, code lost:
    
        r2 = kh2.s0.P0(r6, r8, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03cd, code lost:
    
        if (r5 != 6384738) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03cf, code lost:
    
        r2 = kh2.s0.P0(r6, r8, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x03d9, code lost:
    
        if (r5 != 7108978) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03db, code lost:
    
        r2 = kh2.s0.P0(r6, r8, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x03e5, code lost:
    
        if (r5 != 6776174) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03e7, code lost:
    
        r2 = kh2.s0.P0(r6, r8, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03ef, code lost:
    
        if (r5 != 6779504) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x03f1, code lost:
    
        r2 = kh2.s0.P0(r6, r8, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0411, code lost:
    
        r2 = kh2.s0.P0(r6, r8, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0419, code lost:
    
        r2 = kh2.s0.P0(r6, r8, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0439, code lost:
    
        r31 = r0;
        r30 = r2;
        r32 = r3;
        r29 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0446, code lost:
    
        if (r9.isEmpty() == false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0449, code lost:
    
        r0 = new a7.n0(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01dc, code lost:
    
        r8.K(r5);
        r5 = r5 + r11;
        r8.L(8);
        r9 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ea, code lost:
    
        r11 = r8.f53807b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ec, code lost:
    
        if (r11 >= r5) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ee, code lost:
    
        r11 = r8.k() + r11;
        r6 = r8.k();
        r28 = r5;
        r5 = (r6 >> 24) & 255;
        r29 = r7;
        r30 = r2;
        r31 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x020c, code lost:
    
        if (r5 == 169) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0210, code lost:
    
        if (r5 != 253) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x021c, code lost:
    
        if (r6 != 1735291493) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0248, code lost:
    
        if (r6 != 1684632427) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x024a, code lost:
    
        r2 = kh2.s0.L0(r6, r8, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x023c, code lost:
    
        r8.K(r11);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:386:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(long r35) {
        /*
            Method dump skipped, instructions count: 1980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.l.n(long):void");
    }
}
