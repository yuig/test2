package qv0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105182i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ yk1.i f105183j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(yk1.i iVar, int i13) {
        super(1);
        this.f105182i = i13;
        this.f105183j = iVar;
    }

    public final void b(ln1.l bind) {
        int i13 = this.f105182i;
        yk1.i iVar = this.f105183j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(iVar);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(iVar);
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(iVar);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f105182i) {
            case 0:
                b((ln1.l) obj);
                break;
            case 1:
                b((ln1.l) obj);
                break;
            default:
                b((ln1.l) obj);
                break;
        }
        return Unit.f80348a;
    }
}
