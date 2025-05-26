package xa1;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends LinearLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f134468a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f134469b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f134470c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f134471d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f134472e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltIcon f134473f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f134474g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltIcon f134475h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, k handleItemClick, k handleBannerShown, k handleBannerDismiss) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handleItemClick, "handleItemClick");
        Intrinsics.checkNotNullParameter(handleBannerShown, "handleBannerShown");
        Intrinsics.checkNotNullParameter(handleBannerDismiss, "handleBannerDismiss");
        this.f134468a = handleItemClick;
        this.f134469b = handleBannerShown;
        this.f134470c = handleBannerDismiss;
        View.inflate(context, d52.b.view_settings_menu_item_with_banner, this);
        View findViewById = findViewById(d52.a.banner);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f134471d = (LinearLayout) findViewById;
        View findViewById2 = findViewById(d52.a.banner_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f134472e = (GestaltText) findViewById2;
        View findViewById3 = findViewById(d52.a.banner_cancel_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f134473f = (GestaltIcon) findViewById3;
        View findViewById4 = findViewById(d52.a.settings_menu_item_title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f134474g = (GestaltText) findViewById4;
        View findViewById5 = findViewById(d52.a.settings_menu_item_nav_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f134475h = (GestaltIcon) findViewById5;
    }
}
