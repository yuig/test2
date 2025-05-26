package sd;

import android.os.Process;

/* loaded from: classes.dex */
public final class a extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(9);
        super.run();
    }
}
