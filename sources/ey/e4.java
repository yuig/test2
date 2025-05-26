package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e4 extends z1 {

    /* renamed from: e, reason: collision with root package name */
    public final s92.o f60481e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(s92.o result, String pinUid) {
        super(pinUid);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f60481e = result;
    }

    @Override // ey.u1
    public final String e() {
        return b5.f60449a;
    }

    public final s92.o m() {
        return this.f60481e;
    }

    public /* synthetic */ e4(String str) {
        this(s92.o.ABORTED, str);
    }
}
