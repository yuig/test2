package ads_mobile_sdk;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class hk0 extends PhantomReference {

    /* renamed from: a, reason: collision with root package name */
    public final a.k8 f6002a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk0(a.k8 task, Object a13, ReferenceQueue queue) {
        super(a13, queue);
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(a13, "a");
        Intrinsics.checkNotNullParameter(queue, "queue");
        this.f6002a = task;
    }
}
