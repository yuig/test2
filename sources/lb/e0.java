package lb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f82588a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f82589b;

    static {
        String h10 = kb.b0.h("WrkDbPathHelper");
        Intrinsics.checkNotNullExpressionValue(h10, "tagWithPrefix(\"WrkDbPathHelper\")");
        f82588a = h10;
        f82589b = new String[]{"-journal", "-shm", "-wal"};
    }
}
