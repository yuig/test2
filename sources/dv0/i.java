package dv0;

import android.app.Application;
import android.content.Context;
import com.pinterest.api.model.jq;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.nq;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.so;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.zq;
import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import java.util.Calendar;
import java.util.Date;
import kh2.g0;
import kh2.k3;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56339i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f56340j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, int i13) {
        super(1);
        this.f56339i = i13;
        this.f56340j = kVar;
    }

    public final void b(ln0 it) {
        tp pageData;
        tp pageData2;
        int i13 = this.f56339i;
        int i14 = 13;
        k kVar = this.f56340j;
        switch (i13) {
            case 0:
                if (Intrinsics.d(it, kVar.f56361t)) {
                    return;
                }
                kVar.f56361t = it;
                Date scheduledDate = it.getScheduledDate();
                Calendar calendar = kVar.f56363v;
                if (scheduledDate != null) {
                    calendar.setTime(scheduledDate);
                    kVar.G3();
                }
                kVar.f56352k.c(it.y(), kVar.f56357p.f15145a.f15146a, it.q(), false, true);
                kVar.D3(it);
                ln0 ln0Var = kVar.f56361t;
                if (ln0Var != null && (pageData2 = ln0Var.getPageData()) != null) {
                    for (qq qqVar : pageData2.getOverlayBlocks()) {
                        if (qqVar instanceof nq) {
                            nq nqVar = (nq) qqVar;
                            if (g0.e0(nqVar.getStickerDetails())) {
                                zq stickerDetails = nqVar.getStickerDetails();
                                nt0.d dVar = kVar.f56356o;
                                if (!dVar.d(stickerDetails)) {
                                    dVar.a(nqVar.getStickerDetails(), nt0.c.f92286j, nt0.c.f92287k);
                                }
                            }
                        }
                    }
                }
                ln0 ln0Var2 = kVar.f56361t;
                if (ln0Var2 != null && (pageData = ln0Var2.getPageData()) != null) {
                    for (qq qqVar2 : pageData.getOverlayBlocks()) {
                        if (qqVar2 instanceof jq) {
                            kVar.f56355n.h(((jq) qqVar2).getBoardId(), n00.b.a(n00.c.BOARD_VIEW)).r(tk2.e.f118017c).l(wj2.c.a()).o(new mu0.a(13, c.f56303q), new mu0.a(14, new r0(12, kVar, qqVar2)));
                        }
                    }
                }
                Date scheduledDate2 = it.getScheduledDate();
                if (scheduledDate2 != null) {
                    calendar.setTime(scheduledDate2);
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                ln0 ln0Var3 = kVar.f56361t;
                if (ln0Var3 != null) {
                    kVar.D3(ln0Var3);
                    return;
                }
                return;
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                kVar.f56352k.c(it.y(), kVar.f56357p.f15145a.f15146a, it.q(), false, true);
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                kVar.f56362u.clear();
                i92.k kVar2 = ((ev0.l) ((av0.d) kVar.getView())).A0;
                if (kVar2 == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                kVar2.k(aq1.h.idea_pin_board_sticker_removed);
                ln0 ln0Var4 = kVar.f56361t;
                if (ln0Var4 != null) {
                    av0.d dVar2 = (av0.d) kVar.getView();
                    tp page = ln0Var4.y();
                    so aspectRatio = k3.a0(ln0Var4);
                    ev0.l lVar = (ev0.l) dVar2;
                    lVar.getClass();
                    Intrinsics.checkNotNullParameter(page, "page");
                    Intrinsics.checkNotNullParameter(aspectRatio, "aspectRatio");
                    Context applicationContext = lVar.requireContext().getApplicationContext();
                    Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
                    Context requireContext = lVar.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    s0.E((Application) applicationContext, requireContext, page, aspectRatio, page.getCoverImageData()).r(tk2.e.f118017c).l(wj2.c.a()).o(new ev0.g(2, new r0(i14, lVar, page)), new ev0.g(3, new ev0.h(lVar, 0)));
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k kVar = this.f56340j;
        int i13 = this.f56339i;
        switch (i13) {
            case 0:
                b((ln0) obj);
                break;
            case 1:
                b((ln0) obj);
                break;
            case 2:
                b((ln0) obj);
                break;
            case 3:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 3:
                        kVar.z3(true);
                        break;
                    default:
                        kVar.f56348g.q(th3, "IdeaPinCreationMetadataPresenter: failed to fetch storyPinLocalData", tb0.p.IDEA_PINS_CREATION);
                        kVar.z3(true);
                        break;
                }
                break;
            case 4:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 3:
                        kVar.z3(true);
                        break;
                    default:
                        kVar.f56348g.q(th4, "IdeaPinCreationMetadataPresenter: failed to fetch storyPinLocalData", tb0.p.IDEA_PINS_CREATION);
                        kVar.z3(true);
                        break;
                }
                break;
            default:
                b((ln0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
