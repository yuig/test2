package r02;

import com.pinterest.api.model.mj;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105765i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ mj f105766j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(mj mjVar, int i13) {
        super(1);
        this.f105765i = i13;
        this.f105766j = mjVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f105765i;
        mj mjVar = this.f105766j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                String R = mjVar.R();
                fm1.c cVar = (R == null || kotlin.text.z.j(R)) ? fm1.c.GONE : fm1.c.VISIBLE;
                String R2 = mjVar.R();
                return rn1.a.y(it, bs1.c.h2(R2 != null ? R2 : ""), null, null, null, null, 0, cVar, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                String H = mjVar.H();
                fm1.c cVar2 = (H == null || kotlin.text.z.j(H)) ? fm1.c.GONE : fm1.c.VISIBLE;
                String H2 = mjVar.H();
                return rn1.a.y(it, bs1.c.h2(H2 != null ? H2 : ""), null, null, null, null, 0, cVar2, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 2:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(mjVar.P() != null ? String.valueOf(mjVar.P()) : ""), null, null, kotlin.collections.e0.b(vn1.e.UNDERLINED), null, 0, fm1.c.VISIBLE, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096054);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                Boolean U = mjVar.U();
                Intrinsics.checkNotNullExpressionValue(U, "getSorAvailable(...)");
                return rn1.a.y(it, null, null, null, null, null, 0, U.booleanValue() ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f105765i) {
            case 2:
                rm1.d gi3 = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(gi3, "gi");
                break;
        }
        return b((rn1.a) obj);
    }
}
