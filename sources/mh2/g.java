package mh2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import xf2.l0;
import xf2.s0;

/* loaded from: classes4.dex */
public final /* synthetic */ class g extends p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f87174a = new g();

    public g() {
        super(1, l0.class, "<init>", "<init>(Lio/embrace/android/embracesdk/internal/arch/schema/TelemetryAttributes;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s0 p03 = (s0) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return new l0(p03);
    }
}
