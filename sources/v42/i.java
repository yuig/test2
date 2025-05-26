package v42;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f124148i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f124149j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, int i13) {
        super(1);
        this.f124148i = i13;
        this.f124149j = kVar;
    }

    public final om1.c b(om1.c it) {
        om1.c cVar;
        om1.c cVar2;
        int i13 = this.f124148i;
        k kVar = this.f124149j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                h hVar = kVar.f124159z;
                return (hVar == null || (cVar = hVar.f124147b) == null) ? it : cVar;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                h hVar2 = kVar.f124159z;
                return (hVar2 == null || (cVar2 = hVar2.f124146a) == null) ? it : cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f124148i) {
            case 0:
                return b((om1.c) obj);
            case 1:
                return b((om1.c) obj);
            default:
                this.f124149j.setContentDescription((CharSequence) obj);
                return Unit.f80348a;
        }
    }
}
