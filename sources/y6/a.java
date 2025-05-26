package y6;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.j;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static Handler f137891f;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f137896e;

    /* renamed from: b, reason: collision with root package name */
    public volatile g f137893b = g.PENDING;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f137894c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f137895d = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final e f137892a = new e(this, new d(this, 0));

    public a(b bVar) {
        this.f137896e = bVar;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f137891f == null) {
                    f137891f = new Handler(Looper.getMainLooper());
                }
                handler = f137891f;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        handler.post(new j(8, this, obj));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f137896e.b();
    }
}
