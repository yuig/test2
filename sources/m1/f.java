package m1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i2.w3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f85333j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f85334k = new f(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f f85335l = new f(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85336i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(1);
        this.f85336i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f85336i) {
            case 0:
                i2.z1 z1Var = (i2.z1) obj;
                w3 w3Var = AndroidCompositionLocals_androidKt.f17455b;
                z1Var.getClass();
                if (((Context) bf.b.Y(z1Var, w3Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return h.f85360b;
                }
                e.f85321a.getClass();
                return d.f85311c;
            case 1:
                return Boolean.TRUE;
            default:
                ((Number) obj).floatValue();
                return Unit.f80348a;
        }
    }
}
