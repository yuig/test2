package xs;

import android.widget.LinearLayout;
import com.pinterest.ads.feature.owc.carting.bottomSheet.content.CartingLoadingView;
import com.pinterest.ads.feature.owc.carting.bottomSheet.content.CartingRetailerEmptyView;
import com.pinterest.ads.feature.owc.carting.bottomSheet.content.CartingRetailerErrorView;
import com.pinterest.ads.feature.owc.carting.bottomSheet.content.CartingRetailerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135713i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f135714j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i13) {
        super(0);
        this.f135713i = i13;
        this.f135714j = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f135713i) {
            case 0:
                m288invoke();
                break;
            case 1:
                m288invoke();
                break;
            case 2:
                m288invoke();
                break;
            case 3:
                m288invoke();
                break;
            case 4:
                m288invoke();
                break;
            case 5:
                m288invoke();
                break;
            default:
                m288invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m288invoke() {
        int i13 = this.f135713i;
        g gVar = this.f135714j;
        switch (i13) {
            case 0:
                LinearLayout linearLayout = gVar.f53208j;
                g.t0(gVar);
                break;
            case 1:
                CartingRetailerView cartingRetailerView = gVar.f135719w;
                g.t0(gVar);
                break;
            case 2:
                CartingRetailerErrorView cartingRetailerErrorView = gVar.f135721y;
                g.t0(gVar);
                break;
            case 3:
                CartingRetailerEmptyView cartingRetailerEmptyView = gVar.f135722z;
                g.t0(gVar);
                break;
            case 4:
                CartingLoadingView cartingLoadingView = gVar.f135720x;
                g.t0(gVar);
                break;
            case 5:
                gVar.Z(1.0f);
                gVar.D(3);
                break;
            default:
                bs1.c.X0(gVar.E.f135709a);
                bs1.c.U1(gVar.D.f135709a);
                break;
        }
    }
}
