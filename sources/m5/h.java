package m5;

import android.os.Process;

/* loaded from: classes3.dex */
public final class h extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f85860a;

    public h(Runnable runnable, String str, int i13) {
        super(runnable, str);
        this.f85860a = i13;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f85860a);
        super.run();
    }
}
