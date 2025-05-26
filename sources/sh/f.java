package sh;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import e5.n;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import nx.c1;
import nx.d0;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f112906a;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f112907b;

    /* renamed from: c, reason: collision with root package name */
    public static d0 f112908c;

    /* renamed from: d, reason: collision with root package name */
    public static f0 f112909d;

    /* renamed from: e, reason: collision with root package name */
    public static bk.f f112910e;

    public static d0 a() {
        if (f112908c == null) {
            f112908c = c1.a();
        }
        return f112908c;
    }

    public static Drawable b(int i13, Context context, Drawable drawable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        int t13 = b7.c.t(context, i13, 0);
        if (t13 == 0) {
            return drawable;
        }
        Drawable mutate = drawable.mutate();
        Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
        mutate.setTint(t13);
        return mutate;
    }

    public static Drawable c(Context context, int i13, int i14) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = n.f57243a;
        Drawable drawable = resources.getDrawable(i13, theme);
        if (drawable == null) {
            return null;
        }
        return b(i14, context, drawable);
    }

    public static Drawable d(int i13, Context context, Drawable drawable) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (drawable == null) {
            return null;
        }
        if (i13 == 0) {
            int i14 = df0.a.f54892a;
            Object obj = d5.a.f53679a;
            i13 = context.getColor(i14);
        }
        Drawable mutate = drawable.mutate();
        mutate.setTint(i13);
        return mutate;
    }

    public static Drawable e(int i13, Context context, Drawable drawable) {
        int color;
        Intrinsics.checkNotNullParameter(context, "context");
        if (drawable == null) {
            return null;
        }
        if (i13 == 0) {
            int i14 = df0.a.f54892a;
            Object obj = d5.a.f53679a;
            color = context.getColor(i14);
        } else {
            Object obj2 = d5.a.f53679a;
            color = context.getColor(i13);
        }
        return d(color, context, drawable);
    }

    public static Drawable f(Context context, int i13, int i14) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object obj = d5.a.f53679a;
        return e(i14, context, context.getDrawable(i13));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a1, code lost:
    
        if (r1 == null) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.lang.ClassLoader g() {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.f.g():java.lang.ClassLoader");
    }
}
