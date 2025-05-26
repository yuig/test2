package iq0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import m60.t0;
import pw0.d0;
import pw0.e0;
import pw0.l;
import pw0.m;
import sw0.j0;

/* loaded from: classes5.dex */
public final class c implements ek.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yk1.k f73393b;

    public /* synthetic */ c(yk1.k kVar, int i13) {
        this.f73392a = i13;
        this.f73393b = kVar;
    }

    @Override // ek.c
    public final void a(ek.e tab) {
        switch (this.f73392a) {
            case 0:
                Intrinsics.checkNotNullParameter(tab, "tab");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(tab, "tab");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(tab, "tab");
                break;
            default:
                Intrinsics.checkNotNullParameter(tab, "tab");
                break;
        }
    }

    @Override // ek.c
    public final void b(ek.e tab) {
        switch (this.f73392a) {
            case 0:
                Intrinsics.checkNotNullParameter(tab, "tab");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(tab, "tab");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(tab, "tab");
                break;
            default:
                Intrinsics.checkNotNullParameter(tab, "tab");
                break;
        }
    }

    @Override // ek.c
    public final void c(ek.e tab) {
        u0 u0Var;
        u0 u0Var2;
        int i13 = this.f73392a;
        yk1.k kVar = this.f73393b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(tab, "tab");
                hq0.e eVar = ((e) kVar).f73399v0;
                if (eVar != null) {
                    eVar.p3(tab.f59128e);
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(tab, "tab");
                j0 j0Var = (j0) kVar;
                d0 d0Var = j0Var.f115493x1;
                if (d0Var != null) {
                    int i14 = tab.f59128e;
                    m action = new m(i14);
                    qw0.j jVar = (qw0.j) d0Var;
                    Intrinsics.checkNotNullParameter(action, "action");
                    l lVar = (l) jVar.f105296r.get(i14);
                    if (lVar.f101522c != jVar.f105297s) {
                        int i15 = ct1.b.media_gallery_tab_all;
                        int i16 = lVar.f101520a;
                        if (i16 == i15) {
                            u0Var2 = u0.STORY_PIN_PHOTO_PICKER_ALL;
                        } else if (i16 == ct1.b.media_gallery_tab_photos) {
                            u0Var2 = u0.STORY_PIN_PHOTO_PICKER_PHOTO;
                        } else if (i16 == t0.media_gallery_tab_videos) {
                            u0Var2 = u0.STORY_PIN_PHOTO_PICKER_VIDEO;
                        } else {
                            u0Var = null;
                            jVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : null, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                            jVar.f105297s = lVar.f101522c;
                            ((j0) ((e0) jVar.getView())).W8();
                        }
                        u0Var = u0Var2;
                        jVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : null, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        jVar.f105297s = lVar.f101522c;
                        ((j0) ((e0) jVar.getView())).W8();
                    }
                }
                r rVar = j0Var.N0;
                if (rVar != null) {
                    rVar.h("PREF_STORY_PIN_MEDIA_GALLERY_TAB", tab.f59128e);
                    return;
                } else {
                    Intrinsics.r("prefsManagerUser");
                    throw null;
                }
            case 2:
                Intrinsics.checkNotNullParameter(tab, "tab");
                yx0.h hVar = ((zx0.f) kVar).f143022y0;
                if (hVar != null) {
                    int i17 = tab.f59128e;
                    hVar.r3(i17);
                    nx.d0 d0Var2 = hVar.f140343i.f122379a;
                    i0 i0Var = new i0(d4.NEWS_HUB, a4.NEWS_HUB_FEED, null, g0.TAB_CAROUSEL, null, u0.TAB_CAROUSEL_TAB);
                    f1 f1Var = f1.TAP;
                    HashMap o13 = bs1.c.o(new Pair("grid_index", String.valueOf(i17)));
                    Intrinsics.f(d0Var2);
                    d0Var2.t(i0Var, null, null, f1Var, null, o13, false);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(tab, "tab");
                hf1.c cVar = ((if1.d) kVar).f72236q0;
                if (cVar != null) {
                    cVar.q3(tab.f59128e);
                    return;
                }
                return;
        }
    }
}
