package hz0;

import android.view.View;
import com.pinterest.feature.pear.quiz.view.QuizChoiceButton;
import com.pinterest.feature.pear.quiz.view.QuizGradingAnswerView;
import fz0.u;
import kh2.j;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f70636b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f70637c;

    public /* synthetic */ a(u uVar, int i13, int i14) {
        this.f70635a = i14;
        this.f70636b = uVar;
        this.f70637c = i13;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f70635a;
        int i14 = this.f70637c;
        u viewModel = this.f70636b;
        switch (i13) {
            case 0:
                int i15 = QuizChoiceButton.f46859h;
                Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
                j.x2(viewModel, new fz0.c(i14));
                break;
            default:
                int i16 = QuizGradingAnswerView.f46860a;
                Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
                j.x2(viewModel, new fz0.c(i14));
                break;
        }
    }
}
