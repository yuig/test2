package s4;

import com.google.firebase.messaging.q;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f111074p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f111075q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final h f111078c;

    /* renamed from: f, reason: collision with root package name */
    public c[] f111081f;

    /* renamed from: l, reason: collision with root package name */
    public final q f111087l;

    /* renamed from: o, reason: collision with root package name */
    public c f111090o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f111076a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f111077b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f111079d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f111080e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f111082g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean[] f111083h = new boolean[32];

    /* renamed from: i, reason: collision with root package name */
    public int f111084i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f111085j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f111086k = 32;

    /* renamed from: m, reason: collision with root package name */
    public j[] f111088m = new j[f111075q];

    /* renamed from: n, reason: collision with root package name */
    public int f111089n = 0;

    public d() {
        this.f111081f = null;
        this.f111081f = new c[32];
        v();
        q qVar = new q(1);
        this.f111087l = qVar;
        h hVar = new h(qVar);
        hVar.f111096f = new j[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN];
        hVar.f111097g = new j[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN];
        hVar.f111098h = 0;
        hVar.f111099i = new x92.b(hVar, hVar);
        this.f111078c = hVar;
        this.f111090o = new c(qVar);
    }

    public static int q(u4.e eVar) {
        j jVar = eVar.f120192i;
        if (jVar != null) {
            return (int) (jVar.f111104e + 0.5f);
        }
        return 0;
    }

    public final j a(i iVar) {
        j jVar = (j) ((f) this.f111087l.f33805c).b();
        if (jVar == null) {
            jVar = new j(iVar);
            jVar.f111108i = iVar;
        } else {
            jVar.c();
            jVar.f111108i = iVar;
        }
        int i13 = this.f111089n;
        int i14 = f111075q;
        if (i13 >= i14) {
            int i15 = i14 * 2;
            f111075q = i15;
            this.f111088m = (j[]) Arrays.copyOf(this.f111088m, i15);
        }
        j[] jVarArr = this.f111088m;
        int i16 = this.f111089n;
        this.f111089n = i16 + 1;
        jVarArr[i16] = jVar;
        return jVar;
    }

    public final void b(u4.h hVar, u4.h hVar2, float f13, int i13) {
        u4.d dVar = u4.d.LEFT;
        j n13 = n(hVar.l(dVar));
        u4.d dVar2 = u4.d.TOP;
        j n14 = n(hVar.l(dVar2));
        u4.d dVar3 = u4.d.RIGHT;
        j n15 = n(hVar.l(dVar3));
        u4.d dVar4 = u4.d.BOTTOM;
        j n16 = n(hVar.l(dVar4));
        j n17 = n(hVar2.l(dVar));
        j n18 = n(hVar2.l(dVar2));
        j n19 = n(hVar2.l(dVar3));
        j n23 = n(hVar2.l(dVar4));
        c o13 = o();
        double d2 = f13;
        double d13 = i13;
        float sin = (float) (Math.sin(d2) * d13);
        o13.f111072d.a(n18, 0.5f);
        o13.f111072d.a(n23, 0.5f);
        o13.f111072d.a(n14, -0.5f);
        o13.f111072d.a(n16, -0.5f);
        o13.f111070b = -sin;
        d(o13);
        c o14 = o();
        float cos = (float) (Math.cos(d2) * d13);
        o14.f111072d.a(n17, 0.5f);
        o14.f111072d.a(n19, 0.5f);
        o14.f111072d.a(n13, -0.5f);
        o14.f111072d.a(n15, -0.5f);
        o14.f111070b = -cos;
        d(o14);
    }

    public final void c(j jVar, j jVar2, int i13, float f13, j jVar3, j jVar4, int i14, int i15) {
        c o13 = o();
        if (jVar2 == jVar3) {
            o13.f111072d.a(jVar, 1.0f);
            o13.f111072d.a(jVar4, 1.0f);
            o13.f111072d.a(jVar2, -2.0f);
        } else if (f13 == 0.5f) {
            o13.f111072d.a(jVar, 1.0f);
            o13.f111072d.a(jVar2, -1.0f);
            o13.f111072d.a(jVar3, -1.0f);
            o13.f111072d.a(jVar4, 1.0f);
            if (i13 > 0 || i14 > 0) {
                o13.f111070b = (-i13) + i14;
            }
        } else if (f13 <= 0.0f) {
            o13.f111072d.a(jVar, -1.0f);
            o13.f111072d.a(jVar2, 1.0f);
            o13.f111070b = i13;
        } else if (f13 >= 1.0f) {
            o13.f111072d.a(jVar4, -1.0f);
            o13.f111072d.a(jVar3, 1.0f);
            o13.f111070b = -i14;
        } else {
            float f14 = 1.0f - f13;
            o13.f111072d.a(jVar, f14 * 1.0f);
            o13.f111072d.a(jVar2, f14 * (-1.0f));
            o13.f111072d.a(jVar3, (-1.0f) * f13);
            o13.f111072d.a(jVar4, 1.0f * f13);
            if (i13 > 0 || i14 > 0) {
                o13.f111070b = (i14 * f13) + ((-i13) * f14);
            }
        }
        if (i15 != 8) {
            o13.a(this, i15);
        }
        d(o13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ba, code lost:
    
        if (r5.f111111l <= 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bd, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c7, code lost:
    
        if (r5.f111111l <= 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00dc, code lost:
    
        if (r5.f111111l <= 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00df, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00e9, code lost:
    
        if (r5.f111111l <= 1) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(s4.c r17) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.d.d(s4.c):void");
    }

    public final void e(j jVar, int i13) {
        int i14 = jVar.f111102c;
        if (i14 == -1) {
            jVar.d(this, i13);
            for (int i15 = 0; i15 < this.f111077b + 1; i15++) {
                j jVar2 = ((j[]) this.f111087l.f33806d)[i15];
            }
            return;
        }
        if (i14 == -1) {
            c o13 = o();
            o13.b(jVar, i13);
            d(o13);
            return;
        }
        c cVar = this.f111081f[i14];
        if (cVar.f111073e) {
            cVar.f111070b = i13;
            return;
        }
        if (cVar.f111072d.g() == 0) {
            cVar.f111073e = true;
            cVar.f111070b = i13;
        } else {
            c o14 = o();
            o14.d(jVar, i13);
            d(o14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(s4.j r6, s4.j r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 8
            if (r9 != r0) goto L15
            boolean r1 = r7.f111105f
            if (r1 == 0) goto L15
            int r1 = r6.f111102c
            r2 = -1
            if (r1 != r2) goto L15
            float r7 = r7.f111104e
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.d(r5, r7)
            return
        L15:
            s4.c r1 = r5.o()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == 0) goto L37
            if (r8 >= 0) goto L25
            int r8 = r8 * (-1)
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            float r8 = (float) r8
            r1.f111070b = r8
            if (r4 != 0) goto L2c
            goto L37
        L2c:
            s4.b r8 = r1.f111072d
            r8.a(r6, r2)
            s4.b r6 = r1.f111072d
            r6.a(r7, r3)
            goto L41
        L37:
            s4.b r8 = r1.f111072d
            r8.a(r6, r3)
            s4.b r6 = r1.f111072d
            r6.a(r7, r2)
        L41:
            if (r9 == r0) goto L46
            r1.a(r5, r9)
        L46:
            r5.d(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.d.f(s4.j, s4.j, int, int):void");
    }

    public final void g(j jVar, j jVar2, int i13, int i14) {
        c o13 = o();
        j p13 = p();
        p13.f111103d = 0;
        o13.e(jVar, jVar2, p13, i13);
        if (i14 != 8) {
            o13.f111072d.a(l(i14), (int) (o13.f111072d.d(p13) * (-1.0f)));
        }
        d(o13);
    }

    public final void h(j jVar, j jVar2, int i13, int i14) {
        c o13 = o();
        j p13 = p();
        p13.f111103d = 0;
        o13.f(jVar, jVar2, p13, i13);
        if (i14 != 8) {
            o13.f111072d.a(l(i14), (int) (o13.f111072d.d(p13) * (-1.0f)));
        }
        d(o13);
    }

    public final void i(j jVar, j jVar2, j jVar3, j jVar4, float f13) {
        c o13 = o();
        o13.c(jVar, jVar2, jVar3, jVar4, f13);
        d(o13);
    }

    public final void j(c cVar) {
        int i13;
        if (cVar.f111073e) {
            cVar.f111069a.d(this, cVar.f111070b);
        } else {
            c[] cVarArr = this.f111081f;
            int i14 = this.f111085j;
            cVarArr[i14] = cVar;
            j jVar = cVar.f111069a;
            jVar.f111102c = i14;
            this.f111085j = i14 + 1;
            jVar.e(this, cVar);
        }
        if (this.f111076a) {
            int i15 = 0;
            while (i15 < this.f111085j) {
                if (this.f111081f[i15] == null) {
                    System.out.println("WTF");
                }
                c cVar2 = this.f111081f[i15];
                if (cVar2 != null && cVar2.f111073e) {
                    cVar2.f111069a.d(this, cVar2.f111070b);
                    ((f) this.f111087l.f33804b).a(cVar2);
                    this.f111081f[i15] = null;
                    int i16 = i15 + 1;
                    int i17 = i16;
                    while (true) {
                        i13 = this.f111085j;
                        if (i16 >= i13) {
                            break;
                        }
                        c[] cVarArr2 = this.f111081f;
                        int i18 = i16 - 1;
                        c cVar3 = cVarArr2[i16];
                        cVarArr2[i18] = cVar3;
                        j jVar2 = cVar3.f111069a;
                        if (jVar2.f111102c == i16) {
                            jVar2.f111102c = i18;
                        }
                        i17 = i16;
                        i16++;
                    }
                    if (i17 < i13) {
                        this.f111081f[i17] = null;
                    }
                    this.f111085j = i13 - 1;
                    i15--;
                }
                i15++;
            }
            this.f111076a = false;
        }
    }

    public final void k() {
        for (int i13 = 0; i13 < this.f111085j; i13++) {
            c cVar = this.f111081f[i13];
            cVar.f111069a.f111104e = cVar.f111070b;
        }
    }

    public final j l(int i13) {
        if (this.f111084i + 1 >= this.f111080e) {
            r();
        }
        j a13 = a(i.ERROR);
        int i14 = this.f111077b + 1;
        this.f111077b = i14;
        this.f111084i++;
        a13.f111101b = i14;
        a13.f111103d = i13;
        ((j[]) this.f111087l.f33806d)[i14] = a13;
        h hVar = this.f111078c;
        hVar.f111099i.f134365b = a13;
        float[] fArr = a13.f111107h;
        Arrays.fill(fArr, 0.0f);
        fArr[a13.f111103d] = 1.0f;
        hVar.n(a13);
        return a13;
    }

    public final j m() {
        if (this.f111084i + 1 >= this.f111080e) {
            r();
        }
        j a13 = a(i.SLACK);
        int i13 = this.f111077b + 1;
        this.f111077b = i13;
        this.f111084i++;
        a13.f111101b = i13;
        ((j[]) this.f111087l.f33806d)[i13] = a13;
        return a13;
    }

    public final j n(Object obj) {
        j jVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f111084i + 1 >= this.f111080e) {
            r();
        }
        if (obj instanceof u4.e) {
            u4.e eVar = (u4.e) obj;
            jVar = eVar.f120192i;
            if (jVar == null) {
                eVar.m();
                jVar = eVar.f120192i;
            }
            int i13 = jVar.f111101b;
            q qVar = this.f111087l;
            if (i13 == -1 || i13 > this.f111077b || ((j[]) qVar.f33806d)[i13] == null) {
                if (i13 != -1) {
                    jVar.c();
                }
                int i14 = this.f111077b + 1;
                this.f111077b = i14;
                this.f111084i++;
                jVar.f111101b = i14;
                jVar.f111108i = i.UNRESTRICTED;
                ((j[]) qVar.f33806d)[i14] = jVar;
            }
        }
        return jVar;
    }

    public final c o() {
        q qVar = this.f111087l;
        c cVar = (c) ((f) qVar.f33804b).b();
        if (cVar == null) {
            return new c(qVar);
        }
        cVar.f111069a = null;
        cVar.f111072d.clear();
        cVar.f111070b = 0.0f;
        cVar.f111073e = false;
        return cVar;
    }

    public final j p() {
        if (this.f111084i + 1 >= this.f111080e) {
            r();
        }
        j a13 = a(i.SLACK);
        int i13 = this.f111077b + 1;
        this.f111077b = i13;
        this.f111084i++;
        a13.f111101b = i13;
        ((j[]) this.f111087l.f33806d)[i13] = a13;
        return a13;
    }

    public final void r() {
        int i13 = this.f111079d * 2;
        this.f111079d = i13;
        this.f111081f = (c[]) Arrays.copyOf(this.f111081f, i13);
        q qVar = this.f111087l;
        qVar.f33806d = (j[]) Arrays.copyOf((j[]) qVar.f33806d, this.f111079d);
        int i14 = this.f111079d;
        this.f111083h = new boolean[i14];
        this.f111080e = i14;
        this.f111086k = i14;
    }

    public final void s() {
        h hVar = this.f111078c;
        if (hVar.h()) {
            k();
            return;
        }
        if (!this.f111082g) {
            t(hVar);
            return;
        }
        for (int i13 = 0; i13 < this.f111085j; i13++) {
            if (!this.f111081f[i13].f111073e) {
                t(hVar);
                return;
            }
        }
        k();
    }

    public final void t(h hVar) {
        int i13 = 0;
        while (true) {
            if (i13 >= this.f111085j) {
                break;
            }
            c cVar = this.f111081f[i13];
            if (cVar.f111069a.f111108i != i.UNRESTRICTED) {
                float f13 = 0.0f;
                if (cVar.f111070b < 0.0f) {
                    boolean z13 = false;
                    int i14 = 0;
                    while (!z13) {
                        i14++;
                        float f14 = Float.MAX_VALUE;
                        int i15 = -1;
                        int i16 = -1;
                        int i17 = 0;
                        int i18 = 0;
                        while (i17 < this.f111085j) {
                            c cVar2 = this.f111081f[i17];
                            if (cVar2.f111069a.f111108i != i.UNRESTRICTED && !cVar2.f111073e && cVar2.f111070b < f13) {
                                int g13 = cVar2.f111072d.g();
                                int i19 = 0;
                                while (i19 < g13) {
                                    j b13 = cVar2.f111072d.b(i19);
                                    float d2 = cVar2.f111072d.d(b13);
                                    if (d2 > f13) {
                                        for (int i23 = 0; i23 < 9; i23++) {
                                            float f15 = b13.f111106g[i23] / d2;
                                            if ((f15 < f14 && i23 == i18) || i23 > i18) {
                                                i18 = i23;
                                                i16 = b13.f111101b;
                                                i15 = i17;
                                                f14 = f15;
                                            }
                                        }
                                    }
                                    i19++;
                                    f13 = 0.0f;
                                }
                            }
                            i17++;
                            f13 = 0.0f;
                        }
                        if (i15 != -1) {
                            c cVar3 = this.f111081f[i15];
                            cVar3.f111069a.f111102c = -1;
                            cVar3.k(((j[]) this.f111087l.f33806d)[i16]);
                            j jVar = cVar3.f111069a;
                            jVar.f111102c = i15;
                            jVar.e(this, cVar3);
                        } else {
                            z13 = true;
                        }
                        if (i14 > this.f111084i / 2) {
                            z13 = true;
                        }
                        f13 = 0.0f;
                    }
                }
            }
            i13++;
        }
        u(hVar);
        k();
    }

    public final void u(c cVar) {
        for (int i13 = 0; i13 < this.f111084i; i13++) {
            this.f111083h[i13] = false;
        }
        boolean z13 = false;
        int i14 = 0;
        while (!z13) {
            i14++;
            if (i14 >= this.f111084i * 2) {
                return;
            }
            j jVar = cVar.f111069a;
            if (jVar != null) {
                this.f111083h[jVar.f111101b] = true;
            }
            j g13 = cVar.g(this.f111083h);
            if (g13 != null) {
                boolean[] zArr = this.f111083h;
                int i15 = g13.f111101b;
                if (zArr[i15]) {
                    return;
                } else {
                    zArr[i15] = true;
                }
            }
            if (g13 != null) {
                float f13 = Float.MAX_VALUE;
                int i16 = -1;
                for (int i17 = 0; i17 < this.f111085j; i17++) {
                    c cVar2 = this.f111081f[i17];
                    if (cVar2.f111069a.f111108i != i.UNRESTRICTED && !cVar2.f111073e && cVar2.f111072d.e(g13)) {
                        float d2 = cVar2.f111072d.d(g13);
                        if (d2 < 0.0f) {
                            float f14 = (-cVar2.f111070b) / d2;
                            if (f14 < f13) {
                                i16 = i17;
                                f13 = f14;
                            }
                        }
                    }
                }
                if (i16 > -1) {
                    c cVar3 = this.f111081f[i16];
                    cVar3.f111069a.f111102c = -1;
                    cVar3.k(g13);
                    j jVar2 = cVar3.f111069a;
                    jVar2.f111102c = i16;
                    jVar2.e(this, cVar3);
                }
            } else {
                z13 = true;
            }
        }
    }

    public final void v() {
        for (int i13 = 0; i13 < this.f111085j; i13++) {
            c cVar = this.f111081f[i13];
            if (cVar != null) {
                ((f) this.f111087l.f33804b).a(cVar);
            }
            this.f111081f[i13] = null;
        }
    }

    public final void w() {
        q qVar;
        int i13 = 0;
        while (true) {
            qVar = this.f111087l;
            j[] jVarArr = (j[]) qVar.f33806d;
            if (i13 >= jVarArr.length) {
                break;
            }
            j jVar = jVarArr[i13];
            if (jVar != null) {
                jVar.c();
            }
            i13++;
        }
        f fVar = (f) qVar.f33805c;
        j[] jVarArr2 = this.f111088m;
        int i14 = this.f111089n;
        fVar.getClass();
        if (i14 > jVarArr2.length) {
            i14 = jVarArr2.length;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            j jVar2 = jVarArr2[i15];
            int i16 = fVar.f111093c;
            Object[] objArr = fVar.f111092b;
            if (i16 < objArr.length) {
                objArr[i16] = jVar2;
                fVar.f111093c = i16 + 1;
            }
        }
        this.f111089n = 0;
        Arrays.fill((j[]) qVar.f33806d, (Object) null);
        this.f111077b = 0;
        h hVar = this.f111078c;
        hVar.f111098h = 0;
        hVar.f111070b = 0.0f;
        this.f111084i = 1;
        for (int i17 = 0; i17 < this.f111085j; i17++) {
            c cVar = this.f111081f[i17];
        }
        v();
        this.f111085j = 0;
        this.f111090o = new c(qVar);
    }
}
