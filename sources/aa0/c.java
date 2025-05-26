package aa0;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f1612j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f1613k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f1614l = new c(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1615i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f1615i = i13;
    }

    public final void b(Map map) {
        switch (this.f1615i) {
            case 0:
                Intrinsics.checkNotNullParameter(map, "$this$null");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(map, "$this$null");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(map, "$this$null");
                break;
            default:
                Intrinsics.checkNotNullParameter(map, "$this$null");
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f1615i) {
            case 0:
                b((Map) obj);
                break;
            case 1:
                b((Map) obj);
                break;
            case 2:
                b((Map) obj);
                break;
            default:
                b((Map) obj);
                break;
        }
        return Unit.f80348a;
    }
}
