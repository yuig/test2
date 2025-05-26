package vb;

import java.util.concurrent.Executor;
import lg.h;

/* loaded from: classes.dex */
public final class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125442a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f125443b;

    public /* synthetic */ a(Object obj, int i13) {
        this.f125442a = i13;
        this.f125443b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i13 = this.f125442a;
        Object obj = this.f125443b;
        switch (i13) {
            case 0:
                ((b) obj).f125446c.post(runnable);
                break;
            default:
                ((Executor) obj).execute(new h(runnable));
                break;
        }
    }
}
