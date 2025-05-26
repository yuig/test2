package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d1 implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18611a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18612b;

    public d1(ye2.m mVar) {
        this.f18612b = mVar;
    }

    @Override // androidx.lifecycle.x
    public final void c(z source, q event) {
        int i13 = this.f18611a;
        Object obj = this.f18612b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == q.ON_CREATE) {
                    source.getLifecycle().b(this);
                    ((h1) obj).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
                }
            default:
                if (event == q.ON_DESTROY) {
                    ye2.m mVar = (ye2.m) obj;
                    mVar.getClass();
                    mVar.f138921a = null;
                    mVar.f138922b = null;
                    return;
                }
                return;
        }
    }

    public d1(h1 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f18612b = provider;
    }
}
