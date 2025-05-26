package rm1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f108688j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f108689k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f108690l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f108691m = new a(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108692i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f108692i = i13;
    }

    public final d b(d it) {
        switch (this.f108692i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(it, null, null, fm1.c.GONE, 0, null, 27);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(it, null, null, fm1.c.INVISIBLE, 0, null, 27);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(it, null, null, fm1.c.VISIBLE, 0, null, 27);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f108692i) {
            case 0:
                return b((d) obj);
            case 1:
                return b((d) obj);
            case 2:
                return b((d) obj);
            default:
                gm1.a it = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.f80348a;
        }
    }
}
