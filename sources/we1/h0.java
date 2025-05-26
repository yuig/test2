package we1;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.f30;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 extends uq.w implements yk1.n, nx.v, qa2.d0, x21.b {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f129376w = 0;

    /* renamed from: d, reason: collision with root package name */
    public final nx.d0 f129377d;

    /* renamed from: e, reason: collision with root package name */
    public final ao2.j0 f129378e;

    /* renamed from: f, reason: collision with root package name */
    public qa2.j0 f129379f;

    /* renamed from: g, reason: collision with root package name */
    public ni1.t2 f129380g;

    /* renamed from: h, reason: collision with root package name */
    public ni1.d0 f129381h;

    /* renamed from: i, reason: collision with root package name */
    public final FrameLayout f129382i;

    /* renamed from: j, reason: collision with root package name */
    public View f129383j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltAvatar f129384k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltText f129385l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f129386m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltIconButton f129387n;

    /* renamed from: o, reason: collision with root package name */
    public final ImageView f129388o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f129389p;

    /* renamed from: q, reason: collision with root package name */
    public Navigation f129390q;

    /* renamed from: r, reason: collision with root package name */
    public String f129391r;

    /* renamed from: s, reason: collision with root package name */
    public qa2.d0 f129392s;

    /* renamed from: t, reason: collision with root package name */
    public Function2 f129393t;

    /* renamed from: u, reason: collision with root package name */
    public final SbaPinRep f129394u;

    /* renamed from: v, reason: collision with root package name */
    public final ni1.o2 f129395v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, nx.d0 pinalytics, ao2.j0 scope) {
        super(context, 25);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f129377d = pinalytics;
        this.f129378e = scope;
        this.f129393t = w.f129661j;
        wa2.m mVar = new wa2.m(-8388609, -1, 1023, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false);
        qa2.j0 j0Var = this.f129379f;
        if (j0Var == null) {
            Intrinsics.r("pinGridCellFactory");
            throw null;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        SbaPinRep sbaPinRep = (SbaPinRep) ((qa2.d) j0Var).a(context2, true);
        ni1.t2 t2Var = this.f129380g;
        if (t2Var == null) {
            Intrinsics.r("pinRepViewModelFactory");
            throw null;
        }
        ni1.o2 a13 = ni1.t2.a(t2Var, scope, new zw.a(this), 6);
        l3.c.m(sbaPinRep, mVar, pinalytics, a13, scope);
        this.f129394u = sbaPinRep;
        this.f129395v = a13;
        View.inflate(context, r82.f.idea_pin_rep_view, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(r82.d.idea_pin_rep_view_pin_cell);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f129382i = (FrameLayout) findViewById;
        View findViewById2 = findViewById(r82.d.idea_pin_rep_view_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f129384k = (GestaltAvatar) findViewById2;
        View findViewById3 = findViewById(r82.d.idea_pin_rep_view_creator_name);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f129385l = (GestaltText) findViewById3;
        View findViewById4 = findViewById(r82.d.idea_pin_rep_view_creator_metadata);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f129386m = (TextView) findViewById4;
        View findViewById5 = findViewById(r82.d.idea_pin_rep_view_overflow_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f129387n = (GestaltIconButton) findViewById5;
        int generateViewId = View.generateViewId();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{dl2.b.y0(this, eo1.a.sema_color_background_transparent), dl2.b.y0(this, eo1.a.color_background_dark_opacity_300)});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setShape(0);
        float b03 = bs1.c.b0(this, eo1.c.lego_corner_radius_medium);
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, b03, b03, b03, b03});
        ImageView imageView = new ImageView(context);
        imageView.setBackground(gradientDrawable);
        imageView.setId(generateViewId);
        this.f129388o = imageView;
    }

    public static void L(View view, Function1 function1) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.f17691t = -1;
        layoutParams2.f17690s = -1;
        layoutParams2.f17692u = -1;
        layoutParams2.f17693v = -1;
        layoutParams2.f17673j = -1;
        layoutParams2.f17671i = -1;
        layoutParams2.f17677l = -1;
        layoutParams2.f17675k = -1;
        layoutParams2.E = 0.5f;
        layoutParams2.setMarginStart(0);
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
        layoutParams2.setMarginEnd(0);
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
        function1.invoke(layoutParams2);
        view.setLayoutParams(layoutParams2);
    }

    public final pg1.c T() {
        View view = this.f129383j;
        qa2.k1 k1Var = view instanceof qa2.k1 ? (qa2.k1) view : null;
        if (k1Var != null) {
            return k1Var.f103292n;
        }
        return null;
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return kotlin.collections.e0.b(this.f129394u.asView());
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return null;
    }

    @Override // qa2.d0
    public final void onOpenPinCloseup(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        qa2.d0 d0Var = this.f129392s;
        if (d0Var != null) {
            d0Var.onOpenPinCloseup(pin);
        }
    }
}
