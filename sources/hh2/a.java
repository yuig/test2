package hh2;

import gh2.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final fh2.a f69215a;

    /* renamed from: b, reason: collision with root package name */
    public final d f69216b;

    /* renamed from: c, reason: collision with root package name */
    public final b f69217c;

    public a(fh2.a metadataSource, d resourceSource, b sessionPayloadSource) {
        Intrinsics.checkNotNullParameter(metadataSource, "metadataSource");
        Intrinsics.checkNotNullParameter(resourceSource, "resourceSource");
        Intrinsics.checkNotNullParameter(sessionPayloadSource, "sessionPayloadSource");
        this.f69215a = metadataSource;
        this.f69216b = resourceSource;
        this.f69217c = sessionPayloadSource;
    }
}
