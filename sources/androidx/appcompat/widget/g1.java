package androidx.appcompat.widget;

import android.graphics.Canvas;

/* loaded from: classes2.dex */
public final class g1 extends j.c {

    /* renamed from: b, reason: collision with root package name */
    public boolean f16568b;

    @Override // j.c, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f16568b) {
            super.draw(canvas);
        }
    }

    @Override // j.c, android.graphics.drawable.Drawable
    public final void setHotspot(float f13, float f14) {
        if (this.f16568b) {
            super.setHotspot(f13, f14);
        }
    }

    @Override // j.c, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i13, int i14, int i15, int i16) {
        if (this.f16568b) {
            super.setHotspotBounds(i13, i14, i15, i16);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f16568b) {
            return this.f73947a.setState(iArr);
        }
        return false;
    }

    @Override // j.c, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z13, boolean z14) {
        if (this.f16568b) {
            return super.setVisible(z13, z14);
        }
        return false;
    }
}
