package y90;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.pinterest.collagesCoreLibrary.effects.EffectSliderView;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final TabLayout f138221a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f138222b;

    /* renamed from: c, reason: collision with root package name */
    public final View f138223c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f138224d;

    /* renamed from: e, reason: collision with root package name */
    public final View f138225e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f138226f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f138227g;

    /* renamed from: h, reason: collision with root package name */
    public final va0.o f138228h;

    /* renamed from: i, reason: collision with root package name */
    public final RecyclerView f138229i;

    public q1(View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        View findViewById = root.findViewById(x1.effect_categories_toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f138221a = (TabLayout) findViewById;
        View findViewById2 = root.findViewById(x1.effects_recycler_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f138222b = (RecyclerView) findViewById2;
        View findViewById3 = root.findViewById(x1.effect_settings_toolbar_back_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f138223c = findViewById3;
        View findViewById4 = root.findViewById(x1.effect_settings_toolbar_title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f138224d = (GestaltText) findViewById4;
        View findViewById5 = root.findViewById(x1.effect_settings_toolbar_done_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f138225e = findViewById5;
        View findViewById6 = root.findViewById(x1.effect_settings_recycler_view);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f138226f = (RecyclerView) findViewById6;
        View findViewById7 = root.findViewById(x1.effect_settings_controls);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f138227g = (ViewGroup) findViewById7;
        View findViewById8 = root.findViewById(x1.slider);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f138228h = new va0.o((EffectSliderView) findViewById8, false);
        View findViewById9 = root.findViewById(x1.colors_recycler);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f138229i = (RecyclerView) findViewById9;
    }
}
