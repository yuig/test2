package com.pinterest.component.modal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import d5.a;
import eo1.b;
import ga2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/component/modal/ModalViewWrapper;", "Lcom/pinterest/component/modal/BaseModalViewWrapper;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui-components_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class ModalViewWrapper extends BaseModalViewWrapper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalViewWrapper(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        z();
    }

    public final void s(int i13) {
        Intrinsics.checkNotNullExpressionValue(LayoutInflater.from(getContext()).inflate(i13, this.f44754f), "inflate(...)");
    }

    public final void t(View view) {
        ViewGroup viewGroup = this.f44754f;
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
    }

    public final void x(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ViewGroup viewGroup = this.f44754f;
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
    }

    public final void z() {
        Context context = getContext();
        int i13 = b.color_themed_background_elevation_floating;
        Object obj = a.f53679a;
        setBackgroundColor(context.getColor(i13));
        View findViewById = findViewById(d.modal_container);
        ((ScrollView) findViewById).setVisibility(0);
        this.f44754f = (ViewGroup) findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalViewWrapper(Context context, boolean z13) {
        super(context, z13);
        Intrinsics.checkNotNullParameter(context, "context");
        z();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalViewWrapper(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        z();
    }
}
