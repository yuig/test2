package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import okhttp3.Call;

/* loaded from: classes2.dex */
public final class cq0 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Call f3999a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq0(Call call) {
        super(1);
        this.f3999a = call;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable it = (Throwable) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f3999a.cancel();
        return Unit.f80348a;
    }
}
