package th0;

import android.view.View;
import com.pinterest.expressSurvey.view.ExpressSurveyView;
import com.pinterest.expressSurvey.view.QuestionViewPager;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f117632b;

    public /* synthetic */ a(d dVar, int i13) {
        this.f117631a = i13;
        this.f117632b = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer a13;
        int i13 = this.f117631a;
        d this$0 = this.f117632b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.s3(System.currentTimeMillis());
                sh0.a aVar = this$0.f117637a;
                Integer a14 = aVar.a();
                if (a14 == null || a14.intValue() <= aVar.f112916e) {
                    aVar.f112914c = true;
                    d.r3();
                    return;
                }
                Integer a15 = aVar.a();
                if (a15 != null && (a13 = aVar.a()) != null && a13.intValue() > aVar.f112916e) {
                    aVar.f112916e = a15.intValue();
                }
                QuestionViewPager questionViewPager = this$0.f117643g;
                if (questionViewPager == null) {
                    Intrinsics.r("questionViewPager");
                    throw null;
                }
                questionViewPager.z(new c(this$0));
                ((ExpressSurveyView) this$0.getView()).f45057c.A(aVar.f112916e);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.s3(System.currentTimeMillis());
                this$0.f117637a.f112914c = true;
                d.r3();
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getPinalytics().X(u0.CLOSE_BUTTON);
                d.r3();
                return;
        }
    }
}
