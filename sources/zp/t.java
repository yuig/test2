package zp;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.sg;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalListViewWrapper;
import com.pinterest.component.modal.ModalViewWithImageWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.feature.settings.shared.view.UnsavedChangesModalView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.repository.pin.PinService;
import com.pinterest.ui.imageview.WebImageView;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rq.m1;
import so.jb;
import so.oa;

/* loaded from: classes3.dex */
public final class t extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142488a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f142489b;

    public t(bq.b bVar) {
        this.f142489b = bVar;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        int i13 = this.f142488a;
        int i14 = 1;
        int i15 = 0;
        Object obj = this.f142489b;
        switch (i13) {
            case 0:
                ModalListViewWrapper modalListViewWrapper = new ModalListViewWrapper(context);
                modalListViewWrapper.l(d70.g.sort_boards);
                bq.b bVar = (bq.b) obj;
                xp.b bVar2 = new xp.b();
                ArrayList arrayList = new ArrayList();
                bq.b bVar3 = bq.b.MOST_RECENT;
                arrayList.add(new xp.a(bVar3, bVar3.isSameOption(bVar)));
                bq.b bVar4 = bq.b.ALPHABETICAL;
                arrayList.add(new xp.a(bVar4, bVar4.isSameOption(bVar)));
                bq.b bVar5 = bq.b.NEWEST;
                arrayList.add(new xp.a(bVar5, bVar5.isSameOption(bVar)));
                bq.b bVar6 = bq.b.OLDEST;
                arrayList.add(new xp.a(bVar6, bVar6.isSameOption(bVar)));
                bq.b bVar7 = bq.b.CUSTOM;
                arrayList.add(new xp.a(bVar7, bVar7.isSameOption(bVar)));
                bVar2.a(arrayList);
                modalListViewWrapper.t(bVar2);
                return modalListViewWrapper;
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                jc0.n nVar = new jc0.n(context);
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(pin, "pin");
                kr0.b bVar8 = new kr0.b(context);
                if (!bVar8.f80761b) {
                    bVar8.f80761b = true;
                    oa oaVar = ((jb) ((kr0.c) bVar8.generatedComponent())).f113483a;
                    bVar8.f80762c = (m60.w) oaVar.f113885r0.get();
                    bVar8.f80763d = (m60.q) oaVar.Q1.get();
                    bVar8.f80764e = (PinService) oaVar.f113713h3.get();
                }
                View.inflate(context, wy1.e.dev_skin_tone_feedback_modal, bVar8);
                ((WebImageView) bVar8.findViewById(wy1.d.pin_image)).loadUrl(bs1.c.B0(pin));
                if (bVar8.f80763d == null) {
                    Intrinsics.r("developerOptions");
                    throw null;
                }
                sg I = c0.d.I(pin, ff0.a.f62099a);
                if (I != null) {
                    WebImageView webImageView = (WebImageView) bVar8.findViewById(wy1.d.skin_tone_image);
                    String h10 = I.h();
                    if (h10 != null) {
                        webImageView.loadUrl(h10);
                    } else {
                        webImageView.setVisibility(8);
                    }
                    ((GestaltText) bVar8.findViewById(wy1.d.skin_tone_type)).i(new lq0.f1(I, 3));
                    ((GestaltButton) bVar8.findViewById(wy1.d.ok_button)).e(new m1(bVar8, pin, I));
                }
                ((GestaltButton) bVar8.findViewById(wy1.d.cancel_button)).e(new np0.h(bVar8, 2));
                nVar.T(false);
                nVar.x(bVar8);
                return nVar;
            case 2:
                Intrinsics.checkNotNullParameter(context, "context");
                ModalViewWithImageWrapper modalViewWithImageWrapper = new ModalViewWithImageWrapper(6, context, (AttributeSet) null);
                int i16 = ga2.c.rounded_corner_modal;
                Context context2 = modalViewWithImageWrapper.getContext();
                Object obj2 = d5.a.f53679a;
                modalViewWithImageWrapper.setBackground(context2.getDrawable(i16));
                ev.a aVar = new ev.a(context, (Function0) obj);
                ViewGroup viewGroup = modalViewWithImageWrapper.f44754f;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = modalViewWithImageWrapper.f44754f;
                if (viewGroup2 != null) {
                    viewGroup2.addView(aVar);
                }
                return modalViewWithImageWrapper;
            case 3:
                Intrinsics.checkNotNullParameter(context, "context");
                jc0.e eVar = new jc0.e(context);
                eVar.j(u91.a.f121205i);
                eVar.l(m60.x0.settings_dark_mode_choose_theme);
                z91.w view = new z91.w(context, (lb0.q) obj);
                Intrinsics.checkNotNullParameter(view, "view");
                ViewGroup viewGroup3 = eVar.f44754f;
                if (viewGroup3 != null) {
                    viewGroup3.addView(view);
                }
                return eVar;
            case 4:
                Intrinsics.checkNotNullParameter(context, "context");
                ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
                modalViewWrapper.q(false);
                UnsavedChangesModalView unsavedChangesModalView = new UnsavedChangesModalView(6, context, (AttributeSet) null);
                xc1.a listener = (xc1.a) obj;
                Intrinsics.checkNotNullParameter(listener, "listener");
                unsavedChangesModalView.f48373a = new zc1.j(listener, unsavedChangesModalView, i15);
                unsavedChangesModalView.f48374b = new zc1.j(listener, unsavedChangesModalView, i14);
                modalViewWrapper.t(unsavedChangesModalView);
                return modalViewWrapper;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                ModalViewWrapper modalViewWrapper2 = new ModalViewWrapper(context);
                modalViewWrapper2.s(com.pinterest.partnerAnalytics.e.pin_stats_intro_education);
                modalViewWrapper2.k();
                int i17 = eo1.d.lego_modal_bg;
                Object obj3 = d5.a.f53679a;
                modalViewWrapper2.setBackground(context.getDrawable(i17));
                GestaltText gestaltText = modalViewWrapper2.f44750b;
                if (gestaltText != null) {
                    pk.a0.k0(gestaltText);
                }
                GestaltIconButton gestaltIconButton = modalViewWrapper2.f44749a;
                if (gestaltIconButton != null) {
                    com.bumptech.glide.c.d0(gestaltIconButton);
                }
                ((GestaltButton) modalViewWrapper2.findViewById(com.pinterest.partnerAnalytics.d.btnGetStarted)).d(xx1.b.f136130k).e(new gh1.e(this, 26));
                return modalViewWrapper2;
        }
    }

    @Override // jc0.a0
    public final void onAboutToDismiss() {
        switch (this.f142488a) {
            case 5:
                ((rg0.n) this.f142489b).a(null, null);
                break;
        }
    }

    public t(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f142489b = pin;
    }

    public t(db.m actionButtonListener) {
        Intrinsics.checkNotNullParameter(actionButtonListener, "actionButtonListener");
        this.f142489b = actionButtonListener;
    }

    public t(lb0.q prefsManagerPersisted) {
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        this.f142489b = prefsManagerPersisted;
    }

    public t(q01.o actionListener) {
        Intrinsics.checkNotNullParameter(actionListener, "actionListener");
        this.f142489b = actionListener;
    }

    public t(rg0.n experienceValue) {
        Intrinsics.checkNotNullParameter(experienceValue, "experienceValue");
        this.f142489b = experienceValue;
    }
}
