package al1;

import com.pinterest.navigation.Navigation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class l extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15490i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f15491j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(i iVar, int i13) {
        super(1);
        this.f15490i = i13;
        this.f15491j = iVar;
    }

    public final Boolean b(Navigation it) {
        int i13 = this.f15490i;
        i iVar = this.f15491j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Intrinsics.d(it.getF49939a(), ((c) iVar).f15478a));
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!((f) iVar).f15483a.contains(it.getF49939a()));
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Intrinsics.d(it.getF49939a(), ((d) iVar).f15479a));
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!((g) iVar).f15484a.contains(it.getF49939a()));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f15490i) {
        }
        return b((Navigation) obj);
    }
}
