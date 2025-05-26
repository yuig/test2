package la1;

import android.content.Context;
import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.feature.settings.closeaccount.view.CloseDeactivateAccountUserView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class o extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82545i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f82546j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i13) {
        super(0);
        this.f82545i = i13;
        this.f82546j = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f82545i;
        p pVar = this.f82546j;
        switch (i13) {
            case 0:
                Context requireContext = pVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new i(requireContext, true);
            case 1:
                Context requireContext2 = pVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                d dVar = new d(pVar, 1);
                UserDeserializer userDeserializer = pVar.C0;
                if (userDeserializer != null) {
                    return new h(requireContext2, dVar, userDeserializer, true);
                }
                Intrinsics.r("userDeserializer");
                throw null;
            default:
                Context requireContext3 = pVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new CloseDeactivateAccountUserView(requireContext3);
        }
    }
}
