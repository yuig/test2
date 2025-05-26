package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r3 extends n3 {

    /* renamed from: e, reason: collision with root package name */
    public final String f60568e;

    /* renamed from: f, reason: collision with root package name */
    public final s92.o f60569f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(boolean z13, String userUid, s92.o stopReason) {
        super(z13, 1);
        Intrinsics.checkNotNullParameter(userUid, "userUid");
        Intrinsics.checkNotNullParameter(stopReason, "stopReason");
        this.f60568e = userUid;
        this.f60569f = stopReason;
    }
}
