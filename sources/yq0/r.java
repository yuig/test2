package yq0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final r f139724j = new r(0);

    /* renamed from: k, reason: collision with root package name */
    public static final r f139725k = new r(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139726i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i13) {
        super(0);
        this.f139726i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f139726i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        new ly.c(s92.o.COMPLETE).i();
                        break;
                    default:
                        new ly.c(s92.o.ABORTED).i();
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        new ly.c(s92.o.COMPLETE).i();
                        break;
                    default:
                        new ly.c(s92.o.ABORTED).i();
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
