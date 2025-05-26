package mh2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import xf2.m0;
import xf2.s0;

/* loaded from: classes4.dex */
public final /* synthetic */ class f extends p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final f f87173a = new f();

    public f() {
        super(1, m0.class, "<init>", "<init>(Lio/embrace/android/embracesdk/internal/arch/schema/TelemetryAttributes;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s0 p03 = (s0) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return new m0(p03);
    }
}
