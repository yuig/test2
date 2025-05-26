package lp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.ay;
import com.pinterest.api.model.lh0;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.education.view.EducationNewContainerView;
import com.pinterest.feature.mediagallery.view.CreateFromWebsiteModalView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.ui.view.NoticeView;
import cp.z;
import df.j1;
import h32.d4;
import h32.g0;
import h32.u0;
import java.util.List;
import jc0.s;
import kh2.b0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m60.m0;
import m60.x0;
import nx.d0;
import pw0.v;
import so.oa;
import sw0.j0;

/* loaded from: classes3.dex */
public final class k extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84223a = 4;

    /* renamed from: b, reason: collision with root package name */
    public final Object f84224b;

    /* renamed from: c, reason: collision with root package name */
    public Object f84225c;

    public /* synthetic */ k(ha2.b bVar) {
        this(bVar, (SendableObject) null);
    }

    public final void b() {
        GestaltTextField gestaltTextField = (GestaltTextField) this.f84225c;
        if (gestaltTextField == null) {
            Intrinsics.r("editText");
            throw null;
        }
        String url = j1.y0(StringsKt.i0(gestaltTextField.B0()).toString());
        if (url == null || url.length() == 0) {
            GestaltTextField gestaltTextField2 = (GestaltTextField) this.f84225c;
            if (gestaltTextField2 == null) {
                Intrinsics.r("editText");
                throw null;
            }
            hf0.b.k(gestaltTextField2);
            Context context = kb0.a.f79058b;
            i92.k E2 = ((oa) ((j92.a) ep.b.g(j92.a.class))).E2();
            GestaltTextField gestaltTextField3 = (GestaltTextField) this.f84225c;
            if (gestaltTextField3 != null) {
                E2.i(gestaltTextField3.getContext().getString(x0.msg_invalid_url));
                return;
            } else {
                Intrinsics.r("editText");
                throw null;
            }
        }
        j0 j0Var = (j0) ((v) this.f84224b);
        j0Var.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        j0Var.s7().F(g0.MODAL_DIALOG, u0.FIND_IMAGES_BUTTON);
        if (j1.H0(false, Uri.parse(url))) {
            nu1.a aVar = j0Var.K0;
            if (aVar != null) {
                nu1.a.c(aVar, url, null, null, false, 30);
                return;
            } else {
                Intrinsics.r("inAppNavigator");
                throw null;
            }
        }
        lu1.d a73 = j0Var.a7();
        Context requireContext = j0Var.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Intent b13 = a73.b(requireContext, lu1.a.PIN_IT_ACTIVITY);
        b13.putExtra("android.intent.extra.TEXT", url);
        b13.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", "scraped");
        j0Var.f7().d(new s());
        FragmentActivity E4 = j0Var.E4();
        if (E4 != null) {
            E4.startActivityForResult(b13, 201);
        }
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        ay ayVar;
        int i13 = 6;
        AttributeSet attributeSet = null;
        int i14 = this.f84223a;
        final int i15 = 0;
        final int i16 = 1;
        Object obj = this.f84224b;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                jc0.n nVar = new jc0.n(context);
                nVar.q(false);
                nVar.k();
                nVar.o(true);
                nVar.L(x0.close_modal);
                nVar.Y(false);
                nVar.d0(false);
                nVar.T(true);
                nVar.D(new j(nVar, i15));
                nVar.x(new z(context, (String) obj, (q12.b) this.f84225c));
                return nVar;
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                jc0.n nVar2 = new jc0.n(context);
                nVar2.T(false);
                nVar2.Z(0, 0, 0, 0);
                nVar2.x(new br0.i(context, (d0) this.f84225c, nVar2.z(), null, (String) obj));
                setEducationContainer(new EducationNewContainerView(i13, context, attributeSet));
                return nVar2;
            case 2:
                Intrinsics.checkNotNullParameter(context, "context");
                ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
                modalViewWrapper.l(ct1.e.pin_web_title);
                CreateFromWebsiteModalView createFromWebsiteModalView = new CreateFromWebsiteModalView(i13, context, attributeSet);
                GestaltTextField gestaltTextField = createFromWebsiteModalView.f46724a;
                this.f84225c = gestaltTextField;
                if (gestaltTextField == null) {
                    Intrinsics.r("editText");
                    throw null;
                }
                gestaltTextField.Z(new gm1.a(this) { // from class: sw0.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ lp.k f115401b;

                    {
                        this.f115401b = this;
                    }

                    @Override // gm1.a
                    public final void h3(gm1.c event) {
                        int i17 = i15;
                        lp.k this$0 = this.f115401b;
                        switch (i17) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(event, "event");
                                if ((event instanceof xn1.d) && ve.h.X((xn1.d) event, 6)) {
                                    this$0.b();
                                    break;
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(event, "it");
                                this$0.b();
                                break;
                        }
                    }
                });
                modalViewWrapper.t(createFromWebsiteModalView);
                GestaltButton gestaltButton = modalViewWrapper.f44751c;
                if (gestaltButton != null) {
                    gestaltButton.d(sw0.b.f115404j);
                    gestaltButton.e(new gm1.a(this) { // from class: sw0.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ lp.k f115401b;

                        {
                            this.f115401b = this;
                        }

                        @Override // gm1.a
                        public final void h3(gm1.c event) {
                            int i17 = i16;
                            lp.k this$0 = this.f115401b;
                            switch (i17) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(event, "event");
                                    if ((event instanceof xn1.d) && ve.h.X((xn1.d) event, 6)) {
                                        this$0.b();
                                        break;
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(event, "it");
                                    this$0.b();
                                    break;
                            }
                        }
                    });
                }
                modalViewWrapper.post(new vs0.b(this, 12));
                return modalViewWrapper;
            case 3:
                Intrinsics.checkNotNullParameter(context, "context");
                jc0.n nVar3 = new jc0.n(context);
                ha2.b bVar = (ha2.b) obj;
                nVar3.T(bVar.c());
                Integer a13 = bVar.a();
                if (a13 != null) {
                    nVar3.l(a13.intValue());
                    GestaltText gestaltText = nVar3.f44750b;
                    if (gestaltText != null) {
                        gestaltText.i(jc0.k.f75416o);
                    }
                    nVar3.q(true);
                }
                ha2.d0 b13 = bVar.b();
                if (b13 != null) {
                    nVar3.Z(bs1.c.W(nVar3, b13.f68425a), bs1.c.W(nVar3, b13.f68426b), bs1.c.W(nVar3, b13.f68427c), bs1.c.W(nVar3, b13.f68428d));
                }
                for (ha2.c cVar : bVar.d()) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.g(applicationContext, "null cannot be cast to non-null type com.pinterest.base.PinterestApplication");
                    if (((m0) applicationContext).f85922q == null) {
                        Intrinsics.r("baseApplicationComponent");
                        throw null;
                    }
                    ha2.e eVar = new ha2.e(context, a02.e.I1());
                    eVar.a(cVar);
                    nVar3.x(eVar);
                }
                return nVar3;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                jc0.e eVar2 = new jc0.e(context);
                NoticeView view = new NoticeView(context, null, 0, true, 6);
                lh0 lh0Var = (lh0) obj;
                List k13 = lh0Var.k();
                if (k13 != null && (ayVar = (ay) CollectionsKt.firstOrNull(k13)) != null) {
                    view.i(ayVar, (d0) this.f84225c, b0.k0(lh0Var));
                }
                Intrinsics.checkNotNullParameter(view, "view");
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                ViewGroup viewGroup = eVar2.f44754f;
                if (viewGroup != null) {
                    viewGroup.addView(view);
                }
                eVar2.q(true);
                ViewGroup viewGroup2 = eVar2.f44753e;
                if (viewGroup2 != null) {
                    int i17 = eo1.b.color_background_info_weak;
                    Object obj2 = d5.a.f53679a;
                    viewGroup2.setBackgroundColor(context.getColor(i17));
                }
                int i18 = eo1.b.color_background_info_weak;
                Object obj3 = d5.a.f53679a;
                eVar2.setBackgroundColor(context.getColor(i18));
                return eVar2;
        }
    }

    @Override // jc0.a0
    public final String getPinId() {
        switch (this.f84223a) {
            case 3:
                SendableObject sendableObject = (SendableObject) this.f84225c;
                if (Intrinsics.d(sendableObject != null ? Boolean.valueOf(sendableObject.g()) : null, Boolean.TRUE)) {
                    return ((SendableObject) this.f84225c).d();
                }
                return null;
            default:
                return null;
        }
    }

    @Override // jc0.b, jc0.a0
    public final String getSavedInstanceStateKey() {
        switch (this.f84223a) {
            case 2:
                return k.class.getName();
            default:
                return super.getSavedInstanceStateKey();
        }
    }

    @Override // jc0.a0
    public final d4 getViewType() {
        switch (this.f84223a) {
            case 3:
                SendableObject sendableObject = (SendableObject) this.f84225c;
                return (sendableObject != null && sendableObject.g() && ((SendableObject) this.f84225c).h()) ? d4.MODAL_MORE_OPTIONS : d4.MODAL;
            default:
                return null;
        }
    }

    @Override // jc0.a0
    public final boolean isDismissible() {
        switch (this.f84223a) {
            case 4:
                return true;
            default:
                return !(this instanceof ji0.i);
        }
    }

    @Override // jc0.a0
    public final void onAboutToDismiss() {
        switch (this.f84223a) {
            case 2:
                GestaltTextField gestaltTextField = (GestaltTextField) this.f84225c;
                if (gestaltTextField != null) {
                    hf0.b.k(gestaltTextField);
                    return;
                } else {
                    Intrinsics.r("editText");
                    throw null;
                }
            default:
                return;
        }
    }

    public /* synthetic */ k(d0 d0Var) {
        this(d0Var, (String) null);
    }

    public k(lh0 sensitivity, d0 pinalytics) {
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f84224b = sensitivity;
        this.f84225c = pinalytics;
    }

    public k(ha2.b configuration, SendableObject sendableObject) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f84224b = configuration;
        this.f84225c = sendableObject;
    }

    public k(String conversationId, q12.b conversationService) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(conversationService, "conversationService");
        this.f84224b = conversationId;
        this.f84225c = conversationService;
    }

    public k(d0 pinalytics, String str) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f84225c = pinalytics;
        this.f84224b = str;
    }

    public k(j0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f84224b = listener;
    }
}
