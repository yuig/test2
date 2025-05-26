package ab1;

import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1713i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f1714j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i13) {
        super(1);
        this.f1713i = i13;
        this.f1714j = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f1713i;
        h hVar = this.f1714j;
        switch (i13) {
            case 0:
                ((bb1.p) ((ya1.c) hVar.getView())).b8(true);
                return Unit.f80348a;
            case 1:
                hVar.f1717c = (wy0) obj;
                return Unit.f80348a;
            default:
                bb1.p pVar = (bb1.p) ((ya1.c) hVar.getView());
                String string = pVar.getString(x0.generic_error);
                i92.k kVar = pVar.f22538k0;
                if (kVar == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                if (string == null) {
                    string = pVar.getString(x0.generic_error);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                }
                kVar.i(string);
                pVar.P7();
                return Unit.f80348a;
        }
    }
}
