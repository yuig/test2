package ru0;

import com.pinterest.api.model.qq;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.vn0;
import com.pinterest.api.model.vq;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import com.pinterest.feature.ideaPinCreation.duration.view.IdeaPinDurationDragger;
import dl1.t;
import h32.f1;
import h32.u0;
import java.util.Iterator;
import java.util.List;
import kh2.p2;
import kotlin.jvm.internal.Intrinsics;
import lh0.s1;
import pu0.k;
import pu0.u;
import pu0.w;
import pu0.x;
import pu0.y;
import uj2.q;
import uv0.p;
import xk2.m;
import xk2.n;
import yk1.v;

/* loaded from: classes5.dex */
public final class f extends eu0.c implements vf1.a {

    /* renamed from: j, reason: collision with root package name */
    public final s1 f109982j;

    /* renamed from: k, reason: collision with root package name */
    public String f109983k;

    /* renamed from: l, reason: collision with root package name */
    public k f109984l;

    /* renamed from: m, reason: collision with root package name */
    public final xk2.k f109985m;

    /* renamed from: n, reason: collision with root package name */
    public final xk2.k f109986n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String initialBlockId, du0.b presenterPinalytics, k overlayTransitionConfig, rw0.f mediaUtils, tb0.h crashReporting, v viewResources, q networkStateStream, ag1.b ideaPinComposeDataManager, t storyPinLocalDataRepository, s1 experiments) {
        super(mediaUtils, crashReporting, viewResources, presenterPinalytics, networkStateStream, ideaPinComposeDataManager, storyPinLocalDataRepository, experiments);
        Intrinsics.checkNotNullParameter(initialBlockId, "initialBlockId");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(overlayTransitionConfig, "overlayTransitionConfig");
        Intrinsics.checkNotNullParameter(mediaUtils, "mediaUtils");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(ideaPinComposeDataManager, "ideaPinComposeDataManager");
        Intrinsics.checkNotNullParameter(storyPinLocalDataRepository, "storyPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f109982j = experiments;
        this.f109983k = initialBlockId;
        this.f109984l = overlayTransitionConfig;
        n nVar = n.NONE;
        this.f109985m = m.a(nVar, new b(this, 0));
        this.f109986n = m.a(nVar, new b(this, 1));
    }

    @Override // eu0.c
    /* renamed from: B3, reason: merged with bridge method [inline-methods] */
    public final void r3(pu0.i view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        su0.i iVar = (su0.i) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        IdeaPinDurationDragger ideaPinDurationDragger = iVar.E0;
        if (ideaPinDurationDragger == null) {
            Intrinsics.r("draggerView");
            throw null;
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        ideaPinDurationDragger.f46439q = this;
        if (D3()) {
            iVar.g8(new pu0.e(new c(this, 0)));
        }
    }

    public final boolean D3() {
        return p.c(z3(this.f109983k)) && this.f109982j.c();
    }

    public final void F3(y action) {
        Intrinsics.checkNotNullParameter(action, "action");
        tp tpVar = null;
        if (action instanceof u) {
            k a13 = k.a(this.f109984l, ((u) action).f101426a, null, 11);
            this.f109984l = a13;
            tp tpVar2 = this.f60172h;
            if (tpVar2 != null) {
                tpVar = tp.h0(tpVar2, a13.f101396a, null, new e(action, 0), 2);
            }
            this.f60172h = tpVar;
            w3();
            ((su0.i) ((pu0.i) getView())).h8(this.f109984l);
            return;
        }
        if (action instanceof w) {
            k a14 = k.a(this.f109984l, null, ((w) action).f101428a, 7);
            this.f109984l = a14;
            tp tpVar3 = this.f60172h;
            if (tpVar3 != null) {
                tpVar = tp.h0(tpVar3, a14.f101396a, null, new e(action, 1), 2);
            }
            this.f60172h = tpVar;
            w3();
            ((su0.i) ((pu0.i) getView())).h8(this.f109984l);
            return;
        }
        if (action instanceof pu0.v) {
            getPinalytics().X(u0.STORY_PIN_TEXT_ANIMATE_IN_BUTTON);
            ((su0.i) ((pu0.i) getView())).d8((su0.t) this.f109985m.getValue(), this.f109983k);
            return;
        }
        if (action instanceof x) {
            getPinalytics().X(u0.STORY_PIN_TEXT_ANIMATE_OUT_BUTTON);
            ((su0.i) ((pu0.i) getView())).d8((su0.u) this.f109986n.getValue(), this.f109983k);
        }
    }

    public final void G3(qq qqVar) {
        if (D3()) {
            String id3 = qqVar.getConfig().getId();
            vq rotatedRect = qqVar.getConfig().getRotatedRect();
            this.f109984l = new k(id3, rotatedRect != null ? rotatedRect.a() : null, pu0.h.a(qqVar.getDurationConfig().getEnterTransitionType()), pu0.h.b(qqVar.getDurationConfig().getExitTransitionType()));
            ((su0.i) ((pu0.i) getView())).h8(this.f109984l);
        }
    }

    @Override // vf1.a
    public final void T2(float f13) {
        Long x33 = x3();
        if (x33 != null) {
            long longValue = x33.longValue();
            qq z33 = z3(this.f109983k);
            if (z33 == null) {
                return;
            }
            pu0.j jVar = new pu0.j(z33.getConfig().getId(), z33.getConfig().getType(), f0.h.L(longValue, f13), z33.getDurationConfig().g(longValue), longValue);
            ((su0.i) ((pu0.i) getView())).g8(new pu0.f(jVar));
        }
    }

    @Override // vf1.a
    public final void a1(float f13) {
        Long x33 = x3();
        if (x33 != null) {
            long longValue = x33.longValue();
            qq z33 = z3(this.f109983k);
            if (z33 == null) {
                return;
            }
            pu0.j jVar = new pu0.j(z33.getConfig().getId(), z33.getConfig().getType(), z33.getDurationConfig().getStartTimeMs(), f0.h.L(longValue, f13), longValue);
            ((su0.i) ((pu0.i) getView())).g8(new pu0.c(jVar));
        }
    }

    @Override // vf1.a
    public final void p2(float f13) {
        Long x33 = x3();
        if (x33 != null) {
            long longValue = x33.longValue();
            qq z33 = z3(this.f109983k);
            if (z33 == null) {
                return;
            }
            long L = f0.h.L(longValue, f13);
            tp tpVar = this.f60172h;
            tp tpVar2 = null;
            if (tpVar != null) {
                String str = this.f109983k;
                Intrinsics.f(str);
                tpVar2 = tpVar.f0(str, null, new w1.d(L, 6));
            }
            this.f60172h = tpVar2;
            w3();
            getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.STORY_PIN_END_TIME_CHANGE, (r18 & 2) != 0 ? null : p2.k0(z33.getConfig().getType()), (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
    }

    @Override // eu0.c
    public final hv0.g p3(qq overlayBlock) {
        Intrinsics.checkNotNullParameter(overlayBlock, "overlayBlock");
        return new hv0.g(overlayBlock, new r0(2, this, overlayBlock));
    }

    @Override // eu0.c
    public final void u3() {
        Long x33;
        qq z33 = z3(this.f109983k);
        if (z33 == null || (x33 = x3()) == null) {
            return;
        }
        long longValue = x33.longValue();
        ((su0.i) ((pu0.i) getView())).g8(new pu0.d(new pu0.j(z33.getConfig().getId(), z33.getConfig().getType(), z33.getDurationConfig().getStartTimeMs(), z33.getDurationConfig().g(longValue), longValue)));
        G3(z33);
    }

    public final Long x3() {
        vn0 mediaList;
        tp tpVar = this.f60172h;
        if (tpVar == null || (mediaList = tpVar.getMediaList()) == null) {
            return null;
        }
        return Long.valueOf(mediaList.v());
    }

    @Override // vf1.a
    public final void z2(float f13) {
        Long x33 = x3();
        if (x33 != null) {
            long longValue = x33.longValue();
            qq z33 = z3(this.f109983k);
            if (z33 == null) {
                return;
            }
            long L = f0.h.L(longValue, f13);
            long g13 = z33.getDurationConfig().g(longValue);
            tp tpVar = this.f60172h;
            tp tpVar2 = null;
            if (tpVar != null) {
                String str = this.f109983k;
                Intrinsics.f(str);
                tpVar2 = tpVar.f0(str, null, new d(L, g13));
            }
            this.f60172h = tpVar2;
            w3();
            getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.STORY_PIN_START_TIME_CHANGE, (r18 & 2) != 0 ? null : p2.k0(z33.getConfig().getType()), (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
    }

    public final qq z3(String str) {
        List overlayBlocks;
        tp tpVar = this.f60172h;
        Object obj = null;
        if (tpVar == null || (overlayBlocks = tpVar.getOverlayBlocks()) == null) {
            return null;
        }
        Iterator it = overlayBlocks.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.d(((qq) next).getConfig().getId(), str)) {
                obj = next;
                break;
            }
        }
        return (qq) obj;
    }
}
