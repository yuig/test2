package ev;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ps.p;
import ps.q;

/* loaded from: classes3.dex */
public final class a extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f60192f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f60193a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f60194b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f60195c;

    /* renamed from: d, reason: collision with root package name */
    public final View f60196d;

    /* renamed from: e, reason: collision with root package name */
    public final View f60197e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Function0 actionButtonListener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actionButtonListener, "actionButtonListener");
        this.f60193a = actionButtonListener;
        View.inflate(context, tr.c.post_create_upsell, this);
        View findViewById = findViewById(tr.b.title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        this.f60194b = gestaltText;
        View findViewById2 = findViewById(tr.b.description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById2;
        this.f60195c = gestaltText2;
        View findViewById3 = findViewById(tr.b.action_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById3;
        this.f60196d = gestaltButton;
        View findViewById4 = findViewById(tr.b.image_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        WebImageView webImageView = (WebImageView) findViewById4;
        this.f60197e = webImageView;
        float dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_400);
        webImageView.g2(dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f);
        gestaltText.i(y21.a.f136684k);
        gestaltText2.i(y21.a.f136683j);
        gestaltButton.g(new com.pinterest.feature.home.view.c(this, 25));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Function0 action, int i13) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f60193a = action;
        setOrientation(0);
        View inflate = View.inflate(context, q.ad_attribute_item_view, this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, getResources().getDimensionPixelSize(eo1.c.space_200), 0, 0);
        setLayoutParams(layoutParams);
        View findViewById = inflate.findViewById(p.ad_reason_icon_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f60197e = (ViewGroup) findViewById;
        View findViewById2 = inflate.findViewById(p.ad_reason_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f60196d = (GestaltIcon) findViewById2;
        View findViewById3 = inflate.findViewById(p.ad_reason_description);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f60194b = (GestaltText) findViewById3;
        View findViewById4 = inflate.findViewById(p.ad_reason_bullet);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f60195c = (GestaltText) findViewById4;
    }
}
