package v31;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import z3.w;
import z3.y;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123958i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f123959j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(b bVar, int i13) {
        super(1);
        this.f123958i = i13;
        this.f123959j = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f123958i;
        b bVar = this.f123959j;
        switch (i13) {
            case 0:
                y semantics = (y) obj;
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                w.f(semantics, bVar.f123953c);
                break;
            default:
                xl1.b it = (xl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                bVar.f123956f.invoke();
                break;
        }
        return Unit.f80348a;
    }
}
