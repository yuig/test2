package r1;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final y f106013j = new y(0);

    /* renamed from: k, reason: collision with root package name */
    public static final y f106014k = new y(1);

    /* renamed from: l, reason: collision with root package name */
    public static final y f106015l = new y(2);

    /* renamed from: m, reason: collision with root package name */
    public static final y f106016m = new y(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106017i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i13) {
        super(1);
        this.f106017i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f106017i) {
            case 0:
                return Unit.f80348a;
            case 1:
                ((Number) obj).intValue();
                return null;
            case 2:
                List list = (List) obj;
                return new p0(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            default:
                ((Number) obj).intValue();
                return kotlin.collections.q0.f80391a;
        }
    }
}
