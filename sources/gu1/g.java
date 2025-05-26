package gu1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class g extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f66140j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f66141k = new g(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66142i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f66142i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f66142i;
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
