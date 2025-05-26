package d01;

import com.pinterest.feature.pear.ui.animatedpins.AnimatedPinVerticalCarouselView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnimatedPinVerticalCarouselView f53590b;

    public /* synthetic */ a(AnimatedPinVerticalCarouselView animatedPinVerticalCarouselView, int i13) {
        this.f53589a = i13;
        this.f53590b = animatedPinVerticalCarouselView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f53589a;
        AnimatedPinVerticalCarouselView this$0 = this.f53590b;
        switch (i13) {
            case 0:
                int i14 = AnimatedPinVerticalCarouselView.f46872e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f46874b.h3();
                break;
            default:
                int i15 = AnimatedPinVerticalCarouselView.f46872e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f46874b.d3(Integer.MAX_VALUE);
                break;
        }
    }
}
