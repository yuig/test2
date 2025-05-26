package lb;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f82556a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f82557b;

    static {
        String h10 = kb.b0.h("UnfinishedWorkListener");
        Intrinsics.checkNotNullExpressionValue(h10, "tagWithPrefix(\"UnfinishedWorkListener\")");
        f82556a = h10;
        f82557b = TimeUnit.HOURS.toMillis(1L);
    }
}
