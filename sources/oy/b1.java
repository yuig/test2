package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b1 extends a0 {

    /* renamed from: g, reason: collision with root package name */
    public final s92.o f98009g;

    /* renamed from: h, reason: collision with root package name */
    public final String f98010h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(String uniqueIdentifier, s92.o pwtResult, String str) {
        super(uniqueIdentifier, 2, 0);
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        this.f98009g = pwtResult;
        this.f98010h = str;
    }
}
