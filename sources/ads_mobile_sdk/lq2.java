package ads_mobile_sdk;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class lq2 implements wi.d0 {

    /* renamed from: a, reason: collision with root package name */
    public wi.c0 f7928a;

    @Override // wi.d0
    public final wi.c0 getVideoLifecycleCallbacks() {
        wi.c0 c0Var;
        synchronized (this) {
            c0Var = this.f7928a;
        }
        return c0Var;
    }

    @Override // wi.d0
    public final void pause() {
    }

    @Override // wi.d0
    public final void play() {
    }

    @Override // wi.d0
    public final void setVideoLifecycleCallbacks(wi.c0 c0Var) {
        synchronized (this) {
            this.f7928a = c0Var;
            Unit unit = Unit.f80348a;
        }
    }
}
