package v;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class y0 implements c0.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f123747b;

    public /* synthetic */ y0(Object obj, int i13) {
        this.f123746a = i13;
        this.f123747b = obj;
    }

    public final void a() {
        switch (this.f123746a) {
            case 0:
                r4.i iVar = (r4.i) this.f123747b;
                kh2.m0.p("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
                iVar.b(null);
                return;
            default:
                h0.h this$0 = (h0.h) this.f123747b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                synchronized (this$0.f66403b) {
                    try {
                        if (this$0.f66405d == null) {
                            kh2.m0.X0("ScreenFlashWrapper", "apply: pendingListener is null!");
                        }
                        this$0.c();
                        Unit unit = Unit.f80348a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
