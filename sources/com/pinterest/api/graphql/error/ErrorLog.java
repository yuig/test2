package com.pinterest.api.graphql.error;

import a.a;
import androidx.annotation.Keep;
import com.pinterest.analytics.kibana.KibanaMetrics;
import com.pinterest.analytics.kibana.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/pinterest/api/graphql/error/ErrorLog;", "Lcom/pinterest/analytics/kibana/KibanaMetrics$Log;", "logPayload", "Lcom/pinterest/api/graphql/error/ErrorLog$ErrorLogPayload;", "meta", "Lcom/pinterest/analytics/kibana/KibanaMetrics$Log$Metadata;", "userId", "", "(Lcom/pinterest/api/graphql/error/ErrorLog$ErrorLogPayload;Lcom/pinterest/analytics/kibana/KibanaMetrics$Log$Metadata;Ljava/lang/String;)V", "getLogPayload", "()Lcom/pinterest/api/graphql/error/ErrorLog$ErrorLogPayload;", "getMeta", "()Lcom/pinterest/analytics/kibana/KibanaMetrics$Log$Metadata;", "getUserId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ErrorLogPayload", "repository_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ErrorLog extends KibanaMetrics.Log {

    @NotNull
    private final transient ErrorLogPayload logPayload;
    private final transient KibanaMetrics.Log.Metadata meta;

    @NotNull
    private final String userId;

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004JJ\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001e\u0010\u0004¨\u0006!"}, d2 = {"Lcom/pinterest/api/graphql/error/ErrorLog$ErrorLogPayload;", "Lcom/pinterest/analytics/kibana/e;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "apolloException", "surfaceName", "operationId", "operationName", "productArea", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/pinterest/api/graphql/error/ErrorLog$ErrorLogPayload;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApolloException", "getSurfaceName", "getOperationId", "getOperationName", "getProductArea", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class ErrorLogPayload implements e {

        @b("apollo_exception")
        @NotNull
        private final String apolloException;

        @b("operation_id")
        private final String operationId;

        @b("operation_name")
        private final String operationName;

        @b("product_area")
        private final String productArea;

        @b("surface_name")
        private final String surfaceName;

        public ErrorLogPayload(@NotNull String apolloException, String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(apolloException, "apolloException");
            this.apolloException = apolloException;
            this.surfaceName = str;
            this.operationId = str2;
            this.operationName = str3;
            this.productArea = str4;
        }

        public static /* synthetic */ ErrorLogPayload copy$default(ErrorLogPayload errorLogPayload, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = errorLogPayload.apolloException;
            }
            if ((i13 & 2) != 0) {
                str2 = errorLogPayload.surfaceName;
            }
            String str6 = str2;
            if ((i13 & 4) != 0) {
                str3 = errorLogPayload.operationId;
            }
            String str7 = str3;
            if ((i13 & 8) != 0) {
                str4 = errorLogPayload.operationName;
            }
            String str8 = str4;
            if ((i13 & 16) != 0) {
                str5 = errorLogPayload.productArea;
            }
            return errorLogPayload.copy(str, str6, str7, str8, str5);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getApolloException() {
            return this.apolloException;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSurfaceName() {
            return this.surfaceName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getOperationId() {
            return this.operationId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getOperationName() {
            return this.operationName;
        }

        /* renamed from: component5, reason: from getter */
        public final String getProductArea() {
            return this.productArea;
        }

        @NotNull
        public final ErrorLogPayload copy(@NotNull String apolloException, String surfaceName, String operationId, String operationName, String productArea) {
            Intrinsics.checkNotNullParameter(apolloException, "apolloException");
            return new ErrorLogPayload(apolloException, surfaceName, operationId, operationName, productArea);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorLogPayload)) {
                return false;
            }
            ErrorLogPayload errorLogPayload = (ErrorLogPayload) other;
            return Intrinsics.d(this.apolloException, errorLogPayload.apolloException) && Intrinsics.d(this.surfaceName, errorLogPayload.surfaceName) && Intrinsics.d(this.operationId, errorLogPayload.operationId) && Intrinsics.d(this.operationName, errorLogPayload.operationName) && Intrinsics.d(this.productArea, errorLogPayload.productArea);
        }

        @NotNull
        public final String getApolloException() {
            return this.apolloException;
        }

        public final String getOperationId() {
            return this.operationId;
        }

        public final String getOperationName() {
            return this.operationName;
        }

        public final String getProductArea() {
            return this.productArea;
        }

        public final String getSurfaceName() {
            return this.surfaceName;
        }

        public int hashCode() {
            int hashCode = this.apolloException.hashCode() * 31;
            String str = this.surfaceName;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.operationId;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.operationName;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.productArea;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.apolloException;
            String str2 = this.surfaceName;
            String str3 = this.operationId;
            String str4 = this.operationName;
            String str5 = this.productArea;
            StringBuilder w13 = a.w("ErrorLogPayload(apolloException=", str, ", surfaceName=", str2, ", operationId=");
            a.B(w13, str3, ", operationName=", str4, ", productArea=");
            return a.p(w13, str5, ")");
        }
    }

    public /* synthetic */ ErrorLog(ErrorLogPayload errorLogPayload, KibanaMetrics.Log.Metadata metadata, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorLogPayload, metadata, (i13 & 4) != 0 ? "" : str);
    }

    public static /* synthetic */ ErrorLog copy$default(ErrorLog errorLog, ErrorLogPayload errorLogPayload, KibanaMetrics.Log.Metadata metadata, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            errorLogPayload = errorLog.logPayload;
        }
        if ((i13 & 2) != 0) {
            metadata = errorLog.meta;
        }
        if ((i13 & 4) != 0) {
            str = errorLog.userId;
        }
        return errorLog.copy(errorLogPayload, metadata, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ErrorLogPayload getLogPayload() {
        return this.logPayload;
    }

    /* renamed from: component2, reason: from getter */
    public final KibanaMetrics.Log.Metadata getMeta() {
        return this.meta;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final ErrorLog copy(@NotNull ErrorLogPayload logPayload, KibanaMetrics.Log.Metadata meta, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(logPayload, "logPayload");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new ErrorLog(logPayload, meta, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorLog)) {
            return false;
        }
        ErrorLog errorLog = (ErrorLog) other;
        return Intrinsics.d(this.logPayload, errorLog.logPayload) && Intrinsics.d(this.meta, errorLog.meta) && Intrinsics.d(this.userId, errorLog.userId);
    }

    @NotNull
    public final ErrorLogPayload getLogPayload() {
        return this.logPayload;
    }

    public final KibanaMetrics.Log.Metadata getMeta() {
        return this.meta;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = this.logPayload.hashCode() * 31;
        KibanaMetrics.Log.Metadata metadata = this.meta;
        return this.userId.hashCode() + ((hashCode + (metadata == null ? 0 : metadata.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        ErrorLogPayload errorLogPayload = this.logPayload;
        KibanaMetrics.Log.Metadata metadata = this.meta;
        String str = this.userId;
        StringBuilder sb3 = new StringBuilder("ErrorLog(logPayload=");
        sb3.append(errorLogPayload);
        sb3.append(", meta=");
        sb3.append(metadata);
        sb3.append(", userId=");
        return a.p(sb3, str, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorLog(@NotNull ErrorLogPayload logPayload, KibanaMetrics.Log.Metadata metadata, @NotNull String userId) {
        super("graphql_error", metadata == null ? new KibanaMetrics.Log.Metadata(userId, null, 2, null) : metadata, logPayload, null, null, 0L, 56, null);
        Intrinsics.checkNotNullParameter(logPayload, "logPayload");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.logPayload = logPayload;
        this.meta = metadata;
        this.userId = userId;
    }
}
