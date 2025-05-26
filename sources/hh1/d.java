package hh1;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.design.brio.widget.voice.PinterestVoiceLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends PinterestVoiceLayout {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f69155j = 0;

    /* renamed from: f, reason: collision with root package name */
    public final l f69156f;

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f69157g;

    /* renamed from: h, reason: collision with root package name */
    public final float f69158h;

    /* renamed from: i, reason: collision with root package name */
    public final ve0.q f69159i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, s tooltipHolder, sp0.d tapPosition, m bubbleSpec, l lVar, Function0 onViewCallback, Function1 onTapCallback, Function1 onDismissCallback, float f13) {
        super(context, null, 0);
        float f14;
        int c13;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tooltipHolder, "tooltipHolder");
        Intrinsics.checkNotNullParameter(tapPosition, "tapPosition");
        Intrinsics.checkNotNullParameter(bubbleSpec, "bubbleSpec");
        Intrinsics.checkNotNullParameter(onViewCallback, "onViewCallback");
        Intrinsics.checkNotNullParameter(onTapCallback, "onTapCallback");
        Intrinsics.checkNotNullParameter(onDismissCallback, "onDismissCallback");
        this.f69156f = lVar;
        this.f69157g = onDismissCallback;
        this.f69158h = f13;
        ve0.q qVar = new ve0.q(getResources(), bs1.c.A(context, eo1.b.color_themed_background_elevation_floating), bubbleSpec.f69187a);
        setPaddingRelative(bubbleSpec.f69190d, bubbleSpec.f69188b, bubbleSpec.f69191e, bubbleSpec.f69189c);
        float V = bs1.c.V(context, p92.a.idea_pin_tooltip_render_radius);
        qVar.f125692f = V;
        ve0.e eVar = qVar.f125694h;
        if (eVar != null) {
            eVar.f125681b = V;
        }
        qVar.c(ve0.b.BOTTOM_CENTER);
        this.f69159i = qVar;
        View a13 = tooltipHolder.a(context);
        a13.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(a13);
        if (lVar != null) {
            tooltipHolder.b(lVar);
        }
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new c(this, tapPosition, this));
        } else {
            int W = bs1.c.W(this, eo1.c.space_200);
            int W2 = bs1.c.W(this, eo1.c.space_800);
            float width = tapPosition.f114883a - (getWidth() / 2);
            float f15 = W;
            if (f15 > width) {
                f14 = width - f15;
                width = f15;
            } else {
                f14 = 0.0f;
            }
            float f16 = f13 - f15;
            if (getWidth() + width > f16) {
                f14 = ((f16 - width) - getWidth()) * (-1);
                width = (f13 - getWidth()) - f15;
            }
            setX(width);
            float height = getHeight();
            float f17 = tapPosition.f114884b;
            float f18 = W2;
            float f19 = (f17 - height) - f18;
            if (f19 < bs1.c.W(this, p92.a.idea_pin_navigation_background_height)) {
                f19 = f17 + f18;
                qVar.c(ve0.b.TOP_CENTER);
            }
            if (f14 != 0.0f && qVar.f125742k != (c13 = ml2.c.c(f14))) {
                qVar.f125742k = c13;
                qVar.f(qVar.f125690d);
            }
            setY(f19);
        }
        setOnTouchListener(new fu0.g(1, onTapCallback));
        onViewCallback.invoke();
    }

    @Override // com.pinterest.design.brio.widget.voice.PinterestVoiceLayout
    public final ve0.f d() {
        return this.f69159i;
    }

    public d(Context context, sp0.d dVar, m mVar, r rVar, sf1.m mVar2, float f13) {
        this(context, l.f69185d, dVar, mVar, rVar, a.f69149i, b.f69150j, mVar2, f13);
    }
}
