package lg;

import android.os.Process;
import android.util.Log;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83191a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f83192b;

    public h(Runnable runnable, int i13) {
        this.f83192b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f83191a;
        Runnable runnable = this.f83192b;
        switch (i13) {
            case 0:
                try {
                    runnable.run();
                    break;
                } catch (Exception e13) {
                    String concat = "TRuntime.".concat("Executor");
                    if (Log.isLoggable(concat, 6)) {
                        Log.e(concat, "Background execution failure.", e13);
                        return;
                    }
                    return;
                }
            default:
                Process.setThreadPriority(0);
                runnable.run();
                break;
        }
    }

    public h(Runnable runnable) {
        this.f83192b = runnable;
    }
}
