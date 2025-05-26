package sl;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements cm.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113136a;

    public /* synthetic */ g(int i13) {
        this.f113136a = i13;
    }

    @Override // cm.a
    public final Object get() {
        switch (this.f113136a) {
            case 0:
                return Collections.emptySet();
            case 1:
                return null;
            case 2:
                m mVar = ExecutorsRegistrar.f33721a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                detectNetwork.detectUnbufferedIo();
                return new tl.f(Executors.newFixedThreadPool(4, new tl.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f33724d.get());
            case 3:
                m mVar2 = ExecutorsRegistrar.f33721a;
                return new tl.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new tl.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f33724d.get());
            case 4:
                m mVar3 = ExecutorsRegistrar.f33721a;
                return new tl.f(Executors.newCachedThreadPool(new tl.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f33724d.get());
            default:
                m mVar4 = ExecutorsRegistrar.f33721a;
                return Executors.newSingleThreadScheduledExecutor(new tl.a("Firebase Scheduler", 0, null));
        }
    }
}
