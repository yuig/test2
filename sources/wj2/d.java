package wj2;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import uj2.z;

/* loaded from: classes2.dex */
public final class d extends z {

    /* renamed from: a */
    public final Handler f130035a;

    /* renamed from: b */
    public final boolean f130036b;

    /* renamed from: c */
    public volatile boolean f130037c;

    public d(Handler handler, boolean z13) {
        this.f130035a = handler;
        this.f130036b = z13;
    }

    @Override // uj2.z
    public final xj2.c c(Runnable runnable, long j13, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        if (this.f130037c) {
            return bk2.d.INSTANCE;
        }
        Handler handler = this.f130035a;
        e eVar = new e(handler, runnable);
        Message obtain = Message.obtain(handler, eVar);
        obtain.obj = this;
        if (this.f130036b) {
            obtain.setAsynchronous(true);
        }
        this.f130035a.sendMessageDelayed(obtain, timeUnit.toMillis(j13));
        if (!this.f130037c) {
            return eVar;
        }
        this.f130035a.removeCallbacks(eVar);
        return bk2.d.INSTANCE;
    }

    @Override // xj2.c
    public final void dispose() {
        this.f130037c = true;
        this.f130035a.removeCallbacksAndMessages(this);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f130037c;
    }
}
