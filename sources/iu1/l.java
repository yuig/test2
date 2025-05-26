package iu1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final l f73707j = new l(0);

    /* renamed from: k, reason: collision with root package name */
    public static final l f73708k = new l(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73709i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13) {
        super(1);
        this.f73709i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f73709i;
        switch (i13) {
            case 0:
                ln1.l bind = (ln1.l) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.getClass();
                        bind.f84048e = fm1.c.GONE;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.getClass();
                        bind.f84048e = fm1.c.GONE;
                        break;
                }
                break;
            default:
                ln1.l bind2 = (ln1.l) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.getClass();
                        bind2.f84048e = fm1.c.GONE;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.getClass();
                        bind2.f84048e = fm1.c.GONE;
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
