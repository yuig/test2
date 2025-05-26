package zp;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.util.Patterns;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import c2.m4;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.md;
import com.pinterest.api.model.rj0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.ui.imageview.ProportionalImageView;
import java.util.HashMap;
import java.util.List;
import k1.j1;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import lh0.q2;
import so.k8;
import x02.i2;
import x02.l2;

/* loaded from: classes3.dex */
public final class w0 extends k implements zp0.h {

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f142526y0 = 0;
    public final ViewGroup A;
    public final GestaltText B;
    public final GestaltText C;
    public final LinearLayout D;
    public final GestaltText E;
    public final GestaltText F;
    public final GestaltIcon G;
    public final GestaltText H;
    public final ConstraintLayout I;

    /* renamed from: J, reason: collision with root package name */
    public final GestaltText f142527J;
    public final GestaltText K;
    public boolean L;
    public q2 M;
    public i2 N;
    public dl1.t O;
    public x02.x0 P;
    public b60.b Q;
    public i92.k R;
    public nx.d0 S;
    public m60.w T;
    public yk1.v U;
    public up0.l V;
    public l2 W;

    /* renamed from: a0, reason: collision with root package name */
    public uk1.e f142528a0;

    /* renamed from: b0, reason: collision with root package name */
    public bh.b f142529b0;

    /* renamed from: c0, reason: collision with root package name */
    public nx.f0 f142530c0;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltTextField f142531d;

    /* renamed from: d0, reason: collision with root package name */
    public nx.d1 f142532d0;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f142533e;

    /* renamed from: e0, reason: collision with root package name */
    public k8 f142534e0;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f142535f;

    /* renamed from: f0, reason: collision with root package name */
    public final String f142536f0;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f142537g;

    /* renamed from: g0, reason: collision with root package name */
    public final String f142538g0;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltTextField f142539h;

    /* renamed from: h0, reason: collision with root package name */
    public final String f142540h0;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f142541i;

    /* renamed from: i0, reason: collision with root package name */
    public f30 f142542i0;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltTextField f142543j;

    /* renamed from: j0, reason: collision with root package name */
    public String f142544j0;

    /* renamed from: k, reason: collision with root package name */
    public final ProportionalImageView f142545k;

    /* renamed from: k0, reason: collision with root package name */
    public v7 f142546k0;

    /* renamed from: l, reason: collision with root package name */
    public final ProportionalImageView f142547l;

    /* renamed from: l0, reason: collision with root package name */
    public String f142548l0;

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayout f142549m;

    /* renamed from: m0, reason: collision with root package name */
    public ba f142550m0;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltSwitchWithLabel f142551n;

    /* renamed from: n0, reason: collision with root package name */
    public String f142552n0;

    /* renamed from: o, reason: collision with root package name */
    public final LinearLayout f142553o;

    /* renamed from: o0, reason: collision with root package name */
    public v7 f142554o0;

    /* renamed from: p, reason: collision with root package name */
    public final GestaltTextField f142555p;

    /* renamed from: p0, reason: collision with root package name */
    public String f142556p0;

    /* renamed from: q, reason: collision with root package name */
    public final GestaltText f142557q;

    /* renamed from: q0, reason: collision with root package name */
    public ba f142558q0;

    /* renamed from: r, reason: collision with root package name */
    public final RelativeLayout f142559r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f142560r0;

    /* renamed from: s, reason: collision with root package name */
    public final GestaltText f142561s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f142562s0;

    /* renamed from: t, reason: collision with root package name */
    public final RelativeLayout f142563t;

    /* renamed from: t0, reason: collision with root package name */
    public final xj2.b f142564t0;

    /* renamed from: u, reason: collision with root package name */
    public final RelativeLayout f142565u;

    /* renamed from: u0, reason: collision with root package name */
    public final xj2.b f142566u0;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayout f142567v;

    /* renamed from: v0, reason: collision with root package name */
    public final up0.m f142568v0;

    /* renamed from: w, reason: collision with root package name */
    public final LinearLayout f142569w;

    /* renamed from: w0, reason: collision with root package name */
    public yp0.b f142570w0;

    /* renamed from: x, reason: collision with root package name */
    public final GestaltSwitchWithLabel f142571x;

    /* renamed from: x0, reason: collision with root package name */
    public final r0 f142572x0;

    /* renamed from: y, reason: collision with root package name */
    public final GestaltText f142573y;

    /* renamed from: z, reason: collision with root package name */
    public final GestaltText f142574z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0354, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r2 != null ? r2.getUid() : null, r1.getUid()) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x037e, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x03b4, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d((r5 == null || (r5 = r5.d()) == null) ? null : r5.getUid(), r1.getUid()) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x037c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r2 != null ? r2.getUid() : null, r1.getUid()) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0419, code lost:
    
        if (r1.l("android_unified_pin_product_tag_standard_editor") == false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x046a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w0(android.content.Context r17, com.pinterest.api.model.f30 r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 1546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zp.w0.<init>(android.content.Context, com.pinterest.api.model.f30, android.os.Bundle):void");
    }

    public final up0.l B0() {
        up0.l lVar = this.V;
        if (lVar != null) {
            return lVar;
        }
        Intrinsics.r("typeaheadTextUtility");
        throw null;
    }

    public final v7 F0() {
        v7 v7Var = this.f142554o0;
        return v7Var == null ? this.f142546k0 : v7Var;
    }

    public final void G0() {
        yp0.b f13 = up0.l.f(B0(), this.f142539h);
        this.f142570w0 = f13;
        this.f142566u0.a(f13.a().o().F(new jp.d(29, new p0(this, 3)), new n0(0, u.f142506t), ck2.i.f27923c, ck2.i.f27924d));
    }

    public final boolean H0(f30 f30Var) {
        b60.b bVar = this.Q;
        if (bVar == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        wy0 Q = com.bumptech.glide.d.Q(bVar);
        wy0 n13 = b40.n(f30Var);
        String uid = n13 != null ? n13.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        return dl2.b.S1(Q, uid);
    }

    public final boolean I0(f30 f30Var) {
        b60.b bVar = this.Q;
        if (bVar == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        wy0 Q = com.bumptech.glide.d.Q(bVar);
        wy0 F = b40.F(f30Var);
        String uid = F != null ? F.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        return dl2.b.S1(Q, uid);
    }

    public final void K0(v7 v7Var) {
        if (v7Var != null) {
            boolean J0 = kh2.d.J0(v7Var);
            ProportionalImageView proportionalImageView = this.f142545k;
            GestaltText gestaltText = this.f142541i;
            if (J0) {
                pk.a0.o(gestaltText, oz1.e.profile, new Object[0]);
            } else if (kh2.d.I0(v7Var)) {
                pk.a0.o(gestaltText, f02.g.create_select_a_board, new Object[0]);
                pk.a0.o(this.f142561s, ry1.f.pin_edit_organize_to_board_optional, new Object[0]);
                proportionalImageView.setVisibility(8);
                gestaltText.i(u.f142498l);
            } else {
                String j13 = v7Var.j1();
                Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
                pk.a0.p(gestaltText, j13);
            }
            String L = kh2.d.L(v7Var);
            String b13 = v7Var.b1();
            if (L == null || L.length() == 0) {
                L = b13;
            }
            proportionalImageView.loadUrl(L);
        }
    }

    @Override // zp.c
    public final void L() {
    }

    public final void L0(v7 v7Var, ba baVar) {
        if (v7Var != null) {
            Integer q13 = v7Var.q1();
            Intrinsics.checkNotNullExpressionValue(q13, "getSectionCount(...)");
            k3.R1(this.A, q13.intValue() > 0 && !this.f142542i0.T5().booleanValue());
            GestaltText gestaltText = this.B;
            if (baVar != null) {
                String A = baVar.A();
                Intrinsics.checkNotNullExpressionValue(A, "getTitle(...)");
                if (A.length() > 0) {
                    String A2 = baVar.A();
                    Intrinsics.checkNotNullExpressionValue(A2, "getTitle(...)");
                    pk.a0.p(gestaltText, A2);
                    return;
                }
            }
            pk.a0.o(gestaltText, f02.g.create_select_a_board_section, new Object[0]);
        }
    }

    public final void P0(String str) {
        GestaltText gestaltText = this.f142537g;
        if (str == null || str.length() == 0) {
            gestaltText.i(u.f142509w);
            return;
        }
        List H6 = this.f142542i0.H6();
        GestaltTextField gestaltTextField = this.f142539h;
        if (H6 == null || !H0(this.f142542i0)) {
            gestaltTextField.X(new j1(str, 11));
            pk.a0.p(gestaltText, str);
        } else {
            this.f142566u0.d();
            up0.l B0 = B0();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            SpannableStringBuilder c13 = up0.l.c(B0, context, str, this.f142542i0.H6());
            gestaltTextField.X(new s0(c13, 1));
            pk.a0.q(gestaltText, bs1.c.p2(c13));
            G0();
        }
        gestaltText.i(u.f142508v);
    }

    public final void S0(f30 f30Var) {
        rj0 u63 = f30Var.u6();
        if (u63 != null) {
            this.D.setVisibility(0);
            rj0.a f13 = u63.f();
            rj0.a aVar = rj0.a.UNAFFILIATED;
            GestaltText gestaltText = this.E;
            if (f13 != aVar) {
                rj0.a f14 = u63.f();
                int i13 = f14 == null ? -1 : q0.f142476a[f14.ordinal()];
                pk.a0.p(gestaltText, i13 != 1 ? i13 != 2 ? bs1.c.f2(this, dq1.f.idea_pin_partner_status_pending) : bs1.c.f2(this, dq1.f.idea_pin_partner_status_denied) : bs1.c.f2(this, dq1.f.idea_pin_partner_status_approved));
            } else {
                gestaltText.i(u.A);
                kg.t.O(this.G);
                pk.a0.o(this.F, q82.a.sponsored_pins_remove_partnership_menu_option, new Object[0]);
            }
        }
    }

    @Override // zp.c
    public final void T() {
        String string = getResources().getString(ry1.f.invalid_website);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        i92.k kVar = this.R;
        if (kVar != null) {
            kVar.o(string);
        } else {
            Intrinsics.r("toastUtils");
            throw null;
        }
    }

    public final void T0(f30 f30Var) {
        pk.a0.o(this.f142535f, d70.g.board_description, new Object[0]);
        String c43 = f30Var.c4();
        String str = this.f142538g0;
        if (str == null || Intrinsics.d(str, c43)) {
            P0(f30Var.c4());
        }
        if (I0(f30Var)) {
            return;
        }
        k3.R1(this.f142565u, false);
    }

    @Override // zp.c
    public final GestaltTextField X() {
        return this.f142539h;
    }

    @Override // zp0.h
    public final void Y(SpannableStringBuilder updated) {
        Intrinsics.checkNotNullParameter(updated, "updated");
        this.f142539h.X(new s0(updated, 0));
    }

    public final void Y0() {
        List m13;
        md O3 = this.f142542i0.O3();
        this.K.i(new m4((O3 == null || (m13 = O3.m()) == null) ? 0 : m13.size(), this, 2));
    }

    @Override // zp.c
    public final GestaltTextField Z() {
        return this.f142531d;
    }

    @Override // zp.c
    public final void a0(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.putString("com.pinterest.EXTRA_PIN_ID", this.f142542i0.getUid());
        bundle.putString("com.pinterest.EXTRA_TITLE", String.valueOf(this.f142531d.z0()));
        bundle.putString("com.pinterest.EXTRA_DESCRIPTION", String.valueOf(this.f142539h.z0()));
        bundle.putString("com.pinterest.EXTRA_WEB_TITLE", String.valueOf(this.f142543j.z0()));
        bundle.putString("com.pinterest.EXTRA_ALT_TEXT", String.valueOf(this.f142555p.z0()));
        bundle.putString("com.pinterest.PRE_EDIT_BOARD_ID", this.f142544j0);
        bundle.putString("com.pinterest.PRE_EDIT_BOARD_SECTION_ID", this.f142548l0);
        bundle.putString("com.pinterest.POST_EDIT_BOARD_ID", this.f142552n0);
        bundle.putString("com.pinterest.POST_EDIT_BOARD_SECTION_ID", this.f142556p0);
        bundle.putBoolean("com.pinterest.MOVE_FROM_SECTION_TO_PARENT_BOARD", this.f142562s0);
    }

    public final void b1(String str) {
        GestaltText gestaltText = this.f142533e;
        if (str == null || str.length() == 0) {
            gestaltText.i(u.B);
            return;
        }
        this.f142531d.X(new j1(str, 13));
        gestaltText.i(new j1(str, 14));
    }

    @Override // zp.c
    public final void d0() {
        String k13;
        this.f142566u0.d();
        z0().b0(h32.u0.PIN_EDIT_BUTTON, h32.g0.MODAL_ADD_PIN, this.f142542i0.getUid(), false);
        String F6 = this.f142542i0.F6();
        HashMap hashMap = new HashMap();
        String valueOf = String.valueOf(this.f142531d.z0());
        GestaltTextField gestaltTextField = this.f142539h;
        String valueOf2 = String.valueOf(gestaltTextField.z0());
        if (H0(this.f142542i0) && (gestaltTextField.z0() instanceof SpannableStringBuilder)) {
            Editable z03 = gestaltTextField.z0();
            Intrinsics.g(z03, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
            B0();
            B0();
            k13 = vd0.c.f125622b.k(up0.l.e(up0.l.i((SpannableStringBuilder) z03)));
        } else {
            k13 = null;
        }
        String valueOf3 = String.valueOf(this.f142555p.z0());
        v7 v7Var = (v7) t0().O(b40.i(this.f142542i0));
        i2 i2Var = this.N;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        f30 f30Var = this.f142542i0;
        String str = this.f142552n0;
        if (str == null) {
            str = this.f142544j0;
        }
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String str3 = this.f142556p0;
        if (str3 == null) {
            str3 = this.f142548l0;
        }
        String str4 = str3;
        boolean z13 = this.f142562s0;
        String valueOf4 = String.valueOf(this.f142543j.z0());
        GestaltSwitchWithLabel gestaltSwitchWithLabel = this.f142571x;
        c0.d.K(i2Var, f30Var, str2, str4, z13, valueOf4, valueOf, valueOf2, valueOf3, !gestaltSwitchWithLabel.Z().f96740a.f96708a, !gestaltSwitchWithLabel.Z().f96740a.f96708a, k13, this.f142560r0, this.f142551n.Z().f96740a.f96708a).f(new t0(this, v7Var, F6, valueOf2, hashMap));
    }

    @Override // zp.c
    public final boolean g0() {
        Editable z03 = this.f142543j.z0();
        if (this.f142567v.getVisibility() == 8) {
            return true;
        }
        return z03 != null && (z03.length() == 0 || Patterns.WEB_URL.matcher(z03.toString()).matches());
    }

    public final m60.w getEventManager() {
        m60.w wVar = this.T;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    public final boolean k0() {
        return (b40.Q0(this.f142542i0) ^ true) && ((b40.D(this.f142542i0) == z42.r.VIDEO) || (b40.D(this.f142542i0) == z42.r.SINGLE_IMAGE)) && H0(this.f142542i0);
    }

    @Override // zp0.h
    public final void n6() {
        this.f142539h.d0();
    }

    public final boolean o0(f30 f30Var) {
        if (b40.r0(f30Var) || b40.Q0(f30Var)) {
            return false;
        }
        Boolean Y4 = f30Var.Y4();
        Intrinsics.checkNotNullExpressionValue(Y4, "getIsNative(...)");
        return Y4.booleanValue() && I0(f30Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getEventManager().h(this.f142572x0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getEventManager().j(this.f142572x0);
        if (!this.f142564t0.f135163b) {
            this.f142564t0.dispose();
        }
        this.f142566u0.dispose();
        super.onDetachedFromWindow();
    }

    public final boolean r0() {
        v7 F0 = F0();
        b60.b bVar = this.Q;
        if (bVar == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        wy0 Q = com.bumptech.glide.d.Q(bVar);
        if (F0 != null) {
            wy0 k13 = F0.k1();
            String uid = k13 != null ? k13.getUid() : null;
            if (uid == null) {
                uid = "";
            }
            if (!dl2.b.S1(Q, uid)) {
                wy0 I5 = this.f142542i0.I5();
                String uid2 = I5 != null ? I5.getUid() : null;
                if (!dl2.b.S1(Q, uid2 != null ? uid2 : "")) {
                    return false;
                }
            }
        }
        return true;
    }

    public final x02.x0 t0() {
        x02.x0 x0Var = this.P;
        if (x0Var != null) {
            return x0Var;
        }
        Intrinsics.r("boardRepository");
        throw null;
    }

    public final nx.d0 z0() {
        nx.d0 d0Var = this.S;
        if (d0Var != null) {
            return d0Var;
        }
        Intrinsics.r("topLevelPinalytics");
        throw null;
    }
}
