package tj0;

import com.pinterest.feature.board.BoardFeatureLocation;
import com.pinterest.navigation.Navigation;
import h32.f1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117866i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f117867j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, int i13) {
        super(0);
        this.f117866i = i13;
        this.f117867j = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f117866i) {
            case 0:
                m263invoke();
                break;
            case 1:
                m263invoke();
                break;
            default:
                m263invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m263invoke() {
        int i13 = this.f117866i;
        h hVar = this.f117867j;
        switch (i13) {
            case 0:
                d7.g.s(Navigation.w1(BoardFeatureLocation.BOARD_MORE_IDEAS_BOTTOM_SHEET), hVar.f7());
                break;
            case 1:
                mj0.a aVar = hVar.X0;
                if (aVar != null) {
                    nx.d0.B(((pj0.s) aVar).getPinalytics(), f1.BOTTOM_SHEET_SNAP_DEFAULT, null, null, null, 30);
                    break;
                }
                break;
            default:
                mj0.a aVar2 = hVar.X0;
                if (aVar2 != null) {
                    nx.d0.B(((pj0.s) aVar2).getPinalytics(), f1.BOTTOM_SHEET_SNAP_MINIMIZED, null, null, null, 30);
                    break;
                }
                break;
        }
    }
}
