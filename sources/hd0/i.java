package hd0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final i f68864j = new i(0);

    /* renamed from: k, reason: collision with root package name */
    public static final i f68865k = new i(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68866i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13) {
        super(1);
        this.f68866i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f68866i) {
            case 0:
                ((Number) obj).intValue();
                break;
            default:
                md0.a it = (md0.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return Unit.f80348a;
    }
}
