package s;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f110248b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f110249c;

    public /* synthetic */ d(j jVar, Bundle bundle, int i13) {
        this.f110247a = i13;
        this.f110249c = jVar;
        this.f110248b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f110247a;
        Bundle bundle = this.f110248b;
        j jVar = this.f110249c;
        switch (i13) {
            case 0:
                jVar.f110276b.onUnminimized(bundle);
                break;
            case 1:
                jVar.f110276b.onMessageChannelReady(bundle);
                break;
            case 2:
                jVar.f110276b.onWarmupCompleted(bundle);
                break;
            default:
                jVar.f110276b.onMinimized(bundle);
                break;
        }
    }
}
