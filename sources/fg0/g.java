package fg0;

import com.pinterest.education.user.signals.UserSignalsActionPromptView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.f0;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62124i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ UserSignalsActionPromptView f62125j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(UserSignalsActionPromptView userSignalsActionPromptView, int i13) {
        super(1);
        this.f62124i = i13;
        this.f62125j = userSignalsActionPromptView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f62124i;
        UserSignalsActionPromptView userSignalsActionPromptView = this.f62125j;
        switch (i13) {
            case 0:
                ao1.b it = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String str = userSignalsActionPromptView.f44965s;
                if (str == null) {
                    Intrinsics.r("emailTypoSuggestion");
                    throw null;
                }
                f0 x13 = ep.b.x(str, "string", str);
                String str2 = userSignalsActionPromptView.f44965s;
                if (str2 != null) {
                    return ao1.b.e(it, x13, null, null, null, null, false, 0, 0, 0, false, false, false, null, false, Integer.valueOf(str2.length()), null, null, null, null, 0, 4161534);
                }
                Intrinsics.r("emailTypoSuggestion");
                throw null;
            default:
                yl1.b it2 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                int i14 = UserSignalsActionPromptView.f44960v;
                String str3 = userSignalsActionPromptView.k().f58870m;
                return yl1.b.f(it2, ep.b.x(str3, "string", str3), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
        }
    }
}
