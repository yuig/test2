package nq1;

import com.pinterest.navigation.Navigation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91814i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f91815j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, int i13) {
        super(0);
        this.f91814i = i13;
        this.f91815j = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Navigation navigation;
        int i13 = this.f91814i;
        e eVar = this.f91815j;
        switch (i13) {
            case 0:
                return eVar.generateLoggingContext();
            case 1:
                bh.b bVar = new bh.b(eVar.s7(), new c(eVar, 0));
                k90.a aVar = new k90.a(eVar, 4);
                Navigation navigation2 = eVar.I;
                return new ca2.e(true, aVar, 0, 0, (navigation2 == null || !navigation2.w("com.pinterest.EXTRA_STORY_PIN_PAGE_WIDTH") || (navigation = eVar.I) == null) ? null : Integer.valueOf(navigation.J1("com.pinterest.EXTRA_STORY_PIN_PAGE_WIDTH")), 0, null, bVar, false, false, 876);
            default:
                Intrinsics.checkNotNullExpressionValue(eVar.getResources(), "getResources(...)");
                return Float.valueOf(bs1.c.U(fq1.a.idea_pin_list_bottom_sheet_header_elevation, r0));
        }
    }
}
