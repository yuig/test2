package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f5 extends o0 implements b2 {

    /* renamed from: d, reason: collision with root package name */
    public final String f60486d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(String pinUid, String pinUrl) {
        super(1);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinUrl, "pinUrl");
        this.f60486d = pinUid;
    }
}
