package zp;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142458i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f142459j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(s sVar, int i13) {
        super(1);
        this.f142458i = i13;
        this.f142459j = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s sVar = this.f142459j;
        int i13 = this.f142458i;
        switch (i13) {
            case 0:
                yl1.l bind = (yl1.l) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.c(sVar.f142484d);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.c(sVar.f142485e);
                        break;
                }
                break;
            default:
                yl1.l bind2 = (yl1.l) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.c(sVar.f142484d);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.c(sVar.f142485e);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
