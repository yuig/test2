package k22;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f78204d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f78205e;

    /* renamed from: f, reason: collision with root package name */
    public final String f78206f;

    /* renamed from: g, reason: collision with root package name */
    public final String f78207g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String uid, String str, String str2, boolean z13) {
        super(uid, 2);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f78204d = uid;
        this.f78205e = z13;
        this.f78206f = str;
        this.f78207g = str2;
    }

    @Override // dl1.u
    public final String a() {
        return this.f78204d;
    }

    public /* synthetic */ c(String str, String str2) {
        this(str, str2, "", false);
    }
}
