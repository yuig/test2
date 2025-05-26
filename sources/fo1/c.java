package fo1;

import com.pinterest.design.brio.widget.IconView;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f62733j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f62734k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f62735l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f62736m = new c(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c f62737n = new c(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62738i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f62738i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f62738i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, e0.b(vn1.b.CENTER), null, null, 1, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097115);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, e0.b(vn1.b.CENTER_VERTICAL), e0.b(vn1.e.BOLD), null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097139);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f62738i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            case 2:
                return b((rn1.a) obj);
            case 3:
                return b((rn1.a) obj);
            default:
                return Boolean.valueOf(obj instanceof IconView);
        }
    }
}
