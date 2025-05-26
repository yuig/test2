package ua;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* loaded from: classes3.dex */
public abstract class c0 {
    public static <T, V> ObjectAnimator a(T t13, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t13, property, (TypeConverter) null, path);
    }
}
