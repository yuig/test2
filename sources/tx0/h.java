package tx0;

import android.content.Context;
import android.view.View;
import com.pinterest.feature.newshub.feed.view.NewsHubEmptyStateView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119652i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f119653j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(o oVar, int i13) {
        super(0);
        this.f119652i = i13;
        this.f119653j = oVar;
    }

    public final View b() {
        int i13 = this.f119652i;
        o oVar = this.f119653j;
        switch (i13) {
            case 1:
                Context requireContext = oVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new rx0.i(requireContext, false);
            default:
                Context requireContext2 = oVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new rx0.i(requireContext2, false);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f119652i;
        o oVar = this.f119653j;
        switch (i13) {
            case 0:
                Context requireContext = oVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                NewsHubEmptyStateView newsHubEmptyStateView = new NewsHubEmptyStateView(requireContext);
                newsHubEmptyStateView.L(new dx0.d(oVar, 5));
                return newsHubEmptyStateView;
            case 1:
                return b();
            case 2:
                return b();
            default:
                uk1.e eVar = oVar.J0;
                if (eVar != null) {
                    return ((uk1.a) eVar).g();
                }
                Intrinsics.r("presenterPinalyticsFactory");
                throw null;
        }
    }
}
