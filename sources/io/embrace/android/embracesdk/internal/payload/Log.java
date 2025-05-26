package io.embrace.android.embracesdk.internal.payload;

import ep.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011Jj\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/Log;", "", "", "timeUnixNano", "", "severityNumber", "", "severityText", "body", "", "Lio/embrace/android/embracesdk/internal/payload/Attribute;", "attributes", "traceId", "spanId", "copy", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lio/embrace/android/embracesdk/internal/payload/Log;", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class Log {

    /* renamed from: a, reason: collision with root package name */
    public final Long f73175a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f73176b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73177c;

    /* renamed from: d, reason: collision with root package name */
    public final String f73178d;

    /* renamed from: e, reason: collision with root package name */
    public final List f73179e;

    /* renamed from: f, reason: collision with root package name */
    public final String f73180f;

    /* renamed from: g, reason: collision with root package name */
    public final String f73181g;

    public Log(@p(name = "time_unix_nano") Long l13, @p(name = "severity_number") Integer num, @p(name = "severity_text") String str, @p(name = "body") String str2, @p(name = "attributes") List<Attribute> list, @p(name = "trace_id") String str3, @p(name = "span_id") String str4) {
        this.f73175a = l13;
        this.f73176b = num;
        this.f73177c = str;
        this.f73178d = str2;
        this.f73179e = list;
        this.f73180f = str3;
        this.f73181g = str4;
    }

    @NotNull
    public final Log copy(@p(name = "time_unix_nano") Long timeUnixNano, @p(name = "severity_number") Integer severityNumber, @p(name = "severity_text") String severityText, @p(name = "body") String body, @p(name = "attributes") List<Attribute> attributes, @p(name = "trace_id") String traceId, @p(name = "span_id") String spanId) {
        return new Log(timeUnixNano, severityNumber, severityText, body, attributes, traceId, spanId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Log)) {
            return false;
        }
        Log log = (Log) obj;
        return Intrinsics.d(this.f73175a, log.f73175a) && Intrinsics.d(this.f73176b, log.f73176b) && Intrinsics.d(this.f73177c, log.f73177c) && Intrinsics.d(this.f73178d, log.f73178d) && Intrinsics.d(this.f73179e, log.f73179e) && Intrinsics.d(this.f73180f, log.f73180f) && Intrinsics.d(this.f73181g, log.f73181g);
    }

    public final int hashCode() {
        Long l13 = this.f73175a;
        int hashCode = (l13 == null ? 0 : l13.hashCode()) * 31;
        Integer num = this.f73176b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f73177c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f73178d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f73179e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f73180f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f73181g;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Log(timeUnixNano=");
        sb3.append(this.f73175a);
        sb3.append(", severityNumber=");
        sb3.append(this.f73176b);
        sb3.append(", severityText=");
        sb3.append(this.f73177c);
        sb3.append(", body=");
        sb3.append(this.f73178d);
        sb3.append(", attributes=");
        sb3.append(this.f73179e);
        sb3.append(", traceId=");
        sb3.append(this.f73180f);
        sb3.append(", spanId=");
        return b.k(sb3, this.f73181g, ')');
    }

    public /* synthetic */ Log(Long l13, Integer num, String str, String str2, List list, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : l13, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : list, (i13 & 32) != 0 ? null : str3, (i13 & 64) != 0 ? null : str4);
    }
}
