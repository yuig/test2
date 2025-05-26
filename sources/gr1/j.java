package gr1;

import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import qr1.m;

/* loaded from: classes4.dex */
public final class j implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f66012a;

    /* renamed from: b, reason: collision with root package name */
    public final m f66013b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f66014c;

    public j(String path, m authority, HashMap pendingParams) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(pendingParams, "pendingParams");
        this.f66012a = path;
        this.f66013b = authority;
        this.f66014c = pendingParams;
    }
}
