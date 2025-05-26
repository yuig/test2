package n8;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import d7.n0;

/* loaded from: classes.dex */
public final class z implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    public static final z f89920f = new z();

    /* renamed from: a, reason: collision with root package name */
    public volatile long f89921a = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f89922b;

    /* renamed from: c, reason: collision with root package name */
    public final HandlerThread f89923c;

    /* renamed from: d, reason: collision with root package name */
    public Choreographer f89924d;

    /* renamed from: e, reason: collision with root package name */
    public int f89925e;

    public z() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i13 = n0.f53866a;
        Handler handler = new Handler(looper, this);
        this.f89922b = handler;
        handler.sendEmptyMessage(1);
    }

    public final void a() {
        Choreographer choreographer = this.f89924d;
        if (choreographer != null) {
            int i13 = this.f89925e + 1;
            this.f89925e = i13;
            if (i13 == 1) {
                choreographer.postFrameCallback(this);
            }
        }
    }

    public final void b() {
        Choreographer choreographer = this.f89924d;
        if (choreographer != null) {
            int i13 = this.f89925e - 1;
            this.f89925e = i13;
            if (i13 == 0) {
                choreographer.removeFrameCallback(this);
                this.f89921a = -9223372036854775807L;
            }
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j13) {
        this.f89921a = j13;
        Choreographer choreographer = this.f89924d;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i13 = message.what;
        if (i13 == 1) {
            try {
                this.f89924d = Choreographer.getInstance();
            } catch (RuntimeException e13) {
                d7.u.h("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e13);
            }
            return true;
        }
        if (i13 == 2) {
            a();
            return true;
        }
        if (i13 != 3) {
            return false;
        }
        b();
        return true;
    }
}
