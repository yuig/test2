package hz0;

import com.pinterest.feature.pear.quiz.view.QuizNuxView;
import h32.u0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kz0.f;
import nx.d0;
import om1.l;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f70639b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f70640c;

    public /* synthetic */ b(d0 d0Var, Function0 function0, int i13) {
        this.f70638a = i13;
        this.f70639b = d0Var;
        this.f70640c = function0;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f70638a;
        Function0 listener = this.f70640c;
        switch (i13) {
            case 0:
                int i14 = QuizNuxView.f46861a;
                d0 pinalytics = this.f70639b;
                Intrinsics.checkNotNullParameter(pinalytics, "$pinalytics");
                Intrinsics.checkNotNullParameter(listener, "$listener");
                Intrinsics.checkNotNullParameter(it, "it");
                c0.d.u2(pinalytics, null, null, u0.PEAR_ENTER_QUIZ_BUTTON, null, 11);
                listener.invoke();
                break;
            default:
                int i15 = f.f81154g;
                d0 pinalytics2 = this.f70639b;
                Intrinsics.checkNotNullParameter(pinalytics2, "$pinalytics");
                Intrinsics.checkNotNullParameter(listener, "$onBackPressed");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof l) {
                    c0.d.u2(pinalytics2, null, null, u0.CLOSE_BUTTON, null, 11);
                    listener.invoke();
                    break;
                }
                break;
        }
    }
}
