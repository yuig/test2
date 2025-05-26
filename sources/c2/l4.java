package c2;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class l4 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f24926i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(String str) {
        super(3);
        this.f24926i = str;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i2.o oVar = (i2.o) obj2;
        if ((((Number) obj3).intValue() & 17) == 16) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        d6.b(this.f24926i, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oVar, 0, 0, 131070);
        return Unit.f80348a;
    }
}
