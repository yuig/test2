package qf1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.hh;
import com.pinterest.api.model.km0;
import com.pinterest.api.model.mp0;
import com.pinterest.api.model.vg;
import com.pinterest.api.model.wy0;
import java.util.List;
import kh2.c3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import rf1.p0;

/* loaded from: classes5.dex */
public final class h0 extends vg {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f103685b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f103686c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f103687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(List list, String str) {
        super(null);
        this.f103686c = list;
        this.f103687d = str;
    }

    @Override // com.pinterest.api.model.vg
    public final Object c(km0 value5) {
        switch (this.f103685b) {
            case 1:
                Intrinsics.checkNotNullParameter(value5, "value5");
                kotlin.jvm.internal.j0 j0Var = (kotlin.jvm.internal.j0) this.f103686c;
                p0 p0Var = (p0) this.f103687d;
                as1.b bVar = p0Var.F;
                if (bVar == null) {
                    Intrinsics.r("dynamicImageUtils");
                    throw null;
                }
                String b13 = bVar.b();
                Intrinsics.checkNotNullExpressionValue(b13, "getDisplayLargeImageWidth(...)");
                as1.b bVar2 = p0Var.F;
                if (bVar2 == null) {
                    Intrinsics.r("dynamicImageUtils");
                    throw null;
                }
                String e13 = bVar2.e();
                Intrinsics.checkNotNullExpressionValue(e13, "getFallbackLargeImageResolution(...)");
                j0Var.f80434a = c3.C(value5, b13, e13);
                return Unit.f80348a;
            default:
                return super.c(value5);
        }
    }

    @Override // com.pinterest.api.model.vg
    public final Object h(mp0 value9) {
        wy0 d2;
        switch (this.f103685b) {
            case 0:
                Intrinsics.checkNotNullParameter(value9, "value9");
                List<f30> list = (List) this.f103686c;
                if (list != null) {
                    String str = (String) this.f103687d;
                    for (f30 f30Var : list) {
                        if (Intrinsics.d(f30Var.getUid(), value9.l())) {
                            hh t53 = f30Var.t5();
                            if (kotlin.text.z.i((t53 == null || (d2 = t53.d()) == null) ? null : d2.getUid(), str, false)) {
                                return value9;
                            }
                        }
                    }
                }
                return null;
            default:
                return super.h(value9);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(kotlin.jvm.internal.j0 j0Var, p0 p0Var, Unit unit) {
        super(unit);
        this.f103686c = j0Var;
        this.f103687d = p0Var;
    }
}
