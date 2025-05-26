package oc0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class l extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final l f94045i = new l(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        i2.o oVar = (i2.o) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
            }
        }
        return Unit.f80348a;
    }
}
