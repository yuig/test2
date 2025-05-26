package to0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final v f118694j = new v(0);

    /* renamed from: k, reason: collision with root package name */
    public static final v f118695k = new v(1);

    /* renamed from: l, reason: collision with root package name */
    public static final v f118696l = new v(2);

    /* renamed from: m, reason: collision with root package name */
    public static final v f118697m = new v(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f118698i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i13) {
        super(1);
        this.f118698i = i13;
    }

    public final om1.c b(om1.c it) {
        switch (this.f118698i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, om1.f.TRANSPARENT_DARK_GRAY, null, null, false, 0, 1019);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, om1.f.TRANSPARENT_GRAY, null, null, false, 0, 1019);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, om1.f.TRANSPARENT_DARK_GRAY, null, null, false, 0, 1019);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, om1.f.TRANSPARENT_GRAY, null, null, false, 0, 1019);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f118698i) {
        }
        return b((om1.c) obj);
    }
}
