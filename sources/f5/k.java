package f5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class k extends o {

    /* renamed from: b */
    public static Class f61093b = null;

    /* renamed from: c */
    public static Constructor f61094c = null;

    /* renamed from: d */
    public static Method f61095d = null;

    /* renamed from: e */
    public static Method f61096e = null;

    /* renamed from: f */
    public static boolean f61097f = false;

    public static boolean h(int i13, Object obj, String str, boolean z13) {
        i();
        try {
            return ((Boolean) f61095d.invoke(obj, str, Integer.valueOf(i13), Boolean.valueOf(z13))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    public static void i() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f61097f) {
            return;
        }
        f61097f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e13) {
            Log.e("TypefaceCompatApi21Impl", e13.getClass().getName(), e13);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f61094c = constructor;
        f61093b = cls;
        f61095d = method2;
        f61096e = method;
    }

    @Override // f5.o
    public Typeface a(Context context, e5.f fVar, Resources resources, int i13) {
        i();
        try {
            Object newInstance = f61094c.newInstance(new Object[0]);
            for (e5.g gVar : fVar.f57218a) {
                File y13 = b7.c.y(context);
                if (y13 == null) {
                    return null;
                }
                try {
                    if (!b7.c.n(y13, resources, gVar.f57224f)) {
                        return null;
                    }
                    if (!h(gVar.f57220b, newInstance, y13.getPath(), gVar.f57221c)) {
                        return null;
                    }
                    y13.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    y13.delete();
                }
            }
            i();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f61093b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f61096e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e13) {
                throw new RuntimeException(e13);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e14) {
            throw new RuntimeException(e14);
        }
    }
}
