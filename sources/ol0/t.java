package ol0;

import android.net.Uri;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.dk0;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.navigation.Navigation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lm0.x0;
import qm0.y1;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96429i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v7 f96430j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i13, v7 v7Var) {
        super(1);
        this.f96429i = i13;
        this.f96430j = v7Var;
    }

    public final sk0.f b(List tools) {
        int i13 = this.f96429i;
        v7 v7Var = this.f96430j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(tools, "tools");
                Integer s13 = v7Var.s1();
                Intrinsics.checkNotNullExpressionValue(s13, "getSectionlessPinCount(...)");
                int intValue = s13.intValue();
                Integer l13 = v7Var.l1();
                Intrinsics.checkNotNullExpressionValue(l13, "getPinCount(...)");
                int intValue2 = l13.intValue();
                Integer q13 = v7Var.q1();
                Intrinsics.checkNotNullExpressionValue(q13, "getSectionCount(...)");
                return new sk0.f(intValue, intValue2, q13.intValue(), tools);
            default:
                Intrinsics.checkNotNullParameter(tools, "tools");
                Integer s14 = v7Var.s1();
                Intrinsics.checkNotNullExpressionValue(s14, "getSectionlessPinCount(...)");
                int intValue3 = s14.intValue();
                Integer l14 = v7Var.l1();
                Intrinsics.checkNotNullExpressionValue(l14, "getPinCount(...)");
                int intValue4 = l14.intValue();
                Integer q14 = v7Var.q1();
                Intrinsics.checkNotNullExpressionValue(q14, "getSectionCount(...)");
                return new sk0.f(intValue3, intValue4, q14.intValue(), tools);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String B;
        int i13 = this.f96429i;
        v7 v7Var = this.f96430j;
        switch (i13) {
            case 0:
                vl1.p bind = (vl1.p) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                Boolean X0 = v7Var.X0();
                Intrinsics.checkNotNullExpressionValue(X0, "getHasActiveAds(...)");
                boolean booleanValue = X0.booleanValue();
                bind.getClass();
                bind.f126147h = booleanValue ? fm1.c.VISIBLE : fm1.c.GONE;
                return Unit.f80348a;
            case 1:
                x0 it = (x0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String uid = v7Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                return x0.b(it, uid, this.f96430j, null, null, null, null, null, null, 1020);
            case 2:
                return b((List) obj);
            case 3:
                y1 it2 = (y1) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                String uid2 = v7Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                return y1.b(it2, uid2, this.f96430j, null, null, null, false, false, null, 1020);
            case 4:
                x02.x0 handleBoardAction = (x02.x0) obj;
                switch (i13) {
                    case 4:
                        Intrinsics.checkNotNullParameter(handleBoardAction, "$this$handleBoardAction");
                        return handleBoardAction.a0(v7Var);
                    default:
                        Intrinsics.checkNotNullParameter(handleBoardAction, "$this$handleBoardAction");
                        return handleBoardAction.l0(v7Var);
                }
            case 5:
                x02.x0 handleBoardAction2 = (x02.x0) obj;
                switch (i13) {
                    case 4:
                        Intrinsics.checkNotNullParameter(handleBoardAction2, "$this$handleBoardAction");
                        return handleBoardAction2.a0(v7Var);
                    default:
                        Intrinsics.checkNotNullParameter(handleBoardAction2, "$this$handleBoardAction");
                        return handleBoardAction2.l0(v7Var);
                }
            case 6:
                return b((List) obj);
            case 7:
                ba section = (ba) obj;
                Intrinsics.checkNotNullParameter(section, "section");
                return uj2.q.y(new bv0.h(v7Var, section));
            case 8:
                Navigation navigateToBoard = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigateToBoard, "$this$navigateToBoard");
                dk0 y03 = v7Var.y0();
                if (y03 != null && (B = y03.B()) != null) {
                    navigateToBoard.m0("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", Uri.parse(B).getQueryParameter("request_params"));
                }
                return Unit.f80348a;
            default:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                e30 R6 = pin.R6();
                R6.C1(v7Var);
                R6.D1(Boolean.FALSE);
                f30 a13 = R6.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                return a13;
        }
    }
}
