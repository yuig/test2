package xb0;

import am.d;
import androidx.recyclerview.widget.RecyclerView;
import ao2.m0;
import c2.d6;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.component.actionbutton.view.ActionButtonGridView;
import com.pinterest.component.actionbutton.view.ActionButtonView;
import com.pinterest.component.toolbar.SimpleToolbarView;
import com.pinterest.feature.board.redesign.common.SavedContentPreviewModuleView;
import com.pinterest.feature.board.redesign.landing.components.BoardLandingHeaderView;
import com.pinterest.feature.board.redesign.landing.components.SectionHeaderView;
import f0.h;
import hp0.t;
import i2.f;
import i2.n;
import i2.o;
import i2.z1;
import kh2.a1;
import kh2.b0;
import kh2.j1;
import kh2.k3;
import kh2.s0;
import kh2.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import l82.e;
import lr.v;
import net.quikkly.android.utils.BitmapUtils;
import oc0.q;
import om0.e1;
import om0.f0;
import om0.w0;
import p1.x;
import p1.y;
import s3.i;
import s3.k;
import tc0.c;
import tc0.l;
import u2.b;
import u2.g;
import uc0.b2;
import uc0.d0;
import uc0.d2;
import uc0.f1;
import uc0.f2;
import uc0.h2;
import uc0.j2;
import uc0.m2;
import uc0.o2;
import uc0.r0;
import uc0.r1;
import uc0.t1;
import uc0.x1;
import wb0.j;
import xs0.g0;

/* loaded from: classes5.dex */
public final class a extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134497i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f134498j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i13) {
        super(2);
        this.f134497i = i13;
        this.f134498j = obj;
    }

    public final void b(o oVar, int i13) {
        m2 m2Var;
        i2.s sVar;
        boolean z13;
        o2 o2Var;
        i2.s sVar2;
        boolean z14;
        g gVar = b.f120025m;
        d dVar = n.f71185a;
        u2.n nVar = u2.n.f120041b;
        int i14 = this.f134497i;
        int i15 = 0;
        Object obj = this.f134498j;
        int i16 = 2;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        return;
                    }
                }
                h.a((wb0.d) ((ActionButtonGridView) obj).f44682h.getValue(), null, null, oVar, 8, 6);
                return;
            case 1:
                if ((i13 & 11) == 2) {
                    i2.s sVar4 = (i2.s) oVar;
                    if (sVar4.z()) {
                        sVar4.Q();
                        return;
                    }
                }
                s0.b((j) ((ActionButtonView) obj).f44683h.getValue(), null, null, oVar, 0, 6);
                return;
            case 2:
                if ((i13 & 11) == 2) {
                    i2.s sVar5 = (i2.s) oVar;
                    if (sVar5.z()) {
                        sVar5.Q();
                        return;
                    }
                }
                SimpleToolbarView simpleToolbarView = (SimpleToolbarView) obj;
                int i17 = SimpleToolbarView.f44770i;
                simpleToolbarView.getClass();
                k3.n(null, null, null, null, (b4.g) simpleToolbarView.f44771h.getValue(), null, null, null, null, oVar, 520, 288);
                return;
            case 3:
                if ((i13 & 11) == 2) {
                    i2.s sVar6 = (i2.s) oVar;
                    if (sVar6.z()) {
                        sVar6.Q();
                        return;
                    }
                }
                int i18 = q.component_attribution_title;
                i2.s sVar7 = (i2.s) oVar;
                sVar7.W(-2023048807);
                uc0.b bVar = (uc0.b) obj;
                boolean h10 = sVar7.h(bVar);
                Object J2 = sVar7.J();
                if (h10 || J2 == dVar) {
                    J2 = new v(bVar, 27);
                    sVar7.g0(J2);
                }
                sVar7.r(false);
                b0.y(i18, null, 0, (Function0) J2, sVar7, 0, 6);
                return;
            case 4:
                if ((i13 & 11) == 2) {
                    i2.s sVar8 = (i2.s) oVar;
                    if (sVar8.z()) {
                        sVar8.Q();
                        return;
                    }
                }
                int i19 = q.component_buttongroup_title;
                i2.s sVar9 = (i2.s) oVar;
                sVar9.W(-2127347493);
                uc0.o oVar2 = (uc0.o) obj;
                boolean h13 = sVar9.h(oVar2);
                Object J3 = sVar9.J();
                if (h13 || J3 == dVar) {
                    J3 = new c(oVar2, i15);
                    sVar9.g0(J3);
                }
                sVar9.r(false);
                b0.y(i19, null, 0, (Function0) J3, sVar9, 0, 6);
                return;
            case 5:
                if ((i13 & 11) == 2) {
                    i2.s sVar10 = (i2.s) oVar;
                    if (sVar10.z()) {
                        sVar10.Q();
                        return;
                    }
                }
                int i23 = q.component_button_social_title;
                i2.s sVar11 = (i2.s) oVar;
                sVar11.W(-250602339);
                uc0.s sVar12 = (uc0.s) obj;
                boolean h14 = sVar11.h(sVar12);
                Object J4 = sVar11.J();
                if (h14 || J4 == dVar) {
                    J4 = new c(sVar12, i16);
                    sVar11.g0(J4);
                }
                sVar11.r(false);
                b0.y(i23, null, 0, (Function0) J4, sVar11, 0, 6);
                return;
            case 6:
                if ((i13 & 11) == 2) {
                    i2.s sVar13 = (i2.s) oVar;
                    if (sVar13.z()) {
                        sVar13.Q();
                        return;
                    }
                }
                b0.y(q.componentsTitle, null, 0, new l((d0) obj, i15), oVar, 0, 6);
                return;
            case 7:
                if ((i13 & 11) == 2) {
                    i2.s sVar14 = (i2.s) oVar;
                    if (sVar14.z()) {
                        sVar14.Q();
                        return;
                    }
                }
                int i24 = q.component_header_bar_title;
                i2.s sVar15 = (i2.s) oVar;
                sVar15.W(-49383232);
                r0 r0Var = (r0) obj;
                boolean h15 = sVar15.h(r0Var);
                Object J5 = sVar15.J();
                if (h15 || J5 == dVar) {
                    J5 = new c(r0Var, 7);
                    sVar15.g0(J5);
                }
                sVar15.r(false);
                b0.y(i24, null, 0, (Function0) J5, sVar15, 0, 6);
                return;
            case 8:
                if ((i13 & 11) == 2) {
                    i2.s sVar16 = (i2.s) oVar;
                    if (sVar16.z()) {
                        sVar16.Q();
                        return;
                    }
                }
                int i25 = q.component_icon_button_title;
                i2.s sVar17 = (i2.s) oVar;
                sVar17.W(-1119767865);
                f1 f1Var = (f1) obj;
                boolean h16 = sVar17.h(f1Var);
                Object J6 = sVar17.J();
                if (h16 || J6 == dVar) {
                    J6 = new c(f1Var, 9);
                    sVar17.g0(J6);
                }
                sVar17.r(false);
                b0.y(i25, null, 0, (Function0) J6, sVar17, 0, 6);
                return;
            case 9:
                if ((i13 & 11) == 2) {
                    i2.s sVar18 = (i2.s) oVar;
                    if (sVar18.z()) {
                        sVar18.Q();
                        return;
                    }
                }
                int i26 = q.component_modal_alert_component_title;
                i2.s sVar19 = (i2.s) oVar;
                sVar19.W(1131812631);
                r1 r1Var = (r1) obj;
                boolean h17 = sVar19.h(r1Var);
                Object J7 = sVar19.J();
                if (h17 || J7 == dVar) {
                    J7 = new c(r1Var, 13);
                    sVar19.g0(J7);
                }
                sVar19.r(false);
                b0.y(i26, null, 0, (Function0) J7, sVar19, 0, 6);
                return;
            case 10:
                if ((i13 & 11) == 2) {
                    i2.s sVar20 = (i2.s) oVar;
                    if (sVar20.z()) {
                        sVar20.Q();
                        return;
                    }
                }
                int i27 = q.component_popover_title;
                i2.s sVar21 = (i2.s) oVar;
                sVar21.W(972259166);
                t1 t1Var = (t1) obj;
                boolean h18 = sVar21.h(t1Var);
                Object J8 = sVar21.J();
                if (h18 || J8 == dVar) {
                    J8 = new c(t1Var, 14);
                    sVar21.g0(J8);
                }
                sVar21.r(false);
                b0.y(i27, null, 0, (Function0) J8, sVar21, 0, 6);
                return;
            case 11:
                if ((i13 & 11) == 2) {
                    i2.s sVar22 = (i2.s) oVar;
                    if (sVar22.z()) {
                        sVar22.Q();
                        return;
                    }
                }
                int i28 = q.component_search_field_title;
                i2.s sVar23 = (i2.s) oVar;
                sVar23.W(-2015281280);
                x1 x1Var = (x1) obj;
                boolean h19 = sVar23.h(x1Var);
                Object J9 = sVar23.J();
                if (h19 || J9 == dVar) {
                    J9 = new c(x1Var, 16);
                    sVar23.g0(J9);
                }
                sVar23.r(false);
                b0.y(i28, null, 0, (Function0) J9, sVar23, 0, 6);
                return;
            case 12:
                if ((i13 & 11) == 2) {
                    i2.s sVar24 = (i2.s) oVar;
                    if (sVar24.z()) {
                        sVar24.Q();
                        return;
                    }
                }
                int i29 = q.component_spinner_title;
                i2.s sVar25 = (i2.s) oVar;
                sVar25.W(-556455639);
                b2 b2Var = (b2) obj;
                boolean h23 = sVar25.h(b2Var);
                Object J10 = sVar25.J();
                if (h23 || J10 == dVar) {
                    J10 = new c(b2Var, 18);
                    sVar25.g0(J10);
                }
                sVar25.r(false);
                b0.y(i29, null, 0, (Function0) J10, sVar25, 0, 6);
                return;
            case 13:
                if ((i13 & 11) == 2) {
                    i2.s sVar26 = (i2.s) oVar;
                    if (sVar26.z()) {
                        sVar26.Q();
                        return;
                    }
                }
                int i33 = q.component_switch_title;
                i2.s sVar27 = (i2.s) oVar;
                sVar27.W(-2016484272);
                d2 d2Var = (d2) obj;
                boolean h24 = sVar27.h(d2Var);
                Object J11 = sVar27.J();
                if (h24 || J11 == dVar) {
                    J11 = new c(d2Var, 19);
                    sVar27.g0(J11);
                }
                sVar27.r(false);
                b0.y(i33, null, 0, (Function0) J11, sVar27, 0, 6);
                return;
            case 14:
                if ((i13 & 11) == 2) {
                    i2.s sVar28 = (i2.s) oVar;
                    if (sVar28.z()) {
                        sVar28.Q();
                        return;
                    }
                }
                int i34 = q.component_tag_title;
                i2.s sVar29 = (i2.s) oVar;
                sVar29.W(59456234);
                f2 f2Var = (f2) obj;
                boolean h25 = sVar29.h(f2Var);
                Object J12 = sVar29.J();
                if (h25 || J12 == dVar) {
                    J12 = new c(f2Var, 20);
                    sVar29.g0(J12);
                }
                sVar29.r(false);
                b0.y(i34, null, 0, (Function0) J12, sVar29, 0, 6);
                return;
            case 15:
                if ((i13 & 11) == 2) {
                    i2.s sVar30 = (i2.s) oVar;
                    if (sVar30.z()) {
                        sVar30.Q();
                        return;
                    }
                }
                int i35 = q.component_text_area_title;
                i2.s sVar31 = (i2.s) oVar;
                sVar31.W(131485270);
                h2 h2Var = (h2) obj;
                boolean h26 = sVar31.h(h2Var);
                Object J13 = sVar31.J();
                if (h26 || J13 == dVar) {
                    J13 = new c(h2Var, 21);
                    sVar31.g0(J13);
                }
                sVar31.r(false);
                b0.y(i35, null, 0, (Function0) J13, sVar31, 0, 6);
                return;
            case 16:
                if ((i13 & 11) == 2) {
                    i2.s sVar32 = (i2.s) oVar;
                    if (sVar32.z()) {
                        sVar32.Q();
                        return;
                    }
                }
                int i36 = q.component_text_field_title;
                i2.s sVar33 = (i2.s) oVar;
                sVar33.W(1247116219);
                j2 j2Var = (j2) obj;
                boolean h27 = sVar33.h(j2Var);
                Object J14 = sVar33.J();
                if (h27 || J14 == dVar) {
                    J14 = new c(j2Var, 23);
                    sVar33.g0(J14);
                }
                sVar33.r(false);
                b0.y(i36, null, 0, (Function0) J14, sVar33, 0, 6);
                return;
            case 17:
                if ((i13 & 11) == 2) {
                    i2.s sVar34 = (i2.s) oVar;
                    if (sVar34.z()) {
                        sVar34.Q();
                        return;
                    }
                }
                m2 m2Var2 = (m2) obj;
                y a13 = x.a(p1.l.f98545c, gVar, oVar, 0);
                i2.s sVar35 = (i2.s) oVar;
                int i37 = sVar35.P;
                z1 o13 = sVar35.o();
                u2.q X = m0.X(oVar, nVar);
                k.Qo.getClass();
                i iVar = s3.j.f110798b;
                if (!(sVar35.f71265a instanceof f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar35.a0();
                if (sVar35.O) {
                    sVar35.n(iVar);
                } else {
                    sVar35.j0();
                }
                tb.f.f0(oVar, a13, s3.j.f110801e);
                tb.f.f0(oVar, o13, s3.j.f110800d);
                s3.h hVar = s3.j.f110802f;
                if (sVar35.O || !Intrinsics.d(sVar35.J(), Integer.valueOf(i37))) {
                    ep.b.y(i37, sVar35, i37, hVar);
                }
                tb.f.f0(oVar, X, s3.j.f110799c);
                j1.r(m2Var2.f121848a, null, oVar, 0, 2);
                sVar35.W(-2107439578);
                String str = m2Var2.f121849b;
                if (str == null) {
                    m2Var = m2Var2;
                    z13 = false;
                    sVar = sVar35;
                } else {
                    m2Var = m2Var2;
                    d6.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oVar, 0, 0, 131070);
                    sVar = sVar35;
                    z13 = false;
                }
                sVar.r(z13);
                m2 m2Var3 = m2Var;
                d6.b(a1.E0(q.light_mode, new Object[]{m2Var3.f121830c}, oVar), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oVar, 0, 0, 131070);
                d6.b(a1.E0(q.dark_mode, new Object[]{m2Var3.f121831d}, oVar), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oVar, 0, 0, 131070);
                sVar.r(true);
                return;
            case 18:
                if ((i13 & 11) == 2) {
                    i2.s sVar36 = (i2.s) oVar;
                    if (sVar36.z()) {
                        sVar36.Q();
                        return;
                    }
                }
                o2 o2Var2 = (o2) obj;
                y a14 = x.a(p1.l.f98545c, gVar, oVar, 0);
                i2.s sVar37 = (i2.s) oVar;
                int i38 = sVar37.P;
                z1 o14 = sVar37.o();
                u2.q X2 = m0.X(oVar, nVar);
                k.Qo.getClass();
                i iVar2 = s3.j.f110798b;
                if (!(sVar37.f71265a instanceof f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar37.a0();
                if (sVar37.O) {
                    sVar37.n(iVar2);
                } else {
                    sVar37.j0();
                }
                tb.f.f0(oVar, a14, s3.j.f110801e);
                tb.f.f0(oVar, o14, s3.j.f110800d);
                s3.h hVar2 = s3.j.f110802f;
                if (sVar37.O || !Intrinsics.d(sVar37.J(), Integer.valueOf(i38))) {
                    ep.b.y(i38, sVar37, i38, hVar2);
                }
                tb.f.f0(oVar, X2, s3.j.f110799c);
                j1.r(o2Var2.f121848a, null, oVar, 0, 2);
                sVar37.W(1548825630);
                String str2 = o2Var2.f121849b;
                if (str2 == null) {
                    sVar2 = sVar37;
                    o2Var = o2Var2;
                    z14 = false;
                } else {
                    o2Var = o2Var2;
                    d6.b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oVar, 0, 0, 131070);
                    sVar2 = sVar37;
                    z14 = false;
                }
                sVar2.r(z14);
                d6.b(a1.E0(q.opacity_value, new Object[]{o2Var.f121841c}, oVar), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oVar, 0, 0, 131070);
                sVar2.r(true);
                return;
            case 19:
            case 20:
            case 21:
            case 22:
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar38 = (i2.s) oVar;
                    if (sVar38.z()) {
                        sVar38.Q();
                        return;
                    }
                }
                kh2.j.c((rm0.d) ((SectionHeaderView) obj).f45315h.getValue(), null, oVar, 8, 2);
                return;
            case 23:
                if ((i13 & 11) == 2) {
                    i2.s sVar39 = (i2.s) oVar;
                    if (sVar39.z()) {
                        sVar39.Q();
                        return;
                    }
                }
                SavedContentPreviewModuleView savedContentPreviewModuleView = (SavedContentPreviewModuleView) obj;
                b0.u((e1) savedContentPreviewModuleView.f45311i.getValue(), null, (f0) savedContentPreviewModuleView.f45310h.getValue(), (w0) savedContentPreviewModuleView.f45312j.getValue(), oVar, BitmapUtils.BITMAP_TO_JPEG_SIZE, 2);
                return;
            case 24:
                if ((i13 & 11) == 2) {
                    i2.s sVar40 = (i2.s) oVar;
                    if (sVar40.z()) {
                        sVar40.Q();
                        return;
                    }
                }
                BoardLandingHeaderView boardLandingHeaderView = (BoardLandingHeaderView) obj;
                dn.c.a((rm0.a) boardLandingHeaderView.f45313h.getValue(), null, (om0.k) boardLandingHeaderView.f45314i.getValue(), oVar, 8, 2);
                return;
        }
    }

    public final Boolean e(f30 pin) {
        int i13 = this.f134497i;
        Object obj = this.f134498j;
        switch (i13) {
            case 20:
                Intrinsics.checkNotNullParameter(pin, "pin");
                f30 f30Var = (f30) obj;
                return Boolean.valueOf(Intrinsics.d(pin.getUid(), f30Var != null ? f30Var.getUid() : null));
            case 21:
                Intrinsics.checkNotNullParameter(pin, "pin");
                return Boolean.valueOf(Intrinsics.d(pin.getUid(), ((ml0.i) obj).f87460a.f87503a.getUid()));
            default:
                Intrinsics.checkNotNullParameter(pin, "pin");
                String uid = pin.getUid();
                f30 f30Var2 = ((ml0.m0) ((e) obj).f82219b).f87476d;
                return Boolean.valueOf(Intrinsics.d(uid, f30Var2 != null ? f30Var2.getUid() : null));
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String z43;
        int i13 = this.f134497i;
        Object obj3 = this.f134498j;
        switch (i13) {
            case 0:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 1:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 2:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 3:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 4:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 5:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 6:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 7:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 8:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 9:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 10:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 11:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 12:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 13:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 14:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 15:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 16:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 17:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 18:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 19:
                v7 updatedBoard = (v7) obj;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(updatedBoard, "updatedBoard");
                hl0.v vVar = (hl0.v) obj3;
                vVar.K = updatedBoard;
                if (updatedBoard == null || !w.i0(updatedBoard)) {
                    String uid = updatedBoard.getUid();
                    String j13 = updatedBoard.j1();
                    String b13 = updatedBoard.b1();
                    String str = b13 != null ? b13 : "";
                    Boolean V0 = updatedBoard.V0();
                    Intrinsics.checkNotNullExpressionValue(V0, "getFollowedByMe(...)");
                    vVar.f69541q.c(new lr.c(uid, j13, str, V0.booleanValue()));
                }
                return Unit.f80348a;
            case 20:
                ((Number) obj).intValue();
                return e((f30) obj2);
            case 21:
                ((Number) obj).intValue();
                return e((f30) obj2);
            case 22:
                ((Number) obj).intValue();
                return e((f30) obj2);
            case 23:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 24:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 25:
                b((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 26:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                if (floatValue > 0.0f) {
                    t tVar = (t) obj3;
                    if (!tVar.f69874p0) {
                        jp0.b bVar = tVar.f69880v0;
                        if (bVar == null) {
                            Intrinsics.r("carouselView");
                            throw null;
                        }
                        RecyclerView recyclerView = bVar.getPinterestRecyclerView().f52531a;
                        if (tVar.f69880v0 == null) {
                            Intrinsics.r("carouselView");
                            throw null;
                        }
                        if (recyclerView.F0(0.0f, r5.getHeight() / 2.0f) != null) {
                            tVar.d8((int) (r1.getRight() * 0.6d), (int) (r1.getHeight() * 0.5d));
                        } else {
                            jp0.b bVar2 = tVar.f69880v0;
                            if (bVar2 == null) {
                                Intrinsics.r("carouselView");
                                throw null;
                            }
                            RecyclerView recyclerView2 = bVar2.getPinterestRecyclerView().f52531a;
                            jp0.b bVar3 = tVar.f69880v0;
                            if (bVar3 == null) {
                                Intrinsics.r("carouselView");
                                throw null;
                            }
                            float right = bVar3.getRight();
                            if (tVar.f69880v0 == null) {
                                Intrinsics.r("carouselView");
                                throw null;
                            }
                            if (recyclerView2.F0(right, r5.getHeight() / 2.0f) != null) {
                                if (tVar.f69880v0 == null) {
                                    Intrinsics.r("carouselView");
                                    throw null;
                                }
                                tVar.d8((int) ((r3.getRight() - r1.getLeft()) * 0.6d), (int) (r1.getHeight() * 0.5d));
                            }
                        }
                        tVar.f69874p0 = true;
                    }
                    jp0.b bVar4 = tVar.f69880v0;
                    if (bVar4 == null) {
                        Intrinsics.r("carouselView");
                        throw null;
                    }
                    bVar4.setTranslationY(-bs1.c.X(tVar, ps.n.ads_qcm_drawer_top_margin_collapsed_mode));
                }
                return Unit.f80348a;
            case 27:
                String sourceId = (String) obj;
                int intValue = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                wr0.w wVar = (wr0.w) obj3;
                k20.a aVar = wVar.f130927a;
                wy0 f13 = ((b60.d) wVar.f130928b).f();
                z43 = f13 != null ? f13.z4() : null;
                wVar.addDisposable(aVar.a(z43 != null ? z43 : "", sourceId, true).l(tk2.e.f118017c).h(wj2.c.a()).i(new ap.i(wVar, intValue, 2), new uq0.c(19, new lq0.f1(wVar, 5))));
                return Unit.f80348a;
            case 28:
                dl1.s model = (dl1.s) obj;
                ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(model, "model");
                v7 v7Var = (v7) model;
                ss0.a aVar2 = (ss0.a) obj3;
                boolean a13 = ((lh0.r1) aVar2.G).a();
                wy0 f14 = ((b60.d) ((b60.b) aVar2.F)).f();
                return new xs0.h(v7Var, a13, f14 != null ? Intrinsics.d(f14.K2(), Boolean.TRUE) : false, 8);
            default:
                dl1.s model2 = (dl1.s) obj;
                int intValue2 = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(model2, "model");
                f30 f30Var = (f30) model2;
                ss0.c cVar = (ss0.c) obj3;
                boolean a14 = cVar.M.a();
                b60.d dVar = (b60.d) cVar.L;
                wy0 f15 = dVar.f();
                boolean d2 = f15 != null ? Intrinsics.d(f15.K2(), Boolean.TRUE) : false;
                wy0 f16 = dVar.f();
                z43 = f16 != null ? f16.getUid() : null;
                return new g0(f30Var, a14, d2, z43 == null ? "" : z43, cVar.N.a(intValue2, f30Var), 34);
        }
    }
}
