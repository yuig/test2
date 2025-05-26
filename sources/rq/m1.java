package rq;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.pinterest.activity.pin.view.modules.PinCloseupLegoActionButtonModule;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.m40;
import com.pinterest.api.model.sg;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.popoverMessage.GestaltPopoverMessage;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.repository.pin.PinService;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f109370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f109371c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f109372d;

    public /* synthetic */ m1(Object obj, Object obj2, Object obj3, int i13) {
        this.f109369a = i13;
        this.f109370b = obj;
        this.f109371c = obj2;
        this.f109372d = obj3;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = 5;
        int i14 = this.f109369a;
        Object obj = this.f109372d;
        Object obj2 = this.f109371c;
        Object obj3 = this.f109370b;
        switch (i14) {
            case 0:
                f30 pin = (f30) obj3;
                PinCloseupLegoActionButtonModule this$0 = (PinCloseupLegoActionButtonModule) obj2;
                GestaltIconButton this_apply = (GestaltIconButton) obj;
                int i15 = PinCloseupLegoActionButtonModule.G;
                Intrinsics.checkNotNullParameter(pin, "$pin");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    m60.w b13 = this$0.b();
                    Resources resources = this_apply.getResources();
                    b60.b bVar = this$0.f35016g;
                    if (bVar != null) {
                        ai0.a.b(pin, b13, (r39 & 2) != 0 ? ml1.b.NO_TRANSITION.getValue() : 0, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : null, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, null, (r39 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : null, (r39 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : resources, (r39 & 1024) != 0 ? null : bVar, (r39 & 2048) != 0 ? "" : null, (r39 & 4096) != 0 ? "" : null, (r39 & 8192) != 0 ? "" : null, (r39 & 16384) != 0 ? "" : null, (32768 & r39) != 0 ? "" : null, null, (131072 & r39) != 0 ? false : false, false, (r39 & 524288) != 0 ? false : false);
                        return;
                    } else {
                        Intrinsics.r("activeUserManager");
                        throw null;
                    }
                }
                return;
            case 1:
                j2 this$02 = (j2) obj3;
                GestaltButton.SmallSecondaryButton this_apply2 = (GestaltButton.SmallSecondaryButton) obj2;
                String textToCopy = (String) obj;
                int i16 = j2.f109287n;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(this_apply2, "$this_apply");
                Intrinsics.checkNotNullParameter(textToCopy, "$textToCopy");
                Intrinsics.checkNotNullParameter(it, "it");
                f30 pin2 = this$02.getPin();
                if (pin2 != null) {
                    Context context = this_apply2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    int value = y32.f.INGREDIENTS_AUTOCOPY.getValue();
                    so.p pVar = this$02.f109289d;
                    if (pVar != null) {
                        kh2.s0.G0(context, pin2, textToCopy, value, null, pVar);
                        return;
                    } else {
                        Intrinsics.r("ingredientsInviteCodeHandlerFactory");
                        throw null;
                    }
                }
                return;
            case 2:
                nx.d0 pinalytics = (nx.d0) obj3;
                k3 this$03 = (k3) obj2;
                GestaltPreviewTextView this_apply3 = (GestaltPreviewTextView) obj;
                int i17 = k3.f109339w;
                Intrinsics.checkNotNullParameter(pinalytics, "$pinalytics");
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(this_apply3, "$this_apply");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof rn1.f) {
                    h32.u0 u0Var = h32.u0.EXPAND_PIN_DESCRIPTION_BUTTON;
                    this$03.getClass();
                    pinalytics.F(h32.g0.PIN_CLOSEUP_SOURCE_DESCRIPTION, u0Var);
                    kh2.m0.g(this_apply3, f2.f109194v);
                    return;
                }
                return;
            case 3:
                jd0.g this$04 = (jd0.g) obj3;
                Function0 primaryAction = (Function0) obj2;
                Function0 secondaryAction = (Function0) obj;
                int i18 = jd0.g.f75491e;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(primaryAction, "$primaryAction");
                Intrinsics.checkNotNullParameter(secondaryAction, "$secondaryAction");
                Intrinsics.checkNotNullParameter(it, "event");
                if (kh2.r.Z0(it, this$04.f75494c)) {
                    primaryAction.invoke();
                    return;
                } else {
                    if (kh2.r.a1(it, this$04.f75494c)) {
                        secondaryAction.invoke();
                        return;
                    }
                    return;
                }
            case 4:
                GestaltButtonGroup this_bind = (GestaltButtonGroup) obj3;
                eh0.b completeButtonRendering = (eh0.b) obj2;
                eh0.b bVar2 = (eh0.b) obj;
                Intrinsics.checkNotNullParameter(this_bind, "$this_bind");
                Intrinsics.checkNotNullParameter(completeButtonRendering, "$completeButtonRendering");
                Intrinsics.checkNotNullParameter(it, "event");
                if (kh2.r.Z0(it, this_bind)) {
                    completeButtonRendering.f58916b.invoke();
                    return;
                } else {
                    if (!kh2.r.a1(it, this_bind) || bVar2 == null) {
                        return;
                    }
                    bVar2.f58916b.invoke();
                    return;
                }
            case 5:
                vh0.b this$05 = (vh0.b) obj3;
                View.OnClickListener onConfirmClick = (View.OnClickListener) obj2;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(onConfirmClick, "$onConfirmClick");
                Intrinsics.checkNotNullParameter(it, "it");
                this$05.f125834d = true;
                onConfirmClick.onClick((GestaltButton) obj);
                return;
            case 6:
                kr0.b this$06 = (kr0.b) obj2;
                f30 pin3 = (f30) obj3;
                sg signal = (sg) obj;
                int i19 = kr0.b.f80759f;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(pin3, "$pin");
                Intrinsics.checkNotNullParameter(signal, "$signal");
                Intrinsics.checkNotNullParameter(it, "it");
                PinService pinService = this$06.f80764e;
                if (pinService == null) {
                    Intrinsics.r("pinService");
                    throw null;
                }
                String uid = pin3.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                String i23 = signal.i();
                if (i23 == null) {
                    i23 = "unknown";
                }
                uj2.b requestSignalReview = pinService.requestSignalReview(uid, i23);
                cp.b0 b0Var = new cp.b0(this$06, 15);
                requestSignalReview.getClass();
                new fk2.l(requestSignalReview, b0Var, 0).i(new xo.b(23), new uq0.c(3, kr0.a.f80758i));
                return;
            case 7:
                yi0.a this$07 = (yi0.a) obj3;
                m40 tag = (m40) obj2;
                String tagName = (String) obj;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(tag, "$model");
                Intrinsics.checkNotNullParameter(tagName, "$tagName");
                Intrinsics.checkNotNullParameter(it, "it");
                xu0.b bVar3 = (xu0.b) this$07.f139069c;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(tag, "tag");
                if (bVar3.f135936i.size() == 10) {
                    zu0.g gVar = (zu0.g) ((vu0.a) bVar3.getView());
                    i92.k kVar = gVar.B0;
                    if (kVar == null) {
                        Intrinsics.r("toastUtils");
                        throw null;
                    }
                    kVar.i(gVar.requireContext().getString(aq1.h.interest_tagging_limit_reached));
                } else {
                    ArrayList H0 = CollectionsKt.H0(bVar3.f135936i);
                    H0.add(tag);
                    if (bVar3.f135932e) {
                        bVar3.f135936i = H0;
                        bVar3.B3();
                    } else {
                        bVar3.x3(H0);
                    }
                }
                HashMap hashMap = new HashMap();
                String uid2 = tag.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                hashMap.put("pin_interest_id", uid2);
                hashMap.put("pin_interest_name", tagName);
                hashMap.put("is_freeform_tag", String.valueOf(tag.l().booleanValue()));
                nx.d0 d0Var = ((uk1.d) this$07.f139068b).f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                d0Var.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.PIN_INTEREST_TAG_SELECT, (r18 & 2) != 0 ? null : h32.u0.PIN_INTEREST_TAG, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                return;
            case 8:
                j21.f this$08 = (j21.f) obj3;
                g21.a aVar = (g21.a) obj2;
                GestaltButton this_apply4 = (GestaltButton) obj;
                int i24 = j21.f.f74498q;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Intrinsics.checkNotNullParameter(this_apply4, "$this_apply");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof xl1.a) {
                    String str = aVar.f63387i;
                    this$08.getClass();
                    new y11.c(i13, this$08, str).invoke(this_apply4);
                    return;
                }
                return;
            case 9:
                j21.f this$09 = (j21.f) obj3;
                g21.a aVar2 = (g21.a) obj2;
                GestaltIconButton this_apply5 = (GestaltIconButton) obj;
                int i25 = j21.f.f74498q;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                Intrinsics.checkNotNullParameter(this_apply5, "$this_apply");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    String str2 = aVar2.f63387i;
                    this$09.getClass();
                    new y11.c(i13, this$09, str2).invoke(this_apply5);
                    return;
                }
                return;
            case 10:
                u81.b0 this$010 = (u81.b0) obj3;
                h32.u0 elementType = (h32.u0) obj2;
                Function0 onClick = (Function0) obj;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                Intrinsics.checkNotNullParameter(elementType, "$elementType");
                Intrinsics.checkNotNullParameter(onClick, "$onClick");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    GestaltIconButton gestaltIconButton = this$010.f120993e;
                    if (gestaltIconButton != null) {
                        bs1.c.X0(gestaltIconButton);
                    }
                    GestaltIconButton gestaltIconButton2 = this$010.f120994f;
                    if (gestaltIconButton2 != null) {
                        bs1.c.X0(gestaltIconButton2);
                    }
                    nx.d0 d0Var2 = this$010.f121000l;
                    if (d0Var2 == null) {
                        Intrinsics.r("pinalytics");
                        throw null;
                    }
                    d0Var2.X(elementType);
                    onClick.invoke();
                    return;
                }
                return;
            case 11:
                Context context2 = (Context) obj3;
                GestaltTextField gestaltTextField = (GestaltTextField) obj2;
                yf1.k this$011 = (yf1.k) obj;
                int i26 = yf1.k.f138988h;
                Intrinsics.checkNotNullParameter(context2, "$context");
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (!(it instanceof xn1.f)) {
                    if (it instanceof xn1.a) {
                        this$011.c();
                        return;
                    }
                    return;
                } else if (((xn1.f) it).f135448c) {
                    hf0.b.t(context2);
                    return;
                } else {
                    hf0.b.k(gestaltTextField);
                    return;
                }
            case 12:
                cm1.d state = (cm1.d) obj3;
                Function0 function0 = (Function0) obj2;
                Function0 function02 = (Function0) obj;
                Intrinsics.checkNotNullParameter(state, "$state");
                Intrinsics.checkNotNullParameter(it, "event");
                int i27 = state.f28012a.f139308i;
                boolean z13 = it instanceof xl1.a;
                if (z13 && it.j() == i27) {
                    function0.invoke();
                    return;
                }
                int i28 = state.f28013b.f139308i;
                if (z13 && it.j() == i28) {
                    function02.invoke();
                    return;
                }
                return;
            case 13:
                GestaltPopoverMessage this$012 = (GestaltPopoverMessage) obj3;
                GestaltButton button = (GestaltButton) obj2;
                ym1.c newState = (ym1.c) obj;
                fm1.c cVar = GestaltPopoverMessage.A;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                Intrinsics.checkNotNullParameter(button, "$button");
                Intrinsics.checkNotNullParameter(newState, "$newState");
                Intrinsics.checkNotNullParameter(it, "state");
                if (it instanceof xl1.a) {
                    gm1.a aVar3 = (gm1.a) this$012.f49478z.f33804b;
                    if (aVar3 != null) {
                        aVar3.h3(new ym1.o(ym1.z.popover_button));
                    }
                    int i29 = this$012.f49460h;
                    int i33 = this$012.f49461i;
                    if (i29 < i33) {
                        this$012.f49460h = i29 + 1;
                    }
                    if (this$012.f49460h == i33) {
                        pk.a0.l0(button);
                        GestaltButton.SmallTertiaryButton smallTertiaryButton = this$012.f49455c;
                        if (smallTertiaryButton != null) {
                            pk.a0.v1(smallTertiaryButton);
                        }
                    } else {
                        button.d(ym1.l.f139431m);
                    }
                    GestaltText gestaltText = this$012.f49458f;
                    if (gestaltText != null) {
                        pp2.a.k(gestaltText, new ym1.j(newState, this$012));
                    }
                }
                GestaltText gestaltText2 = this$012.f49459g;
                if (gestaltText2 != null) {
                    gestaltText2.i(new ym1.b(this$012, 2));
                    return;
                }
                return;
            case 14:
                zo1.b this$013 = (zo1.b) obj3;
                rg0.g displayData = (rg0.g) obj;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                Intrinsics.checkNotNullParameter(displayData, "$displayData");
                Intrinsics.checkNotNullParameter(it, "it");
                lu1.b bVar4 = this$013.f142328a;
                Context context3 = ((GestaltButton) obj2).getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                ((lu1.c) bVar4).m(context3, displayData.f108010f);
                return;
            default:
                rb2.d this$014 = (rb2.d) obj3;
                String boardId = (String) obj2;
                String contactRequestId = (String) obj;
                int i34 = rb2.d.C;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                Intrinsics.checkNotNullParameter(boardId, "$boardId");
                Intrinsics.checkNotNullParameter(contactRequestId, "$contactRequestId");
                Intrinsics.checkNotNullParameter(it, "it");
                kp.m mVar = this$014.f107140m;
                if (mVar == null) {
                    Intrinsics.r("contactRequestUtils");
                    throw null;
                }
                if (mVar == null) {
                    Intrinsics.r("contactRequestUtils");
                    throw null;
                }
                Context context4 = this$014.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                mVar.a(kp.m.b(context4, boardId), contactRequestId, 0, boardId, null, null);
                return;
        }
    }

    public /* synthetic */ m1(kr0.b bVar, f30 f30Var, sg sgVar) {
        this.f109369a = 6;
        this.f109371c = bVar;
        this.f109370b = f30Var;
        this.f109372d = sgVar;
    }
}
