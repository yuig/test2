package p91;

import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99259i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f99260j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i13) {
        super(1);
        this.f99259i = i13;
        this.f99260j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f99259i;
        d dVar = this.f99260j;
        switch (i13) {
            case 0:
                Boolean G3 = ((wy0) obj).G3();
                Intrinsics.checkNotNullExpressionValue(G3, "getIsPartner(...)");
                d.p3(dVar, G3.booleanValue());
                break;
            default:
                d.p3(dVar, false);
                break;
        }
        return Unit.f80348a;
    }
}
