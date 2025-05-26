package com.pinterest.analytics.kibana;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012R\u001c\u0010#\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\"\u0010\u0012R\u001c\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u001c\u0010,\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010/\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R\u001c\u00105\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u00108\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u0010\u001a\u0004\b7\u0010\u0012R\u001c\u0010;\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u0010\u001a\u0004\b:\u0010\u0012R\u001c\u0010>\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010)\u001a\u0004\b=\u0010+¨\u0006?"}, d2 = {"Lcom/pinterest/analytics/kibana/f;", "Lcom/pinterest/analytics/kibana/b;", "", "", "a", "Z", "getOnCellular", "()Z", "onCellular", "", "b", "J", "getRequestHeadersSize", "()J", "requestHeadersSize", "c", "Ljava/lang/Long;", "getRequestSize", "()Ljava/lang/Long;", "requestSize", "d", "getRequestSizeSent", "requestSizeSent", "e", "getResponseHeadersSize", "responseHeadersSize", "f", "Ljava/lang/Boolean;", "isRequestBodyGzipped", "()Ljava/lang/Boolean;", "g", "getResponseSizeReceived", "responseSizeReceived", "h", "getResponseSize", "responseSize", "i", "getReusedConnection", "reusedConnection", "", "j", "Ljava/lang/Integer;", "getStatusCode", "()Ljava/lang/Integer;", "statusCode", "k", "getErrorCode", "errorCode", "", "l", "Ljava/lang/Float;", "getTaskDuration", "()Ljava/lang/Float;", "taskDuration", "m", "getTtfb", "ttfb", "n", "getDnsDuration", "dnsDuration", "o", "getUrlLength", "urlLength", "analytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class f implements b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("on_cellular")
    private final boolean onCellular;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("request_headers_size")
    private final long requestHeadersSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("request_size")
    private final Long requestSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("request_size_sent")
    private final long requestSizeSent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("response_headers_size")
    private final Long responseHeadersSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("is_request_body_gzipped")
    private final Boolean isRequestBodyGzipped;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("response_size_received")
    private final Long responseSizeReceived;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @om.b("response_size")
    private final Long responseSize;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @om.b("reused_connection")
    private final Boolean reusedConnection;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @om.b("status_code")
    private final Integer statusCode;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @om.b("error_code")
    private final Integer errorCode;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @om.b("task_duration")
    private final Float taskDuration;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @om.b("ttfb")
    private final Long ttfb;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @om.b("dns_duration")
    private final Long dnsDuration;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @om.b("url_length")
    private final Integer urlLength;

    public f(boolean z13, long j13, Long l13, long j14, Long l14, Boolean bool, Long l15, Long l16, Boolean bool2, Integer num, Integer num2, Float f13, Long l17, Long l18, Integer num3) {
        this.onCellular = z13;
        this.requestHeadersSize = j13;
        this.requestSize = l13;
        this.requestSizeSent = j14;
        this.responseHeadersSize = l14;
        this.isRequestBodyGzipped = bool;
        this.responseSizeReceived = l15;
        this.responseSize = l16;
        this.reusedConnection = bool2;
        this.statusCode = num;
        this.errorCode = num2;
        this.taskDuration = f13;
        this.ttfb = l17;
        this.dnsDuration = l18;
        this.urlLength = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.onCellular == fVar.onCellular && this.requestHeadersSize == fVar.requestHeadersSize && Intrinsics.d(this.requestSize, fVar.requestSize) && this.requestSizeSent == fVar.requestSizeSent && Intrinsics.d(this.responseHeadersSize, fVar.responseHeadersSize) && Intrinsics.d(this.isRequestBodyGzipped, fVar.isRequestBodyGzipped) && Intrinsics.d(this.responseSizeReceived, fVar.responseSizeReceived) && Intrinsics.d(this.responseSize, fVar.responseSize) && Intrinsics.d(this.reusedConnection, fVar.reusedConnection) && Intrinsics.d(this.statusCode, fVar.statusCode) && Intrinsics.d(this.errorCode, fVar.errorCode) && Intrinsics.d(this.taskDuration, fVar.taskDuration) && Intrinsics.d(this.ttfb, fVar.ttfb) && Intrinsics.d(this.dnsDuration, fVar.dnsDuration) && Intrinsics.d(this.urlLength, fVar.urlLength);
    }

    public final int hashCode() {
        int c13 = a.a.c(this.requestHeadersSize, Boolean.hashCode(this.onCellular) * 31, 31);
        Long l13 = this.requestSize;
        int c14 = a.a.c(this.requestSizeSent, (c13 + (l13 == null ? 0 : l13.hashCode())) * 31, 31);
        Long l14 = this.responseHeadersSize;
        int hashCode = (c14 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Boolean bool = this.isRequestBodyGzipped;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l15 = this.responseSizeReceived;
        int hashCode3 = (hashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.responseSize;
        int hashCode4 = (hashCode3 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Boolean bool2 = this.reusedConnection;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.statusCode;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.errorCode;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f13 = this.taskDuration;
        int hashCode8 = (hashCode7 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Long l17 = this.ttfb;
        int hashCode9 = (hashCode8 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Long l18 = this.dnsDuration;
        int hashCode10 = (hashCode9 + (l18 == null ? 0 : l18.hashCode())) * 31;
        Integer num3 = this.urlLength;
        return hashCode10 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "Dimensions(onCellular=" + this.onCellular + ", requestHeadersSize=" + this.requestHeadersSize + ", requestSize=" + this.requestSize + ", requestSizeSent=" + this.requestSizeSent + ", responseHeadersSize=" + this.responseHeadersSize + ", isRequestBodyGzipped=" + this.isRequestBodyGzipped + ", responseSizeReceived=" + this.responseSizeReceived + ", responseSize=" + this.responseSize + ", reusedConnection=" + this.reusedConnection + ", statusCode=" + this.statusCode + ", errorCode=" + this.errorCode + ", taskDuration=" + this.taskDuration + ", ttfb=" + this.ttfb + ", dnsDuration=" + this.dnsDuration + ", urlLength=" + this.urlLength + ")";
    }
}
