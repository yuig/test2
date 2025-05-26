package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;

/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a */
    public static final int[] f32751a = {fj.c.colorPrimary};

    /* renamed from: b */
    public static final int[] f32752b = {fj.c.colorPrimaryVariant};

    public static void a(Context context, AttributeSet attributeSet, int i13, int i14) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fj.m.ThemeEnforcement, i13, i14);
        boolean z13 = obtainStyledAttributes.getBoolean(fj.m.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z13) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(fj.c.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                b(context);
            }
        }
        d(context, f32751a, "Theme.AppCompat");
    }

    public static void b(Context context) {
        d(context, f32752b, "Theme.MaterialComponents");
    }

    public static void c(Context context, AttributeSet attributeSet, int[] iArr, int i13, int i14, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fj.m.ThemeEnforcement, i13, i14);
        boolean z13 = false;
        if (!obtainStyledAttributes.getBoolean(fj.m.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            z13 = e(context, attributeSet, iArr, i13, i14, iArr2);
        } else if (obtainStyledAttributes.getResourceId(fj.m.ThemeEnforcement_android_textAppearance, -1) != -1) {
            z13 = true;
        }
        obtainStyledAttributes.recycle();
        if (!z13) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void d(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i13 = 0; i13 < iArr.length; i13++) {
            if (!obtainStyledAttributes.hasValue(i13)) {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException(a.a.k("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static boolean e(Context context, AttributeSet attributeSet, int[] iArr, int i13, int i14, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i13, i14);
        for (int i15 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i15, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static TypedArray f(Context context, AttributeSet attributeSet, int[] iArr, int i13, int i14, int... iArr2) {
        a(context, attributeSet, i13, i14);
        c(context, attributeSet, iArr, i13, i14, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i13, i14);
    }

    public static x92.b g(Context context, AttributeSet attributeSet, int[] iArr, int i13, int i14, int... iArr2) {
        a(context, attributeSet, i13, i14);
        c(context, attributeSet, iArr, i13, i14, iArr2);
        return new x92.b(1, context, context.obtainStyledAttributes(attributeSet, iArr, i13, i14));
    }
}
