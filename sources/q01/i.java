package q01;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.f1;
import h32.g0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class i extends FrameLayout implements yk1.n {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f101785g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f101786a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f101787b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltButton f101788c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f101789d;

    /* renamed from: e, reason: collision with root package name */
    public c f101790e;

    /* renamed from: f, reason: collision with root package name */
    public p01.g f101791f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f101790e = c.FOOTER;
        View.inflate(context, n80.d.pin_closeup_onebar_filtered_feed_message_view, this);
        View findViewById = findViewById(n80.c.title_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f101786a = (GestaltText) findViewById;
        View findViewById2 = findViewById(n80.c.subtitle_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f101787b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(n80.c.action_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f101788c = (GestaltButton) findViewById3;
        View findViewById4 = findViewById(n80.c.message_container);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById4;
        this.f101789d = linearLayout;
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
        p01.g gVar;
        super.onAttachedToWindow();
        if (this.f101790e != c.FOOTER || (gVar = this.f101791f) == null) {
            return;
        }
        p01.f fVar = (p01.f) gVar;
        if (Intrinsics.d(fVar.f98368h, fVar.f98370j)) {
            return;
        }
        fVar.f98370j = fVar.f98368h;
        f1 f1Var = f1.VIEW;
        g0 g0Var = g0.RELATED_PINS_FILTERED_FEED_FOOTER;
        HashMap hashMap = new HashMap();
        hashMap.put("pin_id", fVar.f98361a);
        String str = fVar.f98368h;
        if (str != null) {
            hashMap.put("related_pins_tabs_selections", str);
        }
        Unit unit = Unit.f80348a;
        d0.B(fVar.f98363c, f1Var, g0Var, null, hashMap, 20);
    }
}
