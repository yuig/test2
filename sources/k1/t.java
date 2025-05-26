package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final t f78008j = new t(0);

    /* renamed from: k, reason: collision with root package name */
    public static final t f78009k = new t(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78010i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i13) {
        super(1);
        this.f78010i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f78010i) {
            case 0:
                ((s3.m0) ((d3.e) obj)).a();
                break;
            default:
                ((Number) obj).longValue();
                break;
        }
        return Unit.f80348a;
    }
}
