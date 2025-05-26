package io.embrace.android.embracesdk.network;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import io.embrace.android.embracesdk.network.http.HttpMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mi2.a;
import org.jetbrains.annotations.NotNull;
import qh2.k;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\r\u0018\u0000 32\u00020\u0001:\u00014By\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0019\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0011\u0010.\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b-\u0010\rR\u0011\u00100\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b/\u0010\r¨\u00065"}, d2 = {"Lio/embrace/android/embracesdk/network/EmbraceNetworkRequest;", "", "", "url", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "httpMethod", "getHttpMethod", "", "startTime", "J", "getStartTime", "()J", "endTime", "getEndTime", "bytesSent", "Ljava/lang/Long;", "getBytesSent", "()Ljava/lang/Long;", "bytesReceived", "getBytesReceived", "", "responseCode", "Ljava/lang/Integer;", "getResponseCode", "()Ljava/lang/Integer;", "errorType", "getErrorType", "errorMessage", "getErrorMessage", "traceId", "getTraceId", "w3cTraceparent", "getW3cTraceparent", "Lqh2/k;", "networkCaptureData", "Lqh2/k;", "getNetworkCaptureData", "()Lqh2/k;", "", "error", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "getBytesIn", "bytesIn", "getBytesOut", "bytesOut", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqh2/k;)V", "Companion", "mi2/a", "embrace-android-api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class EmbraceNetworkRequest {

    @NotNull
    public static final a Companion = new a();
    private final Long bytesReceived;
    private final Long bytesSent;
    private final long endTime;
    private final Throwable error;
    private final String errorMessage;
    private final String errorType;

    @NotNull
    private final String httpMethod;
    private final k networkCaptureData;
    private final Integer responseCode;
    private final long startTime;
    private final String traceId;

    @NotNull
    private final String url;
    private final String w3cTraceparent;

    public /* synthetic */ EmbraceNetworkRequest(String str, String str2, long j13, long j14, Long l13, Long l14, Integer num, String str3, String str4, String str5, String str6, k kVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j13, j14, l13, l14, num, str3, str4, str5, str6, kVar);
    }

    @NotNull
    public static final EmbraceNetworkRequest fromCompletedRequest(@NotNull String url, @NotNull HttpMethod httpMethod, long j13, long j14, long j15, long j16, int i13) {
        EmbraceNetworkRequest a13;
        Companion.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        a13 = a.a(url, httpMethod, j13, j14, j15, j16, i13, (r30 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : null, (r30 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : null, null);
        return a13;
    }

    @NotNull
    public static final EmbraceNetworkRequest fromIncompleteRequest(@NotNull String url, @NotNull HttpMethod httpMethod, long j13, long j14, @NotNull String errorType, @NotNull String errorMessage) {
        EmbraceNetworkRequest c13;
        Companion.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        c13 = a.c(url, httpMethod, j13, j14, errorType, errorMessage, (r24 & 64) != 0 ? null : null, (r24 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : null, null);
        return c13;
    }

    public final long getBytesIn() {
        Long l13 = this.bytesReceived;
        if (l13 != null) {
            return l13.longValue();
        }
        return 0L;
    }

    public final long getBytesOut() {
        Long l13 = this.bytesSent;
        if (l13 != null) {
            return l13.longValue();
        }
        return 0L;
    }

    public final Long getBytesReceived() {
        return this.bytesReceived;
    }

    public final Long getBytesSent() {
        return this.bytesSent;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final Throwable getError() {
        return this.error;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getErrorType() {
        return this.errorType;
    }

    @NotNull
    public final String getHttpMethod() {
        return this.httpMethod;
    }

    public final k getNetworkCaptureData() {
        return this.networkCaptureData;
    }

    public final Integer getResponseCode() {
        return this.responseCode;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final String getW3cTraceparent() {
        return this.w3cTraceparent;
    }

    private EmbraceNetworkRequest(String str, String str2, long j13, long j14, Long l13, Long l14, Integer num, String str3, String str4, String str5, String str6, k kVar) {
        this.url = str;
        this.httpMethod = str2;
        this.startTime = j13;
        this.endTime = j14;
        this.bytesSent = l13;
        this.bytesReceived = l14;
        this.responseCode = num;
        this.errorType = str3;
        this.errorMessage = str4;
        this.traceId = str5;
        this.w3cTraceparent = str6;
        this.networkCaptureData = kVar;
    }

    @NotNull
    public static final EmbraceNetworkRequest fromCompletedRequest(@NotNull String url, @NotNull HttpMethod httpMethod, long j13, long j14, long j15, long j16, int i13, String str) {
        EmbraceNetworkRequest a13;
        Companion.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        a13 = a.a(url, httpMethod, j13, j14, j15, j16, i13, (r30 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str, (r30 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : null, null);
        return a13;
    }

    @NotNull
    public static final EmbraceNetworkRequest fromIncompleteRequest(@NotNull String url, @NotNull HttpMethod httpMethod, long j13, long j14, @NotNull String errorType, @NotNull String errorMessage, String str) {
        EmbraceNetworkRequest c13;
        Companion.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        c13 = a.c(url, httpMethod, j13, j14, errorType, errorMessage, (r24 & 64) != 0 ? null : str, (r24 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : null, null);
        return c13;
    }

    @NotNull
    public static final EmbraceNetworkRequest fromCompletedRequest(@NotNull String url, @NotNull HttpMethod httpMethod, long j13, long j14, long j15, long j16, int i13, String str, String str2) {
        EmbraceNetworkRequest a13;
        Companion.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        a13 = a.a(url, httpMethod, j13, j14, j15, j16, i13, (r30 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str, (r30 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : str2, null);
        return a13;
    }

    @NotNull
    public static final EmbraceNetworkRequest fromIncompleteRequest(@NotNull String url, @NotNull HttpMethod httpMethod, long j13, long j14, @NotNull String errorType, @NotNull String errorMessage, String str, String str2) {
        EmbraceNetworkRequest c13;
        Companion.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        c13 = a.c(url, httpMethod, j13, j14, errorType, errorMessage, (r24 & 64) != 0 ? null : str, (r24 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str2, null);
        return c13;
    }

    @NotNull
    public static final EmbraceNetworkRequest fromCompletedRequest(@NotNull String str, @NotNull HttpMethod httpMethod, long j13, long j14, long j15, long j16, int i13, String str2, String str3, k kVar) {
        Companion.getClass();
        return a.a(str, httpMethod, j13, j14, j15, j16, i13, str2, str3, kVar);
    }

    @NotNull
    public static final EmbraceNetworkRequest fromIncompleteRequest(@NotNull String str, @NotNull HttpMethod httpMethod, long j13, long j14, @NotNull String str2, @NotNull String str3, String str4, String str5, k kVar) {
        Companion.getClass();
        return a.c(str, httpMethod, j13, j14, str2, str3, str4, str5, kVar);
    }
}
