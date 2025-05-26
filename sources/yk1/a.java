package yk1;

import android.content.res.Resources;
import android.util.TypedValue;

/* loaded from: classes2.dex */
public final class a implements v {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f139224a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f139225b;

    public a(Resources resources, Resources.Theme theme) {
        this.f139224a = resources;
        this.f139225b = theme;
    }

    public final int a(int i13) {
        TypedValue typedValue = new TypedValue();
        this.f139225b.resolveAttribute(i13, typedValue, true);
        return TypedValue.complexToDimensionPixelSize(typedValue.data, this.f139224a.getDisplayMetrics());
    }
}
