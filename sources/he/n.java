package he;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f68959a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f68960b = new char[64];

    /* renamed from: c, reason: collision with root package name */
    public static volatile Handler f68961c;

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int d(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i13 = m.f68958a[config.ordinal()];
        if (i13 == 1) {
            return 1;
        }
        if (i13 == 2 || i13 == 3) {
            return 2;
        }
        return i13 != 4 ? 4 : 8;
    }

    public static ArrayList e(Set set) {
        ArrayList arrayList = new ArrayList(set.size());
        for (Object obj : set) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler f() {
        if (f68961c == null) {
            synchronized (n.class) {
                try {
                    if (f68961c == null) {
                        f68961c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f68961c;
    }

    public static int g(int i13, int i14) {
        return (i14 * 31) + i13;
    }

    public static int h(int i13, Object obj) {
        return g(obj == null ? 0 : obj.hashCode(), i13);
    }

    public static int i(int i13, boolean z13) {
        return g(z13 ? 1 : 0, i13);
    }

    public static boolean j(int i13, int i14) {
        return (i13 > 0 || i13 == Integer.MIN_VALUE) && (i14 > 0 || i14 == Integer.MIN_VALUE);
    }
}
