package jh;

import android.content.Context;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k0 extends i {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f76172d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Context f76173e;

    /* renamed from: f, reason: collision with root package name */
    public volatile bi.f f76174f;

    /* renamed from: g, reason: collision with root package name */
    public final nh.a f76175g;

    /* renamed from: h, reason: collision with root package name */
    public final long f76176h;

    /* renamed from: i, reason: collision with root package name */
    public final long f76177i;

    /* renamed from: j, reason: collision with root package name */
    public volatile Executor f76178j;

    public k0(Context context, Looper looper) {
        hh.e eVar = new hh.e(this);
        this.f76173e = context.getApplicationContext();
        this.f76174f = new bi.f(looper, eVar, 1);
        this.f76175g = nh.a.b();
        this.f76176h = 5000L;
        this.f76177i = 300000L;
        this.f76178j = null;
    }

    @Override // jh.i
    public final boolean c(i0 i0Var, f0 f0Var, String str, Executor executor) {
        boolean z13;
        synchronized (this.f76172d) {
            try {
                j0 j0Var = (j0) this.f76172d.get(i0Var);
                if (executor == null) {
                    executor = this.f76178j;
                }
                if (j0Var == null) {
                    j0Var = new j0(this, i0Var);
                    j0Var.f76165a.put(f0Var, f0Var);
                    j0Var.a(str, executor);
                    this.f76172d.put(i0Var, j0Var);
                } else {
                    this.f76174f.removeMessages(0, i0Var);
                    if (j0Var.f76165a.containsKey(f0Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(i0Var.toString()));
                    }
                    j0Var.f76165a.put(f0Var, f0Var);
                    int i13 = j0Var.f76166b;
                    if (i13 == 1) {
                        f0Var.onServiceConnected(j0Var.f76170f, j0Var.f76168d);
                    } else if (i13 == 2) {
                        j0Var.a(str, executor);
                    }
                }
                z13 = j0Var.f76167c;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z13;
    }
}
