package jq1;

import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import nx.d0;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77460i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f77461j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i13) {
        super(0);
        this.f77460i = i13;
        this.f77461j = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Navigation navigation;
        int i13 = this.f77460i;
        c cVar = this.f77461j;
        switch (i13) {
            case 0:
                d0 s73 = cVar.s7();
                Navigation navigation2 = cVar.I;
                return new ca2.e(true, null, 0, 0, (navigation2 == null || !navigation2.w("com.pinterest.EXTRA_STORY_PIN_PAGE_WIDTH") || (navigation = cVar.I) == null) ? null : Integer.valueOf(navigation.J1("com.pinterest.EXTRA_STORY_PIN_PAGE_WIDTH")), 0, s73, null, false, false, 942);
            default:
                int i14 = c.f77464q0;
                cVar.P7();
                return Unit.f80348a;
        }
    }
}
