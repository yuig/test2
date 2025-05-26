package w80;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f128350i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f128351j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f128352k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(e eVar, boolean z13, boolean z14) {
        super(2);
        this.f128350i = eVar;
        this.f128351j = z13;
        this.f128352k = z14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        u50.k0 k0Var;
        i2.o oVar = (i2.o) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        e eVar = this.f128350i;
        rm1.f fVar = new rm1.f(eVar.f128274a, rm1.i.LG);
        rm1.c cVar = (!this.f128351j || this.f128352k) ? rm1.c.DEFAULT : rm1.c.DARK;
        Integer num = eVar.f128278e;
        if (num != null) {
            int intValue = num.intValue();
            String[] formatArgs = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            k0Var = new u50.k0(intValue, new ArrayList(0));
        } else {
            k0Var = null;
        }
        ve.h.a(new rm1.d(fVar, cVar, null, 0, k0Var, 12), null, null, oVar, 8, 6);
        return Unit.f80348a;
    }
}
