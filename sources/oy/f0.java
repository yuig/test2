package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f0 extends j0 {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f98043e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f98044f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98045g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(String pinUid, String str, int i13) {
        super(pinUid);
        str = (i13 & 8) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f98043e = false;
        this.f98044f = null;
        this.f98045g = str;
    }
}
