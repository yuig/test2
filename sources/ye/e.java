package ye;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import com.airbnb.lottie.k;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public static final me.f f138829d = new me.f(17, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f138830e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f138831a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f138832b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f138833c = new AtomicBoolean(false);

    public e(Activity activity) {
        this.f138831a = new WeakReference(activity);
    }

    public final void a() {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            k kVar = new k(this, 10);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                kVar.run();
            } else {
                this.f138832b.post(kVar);
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            a();
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
