package ye1;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f138854j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f138855k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f138856l = new g(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g f138857m = new g(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138858i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f138858i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f138858i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, e0.b(vn1.b.CENTER), null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097083);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c cVar = fm1.c.GONE;
                return rn1.a.y(it, null, null, e0.b(vn1.b.CENTER), null, vn1.g.UI_400, 0, cVar, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097067);
            case 2:
                Intrinsics.checkNotNullParameter(it, "displayState");
                return rn1.a.y(it, null, null, e0.b(vn1.b.START), e0.b(vn1.e.BOLD), vn1.g.HEADING_400, 4, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096963);
            default:
                Intrinsics.checkNotNullParameter(it, "displayState");
                return rn1.a.y(it, null, vn1.c.DARK, e0.b(vn1.b.START), e0.b(vn1.e.BOLD), vn1.g.HEADING_400, 4, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096961);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f138858i) {
        }
        return b((rn1.a) obj);
    }
}
