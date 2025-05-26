package tc0;

import com.pinterest.feature.board.redesign.common.SavedContentPreviewModuleView;
import com.pinterest.feature.board.redesign.landing.components.BoardLandingHeaderView;
import com.pinterest.feature.board.redesign.landing.components.SectionHeaderView;
import com.pinterest.feature.profile.boardlesspins.components.IdeaPreviewCarouselView;
import com.pinterest.feature.profile.emptystate.EmptyStateBannerView;
import com.pinterest.feature.profile.filters.FilterBarView;
import com.pinterest.feature.profile.pills.view.PillBarView;
import com.pinterest.feature.profile.pills.view.PillView;
import com.pinterest.feature.search.visual.lens.view.RoomStylePickerView;
import do2.r2;
import kh2.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import uc0.s2;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117271i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f117272j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f117273k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, int i13, int i14) {
        super(2);
        this.f117271i = i14;
        this.f117273k = obj;
        this.f117272j = i13;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f117271i;
        int i15 = this.f117272j;
        Object obj = this.f117273k;
        switch (i14) {
            case 0:
                gh0.b.o(i2.u.p(i15 | 1), oVar, (String) obj);
                break;
            case 1:
                kh2.j.d((r2) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 2:
                kh2.n.f((uc0.s0) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 3:
                j1.q((s2) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 4:
                cj0.f.a((cj0.f) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 5:
                ((SavedContentPreviewModuleView) obj).b(oVar, i2.u.p(i15 | 1));
                break;
            case 6:
                qm0.p0.k9((qm0.p0) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 7:
                ((BoardLandingHeaderView) obj).b(oVar, i2.u.p(i15 | 1));
                break;
            case 8:
                ((SectionHeaderView) obj).b(oVar, i2.u.p(i15 | 1));
                break;
            case 9:
                dn.c.i((yy0.d) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 10:
                dn.c.h((yy0.f0) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 11:
                ((IdeaPreviewCarouselView) obj).b(oVar, i2.u.p(i15 | 1));
                break;
            case 12:
                ((EmptyStateBannerView) obj).b(oVar, i2.u.p(i15 | 1));
                break;
            case 13:
                ((FilterBarView) obj).b(oVar, i2.u.p(i15 | 1));
                break;
            case 14:
                ((PillBarView) obj).b(oVar, i2.u.p(i15 | 1));
                break;
            case 15:
                ((PillView) obj).b(oVar, i2.u.p(i15 | 1));
                break;
            case 16:
                ((RoomStylePickerView) obj).b(oVar, i2.u.p(i15 | 1));
                break;
            default:
                br1.e0.a((br1.f) obj, oVar, i2.u.p(i15 | 1));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f117271i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 2:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 3:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 4:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 5:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 6:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 7:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 8:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 9:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 10:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 11:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 12:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 13:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 14:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 15:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 16:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
