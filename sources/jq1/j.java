package jq1;

import android.content.Context;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class j extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77488i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f77489j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(n nVar, int i13) {
        super(0);
        this.f77488i = i13;
        this.f77489j = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Navigation navigation;
        int i13 = this.f77488i;
        n nVar = this.f77489j;
        switch (i13) {
            case 0:
                return nVar.generateLoggingContext();
            case 1:
                bh.b bVar = new bh.b(nVar.s7(), new j(nVar, 0));
                k90.a aVar = new k90.a(nVar, 3);
                Navigation navigation2 = nVar.I;
                return new ca2.e(true, aVar, 0, 0, (navigation2 == null || !navigation2.w("com.pinterest.EXTRA_STORY_PIN_PAGE_WIDTH") || (navigation = nVar.I) == null) ? null : Integer.valueOf(navigation.J1("com.pinterest.EXTRA_STORY_PIN_PAGE_WIDTH")), 0, null, bVar, false, false, 876);
            case 2:
                Intrinsics.checkNotNullExpressionValue(nVar.getResources(), "getResources(...)");
                return Float.valueOf(bs1.c.U(fq1.a.idea_pin_list_bottom_sheet_header_elevation, r0));
            default:
                Context requireContext = nVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new q21.d(requireContext, nVar.s7(), nVar.p7(), null, 0, null, null, null, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER);
        }
    }
}
