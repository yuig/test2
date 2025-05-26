package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/MatchGroup;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class MatchGroup {

    /* renamed from: a, reason: collision with root package name */
    public final String f80465a;

    /* renamed from: b, reason: collision with root package name */
    public final IntRange f80466b;

    public MatchGroup(String value, IntRange range) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f80465a = value;
        this.f80466b = range;
    }

    /* renamed from: a, reason: from getter */
    public final String getF80465a() {
        return this.f80465a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return Intrinsics.d(this.f80465a, matchGroup.f80465a) && Intrinsics.d(this.f80466b, matchGroup.f80466b);
    }

    public final int hashCode() {
        return this.f80466b.hashCode() + (this.f80465a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f80465a + ", range=" + this.f80466b + ')';
    }
}
