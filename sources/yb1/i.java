package yb1;

import android.content.Context;
import com.pinterest.feature.settings.shared.view.SettingsSectionHeaderView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138563i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f138564j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i13) {
        super(0);
        this.f138563i = i13;
        this.f138564j = jVar;
    }

    public final SettingsSectionHeaderView b() {
        int i13 = this.f138563i;
        j jVar = this.f138564j;
        switch (i13) {
            case 4:
                Context requireContext = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new SettingsSectionHeaderView(requireContext, null, 14);
            default:
                Context requireContext2 = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new SettingsSectionHeaderView(requireContext2, null, 14);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f138563i;
        j jVar = this.f138564j;
        switch (i13) {
            case 0:
                Context requireContext = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                break;
            case 1:
                Context requireContext2 = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                break;
            case 2:
                Context requireContext3 = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                break;
            case 3:
                Context requireContext4 = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                break;
        }
        return b();
    }
}
