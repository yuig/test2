package rf1;

import com.pinterest.api.model.h01;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.km0;
import com.pinterest.api.model.pq0;
import com.pinterest.api.model.uo0;
import com.pinterest.api.model.vg;
import java.io.File;
import kh2.n3;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 extends vg {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f107799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uo0 f107800c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f107801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f107802e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, uo0 uo0Var, String str, String str2, Unit unit) {
        super(unit);
        this.f107799b = p0Var;
        this.f107800c = uo0Var;
        this.f107801d = str;
        this.f107802e = str2;
    }

    @Override // com.pinterest.api.model.vg
    public final Object c(km0 value5) {
        Intrinsics.checkNotNullParameter(value5, "value5");
        this.f107799b.r3(5000L, this.f107800c.v());
        return Unit.f80348a;
    }

    @Override // com.pinterest.api.model.vg
    public final Object j(pq0 value6) {
        String str;
        Intrinsics.checkNotNullParameter(value6, "value6");
        Intrinsics.checkNotNullParameter(value6, "<this>");
        h01 s13 = n3.s(value6);
        long doubleValue = s13 != null ? (long) s13.m().doubleValue() : 0L;
        p0 p0Var = this.f107799b;
        if (doubleValue == 0) {
            ag1.f fVar = p0Var.f107875y;
            Pair pinIdAndPageIndex = new Pair(this.f107801d, this.f107802e);
            synchronized (fVar) {
                Intrinsics.checkNotNullParameter(pinIdAndPageIndex, "pinIdAndPageIndex");
                str = (String) fVar.f15144b.get(pinIdAndPageIndex);
            }
            if (str != null && new File(str).exists()) {
                doubleValue = new k01(str).f39242e;
            }
        }
        p0Var.r3(doubleValue, this.f107800c.v());
        return Unit.f80348a;
    }
}
