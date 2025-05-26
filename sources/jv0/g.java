package jv0;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinInteractiveVideoView;
import com.pinterest.feature.ideaPinCreation.closeup.view.f0;
import com.pinterest.feature.sendshare.view.ContactSearchAndSelectModalView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import java.util.Iterator;
import java.util.LinkedHashMap;
import jv0.g;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import lh0.n1;
import lh0.q4;
import m60.u;
import m60.w;
import m60.x0;
import nx.d0;
import om1.l;
import rq.c2;

/* loaded from: classes5.dex */
public final class g extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77626a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f77627b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f77628c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f77629d;

    /* renamed from: e, reason: collision with root package name */
    public Object f77630e;

    public g(SendableObject sendableObject, g91.c cVar) {
        this.f77626a = 1;
        this.f77629d = u.f85943a;
        this.f77630e = n1.f83436b.c();
        this.f77628c = sendableObject;
        this.f77627b = cVar;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        int i13 = this.f77626a;
        final int i14 = 1;
        Object obj = this.f77627b;
        Object obj2 = this.f77628c;
        final int i15 = 0;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(context, "context");
                h hVar = new h(context);
                int B = bs1.c.B(hVar, eo1.b.color_black_900);
                int W = bs1.c.W(hVar, eo1.c.lego_spacing_between_elements);
                hVar.setBackgroundColor(B);
                hVar.setOrientation(1);
                hVar.setGravity(1);
                hVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                Context context2 = hVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int i16 = 6;
                GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
                gestaltText.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                gestaltText.i(new c2(gestaltText, 8));
                dl2.b.y2(gestaltText);
                hVar.f77633c = gestaltText;
                Context context3 = hVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                GestaltText gestaltText2 = new GestaltText(6, context3, (AttributeSet) null);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                int W2 = bs1.c.W(gestaltText2, eo1.c.space_800);
                com.bumptech.glide.c.a1(marginLayoutParams, W2, W, W2, W);
                gestaltText2.setLayoutParams(marginLayoutParams);
                gestaltText2.setGravity(17);
                gestaltText2.i(new c2(gestaltText2, 7));
                dl2.b.y2(gestaltText2);
                hVar.f77632b = gestaltText2;
                Context context4 = hVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                GestaltButton.LargePrimaryButton largePrimaryButton = new GestaltButton.LargePrimaryButton(6, context4, (AttributeSet) null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = bs1.c.W(largePrimaryButton, eo1.c.space_600);
                largePrimaryButton.setLayoutParams(layoutParams);
                largePrimaryButton.d(f.f77624l);
                hVar.f77631a = largePrimaryButton;
                GestaltText gestaltText3 = hVar.f77633c;
                if (gestaltText3 == null) {
                    Intrinsics.r("titleGestaltText");
                    throw null;
                }
                hVar.addView(gestaltText3);
                GestaltText gestaltText4 = hVar.f77632b;
                if (gestaltText4 == null) {
                    Intrinsics.r("messageGestaltText");
                    throw null;
                }
                hVar.addView(gestaltText4);
                GestaltButton.LargePrimaryButton largePrimaryButton2 = hVar.f77631a;
                if (largePrimaryButton2 == null) {
                    Intrinsics.r("gestaltButton");
                    throw null;
                }
                hVar.addView(largePrimaryButton2);
                this.f77630e = hVar;
                int A = bs1.c.A(context, eo1.b.color_black_900);
                ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context, false);
                h hVar2 = (h) this.f77630e;
                if (hVar2 == null) {
                    Intrinsics.r("_emailConfirmationModalView");
                    throw null;
                }
                modalViewWrapper.t(hVar2);
                modalViewWrapper.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                modalViewWrapper.setBackgroundColor(A);
                modalViewWrapper.setBackgroundColor(A);
                GestaltIconButton gestaltIconButton = modalViewWrapper.f44749a;
                if (gestaltIconButton != null) {
                    gestaltIconButton.t(f.f77622j);
                }
                h hVar3 = (h) this.f77630e;
                if (hVar3 == null) {
                    Intrinsics.r("_emailConfirmationModalView");
                    throw null;
                }
                lq0.o eventHandler = new lq0.o(i16, this, modalViewWrapper);
                Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
                GestaltButton.LargePrimaryButton largePrimaryButton3 = hVar3.f77631a;
                if (largePrimaryButton3 != null) {
                    largePrimaryButton3.e(eventHandler);
                    return modalViewWrapper;
                }
                Intrinsics.r("gestaltButton");
                throw null;
            case 1:
                ModalViewWrapper modalViewWrapper2 = new ModalViewWrapper(context, false);
                ((GestaltIconButton) modalViewWrapper2.findViewById(ga2.d.modal_header_dismiss_bt)).u(new gm1.a(this) { // from class: g91.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f64571b;

                    {
                        this.f64571b = this;
                    }

                    @Override // gm1.a
                    public final void h3(gm1.c cVar) {
                        int i17 = i15;
                        g gVar = this.f64571b;
                        gVar.getClass();
                        switch (i17) {
                            case 0:
                                if (cVar instanceof l) {
                                    h91.a.f68311d.a();
                                    Object obj3 = gVar.f77629d;
                                    ((w) obj3).d(new b());
                                    a.c.y((w) obj3);
                                    break;
                                }
                                break;
                            default:
                                h91.a.f68311d.a();
                                Object obj4 = gVar.f77629d;
                                ((w) obj4).d(new b());
                                a.c.y((w) obj4);
                                break;
                        }
                    }
                });
                GestaltButton gestaltButton = (GestaltButton) modalViewWrapper2.findViewById(ga2.d.modal_done_btn);
                gestaltButton.e(new gm1.a(this) { // from class: g91.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f64571b;

                    {
                        this.f64571b = this;
                    }

                    @Override // gm1.a
                    public final void h3(gm1.c cVar) {
                        int i17 = i14;
                        g gVar = this.f64571b;
                        gVar.getClass();
                        switch (i17) {
                            case 0:
                                if (cVar instanceof l) {
                                    h91.a.f68311d.a();
                                    Object obj3 = gVar.f77629d;
                                    ((w) obj3).d(new b());
                                    a.c.y((w) obj3);
                                    break;
                                }
                                break;
                            default:
                                h91.a.f68311d.a();
                                Object obj4 = gVar.f77629d;
                                ((w) obj4).d(new b());
                                a.c.y((w) obj4);
                                break;
                        }
                    }
                });
                k3.R1(gestaltButton, true);
                int i17 = ContactSearchAndSelectModalView.G;
                modalViewWrapper2.t(kg.p.R(context, (SendableObject) obj2, modalViewWrapper2, (g91.c) obj, false, x0.send, x0.sent));
                return modalViewWrapper2;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                jc0.n nVar = new jc0.n(context);
                nVar.Z(0, 0, 0, 0);
                dd2.g gVar = new dd2.g(nVar.z(), (d0) obj2, (rg0.n) this.f77629d, (q4) obj, context);
                this.f77630e = gVar;
                nVar.x(gVar);
                nVar.T(false);
                return nVar;
        }
    }

    @Override // jc0.a0
    public final int getLayoutHeight() {
        switch (this.f77626a) {
            case 0:
            case 1:
                return -1;
            default:
                return -2;
        }
    }

    @Override // jc0.a0
    public final void onAboutToDismiss() {
        switch (this.f77626a) {
            case 0:
                yt0.a aVar = (yt0.a) this.f77627b;
                if (aVar != null) {
                    IdeaPinInteractiveVideoView d03 = ((f0) aVar).d0();
                    if (!d03.N) {
                        d03.play();
                        break;
                    }
                }
                break;
            case 1:
                h91.a aVar2 = h91.a.f68311d;
                LinkedHashMap linkedHashMap = aVar2.f68313b;
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    ((TypeAheadItem) it.next()).f35152m = false;
                }
                LinkedHashMap linkedHashMap2 = aVar2.f68314c;
                Iterator it2 = linkedHashMap2.values().iterator();
                while (it2.hasNext()) {
                    ((TypeAheadItem) it2.next()).f35152m = true;
                }
                linkedHashMap.clear();
                linkedHashMap2.clear();
                break;
        }
    }

    public g(q4 experiments, d0 pinalytics, rg0.n expValue) {
        this.f77626a = 2;
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(expValue, "expValue");
        this.f77627b = experiments;
        this.f77628c = pinalytics;
        this.f77629d = expValue;
    }

    public g(yt0.a aVar, x10.d settingsApi, b60.b activeUserManager) {
        this.f77626a = 0;
        Intrinsics.checkNotNullParameter(settingsApi, "settingsApi");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f77627b = aVar;
        this.f77628c = settingsApi;
        this.f77629d = activeUserManager;
    }
}
