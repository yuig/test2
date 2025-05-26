package py;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* loaded from: classes.dex */
public final class i extends d {

    /* renamed from: d, reason: collision with root package name */
    public final s92.c f101725d;

    /* renamed from: e, reason: collision with root package name */
    public final Headers f101726e;

    /* renamed from: f, reason: collision with root package name */
    public final int f101727f;

    /* renamed from: g, reason: collision with root package name */
    public final int f101728g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String pinUid, s92.c dataSource, Headers headers, int i13, int i14) {
        super(pinUid);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f101725d = dataSource;
        this.f101726e = headers;
        this.f101727f = i13;
        this.f101728g = i14;
    }
}
