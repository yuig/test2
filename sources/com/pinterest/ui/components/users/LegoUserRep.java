package com.pinterest.ui.components.users;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import com.pinterest.feature.ideaPinCreation.closeup.view.d0;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.components.users.LegoUserRep;
import com.pinterest.ui.imageview.WebImageView;
import eo1.c;
import fx1.d;
import ha2.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jq.b;
import kh2.s0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.t0;
import m60.v0;
import mp.m;
import oa2.e;
import oa2.j;
import oa2.s;
import oa2.t;
import om1.l;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import rl1.g;
import rl1.k0;
import u50.f0;
import vn1.h;
import xe0.a;
import xk2.k;
import xk2.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\f\rB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/pinterest/ui/components/users/LegoUserRep;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Loa2/t;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "oa2/i", "followingLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class LegoUserRep extends ConstraintLayout implements t {
    public static final /* synthetic */ int A = 0;

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f52341a;

    /* renamed from: b, reason: collision with root package name */
    public final WebImageView f52342b;

    /* renamed from: c, reason: collision with root package name */
    public final WebImageView f52343c;

    /* renamed from: d, reason: collision with root package name */
    public final WebImageView f52344d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltAvatar f52345e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f52346f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f52347g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f52348h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f52349i;

    /* renamed from: j, reason: collision with root package name */
    public g f52350j;

    /* renamed from: k, reason: collision with root package name */
    public final int f52351k;

    /* renamed from: l, reason: collision with root package name */
    public float f52352l;

    /* renamed from: m, reason: collision with root package name */
    public s f52353m;

    /* renamed from: n, reason: collision with root package name */
    public final a f52354n;

    /* renamed from: o, reason: collision with root package name */
    public final k f52355o;

    /* renamed from: p, reason: collision with root package name */
    public final k f52356p;

    /* renamed from: q, reason: collision with root package name */
    public final k f52357q;

    /* renamed from: r, reason: collision with root package name */
    public final k f52358r;

    /* renamed from: s, reason: collision with root package name */
    public final k f52359s;

    /* renamed from: t, reason: collision with root package name */
    public final k f52360t;

    /* renamed from: u, reason: collision with root package name */
    public final k f52361u;

    /* renamed from: v, reason: collision with root package name */
    public final k f52362v;

    /* renamed from: w, reason: collision with root package name */
    public final Map f52363w;

    /* renamed from: x, reason: collision with root package name */
    public ze0.a f52364x;

    /* renamed from: y, reason: collision with root package name */
    public final GestaltButton f52365y;

    /* renamed from: z, reason: collision with root package name */
    public final GestaltIconButton f52366z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoUserRep(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i13 = 1;
        this.f52348h = true;
        this.f52349i = true;
        this.f52351k = getResources().getDimensionPixelSize(c.lego_image_spacing);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.f52352l = s0.A(c.lego_image_corner_radius, resources);
        this.f52354n = s0.L(0.0f, false, false, 30);
        n nVar = n.NONE;
        this.f52355o = b.r(this, 11, nVar);
        this.f52356p = b.r(this, 4, nVar);
        this.f52357q = b.r(this, 0, nVar);
        this.f52358r = b.r(this, 5, nVar);
        this.f52359s = b.r(this, 2, nVar);
        this.f52360t = b.r(this, 1, nVar);
        this.f52361u = b.r(this, 6, nVar);
        this.f52362v = b.r(this, 3, nVar);
        ze0.a aVar = ze0.a.Wide;
        vn1.g gVar = vn1.g.UI_400;
        Pair pair = new Pair(aVar, gVar);
        Pair pair2 = new Pair(ze0.a.Default, h.f126278d);
        ze0.a aVar2 = ze0.a.Compact;
        vn1.g gVar2 = vn1.g.BODY_100;
        this.f52363w = z0.g(pair, pair2, new Pair(aVar2, gVar2), new Pair(ze0.a.List, gVar), new Pair(ze0.a.NoPreview, gVar2));
        this.f52364x = aVar;
        View.inflate(getContext(), v0.user_rep_content_list, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        setImportantForAccessibility(1);
        setFocusable(true);
        setNextFocusDownId(t0.user_rep_action_button);
        setNextFocusRightId(t0.user_rep_action_button);
        WebImageView webImageView = (WebImageView) findViewById(t0.lego_user_rep_first_image);
        WebImageView webImageView2 = null;
        if (webImageView != null) {
            webImageView.setFocusable(false);
        } else {
            webImageView = null;
        }
        this.f52341a = webImageView;
        WebImageView webImageView3 = (WebImageView) findViewById(t0.lego_user_rep_second_image);
        if (webImageView3 != null) {
            webImageView3.setFocusable(false);
        } else {
            webImageView3 = null;
        }
        this.f52342b = webImageView3;
        WebImageView webImageView4 = (WebImageView) findViewById(t0.lego_user_rep_third_image);
        if (webImageView4 != null) {
            webImageView4.setFocusable(false);
        } else {
            webImageView4 = null;
        }
        this.f52343c = webImageView4;
        WebImageView webImageView5 = (WebImageView) findViewById(t0.lego_user_rep_fourth_image);
        if (webImageView5 != null) {
            webImageView5.setFocusable(false);
            webImageView2 = webImageView5;
        }
        this.f52344d = webImageView2;
        View findViewById = findViewById(t0.lego_user_rep_foreground_image);
        GestaltAvatar gestaltAvatar = (GestaltAvatar) findViewById;
        gestaltAvatar.setImportantForAccessibility(4);
        gestaltAvatar.setFocusable(false);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f52345e = gestaltAvatar;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f52350j = rl1.n.e(context2);
        View findViewById2 = findViewById(t0.user_rep_action_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById2;
        gestaltButton.setImportantForAccessibility(1);
        gestaltButton.setFocusable(true);
        gestaltButton.d(e.f93870t);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f52365y = gestaltButton;
        View findViewById3 = findViewById(t0.lego_user_rep_title);
        GestaltText gestaltText = (GestaltText) findViewById3;
        gestaltText.i(e.f93871u);
        gestaltText.setImportantForAccessibility(1);
        gestaltText.setFocusable(false);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f52346f = gestaltText;
        View findViewById4 = findViewById(t0.lego_user_rep_metadata);
        GestaltText gestaltText2 = (GestaltText) findViewById4;
        gestaltText2.i(e.f93872v);
        gestaltText2.setImportantForAccessibility(4);
        gestaltText2.setFocusable(false);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f52347g = gestaltText2;
        this.f52366z = ((GestaltIconButton) findViewById(t0.user_rep_options_button)).u(new gm1.a(this) { // from class: oa2.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegoUserRep f93914b;

            {
                this.f93914b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i14 = i13;
                LegoUserRep.L(this.f93914b, cVar);
            }
        });
        k0();
        o0();
    }

    public static void L(LegoUserRep this$0, gm1.c it) {
        s sVar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof l) || (sVar = this$0.f52353m) == null) {
            return;
        }
        sVar.W2();
    }

    public static final p T(LegoUserRep legoUserRep, int i13) {
        legoUserRep.getClass();
        p pVar = new p();
        pVar.i(legoUserRep.getContext(), i13);
        return pVar;
    }

    public final void B0(boolean z13) {
        this.f52348h = z13;
        this.f52346f.i(new d(z13, 21));
    }

    public final void F0(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f52365y.e(new ex1.c(8, action));
    }

    public final void G0(yl1.b actionButtonState) {
        Intrinsics.checkNotNullParameter(actionButtonState, "actionButtonState");
        this.f52365y.d(new i(6, actionButtonState, this));
    }

    public final void H0(g avatarViewModel) {
        Intrinsics.checkNotNullParameter(avatarViewModel, "avatarViewModel");
        this.f52350j = avatarViewModel;
        pe.i.w1(this.f52345e, avatarViewModel);
    }

    public final void H1(String title, int i13, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(title, "title");
        GestaltText gestaltText = this.f52346f;
        if (i13 == 0 || !(!z.j(title))) {
            a0.q(gestaltText, bs1.c.h2(title));
            gestaltText.setCompoundDrawablesRelative(null, null, null, null);
        } else {
            String str = ((Object) title) + "  ";
            int intValue = num2 != null ? num2.intValue() : gestaltText.getLineHeight();
            a0.q(gestaltText, bs1.c.h2(str));
            Drawable f03 = bs1.c.f0(this, i13, num, null, 4);
            f03.setBounds(0, 0, intValue, intValue);
            Unit unit = Unit.f80348a;
            gestaltText.setCompoundDrawablesRelative(null, null, f03, null);
        }
        if (this.f52348h) {
            gestaltText.i(new ip.d(23, title));
        }
    }

    public final void I0(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f52345e.M2(new ex1.c(10, action));
    }

    public final void J1(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f52346f.j(new ex1.c(7, action));
    }

    public final void K0(ze0.a aVar) {
        g b13;
        WebImageView d03 = d0(oa2.i.Second);
        int i13 = this.f52351k;
        if (d03 != null) {
            ViewGroup.LayoutParams layoutParams = d03.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(i13);
            d03.setLayoutParams(marginLayoutParams);
        }
        WebImageView d04 = d0(oa2.i.Third);
        if (d04 != null) {
            ViewGroup.LayoutParams layoutParams2 = d04.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginStart(i13);
            d04.setLayoutParams(marginLayoutParams2);
        }
        WebImageView d05 = d0(oa2.i.Fourth);
        if (d05 != null) {
            ViewGroup.LayoutParams layoutParams3 = d05.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.setMarginStart(i13);
            d05.setLayoutParams(marginLayoutParams3);
        }
        p1(aVar);
        int[] iArr = j.f93915a;
        int i14 = iArr[aVar.ordinal()];
        GestaltText gestaltText = this.f52347g;
        GestaltText gestaltText2 = this.f52346f;
        if (i14 == 4 || i14 == 5 || i14 == 6 || i14 == 8) {
            gestaltText2.i(e.f93873w);
            gestaltText.i(e.f93874x);
        } else {
            gestaltText2.i(e.f93875y);
            gestaltText.i(e.f93876z);
        }
        vn1.g gVar = (vn1.g) this.f52363w.get(aVar);
        if (gVar != null) {
            gestaltText2.i(new m(gVar, 15));
        }
        int i15 = iArr[aVar.ordinal()];
        if (i15 == 5) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            List list = rl1.n.f108641a;
            Intrinsics.checkNotNullParameter(context, "context");
            b13 = rl1.n.b(context, k0.LegoAvatar_SizeMediumNew);
        } else if (i15 != 7) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            b13 = rl1.n.e(context2);
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            List list2 = rl1.n.f108641a;
            Intrinsics.checkNotNullParameter(context3, "context");
            b13 = rl1.n.b(context3, k0.LegoAvatar_SizeXLarge);
        }
        this.f52350j = b13;
    }

    public final void K1(int i13) {
        this.f52346f.i(new pn1.g(i13, 16));
    }

    public final void L0(List previewImageURLs, String avatarImageUrl, String name) {
        Intrinsics.checkNotNullParameter(avatarImageUrl, "avatarImageUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(previewImageURLs, "previewImageURLs");
        g c13 = rl1.n.c(this.f52350j, avatarImageUrl, name, false);
        if (previewImageURLs.size() >= 4) {
            H0(c13);
            t1((String) previewImageURLs.get(0), (String) previewImageURLs.get(1), (String) previewImageURLs.get(2), (String) previewImageURLs.get(3));
            return;
        }
        if (previewImageURLs.size() >= 3) {
            H0(c13);
            t1((String) previewImageURLs.get(0), (String) previewImageURLs.get(1), (String) previewImageURLs.get(2), null);
        } else if (previewImageURLs.size() >= 2) {
            H0(c13);
            t1((String) previewImageURLs.get(0), (String) previewImageURLs.get(1), null, null);
        } else if (!(!previewImageURLs.isEmpty())) {
            H0(c13);
        } else {
            H0(c13);
            t1((String) previewImageURLs.get(0), null, null, null);
        }
    }

    public final void M1(vn1.g titleVariant) {
        Intrinsics.checkNotNullParameter(titleVariant, "titleVariant");
        this.f52346f.i(new m(titleVariant, 16));
    }

    public final void P0(String metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        f0 h23 = bs1.c.h2(metadata);
        GestaltText gestaltText = this.f52347g;
        a0.q(gestaltText, h23);
        if (this.f52349i) {
            gestaltText.i(new ip.d(22, metadata));
        }
    }

    public final void S0(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f52347g.j(new ex1.c(9, action));
    }

    public final void T0(vn1.g metadataVariant) {
        Intrinsics.checkNotNullParameter(metadataVariant, "metadataVariant");
        this.f52347g.i(new m(metadataVariant, 14));
    }

    public final a X() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float f13 = this.f52352l;
        Intrinsics.checkNotNullParameter(context, "context");
        return s0.M(context, f13, false, true, false, true, 20);
    }

    public final void Y0(oa2.i iVar, String str) {
        WebImageView d03 = d0(iVar);
        if (d03 == null || d03.getVisibility() != 0) {
            return;
        }
        d03.V1(str, (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
    }

    public final ArrayList Z() {
        oa2.i[] values = oa2.i.values();
        ArrayList arrayList = new ArrayList();
        for (oa2.i iVar : values) {
            WebImageView d03 = d0(iVar);
            if (d03 != null) {
                arrayList.add(d03);
            }
        }
        return arrayList;
    }

    public final a a0() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float f13 = this.f52352l;
        Intrinsics.checkNotNullParameter(context, "context");
        return s0.M(context, f13, true, false, true, false, 40);
    }

    public final void b1(int i13) {
        Iterator it = Z().iterator();
        while (it.hasNext()) {
            ((WebImageView) it.next()).setColorFilter(bs1.c.B(this, i13), PorterDuff.Mode.SRC_ATOP);
        }
    }

    public final WebImageView d0(oa2.i iVar) {
        int i13 = j.f93916b[iVar.ordinal()];
        if (i13 == 1) {
            return this.f52341a;
        }
        if (i13 == 2) {
            return this.f52342b;
        }
        if (i13 == 3) {
            return this.f52343c;
        }
        if (i13 == 4) {
            return this.f52344d;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void g0(s listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f52353m = listener;
        J1(new oa2.k(this, 7));
        S0(new oa2.k(this, 8));
        w1(new ha2.j(this, 3));
        I0(new oa2.k(this, 9));
        F0(new oa2.k(this, 10));
    }

    public final void k0() {
        int i13 = sk1.a.color_empty_state_gray;
        Context context = getContext();
        Object obj = d5.a.f53679a;
        int color = context.getColor(i13);
        Iterator it = Z().iterator();
        while (it.hasNext()) {
            WebImageView webImageView = (WebImageView) it.next();
            webImageView.setBackgroundColor(color);
            webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        this.f52352l = this.f52352l;
        p1(this.f52364x);
        requestLayout();
    }

    public final void n1(oa2.i iVar, a aVar) {
        WebImageView d03 = d0(iVar);
        if (d03 != null) {
            d03.g2(aVar.f134648a, aVar.f134649b, aVar.f134650c, aVar.f134651d);
        }
    }

    public final void o0() {
        K1(1);
        this.f52347g.i(new pn1.g(1, 15));
    }

    public final void p1(ze0.a aVar) {
        int i13 = j.f93915a[aVar.ordinal()];
        a aVar2 = this.f52354n;
        if (i13 != 1) {
            if (i13 == 2) {
                n1(oa2.i.First, a0());
                n1(oa2.i.Second, X());
                return;
            }
            if (i13 == 3) {
                n1(oa2.i.First, s0.K(this.f52352l, true, true, true, true));
                return;
            }
            if (i13 == 4) {
                n1(oa2.i.First, a0());
                n1(oa2.i.Second, aVar2);
                n1(oa2.i.Third, aVar2);
                n1(oa2.i.Fourth, X());
                return;
            }
            if (i13 == 5) {
                n1(oa2.i.First, s0.L(this.f52352l, true, false, 28));
                n1(oa2.i.Second, aVar2);
                n1(oa2.i.Third, aVar2);
                n1(oa2.i.Fourth, s0.L(this.f52352l, false, true, 26));
                return;
            }
            if (i13 != 8) {
                return;
            }
        }
        n1(oa2.i.First, a0());
        n1(oa2.i.Second, aVar2);
        n1(oa2.i.Third, X());
    }

    public final void r0(boolean z13) {
        this.f52365y.d(new d(z13, 18));
    }

    public final void r1() {
        Iterator it = Z().iterator();
        while (it.hasNext()) {
            ViewGroup.LayoutParams layoutParams = ((WebImageView) it.next()).getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams).G = "1:1";
        }
    }

    public final void s1(List imageUrls) {
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        if (imageUrls.size() >= 4) {
            t1((String) imageUrls.get(0), (String) imageUrls.get(1), (String) imageUrls.get(2), (String) imageUrls.get(3));
            return;
        }
        if (imageUrls.size() >= 3) {
            t1((String) imageUrls.get(0), (String) imageUrls.get(1), (String) imageUrls.get(2), null);
            return;
        }
        if (imageUrls.size() >= 2) {
            t1((String) imageUrls.get(0), (String) imageUrls.get(1), null, null);
        } else if (!imageUrls.isEmpty()) {
            t1((String) imageUrls.get(0), null, null, null);
        } else {
            t1(null, null, null, null);
        }
    }

    public final void t0(boolean z13) {
        this.f52349i = z13;
        this.f52347g.i(new d(z13, 20));
    }

    public final void t1(String str, String str2, String str3, String str4) {
        Iterator it = kotlin.collections.f0.j(oa2.i.First, oa2.i.Second, oa2.i.Third, oa2.i.Fourth).iterator();
        while (it.hasNext()) {
            WebImageView d03 = d0((oa2.i) it.next());
            if (d03 != null) {
                d03.clear();
            }
        }
        if (str != null) {
            Y0(oa2.i.First, str);
        }
        if (str2 != null) {
            Y0(oa2.i.Second, str2);
        }
        if (str3 != null) {
            Y0(oa2.i.Third, str3);
        }
        if (str4 != null) {
            Y0(oa2.i.Fourth, str4);
        }
    }

    public final void w1(Function1 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        for (oa2.i position : oa2.i.values()) {
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(action, "action");
            WebImageView d03 = d0(position);
            if (d03 != null) {
                d03.setOnClickListener(new fd1.e(27, action, position));
            }
        }
    }

    public final void y1(ze0.a repStyle) {
        Intrinsics.checkNotNullParameter(repStyle, "repStyle");
        if (this.f52364x == repStyle) {
        }
        this.f52364x = repStyle;
        switch (j.f93915a[repStyle.ordinal()]) {
            case 1:
                ((p) this.f52355o.getValue()).b(this);
                K0(ze0.a.Wide);
                z0(true, oa2.i.First, oa2.i.Second, oa2.i.Third);
                z0(false, oa2.i.Fourth);
                break;
            case 2:
                ((p) this.f52356p.getValue()).b(this);
                K0(ze0.a.Default);
                z0(true, oa2.i.First, oa2.i.Second);
                z0(false, oa2.i.Third, oa2.i.Fourth);
                break;
            case 3:
                ((p) this.f52357q.getValue()).b(this);
                K0(ze0.a.Compact);
                z0(true, oa2.i.First);
                z0(false, oa2.i.Second, oa2.i.Third, oa2.i.Fourth);
                break;
            case 4:
                ((p) this.f52359s.getValue()).b(this);
                K0(ze0.a.ContentList);
                z0(true, oa2.i.First, oa2.i.Second, oa2.i.Third, oa2.i.Fourth);
                break;
            case 5:
                ((p) this.f52360t.getValue()).b(this);
                K0(ze0.a.ContentListCard);
                z0(true, oa2.i.First, oa2.i.Second, oa2.i.Third, oa2.i.Fourth);
                break;
            case 6:
                k kVar = this.f52358r;
                p pVar = (p) kVar.getValue();
                GestaltText gestaltText = this.f52346f;
                pVar.o(gestaltText.getId(), -2);
                pVar.q(gestaltText.getId());
                pVar.H(gestaltText.getId(), 0.0f);
                ((p) kVar.getValue()).b(this);
                K0(ze0.a.List);
                z0(false, oa2.i.First, oa2.i.Second, oa2.i.Third, oa2.i.Fourth);
                break;
            case 7:
                ((p) this.f52361u.getValue()).b(this);
                K0(ze0.a.NoPreview);
                z0(false, oa2.i.First, oa2.i.Second, oa2.i.Third, oa2.i.Fourth);
                break;
            case 8:
                ((p) this.f52362v.getValue()).b(this);
                K0(ze0.a.ContentListWide);
                z0(true, oa2.i.First, oa2.i.Second, oa2.i.Third);
                z0(false, oa2.i.Fourth);
                break;
        }
    }

    public final void z0(boolean z13, oa2.i... iVarArr) {
        for (oa2.i iVar : iVarArr) {
            bs1.c.R1(d0(iVar), z13);
        }
    }

    public final void z1(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        I0(action);
        J1(action);
        S0(action);
        w1(new d0(11, action));
        setOnClickListener(new kq1.a(5, action));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoUserRep(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f52348h = true;
        this.f52349i = true;
        this.f52351k = getResources().getDimensionPixelSize(c.lego_image_spacing);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.f52352l = s0.A(c.lego_image_corner_radius, resources);
        final int i13 = 0;
        this.f52354n = s0.L(0.0f, false, false, 30);
        n nVar = n.NONE;
        this.f52355o = b.r(this, 11, nVar);
        this.f52356p = b.r(this, 4, nVar);
        this.f52357q = b.r(this, 0, nVar);
        this.f52358r = b.r(this, 5, nVar);
        this.f52359s = b.r(this, 2, nVar);
        this.f52360t = b.r(this, 1, nVar);
        this.f52361u = b.r(this, 6, nVar);
        this.f52362v = b.r(this, 3, nVar);
        ze0.a aVar = ze0.a.Wide;
        vn1.g gVar = vn1.g.UI_400;
        Pair pair = new Pair(aVar, gVar);
        Pair pair2 = new Pair(ze0.a.Default, h.f126278d);
        ze0.a aVar2 = ze0.a.Compact;
        vn1.g gVar2 = vn1.g.BODY_100;
        this.f52363w = z0.g(pair, pair2, new Pair(aVar2, gVar2), new Pair(ze0.a.List, gVar), new Pair(ze0.a.NoPreview, gVar2));
        this.f52364x = aVar;
        View.inflate(getContext(), v0.user_rep_content_list, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        setImportantForAccessibility(1);
        setFocusable(true);
        setNextFocusDownId(t0.user_rep_action_button);
        setNextFocusRightId(t0.user_rep_action_button);
        WebImageView webImageView = (WebImageView) findViewById(t0.lego_user_rep_first_image);
        WebImageView webImageView2 = null;
        if (webImageView != null) {
            webImageView.setFocusable(false);
        } else {
            webImageView = null;
        }
        this.f52341a = webImageView;
        WebImageView webImageView3 = (WebImageView) findViewById(t0.lego_user_rep_second_image);
        if (webImageView3 != null) {
            webImageView3.setFocusable(false);
        } else {
            webImageView3 = null;
        }
        this.f52342b = webImageView3;
        WebImageView webImageView4 = (WebImageView) findViewById(t0.lego_user_rep_third_image);
        if (webImageView4 != null) {
            webImageView4.setFocusable(false);
        } else {
            webImageView4 = null;
        }
        this.f52343c = webImageView4;
        WebImageView webImageView5 = (WebImageView) findViewById(t0.lego_user_rep_fourth_image);
        if (webImageView5 != null) {
            webImageView5.setFocusable(false);
            webImageView2 = webImageView5;
        }
        this.f52344d = webImageView2;
        View findViewById = findViewById(t0.lego_user_rep_foreground_image);
        GestaltAvatar gestaltAvatar = (GestaltAvatar) findViewById;
        gestaltAvatar.setImportantForAccessibility(4);
        gestaltAvatar.setFocusable(false);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f52345e = gestaltAvatar;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f52350j = rl1.n.e(context2);
        View findViewById2 = findViewById(t0.user_rep_action_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById2;
        gestaltButton.setImportantForAccessibility(1);
        gestaltButton.setFocusable(true);
        gestaltButton.d(e.f93870t);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f52365y = gestaltButton;
        View findViewById3 = findViewById(t0.lego_user_rep_title);
        GestaltText gestaltText = (GestaltText) findViewById3;
        gestaltText.i(e.f93871u);
        gestaltText.setImportantForAccessibility(1);
        gestaltText.setFocusable(false);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f52346f = gestaltText;
        View findViewById4 = findViewById(t0.lego_user_rep_metadata);
        GestaltText gestaltText2 = (GestaltText) findViewById4;
        gestaltText2.i(e.f93872v);
        gestaltText2.setImportantForAccessibility(4);
        gestaltText2.setFocusable(false);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f52347g = gestaltText2;
        this.f52366z = ((GestaltIconButton) findViewById(t0.user_rep_options_button)).u(new gm1.a(this) { // from class: oa2.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegoUserRep f93914b;

            {
                this.f93914b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i14 = i13;
                LegoUserRep.L(this.f93914b, cVar);
            }
        });
        k0();
        o0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoUserRep(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f52348h = true;
        this.f52349i = true;
        this.f52351k = getResources().getDimensionPixelSize(c.lego_image_spacing);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.f52352l = s0.A(c.lego_image_corner_radius, resources);
        this.f52354n = s0.L(0.0f, false, false, 30);
        n nVar = n.NONE;
        this.f52355o = b.r(this, 11, nVar);
        this.f52356p = b.r(this, 4, nVar);
        this.f52357q = b.r(this, 0, nVar);
        this.f52358r = b.r(this, 5, nVar);
        final int i14 = 2;
        this.f52359s = b.r(this, 2, nVar);
        this.f52360t = b.r(this, 1, nVar);
        this.f52361u = b.r(this, 6, nVar);
        this.f52362v = b.r(this, 3, nVar);
        ze0.a aVar = ze0.a.Wide;
        vn1.g gVar = vn1.g.UI_400;
        Pair pair = new Pair(aVar, gVar);
        Pair pair2 = new Pair(ze0.a.Default, h.f126278d);
        ze0.a aVar2 = ze0.a.Compact;
        vn1.g gVar2 = vn1.g.BODY_100;
        this.f52363w = z0.g(pair, pair2, new Pair(aVar2, gVar2), new Pair(ze0.a.List, gVar), new Pair(ze0.a.NoPreview, gVar2));
        this.f52364x = aVar;
        View.inflate(getContext(), v0.user_rep_content_list, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        setImportantForAccessibility(1);
        setFocusable(true);
        setNextFocusDownId(t0.user_rep_action_button);
        setNextFocusRightId(t0.user_rep_action_button);
        WebImageView webImageView = (WebImageView) findViewById(t0.lego_user_rep_first_image);
        WebImageView webImageView2 = null;
        if (webImageView != null) {
            webImageView.setFocusable(false);
        } else {
            webImageView = null;
        }
        this.f52341a = webImageView;
        WebImageView webImageView3 = (WebImageView) findViewById(t0.lego_user_rep_second_image);
        if (webImageView3 != null) {
            webImageView3.setFocusable(false);
        } else {
            webImageView3 = null;
        }
        this.f52342b = webImageView3;
        WebImageView webImageView4 = (WebImageView) findViewById(t0.lego_user_rep_third_image);
        if (webImageView4 != null) {
            webImageView4.setFocusable(false);
        } else {
            webImageView4 = null;
        }
        this.f52343c = webImageView4;
        WebImageView webImageView5 = (WebImageView) findViewById(t0.lego_user_rep_fourth_image);
        if (webImageView5 != null) {
            webImageView5.setFocusable(false);
            webImageView2 = webImageView5;
        }
        this.f52344d = webImageView2;
        View findViewById = findViewById(t0.lego_user_rep_foreground_image);
        GestaltAvatar gestaltAvatar = (GestaltAvatar) findViewById;
        gestaltAvatar.setImportantForAccessibility(4);
        gestaltAvatar.setFocusable(false);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f52345e = gestaltAvatar;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f52350j = rl1.n.e(context2);
        View findViewById2 = findViewById(t0.user_rep_action_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById2;
        gestaltButton.setImportantForAccessibility(1);
        gestaltButton.setFocusable(true);
        gestaltButton.d(e.f93870t);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f52365y = gestaltButton;
        View findViewById3 = findViewById(t0.lego_user_rep_title);
        GestaltText gestaltText = (GestaltText) findViewById3;
        gestaltText.i(e.f93871u);
        gestaltText.setImportantForAccessibility(1);
        gestaltText.setFocusable(false);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f52346f = gestaltText;
        View findViewById4 = findViewById(t0.lego_user_rep_metadata);
        GestaltText gestaltText2 = (GestaltText) findViewById4;
        gestaltText2.i(e.f93872v);
        gestaltText2.setImportantForAccessibility(4);
        gestaltText2.setFocusable(false);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f52347g = gestaltText2;
        this.f52366z = ((GestaltIconButton) findViewById(t0.user_rep_options_button)).u(new gm1.a(this) { // from class: oa2.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegoUserRep f93914b;

            {
                this.f93914b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i142 = i14;
                LegoUserRep.L(this.f93914b, cVar);
            }
        });
        k0();
        o0();
    }
}
