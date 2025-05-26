package xi0;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rl1.q;
import rl1.r;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f135007j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f135008k = new e(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135009i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f135009i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f135009i) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, null, null, false, r.XS, null, false, false, null, 0, null, null, 2039);
            default:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return rn1.a.y(it2, null, vn1.c.LIGHT, e0.b(vn1.b.CENTER), e0.b(vn1.e.BOLD), null, 2, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097105);
        }
    }
}
