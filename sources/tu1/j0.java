package tu1;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetEngine;

/* loaded from: classes2.dex */
public final class j0 implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f119402a;

    public j0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f119402a = context;
    }

    @Override // tu1.f
    public final CronetEngine a() {
        CronetEngine build = new CronetEngine.Builder(this.f119402a).enableHttp2(true).enableQuic(true).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
