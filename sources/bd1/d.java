package bd1;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f22719j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f22720k = new d(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22721i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f22721i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f22721i) {
            case 0:
                Object c13 = ((tt1.a) obj).c();
                Intrinsics.checkNotNullExpressionValue(c13, "getData(...)");
                HashMap hashMap = (HashMap) c13;
                HashMap hashMap2 = e.f22722a;
                Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
                e.f22722a = hashMap;
                break;
            default:
                break;
        }
        return Unit.f80348a;
    }
}
