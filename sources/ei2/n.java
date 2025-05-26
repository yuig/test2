package ei2;

import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final v f59025a;

    public n(v spanService) {
        Intrinsics.checkNotNullParameter(spanService, "spanService");
        this.f59025a = spanService;
    }

    public final boolean a(String name, long j13, long j14, ErrorCode errorCode, oi2.b bVar, Map map, List list) {
        Intrinsics.checkNotNullParameter(name, "name");
        return kg.p.U(this.f59025a, name, kh2.w.q0(j13), kh2.w.q0(j14), bVar, null, false, map == null ? z0.d() : map, list == null ? q0.f80391a : list, errorCode, 40);
    }

    public final Object b(String name, oi2.b bVar, Map map, List list, oi2.a autoTerminationMode, Function0 code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(code, "code");
        return this.f59025a.b(name, autoTerminationMode, bVar, xf2.c.f134850d, false, false, map == null ? z0.d() : map, list == null ? q0.f80391a : list, code);
    }

    public final oi2.b c(String name, oi2.b bVar, Long l13, oi2.a autoTerminationMode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        return kg.p.c0(this.f59025a, name, autoTerminationMode, bVar, l13 != null ? Long.valueOf(kh2.w.q0(l13.longValue())) : null, null, 16);
    }
}
