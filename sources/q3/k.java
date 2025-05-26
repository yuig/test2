package q3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final k f102225i = new k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        i2.o oVar = (i2.o) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
            }
        }
        return Unit.f80348a;
    }
}
