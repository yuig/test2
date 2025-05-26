package tr0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import ky.g;
import ky.h;
import ll.j;
import m60.r0;
import nr0.c;
import nx.d0;
import nx.v;
import vf0.b;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends FrameLayout implements n, v, h {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f119028i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final d0 f119029a;

    /* renamed from: b, reason: collision with root package name */
    public final c f119030b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltButton f119031c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f119032d;

    /* renamed from: e, reason: collision with root package name */
    public String f119033e;

    /* renamed from: f, reason: collision with root package name */
    public String f119034f;

    /* renamed from: g, reason: collision with root package name */
    public final j f119035g;

    /* renamed from: h, reason: collision with root package name */
    public String f119036h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, d0 pinalytics, c listener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f119029a = pinalytics;
        this.f119030b = listener;
        this.f119035g = new j(16, 0);
        View.inflate(context, vf0.c.view_holder_simple_action_story, this);
        View findViewById = findViewById(b.simple_action_story_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f119032d = (GestaltText) findViewById;
        View findViewById2 = findViewById(b.simple_action_story_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f119031c = (GestaltButton) findViewById2;
        setClipToPadding(false);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(r0.margin_one_and_a_half);
        setPaddingRelative(0, dimensionPixelOffset, 0, dimensionPixelOffset);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        String str = this.f119033e;
        if (str == null) {
            return null;
        }
        return j.x(this.f119035g, str, 0, 0, this.f119036h, null, null, 52);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return this.f119035g.y(null);
    }

    @Override // ky.h
    public final g z() {
        return g.OTHER;
    }
}
