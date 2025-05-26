package t3;

import android.graphics.Matrix;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class u0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final u0 f116203j = new u0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final u0 f116204k = new u0(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f116205i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(int i13) {
        super(2);
        this.f116205i = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f116205i) {
            case 0:
                z3.q qVar = (z3.q) obj2;
                z3.j jVar = ((z3.q) obj).f140714d;
                z3.x xVar = z3.t.f140746o;
                Object obj3 = jVar.f140700a.get(xVar);
                if (obj3 == null) {
                    obj3 = Float.valueOf(0.0f);
                }
                float floatValue = ((Number) obj3).floatValue();
                Object obj4 = qVar.f140714d.f140700a.get(xVar);
                if (obj4 == null) {
                    obj4 = Float.valueOf(0.0f);
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) obj4).floatValue()));
            default:
                ((i2) obj).A((Matrix) obj2);
                return Unit.f80348a;
        }
    }
}
