package com.pinterest.feature.ideaPinCreation.canvas.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import aq1.b;
import bs1.c;
import com.pinterest.api.model.mo;
import com.pinterest.api.model.so;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lq0.g1;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import xk2.m;
import xk2.v;
import xt0.a;
import yq0.k;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/canvas/view/AspectRatioButton;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AspectRatioButton extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final v f45958a;

    /* renamed from: b, reason: collision with root package name */
    public so f45959b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioButton(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45958a = m.b(new k(this, 29));
        int W = c.W(this, b.idea_pin_aspect_ratio_button_size);
        setLayoutParams(new FrameLayout.LayoutParams(W, W));
        setBackgroundResource(aq1.c.aspect_ratio_button_states);
        addView(a());
    }

    public final GestaltText a() {
        return (GestaltText) this.f45958a.getValue();
    }

    public final void b(so data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f45959b = data;
        if (data instanceof mo) {
            a().i(a.f135894j);
        } else {
            a().i(new g1(25, data, this));
        }
    }

    @Override // android.view.View
    public final void setSelected(boolean z13) {
        super.setSelected(z13);
        if (z13) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (a0.q0(context)) {
                a().i(a.f135895k);
                return;
            } else {
                a().i(a.f135896l);
                return;
            }
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (a0.q0(context2)) {
            a().i(a.f135897m);
        } else {
            a().i(a.f135898n);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45958a = m.b(new k(this, 29));
        int W = c.W(this, b.idea_pin_aspect_ratio_button_size);
        setLayoutParams(new FrameLayout.LayoutParams(W, W));
        setBackgroundResource(aq1.c.aspect_ratio_button_states);
        addView(a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45958a = m.b(new k(this, 29));
        int W = c.W(this, b.idea_pin_aspect_ratio_button_size);
        setLayoutParams(new FrameLayout.LayoutParams(W, W));
        setBackgroundResource(aq1.c.aspect_ratio_button_states);
        addView(a());
    }
}
