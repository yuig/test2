package com.pinterest.feature.pincells.fixedsize.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.design.brio.widget.IconView;
import k21.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mk1.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/pincells/fixedsize/view/FixedSizePinOverlayView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "k21/b", "fixedSizePins_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FixedSizePinOverlayView extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f47436e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f47437a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f47438b;

    /* renamed from: c, reason: collision with root package name */
    public final IconView f47439c;

    /* renamed from: d, reason: collision with root package name */
    public b f47440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedSizePinOverlayView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), c.view_fixed_size_pin_overlay, this);
        View findViewById = findViewById(mk1.b.overlay_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47437a = (LinearLayout) findViewById;
        View findViewById2 = findViewById(mk1.b.overlay_message);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47438b = (TextView) findViewById2;
        View findViewById3 = findViewById(mk1.b.overlay_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47439c = (IconView) findViewById3;
        b();
    }

    public final void a(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f47440d = listener;
        setOnClickListener(new com.pinterest.feature.home.view.c(this, 24));
        b();
    }

    public final void b() {
        b bVar = this.f47440d;
        LinearLayout linearLayout = this.f47437a;
        if (bVar != null) {
            bs1.c.U1(linearLayout);
        } else {
            bs1.c.X0(linearLayout);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        return this.f47440d != null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedSizePinOverlayView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), c.view_fixed_size_pin_overlay, this);
        View findViewById = findViewById(mk1.b.overlay_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47437a = (LinearLayout) findViewById;
        View findViewById2 = findViewById(mk1.b.overlay_message);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47438b = (TextView) findViewById2;
        View findViewById3 = findViewById(mk1.b.overlay_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47439c = (IconView) findViewById3;
        b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedSizePinOverlayView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), c.view_fixed_size_pin_overlay, this);
        View findViewById = findViewById(mk1.b.overlay_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47437a = (LinearLayout) findViewById;
        View findViewById2 = findViewById(mk1.b.overlay_message);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47438b = (TextView) findViewById2;
        View findViewById3 = findViewById(mk1.b.overlay_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47439c = (IconView) findViewById3;
        b();
    }
}
