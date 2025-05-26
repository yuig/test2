package is0;

import com.pinterest.feature.gridactions.pingridhide.view.PinGridHideView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements ak2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f73530b;

    public /* synthetic */ a(h hVar, int i13) {
        this.f73529a = i13;
        this.f73530b = hVar;
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        int i13 = this.f73529a;
        h this$0 = this.f73530b;
        Throwable th3 = (Throwable) obj;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isBound()) {
                    this$0.f73567y.accept(th3);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((PinGridHideView) ((hs0.b) this$0.getView())).b();
                break;
        }
    }
}
