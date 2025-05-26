package xu1;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class v extends kotlin.jvm.internal.p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final v f135981a = new v();

    public v() {
        super(2, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        i p03 = (i) obj;
        j p13 = (j) obj2;
        Intrinsics.checkNotNullParameter(p03, "p0");
        Intrinsics.checkNotNullParameter(p13, "p1");
        return new Pair(p03, p13);
    }
}
