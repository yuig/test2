package ru1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.navigation.view.lego.LegoFloatingBottomNavBar;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LegoFloatingBottomNavBar f110084b;

    public /* synthetic */ u(LegoFloatingBottomNavBar legoFloatingBottomNavBar, int i13) {
        this.f110083a = i13;
        this.f110084b = legoFloatingBottomNavBar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        int intValue;
        int i24 = this.f110083a;
        LegoFloatingBottomNavBar legoFloatingBottomNavBar = this.f110084b;
        switch (i24) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                if (view.getWidth() <= legoFloatingBottomNavBar.f49959g) {
                    if (view.getWidth() < legoFloatingBottomNavBar.f49959g) {
                        legoFloatingBottomNavBar.I();
                        break;
                    }
                } else {
                    legoFloatingBottomNavBar.f49959g = view.getWidth();
                    legoFloatingBottomNavBar.I();
                    break;
                }
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                legoFloatingBottomNavBar.getLayoutParams().width = -2;
                legoFloatingBottomNavBar.getLayoutParams().height = -2;
                ViewGroup.LayoutParams layoutParams = legoFloatingBottomNavBar.getLayoutParams();
                Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (legoFloatingBottomNavBar.x()) {
                    u50.n nVar = legoFloatingBottomNavBar.u().f110009d.f110015e;
                    Context context = legoFloatingBottomNavBar.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    intValue = nVar.a(context).intValue();
                } else {
                    intValue = ((Number) legoFloatingBottomNavBar.f49954J.getValue()).intValue();
                }
                marginLayoutParams.bottomMargin = intValue;
                break;
        }
    }
}
