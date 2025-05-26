package rh1;

import android.text.SpannableStringBuilder;
import com.pinterest.activity.pin.view.unifiedcomments.NewCommentTextEdit;
import com.pinterest.navigation.Navigation;
import h32.d4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x02.l2;

/* loaded from: classes5.dex */
public final class u1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108303i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v1 f108304j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(v1 v1Var, int i13) {
        super(1);
        this.f108303i = i13;
        this.f108304j = v1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f108303i;
        v1 v1Var = this.f108304j;
        switch (i13) {
            case 0:
                Boolean bool = (Boolean) obj;
                Intrinsics.f(bool);
                if (bool.booleanValue()) {
                    int i14 = v1.S0;
                    m60.w f73 = v1Var.f7();
                    NewCommentTextEdit newCommentTextEdit = v1Var.f108319v0;
                    if (newCommentTextEdit == null) {
                        Intrinsics.r("textEdit");
                        throw null;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(newCommentTextEdit.getText());
                    NewCommentTextEdit newCommentTextEdit2 = v1Var.f108319v0;
                    if (newCommentTextEdit2 == null) {
                        Intrinsics.r("textEdit");
                        throw null;
                    }
                    int selectionStart = newCommentTextEdit2.getSelectionStart();
                    up0.l lVar = v1Var.f108311n0;
                    if (lVar == null) {
                        Intrinsics.r("typeaheadTextUtility");
                        throw null;
                    }
                    l2 l2Var = v1Var.f108310m0;
                    if (l2Var == null) {
                        Intrinsics.r("typeaheadRepository");
                        throw null;
                    }
                    uk1.e eVar = v1Var.f108309l0;
                    if (eVar == null) {
                        Intrinsics.r("presenterPinalyticsFactory");
                        throw null;
                    }
                    nx.f0 f0Var = v1Var.f108308k0;
                    if (f0Var == null) {
                        Intrinsics.r("pinalyticsFactory");
                        throw null;
                    }
                    f73.d(new jc0.v(new zp0.b(spannableStringBuilder, selectionStart, lVar, l2Var, eVar, f0Var, v1Var.getF111517j0() == d4.PIN_COMMENTS ? wp0.f.PinComments : wp0.f.Pin, v1Var, Boolean.TRUE, v1Var.getD0(), v1Var.getV0()), false, 0L, 30));
                }
                return Unit.f80348a;
            case 1:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i15 = v1.S0;
                Navigation navigation = v1Var.I;
                String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_COMMENT_ID") : null;
                return om1.c.e(it, null, null, null, d7.b.Z(v03 == null || v03.length() == 0), null, false, 0, 1015);
            default:
                String it2 = (String) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                v1Var.h8(it2, null);
                return Unit.f80348a;
        }
    }
}
