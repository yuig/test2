package gg0;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.pinterest.education.ActionPromptView;
import com.pinterest.education.view.EducationActionPromptView;
import com.pinterest.education.view.EducationNewContainerView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class t implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EducationNewContainerView f64960a;

    public t(EducationNewContainerView educationNewContainerView) {
        this.f64960a = educationNewContainerView;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dg0.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        EducationNewContainerView.i(this.f64960a, event.f54924a, event.f54925b);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dg0.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        event.getClass();
        EducationNewContainerView educationNewContainerView = this.f64960a;
        educationNewContainerView.f45002r = null;
        int i13 = s.f64959a[event.f54926a.ordinal()];
        if (i13 == 1) {
            EducationNewContainerView.i(educationNewContainerView, event.f54927b, null);
            return;
        }
        if (i13 == 2) {
            educationNewContainerView.k();
            return;
        }
        if (i13 == 3) {
            educationNewContainerView.m();
            return;
        }
        if (i13 == 4) {
            educationNewContainerView.j(null);
            return;
        }
        if (i13 != 5) {
            return;
        }
        ActionPromptView actionPromptView = educationNewContainerView.f45001q;
        if (actionPromptView != null) {
            actionPromptView.t();
            if (actionPromptView instanceof EducationActionPromptView) {
                EducationActionPromptView educationActionPromptView = (EducationActionPromptView) actionPromptView;
                educationActionPromptView.Z(false);
                educationActionPromptView.o().setText(educationActionPromptView.getResources().getString(vb2.c.turn_on_push_notifications));
                GestaltText gestaltText = educationActionPromptView.f44956i;
                if (gestaltText != null) {
                    String string = educationActionPromptView.getResources().getString(vb2.c.toggle_on_notifications_in_your_phone_settings);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    pk.a0.p(gestaltText, string);
                    GestaltButton gestaltButton = educationActionPromptView.f44981r;
                    if (gestaltButton != null) {
                        gestaltButton.d(a.f64904u).e(new d(educationActionPromptView, 0));
                        GestaltText gestaltText2 = educationActionPromptView.f44982s;
                        if (gestaltText2 != null) {
                            gestaltText2.i(new f(educationActionPromptView, 2));
                            educationActionPromptView.l().d(a.f64905v).e(new d(educationActionPromptView, 1));
                            educationActionPromptView.setVisibility(0);
                            LinearLayout n13 = educationActionPromptView.n();
                            n13.setVisibility(0);
                            n13.startAnimation(AnimationUtils.loadAnimation(n13.getContext(), m60.n0.anim_slide_in_bottom));
                        } else {
                            Intrinsics.r("actionPromptCompleteButtonText");
                            throw null;
                        }
                    } else {
                        Intrinsics.r("actionPromptDismissButton");
                        throw null;
                    }
                } else {
                    Intrinsics.r("actionPromptDetail");
                    throw null;
                }
            }
        }
        Context context = educationNewContainerView.getContext();
        int i14 = fj.d.bright_foreground_disabled_material_light;
        Object obj = d5.a.f53679a;
        educationNewContainerView.setBackgroundColor(context.getColor(i14));
        educationNewContainerView.f44993i = true;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(dg0.p pVar) {
        String str = pVar != null ? pVar.f54928a : null;
        HashSet hashSet = EducationNewContainerView.A;
        this.f64960a.j(str);
    }
}
