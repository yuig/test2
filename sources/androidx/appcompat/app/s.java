package androidx.appcompat.app;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16119a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f16119a) {
            case 0:
                new Thread(runnable).start();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                he.n.f().post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
