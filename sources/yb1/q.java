package yb1;

import android.content.Context;
import com.pinterest.feature.settings.notifications.y0;
import com.pinterest.feature.settings.shared.view.SettingsPageItemView;
import com.pinterest.feature.settings.shared.view.SettingsSectionHeaderView;
import com.pinterest.feature.settings.shared.view.SettingsTextItemView;
import com.pinterest.feature.settings.shared.view.SettingsToggleItemView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138576i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f138577j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(t tVar, int i13) {
        super(0);
        this.f138576i = i13;
        this.f138577j = tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f138576i;
        t tVar = this.f138577j;
        switch (i13) {
            case 0:
                Context requireContext = tVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new SettingsTextItemView(requireContext, null, 0, 30);
            case 1:
                Context requireContext2 = tVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new SettingsPageItemView(requireContext2, null, 0, new y0(tVar, 21), null, 22);
            case 2:
                Context requireContext3 = tVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new SettingsToggleItemView(requireContext3, null, 0, null, new i1.h(tVar, 25), 14);
            case 3:
                Context requireContext4 = tVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                return new SettingsSectionHeaderView(requireContext4, null, 14);
            default:
                Context requireContext5 = tVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                return new p(requireContext5, new s(2, this.f138577j, t.class, "handleSubmitInputListAction", "handleSubmitInputListAction(Lcom/pinterest/feature/settings/menu/model/SettingsInputItem;Ljava/lang/String;)V", 0));
        }
    }
}
