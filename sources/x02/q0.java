package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q0 extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f131467d;

    /* renamed from: e, reason: collision with root package name */
    public final String f131468e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(String uid, String sourceUid) {
        super(uid, 1);
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(sourceUid, "sourceUid");
        this.f131467d = uid;
        this.f131468e = sourceUid;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131467d;
    }
}
