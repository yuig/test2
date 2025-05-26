package rf1;

import com.pinterest.api.model.h01;
import com.pinterest.api.model.km0;
import com.pinterest.api.model.no0;
import com.pinterest.api.model.pq0;
import com.pinterest.api.model.vg;
import com.pinterest.api.model.vq0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 extends vg {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f107735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f107736c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(int i13, kotlin.jvm.internal.j0 j0Var) {
        super(Boolean.FALSE);
        this.f107735b = i13;
        if (i13 != 1) {
            this.f107736c = j0Var;
        } else {
            this.f107736c = j0Var;
            super(Boolean.FALSE);
        }
    }

    @Override // com.pinterest.api.model.vg
    public final Object c(km0 value6) {
        switch (this.f107735b) {
            case 2:
                Intrinsics.checkNotNullParameter(value6, "value6");
                this.f107736c.f80434a = value6;
                return Unit.f80348a;
            default:
                return super.c(value6);
        }
    }

    @Override // com.pinterest.api.model.vg
    public final Object f(no0 value7) {
        switch (this.f107735b) {
            case 1:
                Intrinsics.checkNotNullParameter(value7, "value7");
                this.f107736c.f80434a = value7.f();
                return Boolean.TRUE;
            default:
                return super.f(value7);
        }
    }

    @Override // com.pinterest.api.model.vg
    public final Object j(pq0 value6) {
        String str;
        switch (this.f107735b) {
            case 0:
                Intrinsics.checkNotNullParameter(value6, "value6");
                vq0 g13 = value6.g();
                if (g13 != null) {
                    Intrinsics.checkNotNullParameter(g13, "<this>");
                    h01 X = d7.b.X(g13.c());
                    if (X != null) {
                        str = X.s();
                        this.f107736c.f80434a = str;
                        return Boolean.TRUE;
                    }
                }
                str = null;
                this.f107736c.f80434a = str;
                return Boolean.TRUE;
            default:
                return super.j(value6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kotlin.jvm.internal.j0 j0Var, Unit unit) {
        super(unit);
        this.f107735b = 2;
        this.f107736c = j0Var;
    }
}
