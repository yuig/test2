package pw1;

import com.pinterest.navigation.Navigation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101526i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f101527j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i13) {
        super(0);
        this.f101526i = i13;
        this.f101527j = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String v03;
        int i13 = this.f101526i;
        d dVar = this.f101527j;
        switch (i13) {
            case 0:
                Navigation navigation = dVar.I;
                v03 = navigation != null ? navigation.v0("PIN_ID") : null;
                return v03 == null ? "" : v03;
            default:
                Navigation navigation2 = dVar.I;
                v03 = navigation2 != null ? navigation2.v0("PIN_TYPE") : null;
                return v03 != null ? cy1.c.valueOf(v03) : cy1.c.OTHERS;
        }
    }
}
