package mo2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class g extends p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f87814a = new g();

    public g() {
        super(2, j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = j.f87822a;
        return new k(((Number) obj).longValue(), (k) obj2, 0);
    }
}
