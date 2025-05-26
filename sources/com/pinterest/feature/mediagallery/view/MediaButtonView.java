package com.pinterest.feature.mediagallery.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import d5.a;
import eo1.b;
import eo1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pw0.o;
import pw0.p;
import xk2.m;
import xk2.v;
import xo0.i;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/mediagallery/view/MediaButtonView;", "Landroid/widget/FrameLayout;", "Lpw0/p;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mediaGallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MediaButtonView extends FrameLayout implements p {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f46728f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final float f46729a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f46730b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f46731c;

    /* renamed from: d, reason: collision with root package name */
    public final v f46732d;

    /* renamed from: e, reason: collision with root package name */
    public o f46733e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.f46730b, this.f46731c);
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i13);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        RectF rectF = new RectF(0.0f, 0.0f, i13, i14);
        Path path = this.f46730b;
        path.reset();
        float f13 = this.f46729a;
        path.addRoundRect(rectF, f13, f13, Path.Direction.CW);
        path.close();
    }

    public /* synthetic */ MediaButtonView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaButtonView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46729a = getResources().getDimensionPixelSize(c.corner_radius);
        this.f46730b = new Path();
        Paint paint = new Paint();
        int i14 = b.color_themed_light_gray;
        Object obj = a.f53679a;
        paint.setColor(context.getColor(i14));
        this.f46731c = paint;
        v b13 = m.b(new i(context, 24));
        this.f46732d = b13;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView((ImageView) b13.getValue());
    }
}
