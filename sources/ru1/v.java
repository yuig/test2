package ru1;

import com.pinterest.navigation.view.lego.LegoFloatingBottomNavBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class v extends kotlin.jvm.internal.p implements Function0 {
    public v(LegoFloatingBottomNavBar legoFloatingBottomNavBar) {
        super(0, legoFloatingBottomNavBar, LegoFloatingBottomNavBar.class, "onFlyoutHidden", "onFlyoutHidden()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LegoFloatingBottomNavBar legoFloatingBottomNavBar = (LegoFloatingBottomNavBar) this.receiver;
        Object obj = legoFloatingBottomNavBar.f49958f.get(legoFloatingBottomNavBar.f49961i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        i iVar = (i) ((y) obj);
        iVar.getClass();
        iVar.setContentDescription(legoFloatingBottomNavBar.getResources().getString(iVar.f110048d.f106389j));
        return Unit.f80348a;
    }
}
