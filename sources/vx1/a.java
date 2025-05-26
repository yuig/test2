package vx1;

import a11.d;
import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126824i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f126825j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i13) {
        super(0);
        this.f126824i = i13;
        this.f126825j = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f126824i;
        c cVar = this.f126825j;
        switch (i13) {
            case 0:
                d dVar = cVar.X;
                if (dVar != null) {
                    return dVar.a(cVar.s7());
                }
                Intrinsics.r("clickThroughHelperFactory");
                throw null;
            case 1:
                Navigation navigation = cVar.I;
                return Boolean.valueOf(navigation != null ? navigation.S("IS_A_PARTNER", false) : false);
            case 2:
                Navigation navigation2 = cVar.I;
                if (navigation2 != null) {
                    return navigation2.v0("PIN_ID");
                }
                return null;
            default:
                cy1.a aVar = cy1.a.NAVIGATE_TO_CONVERT;
                int i14 = c.f126828o0;
                cVar.V7(aVar, null);
                return Unit.f80348a;
        }
    }
}
