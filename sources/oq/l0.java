package oq;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f97077i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m0 f97078j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(m0 m0Var, int i13) {
        super(1);
        this.f97077i = i13;
        this.f97078j = m0Var;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f97077i;
        m0 m0Var = this.f97078j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = n80.f.pdp_formatted_description_see_less;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return rn1.a.y(it, new u50.k0(i14, new ArrayList(0)), null, kotlin.collections.e0.b(vn1.b.END), m0Var.f97088i, vn1.g.HEADING_200, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097122);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                int i15 = m60.x0.see_more;
                String[] formatArgs2 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                return rn1.a.y(it, new u50.k0(i15, new ArrayList(0)), null, kotlin.collections.e0.b(vn1.b.END), m0Var.f97088i, vn1.g.HEADING_200, 1, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097090);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, m0.a(m0Var), null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097119);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f97077i) {
            case 0:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f108891f = m0.a(this.f97078j);
                bind.h(vn1.g.BODY_200);
                bind.f108896k = true;
                break;
        }
        return b((rn1.a) obj);
    }
}
