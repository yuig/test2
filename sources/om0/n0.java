package om0;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class n0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k0 f96547i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f96548j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(k0 k0Var, float f13) {
        super(2);
        this.f96547i = k0Var;
        this.f96548j = f13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        i2.o oVar = (i2.o) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        Iterator it = this.f96547i.f96531a.iterator();
        while (it.hasNext()) {
            o0.a((String) it.next(), androidx.compose.foundation.layout.e.m(u2.n.f120041b, this.f96548j), null, 0.0f, oVar, 0, 12);
        }
        return Unit.f80348a;
    }
}
