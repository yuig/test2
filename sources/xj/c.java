package xj;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.d0;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f135074a;

    /* renamed from: b, reason: collision with root package name */
    public final int f135075b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f135076c;

    /* renamed from: d, reason: collision with root package name */
    public final int f135077d;

    /* renamed from: e, reason: collision with root package name */
    public final int f135078e;

    /* renamed from: f, reason: collision with root package name */
    public final int f135079f;

    /* renamed from: g, reason: collision with root package name */
    public final int f135080g;

    public c(Context context, AttributeSet attributeSet, int i13, int i14) {
        this.f135076c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(fj.e.mtrl_progress_track_thickness);
        int[] iArr = fj.m.BaseProgressIndicator;
        d0.a(context, attributeSet, i13, i14);
        d0.c(context, attributeSet, iArr, i13, i14, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i13, i14);
        int J2 = com.bumptech.glide.d.J(context, obtainStyledAttributes, fj.m.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.f135074a = J2;
        this.f135075b = Math.min(com.bumptech.glide.d.J(context, obtainStyledAttributes, fj.m.BaseProgressIndicator_trackCornerRadius, 0), J2 / 2);
        this.f135078e = obtainStyledAttributes.getInt(fj.m.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f135079f = obtainStyledAttributes.getInt(fj.m.BaseProgressIndicator_hideAnimationBehavior, 0);
        this.f135080g = obtainStyledAttributes.getDimensionPixelSize(fj.m.BaseProgressIndicator_indicatorTrackGapSize, 0);
        if (!obtainStyledAttributes.hasValue(fj.m.BaseProgressIndicator_indicatorColor)) {
            this.f135076c = new int[]{b7.c.t(context, fj.c.colorPrimary, -1)};
        } else if (obtainStyledAttributes.peekValue(fj.m.BaseProgressIndicator_indicatorColor).type != 1) {
            this.f135076c = new int[]{obtainStyledAttributes.getColor(fj.m.BaseProgressIndicator_indicatorColor, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(obtainStyledAttributes.getResourceId(fj.m.BaseProgressIndicator_indicatorColor, -1));
            this.f135076c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (obtainStyledAttributes.hasValue(fj.m.BaseProgressIndicator_trackColor)) {
            this.f135077d = obtainStyledAttributes.getColor(fj.m.BaseProgressIndicator_trackColor, -1);
        } else {
            this.f135077d = this.f135076c[0];
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
            float f13 = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            this.f135077d = b7.c.m(this.f135077d, (int) (f13 * 255.0f));
        }
        obtainStyledAttributes.recycle();
    }

    public void a() {
        if (this.f135080g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
