package hb2;

import android.graphics.Region;
import java.util.HashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f68536j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f68537k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f68538l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f68539m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f68540n = new b(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68541i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f68541i = i13;
    }

    public final Integer b(Region region) {
        switch (this.f68541i) {
            case 3:
                Intrinsics.checkNotNullParameter(region, "region");
                return Integer.valueOf(region.getBounds().width());
            default:
                Intrinsics.checkNotNullParameter(region, "region");
                return Integer.valueOf(region.getBounds().height());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f68541i) {
            case 0:
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.o("Error in AnimatedContainer.", (Throwable) obj);
                break;
            case 1:
                rm1.d it = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 2:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
        }
        return b((Region) obj);
    }
}
