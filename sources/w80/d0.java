package w80;

import androidx.compose.foundation.layout.FillElement;
import i2.f2;
import i2.y3;
import i2.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s80.f4;

/* loaded from: classes5.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f128272a = 88;

    public static final void a(d1 state, do2.i touchEventFlow, u2.q qVar, float f13, Function0 function0, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(touchEventFlow, "touchEventFlow");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(989568475);
        u2.q qVar2 = (i14 & 4) != 0 ? u2.n.f120041b : qVar;
        float f14 = (i14 & 8) != 0 ? f128272a : f13;
        Function0 function02 = (i14 & 16) != 0 ? a0.f128247i : function0;
        u2.q c13 = androidx.compose.foundation.layout.e.c(qVar2, f14);
        q3.p0 e13 = p1.q.e(u2.b.f120017e, false);
        int i15 = sVar.P;
        z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, c13);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        if (!(sVar.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, e13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i15))) {
            ep.b.y(i15, sVar, i15, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        g1 g1Var = state.f128273a;
        if (g1Var instanceof e1) {
            sVar.W(1822666767);
            b((e1) g1Var, null, sVar, 0, 2);
            sVar.r(false);
        } else if (g1Var instanceof f1) {
            sVar.W(1822668352);
            c((f1) g1Var, touchEventFlow, null, function02, sVar, ((i13 >> 3) & 7168) | 64, 4);
            sVar.r(false);
        } else {
            sVar.W(1822671260);
            sVar.r(false);
        }
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new f4(state, touchEventFlow, qVar2, f14, function02, i13, i14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(w80.e1 r25, u2.q r26, i2.o r27, int r28, int r29) {
        /*
            r4 = r25
            r0 = r27
            i2.s r0 = (i2.s) r0
            r1 = -711392427(0xffffffffd5990355, float:-2.1029949E13)
            r0.Y(r1)
            r1 = r29 & 1
            if (r1 == 0) goto L13
            r1 = r28 | 6
            goto L25
        L13:
            r1 = r28 & 14
            if (r1 != 0) goto L23
            boolean r1 = r0.h(r4)
            if (r1 == 0) goto L1f
            r1 = 4
            goto L20
        L1f:
            r1 = 2
        L20:
            r1 = r28 | r1
            goto L25
        L23:
            r1 = r28
        L25:
            r2 = r29 & 2
            if (r2 == 0) goto L2e
            r1 = r1 | 48
        L2b:
            r3 = r26
            goto L40
        L2e:
            r3 = r28 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L2b
            r3 = r26
            boolean r5 = r0.h(r3)
            if (r5 == 0) goto L3d
            r5 = 32
            goto L3f
        L3d:
            r5 = 16
        L3f:
            r1 = r1 | r5
        L40:
            r5 = r1 & 91
            r6 = 18
            if (r5 != r6) goto L52
            boolean r5 = r0.z()
            if (r5 != 0) goto L4d
            goto L52
        L4d:
            r0.Q()
            r5 = r3
            goto L90
        L52:
            if (r2 == 0) goto L57
            u2.n r2 = u2.n.f120041b
            goto L58
        L57:
            r2 = r3
        L58:
            rn1.a r3 = new rn1.a
            int r5 = r4.f128281a
            r6 = 0
            java.lang.String[] r6 = new java.lang.String[r6]
            u50.k0 r6 = bs1.c.j2(r6, r5)
            vn1.g r10 = vn1.g.HEADING_700
            r22 = 0
            r23 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 2097134(0x1fffee, float:2.93871E-39)
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1 = r1 & 112(0x70, float:1.57E-43)
            r10 = r1 | 8
            r11 = 12
            r6 = r2
            r9 = r0
            dl2.b.c(r5, r6, r7, r8, r9, r10, r11)
            r5 = r2
        L90:
            i2.f2 r6 = r0.t()
            if (r6 == 0) goto La5
            q1.l r7 = new q1.l
            r3 = 4
            r0 = r7
            r1 = r28
            r2 = r29
            r4 = r25
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f71113d = r7
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w80.d0.b(w80.e1, u2.q, i2.o, int, int):void");
    }

    public static final void c(f1 f1Var, do2.i iVar, u2.q qVar, Function0 function0, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1814974543);
        u2.q qVar2 = (i14 & 4) != 0 ? u2.n.f120041b : qVar;
        Function0 function02 = (i14 & 8) != 0 ? b0.f128259i : function0;
        sVar.W(1129764039);
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        y3 y3Var = y3.f71400a;
        if (J2 == dVar) {
            J2 = bs1.c.u1(a3.d.f483e, y3Var);
            sVar.g0(J2);
        }
        i2.q1 q1Var = (i2.q1) J2;
        Object d2 = jq.b.d(sVar, false, 1129765955);
        if (d2 == dVar) {
            d2 = bs1.c.u1(Boolean.FALSE, y3Var);
            sVar.g0(d2);
        }
        i2.q1 q1Var2 = (i2.q1) d2;
        sVar.r(false);
        i2.u.e(Unit.f80348a, new c0(iVar, function02, q1Var, q1Var2, null), sVar);
        FillElement fillElement = androidx.compose.foundation.layout.e.f17184c;
        sVar.W(1129783790);
        Object J3 = sVar.J();
        if (J3 == dVar) {
            J3 = new w1.o(6, q1Var);
            sVar.g0(J3);
        }
        sVar.r(false);
        u2.q g13 = androidx.compose.ui.layout.b.g(fillElement, (Function1) J3);
        q3.p0 e13 = p1.q.e(u2.b.f120017e, false);
        int i15 = sVar.P;
        z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, g13);
        s3.k.Qo.getClass();
        s3.i iVar2 = s3.j.f110798b;
        if (!(sVar.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar2);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, e13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i15))) {
            ep.b.y(i15, sVar, i15, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        rm1.d dVar2 = new rm1.d(new rm1.f(f1Var.f128286a, rm1.i.XL), ((Boolean) q1Var2.getValue()).booleanValue() ? rm1.c.ERROR : rm1.c.DEFAULT, null, 0, null, 28);
        sVar.W(-1261679372);
        boolean z13 = (((i13 & 7168) ^ 3072) > 2048 && sVar.h(function02)) || (i13 & 3072) == 2048;
        Object J4 = sVar.J();
        if (z13 || J4 == dVar) {
            J4 = new mq.d0(16, function02);
            sVar.g0(J4);
        }
        sVar.r(false);
        ve.h.a(dVar2, androidx.compose.foundation.a.e(qVar2, false, null, (Function0) J4, 7), null, sVar, 8, 4);
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.r((Object) f1Var, (Object) iVar, qVar2, function02, i13, i14, 8);
        }
    }
}
