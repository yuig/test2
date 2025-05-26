package u91;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.feature.settings.shared.view.SettingsPageItemView;
import com.pinterest.feature.settings.shared.view.SettingsSameLineTitledTextItemView;
import com.pinterest.feature.settings.shared.view.SettingsSectionHeaderView;
import com.pinterest.feature.settings.shared.view.SettingsTextItemView;
import com.pinterest.feature.settings.shared.view.SettingsToggleItemView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f121215i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f121216j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h hVar, int i13) {
        super(0);
        this.f121215i = i13;
        this.f121216j = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = 0;
        int i14 = this.f121215i;
        h hVar = this.f121216j;
        switch (i14) {
            case 0:
                return Float.valueOf(hVar.getResources().getDimension(c52.a.settings_header_elevation));
            case 1:
                Context requireContext = hVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new SettingsSectionHeaderView(requireContext, null, 14);
            case 2:
                Context requireContext2 = hVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new SettingsTextItemView(requireContext2, null, 0, 30);
            case 3:
                Context requireContext3 = hVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new SettingsPageItemView(requireContext3, null, 0, new g(hVar, i13), new g(hVar, 1), 6);
            case 4:
                Context requireContext4 = hVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                return new SettingsToggleItemView(requireContext4, null, 0, null, new i1.h(hVar, 19), 14);
            default:
                Context requireContext5 = hVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                return new SettingsSameLineTitledTextItemView(6, requireContext5, (AttributeSet) null);
        }
    }
}
