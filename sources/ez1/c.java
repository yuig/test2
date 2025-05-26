package ez1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import yl1.l;

/* loaded from: classes4.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f60701j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f60702k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60703i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f60703i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f60703i;
        switch (i13) {
            case 0:
                l bind = (l) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.d("Ungroup Events");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.d("Group Events");
                        break;
                }
                break;
            default:
                l bind2 = (l) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.d("Ungroup Events");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.d("Group Events");
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
