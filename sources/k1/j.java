package k1;

import a.l9;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class j extends s3.n implements s3.f2, l3.d, z2.d, s3.g2, s3.j2 {
    public static final d0.o G = new d0.o(13, 0);
    public o1.h A;
    public o1.l D;
    public boolean E;
    public final d0.o F;

    /* renamed from: p, reason: collision with root package name */
    public o1.l f77890p;

    /* renamed from: q, reason: collision with root package name */
    public q1 f77891q;

    /* renamed from: r, reason: collision with root package name */
    public String f77892r;

    /* renamed from: s, reason: collision with root package name */
    public z3.g f77893s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f77894t;

    /* renamed from: u, reason: collision with root package name */
    public Function0 f77895u;

    /* renamed from: w, reason: collision with root package name */
    public final u0 f77897w;

    /* renamed from: x, reason: collision with root package name */
    public n3.h0 f77898x;

    /* renamed from: y, reason: collision with root package name */
    public s3.m f77899y;

    /* renamed from: z, reason: collision with root package name */
    public o1.n f77900z;

    /* renamed from: v, reason: collision with root package name */
    public final q0 f77896v = new q0();
    public final LinkedHashMap B = new LinkedHashMap();
    public long C = 0;

    public j(o1.l lVar, q1 q1Var, boolean z13, String str, z3.g gVar, Function0 function0) {
        this.f77890p = lVar;
        this.f77891q = q1Var;
        this.f77892r = str;
        this.f77893s = gVar;
        this.f77894t = z13;
        this.f77895u = function0;
        this.f77897w = new u0(lVar);
        o1.l lVar2 = this.f77890p;
        this.D = lVar2;
        this.E = lVar2 == null && this.f77891q != null;
        this.F = G;
    }

    @Override // u2.p
    public final boolean A0() {
        return false;
    }

    @Override // u2.p
    public final void D0() {
        if (!this.E) {
            S0();
        }
        if (this.f77894t) {
            M0(this.f77896v);
            M0(this.f77897w);
        }
    }

    @Override // u2.p
    public final void E0() {
        R0();
        if (this.D == null) {
            this.f77890p = null;
        }
        s3.m mVar = this.f77899y;
        if (mVar != null) {
            N0(mVar);
        }
        this.f77899y = null;
    }

    public void P0(z3.j jVar) {
    }

    public abstract Object Q0(n3.w wVar, bl2.c cVar);

    public final void R0() {
        o1.l lVar = this.f77890p;
        LinkedHashMap linkedHashMap = this.B;
        if (lVar != null) {
            o1.n nVar = this.f77900z;
            if (nVar != null) {
                lVar.b(new o1.m(nVar));
            }
            o1.h hVar = this.A;
            if (hVar != null) {
                lVar.b(new o1.i(hVar));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                lVar.b(new o1.m((o1.n) it.next()));
            }
        }
        this.f77900z = null;
        this.A = null;
        linkedHashMap.clear();
    }

    public final void S0() {
        q1 q1Var;
        if (this.f77899y == null && (q1Var = this.f77891q) != null) {
            if (this.f77890p == null) {
                this.f77890p = new o1.l();
            }
            this.f77897w.P0(this.f77890p);
            o1.l lVar = this.f77890p;
            Intrinsics.f(lVar);
            s3.m b13 = q1Var.b(lVar);
            M0(b13);
            this.f77899y = b13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r3.f77899y == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        r4 = r3.f77899y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r4 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if (r3.E != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        r0.P0(r3.f77890p);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        if (r4 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0085, code lost:
    
        N0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        r3.f77899y = null;
        S0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0079, code lost:
    
        if (r4 != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T0(o1.l r4, k1.q1 r5, boolean r6, java.lang.String r7, z3.g r8, kotlin.jvm.functions.Function0 r9) {
        /*
            r3 = this;
            o1.l r0 = r3.D
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r4)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L13
            r3.R0()
            r3.D = r4
            r3.f77890p = r4
            r4 = r2
            goto L14
        L13:
            r4 = r1
        L14:
            k1.q1 r0 = r3.f77891q
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r5)
            if (r0 != 0) goto L1f
            r3.f77891q = r5
            r4 = r2
        L1f:
            boolean r5 = r3.f77894t
            k1.u0 r0 = r3.f77897w
            if (r5 == r6) goto L3e
            k1.q0 r5 = r3.f77896v
            if (r6 == 0) goto L30
            r3.M0(r5)
            r3.M0(r0)
            goto L39
        L30:
            r3.N0(r5)
            r3.N0(r0)
            r3.R0()
        L39:
            com.bumptech.glide.c.m0(r3)
            r3.f77894t = r6
        L3e:
            java.lang.String r5 = r3.f77892r
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r7)
            if (r5 != 0) goto L4b
            r3.f77892r = r7
            com.bumptech.glide.c.m0(r3)
        L4b:
            z3.g r5 = r3.f77893s
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r8)
            if (r5 != 0) goto L58
            r3.f77893s = r8
            com.bumptech.glide.c.m0(r3)
        L58:
            r3.f77895u = r9
            boolean r5 = r3.E
            o1.l r6 = r3.D
            if (r6 != 0) goto L66
            k1.q1 r7 = r3.f77891q
            if (r7 == 0) goto L66
            r7 = r2
            goto L67
        L66:
            r7 = r1
        L67:
            if (r5 == r7) goto L79
            if (r6 != 0) goto L70
            k1.q1 r5 = r3.f77891q
            if (r5 == 0) goto L70
            r1 = r2
        L70:
            r3.E = r1
            if (r1 != 0) goto L79
            s3.m r5 = r3.f77899y
            if (r5 != 0) goto L79
            goto L7b
        L79:
            if (r4 == 0) goto L8e
        L7b:
            s3.m r4 = r3.f77899y
            if (r4 != 0) goto L83
            boolean r5 = r3.E
            if (r5 != 0) goto L8e
        L83:
            if (r4 == 0) goto L88
            r3.N0(r4)
        L88:
            r4 = 0
            r3.f77899y = r4
            r3.S0()
        L8e:
            o1.l r4 = r3.f77890p
            r0.P0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.j.T0(o1.l, k1.q1, boolean, java.lang.String, z3.g, kotlin.jvm.functions.Function0):void");
    }

    @Override // l3.d
    public final boolean V(KeyEvent keyEvent) {
        return false;
    }

    @Override // s3.f2
    public final void W(n3.j jVar, n3.k kVar, long j13) {
        long j14 = ((j13 >> 33) << 32) | (((j13 << 32) >> 33) & 4294967295L);
        this.C = com.bumptech.glide.c.d((int) (j14 >> 32), (int) (j14 & 4294967295L));
        S0();
        if (this.f77894t && kVar == n3.k.Main) {
            int i13 = jVar.f89073d;
            if (n3.o.a(i13, 4)) {
                kotlin.jvm.internal.j.z(z0(), null, null, new g(this, null), 3);
            } else if (n3.o.a(i13, 5)) {
                kotlin.jvm.internal.j.z(z0(), null, null, new h(this, null), 3);
            }
        }
        if (this.f77898x == null) {
            i iVar = new i(this, null);
            n3.j jVar2 = n3.f0.f89054a;
            n3.o0 o0Var = new n3.o0(null, null, null, iVar);
            M0(o0Var);
            this.f77898x = o0Var;
        }
        n3.h0 h0Var = this.f77898x;
        if (h0Var != null) {
            ((n3.o0) h0Var).W(jVar, kVar, j13);
        }
    }

    @Override // l3.d
    public final boolean b0(KeyEvent keyEvent) {
        int G2;
        S0();
        boolean z13 = this.f77894t;
        LinkedHashMap linkedHashMap = this.B;
        if (z13) {
            int i13 = f0.f77861b;
            if (pp2.a.p(l3.c.N(keyEvent), 2) && ((G2 = (int) (l3.c.G(keyEvent) >> 32)) == 23 || G2 == 66 || G2 == 160)) {
                if (linkedHashMap.containsKey(new l3.a(l9.a(keyEvent.getKeyCode())))) {
                    return false;
                }
                o1.n nVar = new o1.n(this.C);
                linkedHashMap.put(new l3.a(l9.a(keyEvent.getKeyCode())), nVar);
                if (this.f77890p != null) {
                    kotlin.jvm.internal.j.z(z0(), null, null, new e(this, nVar, null), 3);
                }
                return true;
            }
        }
        if (!this.f77894t) {
            return false;
        }
        int i14 = f0.f77861b;
        if (!pp2.a.p(l3.c.N(keyEvent), 1)) {
            return false;
        }
        int G3 = (int) (l3.c.G(keyEvent) >> 32);
        if (G3 != 23 && G3 != 66 && G3 != 160) {
            return false;
        }
        o1.n nVar2 = (o1.n) linkedHashMap.remove(new l3.a(l9.a(keyEvent.getKeyCode())));
        if (nVar2 != null && this.f77890p != null) {
            kotlin.jvm.internal.j.z(z0(), null, null, new f(this, nVar2, null), 3);
        }
        this.f77895u.invoke();
        return true;
    }

    @Override // s3.f2
    public final void c0() {
        o1.h hVar;
        o1.l lVar = this.f77890p;
        if (lVar != null && (hVar = this.A) != null) {
            lVar.b(new o1.i(hVar));
        }
        this.A = null;
        n3.h0 h0Var = this.f77898x;
        if (h0Var != null) {
            ((n3.o0) h0Var).c0();
        }
    }

    @Override // s3.j2
    public final Object l() {
        return this.F;
    }

    @Override // s3.g2
    public final void m0(z3.j jVar) {
        z3.g gVar = this.f77893s;
        if (gVar != null) {
            z3.w.h(jVar, gVar.f140670a);
        }
        String str = this.f77892r;
        j1.q0 q0Var = new j1.q0(this, 2);
        rl2.u[] uVarArr = z3.w.f140760a;
        jVar.e(z3.i.f140675b, new z3.a(str, q0Var));
        if (this.f77894t) {
            this.f77897w.m0(jVar);
        } else {
            jVar.e(z3.t.f140741j, Unit.f80348a);
        }
        P0(jVar);
    }

    @Override // z2.d
    public final void x(z2.x xVar) {
        if (xVar.isFocused()) {
            S0();
        }
        if (this.f77894t) {
            this.f77897w.x(xVar);
        }
    }

    @Override // s3.g2
    public final boolean x0() {
        return true;
    }
}
