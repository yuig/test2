package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92733a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f92733a) {
            case 1:
                b.l().f92736b.f92741c.execute(runnable);
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                runnable.run();
                break;
            case 4:
                runnable.run();
                break;
            case 5:
                runnable.run();
                break;
            case 6:
                runnable.run();
                break;
            case 7:
                runnable.run();
                break;
            case 8:
                runnable.run();
                break;
            case 9:
                runnable.run();
                break;
            case 10:
                runnable.run();
                break;
            default:
                Handler handler = gl1.c.f65740f;
                if (!Intrinsics.d(Looper.getMainLooper(), Looper.myLooper())) {
                    gl1.c.f65740f.post(runnable);
                    break;
                } else {
                    runnable.run();
                    break;
                }
        }
    }
}
