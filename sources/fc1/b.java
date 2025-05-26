package fc1;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.feature.settings.shared.view.SettingsPageItemView;
import com.pinterest.feature.settings.shared.view.SettingsSectionHeaderView;
import com.pinterest.feature.settings.shared.view.SettingsTextItemView;
import com.pinterest.feature.settings.shared.view.SettingsTitledTextItemView;
import com.pinterest.feature.settings.shared.view.SettingsToggleItemView;
import i1.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f61731i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f61732j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, int i13) {
        super(0);
        this.f61731i = i13;
        this.f61732j = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f61731i;
        e eVar = this.f61732j;
        switch (i13) {
            case 0:
                return Float.valueOf(eVar.getResources().getDimension(d70.b.lego_board_action_toolbar_elevation));
            case 1:
                Context requireContext = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new SettingsToggleItemView(requireContext, null, 0, null, new h(eVar, 26), 14);
            case 2:
                Context requireContext2 = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new zc1.d(requireContext2, new d(eVar, 0));
            case 3:
                Context requireContext3 = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new SettingsSectionHeaderView(requireContext3, null, 14);
            case 4:
                Context requireContext4 = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                return new SettingsTextItemView(requireContext4, null, 0, 30);
            case 5:
                Context requireContext5 = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                return new SettingsPageItemView(requireContext5, null, 0, new d(eVar, 1), new d(eVar, 2), 6);
            default:
                Context requireContext6 = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext6, "requireContext(...)");
                return new SettingsTitledTextItemView(6, requireContext6, (AttributeSet) null);
        }
    }
}
