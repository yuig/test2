package androidx.appcompat.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f16508a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f16509b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f16510c;

    /* renamed from: d, reason: collision with root package name */
    public static final Field f16511d;

    /* renamed from: e, reason: collision with root package name */
    public static final Field f16512e;

    /* renamed from: f, reason: collision with root package name */
    public static final Field f16513f;

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    static {
        /*
            r0 = 1
            r1 = 0
            r2 = 0
            java.lang.String r3 = "android.graphics.Insets"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L41 java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L47
            java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
            java.lang.String r5 = "getOpticalInsets"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchFieldException -> L41 java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L47
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L41 java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L47
            java.lang.String r5 = "left"
            java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L38 java.lang.ClassNotFoundException -> L3b java.lang.NoSuchMethodException -> L3e
            java.lang.String r6 = "top"
            java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L31 java.lang.ClassNotFoundException -> L34 java.lang.NoSuchMethodException -> L36
            java.lang.String r7 = "right"
            java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = "bottom"
            java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L4a
            r8 = r0
            goto L4c
        L2f:
            r7 = r1
            goto L4a
        L31:
            r6 = r1
        L32:
            r7 = r6
            goto L4a
        L34:
            r6 = r1
            goto L32
        L36:
            r6 = r1
            goto L32
        L38:
            r5 = r1
        L39:
            r6 = r5
            goto L32
        L3b:
            r5 = r1
        L3c:
            r6 = r5
            goto L32
        L3e:
            r5 = r1
        L3f:
            r6 = r5
            goto L32
        L41:
            r4 = r1
            r5 = r4
            goto L39
        L44:
            r4 = r1
            r5 = r4
            goto L3c
        L47:
            r4 = r1
            r5 = r4
            goto L3f
        L4a:
            r3 = r1
            r8 = r2
        L4c:
            if (r8 == 0) goto L5b
            androidx.appcompat.widget.a1.f16509b = r4
            androidx.appcompat.widget.a1.f16510c = r5
            androidx.appcompat.widget.a1.f16511d = r6
            androidx.appcompat.widget.a1.f16512e = r7
            androidx.appcompat.widget.a1.f16513f = r3
            androidx.appcompat.widget.a1.f16508a = r0
            goto L67
        L5b:
            androidx.appcompat.widget.a1.f16509b = r1
            androidx.appcompat.widget.a1.f16510c = r1
            androidx.appcompat.widget.a1.f16511d = r1
            androidx.appcompat.widget.a1.f16512e = r1
            androidx.appcompat.widget.a1.f16513f = r1
            androidx.appcompat.widget.a1.f16508a = r2
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a1.<clinit>():void");
    }

    public static Rect a(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29 && f16508a) {
            try {
                Object invoke = f16509b.invoke(drawable, new Object[0]);
                if (invoke != null) {
                    return new Rect(f16510c.getInt(invoke), f16511d.getInt(invoke), f16512e.getInt(invoke), f16513f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return c1.f16529c;
    }
}
