package wh0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import pk.a0;
import xk2.m;
import xk2.v;

/* loaded from: classes5.dex */
public final class j extends g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f129916f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final v f129917e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, sh0.c question, th0.a onNextClickListener, th0.a aVar) {
        super(context, question, onNextClickListener, aVar);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(onNextClickListener, "onNextClickListener");
        this.f129917e = m.b(b.f129899k);
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
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        cp.b bVar = new cp.b(this, 8);
        getContext();
        PinterestLinearLayoutManager pinterestLinearLayoutManager = new PinterestLinearLayoutManager(bVar, 1, false);
        RecyclerView.LayoutParams layoutParams2 = new RecyclerView.LayoutParams(-1, -1);
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        j0 j0Var = new j0();
        j0Var.f80434a = this.f129910b;
        if (aVar != null) {
            j0Var.f80434a = aVar;
        }
        recyclerView.R2(pinterestLinearLayoutManager);
        recyclerView.setLayoutParams(layoutParams2);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        xh0.e eVar = new xh0.e(context2, new GestaltButton(0, 14, context3, (AttributeSet) null), (View.OnClickListener) j0Var.f80434a);
        sh0.c cVar = this.f129909a;
        List list = cVar.f112924c;
        Boolean bool = cVar.f112928g;
        recyclerView.H2(new xh0.d(eVar, list, bool != null ? bool.booleanValue() : false, xh0.c.f134962j));
        b2 b2Var = recyclerView.f19240m;
        if (b2Var != null) {
            b2Var.z(new h(j0Var, recyclerView, 0));
        }
        layoutParams.addRule(13);
        relativeLayout.addView(recyclerView, layoutParams);
        gestaltButton.d(i.f129915i);
        a0.p(gestaltText, cVar.f112923b);
        linearLayout.addView(relativeLayout);
    }
}
