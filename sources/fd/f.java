package fd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f61763a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f61764b;

    /* renamed from: c, reason: collision with root package name */
    public final z f61765c;

    public f() {
        e connectionPayload = new e(1, null);
        z frameType = z.Text;
        Intrinsics.checkNotNullParameter(connectionPayload, "connectionPayload");
        Intrinsics.checkNotNullParameter(frameType, "frameType");
        this.f61763a = 10000L;
        this.f61764b = connectionPayload;
        this.f61765c = frameType;
    }
}
