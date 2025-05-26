package wc1;

import android.content.Context;
import ck2.i;
import com.pinterest.feature.settings.shared.view.SettingsPageItemView;
import com.pinterest.feature.settings.shared.view.SettingsTextItemView;
import com.pinterest.feature.settings.shared.view.SettingsToggleItemView;
import i1.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129103i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f129104j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, int i13) {
        super(0);
        this.f129103i = i13;
        this.f129104j = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = 0;
        int i14 = this.f129103i;
        e eVar = this.f129104j;
        switch (i14) {
            case 0:
                return Float.valueOf(eVar.getResources().getDimension(c52.a.settings_header_elevation));
            case 1:
                Context requireContext = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new SettingsTextItemView(requireContext, null, 0, 30);
            case 2:
                Context requireContext2 = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new SettingsPageItemView(requireContext2, null, 0, new c(eVar, i13), null, 22);
            case 3:
                Context requireContext3 = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new SettingsToggleItemView(requireContext3, null, 0, null, new h(eVar, 28), 14);
            case 4:
                Context requireContext4 = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                return new zc1.f(requireContext4, new c(eVar, 1));
            default:
                cr1.a aVar = eVar.A0;
                if (aVar == null) {
                    Intrinsics.r("accountService");
                    throw null;
                }
                aVar.r().H(tk2.e.f118017c).A(wj2.c.a()).F(new ec1.a(19, new c(eVar, 2)), new ec1.a(20, new c(eVar, 3)), i.f27923c, i.f27924d);
                return Unit.f80348a;
        }
    }
}
