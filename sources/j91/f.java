package j91;

import cn1.o;
import cn1.q;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.feature.sendshare.view.ContactSearchAndSelectModalView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.text.GestaltText;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import m60.u;

/* loaded from: classes5.dex */
public final /* synthetic */ class f implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContactSearchAndSelectModalView f75121b;

    public /* synthetic */ f(ContactSearchAndSelectModalView contactSearchAndSelectModalView, int i13) {
        this.f75120a = i13;
        this.f75121b = contactSearchAndSelectModalView;
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        GestaltIconButton gestaltIconButton;
        int i13 = this.f75120a;
        ContactSearchAndSelectModalView this$0 = this.f75121b;
        switch (i13) {
            case 0:
                int i14 = ContactSearchAndSelectModalView.G;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                int i15 = 1;
                if (event instanceof q) {
                    if (this$0.B) {
                        this$0.D.a(f1.START_TYPING, null, false, true);
                        this$0.B = false;
                    }
                    String str = ((q) event).f28232c;
                    if (str == null) {
                        str = "";
                    }
                    String obj = z.j(str) ^ true ? StringsKt.i0(str).toString() : "";
                    dr.k kVar = this$0.f48074n;
                    if (kVar == null) {
                        Intrinsics.r("adapter");
                        throw null;
                    }
                    kVar.g(obj);
                    this$0.D.h0(f1.SEARCH_SOCIAL_TYPEAHEAD, u0.SEARCH_CONTACT_INPUT, g0.SOCIAL_TYPEAHEAD_SUGGESTIONS, null, z0.f(new Pair("entered_query", obj)), null, null, false);
                    return;
                }
                if (event instanceof o) {
                    boolean z13 = ((o) event).f28229c;
                    GestaltSearchField gestaltSearchField = this$0.f48075o;
                    if (gestaltSearchField == null) {
                        Intrinsics.r("searchEt");
                        throw null;
                    }
                    gestaltSearchField.I0();
                    g91.c cVar = this$0.f48073m;
                    if (cVar == null) {
                        Intrinsics.r("contactType");
                        throw null;
                    }
                    if (cVar == g91.c.RECIPIENT && (gestaltIconButton = this$0.f48078r) != null) {
                        com.bumptech.glide.c.d0(gestaltIconButton);
                    }
                    boolean z14 = !z13;
                    u.f85943a.d(new pg0.z(z14));
                    if (z13) {
                        GestaltIconButton gestaltIconButton2 = this$0.f48077q;
                        if (gestaltIconButton2 != null) {
                            com.bumptech.glide.c.u1(gestaltIconButton2);
                        }
                    } else {
                        GestaltIconButton gestaltIconButton3 = this$0.f48077q;
                        if (gestaltIconButton3 != null) {
                            com.bumptech.glide.c.d0(gestaltIconButton3);
                        }
                    }
                    this$0.i(z13);
                    BaseModalViewWrapper baseModalViewWrapper = this$0.f48072l;
                    if (baseModalViewWrapper == null) {
                        Intrinsics.r("modalViewWrapper");
                        throw null;
                    }
                    baseModalViewWrapper.q(z14);
                    if (this$0.f48085y) {
                        if (z13) {
                            GestaltIconButton gestaltIconButton4 = this$0.f48077q;
                            if (gestaltIconButton4 != null) {
                                gestaltIconButton4.u(new f(this$0, i15));
                            }
                            GestaltSearchField gestaltSearchField2 = this$0.f48075o;
                            if (gestaltSearchField2 == null) {
                                Intrinsics.r("searchEt");
                                throw null;
                            }
                            hf0.b.s(gestaltSearchField2);
                            g91.c cVar2 = this$0.f48073m;
                            if (cVar2 == null) {
                                Intrinsics.r("contactType");
                                throw null;
                            }
                            if (cVar2 == g91.c.COLLABORATOR) {
                                BaseModalViewWrapper baseModalViewWrapper2 = this$0.f48072l;
                                if (baseModalViewWrapper2 == null) {
                                    Intrinsics.r("modalViewWrapper");
                                    throw null;
                                }
                                baseModalViewWrapper2.q(z13);
                            }
                            GestaltText gestaltText = this$0.f48080t;
                            if (gestaltText != null) {
                                gestaltText.i(i.f75128n);
                            }
                            hp.d dVar = this$0.f48082v;
                            if (dVar != null) {
                                dVar.p3();
                                return;
                            }
                            return;
                        }
                        GestaltSearchField gestaltSearchField3 = this$0.f48075o;
                        if (gestaltSearchField3 == null) {
                            Intrinsics.r("searchEt");
                            throw null;
                        }
                        hf0.b.k(gestaltSearchField3);
                        BaseModalViewWrapper baseModalViewWrapper3 = this$0.f48072l;
                        if (baseModalViewWrapper3 == null) {
                            Intrinsics.r("modalViewWrapper");
                            throw null;
                        }
                        baseModalViewWrapper3.q(false);
                        BaseModalViewWrapper baseModalViewWrapper4 = this$0.f48072l;
                        if (baseModalViewWrapper4 == null) {
                            Intrinsics.r("modalViewWrapper");
                            throw null;
                        }
                        baseModalViewWrapper4.o(false);
                        this$0.i(true);
                        GestaltText gestaltText2 = this$0.f48080t;
                        if (gestaltText2 != null) {
                            gestaltText2.i(i.f75129o);
                        }
                        GestaltIconButton gestaltIconButton5 = this$0.f48078r;
                        if (gestaltIconButton5 != null) {
                            com.bumptech.glide.c.u1(gestaltIconButton5);
                        }
                        g91.c cVar3 = this$0.f48073m;
                        if (cVar3 == null) {
                            Intrinsics.r("contactType");
                            throw null;
                        }
                        if (cVar3 == g91.c.COLLABORATOR) {
                            BaseModalViewWrapper baseModalViewWrapper5 = this$0.f48072l;
                            if (baseModalViewWrapper5 == null) {
                                Intrinsics.r("modalViewWrapper");
                                throw null;
                            }
                            baseModalViewWrapper5.q(true);
                            BaseModalViewWrapper baseModalViewWrapper6 = this$0.f48072l;
                            if (baseModalViewWrapper6 != null) {
                                baseModalViewWrapper6.o(true);
                                return;
                            } else {
                                Intrinsics.r("modalViewWrapper");
                                throw null;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                int i16 = ContactSearchAndSelectModalView.G;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    GestaltSearchField gestaltSearchField4 = this$0.f48075o;
                    if (gestaltSearchField4 != null) {
                        gestaltSearchField4.clearFocus();
                        return;
                    } else {
                        Intrinsics.r("searchEt");
                        throw null;
                    }
                }
                return;
        }
    }
}
