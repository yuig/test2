package kl0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80118i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f80119j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(z zVar, int i13) {
        super(2);
        this.f80118i = i13;
        this.f80119j = zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = this.f80119j;
        int i13 = this.f80118i;
        switch (i13) {
            case 0:
                i32.r actionType = (i32.r) obj;
                rg0.c cVar = (rg0.c) obj2;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(actionType, "actionType");
                        Intrinsics.checkNotNullParameter(cVar, "<anonymous parameter 1>");
                        z.j9(zVar, actionType);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(actionType, "actionType");
                        Intrinsics.checkNotNullParameter(cVar, "<anonymous parameter 1>");
                        z.j9(zVar, actionType);
                        break;
                }
                break;
            default:
                i32.r actionType2 = (i32.r) obj;
                rg0.c cVar2 = (rg0.c) obj2;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(actionType2, "actionType");
                        Intrinsics.checkNotNullParameter(cVar2, "<anonymous parameter 1>");
                        z.j9(zVar, actionType2);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(actionType2, "actionType");
                        Intrinsics.checkNotNullParameter(cVar2, "<anonymous parameter 1>");
                        z.j9(zVar, actionType2);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
