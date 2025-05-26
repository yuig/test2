package hk0;

import i32.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class k extends s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final k f69329j = new k(0);

    /* renamed from: k, reason: collision with root package name */
    public static final k f69330k = new k(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69331i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13) {
        super(2);
        this.f69331i = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f69331i;
        switch (i13) {
            case 0:
                r rVar = (r) obj;
                rg0.c cVar = (rg0.c) obj2;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(rVar, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(cVar, "<anonymous parameter 1>");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(rVar, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(cVar, "<anonymous parameter 1>");
                        break;
                }
                break;
            default:
                r rVar2 = (r) obj;
                rg0.c cVar2 = (rg0.c) obj2;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(rVar2, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(cVar2, "<anonymous parameter 1>");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(rVar2, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(cVar2, "<anonymous parameter 1>");
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
