package q71;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.typeahead.view.TypeaheadGestaltSearchBarContainer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class c1 implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TypeaheadGestaltSearchBarContainer f102705b;

    public /* synthetic */ c1(TypeaheadGestaltSearchBarContainer typeaheadGestaltSearchBarContainer, int i13) {
        this.f102704a = i13;
        this.f102705b = typeaheadGestaltSearchBarContainer;
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        t tVar;
        d1 d1Var;
        d1 d1Var2;
        int i13 = this.f102704a;
        TypeaheadGestaltSearchBarContainer this$0 = this.f102705b;
        switch (i13) {
            case 0:
                int i14 = TypeaheadGestaltSearchBarContainer.f47909e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof xl1.a) {
                    this$0.f47910a.clearFocus();
                    d1 d1Var3 = this$0.f47912c;
                    if (d1Var3 != null) {
                        d1Var3.H1();
                        break;
                    }
                }
                break;
            default:
                int i15 = TypeaheadGestaltSearchBarContainer.f47909e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (!(event instanceof cn1.q)) {
                    if (!(event instanceof cn1.r)) {
                        if (!(event instanceof cn1.o)) {
                            if (!(event instanceof cn1.u)) {
                                if (!(event instanceof xl1.a)) {
                                    if (!(event instanceof cn1.p)) {
                                        if ((event instanceof cn1.t) && (tVar = this$0.f47913d) != null) {
                                            x xVar = tVar.f102763a;
                                            xVar.K0 = true;
                                            x.U8(xVar);
                                            xVar.s7().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.SEARCH_PINS, (r18 & 2) != 0 ? null : h32.u0.VOICE_SEARCH_CANCELLED, (r18 & 4) != 0 ? null : h32.g0.SEARCH_BOX, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                                            break;
                                        }
                                    } else {
                                        t tVar2 = this$0.f47913d;
                                        if (tVar2 != null) {
                                            x xVar2 = tVar2.f102763a;
                                            xVar2.s7().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : h32.u0.SEARCH_BOX_VOICE_INPUT, (r18 & 4) != 0 ? null : h32.g0.SEARCH_BOX, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                                            xVar2.X8();
                                            break;
                                        }
                                    }
                                } else {
                                    this$0.f47910a.clearFocus();
                                    d1 d1Var4 = this$0.f47912c;
                                    if (d1Var4 != null) {
                                        d1Var4.H1();
                                        break;
                                    }
                                }
                            } else {
                                d1 d1Var5 = this$0.f47912c;
                                if (d1Var5 != null) {
                                    d1Var5.l();
                                    break;
                                }
                            }
                        } else if (this$0.f47912c != null) {
                            boolean z13 = ((cn1.o) event).f28229c;
                            break;
                        }
                    } else {
                        String str = ((cn1.r) event).f28234c;
                        if (str != null && (d1Var = this$0.f47912c) != null) {
                            d1Var.E0(str);
                            break;
                        }
                    }
                } else {
                    this$0.f47910a.I0();
                    cn1.q qVar = (cn1.q) event;
                    qVar.getClass();
                    String str2 = qVar.f28232c;
                    if (str2 != null) {
                        if (this$0.f47911b.length() == 0 && str2.length() > 0 && (d1Var2 = this$0.f47912c) != null) {
                            d1Var2.P0();
                        }
                        d1 d1Var6 = this$0.f47912c;
                        if (d1Var6 != null) {
                            d1Var6.Y(str2);
                        }
                        this$0.f47911b = str2;
                        break;
                    }
                }
                break;
        }
    }
}
