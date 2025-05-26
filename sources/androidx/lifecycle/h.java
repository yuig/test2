package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h implements x {

    /* renamed from: a, reason: collision with root package name */
    public final f f18628a;

    /* renamed from: b, reason: collision with root package name */
    public final x f18629b;

    public h(f defaultLifecycleObserver, x xVar) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f18628a = defaultLifecycleObserver;
        this.f18629b = xVar;
    }

    @Override // androidx.lifecycle.x
    public final void c(z owner, q event) {
        Intrinsics.checkNotNullParameter(owner, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i13 = g.f18620a[event.ordinal()];
        f fVar = this.f18628a;
        switch (i13) {
            case 1:
                fVar.getClass();
                Intrinsics.checkNotNullParameter(owner, "owner");
                break;
            case 2:
                fVar.onStart(owner);
                break;
            case 3:
                fVar.onResume(owner);
                break;
            case 4:
                fVar.onPause(owner);
                break;
            case 5:
                fVar.onStop(owner);
                break;
            case 6:
                fVar.onDestroy(owner);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        x xVar = this.f18629b;
        if (xVar != null) {
            xVar.c(owner, event);
        }
    }
}
