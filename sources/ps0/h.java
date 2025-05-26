package ps0;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeFeedFragment f101268b;

    public /* synthetic */ h(HomeFeedFragment homeFeedFragment, int i13) {
        this.f101267a = i13;
        this.f101268b = homeFeedFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f101267a;
        HomeFeedFragment this$0 = this.f101268b;
        switch (i13) {
            case 0:
                int i14 = HomeFeedFragment.U1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                se2.a aVar = this$0.f45746b1;
                if (aVar == null) {
                    Intrinsics.r("connectionMetricsCollector");
                    throw null;
                }
                tw0.g gVar = (tw0.g) ((bf2.b) aVar).get();
                kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
                new fk2.c(4, new hk2.o(0, gVar.f119612a.a().h(tk2.e.f118017c), new ir.j(23, new tw0.a(gVar, j0Var, 0))), new ir.j(24, new tw0.a(gVar, j0Var, 1))).i(new f00.c(j0Var, 3), new com.pinterest.feature.home.model.h(9, new u00.e(j0Var, 9)));
                return;
            case 1:
                int i15 = HomeFeedFragment.U1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.s9();
                return;
            default:
                int i16 = HomeFeedFragment.U1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                View view = this$0.getView();
                fs1.b bVar = new fs1.b(view instanceof ViewGroup ? (ViewGroup) view : null);
                is1.k0 k0Var = this$0.f45751g1;
                if (k0Var == null) {
                    Intrinsics.r("webViewManager");
                    throw null;
                }
                fs1.a aVar2 = new fs1.a(bVar, k0Var);
                this$0.f45766v1 = aVar2;
                aVar2.a();
                return;
        }
    }
}
