package cu;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import com.pinterest.navigation.Navigation;
import kh2.s0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class l extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53222i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f53223j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i13) {
        super(0);
        this.f53222i = i13;
        this.f53223j = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f53222i;
        int i14 = 0;
        m mVar = this.f53223j;
        switch (i13) {
            case 0:
                return new k(mVar, i14);
            case 1:
                return new BaseAdsScrollingModule(6, mVar.f8(), (AttributeSet) null);
            default:
                Navigation navigation = mVar.I;
                if (navigation == null || !navigation.S("com.pinterest.EXCLUDE_AD", false)) {
                    Context requireContext = mVar.requireContext();
                    Intrinsics.f(requireContext);
                    return requireContext;
                }
                Context requireContext2 = mVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return s0.c1(requireContext2);
        }
    }
}
