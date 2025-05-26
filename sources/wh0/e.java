package wh0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import java.util.List;
import jc0.m;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import pk.a0;

/* loaded from: classes5.dex */
public final class e extends g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f129905f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltButton f129906e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, sh0.c question, th0.a onNextClickListener, th0.a aVar) {
        super(context, question, onNextClickListener, aVar);
        GestaltButton gestaltButton;
        boolean z13;
        Pair pair;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(onNextClickListener, "onNextClickListener");
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -1);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(5, 1, false);
        LayoutInflater from = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        from.inflate(rh0.d.fragment_express_survey_question_container, this);
        View findViewById = findViewById(rh0.c.express_survey_question_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        View findViewById2 = findViewById(rh0.c.express_survey_answers_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(rh0.c.express_survey_next_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltButton gestaltButton2 = (GestaltButton) findViewById3;
        this.f129906e = gestaltButton2;
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText2 = new GestaltText(6, context2, (AttributeSet) null);
        dl2.b.y2(gestaltText2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        GestaltText gestaltText3 = new GestaltText(6, context3, (AttributeSet) null);
        dl2.b.y2(gestaltText3);
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        recyclerView.setId(rh0.c.express_survey_answers_container);
        recyclerView.R2(gridLayoutManager);
        recyclerView.setLayoutParams(layoutParams);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        recyclerView.m(new yh0.a(context4));
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        xh0.h hVar = new xh0.h(context5, new FrameLayout(getContext()), new sh0.b());
        sh0.c cVar = this.f129909a;
        List list = cVar.f112924c;
        Boolean bool = cVar.f112928g;
        if (bool != null) {
            z13 = bool.booleanValue();
            gestaltButton = gestaltButton2;
        } else {
            gestaltButton = gestaltButton2;
            z13 = false;
        }
        recyclerView.H2(new xh0.d(hVar, list, z13, new a(this, 1)));
        layoutParams2.addRule(13);
        int i13 = 3;
        layoutParams3.addRule(3, recyclerView.getId());
        layoutParams3.addRule(21);
        layoutParams4.addRule(3, recyclerView.getId());
        layoutParams4.addRule(20);
        gestaltText2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        gestaltText3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        relativeLayout.addView(recyclerView, layoutParams2);
        relativeLayout.addView(gestaltText2, layoutParams3);
        relativeLayout.addView(gestaltText3, layoutParams4);
        linearLayout.addView(relativeLayout);
        int i14 = d.f129904a[cVar.f112929h.ordinal()];
        if (i14 == 1) {
            pair = new Pair(getContext().getString(rh0.e.express_survey_unlikely_description), getContext().getString(rh0.e.express_survey_likely_description));
        } else if (i14 == 2) {
            pair = new Pair(getContext().getString(rh0.e.express_survey_disagree_description), getContext().getString(rh0.e.express_survey_agree_description));
        } else if (i14 != 3) {
            vb0.j.f125466a.G("Express Survey numeric scale question type should not have a non-numeric scale question type", new Object[0]);
            pair = new Pair(getContext().getString(rh0.e.express_survey_unfavorable_description), getContext().getString(rh0.e.express_survey_favorable_description));
        } else {
            pair = new Pair(getContext().getString(rh0.e.express_survey_unfavorable_description), getContext().getString(rh0.e.express_survey_favorable_description));
        }
        String str = (String) pair.f80346a;
        String str2 = (String) pair.f80347b;
        Intrinsics.f(str);
        a0.p(gestaltText3, str);
        Intrinsics.f(str2);
        a0.p(gestaltText2, str2);
        a0.p(gestaltText, cVar.f112923b);
        j0 j0Var = new j0();
        j0Var.f80434a = this.f129910b;
        View.OnClickListener onClickListener = this.f129911c;
        if (onClickListener != null) {
            j0Var.f80434a = onClickListener;
        }
        GestaltButton gestaltButton3 = gestaltButton;
        gestaltButton3.d(new hh0.a(this, i13)).e(new bp.j(16, j0Var, this));
        gestaltButton3.d(new m(false, 3));
    }
}
