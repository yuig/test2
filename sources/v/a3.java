package v;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class a3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123349a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sp2.i f123350b;

    public /* synthetic */ a3(sp2.i iVar, int i13) {
        this.f123349a = i13;
        this.f123350b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f123349a;
        sp2.i this$0 = this.f123350b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int decrementAndGet = ((AtomicInteger) this$0.f114929c).decrementAndGet();
                if (decrementAndGet >= 0) {
                    kh2.m0.p("VideoUsageControl", "decrementUsage: mVideoUsage = " + decrementAndGet);
                    break;
                } else {
                    kh2.m0.X0("VideoUsageControl", "decrementUsage: mVideoUsage = " + decrementAndGet + ", which is less than 0!");
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                kh2.m0.p("VideoUsageControl", "incrementUsage: mVideoUsage = " + ((AtomicInteger) this$0.f114929c).incrementAndGet());
                break;
        }
    }
}
