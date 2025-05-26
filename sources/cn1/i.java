package cn1;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import com.airbnb.lottie.LottieAnimationView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.text.GestaltText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rc0.t0;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f28197i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f28198j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ GestaltSearchField f28199k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar, GestaltSearchField gestaltSearchField) {
        super(1);
        this.f28197i = 1;
        this.f28198j = dVar;
        this.f28199k = gestaltSearchField;
    }

    public final void b(List list) {
        int i13 = this.f28197i;
        int i14 = 0;
        GestaltSearchField gestaltSearchField = this.f28199k;
        d dVar = this.f28198j;
        switch (i13) {
            case 7:
                List list2 = dVar.f28164m;
                rm1.i iVar = GestaltSearchField.f49499t;
                gestaltSearchField.getClass();
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        i14 |= ((Number) it.next()).intValue();
                    }
                    gestaltSearchField.S0().f16425p.setImeOptions(i14);
                    break;
                }
                break;
            case 8:
                List list3 = dVar.f28165n;
                rm1.i iVar2 = GestaltSearchField.f49499t;
                gestaltSearchField.getClass();
                if (list3 != null) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        i14 |= ((Number) it2.next()).intValue();
                    }
                    gestaltSearchField.S0().f16425p.setInputType(i14);
                    break;
                }
                break;
            default:
                List list4 = dVar.f28163l;
                rm1.i iVar3 = GestaltSearchField.f49499t;
                gestaltSearchField.getClass();
                if (list4 != null) {
                    gestaltSearchField.S0().setAutofillHints(list4.size() > 1 ? CollectionsKt.Z(list4, ",", null, null, 0, null, null, 62) : (String) CollectionsKt.firstOrNull(list4));
                    break;
                }
                break;
        }
    }

    public final void e(u50.i0 it) {
        int i13 = this.f28197i;
        CharSequence charSequence = null;
        GestaltSearchField gestaltSearchField = this.f28199k;
        d dVar = this.f28198j;
        switch (i13) {
            case 2:
                rm1.i iVar = GestaltSearchField.f49499t;
                SearchView S0 = gestaltSearchField.S0();
                u50.i0 i0Var = dVar.f28155d;
                if (i0Var != null) {
                    Context context = gestaltSearchField.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    charSequence = i0Var.a(context);
                }
                S0.K = charSequence;
                S0.z();
                break;
            case 3:
                rm1.i iVar2 = GestaltSearchField.f49499t;
                SearchView S02 = gestaltSearchField.S0();
                u50.i0 i0Var2 = dVar.f28155d;
                if (i0Var2 != null) {
                    Context context2 = gestaltSearchField.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    charSequence = i0Var2.a(context2);
                }
                S02.K = charSequence;
                S02.z();
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                u50.i0 i0Var3 = dVar.f28152a;
                rm1.i iVar3 = GestaltSearchField.f49499t;
                if (i0Var3 == null) {
                    gestaltSearchField.getClass();
                    break;
                } else {
                    Context context3 = gestaltSearchField.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    CharSequence a13 = i0Var3.a(context3);
                    Editable text = gestaltSearchField.S0().f16425p.getText();
                    Intrinsics.checkNotNullExpressionValue(text, "getQuery(...)");
                    if (!Intrinsics.d(a13, bs1.c.h2(text).f120559a)) {
                        SearchView S03 = gestaltSearchField.S0();
                        Context context4 = gestaltSearchField.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        S03.w(i0Var3.a(context4), false);
                        gestaltSearchField.Z();
                        break;
                    }
                }
                break;
        }
    }

    public final void f() {
        int i13 = this.f28197i;
        GestaltSearchField gestaltSearchField = this.f28199k;
        d dVar = this.f28198j;
        switch (i13) {
            case 12:
                f fVar = dVar.f28157f;
                rm1.i iVar = GestaltSearchField.f49499t;
                if (fVar == null) {
                    gestaltSearchField.getClass();
                    break;
                } else {
                    Context context = gestaltSearchField.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    GestaltIconButton u13 = kh2.j.w(fVar, context, f0.gestalt_search_trailing_icon_button).u(new t0(gestaltSearchField, 1));
                    bs1.c.X0(gestaltSearchField.F0());
                    gestaltSearchField.L0().addView(u13);
                    gestaltSearchField.f49522q = u13;
                    break;
                }
            default:
                f fVar2 = dVar.f28158g;
                if (gestaltSearchField.f49522q != null && fVar2 != null) {
                    Context context2 = gestaltSearchField.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    GestaltIconButton u14 = kh2.j.w(fVar2, context2, f0.gestalt_search_left_trailing_icon_button).u(new t0(gestaltSearchField, 2));
                    ViewGroup.LayoutParams layoutParams = u14.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        pp2.a.P0(marginLayoutParams, 0, 0, 0, 0);
                    }
                    bs1.c.X0(gestaltSearchField.F0());
                    gestaltSearchField.L0().removeView(gestaltSearchField.f49522q);
                    gestaltSearchField.L0().addView(u14);
                    gestaltSearchField.L0().addView(gestaltSearchField.f49522q);
                    gestaltSearchField.f49523r = u14;
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13;
        Unit unit;
        GestaltIconButton gestaltIconButton;
        GestaltButton gestaltButton;
        int i14 = this.f28197i;
        Unit unit2 = null;
        GestaltSearchField gestaltSearchField = this.f28199k;
        d dVar = this.f28198j;
        switch (i14) {
            case 0:
                d newState = (d) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                rm1.i iVar = GestaltSearchField.f49499t;
                gestaltSearchField.Y0(dVar, newState);
                break;
            case 1:
                ((Boolean) obj).getClass();
                if (dVar.f28170s) {
                    rm1.i iVar2 = GestaltSearchField.f49499t;
                    gestaltSearchField.S0().setBackgroundResource(e0.searchfield_bg_error);
                    u50.i0 i0Var = gestaltSearchField.G0().f28154c;
                    Context context = gestaltSearchField.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    gestaltSearchField.k0(i0Var.a(context).toString(), vn1.c.ERROR, new rm1.d(new rm1.e(rm1.n.WORKFLOW_STATUS_PROBLEM), rm1.c.ERROR, null, 0, null, 28));
                    GestaltText gestaltText = gestaltSearchField.f49516k;
                    if (gestaltText != null) {
                        gestaltText.sendAccessibilityEvent(16384);
                    }
                } else {
                    rm1.i iVar3 = GestaltSearchField.f49499t;
                    gestaltSearchField.b1();
                }
                break;
            case 2:
                e((u50.i0) obj);
                break;
            case 3:
                e((u50.i0) obj);
                break;
            case 4:
                e((u50.i0) obj);
                break;
            case 5:
                dn1.e it = (dn1.e) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                dn1.e eVar = dVar.f28162k;
                rm1.i iVar4 = GestaltSearchField.f49499t;
                gestaltSearchField.S0().setBackgroundResource(e0.searchfield_bg_default);
                int i15 = h.f28196a[eVar.ordinal()];
                if (i15 != 1) {
                    com.google.firebase.messaging.q qVar = gestaltSearchField.f49506a;
                    if (i15 == 2) {
                        i13 = 4;
                        c cVar = gestaltSearchField.G0().f28160i;
                        if (cVar == null) {
                            cVar = new c(GestaltSearchField.C, GestaltSearchField.f49504y, (u50.i0) null, dn1.a.LEADING_ICON_BUTTON, 20);
                        }
                        om1.c s03 = kh2.g0.s0(cVar);
                        if (gestaltSearchField.f49511f == null) {
                            Context context2 = gestaltSearchField.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            GestaltIconButton gestaltIconButton2 = new GestaltIconButton(context2, s03);
                            gestaltSearchField.f49511f = gestaltIconButton2;
                            gestaltSearchField.addView(gestaltIconButton2);
                            gm1.a aVar = (gm1.a) qVar.f33804b;
                            if (aVar != null && (gestaltIconButton = gestaltSearchField.f49511f) != null) {
                                gestaltIconButton.u(aVar);
                            }
                        }
                        GestaltIconButton gestaltIconButton3 = gestaltSearchField.f49511f;
                        if (gestaltIconButton3 != null) {
                            gestaltIconButton3.t(new dm1.h(s03, i13));
                        }
                        bs1.c.X0(gestaltSearchField.H0());
                        GestaltSearchField.T(gestaltSearchField, true, false, false, false, 14);
                    } else if (i15 == 3) {
                        i13 = 4;
                        g gVar = gestaltSearchField.G0().f28161j;
                        if (gVar == null) {
                            gVar = kh2.j.L();
                        }
                        Context context3 = gestaltSearchField.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        yl1.b r03 = kh2.g0.r0(gVar, context3);
                        if (gestaltSearchField.f49512g == null) {
                            Context context4 = gestaltSearchField.getContext();
                            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                            GestaltButton gestaltButton2 = new GestaltButton(context4, r03);
                            gestaltSearchField.f49512g = gestaltButton2;
                            gestaltSearchField.addView(gestaltButton2);
                            gm1.a aVar2 = (gm1.a) qVar.f33804b;
                            if (aVar2 != null && (gestaltButton = gestaltSearchField.f49512g) != null) {
                                gestaltButton.e(aVar2);
                            }
                        }
                        GestaltButton gestaltButton3 = gestaltSearchField.f49512g;
                        if (gestaltButton3 != null) {
                            gestaltButton3.d(new jw0.b(r03, 4));
                        }
                        GestaltSearchField.T(gestaltSearchField, false, true, false, false, 13);
                    } else if (i15 == 4) {
                        i13 = 4;
                        rm1.q qVar2 = GestaltSearchField.D;
                        om1.f fVar = GestaltSearchField.f49504y;
                        gestaltSearchField.d0(new c(qVar2, fVar, (u50.i0) null, dn1.a.END_ACTION_BUTTONS_ONE, 20), new c(GestaltSearchField.E, fVar, (u50.i0) null, dn1.a.END_ACTION_BUTTONS_TWO, 20));
                        GestaltSearchField.T(gestaltSearchField, false, false, true, true, 3);
                    } else if (i15 != 5) {
                        i13 = 4;
                    } else {
                        gestaltSearchField.d0(gestaltSearchField.G0().f28167p, gestaltSearchField.G0().f28168q);
                        i13 = 4;
                        GestaltSearchField.T(gestaltSearchField, false, false, true, true, 3);
                    }
                } else {
                    i13 = 4;
                    GestaltSearchField.T(gestaltSearchField, false, false, false, false, 15);
                }
                if (eVar != dn1.e.DEFAULT) {
                    androidx.constraintlayout.widget.p pVar = new androidx.constraintlayout.widget.p();
                    pVar.j(gestaltSearchField);
                    ArrayList arrayList = new ArrayList();
                    GestaltIconButton gestaltIconButton4 = gestaltSearchField.f49511f;
                    if (gestaltIconButton4 != null) {
                        arrayList.add(Integer.valueOf(gestaltIconButton4.getId()));
                    }
                    arrayList.add(Integer.valueOf(gestaltSearchField.S0().getId()));
                    GestaltButton gestaltButton4 = gestaltSearchField.f49512g;
                    if (gestaltButton4 != null) {
                        arrayList.add(Integer.valueOf(gestaltButton4.getId()));
                    }
                    GestaltIconButton gestaltIconButton5 = gestaltSearchField.f49513h;
                    if (gestaltIconButton5 != null) {
                        arrayList.add(Integer.valueOf(gestaltIconButton5.getId()));
                    }
                    GestaltIconButton gestaltIconButton6 = gestaltSearchField.f49514i;
                    if (gestaltIconButton6 != null) {
                        arrayList.add(Integer.valueOf(gestaltIconButton6.getId()));
                    }
                    int size = arrayList.size();
                    float[] fArr = new float[size];
                    for (int i16 = 0; i16 < size; i16++) {
                        fArr[i16] = 0.0f;
                    }
                    int indexOf = arrayList.indexOf(Integer.valueOf(gestaltSearchField.S0().getId()));
                    if (indexOf != -1) {
                        fArr[indexOf] = 1.0f;
                    }
                    pVar.u(CollectionsKt.E0(arrayList), fArr);
                    GestaltIconButton gestaltIconButton7 = gestaltSearchField.f49511f;
                    if (gestaltIconButton7 != null) {
                        pVar.l(gestaltIconButton7.getId(), 6, 0, 6);
                        pVar.m(gestaltIconButton7.getId(), 7, gestaltSearchField.S0().getId(), 6, gestaltSearchField.f49509d);
                        pVar.l(gestaltIconButton7.getId(), 3, gestaltSearchField.S0().getId(), 3);
                        pVar.l(gestaltIconButton7.getId(), i13, gestaltSearchField.S0().getId(), i13);
                        pVar.l(gestaltSearchField.S0().getId(), 6, gestaltIconButton7.getId(), 7);
                        unit = Unit.f80348a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        pVar.l(gestaltSearchField.S0().getId(), 6, 0, 6);
                    }
                    GestaltButton gestaltButton5 = gestaltSearchField.f49512g;
                    if (gestaltButton5 != null) {
                        pVar.m(gestaltButton5.getId(), 6, gestaltSearchField.S0().getId(), 7, gestaltSearchField.f49509d);
                        pVar.l(gestaltButton5.getId(), 3, gestaltSearchField.S0().getId(), 3);
                        pVar.l(gestaltButton5.getId(), i13, gestaltSearchField.S0().getId(), i13);
                        pVar.l(gestaltSearchField.S0().getId(), 7, gestaltButton5.getId(), 6);
                        unit2 = Unit.f80348a;
                    }
                    if (unit2 == null) {
                        pVar.l(gestaltSearchField.S0().getId(), 7, 0, 7);
                    }
                    GestaltIconButton gestaltIconButton8 = gestaltSearchField.f49513h;
                    if (gestaltIconButton8 != null) {
                        pVar.m(gestaltIconButton8.getId(), 6, gestaltSearchField.S0().getId(), 7, gestaltSearchField.f49509d);
                        pVar.l(gestaltIconButton8.getId(), 3, gestaltSearchField.S0().getId(), 3);
                        pVar.l(gestaltIconButton8.getId(), i13, gestaltSearchField.S0().getId(), i13);
                        pVar.l(gestaltSearchField.S0().getId(), 7, gestaltIconButton8.getId(), 6);
                    }
                    GestaltIconButton gestaltIconButton9 = gestaltSearchField.f49514i;
                    if (gestaltIconButton9 != null) {
                        int id3 = gestaltIconButton9.getId();
                        View view = gestaltSearchField.f49513h;
                        if (view == null) {
                            view = gestaltSearchField.S0();
                        }
                        pVar.m(id3, 6, view.getId(), 7, gestaltSearchField.f49509d);
                        pVar.l(gestaltIconButton9.getId(), 3, gestaltSearchField.S0().getId(), 3);
                        pVar.l(gestaltIconButton9.getId(), 7, 0, 7);
                        pVar.l(gestaltIconButton9.getId(), i13, gestaltSearchField.S0().getId(), i13);
                    }
                    pVar.b(gestaltSearchField);
                }
                break;
            case 6:
                ((Number) obj).intValue();
                gestaltSearchField.setId(dVar.f28169r);
                break;
            case 7:
                b((List) obj);
                break;
            case 8:
                b((List) obj);
                break;
            case 9:
                b((List) obj);
                break;
            case 10:
                fm1.c it2 = (fm1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                gestaltSearchField.setVisibility(dVar.f28166o.getVisibility());
                break;
            case 11:
                rm1.q qVar3 = dVar.f28156e;
                rm1.i iVar5 = GestaltSearchField.f49499t;
                gestaltSearchField.o0(qVar3, gestaltSearchField.S0().hasFocus());
                break;
            case 12:
                f();
                break;
            case 13:
                f();
                break;
            default:
                e eVar2 = dVar.f28159h;
                rm1.i iVar6 = GestaltSearchField.f49499t;
                if (eVar2 == null) {
                    gestaltSearchField.z0(true);
                } else {
                    Context context5 = gestaltSearchField.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                    int i17 = f0.gestalt_search_trailing_icon_animation;
                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                    Intrinsics.checkNotNullParameter(context5, "context");
                    LottieAnimationView lottieAnimationView = new LottieAnimationView(context5);
                    int G0 = dl2.b.G0(lottieAnimationView, eo1.a.comp_iconbutton_md_icon_size);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(G0, G0);
                    pp2.a.P0(layoutParams, 0, 0, G0, 0);
                    layoutParams.gravity = 16;
                    lottieAnimationView.setLayoutParams(layoutParams);
                    lottieAnimationView.l2(eVar2.f28187a);
                    lottieAnimationView.setId(i17);
                    u50.i0 i0Var2 = eVar2.f28188b;
                    u50.f0 f0Var = i0Var2 instanceof u50.f0 ? (u50.f0) i0Var2 : null;
                    lottieAnimationView.setContentDescription(f0Var != null ? f0Var.f120559a : null);
                    lottieAnimationView.setVisibility(0);
                    lottieAnimationView.M2(-1);
                    lottieAnimationView.k2();
                    GestaltIconButton gestaltIconButton10 = gestaltSearchField.f49522q;
                    if (gestaltIconButton10 != null) {
                        bs1.c.X0(gestaltIconButton10);
                    }
                    GestaltIconButton gestaltIconButton11 = gestaltSearchField.f49523r;
                    if (gestaltIconButton11 != null) {
                        bs1.c.X0(gestaltIconButton11);
                    }
                    bs1.c.X0(gestaltSearchField.F0());
                    gestaltSearchField.L0().addView(lottieAnimationView);
                    SearchView S0 = gestaltSearchField.S0();
                    S0.A(false);
                    SearchView.SearchAutoComplete searchAutoComplete = S0.f16425p;
                    searchAutoComplete.requestFocus();
                    searchAutoComplete.a(true);
                    S0.requestFocus();
                    gestaltSearchField.f49524s = lottieAnimationView;
                }
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(GestaltSearchField gestaltSearchField, d dVar, int i13) {
        super(1);
        this.f28197i = i13;
        this.f28199k = gestaltSearchField;
        this.f28198j = dVar;
    }
}
