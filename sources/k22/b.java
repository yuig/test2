package k22;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f78202d;

    /* renamed from: e, reason: collision with root package name */
    public final String f78203e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String uid, String sortOption) {
        super(uid, 2);
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        this.f78202d = uid;
        this.f78203e = sortOption;
    }

    @Override // dl1.u
    public final String a() {
        return this.f78202d;
    }
}
