package t3;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f116258i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z2.c f116259j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(z2.c cVar, int i13) {
        super(1);
        this.f116258i = i13;
        this.f116259j = cVar;
    }

    public final Boolean b(z2.z zVar) {
        int i13 = this.f116258i;
        z2.c cVar = this.f116259j;
        switch (i13) {
            case 0:
                Boolean F = androidx.compose.ui.focus.a.F(zVar, cVar.f140608a);
                return Boolean.valueOf(F != null ? F.booleanValue() : true);
            default:
                Boolean F2 = androidx.compose.ui.focus.a.F(zVar, cVar.f140608a);
                return Boolean.valueOf(F2 != null ? F2.booleanValue() : true);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f116258i) {
        }
        return b((z2.z) obj);
    }
}
