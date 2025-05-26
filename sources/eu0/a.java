package eu0;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import au0.h;
import c2.m4;
import ck2.i;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.so;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.vn0;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinEditablePageLite;
import com.pinterest.feature.ideaPinCreation.videotrimming.view.IdeaPinVideoTrimmingTimeScale;
import fu0.d;
import g0.e;
import java.util.ArrayList;
import java.util.Iterator;
import kh2.k3;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ql2.k;
import tb0.p;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60162i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f60163j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i13) {
        super(1);
        this.f60162i = i13;
        this.f60163j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        vn0 mediaList;
        int i13 = this.f60162i;
        c cVar = this.f60163j;
        switch (i13) {
            case 0:
                ln0 ln0Var = (ln0) obj;
                cVar.f60172h = tp.e(ln0Var.y(), null, null, null, null, null, null, null, null, null, null, null, null, 4095);
                if (cVar.f60171g == null) {
                    tp y13 = ln0Var.y();
                    cVar.f60171g = y13;
                    du0.a aVar = (du0.a) cVar.getView();
                    hv0.c page = cVar.q3(y13, k3.a0(ln0Var));
                    d dVar = (d) aVar;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(page, "page");
                    dVar.f62980r0 = page.f70447c;
                    vn0 vn0Var = page.f70445a;
                    dVar.f62978p0 = vn0Var;
                    dVar.f62979q0 = ig1.b.e0(vn0Var);
                    dVar.f62981s0 = page.f70446b;
                    IdeaPinEditablePageLite Y7 = dVar.Y7();
                    so soVar = page.f70449e;
                    Y7.Z(soVar);
                    RoundedCornersLayout roundedCornersLayout = dVar.f62970h0;
                    if (roundedCornersLayout == null) {
                        Intrinsics.r("playerViewContainer");
                        throw null;
                    }
                    ViewGroup.LayoutParams layoutParams = roundedCornersLayout.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.G = soVar.toString();
                    roundedCornersLayout.setLayoutParams(layoutParams2);
                    dVar.Y7().o0(page.f70452h);
                    dVar.Y7().k0(page.f70451g);
                    dVar.Y7().B0(dVar.f62980r0, dVar.f62979q0, dVar.f62981s0, false);
                    dVar.Y7().d0(page.f70450f);
                    IdeaPinVideoTrimmingTimeScale ideaPinVideoTrimmingTimeScale = dVar.f62974l0;
                    if (ideaPinVideoTrimmingTimeScale != null) {
                        ideaPinVideoTrimmingTimeScale.T(vn0Var.v());
                    }
                    tp tpVar = cVar.f60172h;
                    if (tpVar != null && (mediaList = tpVar.getMediaList()) != null) {
                        ArrayList e03 = ig1.b.e0(mediaList);
                        Iterator it = e03.iterator();
                        long j13 = 0;
                        while (it.hasNext()) {
                            j13 += ((bo0) it.next()).f36143i;
                        }
                        float f13 = (j13 * 1.0f) / 8;
                        k it2 = ql2.s.q(0, 8).iterator();
                        while (it2.f104109c) {
                            int b13 = it2.b();
                            Pair k03 = ig1.b.k0(ml2.c.d((f13 / 2) + (b13 * f13)), e03);
                            if (k03 != null) {
                                int intValue = ((Number) k03.f80346a).intValue();
                                long longValue = ((Number) k03.f80347b).longValue();
                                k01 videoItem = ((bo0) e03.get(intValue)).getVideoItem();
                                if (videoItem != null) {
                                    ol1.d dVar2 = new ol1.d(new e(cVar, videoItem.e(), longValue * 1000, 2), 2);
                                    Intrinsics.checkNotNullExpressionValue(dVar2, "create(...)");
                                    xj2.c F = dVar2.H(tk2.e.f118016b).A(wj2.c.a()).F(new h(15, new m4(cVar, b13, 9)), new h(16, b.f60164i), i.f27923c, i.f27924d);
                                    Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
                                    cVar.addDisposable(F);
                                }
                            }
                        }
                    }
                }
                cVar.f60170f = ln0Var;
                cVar.u3();
                return Unit.f80348a;
            default:
                cVar.f60166b.q((Throwable) obj, "StoryPinBaseEditablePresenter: failed to fetch storyPinLocalData", p.IDEA_PINS_CREATION);
                return Unit.f80348a;
        }
    }
}
