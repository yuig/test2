package e2;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* loaded from: classes2.dex */
public final class i0 extends RippleDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f56869a;

    /* renamed from: b, reason: collision with root package name */
    public b3.w f56870b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f56871c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f56872d;

    public i0(boolean z13) {
        super(ColorStateList.valueOf(-16777216), null, z13 ? new ColorDrawable(-1) : null);
        this.f56869a = z13;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f56869a) {
            this.f56872d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f56872d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f56872d;
    }
}
