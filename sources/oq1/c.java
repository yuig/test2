package oq1;

import com.pinterest.navigation.Navigation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f97223i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f97224j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, int i13) {
        super(0);
        this.f97223i = i13;
        this.f97224j = eVar;
    }

    public final uk1.d b() {
        int i13 = this.f97223i;
        e eVar = this.f97224j;
        switch (i13) {
            case 0:
                int i14 = e.f97226w0;
                return (uk1.d) eVar.f97232o0.getValue();
            default:
                uk1.e eVar2 = eVar.f97227j0;
                if (eVar2 != null) {
                    return uk1.e.c(eVar2, eVar);
                }
                Intrinsics.r("presenterPinalyticsFactory");
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f97223i) {
            case 1:
                Navigation navigation = this.f97224j.I;
                if (navigation != null) {
                    break;
                }
                break;
        }
        return b();
    }
}
