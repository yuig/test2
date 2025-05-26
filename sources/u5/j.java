package u5;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120516a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f120516a) {
            case 0:
                runnable.run();
                break;
            case 1:
            case 2:
                break;
            case 3:
                runnable.run();
                break;
            case 4:
                runnable.run();
                break;
            case 5:
            case 6:
            case 8:
            case 9:
            default:
                runnable.run();
                break;
            case 7:
                runnable.run();
                break;
            case 10:
                runnable.run();
                break;
            case 11:
                runnable.run();
                break;
            case 12:
                runnable.run();
                break;
        }
    }
}
