package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class e extends so.a {

    /* renamed from: b, reason: collision with root package name */
    public final Object f92740b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f92741c = Executors.newFixedThreadPool(4, new c(this));

    /* renamed from: d, reason: collision with root package name */
    public volatile Handler f92742d;

    public static Handler l(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
