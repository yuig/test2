package fg0;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import u50.k0;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f62116j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f62117k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f62118l = new e(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e f62119m = new e(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62120i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f62120i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f62120i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.INVISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, e0.b(vn1.b.CENTER_HORIZONTAL), null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097147);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f62120i) {
            case 0:
                return Unit.f80348a;
            case 1:
                return b((rn1.a) obj);
            case 2:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i13 = x0.update;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return yl1.b.f(it, new k0(i13, new ArrayList(0)), false, fm1.c.GONE, null, null, null, null, null, 0, null, 1018);
            default:
                return b((rn1.a) obj);
        }
    }
}
