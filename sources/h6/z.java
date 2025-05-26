package h6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class z implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f67767a;

    /* renamed from: b, reason: collision with root package name */
    public final m5.c f67768b;

    /* renamed from: c, reason: collision with root package name */
    public final e3.b f67769c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f67770d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f67771e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f67772f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f67773g;

    /* renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.d f67774h;

    /* renamed from: i, reason: collision with root package name */
    public y f67775i;

    public z(Context context, m5.c cVar) {
        e3.b bVar = a0.f67700d;
        this.f67770d = new Object();
        com.bumptech.glide.d.s(context, "Context cannot be null");
        this.f67767a = context.getApplicationContext();
        this.f67768b = cVar;
        this.f67769c = bVar;
    }

    @Override // h6.l
    public final void a(com.bumptech.glide.d dVar) {
        synchronized (this.f67770d) {
            this.f67774h = dVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.f67770d) {
            try {
                this.f67774h = null;
                y yVar = this.f67775i;
                if (yVar != null) {
                    e3.b bVar = this.f67769c;
                    Context context = this.f67767a;
                    bVar.getClass();
                    context.getContentResolver().unregisterContentObserver(yVar);
                    this.f67775i = null;
                }
                Handler handler = this.f67771e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f67771e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f67773g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f67772f = null;
                this.f67773g = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c() {
        synchronized (this.f67770d) {
            try {
                if (this.f67774h == null) {
                    return;
                }
                if (this.f67772f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f67773g = threadPoolExecutor;
                    this.f67772f = threadPoolExecutor;
                }
                this.f67772f.execute(new androidx.activity.d(this, 5));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final m5.g d() {
        try {
            e3.b bVar = this.f67769c;
            Context context = this.f67767a;
            m5.c cVar = this.f67768b;
            bVar.getClass();
            Object[] objArr = {cVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            ck2.a a13 = m5.b.a(context, Collections.unmodifiableList(arrayList));
            if (a13.f27913a != 0) {
                throw new RuntimeException(a.a.n(new StringBuilder("fetchFonts failed ("), a13.f27913a, ")"));
            }
            m5.g[] gVarArr = (m5.g[]) ((List) a13.f27914b).get(0);
            if (gVarArr == null || gVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return gVarArr[0];
        } catch (PackageManager.NameNotFoundException e13) {
            throw new RuntimeException("provider not found", e13);
        }
    }
}
