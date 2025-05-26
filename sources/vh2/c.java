package vh2;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import bi2.e;
import bi2.g;
import bi2.h;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class c extends p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125847a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Object obj, int i13) {
        super(1, obj, bi2.c.class, "addListener", "addListener(Lio/embrace/android/embracesdk/internal/session/lifecycle/ActivityLifecycleListener;)V", 0);
        this.f125847a = i13;
        if (i13 == 1) {
            super(1, obj, h.class, "addListener", "addListener(Lio/embrace/android/embracesdk/internal/session/lifecycle/ProcessStateListener;)V", 0);
            return;
        }
        if (i13 == 2) {
            super(1, obj, yh2.a.class, "addListener", "addListener(Lio/embrace/android/embracesdk/internal/session/MemoryCleanerListener;)V", 0);
        } else if (i13 != 3) {
        } else {
            super(1, obj, bi2.c.class, "addStartupListener", "addStartupListener(Lio/embrace/android/embracesdk/internal/session/lifecycle/StartupListener;)V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f125847a) {
            case 0:
                bi2.a listener = (bi2.a) obj;
                Intrinsics.checkNotNullParameter(listener, "p0");
                bi2.b bVar = (bi2.b) ((bi2.c) this.receiver);
                bVar.getClass();
                Intrinsics.checkNotNullParameter(listener, "listener");
                CopyOnWriteArrayList copyOnWriteArrayList = bVar.f22890c;
                if (!copyOnWriteArrayList.contains(listener)) {
                    copyOnWriteArrayList.addIfAbsent(listener);
                }
                break;
            case 1:
                g listener2 = (g) obj;
                Intrinsics.checkNotNullParameter(listener2, "p0");
                e eVar = (e) ((h) this.receiver);
                eVar.getClass();
                Intrinsics.checkNotNullParameter(listener2, "listener");
                if (listener2 instanceof di2.c) {
                    eVar.f22897e = (di2.c) listener2;
                } else {
                    eVar.f22896d.addIfAbsent(listener2);
                }
                break;
            case 2:
                yh2.b listener3 = (yh2.b) obj;
                Intrinsics.checkNotNullParameter(listener3, "p0");
                yh2.a aVar = (yh2.a) this.receiver;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(listener3, "listener");
                aVar.f139053b.addIfAbsent(listener3);
                break;
            default:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(null, "p0");
                bi2.b bVar2 = (bi2.b) ((bi2.c) this.receiver);
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(null, "listener");
                CopyOnWriteArrayList copyOnWriteArrayList2 = bVar2.f22891d;
                if (!copyOnWriteArrayList2.contains(null)) {
                    copyOnWriteArrayList2.addIfAbsent(null);
                }
                break;
        }
        return Unit.f80348a;
    }
}
