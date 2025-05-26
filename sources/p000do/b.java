package p000do;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.internal.measurement.c1;
import ir.a0;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import oi.o6;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f55641l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final w6.b f55642a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f55643b;

    /* renamed from: f, reason: collision with root package name */
    public final c f55647f;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f55644c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f55645d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f55646e = new WeakHashMap();

    /* renamed from: g, reason: collision with root package name */
    public int f55648g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f55649h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f55650i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f55651j = true;

    /* renamed from: k, reason: collision with root package name */
    public volatile CountDownLatch f55652k = null;

    public b(Context context, ExecutorService executorService, a0 a0Var) {
        this.f55647f = a0Var;
        this.f55643b = executorService;
        this.f55642a = new w6.b(context, executorService);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c1(this));
        context.getSharedPreferences("do.b", 0).edit().clear().apply();
    }

    public final void a(String str) {
        this.f55645d.remove(str);
        this.f55643b.execute(new o6(7, this, str));
    }
}
