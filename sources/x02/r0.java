package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r0 extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f131474d;

    /* renamed from: e, reason: collision with root package name */
    public final String f131475e;

    /* renamed from: f, reason: collision with root package name */
    public final String f131476f;

    /* renamed from: g, reason: collision with root package name */
    public final String f131477g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(String uid, String movedPinId, String str, String str2) {
        super(uid, 1);
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(movedPinId, "movedPinId");
        this.f131474d = uid;
        this.f131475e = movedPinId;
        this.f131476f = str;
        this.f131477g = str2;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131474d;
    }
}
