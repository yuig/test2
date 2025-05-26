package dm1;

import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55366i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ om1.c f55367j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(om1.c cVar, int i13) {
        super(1);
        this.f55366i = i13;
        this.f55367j = cVar;
    }

    public final om1.c b(om1.c it) {
        int i13 = this.f55366i;
        om1.c cVar = this.f55367j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f55366i) {
            case 0:
                return b((om1.c) obj);
            case 1:
                return b((om1.c) obj);
            case 2:
                return b((om1.c) obj);
            case 3:
                return b((om1.c) obj);
            case 4:
                return b((om1.c) obj);
            case 5:
                return b((om1.c) obj);
            case 6:
                return b((om1.c) obj);
            case 7:
                return b((om1.c) obj);
            case 8:
                rm1.d it = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                om1.c cVar = this.f55367j;
                rm1.m mVar = cVar.f96639a;
                Intrinsics.g(mVar, "null cannot be cast to non-null type com.pinterest.gestalt.iconcomponent.IconStandard");
                return rm1.d.e(it, new rm1.f((rm1.q) mVar, GestaltIcon.f49403e), cVar.f96644f ? GestaltIcon.f49405g : rm1.c.DISABLED, null, cVar.f96647i, cVar.f96643e, 4);
            default:
                return b((om1.c) obj);
        }
    }
}
