package qa1;

import android.content.Context;
import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.feature.settings.closeaccount.view.CloseDeactivateAccountUserView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import la1.h;
import la1.i;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103203i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f103204j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, int i13) {
        super(0);
        this.f103203i = i13;
        this.f103204j = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f103203i;
        e eVar = this.f103204j;
        switch (i13) {
            case 0:
                Context requireContext = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new i(requireContext, false);
            case 1:
                Context requireContext2 = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                e eVar2 = this.f103204j;
                d dVar = new d(0, eVar2, e.class, "handleFooterClickAction", "handleFooterClickAction()V", 0);
                UserDeserializer userDeserializer = eVar2.E0;
                if (userDeserializer != null) {
                    return new h(requireContext2, dVar, userDeserializer, false);
                }
                Intrinsics.r("userDeserializer");
                throw null;
            default:
                Context requireContext3 = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new CloseDeactivateAccountUserView(requireContext3);
        }
    }
}
