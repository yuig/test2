package com.pinterest.component.board.view;

import android.content.Context;
import android.graphics.ColorFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import bs1.c;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import dc0.g;
import dc0.i;
import dc0.l;
import dc0.m;
import dc0.o;
import dc0.q;
import ec0.h;
import eo1.d;
import ga2.b;
import ga2.e;
import h32.t;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kh2.b0;
import kh2.g3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.h4;
import nx.v;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import qc2.a;
import ra0.l0;
import rm1.f;
import sv.y;
import t80.r;
import u50.n;
import uq.w;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u000fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/pinterest/component/board/view/LegoBoardRep;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Lnx/v;", "Lnx/e;", "Ldc0/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "xa0/j", "ui-components_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LegoBoardRep extends w implements ViewTreeObserver.OnPreDrawListener, v, i {
    public static final /* synthetic */ int E = 0;
    public final m A;
    public a B;
    public Function0 C;
    public final boolean D;

    /* renamed from: d, reason: collision with root package name */
    public h4 f44720d;

    /* renamed from: e, reason: collision with root package name */
    public final WebImageView f44721e;

    /* renamed from: f, reason: collision with root package name */
    public final WebImageView f44722f;

    /* renamed from: g, reason: collision with root package name */
    public final WebImageView f44723g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltIconButton f44724h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f44725i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f44726j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f44727k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltAvatarGroup f44728l;

    /* renamed from: m, reason: collision with root package name */
    public final View f44729m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltText f44730n;

    /* renamed from: o, reason: collision with root package name */
    public final GestaltText f44731o;

    /* renamed from: p, reason: collision with root package name */
    public final View f44732p;

    /* renamed from: q, reason: collision with root package name */
    public final GestaltButton f44733q;

    /* renamed from: r, reason: collision with root package name */
    public final ViewStub f44734r;

    /* renamed from: s, reason: collision with root package name */
    public BoardRepPreviewImages f44735s;

    /* renamed from: t, reason: collision with root package name */
    public q f44736t;

    /* renamed from: u, reason: collision with root package name */
    public final float f44737u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f44738v;

    /* renamed from: w, reason: collision with root package name */
    public String f44739w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f44740x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f44741y;

    /* renamed from: z, reason: collision with root package name */
    public final oq.i f44742z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoBoardRep(Context context) {
        super(context, 3);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44736t = q.Default;
        this.f44737u = c.W(this, b.lego_board_rep_pin_preview_corner_radius);
        this.f44741y = new LinkedHashSet();
        oq.i iVar = new oq.i(this, 2);
        this.f44742z = iVar;
        this.A = new m();
        h4 h4Var = this.f44720d;
        AttributeSet attributeSet = null;
        if (h4Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        boolean a13 = h4Var.a();
        this.D = a13;
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        if (a13) {
            ec0.i iVar2 = new ec0.i(this);
            WebImageView webImageView = (WebImageView) iVar2.invoke();
            addView(webImageView);
            this.f44721e = webImageView;
            WebImageView webImageView2 = (WebImageView) iVar2.invoke();
            addView(webImageView2);
            this.f44722f = webImageView2;
            WebImageView webImageView3 = (WebImageView) iVar2.invoke();
            addView(webImageView3);
            this.f44723g = webImageView3;
            ViewStub viewStub = new ViewStub(getContext());
            viewStub.setId(View.generateViewId());
            viewStub.setInflatedId(View.generateViewId());
            viewStub.setLayoutResource(e.lego_board_rep_covers);
            addView(viewStub, new ConstraintLayout.LayoutParams(-1, 0));
            this.f44734r = viewStub;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int i13 = 6;
            GestaltIconButton gestaltIconButton = new GestaltIconButton(i13, context2, attributeSet);
            g3.y(gestaltIconButton, ec0.c.f58375n);
            addView(gestaltIconButton, new ConstraintLayout.LayoutParams(-2, -2));
            this.f44724h = gestaltIconButton;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            GestaltText gestaltText = new GestaltText(6, context3, (AttributeSet) null);
            pp2.a.k(gestaltText, new l0(this, 7));
            addView(gestaltText, new ConstraintLayout.LayoutParams(0, -2));
            this.f44725i = gestaltText;
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            GestaltButton gestaltButton = new GestaltButton(0, 14, context4, (AttributeSet) null);
            c.s(gestaltButton, ec0.c.f58371j);
            addView(gestaltButton, new ConstraintLayout.LayoutParams(-2, -2));
            this.f44733q = gestaltButton;
            h hVar = new h(this, 1);
            GestaltText gestaltText2 = (GestaltText) hVar.invoke();
            pp2.a.k(gestaltText2, ec0.c.f58372k);
            addView(gestaltText2, new ConstraintLayout.LayoutParams(0, -2));
            this.f44726j = gestaltText2;
            GestaltText gestaltText3 = (GestaltText) hVar.invoke();
            addView(gestaltText3, new ConstraintLayout.LayoutParams(0, -2));
            this.f44727k = gestaltText3;
            GestaltText gestaltText4 = (GestaltText) hVar.invoke();
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
            layoutParams.P = -2;
            addView(gestaltText4, layoutParams);
            this.f44730n = gestaltText4;
            GestaltText gestaltText5 = (GestaltText) hVar.invoke();
            addView(gestaltText5, new ConstraintLayout.LayoutParams(-2, -2));
            this.f44731o = gestaltText5;
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            GestaltAvatarGroup gestaltAvatarGroup = new GestaltAvatarGroup(i13, context5, attributeSet);
            b0.N(gestaltAvatarGroup);
            addView(gestaltAvatarGroup, new ConstraintLayout.LayoutParams(-2, -2));
            this.f44728l = gestaltAvatarGroup;
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setId(View.generateViewId());
            c.R1(frameLayout, false);
            int b03 = c.b0(frameLayout, eo1.c.space_200);
            frameLayout.setPadding(b03, b03, b03, b03);
            frameLayout.setBackgroundResource(d.sensitivity_screen_lego_board_rep_bg);
            Context context6 = frameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            GestaltText gestaltText6 = new GestaltText(6, context6, (AttributeSet) null);
            pp2.a.k(gestaltText6, ec0.c.f58374m);
            frameLayout.addView(gestaltText6, new FrameLayout.LayoutParams(-1, -1));
            addView(frameLayout, new ConstraintLayout.LayoutParams(0, 0));
            this.f44729m = frameLayout;
            View view = new View(getContext());
            view.setId(View.generateViewId());
            view.setBackgroundResource(ga2.c.dot_indicator_updated);
            view.setTranslationX(c.W(view, eo1.c.space_50));
            view.setTranslationY(-c.W(view, eo1.c.space_50));
            int W = c.W(this, eo1.c.space_400);
            addView(view, new ConstraintLayout.LayoutParams(W, W));
            this.f44732p = view;
            X();
        } else {
            View.inflate(getContext(), e.lego_board_rep_default, this);
            View findViewById = findViewById(ga2.d.primary_image);
            WebImageView webImageView4 = (WebImageView) findViewById;
            webImageView4.Y(iVar);
            Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
            this.f44721e = webImageView4;
            View findViewById2 = findViewById(ga2.d.secondary_top_image);
            WebImageView webImageView5 = (WebImageView) findViewById2;
            webImageView5.Y(iVar);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
            this.f44722f = webImageView5;
            View findViewById3 = findViewById(ga2.d.secondary_bottom_image);
            WebImageView webImageView6 = (WebImageView) findViewById3;
            webImageView6.Y(iVar);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
            this.f44723g = webImageView6;
            View findViewById4 = findViewById(ga2.d.board_icon);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
            this.f44724h = (GestaltIconButton) findViewById4;
            View findViewById5 = findViewById(ga2.d.lego_board_rep_title);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
            this.f44725i = (GestaltText) findViewById5;
            View findViewById6 = findViewById(ga2.d.lego_board_rep_metadata);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
            this.f44726j = (GestaltText) findViewById6;
            View findViewById7 = findViewById(ga2.d.lego_board_rep_status);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
            this.f44727k = (GestaltText) findViewById7;
            View findViewById8 = findViewById(ga2.d.lego_board_rep_collaborator_chips);
            Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
            this.f44728l = (GestaltAvatarGroup) findViewById8;
            View findViewById9 = findViewById(ga2.d.sensitive_content_warning);
            Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
            this.f44729m = findViewById9;
            View findViewById10 = findViewById(ga2.d.lego_board_rep_creator_name);
            Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
            this.f44730n = (GestaltText) findViewById10;
            View findViewById11 = findViewById(ga2.d.lego_board_rep_others_collaborators);
            Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
            this.f44731o = (GestaltText) findViewById11;
            View findViewById12 = findViewById(ga2.d.update_indicator);
            Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
            this.f44732p = findViewById12;
            View findViewById13 = findViewById(ga2.d.board_rep_images_stub);
            Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
            this.f44734r = (ViewStub) findViewById13;
            View findViewById14 = findViewById(ga2.d.create_button);
            Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
            this.f44733q = (GestaltButton) findViewById14;
        }
        o0();
    }

    public final void L(boolean z13) {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        if (z13) {
            viewTreeObserver.addOnPreDrawListener(this);
        } else {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    public final void T() {
        int y03 = dl2.b.y0(this, eo1.a.color_background_dark_opacity_300);
        this.f44721e.setColorFilter(y03);
        this.f44722f.setColorFilter(y03);
        this.f44723g.setColorFilter(y03);
        BoardRepPreviewImages boardRepPreviewImages = this.f44735s;
        if (boardRepPreviewImages != null) {
            boardRepPreviewImages.f44718i.setVisibility(0);
        }
        this.f44738v = true;
    }

    public final void X() {
        int c13 = ml2.c.c(dl2.b.E0(this, eo1.a.profile_board_rep_metadata_vertical_spacing));
        int W = c.W(this, b.lego_board_rep_text_inset);
        int W2 = c.W(this, eo1.c.stroke);
        p pVar = new p();
        pVar.j(this);
        int generateViewId = View.generateViewId();
        WebImageView webImageView = this.f44721e;
        int id3 = webImageView.getId();
        ViewStub viewStub = this.f44734r;
        pVar.t(generateViewId, 3, id3, viewStub.getInflatedId());
        int generateViewId2 = View.generateViewId();
        GestaltText gestaltText = this.f44725i;
        int id4 = gestaltText.getId();
        GestaltAvatarGroup gestaltAvatarGroup = this.f44728l;
        pVar.t(generateViewId2, 3, id4, gestaltAvatarGroup.getId());
        pVar.w(viewStub.getId()).f17767e.f17814z = "1:0.66";
        pVar.o(webImageView.getId(), 0);
        pVar.l(webImageView.getId(), 3, 0, 3);
        pVar.l(webImageView.getId(), 6, getId(), 6);
        pVar.w(webImageView.getId()).f17767e.f17814z = "1:1";
        pVar.w(webImageView.getId()).f17767e.f17782e0 = 0.66f;
        WebImageView webImageView2 = this.f44722f;
        pVar.l(webImageView2.getId(), 3, webImageView.getId(), 3);
        int id5 = webImageView2.getId();
        WebImageView webImageView3 = this.f44723g;
        pVar.l(id5, 4, webImageView3.getId(), 3);
        pVar.m(webImageView2.getId(), 6, webImageView.getId(), 7, W2);
        pVar.l(webImageView2.getId(), 7, 0, 7);
        pVar.m(webImageView3.getId(), 3, webImageView2.getId(), 4, W2);
        pVar.l(webImageView3.getId(), 4, webImageView.getId(), 4);
        pVar.l(webImageView3.getId(), 6, webImageView2.getId(), 6);
        pVar.l(webImageView3.getId(), 7, webImageView2.getId(), 7);
        GestaltIconButton gestaltIconButton = this.f44724h;
        pVar.l(gestaltIconButton.getId(), 3, 0, 3);
        pVar.l(gestaltIconButton.getId(), 6, 0, 6);
        View view = this.f44729m;
        pVar.l(view.getId(), 3, 0, 3);
        pVar.l(view.getId(), 4, generateViewId, 4);
        pVar.l(view.getId(), 6, 0, 6);
        pVar.l(view.getId(), 7, webImageView2.getId(), 7);
        pVar.m(gestaltText.getId(), 3, generateViewId, 4, c.W(this, eo1.c.space_100));
        pVar.m(gestaltText.getId(), 6, 0, 6, W);
        pVar.m(gestaltText.getId(), 7, gestaltAvatarGroup.getId(), 6, W);
        pVar.l(gestaltAvatarGroup.getId(), 3, gestaltText.getId(), 3);
        pVar.l(gestaltAvatarGroup.getId(), 4, gestaltText.getId(), 4);
        pVar.l(gestaltAvatarGroup.getId(), 6, gestaltText.getId(), 7);
        pVar.m(gestaltAvatarGroup.getId(), 7, 0, 7, W);
        GestaltText gestaltText2 = this.f44730n;
        pVar.m(gestaltText2.getId(), 3, generateViewId2, 4, c13);
        pVar.m(gestaltText2.getId(), 6, 0, 6, W);
        int id6 = gestaltText2.getId();
        GestaltText gestaltText3 = this.f44731o;
        pVar.l(id6, 7, gestaltText3.getId(), 6);
        pVar.w(gestaltText2.getId()).f17767e.W = 2;
        pVar.H(gestaltText2.getId(), 0.0f);
        pVar.l(gestaltText3.getId(), 3, gestaltText2.getId(), 3);
        pVar.m(gestaltText3.getId(), 6, gestaltText2.getId(), 7, c.W(this, eo1.c.space_100));
        pVar.m(gestaltText3.getId(), 7, 0, 7, c.W(this, eo1.c.space_100));
        GestaltText gestaltText4 = this.f44726j;
        pVar.m(gestaltText4.getId(), 3, gestaltText2.getId(), 4, c13);
        pVar.h(gestaltText4.getId(), 4);
        pVar.m(gestaltText4.getId(), 6, 0, 6, W);
        pVar.m(gestaltText4.getId(), 7, 0, 7, W);
        GestaltText gestaltText5 = this.f44727k;
        pVar.m(gestaltText5.getId(), 3, gestaltText4.getId(), 4, c13);
        pVar.m(gestaltText5.getId(), 6, 0, 6, W);
        pVar.m(gestaltText5.getId(), 7, 0, 7, W);
        View view2 = this.f44732p;
        pVar.l(view2.getId(), 3, 0, 3);
        pVar.l(view2.getId(), 7, 0, 7);
        GestaltButton gestaltButton = this.f44733q;
        pVar.l(gestaltButton.getId(), 3, 0, 3);
        pVar.l(gestaltButton.getId(), 4, generateViewId, 4);
        pVar.l(gestaltButton.getId(), 6, 0, 6);
        pVar.l(gestaltButton.getId(), 7, 0, 7);
        pVar.b(this);
    }

    public final boolean Z(WebImageView... webImageViewArr) {
        BoardRepPreviewImages boardRepPreviewImages = this.f44735s;
        if (boardRepPreviewImages == null || !r0(boardRepPreviewImages)) {
            for (WebImageView webImageView : webImageViewArr) {
                if (r0(webImageView) && this.f44741y.contains(webImageView) && !webImageView.O1() && webImageView.f52563o != null) {
                    return false;
                }
            }
            return true;
        }
        BoardRepPreviewImages boardRepPreviewImages2 = this.f44735s;
        if (boardRepPreviewImages2 == null) {
            return true;
        }
        a visibilityCalculator = this.B;
        if (visibilityCalculator == null) {
            Intrinsics.r("visibilityCalculator");
            throw null;
        }
        Intrinsics.checkNotNullParameter(visibilityCalculator, "visibilityCalculator");
        WebImageView webImageView2 = boardRepPreviewImages2.f44716g;
        WebImageView webImageView3 = boardRepPreviewImages2.f44717h;
        WebImageView webImageView4 = boardRepPreviewImages2.f44715f;
        WebImageView webImageView5 = new WebImageView[]{webImageView4, webImageView2, webImageView3}[0];
        if (c.o1(webImageView4) && ((qc2.d) visibilityCalculator).e(webImageView5, boardRepPreviewImages2)) {
            return webImageView5.O1();
        }
        return true;
    }

    public final void a0(qc2.d visibilityCalculator, Function0 onImagesLoadedCallback) {
        Intrinsics.checkNotNullParameter(visibilityCalculator, "visibilityCalculator");
        Intrinsics.checkNotNullParameter(onImagesLoadedCallback, "onImagesLoadedCallback");
        this.B = visibilityCalculator;
        this.C = onImagesLoadedCallback;
    }

    public final void d0(o viewModel) {
        g gVar;
        String str;
        g data;
        GestaltAvatarGroup gestaltAvatarGroup;
        GestaltText gestaltText;
        GestaltText gestaltText2;
        int i13;
        int i14;
        int intValue;
        rm1.c cVar;
        n marginTop;
        n marginStart;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Integer num = viewModel.f54339c;
        if (num != null) {
            setPaddingRelative(0, 0, 0, num.intValue());
        }
        g gVar2 = viewModel.f54338b;
        String str2 = gVar2.f54319a;
        q qVar = q.List;
        float f13 = this.f44737u;
        WebImageView webImageView = this.f44721e;
        WebImageView webImageView2 = this.f44722f;
        WebImageView webImageView3 = this.f44723g;
        boolean z13 = this.D;
        GestaltAvatarGroup gestaltAvatarGroup2 = this.f44728l;
        GestaltText gestaltText3 = this.f44726j;
        GestaltText gestaltText4 = this.f44725i;
        q qVar2 = viewModel.f54337a;
        if (qVar2 != qVar || this.f44736t == qVar) {
            gVar = gVar2;
            str = str2;
            if (qVar2 != qVar && this.f44736t == qVar) {
                if (c.l1(this)) {
                    webImageView.g2(0.0f, f13, 0.0f, f13);
                } else {
                    webImageView.g2(f13, 0.0f, f13, 0.0f);
                }
                if (z13) {
                    c.U1(webImageView2);
                    c.U1(webImageView3);
                    X();
                } else {
                    p pVar = new p();
                    pVar.i(getContext(), e.lego_board_rep_default);
                    pVar.b(this);
                }
            }
        } else {
            webImageView.g2(f13, f13, f13, f13);
            BoardRepPreviewImages boardRepPreviewImages = this.f44735s;
            if (boardRepPreviewImages != null) {
                c.X0(boardRepPreviewImages);
            }
            if (z13) {
                c.X0(webImageView2);
                c.X0(webImageView3);
                int W = c.W(this, b.lego_board_rep_text_inset);
                p pVar2 = new p();
                pVar2.j(this);
                str = str2;
                pVar2.o(webImageView.getId(), c.W(this, b.lego_board_rep_pin_preview_list_size));
                pVar2.l(webImageView.getId(), 3, 0, 3);
                pVar2.l(webImageView.getId(), 6, 0, 6);
                gVar = gVar2;
                pVar2.l(webImageView.getId(), 7, gestaltText4.getId(), 6);
                pVar2.w(webImageView.getId()).f17767e.f17814z = "1:1";
                pVar2.m(gestaltText4.getId(), 3, webImageView.getId(), 3, 0);
                pVar2.l(gestaltText4.getId(), 4, gestaltText3.getId(), 3);
                pVar2.m(gestaltText4.getId(), 6, webImageView.getId(), 7, W);
                pVar2.m(gestaltText4.getId(), 7, gestaltAvatarGroup2.getId(), 6, W);
                pVar2.l(gestaltAvatarGroup2.getId(), 3, webImageView.getId(), 3);
                pVar2.l(gestaltAvatarGroup2.getId(), 4, webImageView.getId(), 4);
                pVar2.l(gestaltAvatarGroup2.getId(), 6, gestaltText4.getId(), 7);
                pVar2.l(gestaltAvatarGroup2.getId(), 7, 0, 7);
                pVar2.m(gestaltText3.getId(), 3, gestaltText4.getId(), 4, 0);
                pVar2.l(gestaltText3.getId(), 4, webImageView.getId(), 4);
                pVar2.m(gestaltText3.getId(), 6, webImageView.getId(), 7, W);
                pVar2.m(gestaltText3.getId(), 7, gestaltAvatarGroup2.getId(), 6, W);
                pVar2.b(this);
            } else {
                gVar = gVar2;
                str = str2;
                p pVar3 = new p();
                pVar3.i(getContext(), e.lego_board_rep_list);
                pVar3.b(this);
            }
        }
        if (qVar2 != qVar) {
            data = gVar;
            if (data.f54323e == dc0.e.STACK_IN_FRAME) {
                if (this.f44735s == null) {
                    ViewStub viewStub = this.f44734r;
                    viewStub.inflate();
                    BoardRepPreviewImages boardRepPreviewImages2 = (BoardRepPreviewImages) findViewById(viewStub.getInflatedId());
                    this.f44735s = boardRepPreviewImages2;
                    if (boardRepPreviewImages2 != null) {
                        h listener = new h(this, 0);
                        Intrinsics.checkNotNullParameter(listener, "listener");
                        boardRepPreviewImages2.f44719j = listener;
                    }
                }
                BoardRepPreviewImages boardRepPreviewImages3 = this.f44735s;
                if (boardRepPreviewImages3 != null) {
                    c.U1(boardRepPreviewImages3);
                }
                c.X0(webImageView);
                c.X0(webImageView2);
                c.X0(webImageView3);
            } else {
                BoardRepPreviewImages boardRepPreviewImages4 = this.f44735s;
                if (boardRepPreviewImages4 != null) {
                    c.X0(boardRepPreviewImages4);
                }
                c.U1(webImageView);
                c.U1(webImageView2);
                c.U1(webImageView3);
            }
        } else {
            data = gVar;
        }
        boolean z14 = viewModel.f54354r;
        if (z14) {
            webImageView.g2(f13, 0.0f, 0.0f, 0.0f);
            webImageView2.g2(0.0f, f13, 0.0f, 0.0f);
            webImageView3.g2(0.0f, 0.0f, 0.0f, 0.0f);
            if (viewModel.f54355s) {
                gestaltText4.setPaddingRelative(4, 2, 4, 0);
                gestaltText3.setPaddingRelative(4, 0, 4, 2);
            } else {
                gestaltText4.setPaddingRelative(16, 8, 16, 0);
                gestaltText3.setPaddingRelative(16, 0, 16, 8);
            }
        }
        this.f44736t = qVar2;
        int i15 = viewModel.f54351o;
        int B = c.B(this, i15);
        webImageView.setBackgroundColor(B);
        webImageView2.setBackgroundColor(B);
        webImageView3.setBackgroundColor(B);
        BoardRepPreviewImages boardRepPreviewImages5 = this.f44735s;
        String str3 = data.f54321c;
        String str4 = data.f54320b;
        if (boardRepPreviewImages5 != null) {
            int B2 = c.B(boardRepPreviewImages5, i15);
            gestaltAvatarGroup = gestaltAvatarGroup2;
            WebImageView webImageView4 = boardRepPreviewImages5.f44715f;
            webImageView4.setBackgroundColor(B2);
            gestaltText = gestaltText3;
            WebImageView webImageView5 = boardRepPreviewImages5.f44716g;
            webImageView5.setBackgroundColor(B2);
            gestaltText2 = gestaltText4;
            WebImageView webImageView6 = boardRepPreviewImages5.f44717h;
            webImageView6.setBackgroundColor(B2);
            int i16 = z14 ? 0 : (int) f13;
            int i17 = (int) f13;
            boardRepPreviewImages5.g(i16, i16, i17, i17);
            ef0.a cornerSettings = new ef0.a(f13, z14, false);
            Intrinsics.checkNotNullParameter(cornerSettings, "cornerSettings");
            boardRepPreviewImages5.f44944e = cornerSettings;
            boardRepPreviewImages5.f44718i.setVisibility(this.f44738v ? 0 : 8);
            Intrinsics.checkNotNullParameter(data, "data");
            webImageView4.loadUrl(data.f54319a);
            webImageView5.loadUrl(str4);
            webImageView6.loadUrl(str3);
            u50.i iVar = data.f54322d;
            if (iVar != null) {
                Context context = boardRepPreviewImages5.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                boardRepPreviewImages5.a(((Number) iVar.a(context)).intValue());
            }
        } else {
            gestaltAvatarGroup = gestaltAvatarGroup2;
            gestaltText = gestaltText3;
            gestaltText2 = gestaltText4;
        }
        BoardRepPreviewImages boardRepPreviewImages6 = this.f44735s;
        int i18 = 1;
        if (boardRepPreviewImages6 == null || !c.o1(boardRepPreviewImages6)) {
            LinkedHashSet linkedHashSet = this.f44741y;
            if (str != null) {
                linkedHashSet.add(webImageView);
            } else {
                linkedHashSet.remove(webImageView);
            }
            if (str4 != null) {
                linkedHashSet.add(webImageView2);
            } else {
                linkedHashSet.remove(webImageView2);
            }
            if (str3 != null) {
                linkedHashSet.add(webImageView3);
            } else {
                linkedHashSet.remove(webImageView3);
            }
            webImageView.loadUrl(str);
            webImageView2.loadUrl(str4);
            webImageView3.loadUrl(str3);
        }
        dc0.d dVar = viewModel.f54358v;
        y yVar = new y(dVar, this, data, 15);
        GestaltIconButton gestaltIconButton = this.f44724h;
        gestaltIconButton.t(yVar);
        ViewGroup.LayoutParams layoutParams = gestaltIconButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (dVar == null || (marginStart = dVar.getMarginStart()) == null) {
            i13 = 0;
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            i13 = marginStart.a(context2).intValue();
        }
        if (dVar == null || (marginTop = dVar.getMarginTop()) == null) {
            i14 = 0;
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            i14 = marginTop.a(context3).intValue();
        }
        com.bumptech.glide.c.b1(marginLayoutParams, i13, i14, 0, 0, 12);
        gestaltIconButton.setLayoutParams(marginLayoutParams);
        l lVar = viewModel.f54352p;
        this.f44730n.i(new r(25, lVar, (lVar == null || (cVar = lVar.f54328b) == null) ? null : new rm1.d(new f(rm1.q.CHECK_CIRCLE_FILL, rm1.i.XS), cVar, null, 0, null, 28)));
        this.f44731o.i(new r1.f(lVar, (lVar == null || lVar.f54329c == 0) ? false : true, 8));
        GestaltText gestaltText5 = gestaltText2;
        gestaltText5.i(new r(24, viewModel, this));
        ViewGroup.LayoutParams layoutParams2 = gestaltText5.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        if (viewModel.f54340d == null) {
            intValue = c.W(this, eo1.c.space_200);
        } else {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            intValue = viewModel.f54349m.a(context4).intValue();
        }
        marginLayoutParams2.setMarginEnd(intValue);
        gestaltText5.setLayoutParams(marginLayoutParams2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(viewModel.f54344h);
        String str5 = viewModel.f54345i;
        if (str5 != null && str5.length() != 0) {
            boolean z15 = viewModel.f54357u != dc0.f.DEFAULT;
            spannableStringBuilder.append((CharSequence) (z15 ? " · " : "  "));
            int length = z15 ? 0 : spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str5);
            Context context5 = getContext();
            int i19 = eo1.b.color_gray_500;
            Object obj = d5.a.f53679a;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context5.getColor(i19)), length, spannableStringBuilder.length(), 33);
        }
        gestaltText.i(new ec0.f(SpannableString.valueOf(spannableStringBuilder), viewModel, 0));
        String str6 = viewModel.f54346j;
        if (str6 == null) {
            str6 = "";
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str6);
        Context context6 = getContext();
        int i23 = eo1.b.color_gray_500;
        Object obj2 = d5.a.f53679a;
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(context6.getColor(i23)), 0, spannableStringBuilder2.length(), 33);
        this.f44727k.i(new ec0.f(SpannableString.valueOf(spannableStringBuilder2), viewModel, i18));
        GestaltAvatarGroup gestaltAvatarGroup3 = gestaltAvatarGroup;
        gestaltAvatarGroup3.a(new ec0.g(viewModel, 0));
        if (viewModel.f54356t) {
            ViewGroup.LayoutParams layoutParams3 = gestaltAvatarGroup3.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.f17677l = -1;
            gestaltAvatarGroup3.setLayoutParams(layoutParams4);
        }
        Integer num2 = viewModel.f54341e;
        if (num2 != null) {
            setBackgroundColor(getContext().getColor(num2.intValue()));
        }
        c.R1(this.f44729m, viewModel.f54348l);
        c.s(this.f44733q, new ec0.g(viewModel, i18));
        c.R1(this.f44732p, viewModel.f54359w);
        setContentDescription(viewModel.f54347k);
        m mVar = this.A;
        dc0.n nVar = viewModel.f54353q;
        mVar.f54330a = nVar;
        this.f44739w = nVar != null ? nVar.f54332a : null;
    }

    public final void g0() {
        boolean Z;
        if (!r0(this)) {
            Function0 function0 = this.C;
            if (function0 != null) {
                function0.invoke();
                return;
            } else {
                Intrinsics.r("onImagesLoadedCallback");
                throw null;
            }
        }
        int i13 = ec0.d.f58378a[this.f44736t.ordinal()];
        WebImageView webImageView = this.f44721e;
        if (i13 == 1) {
            Z = Z(webImageView);
        } else {
            if (i13 != 2 && i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Z = Z(webImageView, this.f44722f, this.f44723g);
        }
        this.f44740x = Z;
        if (Z) {
            Function0 function02 = this.C;
            if (function02 != null) {
                function02.invoke();
            } else {
                Intrinsics.r("onImagesLoadedCallback");
                throw null;
            }
        }
    }

    /* renamed from: k0, reason: from getter */
    public final WebImageView getF44721e() {
        return this.f44721e;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        HashMap hashMap;
        m mVar = this.A;
        t source = mVar.f54331b;
        if (source == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        t tVar = new t(source.f67244a, source.f67245b, source.f67246c, source.f67247d, jq.b.c(TimeUnit.MILLISECONDS), source.f67249f, source.f67250g, source.f67251h, source.f67252i, source.f67253j, source.f67254k, source.f67255l, source.f67256m);
        dc0.n nVar = mVar.f54330a;
        if (nVar == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.put("board_id", nVar.f54332a);
            Integer num = nVar.f54334c;
            if (num != null) {
            }
            Integer num2 = nVar.f54333b;
            if (num2 != null) {
            }
            Boolean bool = nVar.f54336e;
            if (bool != null) {
                hashMap.put("is_board_update_status", !bool.booleanValue() ? SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE : "0");
            }
        }
        nx.e eVar = new nx.e(tVar, hashMap);
        mVar.f54331b = null;
        return eVar;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        nx.e eVar;
        m mVar = this.A;
        dc0.n nVar = mVar.f54330a;
        if (nVar == null) {
            return null;
        }
        t tVar = mVar.f54331b;
        if (tVar != null) {
            eVar = new nx.e(tVar, null);
        } else {
            Long c13 = jq.b.c(TimeUnit.MILLISECONDS);
            Integer num = nVar.f54334c;
            Short valueOf = num != null ? Short.valueOf((short) num.intValue()) : null;
            String str = nVar.f54335d;
            t tVar2 = new t(nVar.f54332a, null, null, c13, null, null, valueOf, null, null, null, null, null, str != null ? str : null);
            mVar.f54331b = tVar2;
            eVar = new nx.e(tVar2, null);
        }
        return eVar;
    }

    public final void o0() {
        int B = c.B(this, ga2.a.color_empty_state_gray);
        WebImageView webImageView = this.f44721e;
        webImageView.setBackgroundColor(B);
        WebImageView webImageView2 = this.f44722f;
        webImageView2.setBackgroundColor(B);
        WebImageView webImageView3 = this.f44723g;
        webImageView3.setBackgroundColor(B);
        boolean l13 = c.l1(this);
        float f13 = this.f44737u;
        if (l13) {
            webImageView.g2(0.0f, f13, 0.0f, f13);
            webImageView2.g2(f13, 0.0f, 0.0f, 0.0f);
            webImageView3.g2(0.0f, 0.0f, f13, 0.0f);
        } else {
            webImageView.g2(f13, 0.0f, f13, 0.0f);
            webImageView2.g2(0.0f, f13, 0.0f, 0.0f);
            webImageView3.g2(0.0f, 0.0f, 0.0f, f13);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        L(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        L(false);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        L(false);
        g0();
        return true;
    }

    @Override // y92.i
    public final void onViewRecycled() {
        WebImageView webImageView = this.f44721e;
        webImageView.clear();
        webImageView.setColorFilter((ColorFilter) null);
        WebImageView webImageView2 = this.f44722f;
        webImageView2.clear();
        webImageView2.setColorFilter((ColorFilter) null);
        WebImageView webImageView3 = this.f44723g;
        webImageView3.clear();
        webImageView3.setColorFilter((ColorFilter) null);
        BoardRepPreviewImages boardRepPreviewImages = this.f44735s;
        if (boardRepPreviewImages != null) {
            boardRepPreviewImages.f44715f.p1(true);
            boardRepPreviewImages.f44716g.p1(true);
            boardRepPreviewImages.f44717h.p1(true);
        }
        this.f44740x = false;
        this.f44741y.clear();
        a0.p(this.f44725i, "");
        a0.p(this.f44726j, "");
    }

    public final boolean r0(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 == null || !c.o1(view)) {
            return false;
        }
        a aVar = this.B;
        if (aVar != null) {
            return ((qc2.d) aVar).e(view, view2);
        }
        Intrinsics.r("visibilityCalculator");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoBoardRep(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 3);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44736t = q.Default;
        this.f44737u = c.W(this, b.lego_board_rep_pin_preview_corner_radius);
        this.f44741y = new LinkedHashSet();
        oq.i iVar = new oq.i(this, 2);
        this.f44742z = iVar;
        this.A = new m();
        h4 h4Var = this.f44720d;
        AttributeSet attributeSet2 = null;
        if (h4Var != null) {
            boolean a13 = h4Var.a();
            this.D = a13;
            setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
            if (a13) {
                ec0.i iVar2 = new ec0.i(this);
                WebImageView webImageView = (WebImageView) iVar2.invoke();
                addView(webImageView);
                this.f44721e = webImageView;
                WebImageView webImageView2 = (WebImageView) iVar2.invoke();
                addView(webImageView2);
                this.f44722f = webImageView2;
                WebImageView webImageView3 = (WebImageView) iVar2.invoke();
                addView(webImageView3);
                this.f44723g = webImageView3;
                ViewStub viewStub = new ViewStub(getContext());
                viewStub.setId(View.generateViewId());
                viewStub.setInflatedId(View.generateViewId());
                viewStub.setLayoutResource(e.lego_board_rep_covers);
                addView(viewStub, new ConstraintLayout.LayoutParams(-1, 0));
                this.f44734r = viewStub;
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int i13 = 6;
                GestaltIconButton gestaltIconButton = new GestaltIconButton(i13, context2, attributeSet2);
                g3.y(gestaltIconButton, ec0.c.f58375n);
                addView(gestaltIconButton, new ConstraintLayout.LayoutParams(-2, -2));
                this.f44724h = gestaltIconButton;
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                GestaltText gestaltText = new GestaltText(6, context3, (AttributeSet) null);
                pp2.a.k(gestaltText, new l0(this, 7));
                addView(gestaltText, new ConstraintLayout.LayoutParams(0, -2));
                this.f44725i = gestaltText;
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                GestaltButton gestaltButton = new GestaltButton(0, 14, context4, (AttributeSet) null);
                c.s(gestaltButton, ec0.c.f58371j);
                addView(gestaltButton, new ConstraintLayout.LayoutParams(-2, -2));
                this.f44733q = gestaltButton;
                h hVar = new h(this, 1);
                GestaltText gestaltText2 = (GestaltText) hVar.invoke();
                pp2.a.k(gestaltText2, ec0.c.f58372k);
                addView(gestaltText2, new ConstraintLayout.LayoutParams(0, -2));
                this.f44726j = gestaltText2;
                GestaltText gestaltText3 = (GestaltText) hVar.invoke();
                addView(gestaltText3, new ConstraintLayout.LayoutParams(0, -2));
                this.f44727k = gestaltText3;
                GestaltText gestaltText4 = (GestaltText) hVar.invoke();
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
                layoutParams.P = -2;
                addView(gestaltText4, layoutParams);
                this.f44730n = gestaltText4;
                GestaltText gestaltText5 = (GestaltText) hVar.invoke();
                addView(gestaltText5, new ConstraintLayout.LayoutParams(-2, -2));
                this.f44731o = gestaltText5;
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                GestaltAvatarGroup gestaltAvatarGroup = new GestaltAvatarGroup(i13, context5, attributeSet2);
                b0.N(gestaltAvatarGroup);
                addView(gestaltAvatarGroup, new ConstraintLayout.LayoutParams(-2, -2));
                this.f44728l = gestaltAvatarGroup;
                FrameLayout frameLayout = new FrameLayout(getContext());
                frameLayout.setId(View.generateViewId());
                c.R1(frameLayout, false);
                int b03 = c.b0(frameLayout, eo1.c.space_200);
                frameLayout.setPadding(b03, b03, b03, b03);
                frameLayout.setBackgroundResource(d.sensitivity_screen_lego_board_rep_bg);
                Context context6 = frameLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                GestaltText gestaltText6 = new GestaltText(6, context6, (AttributeSet) null);
                pp2.a.k(gestaltText6, ec0.c.f58374m);
                frameLayout.addView(gestaltText6, new FrameLayout.LayoutParams(-1, -1));
                addView(frameLayout, new ConstraintLayout.LayoutParams(0, 0));
                this.f44729m = frameLayout;
                View view = new View(getContext());
                view.setId(View.generateViewId());
                view.setBackgroundResource(ga2.c.dot_indicator_updated);
                view.setTranslationX(c.W(view, eo1.c.space_50));
                view.setTranslationY(-c.W(view, eo1.c.space_50));
                int W = c.W(this, eo1.c.space_400);
                addView(view, new ConstraintLayout.LayoutParams(W, W));
                this.f44732p = view;
                X();
            } else {
                View.inflate(getContext(), e.lego_board_rep_default, this);
                View findViewById = findViewById(ga2.d.primary_image);
                WebImageView webImageView4 = (WebImageView) findViewById;
                webImageView4.Y(iVar);
                Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
                this.f44721e = webImageView4;
                View findViewById2 = findViewById(ga2.d.secondary_top_image);
                WebImageView webImageView5 = (WebImageView) findViewById2;
                webImageView5.Y(iVar);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
                this.f44722f = webImageView5;
                View findViewById3 = findViewById(ga2.d.secondary_bottom_image);
                WebImageView webImageView6 = (WebImageView) findViewById3;
                webImageView6.Y(iVar);
                Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
                this.f44723g = webImageView6;
                View findViewById4 = findViewById(ga2.d.board_icon);
                Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
                this.f44724h = (GestaltIconButton) findViewById4;
                View findViewById5 = findViewById(ga2.d.lego_board_rep_title);
                Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
                this.f44725i = (GestaltText) findViewById5;
                View findViewById6 = findViewById(ga2.d.lego_board_rep_metadata);
                Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
                this.f44726j = (GestaltText) findViewById6;
                View findViewById7 = findViewById(ga2.d.lego_board_rep_status);
                Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
                this.f44727k = (GestaltText) findViewById7;
                View findViewById8 = findViewById(ga2.d.lego_board_rep_collaborator_chips);
                Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
                this.f44728l = (GestaltAvatarGroup) findViewById8;
                View findViewById9 = findViewById(ga2.d.sensitive_content_warning);
                Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
                this.f44729m = findViewById9;
                View findViewById10 = findViewById(ga2.d.lego_board_rep_creator_name);
                Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
                this.f44730n = (GestaltText) findViewById10;
                View findViewById11 = findViewById(ga2.d.lego_board_rep_others_collaborators);
                Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
                this.f44731o = (GestaltText) findViewById11;
                View findViewById12 = findViewById(ga2.d.update_indicator);
                Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
                this.f44732p = findViewById12;
                View findViewById13 = findViewById(ga2.d.board_rep_images_stub);
                Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
                this.f44734r = (ViewStub) findViewById13;
                View findViewById14 = findViewById(ga2.d.create_button);
                Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
                this.f44733q = (GestaltButton) findViewById14;
            }
            o0();
            return;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoBoardRep(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 3, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44736t = q.Default;
        this.f44737u = c.W(this, b.lego_board_rep_pin_preview_corner_radius);
        this.f44741y = new LinkedHashSet();
        oq.i iVar = new oq.i(this, 2);
        this.f44742z = iVar;
        this.A = new m();
        h4 h4Var = this.f44720d;
        AttributeSet attributeSet2 = null;
        if (h4Var != null) {
            boolean a13 = h4Var.a();
            this.D = a13;
            setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
            if (a13) {
                ec0.i iVar2 = new ec0.i(this);
                WebImageView webImageView = (WebImageView) iVar2.invoke();
                addView(webImageView);
                this.f44721e = webImageView;
                WebImageView webImageView2 = (WebImageView) iVar2.invoke();
                addView(webImageView2);
                this.f44722f = webImageView2;
                WebImageView webImageView3 = (WebImageView) iVar2.invoke();
                addView(webImageView3);
                this.f44723g = webImageView3;
                ViewStub viewStub = new ViewStub(getContext());
                viewStub.setId(View.generateViewId());
                viewStub.setInflatedId(View.generateViewId());
                viewStub.setLayoutResource(e.lego_board_rep_covers);
                addView(viewStub, new ConstraintLayout.LayoutParams(-1, 0));
                this.f44734r = viewStub;
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int i14 = 6;
                GestaltIconButton gestaltIconButton = new GestaltIconButton(i14, context2, attributeSet2);
                g3.y(gestaltIconButton, ec0.c.f58375n);
                addView(gestaltIconButton, new ConstraintLayout.LayoutParams(-2, -2));
                this.f44724h = gestaltIconButton;
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                GestaltText gestaltText = new GestaltText(6, context3, (AttributeSet) null);
                pp2.a.k(gestaltText, new l0(this, 7));
                addView(gestaltText, new ConstraintLayout.LayoutParams(0, -2));
                this.f44725i = gestaltText;
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                GestaltButton gestaltButton = new GestaltButton(0, 14, context4, (AttributeSet) null);
                c.s(gestaltButton, ec0.c.f58371j);
                addView(gestaltButton, new ConstraintLayout.LayoutParams(-2, -2));
                this.f44733q = gestaltButton;
                h hVar = new h(this, 1);
                GestaltText gestaltText2 = (GestaltText) hVar.invoke();
                pp2.a.k(gestaltText2, ec0.c.f58372k);
                addView(gestaltText2, new ConstraintLayout.LayoutParams(0, -2));
                this.f44726j = gestaltText2;
                GestaltText gestaltText3 = (GestaltText) hVar.invoke();
                addView(gestaltText3, new ConstraintLayout.LayoutParams(0, -2));
                this.f44727k = gestaltText3;
                GestaltText gestaltText4 = (GestaltText) hVar.invoke();
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
                layoutParams.P = -2;
                addView(gestaltText4, layoutParams);
                this.f44730n = gestaltText4;
                GestaltText gestaltText5 = (GestaltText) hVar.invoke();
                addView(gestaltText5, new ConstraintLayout.LayoutParams(-2, -2));
                this.f44731o = gestaltText5;
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                GestaltAvatarGroup gestaltAvatarGroup = new GestaltAvatarGroup(i14, context5, attributeSet2);
                b0.N(gestaltAvatarGroup);
                addView(gestaltAvatarGroup, new ConstraintLayout.LayoutParams(-2, -2));
                this.f44728l = gestaltAvatarGroup;
                FrameLayout frameLayout = new FrameLayout(getContext());
                frameLayout.setId(View.generateViewId());
                c.R1(frameLayout, false);
                int b03 = c.b0(frameLayout, eo1.c.space_200);
                frameLayout.setPadding(b03, b03, b03, b03);
                frameLayout.setBackgroundResource(d.sensitivity_screen_lego_board_rep_bg);
                Context context6 = frameLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                GestaltText gestaltText6 = new GestaltText(6, context6, (AttributeSet) null);
                pp2.a.k(gestaltText6, ec0.c.f58374m);
                frameLayout.addView(gestaltText6, new FrameLayout.LayoutParams(-1, -1));
                addView(frameLayout, new ConstraintLayout.LayoutParams(0, 0));
                this.f44729m = frameLayout;
                View view = new View(getContext());
                view.setId(View.generateViewId());
                view.setBackgroundResource(ga2.c.dot_indicator_updated);
                view.setTranslationX(c.W(view, eo1.c.space_50));
                view.setTranslationY(-c.W(view, eo1.c.space_50));
                int W = c.W(this, eo1.c.space_400);
                addView(view, new ConstraintLayout.LayoutParams(W, W));
                this.f44732p = view;
                X();
            } else {
                View.inflate(getContext(), e.lego_board_rep_default, this);
                View findViewById = findViewById(ga2.d.primary_image);
                WebImageView webImageView4 = (WebImageView) findViewById;
                webImageView4.Y(iVar);
                Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
                this.f44721e = webImageView4;
                View findViewById2 = findViewById(ga2.d.secondary_top_image);
                WebImageView webImageView5 = (WebImageView) findViewById2;
                webImageView5.Y(iVar);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
                this.f44722f = webImageView5;
                View findViewById3 = findViewById(ga2.d.secondary_bottom_image);
                WebImageView webImageView6 = (WebImageView) findViewById3;
                webImageView6.Y(iVar);
                Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
                this.f44723g = webImageView6;
                View findViewById4 = findViewById(ga2.d.board_icon);
                Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
                this.f44724h = (GestaltIconButton) findViewById4;
                View findViewById5 = findViewById(ga2.d.lego_board_rep_title);
                Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
                this.f44725i = (GestaltText) findViewById5;
                View findViewById6 = findViewById(ga2.d.lego_board_rep_metadata);
                Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
                this.f44726j = (GestaltText) findViewById6;
                View findViewById7 = findViewById(ga2.d.lego_board_rep_status);
                Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
                this.f44727k = (GestaltText) findViewById7;
                View findViewById8 = findViewById(ga2.d.lego_board_rep_collaborator_chips);
                Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
                this.f44728l = (GestaltAvatarGroup) findViewById8;
                View findViewById9 = findViewById(ga2.d.sensitive_content_warning);
                Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
                this.f44729m = findViewById9;
                View findViewById10 = findViewById(ga2.d.lego_board_rep_creator_name);
                Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
                this.f44730n = (GestaltText) findViewById10;
                View findViewById11 = findViewById(ga2.d.lego_board_rep_others_collaborators);
                Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
                this.f44731o = (GestaltText) findViewById11;
                View findViewById12 = findViewById(ga2.d.update_indicator);
                Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
                this.f44732p = findViewById12;
                View findViewById13 = findViewById(ga2.d.board_rep_images_stub);
                Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
                this.f44734r = (ViewStub) findViewById13;
                View findViewById14 = findViewById(ga2.d.create_button);
                Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
                this.f44733q = (GestaltButton) findViewById14;
            }
            o0();
            return;
        }
        Intrinsics.r("experiments");
        throw null;
    }
}
