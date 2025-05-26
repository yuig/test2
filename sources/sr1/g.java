package sr1;

import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import qr1.m;

/* loaded from: classes4.dex */
public final class g implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f115099a;

    /* renamed from: b, reason: collision with root package name */
    public final m f115100b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f115101c;

    public g(String path, m authority, HashMap pendingParams) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(pendingParams, "pendingParams");
        this.f115099a = path;
        this.f115100b = authority;
        this.f115101c = pendingParams;
    }

    public final m a() {
        return this.f115100b;
    }

    public final HashMap b() {
        return this.f115101c;
    }
}
