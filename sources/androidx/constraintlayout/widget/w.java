package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final float f17865a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17866b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17867c;

    /* renamed from: d, reason: collision with root package name */
    public final float f17868d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17869e;

    public w(Context context, XmlResourceParser xmlResourceParser) {
        this.f17865a = Float.NaN;
        this.f17866b = Float.NaN;
        this.f17867c = Float.NaN;
        this.f17868d = Float.NaN;
        this.f17869e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.Variant);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = obtainStyledAttributes.getIndex(i13);
            if (index == s.Variant_constraints) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f17869e);
                this.f17869e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            } else if (index == s.Variant_region_heightLessThan) {
                this.f17868d = obtainStyledAttributes.getDimension(index, this.f17868d);
            } else if (index == s.Variant_region_heightMoreThan) {
                this.f17866b = obtainStyledAttributes.getDimension(index, this.f17866b);
            } else if (index == s.Variant_region_widthLessThan) {
                this.f17867c = obtainStyledAttributes.getDimension(index, this.f17867c);
            } else if (index == s.Variant_region_widthMoreThan) {
                this.f17865a = obtainStyledAttributes.getDimension(index, this.f17865a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final boolean a(float f13, float f14) {
        float f15 = this.f17865a;
        if (!Float.isNaN(f15) && f13 < f15) {
            return false;
        }
        float f16 = this.f17866b;
        if (!Float.isNaN(f16) && f14 < f16) {
            return false;
        }
        float f17 = this.f17867c;
        if (!Float.isNaN(f17) && f13 > f17) {
            return false;
        }
        float f18 = this.f17868d;
        return Float.isNaN(f18) || f14 <= f18;
    }
}
