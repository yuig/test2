package f0;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import oi.k5;

/* loaded from: classes2.dex */
public final class c implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f60725c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60726a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f60727b;

    public c(k5 k5Var) {
        this.f60726a = 1;
        this.f60727b = k5Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i13 = this.f60726a;
        Object obj = this.f60727b;
        switch (i13) {
            case 0:
                ((ExecutorService) obj).execute(runnable);
                break;
            default:
                ((k5) obj).zzl().y(runnable);
                break;
        }
    }

    public c() {
        this.f60726a = 0;
        this.f60727b = Executors.newFixedThreadPool(2, new b());
    }
}
