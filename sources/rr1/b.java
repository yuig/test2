package rr1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f109937a;

    /* renamed from: b, reason: collision with root package name */
    public final IntRange f109938b;

    public b(IntRange range) {
        Intrinsics.checkNotNullParameter("zxcvbn", "source");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f109937a = "zxcvbn";
        this.f109938b = range;
    }
}
