package cn1;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.gestalt.text.GestaltText;
import java.util.ArrayList;
import kh2.g3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f28130i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y f28131j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ GestaltStaticSearchBar f28132k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(y yVar, GestaltStaticSearchBar gestaltStaticSearchBar, int i13) {
        super(1);
        this.f28130i = i13;
        this.f28131j = yVar;
        this.f28132k = gestaltStaticSearchBar;
    }

    public final void b(u50.i0 it) {
        int i13 = this.f28130i;
        GestaltStaticSearchBar gestaltStaticSearchBar = this.f28132k;
        y yVar = this.f28131j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.c cVar = GestaltStaticSearchBar.f49525q;
                pp2.a.k(gestaltStaticSearchBar.z0(), new an1.i(yVar, 4));
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                u50.i0 i0Var = yVar.f28241a;
                vn1.c cVar2 = GestaltStaticSearchBar.f49525q;
                gestaltStaticSearchBar.getClass();
                if (!Intrinsics.d(i0Var, u50.h0.f120562a)) {
                    pp2.a.k(gestaltStaticSearchBar.z0(), new fx.e(13, i0Var));
                    break;
                }
                break;
        }
    }

    public final void e() {
        GestaltIconButton gestaltIconButton;
        int i13 = this.f28130i;
        final int i14 = 0;
        final GestaltStaticSearchBar gestaltStaticSearchBar = this.f28132k;
        final y yVar = this.f28131j;
        switch (i13) {
            case 10:
                f fVar = yVar.f28244d;
                if (fVar != null) {
                    Context context = gestaltStaticSearchBar.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    GestaltIconButton u13 = kh2.j.w(fVar, context, f0.gestalt_search_trailing_icon_button).u(new gm1.a() { // from class: cn1.c0
                        @Override // gm1.a
                        public final void h3(gm1.c event) {
                            gm1.a aVar;
                            gm1.a aVar2;
                            int i15 = i14;
                            y this_with = yVar;
                            GestaltStaticSearchBar this$0 = gestaltStaticSearchBar;
                            switch (i15) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(this_with, "$this_with");
                                    Intrinsics.checkNotNullParameter(event, "event");
                                    if ((event instanceof om1.l) && (aVar = (gm1.a) this$0.f49527a.f33804b) != null) {
                                        aVar.h3(new u(this_with.f28247g));
                                        break;
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(this_with, "$this_with");
                                    Intrinsics.checkNotNullParameter(event, "event");
                                    if ((event instanceof om1.l) && (aVar2 = (gm1.a) this$0.f49527a.f33804b) != null) {
                                        aVar2.h3(new p(this_with.f28247g));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    g3.y(u13, b0.f28138m);
                    gestaltStaticSearchBar.f49534h = u13;
                    gestaltStaticSearchBar.f49532f = u13;
                    if (gestaltStaticSearchBar.t0().f28249i == dn1.e.DEFAULT && gestaltStaticSearchBar.t0().f28245e == null && !gestaltStaticSearchBar.B0()) {
                        gestaltStaticSearchBar.removeView(u13);
                        gestaltStaticSearchBar.addView(u13);
                        androidx.constraintlayout.widget.p pVar = gestaltStaticSearchBar.f49531e;
                        pVar.j(gestaltStaticSearchBar);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(gestaltStaticSearchBar.z0().getId()));
                        arrayList.add(Integer.valueOf(u13.getId()));
                        int size = arrayList.size();
                        float[] fArr = new float[size];
                        while (i14 < size) {
                            fArr[i14] = 0.0f;
                            i14++;
                        }
                        int indexOf = arrayList.indexOf(Integer.valueOf(gestaltStaticSearchBar.z0().getId()));
                        if (indexOf != -1) {
                            fArr[indexOf] = 1.0f;
                        }
                        pVar.u(CollectionsKt.E0(arrayList), fArr);
                        int abs = Math.abs(gestaltStaticSearchBar.f49528b - com.bumptech.glide.c.t1(u13));
                        pVar.l(u13.getId(), 3, gestaltStaticSearchBar.z0().getId(), 3);
                        pVar.l(u13.getId(), 6, gestaltStaticSearchBar.z0().getId(), 7);
                        pVar.l(u13.getId(), 4, gestaltStaticSearchBar.z0().getId(), 4);
                        gestaltStaticSearchBar.f49531e.m(u13.getId(), 7, 0, 7, abs);
                        pVar.l(gestaltStaticSearchBar.z0().getId(), 7, u13.getId(), 6);
                        pVar.b(gestaltStaticSearchBar);
                        break;
                    }
                }
                break;
            default:
                f fVar2 = yVar.f28245e;
                if (fVar2 != null) {
                    Context context2 = gestaltStaticSearchBar.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    GestaltIconButton w13 = kh2.j.w(fVar2, context2, f0.gestalt_search_trailing_icon_button);
                    final int i15 = 1;
                    GestaltIconButton u14 = w13.u(new gm1.a() { // from class: cn1.c0
                        @Override // gm1.a
                        public final void h3(gm1.c event) {
                            gm1.a aVar;
                            gm1.a aVar2;
                            int i152 = i15;
                            y this_with = yVar;
                            GestaltStaticSearchBar this$0 = gestaltStaticSearchBar;
                            switch (i152) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(this_with, "$this_with");
                                    Intrinsics.checkNotNullParameter(event, "event");
                                    if ((event instanceof om1.l) && (aVar = (gm1.a) this$0.f49527a.f33804b) != null) {
                                        aVar.h3(new u(this_with.f28247g));
                                        break;
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(this_with, "$this_with");
                                    Intrinsics.checkNotNullParameter(event, "event");
                                    if ((event instanceof om1.l) && (aVar2 = (gm1.a) this$0.f49527a.f33804b) != null) {
                                        aVar2.h3(new p(this_with.f28247g));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    g3.y(u14, b0.f28140o);
                    gestaltStaticSearchBar.f49535i = u14;
                    GestaltIconButton gestaltIconButton2 = gestaltStaticSearchBar.f49534h;
                    if (gestaltIconButton2 != null && gestaltStaticSearchBar.t0().f28249i == dn1.e.DEFAULT && !gestaltStaticSearchBar.B0() && (gestaltIconButton = gestaltStaticSearchBar.f49535i) != null) {
                        gestaltStaticSearchBar.removeView(gestaltIconButton2);
                        gestaltStaticSearchBar.addView(gestaltIconButton2);
                        gestaltStaticSearchBar.removeView(gestaltIconButton);
                        gestaltStaticSearchBar.addView(gestaltIconButton);
                        androidx.constraintlayout.widget.p pVar2 = gestaltStaticSearchBar.f49531e;
                        pVar2.j(gestaltStaticSearchBar);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(gestaltStaticSearchBar.z0().getId()));
                        arrayList2.add(Integer.valueOf(gestaltIconButton.getId()));
                        arrayList2.add(Integer.valueOf(gestaltIconButton2.getId()));
                        int size2 = arrayList2.size();
                        float[] fArr2 = new float[size2];
                        while (i14 < size2) {
                            fArr2[i14] = 0.0f;
                            i14++;
                        }
                        int indexOf2 = arrayList2.indexOf(Integer.valueOf(gestaltStaticSearchBar.z0().getId()));
                        if (indexOf2 != -1) {
                            fArr2[indexOf2] = 1.0f;
                        }
                        pVar2.u(CollectionsKt.E0(arrayList2), fArr2);
                        int abs2 = Math.abs(gestaltStaticSearchBar.f49528b - com.bumptech.glide.c.t1(gestaltIconButton2));
                        pVar2.l(gestaltIconButton2.getId(), 3, gestaltStaticSearchBar.z0().getId(), 3);
                        pVar2.l(gestaltIconButton2.getId(), 4, gestaltStaticSearchBar.z0().getId(), 4);
                        pVar2.l(gestaltIconButton.getId(), 3, gestaltStaticSearchBar.z0().getId(), 3);
                        pVar2.l(gestaltIconButton.getId(), 4, gestaltStaticSearchBar.z0().getId(), 4);
                        pVar2.l(gestaltStaticSearchBar.z0().getId(), 7, gestaltIconButton.getId(), 6);
                        pVar2.l(gestaltIconButton.getId(), 6, gestaltStaticSearchBar.z0().getId(), 7);
                        pVar2.l(gestaltIconButton.getId(), 7, gestaltIconButton2.getId(), 6);
                        pVar2.l(gestaltIconButton2.getId(), 6, gestaltIconButton.getId(), 7);
                        gestaltStaticSearchBar.f49531e.m(gestaltIconButton2.getId(), 7, 0, 7, abs2);
                        pVar2.b(gestaltStaticSearchBar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13;
        GestaltStaticSearchBar gestaltStaticSearchBar;
        int i14 = this.f28130i;
        int i15 = 3;
        int i16 = 5;
        int i17 = 2;
        int i18 = 6;
        int i19 = 1;
        y yVar = this.f28131j;
        GestaltStaticSearchBar gestaltStaticSearchBar2 = this.f28132k;
        switch (i14) {
            case 0:
                y newState = (y) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                vn1.c cVar = GestaltStaticSearchBar.f49525q;
                gestaltStaticSearchBar2.F0(yVar, newState);
                break;
            case 1:
                ((Boolean) obj).getClass();
                if (yVar.f28254n) {
                    vn1.c cVar2 = GestaltStaticSearchBar.f49525q;
                    gestaltStaticSearchBar2.r0(e0.searchfield_bg_error);
                    u50.i0 i0Var = gestaltStaticSearchBar2.t0().f28255o;
                    Context context = gestaltStaticSearchBar2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    gestaltStaticSearchBar2.o0(i0Var.a(context).toString(), vn1.c.ERROR, new rm1.d(new rm1.f(rm1.q.WORKFLOW_STATUS_PROBLEM, rm1.i.SM), rm1.c.ERROR, null, 0, null, 28));
                    GestaltText gestaltText = gestaltStaticSearchBar2.f49541o;
                    if (gestaltText != null) {
                        gestaltText.sendAccessibilityEvent(16384);
                    }
                } else {
                    vn1.c cVar3 = GestaltStaticSearchBar.f49525q;
                    gestaltStaticSearchBar2.r0(e0.searchfield_bg_default);
                    u50.i0 i0Var2 = gestaltStaticSearchBar2.t0().f28255o;
                    Context context2 = gestaltStaticSearchBar2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    gestaltStaticSearchBar2.o0(i0Var2.a(context2).toString(), vn1.c.SUBTLE, null);
                }
                break;
            case 2:
                b((u50.i0) obj);
                break;
            case 3:
                b((u50.i0) obj);
                break;
            case 4:
                ((Number) obj).intValue();
                gestaltStaticSearchBar2.setId(yVar.f28247g);
                break;
            case 5:
                fm1.c it = (fm1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                gestaltStaticSearchBar2.setVisibility(yVar.f28248h.getVisibility());
                break;
            case 6:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                rm1.q qVar = yVar.f28243c;
                vn1.c cVar4 = GestaltStaticSearchBar.f49525q;
                bind.f108895j = gestaltStaticSearchBar2.G0(qVar, false);
                break;
            case 7:
                dn1.e it2 = (dn1.e) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                dn1.e eVar = yVar.f28249i;
                vn1.c cVar5 = GestaltStaticSearchBar.f49525q;
                gestaltStaticSearchBar2.getClass();
                int i23 = z.f28258b[eVar.ordinal()];
                int i24 = 7;
                if (i23 != 1) {
                    com.google.firebase.messaging.q qVar2 = gestaltStaticSearchBar2.f49527a;
                    if (i23 == 2) {
                        i13 = 4;
                        gestaltStaticSearchBar = gestaltStaticSearchBar2;
                        c cVar6 = gestaltStaticSearchBar.t0().f28250j;
                        if (cVar6 == null) {
                            cVar6 = new c(GestaltSearchField.C, GestaltSearchField.f49504y, (u50.i0) null, dn1.a.LEADING_ICON_BUTTON, 20);
                        }
                        om1.c s03 = kh2.g0.s0(cVar6);
                        if (gestaltStaticSearchBar.f49536j == null) {
                            Context context3 = gestaltStaticSearchBar.getContext();
                            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                            GestaltIconButton gestaltIconButton = new GestaltIconButton(context3, s03);
                            gestaltStaticSearchBar.addView(gestaltIconButton);
                            gestaltStaticSearchBar.f49536j = gestaltIconButton;
                            gm1.a aVar = (gm1.a) qVar2.f33804b;
                            if (aVar != null) {
                                gestaltIconButton.u(aVar);
                            }
                        }
                        GestaltIconButton gestaltIconButton2 = gestaltStaticSearchBar.f49536j;
                        if (gestaltIconButton2 != null) {
                            gestaltIconButton2.t(new dm1.h(s03, i24));
                        }
                        GestaltStaticSearchBar.a0(gestaltStaticSearchBar, true, false, false, false, 14);
                    } else if (i23 == 3) {
                        i13 = 4;
                        gestaltStaticSearchBar = gestaltStaticSearchBar2;
                        g gVar = gestaltStaticSearchBar.t0().f28251k;
                        if (gVar == null) {
                            gVar = kh2.j.L();
                        }
                        Context context4 = gestaltStaticSearchBar.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        yl1.b r03 = kh2.g0.r0(gVar, context4);
                        if (gestaltStaticSearchBar.f49537k == null) {
                            Context context5 = gestaltStaticSearchBar.getContext();
                            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                            GestaltButton gestaltButton = new GestaltButton(context5, r03);
                            gestaltStaticSearchBar.addView(gestaltButton);
                            gestaltStaticSearchBar.f49537k = gestaltButton;
                            gm1.a aVar2 = (gm1.a) qVar2.f33804b;
                            if (aVar2 != null) {
                                gestaltButton.e(aVar2);
                            }
                        }
                        GestaltButton gestaltButton2 = gestaltStaticSearchBar.f49537k;
                        if (gestaltButton2 != null) {
                            gestaltButton2.d(new jw0.b(r03, 5));
                        }
                        GestaltStaticSearchBar.a0(gestaltStaticSearchBar, false, true, false, false, 13);
                    } else if (i23 == 4) {
                        i13 = 4;
                        gestaltStaticSearchBar = gestaltStaticSearchBar2;
                        rm1.q qVar3 = GestaltSearchField.D;
                        om1.f fVar = GestaltSearchField.f49504y;
                        gestaltStaticSearchBar.g0(new c(qVar3, fVar, (u50.i0) null, dn1.a.END_ACTION_BUTTONS_ONE, 20), new c(GestaltSearchField.E, fVar, (u50.i0) null, dn1.a.END_ACTION_BUTTONS_TWO, 20));
                        GestaltStaticSearchBar.a0(gestaltStaticSearchBar, false, false, true, true, 3);
                    } else if (i23 != 5) {
                        i13 = 4;
                        gestaltStaticSearchBar = gestaltStaticSearchBar2;
                    } else {
                        gestaltStaticSearchBar2.g0(gestaltStaticSearchBar2.t0().f28252l, gestaltStaticSearchBar2.t0().f28253m);
                        i13 = 4;
                        gestaltStaticSearchBar = gestaltStaticSearchBar2;
                        GestaltStaticSearchBar.a0(gestaltStaticSearchBar2, false, false, true, true, 3);
                    }
                } else {
                    i13 = 4;
                    gestaltStaticSearchBar = gestaltStaticSearchBar2;
                    GestaltStaticSearchBar.a0(gestaltStaticSearchBar, false, false, false, false, 15);
                }
                if (eVar != dn1.e.DEFAULT) {
                    gestaltStaticSearchBar.X();
                    ConstraintLayout constraintLayout = gestaltStaticSearchBar.f49540n;
                    if (constraintLayout != null) {
                        androidx.constraintlayout.widget.p pVar = gestaltStaticSearchBar.f49531e;
                        pVar.j(gestaltStaticSearchBar);
                        ArrayList arrayList = new ArrayList();
                        GestaltIconButton gestaltIconButton3 = gestaltStaticSearchBar.f49536j;
                        if (gestaltIconButton3 != null) {
                            arrayList.add(Integer.valueOf(gestaltIconButton3.getId()));
                        }
                        arrayList.add(Integer.valueOf(constraintLayout.getId()));
                        GestaltButton gestaltButton3 = gestaltStaticSearchBar.f49537k;
                        if (gestaltButton3 != null) {
                            arrayList.add(Integer.valueOf(gestaltButton3.getId()));
                        }
                        GestaltIconButton gestaltIconButton4 = gestaltStaticSearchBar.f49538l;
                        if (gestaltIconButton4 != null) {
                            arrayList.add(Integer.valueOf(gestaltIconButton4.getId()));
                        }
                        GestaltIconButton gestaltIconButton5 = gestaltStaticSearchBar.f49539m;
                        if (gestaltIconButton5 != null) {
                            arrayList.add(Integer.valueOf(gestaltIconButton5.getId()));
                        }
                        int size = arrayList.size();
                        float[] fArr = new float[size];
                        for (int i25 = 0; i25 < size; i25++) {
                            fArr[i25] = 0.0f;
                        }
                        int indexOf = arrayList.indexOf(Integer.valueOf(constraintLayout.getId()));
                        if (indexOf != -1) {
                            fArr[indexOf] = 1.0f;
                        }
                        pVar.u(CollectionsKt.E0(arrayList), fArr);
                        GestaltIconButton gestaltIconButton6 = gestaltStaticSearchBar.f49536j;
                        if (gestaltIconButton6 != null) {
                            pVar.l(gestaltIconButton6.getId(), 6, 0, 6);
                            gestaltStaticSearchBar.f49531e.m(gestaltIconButton6.getId(), 7, constraintLayout.getId(), 6, gestaltStaticSearchBar.f49529c);
                            pVar.l(gestaltIconButton6.getId(), 3, constraintLayout.getId(), 3);
                            pVar.l(gestaltIconButton6.getId(), i13, constraintLayout.getId(), i13);
                            pVar.l(constraintLayout.getId(), 6, gestaltIconButton6.getId(), 7);
                        }
                        GestaltButton gestaltButton4 = gestaltStaticSearchBar.f49537k;
                        if (gestaltButton4 != null) {
                            gestaltStaticSearchBar.f49531e.m(gestaltButton4.getId(), 6, constraintLayout.getId(), 7, gestaltStaticSearchBar.f49529c);
                            pVar.l(gestaltButton4.getId(), 3, constraintLayout.getId(), 3);
                            pVar.l(gestaltButton4.getId(), i13, constraintLayout.getId(), i13);
                            pVar.l(constraintLayout.getId(), 7, gestaltButton4.getId(), 6);
                        }
                        GestaltIconButton gestaltIconButton7 = gestaltStaticSearchBar.f49538l;
                        if (gestaltIconButton7 != null) {
                            gestaltStaticSearchBar.f49531e.m(gestaltIconButton7.getId(), 6, constraintLayout.getId(), 7, gestaltStaticSearchBar.f49529c);
                            pVar.l(gestaltIconButton7.getId(), 3, constraintLayout.getId(), 3);
                            pVar.l(gestaltIconButton7.getId(), i13, constraintLayout.getId(), i13);
                            pVar.l(constraintLayout.getId(), 7, gestaltIconButton7.getId(), 6);
                        }
                        GestaltIconButton gestaltIconButton8 = gestaltStaticSearchBar.f49539m;
                        if (gestaltIconButton8 != null) {
                            int id3 = gestaltIconButton8.getId();
                            GestaltIconButton gestaltIconButton9 = gestaltStaticSearchBar.f49538l;
                            gestaltStaticSearchBar.f49531e.m(id3, 6, gestaltIconButton9 != null ? gestaltIconButton9.getId() : constraintLayout.getId(), 7, gestaltStaticSearchBar.f49529c);
                            pVar.l(gestaltIconButton8.getId(), 3, constraintLayout.getId(), 3);
                            pVar.l(gestaltIconButton8.getId(), i13, constraintLayout.getId(), i13);
                            pVar.l(gestaltIconButton8.getId(), 7, 0, 7);
                        }
                        gestaltStaticSearchBar.L(constraintLayout.getId());
                        gestaltStaticSearchBar.T(constraintLayout.getId());
                        pVar.b(gestaltStaticSearchBar);
                    }
                }
                break;
            case 8:
                dn1.d it3 = (dn1.d) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                dn1.d dVar = yVar.f28246f;
                vn1.c cVar7 = GestaltStaticSearchBar.f49525q;
                if (!gestaltStaticSearchBar2.t0().f28254n) {
                    int i26 = z.f28257a[dVar.ordinal()];
                    if (i26 == 1) {
                        gestaltStaticSearchBar2.r0(e0.searchfield_bg_default);
                        pp2.a.k(gestaltStaticSearchBar2.z0(), new x(gestaltStaticSearchBar2, i19));
                        GestaltIconButton gestaltIconButton10 = gestaltStaticSearchBar2.f49534h;
                        if (gestaltIconButton10 != null) {
                            g3.y(gestaltIconButton10, new x(gestaltStaticSearchBar2, i17));
                        }
                        GestaltIconButton gestaltIconButton11 = gestaltStaticSearchBar2.f49535i;
                        if (gestaltIconButton11 != null) {
                            g3.y(gestaltIconButton11, new x(gestaltStaticSearchBar2, i15));
                        }
                    } else if (i26 == 2 && gestaltStaticSearchBar2.t0().f28249i == dn1.e.DEFAULT) {
                        gestaltStaticSearchBar2.r0(e0.searchfield_bg_transparent);
                        pp2.a.k(gestaltStaticSearchBar2.z0(), new x(gestaltStaticSearchBar2, i16));
                        GestaltIconButton gestaltIconButton12 = gestaltStaticSearchBar2.f49534h;
                        if (gestaltIconButton12 != null) {
                            g3.y(gestaltIconButton12, a.E);
                        }
                        GestaltIconButton gestaltIconButton13 = gestaltStaticSearchBar2.f49535i;
                        if (gestaltIconButton13 != null) {
                            g3.y(gestaltIconButton13, a.F);
                        }
                    }
                }
                break;
            case 9:
                rm1.q it4 = (rm1.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                vn1.c cVar8 = GestaltStaticSearchBar.f49525q;
                pp2.a.k(gestaltStaticSearchBar2.z0(), new a0(gestaltStaticSearchBar2, yVar, i18));
                break;
            case 10:
                e();
                break;
            default:
                e();
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(GestaltStaticSearchBar gestaltStaticSearchBar, y yVar, int i13) {
        super(1);
        this.f28130i = i13;
        this.f28132k = gestaltStaticSearchBar;
        this.f28131j = yVar;
    }
}
