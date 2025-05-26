package k22;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f78198d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f78199e;

    /* renamed from: f, reason: collision with root package name */
    public final String f78200f;

    /* renamed from: g, reason: collision with root package name */
    public final String f78201g;

    public /* synthetic */ a(String str) {
        this(str, null, null, false);
    }

    @Override // dl1.u
    public final String a() {
        return this.f78198d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String uid, String str, String str2, boolean z13) {
        super(uid, 2);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f78198d = uid;
        this.f78199e = z13;
        this.f78200f = str;
        this.f78201g = str2;
    }
}
