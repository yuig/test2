package nk1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class i extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91134i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f91135j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ uf0.a f91136k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Function2 function2, uf0.a aVar, int i13) {
        super(2);
        this.f91134i = i13;
        this.f91135j = function2;
        this.f91136k = aVar;
    }

    public final void b(dl1.s plankModel, boolean z13) {
        int i13 = this.f91134i;
        Function2 function2 = this.f91135j;
        uf0.a aVar = this.f91136k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(plankModel, "plankModel");
                function2.invoke(aVar.i(plankModel), Boolean.valueOf(z13));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(plankModel, "plankModel");
                function2.invoke(aVar.i(plankModel), Boolean.valueOf(z13));
                break;
            default:
                Intrinsics.checkNotNullParameter(plankModel, "plankModel");
                function2.invoke(aVar.i(plankModel), Boolean.valueOf(z13));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f91134i) {
            case 0:
                b((dl1.s) obj, ((Boolean) obj2).booleanValue());
                return Unit.f80348a;
            case 1:
                b((dl1.s) obj, ((Boolean) obj2).booleanValue());
                return Unit.f80348a;
            case 2:
                b((dl1.s) obj, ((Boolean) obj2).booleanValue());
                return Unit.f80348a;
            default:
                dl1.s plankModel = (dl1.s) obj;
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                Intrinsics.checkNotNullParameter(plankModel, "plankModel");
                return (Boolean) this.f91135j.invoke(this.f91136k.i(plankModel), bool);
        }
    }
}
