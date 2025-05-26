package yk1;

import java.util.HashMap;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final Random f139234b = new Random(System.currentTimeMillis());

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f139235a = new HashMap(16);

    public final m a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (m) this.f139235a.remove(key);
    }
}
