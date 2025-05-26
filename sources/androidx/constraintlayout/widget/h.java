package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f17740a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17741b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17742c;

    /* renamed from: d, reason: collision with root package name */
    public final float f17743d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17744e;

    /* renamed from: f, reason: collision with root package name */
    public final p f17745f;

    public h(Context context, XmlResourceParser xmlResourceParser) {
        this.f17740a = Float.NaN;
        this.f17741b = Float.NaN;
        this.f17742c = Float.NaN;
        this.f17743d = Float.NaN;
        this.f17744e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.Variant);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = obtainStyledAttributes.getIndex(i13);
            if (index == s.Variant_constraints) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f17744e);
                this.f17744e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    p pVar = new p();
                    this.f17745f = pVar;
                    pVar.i(context, resourceId);
                }
            } else if (index == s.Variant_region_heightLessThan) {
                this.f17743d = obtainStyledAttributes.getDimension(index, this.f17743d);
            } else if (index == s.Variant_region_heightMoreThan) {
                this.f17741b = obtainStyledAttributes.getDimension(index, this.f17741b);
            } else if (index == s.Variant_region_widthLessThan) {
                this.f17742c = obtainStyledAttributes.getDimension(index, this.f17742c);
            } else if (index == s.Variant_region_widthMoreThan) {
                this.f17740a = obtainStyledAttributes.getDimension(index, this.f17740a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final boolean a(float f13, float f14) {
        float f15 = this.f17740a;
        if (!Float.isNaN(f15) && f13 < f15) {
            return false;
        }
        float f16 = this.f17741b;
        if (!Float.isNaN(f16) && f14 < f16) {
            return false;
        }
        float f17 = this.f17742c;
        if (!Float.isNaN(f17) && f13 > f17) {
            return false;
        }
        float f18 = this.f17743d;
        return Float.isNaN(f18) || f14 <= f18;
    }
}
