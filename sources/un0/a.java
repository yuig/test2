package un0;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.y;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class a extends p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122818a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Object obj, int i13) {
        super(0, obj, h.class, "onEditBoardSectionClicked", "onEditBoardSectionClicked()V", 0);
        this.f122818a = i13;
        if (i13 == 1) {
            super(0, obj, h.class, "onMergeBoardSectionClicked", "onMergeBoardSectionClicked()V", 0);
        } else if (i13 != 2) {
        } else {
            super(0, obj, h.class, "isEligibleForMoreIdeasOnOthersBoard", "isEligibleForMoreIdeasOnOthersBoard()Z", 0);
        }
    }

    public final void h() {
        switch (this.f122818a) {
            case 0:
                h hVar = (h) this.receiver;
                hVar.getPinalytics().X(u0.BOARD_SECTION_EDIT_BUTTON);
                NavigationImpl z03 = Navigation.z0((ScreenLocation) y.f51573d.getValue(), hVar.f122834b);
                z03.m0("com.pinterest.EXTRA_BOARD_ID", hVar.f122833a);
                hVar.F.d(z03);
                break;
            default:
                h hVar2 = (h) this.receiver;
                hVar2.getPinalytics().X(u0.BOARD_MERGE_BUTTON);
                NavigationImpl z04 = Navigation.z0(y.d(), hVar2.f122833a);
                z04.m0("com.pinterest.EXTRA_BOARD_SECTION_ID", hVar2.f122834b);
                hVar2.F.d(z04);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f122818a) {
            case 0:
                h();
                return Unit.f80348a;
            case 1:
                h();
                return Unit.f80348a;
            default:
                return Boolean.valueOf(((h) this.receiver).B3());
        }
    }
}
