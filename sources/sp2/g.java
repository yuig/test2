package sp2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import org.greenrobot.eventbus.EventBusException;

/* loaded from: classes2.dex */
public final class g extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final tb.c f114923a;

    /* renamed from: b, reason: collision with root package name */
    public final int f114924b;

    /* renamed from: c, reason: collision with root package name */
    public final e f114925c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f114926d;

    public g(e eVar, Looper looper) {
        super(looper);
        this.f114925c = eVar;
        this.f114924b = 10;
        this.f114923a = new tb.c(17);
    }

    public final void a(Object obj, p pVar) {
        j a13 = j.a(obj, pVar);
        synchronized (this) {
            try {
                this.f114923a.d(a13);
                if (!this.f114926d) {
                    this.f114926d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                j m13 = this.f114923a.m();
                if (m13 == null) {
                    synchronized (this) {
                        m13 = this.f114923a.m();
                        if (m13 == null) {
                            this.f114926d = false;
                            return;
                        }
                    }
                }
                this.f114925c.c(m13);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.f114924b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f114926d = true;
        } catch (Throwable th3) {
            this.f114926d = false;
            throw th3;
        }
    }
}
