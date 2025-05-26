package rb1;

import android.content.Context;
import com.pinterest.feature.settings.shared.view.SettingsToggleItemView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107080i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f107081j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(k kVar, int i13) {
        super(0);
        this.f107080i = i13;
        this.f107081j = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f107080i;
        k kVar = this.f107081j;
        switch (i13) {
            case 0:
                return Float.valueOf(kVar.getResources().getDimension(c52.a.settings_header_elevation));
            default:
                Context requireContext = kVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new SettingsToggleItemView(requireContext, null, 0, null, new i1.h(kVar, 21), 14);
        }
    }
}
