package sf1;

import android.content.Context;
import android.view.View;
import com.pinterest.feature.storypin.closeup.view.IdeaPinHideView;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112799i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f112800j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f112801k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(int i13, Object obj, Object obj2) {
        super(0);
        this.f112799i = i13;
        this.f112800j = obj;
        this.f112801k = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f112799i;
        Object obj = this.f112801k;
        Object obj2 = this.f112800j;
        switch (i13) {
            case 0:
                Context context = (Context) obj2;
                Intrinsics.checkNotNullParameter(context, "context");
                f fVar = new f(context);
                View findViewById = fVar.findViewById(pq1.d.idea_pin_hide_reason_details);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                pk.a0.o((GestaltText) findViewById, pq1.f.idea_pin_ad_hidden_description, new Object[0]);
                e1 e1Var = (e1) obj;
                e1Var.addView(fVar);
                e1.L(e1Var, fVar);
                return fVar;
            case 1:
                IdeaPinHideView ideaPinHideView = new IdeaPinHideView((Context) obj2);
                e1 e1Var2 = (e1) obj;
                e1Var2.addView(ideaPinHideView);
                e1.L(e1Var2, ideaPinHideView);
                return ideaPinHideView;
            default:
                w0 w0Var = ((s) obj2).C;
                if (w0Var != null) {
                    qf1.x sticker = (qf1.x) obj;
                    Intrinsics.checkNotNullParameter(sticker, "sticker");
                    j1 j1Var = w0Var.f112788a.G;
                    if (j1Var != null) {
                        rf1.p0 p0Var = (rf1.p0) j1Var;
                        Intrinsics.checkNotNullParameter(sticker, "sticker");
                        p0Var.f107866t0.put(sticker, Long.valueOf(((pb0.g) p0Var.f107859q).a()));
                        p0Var.Y3(qf1.y.a(sticker.f103776b, h32.f1.RENDER, null, 6));
                    }
                }
                return Unit.f80348a;
        }
    }
}
