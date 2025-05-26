package gg0;

import android.content.Intent;
import com.pinterest.education.view.EducationActionPromptView;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class d implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EducationActionPromptView f64916b;

    public /* synthetic */ d(EducationActionPromptView educationActionPromptView, int i13) {
        this.f64915a = i13;
        this.f64916b = educationActionPromptView;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f64915a;
        EducationActionPromptView this$0 = this.f64916b;
        switch (i13) {
            case 0:
                int i14 = EducationActionPromptView.f44977y;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.s().d(new dg0.c(dg0.b.DISMISS));
                return;
            case 1:
                int i15 = EducationActionPromptView.f44977y;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                m60.w s13 = this$0.s();
                eg0.a k13 = this$0.k();
                if (k13.f58872o != i32.u.COMPLETE.getValue()) {
                    eg0.a k14 = this$0.k();
                    if (k14.f58872o != i32.u.COMPLETE_AND_SHOW.getValue()) {
                        eg0.a k15 = this$0.k();
                        if (k15.f58872o == i32.u.DONT_COMPLETE_AND_HIDE.getValue()) {
                            s13.d(new dg0.c(dg0.b.DISMISS_UI));
                            return;
                        }
                        return;
                    }
                }
                s13.d(new dg0.c(dg0.b.COMPLETE));
                Intent intent = new Intent();
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", this$0.getContext().getPackageName());
                this$0.getContext().startActivity(intent);
                return;
            default:
                int i16 = EducationActionPromptView.f44977y;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof xn1.b) {
                    if (tr1.b.c(String.valueOf(((xn1.b) it).f135438c))) {
                        this$0.l().d(a.f64897n);
                        GestaltText gestaltText = this$0.f44982s;
                        if (gestaltText != null) {
                            gestaltText.i(a.f64898o);
                            return;
                        } else {
                            Intrinsics.r("actionPromptCompleteButtonText");
                            throw null;
                        }
                    }
                    this$0.l().d(a.f64895l);
                    GestaltText gestaltText2 = this$0.f44982s;
                    if (gestaltText2 != null) {
                        gestaltText2.i(a.f64896m);
                        return;
                    } else {
                        Intrinsics.r("actionPromptCompleteButtonText");
                        throw null;
                    }
                }
                return;
        }
    }
}
