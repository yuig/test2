package dd2;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import h32.f1;
import java.util.HashMap;
import jc0.s;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.q4;
import lh0.z0;
import lh0.z3;
import m60.w;
import nx.d0;
import pk.a0;
import rb2.k;
import rg0.n;

/* loaded from: classes4.dex */
public final class g extends LinearLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f54459p = 0;

    /* renamed from: a, reason: collision with root package name */
    public final w f54460a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f54461b;

    /* renamed from: c, reason: collision with root package name */
    public final n f54462c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f54463d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f54464e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltButton f54465f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltButton f54466g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f54467h;

    /* renamed from: i, reason: collision with root package name */
    public final View f54468i;

    /* renamed from: j, reason: collision with root package name */
    public final View f54469j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewPager f54470k;

    /* renamed from: l, reason: collision with root package name */
    public final ImageView f54471l;

    /* renamed from: m, reason: collision with root package name */
    public int f54472m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f54473n;

    /* renamed from: o, reason: collision with root package name */
    public final String f54474o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(w eventManager, d0 pinalytics, n expValue, q4 experiments, Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(expValue, "expValue");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f54460a = eventManager;
        this.f54461b = pinalytics;
        this.f54462c = expValue;
        boolean[] zArr = new boolean[3];
        for (int i13 = 0; i13 < 3; i13++) {
            zArr[i13] = false;
        }
        this.f54473n = zArr;
        View.inflate(context, c.widget_modal_view, this);
        z3 activate = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        experiments.getClass();
        String str = "enabled_try_it";
        Intrinsics.checkNotNullParameter("enabled_try_it", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        z0 z0Var = experiments.f83465a;
        if (!((g1) z0Var).k("android_widget_upsell", "enabled_try_it", activate)) {
            str = "enabled_learn_more";
            Intrinsics.checkNotNullParameter("enabled_learn_more", "group");
            Intrinsics.checkNotNullParameter(activate, "activate");
            if (!((g1) z0Var).k("android_widget_upsell", "enabled_learn_more", activate)) {
                str = "enabled";
            }
        }
        this.f54474o = str;
        View findViewById = findViewById(b.widget_upsell_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        this.f54463d = gestaltText;
        View findViewById2 = findViewById(b.widget_upsell_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById2;
        this.f54464e = gestaltText2;
        View findViewById3 = findViewById(b.widget_upsell_button_next);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById3;
        this.f54465f = gestaltButton;
        View findViewById4 = findViewById(b.widget_upsell_button_try_it);
        GestaltButton gestaltButton2 = (GestaltButton) findViewById4;
        gestaltButton2.d(f.f54452j);
        gestaltButton2.e(new e(this, 2));
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f54466g = gestaltButton2;
        View findViewById5 = findViewById(b.widget_upsell_viewpager);
        ViewPager viewPager = (ViewPager) findViewById5;
        viewPager.z(new th0.c(new String[]{"widget_upsell_step_1_animation.json", "widget_upsell_step_2_animation.json"}));
        viewPager.b(new th0.b(this, 5));
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        this.f54470k = viewPager;
        View findViewById6 = findViewById(b.widget_upsell_image);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById6;
        this.f54471l = imageView;
        View findViewById7 = findViewById(b.widget_upsell_dots);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById7;
        this.f54467h = linearLayout;
        View findViewById8 = findViewById(b.widget_upsell_dot_1);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f54468i = findViewById8;
        View findViewById9 = findViewById(b.widget_upsell_dot_2);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f54469j = findViewById9;
        ((GestaltIcon) findViewById(b.widget_upsell_close)).setOnClickListener(new k(this, 2));
        this.f54472m = 0;
        viewPager.setVisibility(8);
        imageView.setVisibility(0);
        linearLayout.setVisibility(8);
        a0.o(gestaltText, d.widget_upsell_first_title, new Object[0]);
        a0.o(gestaltText2, d.widget_upsell_first_description, new Object[0]);
        gestaltButton.d(f.f54453k);
        gestaltButton.e(new e(this, 1));
        gestaltButton2.d(new cd2.n(this, 2));
        if (!zArr[this.f54472m]) {
            this.f54461b.g(f1.WIDGET_PRE_UPSELL_SHOWN, null, d(), false);
            zArr[this.f54472m] = true;
        }
        this.f54462c.g();
    }

    public final void a(boolean z13) {
        n nVar = this.f54462c;
        if (z13) {
            nVar.a(null, null);
        } else {
            nVar.c(null, null);
            this.f54461b.g(f1.WIDGET_UPSELL_DISMISS, null, d(), false);
        }
        this.f54460a.d(new s(true, 0));
    }

    public final void b() {
        int i13 = this.f54472m;
        boolean[] zArr = this.f54473n;
        if (zArr[i13]) {
            return;
        }
        this.f54461b.g(f1.WIDGET_UPSELL_STEPS_SHOWN, null, d(), false);
        zArr[this.f54472m] = true;
    }

    public final void c() {
        this.f54472m = 1;
        ViewPager viewPager = this.f54470k;
        viewPager.setVisibility(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(viewPager.getLayoutParams());
        layoutParams.gravity = 8388613;
        viewPager.setLayoutParams(layoutParams);
        this.f54471l.setVisibility(8);
        this.f54467h.setVisibility(0);
        this.f54468i.setBackground(getContext().getDrawable(a.selected_dot));
        this.f54469j.setBackground(getContext().getDrawable(a.default_dot));
        a0.o(this.f54463d, d.widget_upsell_second_title, new Object[0]);
        a0.o(this.f54464e, d.widget_upsell_second_description, new Object[0]);
        f fVar = f.f54454l;
        GestaltButton gestaltButton = this.f54465f;
        gestaltButton.d(fVar);
        gestaltButton.e(new e(this, 0));
        this.f54466g.d(f.f54455m);
        b();
    }

    public final HashMap d() {
        return bs1.c.o(new Pair("step", String.valueOf(this.f54472m)), new Pair("experiment_group", this.f54474o));
    }
}
