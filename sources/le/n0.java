package le;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f83075a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83076b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f83077c;

    /* renamed from: d, reason: collision with root package name */
    public long f83078d;

    public n0(String key, boolean z13) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f83075a = z13;
        this.f83076b = key;
    }

    public final long a() {
        return this.f83078d;
    }

    public final boolean b() {
        Boolean bool = this.f83077c;
        return bool == null ? this.f83075a : bool.booleanValue();
    }
}
