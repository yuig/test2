package uv0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final i f123172j = new i(0);

    /* renamed from: k, reason: collision with root package name */
    public static final i f123173k = new i(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123174i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13) {
        super(1);
        this.f123174i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f123174i) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Throwable it2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
        }
        return Unit.f80348a;
    }
}
