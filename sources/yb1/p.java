package yb1;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends FrameLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f138571a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltTextField f138572b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltButton f138573c;

    /* renamed from: d, reason: collision with root package name */
    public String f138574d;

    /* renamed from: e, reason: collision with root package name */
    public va1.t f138575e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, s handleAction) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handleAction, "handleAction");
        this.f138571a = handleAction;
        this.f138574d = "";
        View.inflate(context, g52.b.view_settings_manual_filter_input_item, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        Intrinsics.checkNotNullExpressionValue(findViewById(g52.a.view_comments_manual_filter_input_container), "findViewById(...)");
        View findViewById = findViewById(g52.a.view_comments_manual_filter_input_edit);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f138572b = (GestaltTextField) findViewById;
        View findViewById2 = findViewById(g52.a.save_manual_filters_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById2;
        this.f138573c = gestaltButton;
        gestaltButton.e(new o(this, 1));
    }
}
