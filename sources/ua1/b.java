package ua1;

import android.content.Context;
import com.pinterest.feature.settings.shared.view.SettingsToggleItemView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.l4;
import i1.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import l91.f;
import m60.w;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f121413i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f121414j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(0);
        this.f121413i = i13;
        this.f121414j = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f121413i;
        d dVar = this.f121414j;
        switch (i13) {
            case 0:
                return Float.valueOf(dVar.getResources().getDimension(c52.a.settings_header_elevation));
            case 1:
                Context requireContext = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new SettingsToggleItemView(requireContext, null, 0, null, new h(dVar, 20), 14);
            default:
                w f73 = dVar.f7();
                NavigationImpl w13 = Navigation.w1((ScreenLocation) l4.f51095j.getValue());
                w13.y0(f.CREATE, "extra_password_mode");
                f73.d(w13);
                return Unit.f80348a;
        }
    }
}
