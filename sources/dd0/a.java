package dd0;

import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f54434j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f54435k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f54436l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f54437m = new a(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54438i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f54438i = i13;
    }

    public final wy0 b(wy0 myUser) {
        switch (this.f54438i) {
            case 0:
                Intrinsics.checkNotNullParameter(myUser, "myUser");
                vy0 H4 = myUser.H4();
                H4.f43034d1 = Boolean.TRUE;
                boolean[] zArr = H4.V1;
                if (zArr.length > 107) {
                    zArr[107] = true;
                }
                wy0 a13 = H4.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                return a13;
            default:
                Intrinsics.checkNotNullParameter(myUser, "myUser");
                vy0 H42 = myUser.H4();
                H42.f43034d1 = Boolean.FALSE;
                boolean[] zArr2 = H42.V1;
                if (zArr2.length > 107) {
                    zArr2[107] = true;
                }
                wy0 a14 = H42.a();
                Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                return a14;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f54438i) {
            case 0:
                return b((wy0) obj);
            case 1:
                return Unit.f80348a;
            case 2:
                return b((wy0) obj);
            default:
                return Unit.f80348a;
        }
    }
}
