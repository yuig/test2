package px1;

import com.pinterest.navigation.Navigation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class c extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101627i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f101628j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, int i13) {
        super(0);
        this.f101627i = i13;
        this.f101628j = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f101627i;
        f fVar = this.f101628j;
        switch (i13) {
            case 0:
                Navigation navigation = fVar.I;
                return Boolean.valueOf(navigation != null ? navigation.S("IS_PIN_ELIGIBLE_FOR_PIN_STATS_EXTRA_KEY", false) : false);
            default:
                Navigation navigation2 = fVar.I;
                return Boolean.valueOf(navigation2 != null ? navigation2.S("IS_PIN_STATS_FILTER_EXTRA_KEY", false) : false);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f101627i) {
        }
        return invoke();
    }
}
