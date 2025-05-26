package th2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f117648a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f117649b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f117650c;

    /* renamed from: d, reason: collision with root package name */
    public final a f117651d;

    /* renamed from: e, reason: collision with root package name */
    public final d f117652e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f117653f;

    public /* synthetic */ b(long j13, Long l13, Long l14, a aVar, d dVar) {
        this(j13, l13, l14, aVar, dVar, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f117648a == bVar.f117648a && Intrinsics.d(this.f117649b, bVar.f117649b) && Intrinsics.d(this.f117650c, bVar.f117650c) && this.f117651d == bVar.f117651d && Intrinsics.d(this.f117652e, bVar.f117652e) && Intrinsics.d(this.f117653f, bVar.f117653f);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f117648a) * 31;
        Long l13 = this.f117649b;
        int hashCode2 = (hashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f117650c;
        int hashCode3 = (this.f117651d.hashCode() + ((hashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31)) * 31;
        d dVar = this.f117652e;
        int hashCode4 = (hashCode3 + (dVar == null ? 0 : dVar.f117658a.hashCode())) * 31;
        Integer num = this.f117653f;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "AnrInterval(startTime=" + this.f117648a + ", lastKnownTime=" + this.f117649b + ", endTime=" + this.f117650c + ", type=" + this.f117651d + ", anrSampleList=" + this.f117652e + ", code=" + this.f117653f + ')';
    }

    public b(long j13, Long l13, Long l14, a type, d dVar, Integer num) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f117648a = j13;
        this.f117649b = l13;
        this.f117650c = l14;
        this.f117651d = type;
        this.f117652e = dVar;
        this.f117653f = num;
    }
}
