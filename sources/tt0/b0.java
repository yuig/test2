package tt0;

import com.pinterest.design.brio.widget.progress.FullBleedGestaltSpinner;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f119085b;

    public /* synthetic */ b0(l0 l0Var, int i13) {
        this.f119084a = i13;
        this.f119085b = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f119084a;
        l0 this$0 = this.f119085b;
        switch (i13) {
            case 0:
                int i14 = l0.Z0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FullBleedGestaltSpinner fullBleedGestaltSpinner = this$0.F0;
                if (fullBleedGestaltSpinner != null) {
                    fullBleedGestaltSpinner.showLoadingSpinner(false);
                    return;
                } else {
                    Intrinsics.r("progressIndicator");
                    throw null;
                }
            case 1:
                int i15 = l0.Z0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FullBleedGestaltSpinner fullBleedGestaltSpinner2 = this$0.F0;
                if (fullBleedGestaltSpinner2 != null) {
                    fullBleedGestaltSpinner2.showLoadingSpinner(false);
                    return;
                } else {
                    Intrinsics.r("progressIndicator");
                    throw null;
                }
            default:
                int i16 = l0.Z0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.h8().k(aq1.h.idea_pin_drafts_low_storage_message);
                oe.f.f94192b = true;
                return;
        }
    }
}
