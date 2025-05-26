package com.pinterest.ui.imageview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ao2.m0;
import bb2.j;
import hs1.c;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qy.a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/ui/imageview/WebImageViewContainer;", "Landroid/widget/FrameLayout;", "Lbb2/j;", "Lqy/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "images_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class WebImageViewContainer extends FrameLayout implements j, a {

    /* renamed from: a, reason: collision with root package name */
    public final j f52577a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f52578b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebImageViewContainer(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52578b = true;
        GlideWebImageView glideWebImageView = new GlideWebImageView(context);
        Intrinsics.checkNotNullParameter(glideWebImageView, "<set-?>");
        this.f52577a = glideWebImageView;
        addView((View) b());
    }

    @Override // bb2.j
    public final void F0(int i13) {
        b().F0(i13);
    }

    @Override // bb2.j
    public final void H0(int i13, int i14) {
        b().H0(i13, i14);
    }

    @Override // eo.d
    public final void K1(Drawable drawable) {
        b().K1(drawable);
    }

    @Override // eo.d
    public final void M1(int i13) {
        b().M1(i13);
    }

    @Override // bb2.j
    public final boolean O1() {
        return b().O1();
    }

    @Override // bb2.j
    public final void P0(File file, int i13, int i14) {
        b().P0(file, i13, i14);
    }

    @Override // eo.d
    public final void U1(int i13) {
        b().U1(i13);
    }

    @Override // bb2.j
    public final void V1(String str, boolean z13, Bitmap.Config config, int i13, int i14, Drawable drawable, String str2, Map map) {
        b().V1(str, z13, config, i13, i14, drawable, str2, map);
    }

    @Override // bb2.j
    public final void Y(c cVar) {
        b().Y(cVar);
    }

    @Override // bb2.j
    /* renamed from: a */
    public final String getF52563o() {
        return b().getF52563o();
    }

    @Override // eo.d
    public final void a2(boolean z13) {
        b().a2(true);
    }

    public final j b() {
        j jVar = this.f52577a;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.r("webImage");
        throw null;
    }

    @Override // eo.d
    public final void b2(float f13) {
        b().b2(f13);
    }

    public void clear() {
        b().clear();
    }

    @Override // qy.a
    public final String coexistId() {
        String f52563o = getF52563o();
        return f52563o == null ? "" : f52563o;
    }

    @Override // android.view.View, eo.d
    public final Drawable getBackground() {
        return this.f52577a != null ? b().getBackground() : super.getBackground();
    }

    @Override // eo.d
    public final Drawable getDrawable() {
        Drawable drawable = b().getDrawable();
        Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
        return drawable;
    }

    @Override // qy.a
    public final int getPWTImageHeight() {
        return getHeight();
    }

    @Override // qy.a
    public final int getPWTImageWidth() {
        return getWidth();
    }

    @Override // qy.a
    public final int getPWTImageX() {
        if (!m0.f20172b || m0.f20173c) {
            return (int) getX();
        }
        return 0;
    }

    @Override // qy.a
    public final int getPWTImageY() {
        if (!m0.f20172b || m0.f20173c) {
            return (int) getY();
        }
        return 0;
    }

    @Override // qy.a
    /* renamed from: getShouldTrackPWT, reason: from getter */
    public final boolean getH() {
        return this.f52578b;
    }

    @Override // qy.a
    public final boolean isPWTImageDrawn() {
        return O1();
    }

    @Override // bb2.j
    public final int k0() {
        return b().k0();
    }

    @Override // bb2.j
    public final void loadUrl(String str) {
        b().loadUrl(str);
    }

    @Override // eo.d
    public final void o0(int i13) {
        b().o0(i13);
    }

    @Override // android.view.View, eo.d
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        b().onDraw(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return super.onTouchEvent(event);
    }

    @Override // android.view.View, eo.d
    public final void setBackground(Drawable drawable) {
        if (this.f52577a != null) {
            b().setBackground(drawable);
        }
    }

    @Override // android.view.View, eo.d
    public final void setBackgroundColor(int i13) {
        if (this.f52577a != null) {
            b().setBackgroundColor(i13);
        }
    }

    @Override // android.view.View, eo.d
    public final void setBackgroundDrawable(Drawable drawable) {
        if (this.f52577a != null) {
            b().setBackgroundDrawable(drawable);
        }
    }

    @Override // eo.d
    public final void setColorFilter(int i13) {
        b().setColorFilter(i13);
    }

    @Override // eo.d
    public final void setImageBitmap(Bitmap bitmap) {
        b().setImageBitmap(bitmap);
    }

    @Override // eo.d
    public final void setImageDrawable(Drawable drawable) {
        b().setImageDrawable(drawable);
    }

    @Override // eo.d
    public final void setScaleType(ImageView.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        b().setScaleType(scaleType);
    }

    @Override // android.view.View, eo.d
    public final void setVisibility(int i13) {
        b().setVisibility(i13);
        super.setVisibility(i13);
    }

    @Override // bb2.j
    public final void w1() {
        b().w1();
    }

    @Override // bb2.j
    /* renamed from: z0 */
    public final Bitmap getC() {
        return b().getC();
    }

    @Override // bb2.j
    public final int z1() {
        return b().z1();
    }

    @Override // eo.d
    public final void setColorFilter(ColorFilter colorFilter) {
        b().setColorFilter(colorFilter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebImageViewContainer(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52578b = true;
        GlideWebImageView glideWebImageView = new GlideWebImageView(context, attributeSet);
        Intrinsics.checkNotNullParameter(glideWebImageView, "<set-?>");
        this.f52577a = glideWebImageView;
        addView((View) b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebImageViewContainer(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52578b = true;
        GlideWebImageView glideWebImageView = new GlideWebImageView(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(glideWebImageView, "<set-?>");
        this.f52577a = glideWebImageView;
        addView((View) b());
    }
}
