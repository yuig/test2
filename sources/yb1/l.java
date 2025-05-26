package yb1;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.feature.settings.notifications.y0;
import com.pinterest.feature.settings.shared.view.SettingsHeaderTextItemView;
import com.pinterest.feature.settings.shared.view.SettingsSectionHeaderView;
import com.pinterest.feature.settings.shared.view.SettingsTextItemView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138566i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f138567j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i13) {
        super(0);
        this.f138566i = i13;
        this.f138567j = mVar;
    }

    public final SettingsSectionHeaderView b() {
        int i13 = this.f138566i;
        m mVar = this.f138567j;
        switch (i13) {
            case 1:
                Context requireContext = mVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new SettingsSectionHeaderView(requireContext, null, 14);
            default:
                Context requireContext2 = mVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new SettingsSectionHeaderView(requireContext2, null, 14);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f138566i;
        m mVar = this.f138567j;
        switch (i13) {
            case 0:
                Context requireContext = mVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new SettingsTextItemView(requireContext, null, 0, 30);
            case 1:
                return b();
            case 2:
                return b();
            case 3:
                Context requireContext2 = mVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new SettingsHeaderTextItemView(6, requireContext2, (AttributeSet) null);
            default:
                Context requireContext3 = mVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new wb1.s(requireContext3, new y0(mVar, 19));
        }
    }
}
