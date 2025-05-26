package tq;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.activity.pin.view.pdp.PdpCloseupCarouselView;
import com.pinterest.ads.onetap.view.CloseupCarouselView;
import com.pinterest.feature.board.detail.moreboardsview.BoardMoreBoardsView;
import com.pinterest.feature.conversation.view.GifReactionTrayView;
import com.pinterest.oneBarLibrary.container.view.OneBarContainer;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import de1.p0;
import fd1.t0;
import fd1.v0;
import lh0.l2;
import lh0.z0;
import lq0.k1;
import so.c6;
import so.jb;
import so.oa;
import so.s8;
import x02.i2;

/* loaded from: classes3.dex */
public abstract class a extends BaseRecyclerContainerView {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f118795b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f118796c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, int i13) {
        super(context);
        this.f118795b = i13;
        if (i13 == 5) {
            super(context);
            inject();
        } else if (i13 == 6) {
            super(context);
            inject();
        } else if (i13 != 7) {
            inject();
        } else {
            super(context);
            inject();
        }
    }

    @Override // hb2.h
    public final void inject() {
        switch (this.f118795b) {
            case 0:
                if (!this.f118796c) {
                    this.f118796c = true;
                    PdpCloseupCarouselView pdpCloseupCarouselView = (PdpCloseupCarouselView) this;
                    jb jbVar = (jb) ((u) generatedComponent());
                    pdpCloseupCarouselView.videoViewabilityRecyclerListenerProvider = jbVar.f113494l;
                    s8 s8Var = jbVar.f113485c;
                    pdpCloseupCarouselView.f35061r = s8Var.j5();
                    oa oaVar = jbVar.f113483a;
                    pdpCloseupCarouselView.f35062s = (nx.f0) oaVar.f113747j2.get();
                    pdpCloseupCarouselView.f35063t = s8Var.a6();
                    pdpCloseupCarouselView.f35064u = (nx.b0) oaVar.R8.get();
                    pdpCloseupCarouselView.f35065v = (ur.a) oaVar.Kb.get();
                    break;
                }
                break;
            case 1:
                if (!this.f118796c) {
                    this.f118796c = true;
                    CloseupCarouselView closeupCarouselView = (CloseupCarouselView) this;
                    jb jbVar2 = (jb) ((iv.d) generatedComponent());
                    closeupCarouselView.videoViewabilityRecyclerListenerProvider = jbVar2.f113494l;
                    oa oaVar2 = jbVar2.f113483a;
                    closeupCarouselView.f35437x = (nx.f0) oaVar2.f113747j2.get();
                    s8 s8Var2 = jbVar2.f113485c;
                    closeupCarouselView.f35438y = new l2((z0) s8Var2.f114255d.D0.get());
                    closeupCarouselView.f35439z = (i2) oaVar2.F3.get();
                    closeupCarouselView.A = (m60.w) oaVar2.f113885r0.get();
                    closeupCarouselView.B = (uj2.q) oaVar2.f113947u9.get();
                    closeupCarouselView.C = s8Var2.a6();
                    closeupCarouselView.D = jbVar2.f();
                    break;
                }
                break;
            case 2:
                if (!this.f118796c) {
                    this.f118796c = true;
                    pi0.f fVar = (pi0.f) this;
                    jb jbVar3 = (jb) ((pi0.g) generatedComponent());
                    fVar.videoViewabilityRecyclerListenerProvider = jbVar3.f113494l;
                    fVar.f100188g = (qi0.f) jbVar3.f113497o.get();
                    fVar.f100189h = (qi0.i) jbVar3.f113498p.get();
                    fVar.f100190i = (qi0.a) jbVar3.f113499q.get();
                    s8 s8Var3 = jbVar3.f113485c;
                    fVar.f100191j = (l51.a) s8Var3.X1.get();
                    fVar.M = (c6) s8Var3.f114447q.get();
                    break;
                }
                break;
            case 3:
                if (!this.f118796c) {
                    this.f118796c = true;
                    BoardMoreBoardsView boardMoreBoardsView = (BoardMoreBoardsView) this;
                    jb jbVar4 = (jb) ((el0.f) generatedComponent());
                    boardMoreBoardsView.videoViewabilityRecyclerListenerProvider = jbVar4.f113494l;
                    boardMoreBoardsView.f45235d = (m60.w) jbVar4.f113483a.f113885r0.get();
                    break;
                }
                break;
            case 4:
                if (!this.f118796c) {
                    this.f118796c = true;
                    ((GifReactionTrayView) this).videoViewabilityRecyclerListenerProvider = ((jb) ((k1) generatedComponent())).f113494l;
                    break;
                }
                break;
            case 5:
                if (!this.f118796c) {
                    this.f118796c = true;
                    ((t0) this).videoViewabilityRecyclerListenerProvider = ((jb) ((v0) generatedComponent())).f113494l;
                    break;
                }
                break;
            case 6:
                if (!this.f118796c) {
                    this.f118796c = true;
                    ((de1.s) this).videoViewabilityRecyclerListenerProvider = ((jb) ((de1.y) generatedComponent())).f113494l;
                    break;
                }
                break;
            case 7:
                if (!this.f118796c) {
                    this.f118796c = true;
                    ((de1.l0) this).videoViewabilityRecyclerListenerProvider = ((jb) ((p0) generatedComponent())).f113494l;
                    break;
                }
                break;
            default:
                if (!this.f118796c) {
                    this.f118796c = true;
                    ((OneBarContainer) this).videoViewabilityRecyclerListenerProvider = ((jb) ((qv1.e) generatedComponent())).f113494l;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13);
        this.f118795b = i14;
        if (i14 == 1) {
            super(context, attributeSet, i13);
            inject();
            return;
        }
        if (i14 == 8) {
            super(context, attributeSet, i13);
            inject();
        } else if (i14 == 3) {
            super(context, attributeSet, i13);
            inject();
        } else if (i14 != 4) {
            inject();
        } else {
            super(context, attributeSet, i13);
            inject();
        }
    }
}
