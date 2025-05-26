package gv0;

import a41.d0;
import a41.p0;
import a41.r;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.c2;
import androidx.compose.foundation.layout.FillElement;
import androidx.recyclerview.widget.RecyclerView;
import b3.s0;
import bs1.c;
import c31.t;
import ca2.e;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xk;
import com.pinterest.feature.profile.boardlesspins.components.IdeaPreviewCarouselView;
import com.pinterest.feature.profile.emptystate.EmptyStateBannerView;
import com.pinterest.feature.profile.filters.FilterBarView;
import com.pinterest.feature.profile.pills.view.PillBarView;
import com.pinterest.feature.profile.pills.view.PillView;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenManager$Companion;
import com.pinterest.gestalt.toast.GestaltToast;
import cv0.m;
import d51.l;
import do1.v;
import dv0.i;
import dv0.k;
import fc0.f;
import fc0.g;
import fc0.h;
import g51.n;
import h32.f1;
import h32.g0;
import h32.u0;
import i2.o;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kh2.b0;
import kh2.j;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.z;
import ml1.q;
import nr0.p;
import ny0.a1;
import ny0.w0;
import o82.k3;
import od1.o0;
import p91.w;
import q91.u;
import rh1.v1;
import rq.t4;
import uk2.d;
import w41.s1;
import y01.h0;
import y01.n1;
import zy.n0;

/* loaded from: classes5.dex */
public final class b extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66159i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f66160j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i13) {
        super(2);
        this.f66159i = i13;
        this.f66160j = obj;
    }

    public final void b(int i13, int i14) {
        int i15 = this.f66159i;
        Object obj = this.f66160j;
        switch (i15) {
            case 2:
                if (i14 > 0) {
                    ((d) ((yi0.a) obj).f139069c).c(Integer.valueOf(i14));
                    break;
                }
                break;
            default:
                int i16 = v1.S0;
                e b83 = ((v1) obj).b8();
                b83.f27245d = (i13 - i14) + b83.f27245d;
                b83.a();
                break;
        }
    }

    public final void e(View view, v7 board) {
        int i13 = this.f66159i;
        Object obj = this.f66160j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(board, "board");
                Intrinsics.checkNotNullParameter(view, "view");
                hx0.e eVar = (hx0.e) obj;
                eVar.getClass();
                eVar.f70508b.d(new m10.b(view, board));
                break;
            case 13:
                Intrinsics.checkNotNullParameter(board, "board");
                Intrinsics.checkNotNullParameter(view, "view");
                e41.a aVar = (e41.a) obj;
                String modelId = board.getId();
                Intrinsics.checkNotNullExpressionValue(modelId, "getUid(...)");
                aVar.getClass();
                Intrinsics.checkNotNullParameter(modelId, "modelId");
                aVar.getPinalytics().N(f1.LONG_PRESS, u0.BOARD_COVER, g0.FLOWED_BOARD, modelId, false);
                aVar.f57181a.d(new m10.b(view, board));
                break;
            default:
                Intrinsics.checkNotNullParameter(board, "board");
                Intrinsics.checkNotNullParameter(view, "view");
                c51.e eVar2 = ((l) obj).M;
                if (eVar2 != null) {
                    Intrinsics.checkNotNullParameter(board, "board");
                    Intrinsics.checkNotNullParameter(view, "view");
                    ((n) eVar2).f63634n.d(new m10.b(view, board));
                    break;
                }
                break;
        }
    }

    public final void f(o oVar, int i13) {
        int i14 = this.f66159i;
        Object obj = this.f66160j;
        switch (i14) {
            case 8:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                IdeaPreviewCarouselView ideaPreviewCarouselView = (IdeaPreviewCarouselView) obj;
                b0.o((k31.a) ideaPreviewCarouselView.f47494h.getValue(), null, (k31.b) ideaPreviewCarouselView.f47495i.getValue(), oVar, 8, 2);
                break;
            case 9:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                k31.e eVar = (k31.e) obj;
                String str = eVar.f78242a;
                i2.s sVar3 = (i2.s) oVar;
                sVar3.W(400101967);
                if (!z.j(str)) {
                    FillElement fillElement = androidx.compose.foundation.layout.e.f17184c;
                    g gVar = (g) ((f) sVar3.m(h.f61707g));
                    int i15 = gVar.f61695a;
                    dl2.b.f(eVar.f78242a, androidx.compose.foundation.a.b(fillElement, gVar.f61699e, s0.f21349a), null, null, sVar3, 0, 12);
                }
                sVar3.r(false);
                String str2 = eVar.f78243b;
                if (!z.j(str2)) {
                    dl2.b.c(new rn1.a(c.h2(str2), vn1.c.SUBTLE, e0.b(vn1.b.CENTER), null, vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097128), androidx.compose.foundation.layout.e.p(u2.n.f120041b, null, 3), null, null, sVar3, 56, 12);
                    break;
                }
                break;
            case 10:
                if ((i13 & 11) == 2) {
                    i2.s sVar4 = (i2.s) oVar;
                    if (sVar4.z()) {
                        sVar4.Q();
                        break;
                    }
                }
                v31.e.a((v31.b) ((EmptyStateBannerView) obj).f47514h.getValue(), null, oVar, 0, 2);
                break;
            case 11:
                if ((i13 & 11) == 2) {
                    i2.s sVar5 = (i2.s) oVar;
                    if (sVar5.z()) {
                        sVar5.Q();
                        break;
                    }
                }
                FilterBarView filterBarView = (FilterBarView) obj;
                x31.h.a((x31.b) filterBarView.f47515h.getValue(), null, (x31.d) filterBarView.f47516i.getValue(), oVar, 8, 2);
                break;
            case 12:
            case 13:
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar6 = (i2.s) oVar;
                    if (sVar6.z()) {
                        sVar6.Q();
                        break;
                    }
                }
                u41.f.a((u41.e) ((PillView) obj).f47564h.getValue(), null, oVar, 8, 2);
                break;
            case 14:
                if ((i13 & 11) == 2) {
                    i2.s sVar7 = (i2.s) oVar;
                    if (sVar7.z()) {
                        sVar7.Q();
                        break;
                    }
                }
                PillBarView pillBarView = (PillBarView) obj;
                u41.d.a((u41.a) pillBarView.f47562h.getValue(), null, (u41.b) pillBarView.f47563i.getValue(), oVar, 8, 2);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        p0 p0Var;
        int i13 = this.f66159i;
        int i14 = 1;
        Object obj3 = this.f66160j;
        switch (i13) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String link = (String) obj2;
                Intrinsics.checkNotNullParameter(link, "link");
                k kVar = (k) ((m) obj3).f53281c;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(link, "link");
                k.H3(kVar, new t4(link, booleanValue, 12), new i(kVar, i14), new dv0.g(kVar, i14), false, 8);
                return Unit.f80348a;
            case 1:
                int intValue = ((Number) obj).intValue();
                String imageUrl = (String) obj2;
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                mv0.i iVar = (mv0.i) obj3;
                iVar.X0 = iVar.W0;
                iVar.W0 = intValue;
                iVar.Y0 = imageUrl;
                lv0.c cVar = iVar.Z0;
                if (cVar == null) {
                    Intrinsics.r("affiliateImageSelectedListener");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                cVar.f84996k.f80990h = intValue;
                return Unit.f80348a;
            case 2:
                b(((Number) obj).intValue(), ((Number) obj2).intValue());
                return Unit.f80348a;
            case 3:
                e((View) obj2, (v7) obj);
                return Unit.f80348a;
            case 4:
                a1 item = (a1) obj;
                Intrinsics.checkNotNullParameter(item, "item");
                String id3 = item.f92550a.getId();
                Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                String E6 = item.f92550a.E6();
                return new k3(((w0) obj3).f92643d.f143069f, id3, E6 != null ? E6 : "");
            case 5:
                dl1.s pinModel = (dl1.s) obj;
                int intValue2 = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(pinModel, "pinModel");
                return ((xz0.c) obj3).E.a(intValue2, (f30) pinModel);
            case 6:
                h0 displayState = (h0) obj;
                n1 vmState = (n1) obj2;
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                Bundle bundle = (Bundle) obj3;
                bundle.putInt("SWIPE_POSITION", displayState.f136412a.f67641b);
                List list = vmState.f136443a.f136504a;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((f30) it.next()).getId());
                }
                bundle.putStringArray("SWIPE_PIN_IDS", (String[]) arrayList.toArray(new String[0]));
                return Unit.f80348a;
            case 7:
                h31.f pinItem = (h31.f) obj;
                Intrinsics.checkNotNullParameter(pinItem, "pinItem");
                String id4 = pinItem.f66811a.getId();
                Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
                String E62 = pinItem.f66811a.E6();
                return new k3(((t) obj3).f25622j.f143069f, id4, E62 != null ? E62 : "");
            case 8:
                f((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 9:
                f((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 10:
                f((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 11:
                f((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 12:
                wy0 user = (wy0) obj;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                Intrinsics.checkNotNullParameter(user, "usr");
                d0 d0Var = (d0) obj3;
                d0Var.getClass();
                if (booleanValue2) {
                    Boolean J3 = user.J3();
                    Intrinsics.checkNotNullExpressionValue(J3, "getIsPrivateProfile(...)");
                    if (J3.booleanValue()) {
                        wy0 userToShare = ((b60.d) d0Var.f579x).f();
                        if (userToShare != null && (p0Var = (p0) d0Var.getViewIfBound()) != null) {
                            Intrinsics.checkNotNullParameter(userToShare, "userToShare");
                            Intrinsics.checkNotNullParameter(user, "user");
                            c2 c2Var = ((r) p0Var).F0;
                            if (c2Var == null) {
                                Intrinsics.r("sharesheetUtils");
                                throw null;
                            }
                            int value = y32.f.PROFILE.getValue();
                            Boolean S2 = user.S2();
                            Intrinsics.checkNotNullExpressionValue(S2, "getExplicitlyFollowingMe(...)");
                            c2Var.r(userToShare, user, value, S2.booleanValue());
                        }
                        nx.d0.B(d0Var.getPinalytics(), f1.INVITE_CODE_FOLLOW_SUCCESSFUL, null, null, null, 30);
                    } else {
                        d0Var.A.a(true).invoke(user, Boolean.TRUE);
                    }
                }
                return Unit.f80348a;
            case 13:
                e((View) obj2, (v7) obj);
                return Unit.f80348a;
            case 14:
                f((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 15:
                f((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 16:
                w41.i item2 = (w41.i) obj;
                Intrinsics.checkNotNullParameter(item2, "item");
                f30 f30Var = item2.f128016a;
                n0 n0Var = ((s1) obj3).f128078d.f143069f;
                String id5 = f30Var.getId();
                Intrinsics.checkNotNullExpressionValue(id5, "getUid(...)");
                String E63 = f30Var.E6();
                return new k3(n0Var, id5, E63 != null ? E63 : "");
            case 17:
                e((View) obj2, (v7) obj);
                return Unit.f80348a;
            case 18:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                int i15 = c61.i.f26565m1;
                j.x2(((c61.i) obj3).c9(), new c61.r(booleanValue3, booleanValue4));
                return Unit.f80348a;
            case 19:
                int intValue3 = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter((View) obj, "<anonymous parameter 0>");
                return Integer.valueOf(intValue3 == 0 ? ((RecyclerView) obj3).getResources().getDimensionPixelSize(eo1.c.space_1200) : 0);
            case 20:
                return Integer.valueOf(((p) obj3).getItemViewType(((Number) obj).intValue()));
            case 21:
                int intValue4 = ((Number) obj).intValue();
                Function0 onErrorAction = (Function0) obj2;
                Intrinsics.checkNotNullParameter(onErrorAction, "onErrorAction");
                uv0.f fVar = new uv0.f(27, onErrorAction);
                l91.h hVar = ((u) obj3).F0;
                if (hVar != null) {
                    ((w) hVar).x3(intValue4, fVar);
                }
                return Unit.f80348a;
            case 22:
                return Integer.valueOf(((Collator) obj3).compare(((ic1.w) obj).f72094a, ((ic1.w) obj2).f72094a));
            case 23:
                int intValue5 = ((Number) obj).intValue();
                xk bubble = (xk) obj2;
                Intrinsics.checkNotNullParameter(bubble, "bubble");
                id1.g gVar = (id1.g) obj3;
                Function2 bubbleNavigator = (Function2) gVar.f72158f.getValue();
                xo0.o bubbleImpressionLogger = (xo0.o) gVar.f72157e.getValue();
                Intrinsics.checkNotNullParameter(bubble, "bubble");
                Intrinsics.checkNotNullParameter(bubbleNavigator, "bubbleNavigator");
                Intrinsics.checkNotNullParameter(bubbleImpressionLogger, "bubbleImpressionLogger");
                return new xe1.z(intValue5, bubble, bubbleImpressionLogger, null, null, bubbleNavigator);
            case 24:
                pd1.b pinItem2 = (pd1.b) obj;
                Intrinsics.checkNotNullParameter(pinItem2, "pinItem");
                String id6 = pinItem2.f99803a.getId();
                Intrinsics.checkNotNullExpressionValue(id6, "getUid(...)");
                String E64 = pinItem2.f99803a.E6();
                return new k3(((o0) obj3).f94159e.f143069f, id6, E64 != null ? E64 : "");
            case 25:
                String deeplink = (String) obj;
                HashMap deeplinkParams = (HashMap) obj2;
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                Intrinsics.checkNotNullParameter(deeplinkParams, "deeplinkParams");
                gd1.d dVar = (gd1.d) ((Function0) obj3).invoke();
                if (dVar != null) {
                    dVar.O5(deeplink, deeplinkParams);
                }
                return Unit.f80348a;
            case 26:
                b(((Number) obj).intValue(), ((Number) obj2).intValue());
                return Unit.f80348a;
            case 27:
                ScreenDescription it2 = (ScreenDescription) obj;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(it2, "it");
                com.pinterest.framework.screens.s sVar = (com.pinterest.framework.screens.s) obj3;
                ScreenManager$Companion screenManager$Companion = com.pinterest.framework.screens.s.f49224n;
                if (sVar.q(it2)) {
                    com.pinterest.framework.screens.l lVar = sVar.f49228c;
                    if (((il1.b) lVar).g(it2) instanceof q) {
                        com.pinterest.framework.screens.m g13 = ((il1.b) lVar).g(it2);
                        Intrinsics.g(g13, "null cannot be cast to non-null type com.pinterest.framework.screens.transition.ScreenTransitionListener");
                        ((q) g13).k5();
                    }
                }
                return Unit.f80348a;
            case 28:
                float floatValue = ((Number) obj).floatValue();
                float floatValue2 = ((Number) obj2).floatValue();
                mm1.k kVar2 = (mm1.k) obj3;
                Function2 function2 = kVar2.f87623m;
                if (function2 != null) {
                    function2.invoke(Float.valueOf(floatValue), Float.valueOf(floatValue2));
                }
                kVar2.g().setAlpha(1 - (floatValue / floatValue2));
                return Unit.f80348a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj2;
                Intrinsics.checkNotNullParameter((Unit) obj, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
                int action = motionEvent.getAction();
                return action != 0 ? action != 1 ? action != 2 ? new do1.t(((GestaltToast) obj3).getId()) : new v(motionEvent, ((GestaltToast) obj3).getId()) : new do1.w(motionEvent, ((GestaltToast) obj3).getId()) : new do1.u(motionEvent, ((GestaltToast) obj3).getId());
        }
    }
}
