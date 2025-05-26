package f5;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class l extends k {

    /* renamed from: g, reason: collision with root package name */
    public final Class f61098g;

    /* renamed from: h, reason: collision with root package name */
    public final Constructor f61099h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f61100i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f61101j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f61102k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f61103l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f61104m;

    public l() {
        super(0);
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = p(cls);
            Class cls2 = Integer.TYPE;
            method3 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = q(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e13) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e13.getClass().getName()), e13);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f61098g = cls;
        this.f61099h = constructor;
        this.f61100i = method2;
        this.f61101j = method3;
        this.f61102k = method4;
        this.f61103l = method;
        this.f61104m = method5;
    }

    public static Method p(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // f5.k, f5.o
    public final Typeface a(Context context, e5.f fVar, Resources resources, int i13) {
        if (!n()) {
            return super.a(context, fVar, resources, i13);
        }
        Object o13 = o();
        if (o13 == null) {
            return null;
        }
        for (e5.g gVar : fVar.f57218a) {
            if (!k(context, o13, gVar.f57219a, gVar.f57223e, gVar.f57220b, gVar.f57221c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f57222d))) {
                j(o13);
                return null;
            }
        }
        if (m(o13)) {
            return l(o13);
        }
        return null;
    }

    @Override // f5.o
    public final Typeface b(Context context, m5.g[] gVarArr, int i13) {
        Typeface l13;
        if (gVarArr.length < 1) {
            return null;
        }
        if (!n()) {
            m5.g g13 = g(i13, gVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g13.f85855a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(g13.f85857c).setItalic(g13.f85858d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (m5.g gVar : gVarArr) {
            if (gVar.f85859e == 0) {
                Uri uri = gVar.f85855a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, b7.c.I(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object o13 = o();
        if (o13 == null) {
            return null;
        }
        int length = gVarArr.length;
        int i14 = 0;
        boolean z13 = false;
        while (i14 < length) {
            m5.g gVar2 = gVarArr[i14];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(gVar2.f85855a);
            if (byteBuffer != null) {
                if (!((Boolean) this.f61101j.invoke(o13, byteBuffer, Integer.valueOf(gVar2.f85856b), null, Integer.valueOf(gVar2.f85857c), Integer.valueOf(gVar2.f85858d ? 1 : 0))).booleanValue()) {
                    j(o13);
                    return null;
                }
                z13 = true;
            }
            i14++;
            z13 = z13;
        }
        if (!z13) {
            j(o13);
            return null;
        }
        if (m(o13) && (l13 = l(o13)) != null) {
            return Typeface.create(l13, i13);
        }
        return null;
    }

    @Override // f5.o
    public final Typeface e(Context context, Resources resources, int i13, String str, int i14) {
        if (!n()) {
            return super.e(context, resources, i13, str, i14);
        }
        Object o13 = o();
        if (o13 == null) {
            return null;
        }
        if (!k(context, o13, str, 0, -1, -1, null)) {
            j(o13);
            return null;
        }
        if (m(o13)) {
            return l(o13);
        }
        return null;
    }

    public final void j(Object obj) {
        try {
            this.f61103l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean k(Context context, Object obj, String str, int i13, int i14, int i15, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f61100i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f61098g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f61104m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean m(Object obj) {
        try {
            return ((Boolean) this.f61102k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean n() {
        Method method = this.f61100i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object o() {
        try {
            return this.f61099h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method q(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
