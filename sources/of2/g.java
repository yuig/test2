package of2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kh2.j;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94428a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f94429b;

    public /* synthetic */ g(Object obj, int i13) {
        this.f94428a = i13;
        this.f94429b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ArrayList arrayList;
        switch (this.f94428a) {
            case 0:
                h hVar = (h) this.f94429b;
                d dVar = hVar.f94435f;
                pf2.f state = hVar.f94433d;
                og2.a clock = hVar.f94432c;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(clock, "clock");
                synchronized (dVar.f94422d) {
                    try {
                        ArrayList H0 = CollectionsKt.H0(dVar.f94422d);
                        if (state.f100034e) {
                            H0.add(new th2.b(state.f100032c, Long.valueOf(clock.now()), null, th2.a.UI, new th2.d(CollectionsKt.F0(dVar.f94423e))));
                        }
                        arrayList = new ArrayList(g0.q(H0, 10));
                        Iterator it = H0.iterator();
                        while (it.hasNext()) {
                            arrayList.add(j.y((th2.b) it.next()));
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return arrayList;
            default:
                return Boolean.valueOf(((xg2.c) this.f94429b).a());
        }
    }
}
