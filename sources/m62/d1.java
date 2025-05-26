package m62;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r72.z1;

/* loaded from: classes4.dex */
public final class d1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d1 f85969j = new d1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d1 f85970k = new d1(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85971i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(int i13) {
        super(1);
        this.f85971i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f1 f1Var = f1.f85976i;
        int i13 = this.f85971i;
        switch (i13) {
            case 0:
                Map update = (Map) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(update, "$this$update");
                        update.clear();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(update, "$this$update");
                        update.replaceAll(new es.i(2, f1Var));
                        break;
                }
                break;
            case 1:
                Map update2 = (Map) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                        update2.clear();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                        update2.replaceAll(new es.i(2, f1Var));
                        break;
                }
                break;
            default:
                z1 it = (z1) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return Unit.f80348a;
    }
}
