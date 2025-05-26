package rf1;

import android.content.Context;
import com.pinterest.api.model.bp;
import com.pinterest.api.model.cp;
import com.pinterest.api.model.dp;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fo0;
import com.pinterest.api.model.gm0;
import com.pinterest.api.model.hp;
import com.pinterest.api.model.kp0;
import com.pinterest.api.model.lp;
import com.pinterest.api.model.mp0;
import com.pinterest.api.model.uo0;
import com.pinterest.api.model.vg;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.yo;
import com.pinterest.api.model.zk0;
import com.pinterest.api.model.zq0;
import java.util.HashMap;
import jk2.k2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.w1;
import lh0.z3;
import sf1.w0;
import x02.a2;
import x02.x0;

/* loaded from: classes5.dex */
public final class o extends vg {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f107795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f107796c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f107797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uo0 f107798e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, String str, int i13, uo0 uo0Var, Unit unit) {
        super(unit);
        this.f107795b = pVar;
        this.f107796c = str;
        this.f107797d = i13;
        this.f107798e = uo0Var;
    }

    @Override // com.pinterest.api.model.vg
    public final Object a(bp value11) {
        Intrinsics.checkNotNullParameter(value11, "value11");
        zk0 blockStyle = value11.k();
        if (blockStyle != null) {
            String m13 = value11.m();
            Integer n13 = value11.n();
            int value = a42.l.BOARD_STICKER.getValue();
            int intValue = n13.intValue();
            a2 a2Var = ck2.i.f27924d;
            ck2.c cVar = ck2.i.f27923c;
            lp lpVar = null;
            Object b13 = null;
            hp hpVar = null;
            Object obj = null;
            p pVar = this.f107795b;
            if (intValue == value) {
                cp cpVar = new cp();
                yo q13 = value11.q();
                if (q13 != null) {
                    hp hpVar2 = q13.f44091a;
                    if (hpVar2 != null) {
                        cpVar.a(hpVar2);
                        b13 = hpVar2;
                    } else {
                        lp lpVar2 = q13.f44092b;
                        if (lpVar2 != null) {
                            b13 = cpVar.b(lpVar2);
                        }
                    }
                    hpVar = (hp) b13;
                }
                hp hpVar3 = hpVar;
                if (hpVar3 != null) {
                    x0 x0Var = pVar.f107811i;
                    String b14 = hpVar3.b();
                    Intrinsics.checkNotNullExpressionValue(b14, "getBoardId(...)");
                    k2 I = x0Var.L(b14).I(1L);
                    int i13 = this.f107797d;
                    xj2.c F = I.F(new j(2, new m(pVar, blockStyle, value11, i13, hpVar3, m13, 0)), new j(3, new m(pVar, blockStyle, value11, i13, hpVar3, m13, 1)), cVar, a2Var);
                    Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
                    pVar.addDisposable(F);
                }
            } else {
                if (n13.intValue() == a42.l.QUESTION_STICKER.getValue()) {
                    dp dpVar = new dp();
                    yo q14 = value11.q();
                    if (q14 != null) {
                        hp hpVar4 = q14.f44091a;
                        if (hpVar4 != null) {
                            obj = dpVar.a(hpVar4);
                        } else {
                            lp lpVar3 = q14.f44092b;
                            if (lpVar3 != null) {
                                dpVar.b(lpVar3);
                                obj = lpVar3;
                            }
                        }
                        lpVar = (lp) obj;
                    }
                    if (lpVar != null && lpVar.c() != null) {
                        x02.u uVar = pVar.f107810h;
                        String c13 = lpVar.c();
                        Intrinsics.checkNotNullExpressionValue(c13, "getQuestionCommentId(...)");
                        xj2.c F2 = uVar.L(c13).I(1L).F(new j(4, new ed1.m(this, blockStyle, value11, 8)), new j(5, l.f107768l), cVar, a2Var);
                        Intrinsics.checkNotNullExpressionValue(F2, "subscribe(...)");
                        pVar.addDisposable(F2);
                    }
                } else {
                    sf1.t tVar = (sf1.t) pVar.getView();
                    Intrinsics.checkNotNullExpressionValue(value11.p(), "getStartTime(...)");
                    Intrinsics.checkNotNullExpressionValue(value11.l(), "getEndTime(...)");
                    sf1.s sVar = (sf1.s) tVar;
                    sVar.getClass();
                    Intrinsics.checkNotNullParameter(blockStyle, "blockStyle");
                    sf1.j jVar = new sf1.j(sVar, blockStyle);
                    Context context = sVar.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    sVar.addView(new androidx.appcompat.widget.g(context, new sp0.e(new sp0.d(jVar.f112624a, jVar.f112625b), new sp0.a(jVar.f112626c, jVar.f112627d), new sp0.a(sVar.f112699f, sVar.f112700g), jVar.f112628e, null, new sf1.m(sVar, 3), sVar), sVar.q()));
                }
            }
        }
        return Unit.f80348a;
    }

    @Override // com.pinterest.api.model.vg
    public final Object b(gm0 value0) {
        Intrinsics.checkNotNullParameter(value0, "value0");
        zk0 g13 = value0.g();
        if (g13 != null) {
            sf1.t tVar = (sf1.t) this.f107795b.getView();
            String i13 = value0.i();
            Intrinsics.checkNotNullExpressionValue(i13, "getText(...)");
            ((sf1.s) tVar).l(true, i13, g13, value0.h());
        }
        return Unit.f80348a;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01ef  */
    @Override // com.pinterest.api.model.vg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.pinterest.api.model.km0 r19) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rf1.o.c(com.pinterest.api.model.km0):java.lang.Object");
    }

    @Override // com.pinterest.api.model.vg
    public final Object e(fo0 value8) {
        Intrinsics.checkNotNullParameter(value8, "value8");
        zk0 blockStyle = value8.h();
        if (blockStyle != null) {
            p pVar = this.f107795b;
            HashMap hashMap = pVar.f107804b;
            wy0 wy0Var = hashMap != null ? (wy0) hashMap.get(value8.l()) : null;
            f30 f30Var = pVar.f107820r.f43312c;
            if (f30Var == null || !Intrinsics.d(f30Var.k5(), Boolean.TRUE)) {
                sf1.t tVar = (sf1.t) pVar.getView();
                String userId = value8.l();
                Intrinsics.checkNotNullExpressionValue(userId, "getUserId(...)");
                String l33 = wy0Var != null ? wy0Var.l3() : null;
                String Z2 = wy0Var != null ? wy0Var.Z2() : null;
                Boolean j13 = value8.j();
                Intrinsics.checkNotNullExpressionValue(j13, "getIsRemoved(...)");
                boolean booleanValue = j13.booleanValue();
                Double k13 = value8.k();
                Intrinsics.checkNotNullExpressionValue(k13, "getStartTime(...)");
                double doubleValue = k13.doubleValue();
                Double i13 = value8.i();
                Intrinsics.checkNotNullExpressionValue(i13, "getEndTime(...)");
                double doubleValue2 = i13.doubleValue();
                Integer q23 = wy0Var != null ? wy0Var.q2() : null;
                sf1.s sVar = (sf1.s) tVar;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(blockStyle, "blockStyle");
                Intrinsics.checkNotNullParameter(userId, "userId");
                sf1.j jVar = new sf1.j(sVar, blockStyle);
                Context context = sVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                float f13 = jVar.f112624a;
                float f14 = jVar.f112625b;
                sp0.d dVar = new sp0.d(f13, f14);
                int i14 = jVar.f112626c;
                int i15 = jVar.f112627d;
                sVar.addView(new androidx.appcompat.widget.g(context, new sp0.e(dVar, new sp0.a(i14, i15), new sp0.a(sVar.f112699f, sVar.f112700g), jVar.f112628e, new sp0.b(doubleValue, doubleValue2), new w1.h0(userId, sVar, Z2, l33, q23, booleanValue), sVar), sVar.q()));
                w0 w0Var = sVar.C;
                if (w0Var != null) {
                    w0Var.b(f13, f14, i15, this.f107797d);
                }
                return Unit.f80348a;
            }
        }
        return Unit.f80348a;
    }

    @Override // com.pinterest.api.model.vg
    public final Object g(kp0 value1) {
        Intrinsics.checkNotNullParameter(value1, "value1");
        zk0 f13 = value1.f();
        if (f13 != null) {
            sf1.t tVar = (sf1.t) this.f107795b.getView();
            String h10 = value1.h();
            Intrinsics.checkNotNullExpressionValue(h10, "getText(...)");
            ((sf1.s) tVar).l(false, h10, f13, value1.g());
        }
        return Unit.f80348a;
    }

    @Override // com.pinterest.api.model.vg
    public final Object h(mp0 value9) {
        Intrinsics.checkNotNullParameter(value9, "value9");
        zk0 i13 = value9.i();
        if (i13 != null) {
            p pVar = this.f107795b;
            w1 w1Var = pVar.f107815m;
            w1Var.getClass();
            z3 z3Var = a4.f83297a;
            g1 g1Var = (g1) w1Var.f83496a;
            if (!g1Var.o("android_product_tag_api_migration", "enabled", z3Var) && !g1Var.l("android_product_tag_api_migration")) {
                HashMap hashMap = pVar.f107805c;
                f30 f30Var = hashMap != null ? (f30) hashMap.get(value9.l()) : null;
                if (f30Var != null) {
                    l(f30Var, i13, value9);
                } else {
                    String l13 = value9.l();
                    Intrinsics.checkNotNullExpressionValue(l13, "getPinId(...)");
                    pVar.addDisposable(pVar.f107807e.L(l13).F(new j(6, new n(this, i13, value9, 0)), new j(7, new n(this, i13, value9, 1)), ck2.i.f27923c, ck2.i.f27924d));
                }
            }
        }
        return Unit.f80348a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0218  */
    @Override // com.pinterest.api.model.vg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(com.pinterest.api.model.pq0 r48) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rf1.o.j(com.pinterest.api.model.pq0):java.lang.Object");
    }

    @Override // com.pinterest.api.model.vg
    public final Object k(zq0 value10) {
        Intrinsics.checkNotNullParameter(value10, "value10");
        zk0 h10 = value10.h();
        if (h10 != null) {
            p pVar = this.f107795b;
            HashMap hashMap = pVar.f107805c;
            f30 f30Var = hashMap != null ? (f30) hashMap.get(value10.k()) : null;
            if (f30Var != null) {
                m(f30Var, h10, value10);
            } else {
                String k13 = value10.k();
                Intrinsics.checkNotNullExpressionValue(k13, "getPinId(...)");
                pVar.addDisposable(pVar.f107807e.L(k13).F(new j(0, new ed1.m(this, h10, value10, 9)), new j(1, l.f107767k), ck2.i.f27923c, ck2.i.f27924d));
            }
        }
        return Unit.f80348a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(com.pinterest.api.model.f30 r23, com.pinterest.api.model.zk0 r24, com.pinterest.api.model.mp0 r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            rf1.p r2 = r0.f107795b
            boolean r3 = r2.isBound()
            if (r3 != 0) goto Ld
            return
        Ld:
            com.pinterest.api.model.wo0 r3 = r2.f107820r
            com.pinterest.api.model.f30 r3 = r3.f43312c
            if (r3 == 0) goto L20
            java.lang.Boolean r3 = r3.k5()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r4)
            if (r3 == 0) goto L20
            return
        L20:
            if (r1 == 0) goto Le4
            java.lang.String r3 = r23.getUid()
            java.lang.String r4 = "getUid(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            boolean r3 = android.text.TextUtils.isDigitsOnly(r3)
            r5 = 0
            if (r3 == 0) goto L43
            java.lang.String r3 = r23.getUid()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            long r3 = java.lang.Long.parseLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L41:
            r8 = r3
            goto L5f
        L43:
            java.lang.String r3 = r23.F3()
            if (r3 == 0) goto L5e
            boolean r3 = android.text.TextUtils.isDigitsOnly(r3)
            if (r3 == 0) goto L5e
            java.lang.String r3 = r23.F3()
            if (r3 == 0) goto L5e
            long r3 = java.lang.Long.parseLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L41
        L5e:
            r8 = r5
        L5f:
            rf1.k r3 = new rf1.k
            r4 = 0
            r3.<init>(r2, r1, r8, r4)
            rf1.k r4 = new rf1.k
            r6 = 1
            r4.<init>(r2, r1, r8, r6)
            com.pinterest.api.model.wo0 r6 = r2.f107820r
            com.pinterest.api.model.f30 r6 = r6.f43312c
            es.a r7 = r2.f107816n
            es.c r7 = (es.c) r7
            boolean r6 = r7.U(r6)
            yk1.n r7 = r2.getView()
            sf1.t r7 = (sf1.t) r7
            com.pinterest.api.model.wz r9 = po1.c.j(r23)
            java.lang.String r10 = r23.r4()
            java.lang.String r11 = bs1.c.B0(r23)
            java.lang.Boolean r1 = r25.k()
            java.lang.String r12 = "getIsRemoved(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r12)
            boolean r12 = r1.booleanValue()
            java.lang.Double r1 = r25.m()
            java.lang.String r13 = "getStartTime(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r13)
            double r14 = r1.doubleValue()
            java.lang.Double r1 = r25.j()
            java.lang.String r13 = "getEndTime(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r13)
            double r16 = r1.doubleValue()
            if (r6 == 0) goto Lb5
            r18 = r3
            goto Lb7
        Lb5:
            r18 = r5
        Lb7:
            if (r6 == 0) goto Lbc
            r19 = r4
            goto Lbe
        Lbc:
            r19 = r5
        Lbe:
            com.pinterest.api.model.wo0 r1 = r2.f107820r
            com.pinterest.api.model.f30 r2 = r1.f43312c
            if (r2 == 0) goto Lc9
            java.lang.String r2 = r2.getUid()
            goto Lca
        Lc9:
            r2 = r5
        Lca:
            if (r2 != 0) goto Lce
            java.lang.String r2 = ""
        Lce:
            r20 = r2
            com.pinterest.api.model.f30 r1 = r1.f43312c
            if (r1 == 0) goto Ld8
            java.lang.String r5 = r1.B4()
        Ld8:
            r21 = r5
            r6 = r7
            sf1.s r6 = (sf1.s) r6
            int r13 = r0.f107797d
            r7 = r24
            r6.k(r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20, r21)
        Le4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rf1.o.l(com.pinterest.api.model.f30, com.pinterest.api.model.zk0, com.pinterest.api.model.mp0):void");
    }

    public final void m(f30 f30Var, zk0 blockStyle, zq0 zq0Var) {
        p pVar = this.f107795b;
        if (pVar.isBound()) {
            f30 f30Var2 = pVar.f107820r.f43312c;
            if ((f30Var2 == null || !Intrinsics.d(f30Var2.k5(), Boolean.TRUE)) && f30Var != null) {
                sf1.t tVar = (sf1.t) pVar.getView();
                String productPinId = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(productPinId, "getUid(...)");
                po1.c.j(f30Var);
                bs1.c.B0(f30Var);
                Boolean j13 = zq0Var.j();
                Intrinsics.checkNotNullExpressionValue(j13, "getIsRemoved(...)");
                j13.getClass();
                Double l13 = zq0Var.l();
                Intrinsics.checkNotNullExpressionValue(l13, "getStartTime(...)");
                double doubleValue = l13.doubleValue();
                Double i13 = zq0Var.i();
                Intrinsics.checkNotNullExpressionValue(i13, "getEndTime(...)");
                double doubleValue2 = i13.doubleValue();
                sf1.s sVar = (sf1.s) tVar;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(blockStyle, "blockStyle");
                Intrinsics.checkNotNullParameter(productPinId, "productPinId");
                sf1.j jVar = new sf1.j(sVar, blockStyle);
                Context context = sVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                float f13 = jVar.f112624a;
                float f14 = jVar.f112625b;
                sp0.d dVar = new sp0.d(f13, f14);
                int i14 = jVar.f112626c;
                int i15 = jVar.f112627d;
                sVar.addView(new androidx.appcompat.widget.g(context, new sp0.e(dVar, new sp0.a(i14, i15), new sp0.a(sVar.f112699f, sVar.f112700g), jVar.f112628e, new sp0.b(doubleValue, doubleValue2), new sf1.n(1, sVar, productPinId), sVar), sVar.q()));
                w0 w0Var = sVar.C;
                if (w0Var != null) {
                    w0Var.b(f13, f14, i15, this.f107797d);
                }
            }
        }
    }
}
