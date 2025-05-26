package mu0;

import ag1.k;
import com.pinterest.api.model.tp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88285i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ tp f88286j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(tp tpVar, int i13) {
        super(1);
        this.f88285i = i13;
        this.f88286j = tpVar;
    }

    public final k b(k it) {
        int i13 = this.f88285i;
        tp tpVar = this.f88286j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return k.a(it, null, null, null, ph.a.Q(tpVar), null, 95);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f88285i) {
            case 1:
                Intrinsics.checkNotNullParameter((tp) obj, "<anonymous parameter 0>");
                break;
        }
        return b((k) obj);
    }
}
