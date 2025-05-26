package q1;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final u f101997j = new u(0);

    /* renamed from: k, reason: collision with root package name */
    public static final u f101998k = new u(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101999i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i13) {
        super(1);
        this.f101999i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f101999i) {
            case 0:
                return Unit.f80348a;
            default:
                List list = (List) obj;
                return new h0(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }
}
