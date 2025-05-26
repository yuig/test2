package com.pinterest.activity.pin.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import dl2.b;
import eo1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oq.n;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/activity/pin/view/PinCloseupChevronIconView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "g4/u", "closeup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PinCloseupChevronIconView extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f34986b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltIcon f34987a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCloseupChevronIconView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltIcon L = L();
        this.f34987a = L;
        addView(L);
    }

    public final GestaltIcon L() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltIcon gestaltIcon = new GestaltIcon(context);
        gestaltIcon.g2(n.f97092k);
        return gestaltIcon;
    }

    public final void T(long j13, boolean z13) {
        float[] fArr = new float[2];
        fArr[0] = 0.0f;
        fArr[1] = z13 ? -180.0f : 180.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f34987a, "rotation", fArr);
        ofFloat.setDuration(j13);
        ofFloat.start();
    }

    public final void X(long j13, boolean z13) {
        float[] fArr = new float[2];
        fArr[0] = z13 ? -180.0f : 180.0f;
        fArr[1] = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f34987a, "rotation", fArr);
        ofFloat.setDuration(j13);
        ofFloat.start();
    }

    public final void Z(boolean z13) {
        b.z(this.f34987a, n.f97094m);
        int i13 = z13 ? c.space_600 : c.space_500;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(bs1.c.W(this, i13));
        setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCloseupChevronIconView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltIcon L = L();
        this.f34987a = L;
        addView(L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCloseupChevronIconView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltIcon L = L();
        this.f34987a = L;
        addView(L);
    }
}
