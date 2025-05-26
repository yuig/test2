package e82;

import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final i f57867j = new i(0);

    /* renamed from: k, reason: collision with root package name */
    public static final i f57868k = new i(1);

    /* renamed from: l, reason: collision with root package name */
    public static final i f57869l = new i(2);

    /* renamed from: m, reason: collision with root package name */
    public static final i f57870m = new i(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f57871i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13) {
        super(1);
        this.f57871i = i13;
    }

    public final wy0 b(vy0 it) {
        switch (this.f57871i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                it.f43089w = Boolean.FALSE;
                boolean[] zArr = it.V1;
                if (zArr.length > 22) {
                    zArr[22] = true;
                }
                wy0 a13 = it.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                return a13;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                it.f43089w = Boolean.TRUE;
                boolean[] zArr2 = it.V1;
                if (zArr2.length > 22) {
                    zArr2[22] = true;
                }
                wy0 a14 = it.a();
                Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                return a14;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f57871i;
        switch (i13) {
            case 0:
                return b((vy0) obj);
            case 1:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        th3.getMessage();
                        break;
                }
                return Unit.f80348a;
            case 2:
                return b((vy0) obj);
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        th4.getMessage();
                        break;
                }
                return Unit.f80348a;
        }
    }
}
