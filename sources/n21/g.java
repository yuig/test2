package n21;

import h32.i0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f89007i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f89008j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, int i13) {
        super(0);
        this.f89007i = i13;
        this.f89008j = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Boolean bool = Boolean.FALSE;
        i iVar = this.f89008j;
        int i13 = this.f89007i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        iVar.getClass();
                        break;
                    default:
                        iVar.getClass();
                        break;
                }
            case 1:
                switch (i13) {
                    case 0:
                        iVar.getClass();
                        break;
                    default:
                        iVar.getClass();
                        break;
                }
            default:
                i0 source = iVar.getPinalytics().p();
                if (source != null) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    break;
                }
                break;
        }
        return bool;
    }
}
