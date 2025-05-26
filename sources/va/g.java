package va;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class g extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f125036a;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i13) {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.setLevel(i13) : super.onLevelChange(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i13) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i13);
        } else {
            super.setChangingConfigurations(i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i13, PorterDuff.Mode mode) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.setColorFilter(i13, mode);
        } else {
            super.setColorFilter(i13, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z13) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.setFilterBitmap(z13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f13, float f14) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.setHotspot(f13, f14);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i13, int i14, int i15, int i16) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.setHotspotBounds(i13, i14, i15, i16);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
