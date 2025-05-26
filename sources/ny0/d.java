package ny0;

import com.pinterest.api.model.qz;
import com.pinterest.api.model.uz;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f92566j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f92567k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f92568l = new d(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d f92569m = new d(3);

    /* renamed from: n, reason: collision with root package name */
    public static final d f92570n = new d(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92571i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f92571i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f92571i) {
            case 0:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return (uz) d7.b.F(it);
            case 1:
                a1 it2 = (a1) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2;
            case 2:
                f it3 = (f) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return f.e(it3, null, null, null, null, null, 31);
            case 3:
                t0 it4 = (t0) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return t0.b(it4, null, null, null, 23);
            default:
                qz it5 = (qz) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                String uid = it5.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                return uid;
        }
    }
}
