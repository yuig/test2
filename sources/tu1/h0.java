package tu1;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetEngine;

/* loaded from: classes4.dex */
public final class h0 implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f119380a;

    public h0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f119380a = context;
    }

    @Override // tu1.f
    public final CronetEngine a() {
        CronetEngine build = new CronetEngine.Builder(this.f119380a).enableHttp2(true).enableQuic(false).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
