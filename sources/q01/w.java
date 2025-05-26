package q01;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w extends FrameLayout implements yk1.n {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f101834e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f101835a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltButton f101836b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f101837c;

    /* renamed from: d, reason: collision with root package name */
    public s f101838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f101838d = s.FOOTER;
        View.inflate(context, n80.d.related_pins_filtered_feed_message_view, this);
        View findViewById = findViewById(n80.c.message_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f101835a = (GestaltText) findViewById;
        View findViewById2 = findViewById(n80.c.action_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f101836b = (GestaltButton) findViewById2;
        View findViewById3 = findViewById(n80.c.message_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById3;
        this.f101837c = linearLayout;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -1;
        layoutParams.height = hf0.b.g(context);
        linearLayout.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s sVar = s.ERROR;
    }
}
