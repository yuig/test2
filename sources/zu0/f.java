package zu0;

import android.content.Context;
import android.widget.LinearLayout;
import b11.l0;
import cn1.s;
import com.pinterest.api.model.m40;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.interesttagging.view.PinInterestTagView;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import f31.t;
import f31.y;
import h32.f1;
import h32.u0;
import java.util.HashMap;
import kh2.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.j0;
import m60.w;
import om1.l;
import u50.r;

/* loaded from: classes5.dex */
public final /* synthetic */ class f implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f142822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f142823c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f142824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f142825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f142826f;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13) {
        this.f142821a = i13;
        this.f142822b = obj;
        this.f142823c = obj2;
        this.f142824d = obj3;
        this.f142825e = obj4;
        this.f142826f = obj5;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        y yVar;
        switch (this.f142821a) {
            case 0:
                g this$0 = (g) this.f142822b;
                PinInterestTagView this_apply = (PinInterestTagView) this.f142823c;
                String id3 = (String) this.f142824d;
                String name = (String) this.f142825e;
                m40 tag = (m40) this.f142826f;
                int i13 = g.T0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(id3, "$id");
                Intrinsics.checkNotNullParameter(name, "$name");
                Intrinsics.checkNotNullParameter(tag, "$tag");
                Intrinsics.checkNotNullParameter(it, "it");
                LinearLayout linearLayout = this$0.I0;
                if (linearLayout == null) {
                    Intrinsics.r("selectedTagsView");
                    throw null;
                }
                linearLayout.removeView(this_apply);
                xu0.b bVar = this$0.M0;
                if (bVar != null) {
                    bVar.w3(id3);
                }
                HashMap x13 = a.a.x("pin_interest_id", id3, "pin_interest_name", name);
                x13.put("is_freeform_tag", String.valueOf(tag.l().booleanValue()));
                this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.PIN_INTEREST_TAG_DESELECT, (r18 & 2) != 0 ? null : u0.PIN_INTEREST_TAG, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : x13, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                return;
            case 1:
                b11.b this$02 = (b11.b) this.f142822b;
                f0 isReasonSent = (f0) this.f142823c;
                Context context = (Context) this.f142824d;
                w wVar = (w) this.f142825e;
                l0 reportReason = (l0) this.f142826f;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(isReasonSent, "$isReasonSent");
                Intrinsics.checkNotNullParameter(context, "$context");
                Intrinsics.checkNotNullParameter(reportReason, "$reportReason");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof rn1.f) {
                    synchronized (this$02) {
                        try {
                            if (!isReasonSent.f80424a) {
                                isReasonSent.f80424a = true;
                                Intrinsics.f(wVar);
                                this$02.b(wVar, reportReason);
                            }
                            Unit unit = Unit.f80348a;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                }
                return;
            default:
                r eventIntake = (r) this.f142822b;
                f31.h searchBarDisplayState = (f31.h) this.f142823c;
                c31.r this$03 = (c31.r) this.f142824d;
                j0 endIconOneEvent = (j0) this.f142825e;
                j0 endIconTwoEvent = (j0) this.f142826f;
                int i14 = c31.r.W0;
                Intrinsics.checkNotNullParameter(eventIntake, "$eventIntake");
                Intrinsics.checkNotNullParameter(searchBarDisplayState, "$searchBarDisplayState");
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(endIconOneEvent, "$endIconOneEvent");
                Intrinsics.checkNotNullParameter(endIconTwoEvent, "$endIconTwoEvent");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof s) {
                    searchBarDisplayState.getClass();
                    eventIntake.a(t.f61029a);
                }
                if (it instanceof l) {
                    int j13 = it.j();
                    GestaltStaticSearchBar gestaltStaticSearchBar = this$03.P0;
                    if (gestaltStaticSearchBar == null) {
                        Intrinsics.r("searchBar");
                        throw null;
                    }
                    Integer M = j.M(gestaltStaticSearchBar);
                    if (M != null && j13 == M.intValue()) {
                        y yVar2 = (y) endIconOneEvent.f80434a;
                        if (yVar2 != null) {
                            eventIntake.a(yVar2);
                            return;
                        }
                        return;
                    }
                    GestaltStaticSearchBar gestaltStaticSearchBar2 = this$03.P0;
                    if (gestaltStaticSearchBar2 == null) {
                        Intrinsics.r("searchBar");
                        throw null;
                    }
                    Integer N = j.N(gestaltStaticSearchBar2);
                    if (N == null || j13 != N.intValue() || (yVar = (y) endIconTwoEvent.f80434a) == null) {
                        return;
                    }
                    eventIntake.a(yVar);
                    return;
                }
                return;
        }
    }
}
