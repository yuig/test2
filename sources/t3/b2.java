package t3;

import android.graphics.Matrix;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b2 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final b2 f115856j = new b2(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b2 f115857k = new b2(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115858i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(int i13) {
        super(2);
        this.f115858i = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f115858i) {
            case 0:
                i2.o oVar = (i2.o) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                    }
                }
                break;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                break;
        }
        return Unit.f80348a;
    }
}
