package oj;

import android.util.Property;

/* loaded from: classes3.dex */
public final class e extends Property {

    /* renamed from: a, reason: collision with root package name */
    public static final e f95353a = new e(Integer.class, "circularRevealScrimColor");

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Integer.valueOf(((g) obj).g());
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((g) obj).n(((Integer) obj2).intValue());
    }
}
