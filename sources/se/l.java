package se;

import a7.h1;
import a7.i1;
import android.content.Context;
import ja.a0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import pk.c1;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a */
    public static int f112378a;

    public static final a0 a(Context context, Class klass, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (true ^ (str == null || z.j(str))) {
            return new a0(context, klass, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    public static final Class b(String className) {
        if (p001if.a.b(l.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(className, "className");
            try {
                return Class.forName(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th3) {
            p001if.a.a(l.class, th3);
            return null;
        }
    }

    public static final Method c(Class clazz, String methodName, Class... args) {
        if (p001if.a.b(l.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                return clazz.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th3) {
            p001if.a.a(l.class, th3);
            return null;
        }
    }

    public static final Method d(Class clazz, String methodName, Class... args) {
        if (p001if.a.b(l.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th3) {
            p001if.a.a(l.class, th3);
            return null;
        }
    }

    public static androidx.media3.common.b e(i1 tracks) {
        int i13;
        Object obj;
        Integer num;
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        c1 c1Var = tracks.f1079a;
        Intrinsics.checkNotNullExpressionValue(c1Var, "getGroups(...)");
        Iterator<E> it = c1Var.iterator();
        while (true) {
            i13 = 0;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            h1 h1Var = (h1) obj;
            int i14 = 0;
            while (true) {
                int[] iArr = h1Var.f1064d;
                if (i14 >= iArr.length) {
                    break;
                }
                if (iArr[i14] != 4) {
                    i14++;
                } else if (h1Var.f1062b.f966c == 2) {
                    break;
                }
            }
        }
        h1 h1Var2 = (h1) obj;
        if (h1Var2 == null) {
            return null;
        }
        while (true) {
            if (i13 >= h1Var2.f1061a) {
                num = null;
                break;
            }
            if (h1Var2.f1065e[i13]) {
                num = Integer.valueOf(i13);
                break;
            }
            i13++;
        }
        if (num != null) {
            return h1Var2.a(num.intValue());
        }
        return null;
    }

    public static void f(i1 tracks) {
        Integer num;
        int i13;
        Object obj;
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        if (tracks.f1079a.isEmpty()) {
            return;
        }
        c1 c1Var = tracks.f1079a;
        Intrinsics.checkNotNullExpressionValue(c1Var, "getGroups(...)");
        Iterator<E> it = c1Var.iterator();
        while (true) {
            num = null;
            i13 = 0;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            h1 h1Var = (h1) obj;
            int i14 = 0;
            while (true) {
                int[] iArr = h1Var.f1064d;
                if (i14 >= iArr.length) {
                    break;
                }
                if (iArr[i14] != 4) {
                    i14++;
                } else if (h1Var.f1062b.f966c == 2) {
                    break;
                }
            }
        }
        h1 h1Var2 = (h1) obj;
        if (h1Var2 == null) {
            return;
        }
        while (true) {
            if (i13 >= h1Var2.f1061a) {
                break;
            }
            if (h1Var2.f1065e[i13]) {
                num = Integer.valueOf(i13);
                break;
            }
            i13++;
        }
        if (num == null) {
            return;
        }
        androidx.media3.common.b a13 = h1Var2.a(num.intValue());
        Intrinsics.checkNotNullExpressionValue(a13, "getTrackFormat(...)");
        String str = a13.f18751a;
    }

    public static nc2.i g(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!StringsKt.E(url, "h265", false) && !StringsKt.E(url, "hevcMp4", false)) {
            if (!StringsKt.E(url, "expMp4", false) && !z.h(url, ".m3u8", false) && !StringsKt.E(url, "720p", false)) {
                return StringsKt.E(url, "ihthevc", false) ? nc2.i.HEVC : StringsKt.E(url, "ihtavc", false) ? nc2.i.AVC : StringsKt.E(url, "ihtvp-mb", false) ? nc2.i.HEVC : nc2.i.UNKNOWN;
            }
            return nc2.i.AVC;
        }
        return nc2.i.HEVC;
    }

    public static final Object h(Class clazz, Object obj, Method method, Object... args) {
        if (p001if.a.b(l.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(args, "args");
            if (obj != null) {
                obj = clazz.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(args, args.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th3) {
            p001if.a.a(l.class, th3);
            return null;
        }
    }

    public static final boolean i() {
        return Intrinsics.d(null, Boolean.TRUE);
    }
}
