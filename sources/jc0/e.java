package jc0;

import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout frameLayout = (FrameLayout) findViewById(ga2.d.modal_list_container);
        this.f44754f = frameLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        com.bumptech.glide.c.a1((LinearLayout.LayoutParams) layoutParams, applyDimension, 0, applyDimension, 0);
    }
}
