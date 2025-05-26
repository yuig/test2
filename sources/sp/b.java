package sp;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.n;

/* loaded from: classes3.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f114842i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ rm1.c f114843j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(rm1.c cVar, int i13) {
        super(1);
        this.f114842i = i13;
        this.f114843j = cVar;
    }

    public final rm1.d b(rm1.d it) {
        switch (this.f114842i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, null, this.f114843j, null, 0, null, 29);
            case 1:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, new rm1.e(n.CHEVRON_DOWN, rm1.h.SM), this.f114843j, fm1.c.VISIBLE, 0, null, 24);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, null, this.f114843j, null, 0, null, 29);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, null, this.f114843j, null, 0, null, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f114842i) {
            case 1:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return b((rm1.d) obj);
    }
}
