package m62;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85973i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f85974j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r72.w0 f85975k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(k kVar, r72.w0 w0Var, int i13) {
        super(1);
        this.f85973i = i13;
        this.f85974j = kVar;
        this.f85975k = w0Var;
    }

    public final void b(Map update) {
        int i13 = this.f85973i;
        r72.w0 w0Var = this.f85975k;
        k kVar = this.f85974j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.put(kVar.f86021a.b(), w0Var);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.put(kVar.f86021a.b(), w0Var);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.put(kVar.f86021a.b(), w0Var);
                break;
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.put(kVar.f86021a.b(), w0Var);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f85973i) {
            case 0:
                b((Map) obj);
                break;
            case 1:
                b((Map) obj);
                break;
            case 2:
                b((Map) obj);
                break;
            default:
                b((Map) obj);
                break;
        }
        return Unit.f80348a;
    }
}
