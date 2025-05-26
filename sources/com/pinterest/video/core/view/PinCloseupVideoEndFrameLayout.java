package com.pinterest.video.core.view;

import a.c;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import d5.a;
import ec2.b;
import ec2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oc2.k;
import org.jetbrains.annotations.NotNull;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/video/core/view/PinCloseupVideoEndFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "video_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PinCloseupVideoEndFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final v f52742a;

    /* renamed from: b, reason: collision with root package name */
    public final v f52743b;

    /* renamed from: c, reason: collision with root package name */
    public final v f52744c;

    /* renamed from: d, reason: collision with root package name */
    public final v f52745d;

    /* renamed from: e, reason: collision with root package name */
    public final v f52746e;

    /* renamed from: f, reason: collision with root package name */
    public final v f52747f;

    /* renamed from: g, reason: collision with root package name */
    public final v f52748g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinCloseupVideoEndFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void setVisibility(int i13) {
        k.a(this, i13, new d(this, 2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCloseupVideoEndFrameLayout(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52742a = c.n(context, 19);
        this.f52743b = c.n(context, 20);
        this.f52744c = m.b(new b(context, this, 2));
        this.f52745d = m.b(new b(context, this, 0));
        this.f52746e = m.b(new b(context, this, 4));
        this.f52747f = m.b(new b(context, this, 3));
        this.f52748g = c.n(context, 18);
        v b13 = m.b(new b(context, this, 1));
        int i14 = eo1.b.color_themed_background_wash_dark;
        Object obj = a.f53679a;
        setBackgroundColor(context.getColor(i14));
        addView((LinearLayout) b13.getValue());
    }
}
