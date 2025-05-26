package th2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f117654a;

    /* renamed from: b, reason: collision with root package name */
    public final List f117655b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f117656c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f117657d;

    public c(long j13, ArrayList arrayList, Long l13, Integer num) {
        this.f117654a = j13;
        this.f117655b = arrayList;
        this.f117656c = l13;
        this.f117657d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f117654a == cVar.f117654a && Intrinsics.d(this.f117655b, cVar.f117655b) && Intrinsics.d(this.f117656c, cVar.f117656c) && Intrinsics.d(this.f117657d, cVar.f117657d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f117654a) * 31;
        List list = this.f117655b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l13 = this.f117656c;
        int hashCode3 = (hashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Integer num = this.f117657d;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "AnrSample(timestamp=" + this.f117654a + ", threads=" + this.f117655b + ", sampleOverheadMs=" + this.f117656c + ", code=" + this.f117657d + ')';
    }
}
