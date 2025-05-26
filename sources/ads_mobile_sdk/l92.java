package ads_mobile_sdk;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l92 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final vi.a f7746a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l92(vi.a adSize, Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7746a = adSize;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i17 = ((i15 - i13) - measuredWidth) / 2;
        int i18 = ((i16 - i14) - measuredHeight) / 2;
        childAt.layout(i17, i18, measuredWidth + i17, measuredHeight + i18);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        int i16;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            Context context = getContext();
            vi.a aVar = this.f7746a;
            Intrinsics.f(context);
            aVar.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            int i17 = aVar.f125857a;
            if (i17 == -4 || i17 == -3) {
                i15 = -1;
            } else {
                Intrinsics.checkNotNullParameter(context, "<this>");
                Intrinsics.checkNotNullParameter(context, "<this>");
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
                i15 = (int) TypedValue.applyDimension(1, i17, displayMetrics);
            }
            vi.a aVar2 = this.f7746a;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            int i18 = aVar2.f125858b;
            if (i18 == -4 || i18 == -3) {
                i16 = -1;
            } else {
                Intrinsics.checkNotNullParameter(context, "<this>");
                Intrinsics.checkNotNullParameter(context, "<this>");
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
                i16 = (int) TypedValue.applyDimension(1, i18, displayMetrics2);
            }
        } else {
            measureChild(childAt, i13, i14);
            i15 = childAt.getMeasuredWidth();
            i16 = childAt.getMeasuredHeight();
        }
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (i15 < suggestedMinimumWidth) {
            i15 = suggestedMinimumWidth;
        }
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (i16 < suggestedMinimumHeight) {
            i16 = suggestedMinimumHeight;
        }
        setMeasuredDimension(View.resolveSize(i15, i13), View.resolveSize(i16, i14));
    }
}
