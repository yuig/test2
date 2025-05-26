package j51;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f74717j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f74718k = new d(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74719i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f74719i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f74719i;
        switch (i13) {
            case 0:
                yl1.l bind = (yl1.l) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.f139349b = true;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.f139349b = false;
                        break;
                }
                break;
            default:
                yl1.l bind2 = (yl1.l) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.f139349b = true;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.f139349b = false;
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
