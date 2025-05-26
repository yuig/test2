package q01;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.feature.pin.closeup.filters.view.RelatedPinsFilterRepView;
import com.pinterest.navigation.Navigation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101825i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f101826j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(p pVar, int i13) {
        super(0);
        this.f101825i = i13;
        this.f101826j = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f101825i;
        p pVar = this.f101826j;
        switch (i13) {
            case 0:
                return pVar.generateLoggingContext();
            case 1:
                int i14 = 0;
                ca2.e eVar = new ca2.e(true, null, 0, 0, null, 0, null, new bh.b(pVar.s7(), new n(pVar, i14)), false, false, 894);
                eVar.f27252k = new o(pVar, i14);
                return eVar;
            case 2:
                Navigation navigation = pVar.I;
                Object X0 = navigation != null ? navigation.X0() : null;
                m01.a aVar = X0 instanceof m01.a ? (m01.a) X0 : null;
                if (aVar == null) {
                    pVar.b6().q(new IllegalArgumentException("RelatedPinsFilterOptionsSheetModel is null"), "RelatedPinsFilterOptionsSheetModel is null", tb0.p.RELATED_PINS);
                }
                Intrinsics.f(aVar);
                return aVar;
            default:
                Context requireContext = pVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new RelatedPinsFilterRepView(6, requireContext, (AttributeSet) null);
        }
    }
}
