package rh2;

import ei2.v;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements j {

    /* renamed from: a, reason: collision with root package name */
    public final c f108355a;

    /* renamed from: b, reason: collision with root package name */
    public final i f108356b;

    /* renamed from: c, reason: collision with root package name */
    public final v f108357c;

    public e(c embraceDomainCountLimiter, i networkCaptureService, v spanService) {
        Intrinsics.checkNotNullParameter(embraceDomainCountLimiter, "embraceDomainCountLimiter");
        Intrinsics.checkNotNullParameter(networkCaptureService, "networkCaptureService");
        Intrinsics.checkNotNullParameter(spanService, "spanService");
        this.f108355a = embraceDomainCountLimiter;
        this.f108356b = networkCaptureService;
        this.f108357c = spanService;
    }
}
