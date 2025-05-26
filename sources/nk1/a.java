package nk1;

import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zs;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import z40.y;

/* loaded from: classes5.dex */
public final class a extends s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f91098j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f91099k = new a(2);

    /* renamed from: l, reason: collision with root package name */
    public static final a f91100l = new a(3);

    /* renamed from: m, reason: collision with root package name */
    public static final a f91101m = new a(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91102i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(2);
        this.f91102i = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z13 = true;
        switch (this.f91102i) {
            case 0:
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter((v7) obj, "<anonymous parameter 0>");
                return Boolean.TRUE;
            case 1:
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter((dl1.s) obj, "<anonymous parameter 0>");
                return Boolean.TRUE;
            case 2:
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
                return Boolean.TRUE;
            case 3:
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter((zs) obj, "<anonymous parameter 0>");
                return Boolean.TRUE;
            case 4:
                wy0 user = (wy0) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Intrinsics.checkNotNullParameter(user, "user");
                if (booleanValue && user.s2().booleanValue()) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            default:
                y user2 = (y) obj;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                Intrinsics.checkNotNullParameter(user2, "user");
                if (booleanValue2 && Intrinsics.d(user2.m(), Boolean.TRUE)) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
        }
    }
}
