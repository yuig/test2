package q91;

import android.content.Context;
import com.pinterest.feature.settings.shared.view.SettingsHeaderView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103136i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f103137j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, int i13) {
        super(0);
        this.f103136i = i13;
        this.f103137j = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f103136i;
        m mVar = this.f103137j;
        switch (i13) {
            case 0:
                Context requireContext = mVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new SettingsHeaderView(requireContext);
            default:
                Context requireContext2 = mVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new o(requireContext2, new l(mVar, 0));
        }
    }
}
