package q71;

import android.content.Context;
import android.view.LayoutInflater;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadTextCell;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102700i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f102701j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i13) {
        super(0);
        this.f102700i = i13;
        this.f102701j = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f102700i;
        d dVar = this.f102701j;
        switch (i13) {
            case 0:
                LayoutInflater.Factory requireActivity = dVar.requireActivity();
                Intrinsics.g(requireActivity, "null cannot be cast to non-null type com.pinterest.hairball.kit.activity.ActiveFragmentProvider");
                return ((cp1.a) requireActivity).getF52740f();
            default:
                Context requireContext = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new SearchTypeaheadTextCell(requireContext);
        }
    }
}
