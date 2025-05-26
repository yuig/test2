package ma1;

import android.content.Context;
import com.pinterest.feature.settings.shared.view.SettingsTextItemView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f86786i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f86787j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(n nVar, int i13) {
        super(0);
        this.f86786i = i13;
        this.f86787j = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f86786i;
        n nVar = this.f86787j;
        switch (i13) {
            case 0:
                return Float.valueOf(nVar.getResources().getDimension(c52.a.settings_header_elevation));
            case 1:
                Context requireContext = nVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new SettingsTextItemView(requireContext, null, 0, 30);
            default:
                Context requireContext2 = nVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new c(requireContext2);
        }
    }
}
