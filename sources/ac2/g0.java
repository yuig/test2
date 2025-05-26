package ac2;

import android.view.View;
import java.util.InputMismatchException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g0 f1956j = new g0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g0 f1957k = new g0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g0 f1958l = new g0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g0 f1959m = new g0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final g0 f1960n = new g0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final g0 f1961o = new g0(5);

    /* renamed from: p, reason: collision with root package name */
    public static final g0 f1962p = new g0(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1963i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i13) {
        super(1);
        this.f1963i = i13;
    }

    public final Boolean b(xk2.w it) {
        boolean z13 = true;
        switch (this.f1963i) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!((Boolean) it.f135236c).booleanValue());
            default:
                Intrinsics.checkNotNullParameter(it, "<name for destructuring parameter 0>");
                boolean booleanValue = ((Boolean) it.f135234a).booleanValue();
                int intValue = ((Number) it.f135235b).intValue();
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue == 3) {
                            z13 = booleanValue;
                        } else if (intValue != 4) {
                            throw new InputMismatchException(a.a.e("State ", intValue, " not defined in ExoPlayer"));
                        }
                    }
                    return Boolean.valueOf(z13);
                }
                z13 = false;
                return Boolean.valueOf(z13);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f1963i;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter((Long) obj, "it");
                return Unit.f80348a;
            case 1:
                m60.a it = (m60.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it == m60.a.BACKGROUND);
            case 2:
                return b((xk2.w) obj);
            case 3:
                return b((xk2.w) obj);
            case 4:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 4:
                        th3.printStackTrace();
                        break;
                }
                return Unit.f80348a;
            case 5:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 4:
                        th4.printStackTrace();
                        break;
                }
                return Unit.f80348a;
            default:
                View it2 = (View) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Boolean.valueOf(it2.getVisibility() == 0);
        }
    }
}
