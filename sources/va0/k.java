package va0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class k extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final k f125127j = new k(0);

    /* renamed from: k, reason: collision with root package name */
    public static final k f125128k = new k(1);

    /* renamed from: l, reason: collision with root package name */
    public static final k f125129l = new k(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f125130i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13) {
        super(1);
        this.f125130i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f125130i) {
            case 0:
                ((Number) obj).floatValue();
                break;
            case 1:
                ((Number) obj).floatValue();
                break;
            default:
                ((Number) obj).floatValue();
                break;
        }
        return Unit.f80348a;
    }
}
