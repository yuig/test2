package dm2;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import pn2.q1;

/* loaded from: classes2.dex */
public class k extends z implements am2.f {
    public final boolean E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(am2.g gVar, am2.l lVar, bm2.i iVar, boolean z13, am2.c cVar, am2.w0 w0Var) {
        super(cVar, gVar, lVar, w0Var, iVar, ym2.i.f139486e);
        if (gVar == null) {
            X(0);
            throw null;
        }
        if (iVar == null) {
            X(1);
            throw null;
        }
        if (cVar == null) {
            X(2);
            throw null;
        }
        if (w0Var == null) {
            X(3);
            throw null;
        }
        this.E = z13;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void X(int r8) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dm2.k.X(int):void");
    }

    @Override // dm2.z
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public k v0(am2.c cVar, am2.m mVar, am2.x xVar, am2.w0 w0Var, bm2.i iVar, ym2.g gVar) {
        if (mVar == null) {
            X(23);
            throw null;
        }
        if (cVar == null) {
            X(24);
            throw null;
        }
        if (iVar == null) {
            X(25);
            throw null;
        }
        am2.c cVar2 = am2.c.DECLARATION;
        if (cVar == cVar2 || cVar == am2.c.SYNTHESIZED) {
            return new k((am2.g) mVar, this, iVar, this.E, cVar2, w0Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + mVar + "\nkind: " + cVar);
    }

    @Override // dm2.p, am2.m
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final am2.g g() {
        am2.g gVar = (am2.g) super.g();
        if (gVar != null) {
            return gVar;
        }
        X(17);
        throw null;
    }

    @Override // dm2.p
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public final am2.f o0() {
        am2.f fVar = (am2.f) super.o0();
        if (fVar != null) {
            return fVar;
        }
        X(19);
        throw null;
    }

    public final void H0(List list, am2.q qVar) {
        if (list == null) {
            X(13);
            throw null;
        }
        if (qVar != null) {
            I0(list, qVar, g().k());
        } else {
            X(14);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I0(java.util.List r12, am2.q r13, java.util.List r14) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L63
            if (r13 == 0) goto L5d
            if (r14 == 0) goto L57
            am2.g r1 = r11.g()
            boolean r2 = r1.q()
            if (r2 == 0) goto L21
            am2.m r1 = r1.g()
            boolean r2 = r1 instanceof am2.g
            if (r2 == 0) goto L21
            am2.g r1 = (am2.g) r1
            dm2.d r1 = r1.t0()
            r4 = r1
            goto L22
        L21:
            r4 = r0
        L22:
            am2.g r1 = r11.g()
            java.util.List r2 = r1.N()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L3e
            java.util.List r1 = r1.N()
            if (r1 == 0) goto L38
        L36:
            r5 = r1
            goto L45
        L38:
            r12 = 15
            X(r12)
            throw r0
        L3e:
            java.util.List r1 = java.util.Collections.emptyList()
            if (r1 == 0) goto L51
            goto L36
        L45:
            am2.c0 r9 = am2.c0.FINAL
            r3 = 0
            r8 = 0
            r2 = r11
            r6 = r14
            r7 = r12
            r10 = r13
            r2.y0(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L51:
            r12 = 16
            X(r12)
            throw r0
        L57:
            r12 = 12
            X(r12)
            throw r0
        L5d:
            r12 = 11
            X(r12)
            throw r0
        L63:
            r12 = 10
            X(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dm2.k.I0(java.util.List, am2.q, java.util.List):void");
    }

    @Override // dm2.z, am2.x, am2.y0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public final am2.f d(q1 q1Var) {
        if (q1Var != null) {
            return (am2.f) super.d(q1Var);
        }
        X(20);
        throw null;
    }

    @Override // am2.l
    public final boolean Q() {
        return this.E;
    }

    @Override // am2.l
    public final am2.g R() {
        am2.g g13 = g();
        if (g13 != null) {
            return g13;
        }
        X(18);
        throw null;
    }

    @Override // am2.d
    public final am2.d W(am2.m mVar, am2.c0 c0Var, am2.r rVar, am2.c cVar) {
        return (am2.f) r0(mVar, c0Var, rVar, cVar);
    }

    @Override // dm2.z, am2.d, am2.b
    public final Collection h() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        X(21);
        throw null;
    }

    @Override // dm2.z, am2.m
    public final Object l0(ul2.e eVar, Object obj) {
        return eVar.a(this, obj);
    }

    @Override // dm2.z, am2.d
    public final void n0(Collection collection) {
        if (collection != null) {
            return;
        }
        X(22);
        throw null;
    }
}
