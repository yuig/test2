package xm0;

import d70.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135352i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f135353j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(a aVar, int i13) {
        super(1);
        this.f135352i = i13;
        this.f135353j = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f135352i;
        a aVar = this.f135353j;
        switch (i13) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(aVar.f135350b), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                yl1.b it2 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return yl1.b.f(it2, bs1.c.j2(new String[0], aVar.f135351c.isSelectAllBackendToggled() ? g.select_pins_deselect_all : g.select_pins_select_all), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }
}
