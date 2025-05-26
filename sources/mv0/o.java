package mv0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltAvatar f88385a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f88386b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f88387c;

    /* renamed from: d, reason: collision with root package name */
    public final WebImageView f88388d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f88389e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f88390f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, aq1.f.single_idea_pin_product_module, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setClipToPadding(false);
        View findViewById = findViewById(aq1.d.single_pin_module_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f88389e = (GestaltText) findViewById;
        View findViewById2 = findViewById(aq1.d.single_pin_module_price_info);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f88390f = (GestaltText) findViewById2;
        View findViewById3 = findViewById(aq1.d.single_pin_module_linear_layout_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        WebImageView webImageView = new WebImageView(context);
        this.f88388d = webImageView;
        ((LinearLayout) findViewById3).addView(webImageView, 0);
        View findViewById4 = findViewById(aq1.d.single_pin_module_creator_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f88385a = (GestaltAvatar) findViewById4;
        View findViewById5 = findViewById(aq1.d.single_pin_module_creator);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f88386b = (LinearLayout) findViewById5;
        View findViewById6 = findViewById(aq1.d.single_pin_module_creator_name);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f88387c = (GestaltText) findViewById6;
    }
}
