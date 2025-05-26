package wh0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.text.GestaltText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import pk.a0;
import xk2.m;
import xk2.v;

/* loaded from: classes5.dex */
public final class c extends g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f129901g = 0;

    /* renamed from: e, reason: collision with root package name */
    public final v f129902e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltButton f129903f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, sh0.c question, th0.a onNextClickListener, th0.a aVar) {
        super(context, question, onNextClickListener, aVar);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(onNextClickListener, "onNextClickListener");
        this.f129902e = m.b(b.f129898j);
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
        GestaltButton gestaltButton = (GestaltButton) findViewById3;
        this.f129903f = gestaltButton;
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        cp.b bVar = new cp.b(this, 7);
        getContext();
        PinterestLinearLayoutManager pinterestLinearLayoutManager = new PinterestLinearLayoutManager(bVar, 1, false);
        RecyclerView.LayoutParams layoutParams2 = new RecyclerView.LayoutParams(-1, -1);
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        recyclerView.R2(pinterestLinearLayoutManager);
        recyclerView.setLayoutParams(layoutParams2);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        xh0.g gVar = new xh0.g(context2, new GestaltCheckBox(context3));
        sh0.c cVar = this.f129909a;
        List list = cVar.f112924c;
        Boolean bool = cVar.f112928g;
        recyclerView.H2(new xh0.d(gVar, list, bool != null ? bool.booleanValue() : false, new a(this, 0)));
        layoutParams.addRule(13);
        relativeLayout.addView(recyclerView, layoutParams);
        linearLayout.addView(relativeLayout);
        a0.p(gestaltText, cVar.f112923b);
        j0 j0Var = new j0();
        j0Var.f80434a = this.f129910b;
        View.OnClickListener onClickListener = this.f129911c;
        if (onClickListener != null) {
            j0Var.f80434a = onClickListener;
        }
        gestaltButton.d(new hh0.a(this, 2)).e(new bp.j(15, j0Var, this));
        gestaltButton.d(new jc0.m(false, 2));
    }
}
