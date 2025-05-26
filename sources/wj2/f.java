package wj2;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import uj2.a0;
import uj2.z;

/* loaded from: classes2.dex */
public final class f extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final Handler f130041c;

    public f(Handler handler) {
        this.f130041c = handler;
    }

    @Override // uj2.a0
    public final z a() {
        return new d(this.f130041c, false);
    }

    @Override // uj2.a0
    public final xj2.c c(Runnable runnable, long j13, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.f130041c;
        e eVar = new e(handler, runnable);
        handler.sendMessageDelayed(Message.obtain(handler, eVar), timeUnit.toMillis(j13));
        return eVar;
    }
}
