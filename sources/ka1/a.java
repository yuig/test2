package ka1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78922i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f78923j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i13) {
        super(1);
        this.f78922i = i13;
        this.f78923j = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f78922i;
        b bVar = this.f78923j;
        switch (i13) {
            case 0:
                bVar.f78931h = ((f22.b) obj).f60976a;
                break;
            default:
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                bVar.f78932i = true;
                break;
        }
        return Unit.f80348a;
    }
}
