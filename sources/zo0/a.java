package zo0;

import b80.d;
import com.pinterest.api.model.wy0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import yk1.v;

/* loaded from: classes5.dex */
public final class a extends s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f142322j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f142323k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142324i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(2);
        this.f142324i = i13;
    }

    public final String b(wy0 user, v resources) {
        switch (this.f142324i) {
            case 0:
                Intrinsics.checkNotNullParameter(user, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(resources, "resources");
                return ((yk1.a) resources).f139224a.getString(d.style_curated_by);
            default:
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(resources, "<anonymous parameter 1>");
                String Z2 = user.Z2();
                if (Z2 == null) {
                    Z2 = user.U2();
                }
                if (Z2 != null) {
                    return Z2;
                }
                String P3 = user.P3();
                return P3 == null ? "" : P3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f142324i) {
        }
        return b((wy0) obj, (v) obj2);
    }
}
