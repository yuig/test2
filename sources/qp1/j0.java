package qp1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104795i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ do1.d f104796j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(do1.d dVar, int i13) {
        super(1);
        this.f104795i = i13;
        this.f104796j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        do1.d dVar = this.f104796j;
        int i13 = this.f104795i;
        switch (i13) {
            case 0:
                do1.d it = (do1.d) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                }
            default:
                do1.d it2 = (do1.d) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
        }
        return dVar;
    }
}
