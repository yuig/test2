package mm1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final h f87604j = new h(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h f87605k = new h(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87606i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13) {
        super(1);
        this.f87606i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f87606i) {
            case 0:
                kn1.h bind = (kn1.h) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f80265a = false;
                bind.f80266b = true;
                return Unit.f80348a;
            default:
                in1.b it = (in1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return in1.b.e(it, null, true, null, 13);
        }
    }
}
