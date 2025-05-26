package com.pinterest.design.brio.widget.progress;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.pinterest.design.brio.widget.progress.PinterestLoadingLayout;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ln1.e;
import se0.c;

/* loaded from: classes.dex */
public class PinterestLoadingLayout extends FrameLayout implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f44867b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltSpinner f44868a;

    public PinterestLoadingLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44868a = new GestaltSpinner(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.f44868a, layoutParams);
    }

    @Override // se0.c
    public final void showLoadingSpinner(boolean z13) {
        final e eVar = z13 ? e.LOADING : e.LOADED;
        this.f44868a.u(new Function1() { // from class: se0.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ln1.d displayState = (ln1.d) obj;
                int i13 = PinterestLoadingLayout.f44867b;
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                ln1.f fVar = displayState.f83999a;
                ln1.e loadingState = ln1.e.this;
                Intrinsics.checkNotNullParameter(loadingState, "loadingState");
                return new ln1.d(fVar, displayState.f84000b, loadingState, displayState.f84002d, displayState.f84003e, displayState.f84004f);
            }
        });
        boolean z14 = eVar != e.LOADING;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt != this.f44868a) {
                childAt.setVisibility(z14 ? 0 : 4);
            }
        }
    }

    public PinterestLoadingLayout(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f44868a = new GestaltSpinner(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.f44868a, layoutParams);
    }
}
