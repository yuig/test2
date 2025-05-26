package zc1;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import va1.r;
import yk1.n;

/* loaded from: classes5.dex */
public final class f extends FrameLayout implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f141597f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f141598a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltButton f141599b;

    /* renamed from: c, reason: collision with root package name */
    public r f141600c;

    /* renamed from: d, reason: collision with root package name */
    public final o5.c f141601d;

    /* renamed from: e, reason: collision with root package name */
    public s f141602e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, wc1.c handleButtonClick) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handleButtonClick, "handleButtonClick");
        this.f141598a = handleButtonClick;
        o5.c a13 = o5.c.a();
        Intrinsics.checkNotNullExpressionValue(a13, "getInstance(...)");
        this.f141601d = a13;
        this.f141602e = e.f141592j;
        View.inflate(context, c52.d.view_settings_button_menu_item, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(c52.c.settings_button_item);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        this.f141599b = gestaltButton;
        gestaltButton.g(new lc1.b(this, 7));
    }
}
