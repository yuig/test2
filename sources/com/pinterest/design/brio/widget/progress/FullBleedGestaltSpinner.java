package com.pinterest.design.brio.widget.progress;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import eo1.b;
import kh2.s0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ln1.e;
import nt.k2;
import org.jetbrains.annotations.NotNull;
import se0.a;
import se0.c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/design/brio/widget/progress/FullBleedGestaltSpinner;", "Landroid/widget/FrameLayout;", "Lse0/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "xa0/j", "design_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FullBleedGestaltSpinner extends FrameLayout implements c {

    /* renamed from: a, reason: collision with root package name */
    public e f44858a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltSpinner f44859b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullBleedGestaltSpinner(Context context) {
        this(6, context, (AttributeSet) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(e state) {
        int i13;
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f44858a != state) {
            this.f44858a = state;
            s0.w(this.f44859b, new k2(state, 1));
            int i14 = a.f112379a[state.ordinal()];
            if (i14 == 1 || i14 == 2) {
                i13 = 8;
            } else {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = 0;
            }
            setVisibility(i13);
        }
    }

    @Override // se0.c
    public final void showLoadingSpinner(boolean z13) {
        a(z13 ? e.LOADING : e.LOADED);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullBleedGestaltSpinner(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FullBleedGestaltSpinner(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullBleedGestaltSpinner(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44858a = e.NONE;
        Context context2 = getContext();
        int i14 = b.color_themed_background_default;
        Object obj = d5.a.f53679a;
        setBackgroundColor(context2.getColor(i14));
        setAlpha(0.8f);
        GestaltSpinner gestaltSpinner = new GestaltSpinner(6, context, (AttributeSet) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        gestaltSpinner.setLayoutParams(layoutParams);
        this.f44859b = gestaltSpinner;
        addView(gestaltSpinner);
    }
}
