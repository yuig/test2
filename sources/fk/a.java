package fk;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import fj.c;
import m.e;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f62272a = {R.attr.theme, c.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f62273b = {c.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i13, int i14) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f62273b, i13, i14);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z13 = (context instanceof e) && ((e) context).f85184a == resourceId;
        if (resourceId == 0 || z13) {
            return context;
        }
        e eVar = new e(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f62272a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            eVar.getTheme().applyStyle(resourceId2, true);
        }
        return eVar;
    }
}
