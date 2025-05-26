package androidx.appcompat.widget;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f16547a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f16548b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f16549c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f16550d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f16547a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f16548b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f16549c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f16550d = true;
        } catch (NoSuchMethodException e13) {
            e13.printStackTrace();
        }
    }
}
