package io.embrace.android.embracesdk.internal.payload;

import d7.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/SpanEvent;", "", "", "name", "", "timestampNanos", "", "Lio/embrace/android/embracesdk/internal/payload/Attribute;", "attributes", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)Lio/embrace/android/embracesdk/internal/payload/SpanEvent;", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class SpanEvent {

    /* renamed from: a, reason: collision with root package name */
    public final String f73249a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f73250b;

    /* renamed from: c, reason: collision with root package name */
    public final List f73251c;

    public SpanEvent(@p(name = "name") String str, @p(name = "time_unix_nano") Long l13, @p(name = "attributes") List<Attribute> list) {
        this.f73249a = str;
        this.f73250b = l13;
        this.f73251c = list;
    }

    @NotNull
    public final SpanEvent copy(@p(name = "name") String name, @p(name = "time_unix_nano") Long timestampNanos, @p(name = "attributes") List<Attribute> attributes) {
        return new SpanEvent(name, timestampNanos, attributes);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanEvent)) {
            return false;
        }
        SpanEvent spanEvent = (SpanEvent) obj;
        return Intrinsics.d(this.f73249a, spanEvent.f73249a) && Intrinsics.d(this.f73250b, spanEvent.f73250b) && Intrinsics.d(this.f73251c, spanEvent.f73251c);
    }

    public final int hashCode() {
        String str = this.f73249a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l13 = this.f73250b;
        int hashCode2 = (hashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        List list = this.f73251c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SpanEvent(name=");
        sb3.append(this.f73249a);
        sb3.append(", timestampNanos=");
        sb3.append(this.f73250b);
        sb3.append(", attributes=");
        return g.k(sb3, this.f73251c, ')');
    }

    public /* synthetic */ SpanEvent(String str, Long l13, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : l13, (i13 & 4) != 0 ? null : list);
    }
}
