package mh2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import xf2.o0;
import xf2.s0;

/* loaded from: classes4.dex */
public final /* synthetic */ class e extends p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final e f87172a = new e();

    public e() {
        super(1, o0.class, "<init>", "<init>(Lio/embrace/android/embracesdk/internal/arch/schema/TelemetryAttributes;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s0 p03 = (s0) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return new o0(p03, 0);
    }
}
