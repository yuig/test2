package x02;

import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131515i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f131516j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(int i13, boolean z13) {
        super(1);
        this.f131515i = i13;
        this.f131516j = z13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wy0 myUser = (wy0) obj;
        Intrinsics.checkNotNullParameter(myUser, "myUser");
        vy0 H4 = myUser.H4();
        boolean[] zArr = myUser.V1;
        boolean z13 = zArr.length > 40 && zArr[40];
        int i13 = this.f131515i;
        if (z13) {
            H4.O = Integer.valueOf(Math.max(myUser.P2().intValue() + i13, 0));
            boolean[] zArr2 = H4.V1;
            if (zArr2.length > 40) {
                zArr2[40] = true;
            }
        }
        if (this.f131516j && myUser.Y2()) {
            H4.M(Integer.valueOf(Math.max(myUser.X2().intValue() + i13, 0)));
        }
        wy0 a13 = H4.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }
}
