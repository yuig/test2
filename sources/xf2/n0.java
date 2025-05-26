package xf2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class n0 extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f134880a = new n0();

    public n0() {
        super(1, StackTraceElement.class, "toString", "toString()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        StackTraceElement p03 = (StackTraceElement) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return p03.toString();
    }
}
