package io.embrace.android.embracesdk.internal.payload;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;
import th2.m;

@s(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB\u007f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0088\u0001\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/Span;", "", "", "traceId", "spanId", "parentSpanId", "name", "", "startTimeNanos", "endTimeNanos", "Lth2/m;", "status", "", "Lio/embrace/android/embracesdk/internal/payload/SpanEvent;", "events", "Lio/embrace/android/embracesdk/internal/payload/Attribute;", "attributes", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lth2/m;Ljava/util/List;Ljava/util/List;)Lio/embrace/android/embracesdk/internal/payload/Span;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lth2/m;Ljava/util/List;Ljava/util/List;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class Span {

    /* renamed from: a */
    public final String f73240a;

    /* renamed from: b */
    public final String f73241b;

    /* renamed from: c */
    public final String f73242c;

    /* renamed from: d */
    public final String f73243d;

    /* renamed from: e */
    public final Long f73244e;

    /* renamed from: f */
    public final Long f73245f;

    /* renamed from: g */
    public final m f73246g;

    /* renamed from: h */
    public final List f73247h;

    /* renamed from: i */
    public final List f73248i;

    public /* synthetic */ Span(String str, String str2, String str3, String str4, Long l13, Long l14, m mVar, List list, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : l13, (i13 & 32) != 0 ? null : l14, (i13 & 64) != 0 ? null : mVar, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : list, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 0 ? list2 : null);
    }

    public static /* synthetic */ Span a(Span span, String str, Long l13, m mVar, ArrayList arrayList, int i13) {
        String str2 = span.f73240a;
        String str3 = span.f73241b;
        if ((i13 & 4) != 0) {
            str = span.f73242c;
        }
        String str4 = str;
        String str5 = span.f73243d;
        Long l14 = span.f73244e;
        if ((i13 & 32) != 0) {
            l13 = span.f73245f;
        }
        Long l15 = l13;
        if ((i13 & 64) != 0) {
            mVar = span.f73246g;
        }
        return span.copy(str2, str3, str4, str5, l14, l15, mVar, span.f73247h, arrayList);
    }

    @NotNull
    public final Span copy(@p(name = "trace_id") String traceId, @p(name = "span_id") String spanId, @p(name = "parent_span_id") String parentSpanId, @p(name = "name") String name, @p(name = "start_time_unix_nano") Long startTimeNanos, @p(name = "end_time_unix_nano") Long endTimeNanos, @p(name = "status") m status, @p(name = "events") List<SpanEvent> events, @p(name = "attributes") List<Attribute> attributes) {
        return new Span(traceId, spanId, parentSpanId, name, startTimeNanos, endTimeNanos, status, events, attributes);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Span)) {
            return false;
        }
        Span span = (Span) obj;
        return Intrinsics.d(this.f73240a, span.f73240a) && Intrinsics.d(this.f73241b, span.f73241b) && Intrinsics.d(this.f73242c, span.f73242c) && Intrinsics.d(this.f73243d, span.f73243d) && Intrinsics.d(this.f73244e, span.f73244e) && Intrinsics.d(this.f73245f, span.f73245f) && this.f73246g == span.f73246g && Intrinsics.d(this.f73247h, span.f73247h) && Intrinsics.d(this.f73248i, span.f73248i);
    }

    public final int hashCode() {
        String str = this.f73240a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f73241b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f73242c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f73243d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l13 = this.f73244e;
        int hashCode5 = (hashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f73245f;
        int hashCode6 = (hashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
        m mVar = this.f73246g;
        int hashCode7 = (hashCode6 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        List list = this.f73247h;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f73248i;
        return hashCode8 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Span(traceId=");
        sb3.append(this.f73240a);
        sb3.append(", spanId=");
        sb3.append(this.f73241b);
        sb3.append(", parentSpanId=");
        sb3.append(this.f73242c);
        sb3.append(", name=");
        sb3.append(this.f73243d);
        sb3.append(", startTimeNanos=");
        sb3.append(this.f73244e);
        sb3.append(", endTimeNanos=");
        sb3.append(this.f73245f);
        sb3.append(", status=");
        sb3.append(this.f73246g);
        sb3.append(", events=");
        sb3.append(this.f73247h);
        sb3.append(", attributes=");
        return g.k(sb3, this.f73248i, ')');
    }

    public Span(@p(name = "trace_id") String str, @p(name = "span_id") String str2, @p(name = "parent_span_id") String str3, @p(name = "name") String str4, @p(name = "start_time_unix_nano") Long l13, @p(name = "end_time_unix_nano") Long l14, @p(name = "status") m mVar, @p(name = "events") List<SpanEvent> list, @p(name = "attributes") List<Attribute> list2) {
        this.f73240a = str;
        this.f73241b = str2;
        this.f73242c = str3;
        this.f73243d = str4;
        this.f73244e = l13;
        this.f73245f = l14;
        this.f73246g = mVar;
        this.f73247h = list;
        this.f73248i = list2;
    }
}
