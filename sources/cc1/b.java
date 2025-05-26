package cc1;

import android.content.Context;
import com.pinterest.feature.settings.notifications.y0;
import com.pinterest.feature.settings.shared.view.GestaltSettingsPageItemView;
import com.pinterest.feature.settings.shared.view.SettingsSectionHeaderView;
import com.pinterest.feature.settings.shared.view.SettingsTextItemView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27447i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f27448j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(0);
        this.f27447i = i13;
        this.f27448j = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f27447i;
        d dVar = this.f27448j;
        switch (i13) {
            case 0:
                return Float.valueOf(dVar.getResources().getDimension(c52.a.settings_header_elevation));
            case 1:
                Context requireContext = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new SettingsSectionHeaderView(requireContext, null, 14);
            case 2:
                Context requireContext2 = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new SettingsTextItemView(requireContext2, null, 0, 30);
            default:
                Context requireContext3 = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new GestaltSettingsPageItemView(0, 6, requireContext3, null, new y0(dVar, 24));
        }
    }
}
