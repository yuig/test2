package yg2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f139031a;

    /* renamed from: b, reason: collision with root package name */
    public final String f139032b;

    /* renamed from: c, reason: collision with root package name */
    public final String f139033c;

    /* renamed from: d, reason: collision with root package name */
    public final f f139034d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f139035e;

    /* renamed from: f, reason: collision with root package name */
    public final b f139036f;

    /* renamed from: g, reason: collision with root package name */
    public final String f139037g;

    public d(long j13, String uuid, String processId, f envelopeType, boolean z13, b payloadType) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(processId, "processId");
        Intrinsics.checkNotNullParameter(envelopeType, "envelopeType");
        Intrinsics.checkNotNullParameter(payloadType, "payloadType");
        this.f139031a = j13;
        this.f139032b = uuid;
        this.f139033c = processId;
        this.f139034d = envelopeType;
        this.f139035e = z13;
        this.f139036f = payloadType;
        this.f139037g = envelopeType.getPriority() + '_' + j13 + '_' + uuid + '_' + processId + '_' + z13 + '_' + payloadType.getFilenameComponent() + "_v1.json";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f139031a == dVar.f139031a && Intrinsics.d(this.f139032b, dVar.f139032b) && Intrinsics.d(this.f139033c, dVar.f139033c) && this.f139034d == dVar.f139034d && this.f139035e == dVar.f139035e && this.f139036f == dVar.f139036f;
    }

    public final int hashCode() {
        return this.f139036f.hashCode() + ep.b.e(this.f139035e, (this.f139034d.hashCode() + cb.d(this.f139033c, cb.d(this.f139032b, Long.hashCode(this.f139031a) * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        return "StoredTelemetryMetadata(timestamp=" + this.f139031a + ", uuid=" + this.f139032b + ", processId=" + this.f139033c + ", envelopeType=" + this.f139034d + ", complete=" + this.f139035e + ", payloadType=" + this.f139036f + ')';
    }

    public /* synthetic */ d(String str, String str2, f fVar, b bVar) {
        this(0L, str, str2, fVar, true, bVar);
    }
}
