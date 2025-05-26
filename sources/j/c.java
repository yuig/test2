package j;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public abstract class c extends Drawable implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f73947a;

    public c(Drawable drawable) {
        Drawable drawable2 = this.f73947a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f73947a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f73947a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f73947a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f73947a.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f73947a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f73947a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f73947a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f73947a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f73947a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f73947a.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f73947a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f73947a.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f73947a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f73947a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f73947a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f73947a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i13) {
        return this.f73947a.setLevel(i13);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j13) {
        scheduleSelf(runnable, j13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f73947a.setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z13) {
        this.f73947a.setAutoMirrored(z13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i13) {
        this.f73947a.setChangingConfigurations(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f73947a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z13) {
        this.f73947a.setDither(z13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z13) {
        this.f73947a.setFilterBitmap(z13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f13, float f14) {
        this.f73947a.setHotspot(f13, f14);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i13, int i14, int i15, int i16) {
        this.f73947a.setHotspotBounds(i13, i14, i15, i16);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i13) {
        this.f73947a.setTint(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f73947a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f73947a.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z13, boolean z14) {
        return super.setVisible(z13, z14) || this.f73947a.setVisible(z13, z14);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
