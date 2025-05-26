package f0;

import android.os.Looper;
import android.os.Process;
import kotlin.Unit;
import xk2.q;
import xk2.s;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f60721a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f60722b;

    public /* synthetic */ a(int i13, Runnable runnable) {
        this.f60721a = i13;
        this.f60722b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f60721a;
        Runnable runnable = this.f60722b;
        switch (i13) {
            case 0:
                Process.setThreadPriority(-16);
                runnable.run();
                break;
            case 1:
                try {
                    Process.setThreadPriority(10);
                } catch (Throwable unused) {
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                Looper looper = ii2.c.f72333a;
                try {
                    q qVar = s.f135225b;
                    runnable.run();
                    Unit unit = Unit.f80348a;
                    break;
                } catch (Throwable th3) {
                    q qVar2 = s.f135225b;
                    ue.c.m(th3);
                }
        }
    }
}
