package c71;

import android.os.Handler;
import android.os.Looper;
import ey.b1;
import ey.k1;
import ey.q1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f26763j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f26764k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f26765l = new g(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g f26766m = new g(3);

    /* renamed from: n, reason: collision with root package name */
    public static final g f26767n = new g(4);

    /* renamed from: o, reason: collision with root package name */
    public static final g f26768o = new g(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f26769i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(0);
        this.f26769i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Boolean bool = Boolean.FALSE;
        int i13 = this.f26769i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return new Handler(Looper.getMainLooper());
                    default:
                        return new Handler(Looper.getMainLooper());
                }
            case 1:
                switch (i13) {
                    case 1:
                        new b1().i();
                        break;
                    default:
                        new k1(q1.USERS).i();
                        break;
                }
                return Unit.f80348a;
            case 2:
                switch (i13) {
                    case 1:
                        new b1().i();
                        break;
                    default:
                        new k1(q1.USERS).i();
                        break;
                }
                return Unit.f80348a;
            case 3:
                return bool;
            case 4:
                switch (i13) {
                    case 0:
                        return new Handler(Looper.getMainLooper());
                    default:
                        return new Handler(Looper.getMainLooper());
                }
            default:
                return bool;
        }
    }
}
