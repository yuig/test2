package q1;

import androidx.compose.foundation.lazy.layout.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f101935i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f101936j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, int i13) {
        super(2);
        this.f101935i = mVar;
        this.f101936j = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        i2.o oVar = (i2.o) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        m mVar = this.f101935i;
        w0 w0Var = mVar.f101945b.f101930a;
        int i13 = this.f101936j;
        androidx.compose.foundation.lazy.layout.f c13 = w0Var.c(i13);
        int i14 = i13 - c13.f17236a;
        ((g) c13.f17238c).f101901c.c(mVar.f101946c, Integer.valueOf(i14), oVar, 0);
        return Unit.f80348a;
    }
}
