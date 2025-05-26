package w41;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final k0 f128030j = new k0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final k0 f128031k = new k0(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128032i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i13) {
        super(1);
        this.f128032i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f128032i) {
            case 0:
                i vmState = (i) obj;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                return vmState.f128016a;
            default:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, kotlin.collections.e0.b(vn1.b.CENTER), kotlin.collections.e0.b(vn1.e.BOLD), vn1.g.BODY_100, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097123);
        }
    }
}
