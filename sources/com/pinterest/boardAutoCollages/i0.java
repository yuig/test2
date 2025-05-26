package com.pinterest.boardAutoCollages;

import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pear.screen.PearLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import h32.d4;
import h32.f1;
import h32.u0;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import o82.b1;
import o82.l1;
import o82.m1;
import o82.n1;
import o82.q1;
import o82.y0;

/* loaded from: classes5.dex */
public final class i0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f44567b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.h0 f44568c;

    public i0(o82.i0 multiSectionStateTransformer, int i13) {
        this.f44567b = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "multiSectionStateTransformer");
            this.f44568c = b(multiSectionStateTransformer, new kotlin.jvm.internal.d0() { // from class: bt0.p
                @Override // kotlin.jvm.internal.d0, rl2.t
                public final Object get(Object obj) {
                    return ((b) obj).f23860a;
                }
            }, new kotlin.jvm.internal.d0() { // from class: bt0.q
                @Override // kotlin.jvm.internal.d0, rl2.t
                public final Object get(Object obj) {
                    return ((t) obj).f23890b;
                }
            }, bt0.s.f23888i);
        } else if (i13 == 2) {
            Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "multiSectionStateTransformer");
            this.f44568c = b(multiSectionStateTransformer, new kotlin.jvm.internal.d0() { // from class: iz0.y
                @Override // kotlin.jvm.internal.d0, rl2.t
                public final Object get(Object obj) {
                    return ((b) obj).f73897a;
                }
            }, new kotlin.jvm.internal.d0() { // from class: iz0.z
                @Override // kotlin.jvm.internal.d0, rl2.t
                public final Object get(Object obj) {
                    return ((c0) obj).f73903d;
                }
            }, iz0.a0.f73896i);
        } else if (i13 != 3) {
            Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "multiSectionStateTransformer");
            this.f44568c = b(multiSectionStateTransformer, new kotlin.jvm.internal.d0() { // from class: com.pinterest.boardAutoCollages.f0
                @Override // kotlin.jvm.internal.d0, rl2.t
                public final Object get(Object obj) {
                    return ((e) obj).f44553c;
                }
            }, new kotlin.jvm.internal.d0() { // from class: com.pinterest.boardAutoCollages.g0
                @Override // kotlin.jvm.internal.d0, rl2.t
                public final Object get(Object obj) {
                    return ((j0) obj).f44575f;
                }
            }, h0.f44565i);
        } else {
            Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "multiSectionStateTransformer");
            this.f44568c = b(multiSectionStateTransformer, new kotlin.jvm.internal.d0() { // from class: x91.e0
                @Override // kotlin.jvm.internal.d0, rl2.t
                public final Object get(Object obj) {
                    return ((a) obj).f134306d;
                }
            }, new kotlin.jvm.internal.d0() { // from class: x91.f0
                @Override // kotlin.jvm.internal.d0, rl2.t
                public final Object get(Object obj) {
                    return ((k0) obj).f134330b;
                }
            }, x91.h0.f134321i);
        }
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        int i13 = this.f44567b;
        l82.h0 lens = this.f44568c;
        switch (i13) {
            case 0:
                j0 vmState = (j0) i0Var;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                l82.e d2 = l82.d.d(new e(c.f44548a, false, new o82.a0()), vmState);
                com.google.firebase.messaging.a0 transformation = lens.e();
                Intrinsics.checkNotNullParameter(d2, "<this>");
                Intrinsics.checkNotNullParameter(transformation, "transformation");
                transformation.i(d2);
                return d2.e();
            case 1:
                bt0.t vmState2 = (bt0.t) i0Var;
                Intrinsics.checkNotNullParameter(vmState2, "vmState");
                l82.e resultBuilder = l82.d.d(new bt0.b(new o82.a0(), xp1.d.homefeed_tuner_profiles_empty_experiment_uup), vmState2);
                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                Intrinsics.checkNotNullParameter(lens, "lens");
                Intrinsics.checkNotNullParameter(lens, "$lens");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                lens.b(resultBuilder);
                return resultBuilder.e();
            case 2:
                iz0.c0 vmState3 = (iz0.c0) i0Var;
                Intrinsics.checkNotNullParameter(vmState3, "vmState");
                l82.e d13 = l82.d.d(new iz0.b(new o82.a0(), yk1.i.LOADING), vmState3);
                com.google.firebase.messaging.a0 transformation2 = lens.e();
                Intrinsics.checkNotNullParameter(d13, "<this>");
                Intrinsics.checkNotNullParameter(transformation2, "transformation");
                transformation2.i(d13);
                return d13.e();
            default:
                x91.k0 vmState4 = (x91.k0) i0Var;
                Intrinsics.checkNotNullParameter(vmState4, "vmState");
                l82.e resultBuilder2 = l82.d.d(new x91.a(null, "", false, new o82.a0()), vmState4);
                Intrinsics.checkNotNullParameter(resultBuilder2, "<this>");
                Intrinsics.checkNotNullParameter(lens, "lens");
                Intrinsics.checkNotNullParameter(lens, "$lens");
                Intrinsics.checkNotNullParameter(resultBuilder2, "resultBuilder");
                lens.b(resultBuilder2);
                return resultBuilder2.e();
        }
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        v tVar;
        int i13 = this.f44567b;
        l82.h0 lens = this.f44568c;
        switch (i13) {
            case 0:
                k event = (k) sVar;
                e priorDisplayState = (e) oVar;
                j0 priorVMState = (j0) i0Var;
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (event instanceof h) {
                    int i14 = d0.f44550a[((j0) resultBuilder.f82219b).f44573d.ordinal()];
                    if (i14 == 1) {
                        h hVar = (h) event;
                        tVar = new t(hVar.f44562a, hVar.f44564c);
                    } else {
                        if (i14 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        tVar = new u(((h) event).f44562a);
                    }
                    h32.i0 i0Var2 = priorVMState.f44574e.f143086a;
                    f1 f1Var = f1.TAP;
                    h hVar2 = (h) event;
                    String str = hVar2.f44562a;
                    HashMap hashMap = new HashMap();
                    bs1.c.G1("grid_index", String.valueOf(hVar2.f44563b), hashMap);
                    Unit unit = Unit.f80348a;
                    resultBuilder.d(new x(new zy.f0(new zy.a(i0Var2, f1Var, str, hashMap, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM))), new a0(tVar));
                } else if (event instanceof g) {
                    resultBuilder.d(new w(((g) event).f44560a, ((e) resultBuilder.f82218a).f44551a));
                } else if (event instanceof j) {
                    l82.f0 transformation = lens.c(((j) event).f44569a);
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation, "transformation");
                    transformation.i(resultBuilder);
                } else if (event instanceof f) {
                    ta0.p pVar = ((f) event).f44558a;
                    if (Intrinsics.d(pVar, ta0.n.f116890a)) {
                        resultBuilder.f(e0.f44554j);
                    } else if (Intrinsics.d(pVar, ta0.o.f116891a)) {
                        resultBuilder.f(e0.f44555k);
                        resultBuilder.d(new b0(new k92.n(new k92.c(new u50.k0(qa0.f.collage_download_success), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null)));
                    } else {
                        if (!(pVar instanceof ta0.m)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        resultBuilder.f(e0.f44556l);
                        resultBuilder.d(new b0(new k92.n(new k92.c(new u50.k0(((ta0.m) pVar).f116889a), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null)));
                    }
                } else if (event instanceof i) {
                    resultBuilder.a(new y(new ta0.w(((i) event).f44566a)));
                }
                return resultBuilder.e();
            case 1:
                bt0.c event2 = (bt0.c) sVar;
                bt0.b priorDisplayState2 = (bt0.b) oVar;
                Intrinsics.checkNotNullParameter(event2, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState2, "priorDisplayState");
                Intrinsics.checkNotNullParameter((bt0.t) i0Var, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (!(event2 instanceof bt0.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                o82.g0 event3 = event2.f23862a;
                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                Intrinsics.checkNotNullParameter(lens, "lens");
                Intrinsics.checkNotNullParameter(event3, "event");
                Intrinsics.checkNotNullParameter(lens, "$lens");
                Intrinsics.checkNotNullParameter(event3, "$event");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                lens.a(event3, resultBuilder);
                return resultBuilder.e();
            case 2:
                iz0.e event4 = (iz0.e) sVar;
                iz0.b priorDisplayState3 = (iz0.b) oVar;
                iz0.c0 priorVMState2 = (iz0.c0) i0Var;
                Intrinsics.checkNotNullParameter(event4, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState3, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState2, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (!(event4 instanceof iz0.d)) {
                    if (!(event4 instanceof iz0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iz0.v vVar = new iz0.v(al1.b.f15477a);
                    NavigationImpl w13 = Navigation.w1(PearLocation.PEAR_QUIZ);
                    w13.m0("com.pinterest.EXTRA_QUIZ_ID", priorVMState2.f73900a);
                    w13.Y1("com.pinterest.EXTRA_SKIP_NUX", true);
                    Unit unit2 = Unit.f80348a;
                    Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
                    return new l82.c0(priorDisplayState3, priorVMState2, kotlin.collections.f0.j(vVar, new iz0.v(new al1.a(w13))));
                }
                bk.f.I(resultBuilder, lens, ((iz0.d) event4).f73904a);
                String id3 = iz0.h0.BODY.id();
                n1 n1Var = n1.f93676a;
                bk.f.I(resultBuilder, lens, new o82.e0(id3, n1Var));
                bk.f.I(resultBuilder, lens, new o82.e0(iz0.h0.SURVEY.id(), n1Var));
                bk.f.I(resultBuilder, lens, new o82.e0(iz0.h0.FOOTER.id(), n1Var));
                bk.f.I(resultBuilder, lens, new o82.e0(iz0.h0.PIN_FEED_HEADER.id(), n1Var));
                bk.f.I(resultBuilder, lens, new o82.e0(iz0.h0.PIN_FEED.id(), n1Var));
                resultBuilder.f(iz0.l.f73926l);
                return resultBuilder.e();
            default:
                x91.j event5 = (x91.j) sVar;
                x91.a priorDisplayState4 = (x91.a) oVar;
                x91.k0 priorVMState3 = (x91.k0) i0Var;
                Intrinsics.checkNotNullParameter(event5, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState4, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState3, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (event5 instanceof x91.b) {
                    h32.i0 a13 = h32.i0.a(priorVMState3.f134329a.f143086a, d4.BROWSER, null, h32.g0.BROWSER, u0.HELP_CENTER_LINK, 86);
                    f1 f1Var2 = f1.LOAD_URL;
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("url", ((x91.b) event5).f134308a);
                    Unit unit3 = Unit.f80348a;
                    resultBuilder.a(new x91.x(new zy.e0(new zy.a(a13, f1Var2, null, hashMap2, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION))));
                } else if (event5 instanceof x91.h) {
                    resultBuilder.d(new x91.y(((x91.h) event5).f134320a), new x91.x(new zy.e0(new zy.a(h32.i0.a(priorVMState3.f134329a.f143086a, null, null, null, u0.USER_PROFILE, 95), f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN))));
                } else if (event5 instanceof x91.c) {
                    resultBuilder.f(new x91.i0(event5, 0));
                    o82.f0 event6 = new o82.f0(0, new b1(((x91.c) event5).f134310a, true));
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(lens, "lens");
                    Intrinsics.checkNotNullParameter(event6, "event");
                    Intrinsics.checkNotNullParameter(lens, "$lens");
                    Intrinsics.checkNotNullParameter(event6, "$event");
                    Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                    lens.a(event6, resultBuilder);
                } else if (event5 instanceof x91.e) {
                    resultBuilder.f(new x91.i0(event5, 1));
                    resultBuilder.d(new x91.z(new zb0.j(new zb0.a(new u50.k0(new String[]{dl2.b.j1(((x91.e) event5).f134313a)}, p60.d.unblock_user_title), new u50.k0(p60.d.unblock_user_message_alt), new u50.k0(x0.unblock), new u50.k0(p60.d.never_mind), true), null)), new x91.x(new zy.e0(new zy.a(h32.i0.a(priorVMState3.f134329a.f143086a, null, null, null, u0.USER_UNBLOCK_BUTTON, 95), f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN))));
                } else if (event5 instanceof x91.d) {
                    zb0.f fVar = ((x91.d) event5).f134312a;
                    if (fVar instanceof zb0.e) {
                        resultBuilder.a(new x91.x(new zy.e0(new zy.a(h32.i0.a(priorVMState3.f134329a.f143086a, d4.UNBLOCK_SHEET, null, h32.g0.SHEET, null, RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL), f1.VIEW, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN))));
                    } else if (fVar instanceof zb0.c) {
                        wy0 wy0Var = priorDisplayState4.f134303a;
                        if (wy0Var != null) {
                            resultBuilder.d(new x91.b0(dl2.b.g1(wy0Var)), new x91.x(new zy.e0(new zy.a(h32.i0.a(priorVMState3.f134329a.f143086a, d4.UNBLOCK_SHEET, null, h32.g0.SHEET, null, RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL), f1.USER_UNBLOCK, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN))));
                        }
                    } else if (fVar instanceof zb0.b) {
                        resultBuilder.a(new x91.x(new zy.e0(new zy.a(h32.i0.a(priorVMState3.f134329a.f143086a, d4.UNBLOCK_SHEET, null, h32.g0.SHEET, u0.CANCEL_BUTTON, 86), f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN))));
                    } else if (fVar instanceof zb0.d) {
                        resultBuilder.f(x91.l.f134333l);
                    }
                } else if (event5 instanceof x91.g) {
                    x91.g gVar = (x91.g) event5;
                    resultBuilder.a(new x91.a0(new k92.n(new k92.c(new u50.k0(new String[]{dl2.b.j1(gVar.f134317a)}, x0.unblock_user_sent), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null)));
                    o82.f0 event7 = new o82.f0(0, new l1(new x91.u(gVar.f134317a)));
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(lens, "lens");
                    Intrinsics.checkNotNullParameter(event7, "event");
                    Intrinsics.checkNotNullParameter(lens, "$lens");
                    Intrinsics.checkNotNullParameter(event7, "$event");
                    Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                    lens.a(event7, resultBuilder);
                    if (((y0) ((x91.a) resultBuilder.f82218a).f134306d.f93524a.get(0)).f93756a.isEmpty()) {
                        resultBuilder.f(new tk0.h0(4, resultBuilder));
                    }
                } else if (event5 instanceof x91.f) {
                    resultBuilder.a(new x91.a0(new k92.n(new k92.c(new u50.k0(x0.generic_error), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null)));
                } else if (event5 instanceof x91.i) {
                    x91.i iVar = (x91.i) event5;
                    o82.g0 g0Var = iVar.f134322a;
                    o82.f0 f0Var = g0Var instanceof o82.f0 ? (o82.f0) g0Var : null;
                    q1 q1Var = f0Var != null ? f0Var.f93580b : null;
                    if (q1Var instanceof m1) {
                        resultBuilder.f(new x91.j0(0, q1Var));
                    }
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(lens, "lens");
                    o82.g0 event8 = iVar.f134322a;
                    Intrinsics.checkNotNullParameter(event8, "event");
                    Intrinsics.checkNotNullParameter(lens, "$lens");
                    Intrinsics.checkNotNullParameter(event8, "$event");
                    Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                    lens.a(event8, resultBuilder);
                }
                return resultBuilder.e();
        }
    }
}
