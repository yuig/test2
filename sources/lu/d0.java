package lu;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.radioGroup.GestaltRadio;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d0 extends LinearLayout implements yk1.n {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f84872g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f84873a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f84874b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltRadio f84875c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f84876d;

    /* renamed from: e, reason: collision with root package name */
    public final int f84877e;

    /* renamed from: f, reason: collision with root package name */
    public final int f84878f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context, vt.e adsQuizManager) {
        super(context);
        int c13;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adsQuizManager, "adsQuizManager");
        Intrinsics.checkNotNullParameter("", "answer");
        this.f84878f = pk.a0.q0(context) ? dl2.b.y0(this, eo1.a.color_background_dark_opacity_500) : -1;
        View.inflate(context, ps.q.quiz_question_view, this);
        View findViewById = findViewById(ps.p.quiz_question_container_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        MaterialCardView materialCardView = (MaterialCardView) findViewById;
        this.f84873a = materialCardView;
        View findViewById2 = findViewById(ps.p.question_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f84876d = (ConstraintLayout) findViewById2;
        View findViewById3 = findViewById(ps.p.question_radio);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f84875c = (GestaltRadio) findViewById3;
        View findViewById4 = findViewById(ps.p.question_text);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById4;
        this.f84874b = gestaltText;
        pk.a0.p(gestaltText, "");
        if (pk.a0.q0(context)) {
            c13 = dl2.b.y0(this, eo1.a.color_background_dark_opacity_300);
        } else {
            f30 f30Var = adsQuizManager.f126577d;
            float[] fArr = new float[3];
            Color.colorToHSV(Color.parseColor(f30Var != null ? f30Var.i4() : null), fArr);
            if (fArr[1] > 0.1f) {
                fArr[1] = 0.1f;
            }
            fArr[2] = 0.95f;
            c13 = f5.c.c(-1, 0.4f, Color.HSVToColor(fArr));
        }
        this.f84877e = c13;
        d7.b.A0(materialCardView.getBackground(), c13);
        adsQuizManager.f126585l.F(new zt.b(19, new wt.c(this, 8)), new zt.b(20, a.f84857x), ck2.i.f27923c, ck2.i.f27924d);
    }

    public final void a(boolean z13) {
        int i13 = this.f84878f;
        int i14 = this.f84877e;
        if (!z13) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(i13, i14);
            valueAnimator.setEvaluator(new ArgbEvaluator());
            valueAnimator.addUpdateListener(new c0(this, 1));
            valueAnimator.start();
            return;
        }
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.setIntValues(i14, i13);
        valueAnimator2.setEvaluator(new ArgbEvaluator());
        valueAnimator2.addUpdateListener(new c0(this, 0));
        valueAnimator2.setDuration(200L);
        valueAnimator2.start();
    }
}
