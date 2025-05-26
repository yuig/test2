package tt0;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f119090b;

    public /* synthetic */ c(k kVar, int i13) {
        this.f119089a = i13;
        this.f119090b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        int i13 = this.f119089a;
        k this$0 = this.f119090b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                m.h hVar = this$0.f119145h;
                if (hVar == null || (function0 = (Function0) hVar.f85198c) == null) {
                    return;
                }
                function0.invoke();
                return;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                m.h hVar2 = this$0.f119145h;
                if (hVar2 == null || (function02 = (Function0) hVar2.f85200e) == null) {
                    return;
                }
                function02.invoke();
                return;
            case 2:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                m.h hVar3 = this$0.f119145h;
                if (hVar3 == null || (function03 = (Function0) hVar3.f85199d) == null) {
                    return;
                }
                function03.invoke();
                return;
            case 3:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ReentrantLock reentrantLock = this$0.f119151n;
                reentrantLock.lock();
                try {
                    this$0.a();
                    this$0.f119152o.signalAll();
                    Unit unit = Unit.f80348a;
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                m.h hVar4 = this$0.f119145h;
                if (hVar4 == null || (function04 = (Function0) hVar4.f85197b) == null) {
                    return;
                }
                function04.invoke();
                return;
        }
    }
}
