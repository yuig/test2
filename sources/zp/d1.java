package zp;

import a.cb;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.util.Patterns;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.rj0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.ui.imageview.ProportionalImageView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import k1.j1;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import v.q1;
import x02.l2;

/* loaded from: classes3.dex */
public final class d1 extends k implements zp0.h {

    /* renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ int f142360e0 = 0;
    public b60.b A;
    public i92.k B;
    public nx.d0 C;
    public m60.w D;
    public up0.l E;
    public l2 F;
    public uk1.e G;
    public nx.f0 H;
    public h22.f I;

    /* renamed from: J, reason: collision with root package name */
    public final String f142361J;
    public final String K;
    public final aq.j L;
    public String M;
    public v7 N;
    public String O;
    public ba P;
    public String Q;
    public v7 R;
    public String S;
    public ba T;
    public boolean U;
    public boolean V;
    public final xj2.b W;

    /* renamed from: a0, reason: collision with root package name */
    public final xj2.b f142362a0;

    /* renamed from: b0, reason: collision with root package name */
    public final up0.m f142363b0;

    /* renamed from: c0, reason: collision with root package name */
    public final yp0.b f142364c0;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltTextField f142365d;

    /* renamed from: d0, reason: collision with root package name */
    public final b1 f142366d0;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f142367e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f142368f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltTextField f142369g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f142370h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltTextField f142371i;

    /* renamed from: j, reason: collision with root package name */
    public final ProportionalImageView f142372j;

    /* renamed from: k, reason: collision with root package name */
    public final ProportionalImageView f142373k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltTextField f142374l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltText f142375m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltText f142376n;

    /* renamed from: o, reason: collision with root package name */
    public final ConstraintLayout f142377o;

    /* renamed from: p, reason: collision with root package name */
    public final LinearLayout f142378p;

    /* renamed from: q, reason: collision with root package name */
    public final GestaltText f142379q;

    /* renamed from: r, reason: collision with root package name */
    public final ProgressBar f142380r;

    /* renamed from: s, reason: collision with root package name */
    public final GestaltText f142381s;

    /* renamed from: t, reason: collision with root package name */
    public final GestaltSwitchWithLabel f142382t;

    /* renamed from: u, reason: collision with root package name */
    public final ViewGroup f142383u;

    /* renamed from: v, reason: collision with root package name */
    public final GestaltText f142384v;

    /* renamed from: w, reason: collision with root package name */
    public final LinearLayout f142385w;

    /* renamed from: x, reason: collision with root package name */
    public final GestaltText f142386x;

    /* renamed from: y, reason: collision with root package name */
    public dl1.t f142387y;

    /* renamed from: z, reason: collision with root package name */
    public x02.x0 f142388z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Context context, aq.j editablePinWrapper, Bundle bundle) {
        super(context, 1);
        String str;
        boolean z13;
        int i13;
        String string;
        long longValue;
        String z14;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(editablePinWrapper, "editablePinWrapper");
        xj2.b bVar = new xj2.b();
        this.W = bVar;
        xj2.b bVar2 = new xj2.b();
        this.f142362a0 = bVar2;
        this.K = editablePinWrapper.B();
        this.L = editablePinWrapper;
        v7 u13 = editablePinWrapper.u();
        this.N = u13;
        this.M = u13 != null ? u13.getUid() : null;
        this.U = !Boolean.parseBoolean(editablePinWrapper.z(aq.d.IS_SHOPPING_REC_ALLOWED));
        View.inflate(context, ry1.d.pin_edit_modal_view, this);
        View findViewById = findViewById(ry1.c.pin_edit_title_et);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById;
        this.f142365d = gestaltTextField;
        View findViewById2 = findViewById(ry1.c.pin_edit_title_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        this.f142367e = gestaltText;
        View findViewById3 = findViewById(ry1.c.description_title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById3;
        View findViewById4 = findViewById(ry1.c.pin_edit_description_tV);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltText gestaltText3 = (GestaltText) findViewById4;
        this.f142368f = gestaltText3;
        View findViewById5 = findViewById(ry1.c.pin_edit_description_eT);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        GestaltTextField gestaltTextField2 = (GestaltTextField) findViewById5;
        this.f142369g = gestaltTextField2;
        View findViewById6 = findViewById(ry1.c.pin_edit_board_name);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f142370h = (GestaltText) findViewById6;
        View findViewById7 = findViewById(ry1.c.pin_edit_website_editText);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f142371i = (GestaltTextField) findViewById7;
        View findViewById8 = findViewById(ry1.c.pin_edit_board_iV);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f142372j = (ProportionalImageView) findViewById8;
        View findViewById9 = findViewById(ry1.c.pin_image_view);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f142373k = (ProportionalImageView) findViewById9;
        View findViewById10 = findViewById(ry1.c.pin_alt_text_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById10;
        View findViewById11 = findViewById(ry1.c.pin_editor_alt_text);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f142374l = (GestaltTextField) findViewById11;
        View findViewById12 = findViewById(ry1.c.story_pin_edit_limited_copy);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f142375m = (GestaltText) findViewById12;
        View findViewById13 = findViewById(ry1.c.pin_edit_delete);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        View findViewById14 = findViewById(ry1.c.board_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById14;
        View findViewById15 = findViewById(ry1.c.pin_edit_board_label);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "findViewById(...)");
        this.f142376n = (GestaltText) findViewById15;
        View findViewById16 = findViewById(ry1.c.title_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "findViewById(...)");
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById16;
        View findViewById17 = findViewById(ry1.c.description_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById17, "findViewById(...)");
        RelativeLayout relativeLayout3 = (RelativeLayout) findViewById17;
        View findViewById18 = findViewById(ry1.c.schedule_website_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById18, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById18;
        this.f142377o = constraintLayout;
        View findViewById19 = findViewById(ry1.c.edit_link_preview);
        Intrinsics.checkNotNullExpressionValue(findViewById19, "findViewById(...)");
        this.f142379q = (GestaltText) findViewById19;
        View findViewById20 = findViewById(ry1.c.website_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById20, "findViewById(...)");
        LinearLayout linearLayout2 = (LinearLayout) findViewById20;
        this.f142378p = linearLayout2;
        View findViewById21 = findViewById(ry1.c.edit_link_progress_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById21, "findViewById(...)");
        this.f142380r = (ProgressBar) findViewById21;
        View findViewById22 = findViewById(ry1.c.edit_link_error_message);
        Intrinsics.checkNotNullExpressionValue(findViewById22, "findViewById(...)");
        this.f142381s = (GestaltText) findViewById22;
        View findViewById23 = findViewById(ry1.c.engagement_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById23, "findViewById(...)");
        LinearLayout linearLayout3 = (LinearLayout) findViewById23;
        View findViewById24 = findViewById(ry1.c.pin_edit_disable_comments);
        Intrinsics.checkNotNullExpressionValue(findViewById24, "findViewById(...)");
        GestaltSwitchWithLabel gestaltSwitchWithLabel = (GestaltSwitchWithLabel) findViewById24;
        this.f142382t = gestaltSwitchWithLabel;
        View findViewById25 = findViewById(ry1.c.board_section_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById25, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) findViewById25;
        this.f142383u = viewGroup;
        View findViewById26 = findViewById(ry1.c.pin_edit_board_section_name);
        Intrinsics.checkNotNullExpressionValue(findViewById26, "findViewById(...)");
        this.f142384v = (GestaltText) findViewById26;
        View findViewById27 = findViewById(ry1.c.pin_edit_advanced_settings);
        Intrinsics.checkNotNullExpressionValue(findViewById27, "findViewById(...)");
        GestaltText gestaltText4 = (GestaltText) findViewById27;
        View findViewById28 = findViewById(ry1.c.mentions_flyout_container);
        Intrinsics.checkNotNullExpressionValue(findViewById28, "findViewById(...)");
        View findViewById29 = findViewById(ry1.c.paid_partnership_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById29, "findViewById(...)");
        LinearLayout linearLayout4 = (LinearLayout) findViewById29;
        this.f142385w = linearLayout4;
        View findViewById30 = findViewById(ry1.c.idea_edit_pin_paid_partnership_status);
        Intrinsics.checkNotNullExpressionValue(findViewById30, "findViewById(...)");
        this.f142386x = (GestaltText) findViewById30;
        View findViewById31 = findViewById(ry1.c.pin_edit_schedule_date);
        Intrinsics.checkNotNullExpressionValue(findViewById31, "findViewById(...)");
        ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById31;
        View findViewById32 = findViewById(ry1.c.schedule_date);
        Intrinsics.checkNotNullExpressionValue(findViewById32, "findViewById(...)");
        GestaltText gestaltText5 = (GestaltText) findViewById32;
        View findViewById33 = findViewById(ry1.c.pin_edit_tag_related_topics);
        Intrinsics.checkNotNullExpressionValue(findViewById33, "findViewById(...)");
        ConstraintLayout constraintLayout3 = (ConstraintLayout) findViewById33;
        int i14 = 0;
        linearLayout4.setOnClickListener(new x0(this, i14));
        relativeLayout.setOnClickListener(new x0(this, 1));
        int i15 = 2;
        viewGroup.setOnClickListener(new x0(this, i15));
        pk.a0.n(gestaltText, new z0(this, i14));
        pk.a0.n(gestaltText3, new z0(this, 1));
        pk.a0.n((GestaltText) findViewById13, new z0(this, i15));
        gestaltTextField.L(new z0(this, 3));
        b60.b bVar3 = this.A;
        if (bVar3 == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        wy0 Q = com.bumptech.glide.d.Q(bVar3);
        wy0 w13 = editablePinWrapper.w();
        String uid = w13 != null ? w13.getUid() : null;
        boolean S1 = dl2.b.S1(Q, uid == null ? "" : uid);
        ck2.c cVar = ck2.i.f27923c;
        if (S1) {
            this.f142363b0 = new up0.m(gestaltTextField2);
            up0.l lVar = this.E;
            if (lVar == null) {
                Intrinsics.r("typeaheadTextUtility");
                throw null;
            }
            yp0.b f13 = up0.l.f(lVar, this.f142369g);
            this.f142364c0 = f13;
            int i16 = 5;
            str = "activeUserManager";
            bVar2.a(f13.a().o().F(new n0(i16, new z0(this, i16)), new n0(6, u.G), cVar, ck2.i.f27924d));
        } else {
            str = "activeUserManager";
        }
        int i17 = 4;
        gestaltTextField2.L(new z0(this, i17));
        k3.R1(linearLayout, editablePinWrapper.f());
        if (!o0()) {
            relativeLayout.setAlpha(0.5f);
            relativeLayout.setEnabled(false);
            viewGroup.setAlpha(0.5f);
            viewGroup.setEnabled(false);
        }
        b60.b bVar4 = this.A;
        if (bVar4 == null) {
            Intrinsics.r(str);
            throw null;
        }
        wy0 f14 = ((b60.d) bVar4).f();
        if (f14 != null && editablePinWrapper.e()) {
            gestaltText4.i(u.E);
            gestaltText4.i(u.C);
            pk.a0.n(gestaltText4, new ba.s(12, this, f14));
        }
        ProportionalImageView proportionalImageView = this.f142373k;
        proportionalImageView.setVisibility(0);
        proportionalImageView.loadUrl(editablePinWrapper.E());
        boolean Z = editablePinWrapper.Z();
        u uVar = u.F;
        if (Z && editablePinWrapper.n()) {
            this.f142375m.i(uVar);
        }
        boolean parseBoolean = Boolean.parseBoolean(editablePinWrapper.z(aq.d.IS_COMMENTING_TOGGLE_ALLOWED));
        k3.R1(linearLayout3, parseBoolean);
        gestaltSwitchWithLabel.T(new r1.f(parseBoolean, editablePinWrapper, 2));
        K0(editablePinWrapper);
        aq.d dVar = aq.d.TITLE;
        if (!editablePinWrapper.X(dVar)) {
            L0(editablePinWrapper.z(dVar));
        }
        pk.a0.o(gestaltText2, d70.g.board_description, new Object[0]);
        aq.d dVar2 = aq.d.DESCRIPTION;
        if (!editablePinWrapper.X(dVar2)) {
            I0(editablePinWrapper.z(dVar2));
        }
        b60.b bVar5 = this.A;
        if (bVar5 == null) {
            Intrinsics.r(str);
            throw null;
        }
        wy0 Q2 = com.bumptech.glide.d.Q(bVar5);
        wy0 w14 = editablePinWrapper.w();
        String uid2 = w14 != null ? w14.getUid() : null;
        if (!dl2.b.S1(Q2, uid2 == null ? "" : uid2)) {
            gestaltText3.i(u.M);
            gestaltTextField2.X(c1.f142345j);
            gestaltText2.i(c1.f142346k);
        }
        int i18 = 19;
        if (editablePinWrapper.f() && (z14 = editablePinWrapper.z(aq.d.ALT_TEXT)) != null) {
            this.f142374l.X(new j1(z14, i18));
        }
        if (editablePinWrapper.j()) {
            P0(editablePinWrapper.z(aq.d.LINK));
            z13 = false;
        } else {
            z13 = false;
            k3.R1(constraintLayout, false);
            k3.R1(linearLayout2, false);
        }
        if (!editablePinWrapper.i()) {
            k3.R1(relativeLayout2, z13);
        }
        if (!editablePinWrapper.g()) {
            k3.R1(relativeLayout3, z13);
        }
        if (!editablePinWrapper.X(aq.d.BOARD_ID)) {
            H0(editablePinWrapper.u(), editablePinWrapper.O());
        }
        if (editablePinWrapper.l()) {
            constraintLayout2.setVisibility(0);
            Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
            Calendar calendar2 = Calendar.getInstance(TimeZone.getDefault());
            aq.d dVar3 = aq.d.PUBLISH_TIME;
            if (editablePinWrapper.X(dVar3)) {
                longValue = Long.parseLong(editablePinWrapper.z(dVar3));
            } else {
                Long N = editablePinWrapper.N();
                Intrinsics.f(N);
                longValue = N.longValue();
            }
            calendar2.setTimeInMillis(TimeUnit.SECONDS.toMillis(longValue));
            if (calendar2.getTime().compareTo(calendar.getTime()) <= 0) {
                pk.a0.o(gestaltText5, p22.b.pin_schedule_now_text, new Object[0]);
            } else if (calendar2.get(6) == calendar.get(6)) {
                String string2 = getResources().getString(p22.b.pin_schedule_picker_today_at);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                pk.a0.p(gestaltText5, df.j1.U(string2, new Object[]{new SimpleDateFormat("hh:mm a").format(calendar2.getTime())}));
            } else {
                String string3 = getResources().getString(p22.b.pin_schedule_picker_date_at);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                pk.a0.p(gestaltText5, df.j1.U(string3, new Object[]{calendar2.getTime(), new SimpleDateFormat("hh:mm a").format(calendar2.getTime())}));
            }
            i13 = 0;
            constraintLayout2.setOnClickListener(new y0(this, calendar2, editablePinWrapper, i13));
        } else {
            i13 = 0;
        }
        int i19 = 11;
        if (editablePinWrapper.m()) {
            constraintLayout3.setVisibility(i13);
            constraintLayout3.setOnClickListener(new co.a(i19, editablePinWrapper, this));
        }
        ProportionalImageView proportionalImageView2 = this.f142373k;
        proportionalImageView2.setVisibility(i13);
        proportionalImageView2.loadUrl(editablePinWrapper.E());
        if (editablePinWrapper.Z() && editablePinWrapper.n()) {
            this.f142375m.i(uVar);
        }
        K0(editablePinWrapper);
        if (bundle != null) {
            L0(bundle.getString("com.pinterest.EXTRA_TITLE"));
            String string4 = bundle.getString("com.pinterest.EXTRA_DESCRIPTION");
            this.f142361J = string4;
            I0(string4);
            this.V = bundle.getBoolean("com.pinterest.MOVE_FROM_SECTION_TO_PARENT_BOARD");
            if (this.M == null) {
                String string5 = bundle.getString("com.pinterest.PRE_EDIT_BOARD_ID");
                this.M = string5;
                if (string5 != null) {
                    x02.x0 x0Var = this.f142388z;
                    if (x0Var == null) {
                        Intrinsics.r("boardRepository");
                        throw null;
                    }
                    this.N = (v7) x0Var.O(string5);
                }
            }
            if (this.O == null) {
                String string6 = bundle.getString("com.pinterest.PRE_EDIT_BOARD_SECTION_ID");
                this.O = string6;
                if (string6 != null) {
                    dl1.t tVar = this.f142387y;
                    if (tVar == null) {
                        Intrinsics.r("boardSectionRepository");
                        throw null;
                    }
                    this.P = (ba) ((dl1.l) tVar).O(string6);
                }
            }
            if (this.Q == null) {
                String string7 = bundle.getString("com.pinterest.POST_EDIT_BOARD_ID");
                this.Q = string7;
                if (string7 != null) {
                    x02.x0 x0Var2 = this.f142388z;
                    if (x0Var2 == null) {
                        Intrinsics.r("boardRepository");
                        throw null;
                    }
                    this.R = (v7) x0Var2.O(string7);
                }
            }
            if (this.S == null) {
                String string8 = bundle.getString("com.pinterest.POST_EDIT_BOARD_SECTION_ID");
                this.S = string8;
                if (string8 != null) {
                    dl1.t tVar2 = this.f142387y;
                    if (tVar2 == null) {
                        Intrinsics.r("boardSectionRepository");
                        throw null;
                    }
                    this.T = (ba) ((dl1.l) tVar2).O(string8);
                }
            }
            v7 z03 = z0();
            G0(z03);
            ba baVar = this.T;
            H0(z03, baVar == null ? this.P : baVar);
            P0(bundle.getString("com.pinterest.EXTRA_WEB_TITLE"));
            gestaltSwitchWithLabel.T(new z9.v(2, bundle));
            if (editablePinWrapper.f() && (string = bundle.getString("com.pinterest.EXTRA_ALT_TEXT")) != null) {
                this.f142374l.X(new j1(string, i18));
            }
        }
        v7 z04 = z0();
        if (z04 != null) {
            x02.x0 x0Var3 = this.f142388z;
            if (x0Var3 == null) {
                Intrinsics.r("boardRepository");
                throw null;
            }
            String uid3 = z04.getUid();
            Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
            jk2.e0 M = x0Var3.M(uid3);
            hk2.b bVar6 = new hk2.b(new n0(3, new ba.s(i19, this, z04)), new n0(i17, u.D), cVar);
            M.f(bVar6);
            bVar.a(bVar6);
        }
        this.f142366d0 = new b1(this, editablePinWrapper);
    }

    public static final void k0(d1 d1Var) {
        GestaltTextField gestaltTextField = d1Var.f142371i;
        String valueOf = String.valueOf(gestaltTextField.z0());
        int length = valueOf.length();
        GestaltText gestaltText = d1Var.f142379q;
        if (length == 0) {
            ph.a.p(gestaltTextField, u.H);
            gestaltText.i(u.I);
            gestaltTextField.X(new j1(valueOf, 16));
        } else {
            gestaltTextField.X(u.f142495J);
            gestaltText.i(new j1(valueOf, 17));
        }
        ProgressBar progressBar = d1Var.f142380r;
        progressBar.setVisibility(0);
        Editable z03 = gestaltTextField.z0();
        int visibility = d1Var.f142377o.getVisibility();
        GestaltText gestaltText2 = d1Var.f142381s;
        int i13 = 8;
        if (visibility == 8) {
            gestaltText2.i(c1.f142351p);
            progressBar.setVisibility(8);
            return;
        }
        if (z03 != null && z03.length() == 0) {
            gestaltText2.i(c1.f142352q);
            progressBar.setVisibility(8);
            return;
        }
        if (z03 == null || !Patterns.WEB_URL.matcher(z03.toString()).matches()) {
            gestaltText2.i(c1.f142355t);
            progressBar.setVisibility(8);
            return;
        }
        h22.f fVar = d1Var.I;
        if (fVar == null) {
            Intrinsics.r("storyPinService");
            throw null;
        }
        fVar.j(z03.toString()).r(tk2.e.f118017c).l(wj2.c.a()).o(new n0(7, new z0(d1Var, i13)), new n0(i13, new z0(d1Var, 9)));
    }

    public final void B0() {
        F0();
        getEventManager().d(new of0.a(new mf0.l()));
        this.L.p(new q1(this, 0));
    }

    public final void F0() {
        this.f142362a0.d();
        String valueOf = String.valueOf(this.f142365d.z0());
        String valueOf2 = String.valueOf(this.f142374l.z0());
        String str = this.Q;
        if (str != null) {
            this.L.b0(aq.d.BOARD_ID, str, false);
        }
        String str2 = this.S;
        if (str2 != null) {
            this.L.b0(aq.d.SECTION_ID, str2, false);
        }
        this.L.b0(aq.d.LINK, String.valueOf(this.f142371i.z0()), false);
        this.L.b0(aq.d.TITLE, valueOf, false);
        this.L.b0(aq.d.ALT_TEXT, valueOf2, false);
        this.L.b0(aq.d.IS_COMMENTING_ALLOWED, String.valueOf(this.f142382t.Z().f96740a.f96708a), false);
        aq.d dVar = aq.d.DESCRIPTION;
        String str3 = this.f142361J;
        if (str3 == null) {
            str3 = "";
        }
        this.L.b0(dVar, str3, false);
        this.L.b0(aq.d.IS_SHOPPING_REC_ALLOWED, String.valueOf(!this.U), false);
    }

    public final void G0(v7 v7Var) {
        if (v7Var != null) {
            boolean J0 = kh2.d.J0(v7Var);
            ProportionalImageView proportionalImageView = this.f142372j;
            GestaltText gestaltText = this.f142370h;
            if (J0) {
                pk.a0.o(gestaltText, oz1.e.profile, new Object[0]);
            } else if (kh2.d.I0(v7Var)) {
                pk.a0.o(gestaltText, f02.g.create_select_a_board, new Object[0]);
                pk.a0.o(this.f142376n, ry1.f.pin_edit_organize_to_board_optional, new Object[0]);
                proportionalImageView.setVisibility(8);
                gestaltText.i(u.C);
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

    public final void H0(v7 v7Var, ba baVar) {
        String A;
        if (v7Var != null) {
            Integer q13 = v7Var.q1();
            Intrinsics.checkNotNullExpressionValue(q13, "getSectionCount(...)");
            k3.R1(this.f142383u, q13.intValue() > 0);
            GestaltText gestaltText = this.f142384v;
            if (baVar == null || (A = baVar.A()) == null || A.length() == 0) {
                pk.a0.o(gestaltText, f02.g.create_select_a_board_section, new Object[0]);
                return;
            }
            String A2 = baVar.A();
            Intrinsics.checkNotNullExpressionValue(A2, "getTitle(...)");
            pk.a0.p(gestaltText, A2);
        }
    }

    public final void I0(String str) {
        GestaltText gestaltText = this.f142368f;
        if (str == null || str.length() == 0) {
            gestaltText.i(u.L);
            return;
        }
        this.f142369g.X(new j1(str, 18));
        pk.a0.p(gestaltText, str);
        gestaltText.i(u.K);
    }

    public final void K0(aq.j jVar) {
        rj0 R = jVar.R();
        if (R == null || R.f() == rj0.a.UNAFFILIATED) {
            return;
        }
        this.f142385w.setVisibility(0);
        rj0.a f13 = R.f();
        int i13 = f13 == null ? -1 : a1.f142335a[f13.ordinal()];
        String b23 = i13 != 1 ? i13 != 2 ? bs1.c.b2(dq1.f.idea_pin_partner_status_pending) : bs1.c.b2(dq1.f.idea_pin_partner_status_denied) : bs1.c.b2(dq1.f.idea_pin_partner_status_approved);
        Intrinsics.f(b23);
        pk.a0.p(this.f142386x, b23);
    }

    @Override // zp.c
    public final void L() {
        String subTitle;
        aq.j jVar = this.L;
        int i13 = 1;
        if (!jVar.c()) {
            getEventManager().d(new jc0.s(true));
            return;
        }
        if (jVar.N() == null) {
            B0();
            return;
        }
        int i14 = m60.x0.button_publish;
        int i15 = m60.x0.cancel;
        int i16 = ry1.f.publish_idea_pin_confirm_title;
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        Calendar calendar2 = Calendar.getInstance(TimeZone.getDefault());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Long N = jVar.N();
        Intrinsics.f(N);
        calendar2.setTimeInMillis(timeUnit.toMillis(N.longValue()));
        if (calendar.get(6) == calendar2.get(6)) {
            String string = getResources().getString(p22.b.idea_pin_publish_alert_title_today);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            subTitle = df.j1.U(string, new Object[]{new SimpleDateFormat("hh:mm a").format(calendar2.getTime())});
        } else {
            String string2 = getResources().getString(p22.b.idea_pin_publish_alert_title_today);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            subTitle = df.j1.U(string2, new Object[]{calendar2.getTime(), new SimpleDateFormat("hh:mm a").format(calendar2.getTime())});
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        x0 onConfirmClickListener = new x0(this, 4);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(onConfirmClickListener, "onConfirmClickListener");
        yb0.n nVar = new yb0.n(context);
        Resources resources = context.getResources();
        String string3 = resources.getString(i16);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        nVar.w(string3);
        nVar.u(subTitle);
        String string4 = resources.getString(i14);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        nVar.q(string4);
        String string5 = resources.getString(i15);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        nVar.m(string5);
        nVar.f138513j = new o0(nVar, onConfirmClickListener, i13);
        cb.x(nVar, getEventManager());
    }

    public final void L0(String str) {
        GestaltText gestaltText = this.f142367e;
        if (str == null || str.length() == 0) {
            gestaltText.i(c1.f142347l);
            return;
        }
        this.f142365d.X(new j1(str, 20));
        gestaltText.i(new j1(str, 21));
    }

    public final void P0(String str) {
        GestaltTextField gestaltTextField = this.f142371i;
        if (str != null && str.length() != 0) {
            gestaltTextField.X(new j1(str, 22));
        }
        k3.R1(this.f142377o, true);
        k3.R1(this.f142378p, false);
        gestaltTextField.X(c1.f142348m);
        gestaltTextField.L(new z0(this, 6));
        pk.a0.n(this.f142379q, new z0(this, 7));
    }

    @Override // zp.c
    public final void T() {
        String string = getResources().getString(ry1.f.invalid_website);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        r0().o(string);
    }

    @Override // zp.c
    public final GestaltTextField X() {
        return this.f142369g;
    }

    @Override // zp0.h
    public final void Y(SpannableStringBuilder updated) {
        Intrinsics.checkNotNullParameter(updated, "updated");
        this.f142369g.X(new s0(updated, 2));
    }

    @Override // zp.c
    public final GestaltTextField Z() {
        return this.f142365d;
    }

    @Override // zp.c
    public final void a0(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.putString("com.pinterest.EXTRA_PIN_ID", this.L.z(aq.d.PIN_ID));
        bundle.putString("com.pinterest.EXTRA_TITLE", String.valueOf(this.f142365d.z0()));
        bundle.putString("com.pinterest.EXTRA_DESCRIPTION", String.valueOf(this.f142369g.z0()));
        bundle.putString("com.pinterest.EXTRA_WEB_TITLE", String.valueOf(this.f142371i.z0()));
        bundle.putString("com.pinterest.EXTRA_ALT_TEXT", String.valueOf(this.f142374l.z0()));
        bundle.putString("com.pinterest.PRE_EDIT_BOARD_ID", this.M);
        bundle.putString("com.pinterest.PRE_EDIT_BOARD_SECTION_ID", this.O);
        bundle.putString("com.pinterest.POST_EDIT_BOARD_ID", this.Q);
        bundle.putString("com.pinterest.POST_EDIT_BOARD_SECTION_ID", this.S);
        bundle.putBoolean("com.pinterest.MOVE_FROM_SECTION_TO_PARENT_BOARD", this.V);
        bundle.putBoolean("com.pinterest.EXTRA_IS_COMMENTS_ENABLED", this.f142382t.Z().f96740a.f96708a);
    }

    @Override // zp.c
    public final void d0() {
        F0();
        nx.d0 t03 = t0();
        h32.u0 u0Var = h32.u0.PIN_EDIT_BUTTON;
        h32.g0 g0Var = h32.g0.MODAL_ADD_PIN;
        aq.d dVar = aq.d.PIN_ID;
        aq.j jVar = this.L;
        t03.b0(u0Var, g0Var, jVar.z(dVar), false);
        getEventManager().d(new of0.a(new mf0.l()));
        jVar.a0(new y0.t(this, 0));
    }

    @Override // zp.c
    public final boolean g0() {
        Editable z03 = this.f142371i.z0();
        if (this.f142377o.getVisibility() == 8) {
            return true;
        }
        return z03 != null && (z03.length() == 0 || Patterns.WEB_URL.matcher(z03.toString()).matches());
    }

    public final m60.w getEventManager() {
        m60.w wVar = this.D;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    @Override // zp0.h
    public final void n6() {
        this.f142369g.d0();
    }

    public final boolean o0() {
        v7 z03 = z0();
        b60.b bVar = this.A;
        if (bVar == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        wy0 Q = com.bumptech.glide.d.Q(bVar);
        if (z03 != null) {
            wy0 k13 = z03.k1();
            String uid = k13 != null ? k13.getUid() : null;
            if (uid == null) {
                uid = "";
            }
            if (!dl2.b.S1(Q, uid)) {
                wy0 M = this.L.M();
                String uid2 = M != null ? M.getUid() : null;
                if (!dl2.b.S1(Q, uid2 != null ? uid2 : "")) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getEventManager().h(this.f142366d0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getEventManager().j(this.f142366d0);
        if (!this.W.f135163b) {
            this.W.dispose();
        }
        this.f142362a0.dispose();
        super.onDetachedFromWindow();
    }

    public final i92.k r0() {
        i92.k kVar = this.B;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("toastUtils");
        throw null;
    }

    public final nx.d0 t0() {
        nx.d0 d0Var = this.C;
        if (d0Var != null) {
            return d0Var;
        }
        Intrinsics.r("topLevelPinalytics");
        throw null;
    }

    public final v7 z0() {
        v7 v7Var = this.R;
        return v7Var == null ? this.N : v7Var;
    }
}
