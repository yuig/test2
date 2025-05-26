package k90;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pin.closeup.view.UnifiedPinActionBarView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import h32.c1;
import h32.d4;
import h32.f1;
import h32.i0;
import h32.u0;
import j1.p0;
import java.util.ArrayList;
import java.util.HashMap;
import kh2.g3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import kotlin.text.z;
import lh0.e0;
import m60.w;
import m60.x0;
import net.quikkly.android.utils.BitmapUtils;
import nx.d0;
import nx.d1;
import pk.a0;
import u50.f0;
import u50.h0;
import u50.k0;
import x02.i2;
import yk1.n;

/* loaded from: classes5.dex */
public final class k extends ConstraintLayout implements n {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f78766y = 0;

    /* renamed from: a, reason: collision with root package name */
    public final d0 f78767a;

    /* renamed from: b, reason: collision with root package name */
    public final w f78768b;

    /* renamed from: c, reason: collision with root package name */
    public final np0.g f78769c;

    /* renamed from: d, reason: collision with root package name */
    public final i2 f78770d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f78771e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f78772f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f78773g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f78774h;

    /* renamed from: i, reason: collision with root package name */
    public final String f78775i;

    /* renamed from: j, reason: collision with root package name */
    public final String f78776j;

    /* renamed from: k, reason: collision with root package name */
    public final d1 f78777k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f78778l;

    /* renamed from: m, reason: collision with root package name */
    public final WebImageView f78779m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltText f78780n;

    /* renamed from: o, reason: collision with root package name */
    public final GestaltText f78781o;

    /* renamed from: p, reason: collision with root package name */
    public final GestaltText f78782p;

    /* renamed from: q, reason: collision with root package name */
    public final UnifiedPinActionBarView f78783q;

    /* renamed from: r, reason: collision with root package name */
    public final GestaltButtonGroup f78784r;

    /* renamed from: s, reason: collision with root package name */
    public final GestaltButton f78785s;

    /* renamed from: t, reason: collision with root package name */
    public final GestaltIconButton f78786t;

    /* renamed from: u, reason: collision with root package name */
    public final xj2.b f78787u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f78788v;

    /* renamed from: w, reason: collision with root package name */
    public final i0 f78789w;

    /* renamed from: x, reason: collision with root package name */
    public final String f78790x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, d0 pinalytics, w eventManager, np0.g closeupActionController, i2 pinRepository, HashMap auxData, e0 experiments, boolean z13, boolean z14, String str, String str2, d1 d1Var, boolean z15, int i13) {
        super(context, null, 0, 0);
        z13 = (i13 & 1024) != 0 ? false : z13;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(closeupActionController, "closeupActionController");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f78767a = pinalytics;
        this.f78768b = eventManager;
        this.f78769c = closeupActionController;
        this.f78770d = pinRepository;
        this.f78771e = auxData;
        this.f78772f = experiments;
        this.f78773g = z13;
        this.f78774h = z14;
        this.f78775i = str;
        this.f78776j = str2;
        this.f78777k = d1Var;
        this.f78778l = z15;
        this.f78787u = new xj2.b();
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        com.bumptech.glide.c.a1(layoutParams, 0, bs1.c.W(this, eo1.c.space_200), 0, 0);
        layoutParams.f17673j = a90.c.pin_detail_bottom;
        layoutParams.f17691t = 0;
        layoutParams.f17693v = 0;
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
        com.bumptech.glide.c.a1(layoutParams2, 0, bs1.c.W(this, eo1.c.space_600), 0, 0);
        layoutParams2.f17673j = a90.c.pin_detail_bottom;
        layoutParams2.f17691t = 0;
        layoutParams2.f17693v = 0;
        this.f78789w = com.bumptech.glide.d.i0(null, null, d4.SHUFFLE_CUTOUT, "");
        View.inflate(context, a90.d.collages_cutout_pin_details, this);
        int W = bs1.c.W(this, eo1.c.space_200);
        setPaddingRelative(W, getPaddingTop(), W, getPaddingBottom());
        View findViewById = findViewById(a90.c.collages_cutout_details_image);
        WebImageView webImageView = (WebImageView) findViewById;
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f78779m = webImageView;
        View findViewById2 = findViewById(a90.c.pin_details_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f78780n = (GestaltText) findViewById2;
        View findViewById3 = findViewById(a90.c.pin_details_description);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f78781o = (GestaltText) findViewById3;
        View findViewById4 = findViewById(a90.c.pin_details_shop_metadata);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f78782p = (GestaltText) findViewById4;
        View findViewById5 = findViewById(a90.c.cutout_details_overflow_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f78786t = (GestaltIconButton) findViewById5;
        UnifiedPinActionBarView unifiedPinActionBarView = new UnifiedPinActionBarView(context, pinalytics, "pin");
        unifiedPinActionBarView.setLayoutParams(layoutParams);
        unifiedPinActionBarView.f47038e = "COLLAGE_CLOSEUP_CUTOUT_DRAWER_SAVE";
        this.f78783q = unifiedPinActionBarView;
        GestaltButtonGroup gestaltButtonGroup = new GestaltButtonGroup(6, context, (AttributeSet) null);
        kh2.d.k(gestaltButtonGroup, b.f78718l);
        gestaltButtonGroup.setLayoutParams(layoutParams);
        gestaltButtonGroup.setPaddingRelative(gestaltButtonGroup.getPaddingStart(), W, gestaltButtonGroup.getPaddingEnd(), W);
        this.f78784r = gestaltButtonGroup;
        GestaltButton gestaltButton = new GestaltButton(0, 14, context, (AttributeSet) null);
        bs1.c.s(gestaltButton, b.f78719m);
        gestaltButton.setLayoutParams(layoutParams2);
        gestaltButton.setPaddingRelative(gestaltButton.getPaddingStart(), W, gestaltButton.getPaddingEnd(), W);
        this.f78785s = gestaltButton;
        if (z14) {
            addView(gestaltButton);
        } else if (z13) {
            addView(gestaltButtonGroup);
        } else {
            addView(unifiedPinActionBarView);
        }
        this.f78790x = (String) auxData.getOrDefault("shuffle_asset_id", null);
    }

    public static void X(GestaltText gestaltText, String str) {
        if (str == null || z.j(str)) {
            a0.p(gestaltText, "");
            bs1.c.X0(gestaltText);
        } else {
            a0.p(gestaltText, str);
            bs1.c.U1(gestaltText);
        }
    }

    public final void L(f30 f30Var) {
        this.f78784r.a(new p0(f30Var, new j0(), new j0(), new j0(), 10)).b(new h(this, f30Var, 5));
    }

    public final void T(f30 f30Var) {
        Object obj;
        yl1.g b13;
        fm1.c cVar;
        Boolean M4 = f30Var.M4();
        Intrinsics.checkNotNullExpressionValue(M4, "getIsEligibleForPdp(...)");
        int i13 = 0;
        if (M4.booleanValue()) {
            int i14 = x0.pin_action_shop;
            String[] formatArgs = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            ArrayList arrayList = new ArrayList(formatArgs.length);
            int length = formatArgs.length;
            while (i13 < length) {
                arrayList.add(new f0(formatArgs[i13]));
                i13++;
            }
            obj = new k0(i14, arrayList);
            b13 = yl1.i.b();
            cVar = fm1.c.VISIBLE;
        } else if (j1.U0(f30Var.s5())) {
            int i15 = x0.pin_action_default;
            String[] formatArgs2 = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
            ArrayList arrayList2 = new ArrayList(formatArgs2.length);
            int length2 = formatArgs2.length;
            while (i13 < length2) {
                arrayList2.add(new f0(formatArgs2[i13]));
                i13++;
            }
            obj = new k0(i15, arrayList2);
            b13 = yl1.i.b();
            cVar = fm1.c.VISIBLE;
        } else {
            obj = h0.f120562a;
            b13 = yl1.i.b();
            cVar = fm1.c.INVISIBLE;
        }
        this.f78785s.d(new p0(this, cVar, b13, obj, 11)).e(new h(this, f30Var, 4));
    }

    public final void Z(f30 f30Var) {
        boolean z13 = this.f78774h;
        if (z13) {
            String i63 = f30Var.i6();
            f1 f1Var = f1.COLLAGE_CUTOUT_ITEM_CLICKTHROUGH;
            String str = this.f78775i;
            String str2 = this.f78776j;
            this.f78767a.o(f1Var, (r19 & 2) != 0 ? null : null, (r19 & 4) != 0 ? null : null, (r19 & 8) != 0 ? null : str2, (r19 & 32) != 0 ? null : null, null, g3.B(str2, str, i63), null, false);
        } else {
            Boolean M4 = f30Var.M4();
            Intrinsics.checkNotNullExpressionValue(M4, "getIsEligibleForPdp(...)");
            this.f78767a.j(this.f78789w, M4.booleanValue() ? u0.SHOP_BUTTON : u0.VISIT_BUTTON, null, this.f78790x, this.f78771e);
        }
        if (z13 && this.f78778l) {
            String str3 = this.f78776j;
            if (j1.U0(str3)) {
                if (str3 == null) {
                    str3 = "";
                }
                this.f78770d.P(str3).F(new i(2, new j(this, 1)), new i(3, b.f78721o), ck2.i.f27923c, ck2.i.f27924d);
                return;
            }
        }
        g0(f30Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a0(com.pinterest.api.model.f30 r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k90.k.a0(com.pinterest.api.model.f30, java.lang.String):void");
    }

    public final void d0(f30 f30Var) {
        if (this.f78774h) {
            Z(f30Var);
            return;
        }
        d0.B(this.f78767a, f1.PIN_CLICKTHROUGH, null, f30Var.getUid(), this.f78771e, 18);
        this.f78768b.d(Navigation.r0((ScreenLocation) com.pinterest.screens.k0.f51022b.getValue(), f30Var));
    }

    public final void g0(f30 f30Var) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String D = com.bumptech.glide.c.D(f30Var);
        c1 B = g3.B(this.f78776j, this.f78775i, f30Var.i6());
        if (!this.f78774h) {
            B = null;
        }
        c1 c1Var = B;
        Boolean bool = Boolean.FALSE;
        this.f78769c.a(context, f30Var, D, "pin", this.f78767a, null, this.f78787u, (r25 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : c1Var, (r25 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? Boolean.FALSE : bool, (r25 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? new HashMap() : this.f78771e, false);
    }
}
