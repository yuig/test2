package com.pinterest.analytics.kibana;

import a.cb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0005\u001a\u0004\b\u0016\u0010\u0007R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0005\u001a\u0004\b\u0019\u0010\u0007R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0005\u001a\u0004\b\u001c\u0010\u0007R\u001c\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0005\u001a\u0004\b\u001f\u0010\u0007R\u001c\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0005\u001a\u0004\b\"\u0010\u0007R\u001a\u0010&\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0005\u001a\u0004\b%\u0010\u0007¨\u0006'"}, d2 = {"Lcom/pinterest/analytics/kibana/h;", "Lcom/pinterest/analytics/kibana/d;", "", "", "a", "Ljava/lang/String;", "getFetchFrom", "()Ljava/lang/String;", "fetchFrom", "b", "getHost", "host", "c", "getMethod", "method", "d", "getPath", "path", "e", "getRaw_path", "raw_path", "f", "getNetworkProtocol", "networkProtocol", "g", "getTlsVersion", "tlsVersion", "h", "getRequestId", "requestId", "i", "getErrorMessage", "errorMessage", "j", "getCdn", "cdn", "k", "getTransport", "transport", "analytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class h implements d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("fetch_from")
    private final String fetchFrom;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("host")
    private final String host;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("method")
    @NotNull
    private final String method;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("path")
    private final String path;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("raw_path")
    private final String raw_path;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("network_protocol")
    private final String networkProtocol;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("tls_version")
    private final String tlsVersion;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @om.b("request_id")
    private final String requestId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @om.b("error_message")
    private final String errorMessage;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @om.b("cdn")
    private final String cdn;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @om.b("transport")
    @NotNull
    private final String transport;

    public h(String str, String str2, String method, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String transport) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(transport, "transport");
        this.fetchFrom = str;
        this.host = str2;
        this.method = method;
        this.path = str3;
        this.raw_path = str4;
        this.networkProtocol = str5;
        this.tlsVersion = str6;
        this.requestId = str7;
        this.errorMessage = str8;
        this.cdn = str9;
        this.transport = transport;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.fetchFrom, hVar.fetchFrom) && Intrinsics.d(this.host, hVar.host) && Intrinsics.d(this.method, hVar.method) && Intrinsics.d(this.path, hVar.path) && Intrinsics.d(this.raw_path, hVar.raw_path) && Intrinsics.d(this.networkProtocol, hVar.networkProtocol) && Intrinsics.d(this.tlsVersion, hVar.tlsVersion) && Intrinsics.d(this.requestId, hVar.requestId) && Intrinsics.d(this.errorMessage, hVar.errorMessage) && Intrinsics.d(this.cdn, hVar.cdn) && Intrinsics.d(this.transport, hVar.transport);
    }

    public final int hashCode() {
        String str = this.fetchFrom;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.host;
        int d2 = cb.d(this.method, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.path;
        int hashCode2 = (d2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.raw_path;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.networkProtocol;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tlsVersion;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.requestId;
        int hashCode6 = (hashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.errorMessage;
        int hashCode7 = (hashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cdn;
        return this.transport.hashCode() + ((hashCode7 + (str9 != null ? str9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.fetchFrom;
        String str2 = this.host;
        String str3 = this.method;
        String str4 = this.path;
        String str5 = this.raw_path;
        String str6 = this.networkProtocol;
        String str7 = this.tlsVersion;
        String str8 = this.requestId;
        String str9 = this.errorMessage;
        String str10 = this.cdn;
        String str11 = this.transport;
        StringBuilder w13 = a.a.w("Metrics(fetchFrom=", str, ", host=", str2, ", method=");
        a.a.B(w13, str3, ", path=", str4, ", raw_path=");
        a.a.B(w13, str5, ", networkProtocol=", str6, ", tlsVersion=");
        a.a.B(w13, str7, ", requestId=", str8, ", errorMessage=");
        a.a.B(w13, str9, ", cdn=", str10, ", transport=");
        return a.a.p(w13, str11, ")");
    }
}
