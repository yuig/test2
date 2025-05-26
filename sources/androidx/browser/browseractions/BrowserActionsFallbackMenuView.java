package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import r.a;

@Deprecated
/* loaded from: classes2.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f16752a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16753b;

    public BrowserActionsFallbackMenuView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16752a = getResources().getDimensionPixelOffset(a.browser_actions_context_menu_min_padding);
        this.f16753b = getResources().getDimensionPixelOffset(a.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f16752a * 2), this.f16753b), 1073741824), i14);
    }
}
