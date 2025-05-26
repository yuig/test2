package vj0;

import com.pinterest.feature.board.BoardFeatureLocation;
import com.pinterest.navigation.Navigation;
import d7.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f125915i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f125916j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i13) {
        super(0);
        this.f125915i = i13;
        this.f125916j = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f125915i;
        b bVar = this.f125916j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(com.bumptech.glide.d.G(bVar, "com.pinterest.EXTRA_ABOUT_AMB_CAN_NAVIGATE_TO_OPTIONS", false));
            default:
                g.s(Navigation.w1(BoardFeatureLocation.ABOUT_BOARD_RECOMMENDATIONS_MODAL), bVar.f7());
                return Unit.f80348a;
        }
    }
}
