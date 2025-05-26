package com.pinterest.api.graphql.logging;

import a.a;
import androidx.annotation.Keep;
import com.pinterest.analytics.kibana.KibanaMetrics;
import e10.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B%\b\u0000\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b \u0010!J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0005R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b¨\u0006#"}, d2 = {"com/pinterest/api/graphql/logging/KibanaMetricLog$Span", "", "Lcom/pinterest/analytics/kibana/KibanaMetrics$Log;", "Lcom/pinterest/api/graphql/logging/KibanaMetricLog$DefaultLogPayload;", "component1", "()Lcom/pinterest/api/graphql/logging/KibanaMetricLog$DefaultLogPayload;", "Lcom/pinterest/analytics/kibana/KibanaMetrics$Log$Metadata;", "component2", "()Lcom/pinterest/analytics/kibana/KibanaMetrics$Log$Metadata;", "", "component3", "()Ljava/lang/String;", "logPayload", "meta", "userId", "Lcom/pinterest/api/graphql/logging/KibanaMetricLog$Span;", "copy", "(Lcom/pinterest/api/graphql/logging/KibanaMetricLog$DefaultLogPayload;Lcom/pinterest/analytics/kibana/KibanaMetrics$Log$Metadata;Ljava/lang/String;)Lcom/pinterest/api/graphql/logging/KibanaMetricLog$Span;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/pinterest/api/graphql/logging/KibanaMetricLog$DefaultLogPayload;", "getLogPayload", "Lcom/pinterest/analytics/kibana/KibanaMetrics$Log$Metadata;", "getMeta", "Ljava/lang/String;", "getUserId", "<init>", "(Lcom/pinterest/api/graphql/logging/KibanaMetricLog$DefaultLogPayload;Lcom/pinterest/analytics/kibana/KibanaMetrics$Log$Metadata;Ljava/lang/String;)V", "SpanLogPayload", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class KibanaMetricLog$Span extends KibanaMetrics.Log {
    private final transient KibanaMetricLog$DefaultLogPayload logPayload;
    private final transient KibanaMetrics.Log.Metadata meta;

    @NotNull
    private final String userId;

    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/pinterest/api/graphql/logging/KibanaMetricLog$Span$SpanLogPayload;", "Lcom/pinterest/api/graphql/logging/KibanaMetricLog$DefaultLogPayload;", "uniqueIdentifier", "", "surfaceName", "treatmentGroup", "altGroup", "spanMeasurement", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getAltGroup", "()Ljava/lang/String;", "getSpanMeasurement", "()J", "getSurfaceName", "getTreatmentGroup", "getUniqueIdentifier", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "repository_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SpanLogPayload implements KibanaMetricLog$DefaultLogPayload {

        @b("alt_group")
        private final String altGroup;

        @b("span_measurement")
        private final long spanMeasurement;

        @b("surface_name")
        private final String surfaceName;

        @b("treatment_group")
        private final String treatmentGroup;

        @b("unique_identifier")
        @NotNull
        private final String uniqueIdentifier;

        public SpanLogPayload(@NotNull String uniqueIdentifier, String str, String str2, String str3, long j13) {
            Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
            this.uniqueIdentifier = uniqueIdentifier;
            this.surfaceName = str;
            this.treatmentGroup = str2;
            this.altGroup = str3;
            this.spanMeasurement = j13;
        }

        public static /* synthetic */ SpanLogPayload copy$default(SpanLogPayload spanLogPayload, String str, String str2, String str3, String str4, long j13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = spanLogPayload.uniqueIdentifier;
            }
            if ((i13 & 2) != 0) {
                str2 = spanLogPayload.surfaceName;
            }
            String str5 = str2;
            if ((i13 & 4) != 0) {
                str3 = spanLogPayload.treatmentGroup;
            }
            String str6 = str3;
            if ((i13 & 8) != 0) {
                str4 = spanLogPayload.altGroup;
            }
            String str7 = str4;
            if ((i13 & 16) != 0) {
                j13 = spanLogPayload.spanMeasurement;
            }
            return spanLogPayload.copy(str, str5, str6, str7, j13);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUniqueIdentifier() {
            return this.uniqueIdentifier;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSurfaceName() {
            return this.surfaceName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTreatmentGroup() {
            return this.treatmentGroup;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAltGroup() {
            return this.altGroup;
        }

        /* renamed from: component5, reason: from getter */
        public final long getSpanMeasurement() {
            return this.spanMeasurement;
        }

        @NotNull
        public final SpanLogPayload copy(@NotNull String uniqueIdentifier, String surfaceName, String treatmentGroup, String altGroup, long spanMeasurement) {
            Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
            return new SpanLogPayload(uniqueIdentifier, surfaceName, treatmentGroup, altGroup, spanMeasurement);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpanLogPayload)) {
                return false;
            }
            SpanLogPayload spanLogPayload = (SpanLogPayload) other;
            return Intrinsics.d(this.uniqueIdentifier, spanLogPayload.uniqueIdentifier) && Intrinsics.d(this.surfaceName, spanLogPayload.surfaceName) && Intrinsics.d(this.treatmentGroup, spanLogPayload.treatmentGroup) && Intrinsics.d(this.altGroup, spanLogPayload.altGroup) && this.spanMeasurement == spanLogPayload.spanMeasurement;
        }

        public final String getAltGroup() {
            return this.altGroup;
        }

        public final long getSpanMeasurement() {
            return this.spanMeasurement;
        }

        @Override // com.pinterest.api.graphql.logging.KibanaMetricLog$DefaultLogPayload
        public String getSurfaceName() {
            return this.surfaceName;
        }

        @Override // com.pinterest.api.graphql.logging.KibanaMetricLog$DefaultLogPayload
        public String getTreatmentGroup() {
            return this.treatmentGroup;
        }

        @Override // com.pinterest.api.graphql.logging.KibanaMetricLog$DefaultLogPayload
        @NotNull
        public String getUniqueIdentifier() {
            return this.uniqueIdentifier;
        }

        public int hashCode() {
            int hashCode = this.uniqueIdentifier.hashCode() * 31;
            String str = this.surfaceName;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.treatmentGroup;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.altGroup;
            return Long.hashCode(this.spanMeasurement) + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.uniqueIdentifier;
            String str2 = this.surfaceName;
            String str3 = this.treatmentGroup;
            String str4 = this.altGroup;
            long j13 = this.spanMeasurement;
            StringBuilder w13 = a.w("SpanLogPayload(uniqueIdentifier=", str, ", surfaceName=", str2, ", treatmentGroup=");
            a.B(w13, str3, ", altGroup=", str4, ", spanMeasurement=");
            return a.o(w13, j13, ")");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KibanaMetricLog$Span(KibanaMetricLog$DefaultLogPayload kibanaMetricLog$DefaultLogPayload, KibanaMetrics.Log.Metadata metadata, @NotNull String userId) {
        super(k.SPAN_LOG.getLogName(), metadata == null ? new KibanaMetrics.Log.Metadata(userId, null, 2, null) : metadata, kibanaMetricLog$DefaultLogPayload, null, null, 0L, 56, null);
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.logPayload = kibanaMetricLog$DefaultLogPayload;
        this.meta = metadata;
        this.userId = userId;
    }

    public static /* synthetic */ KibanaMetricLog$Span copy$default(KibanaMetricLog$Span kibanaMetricLog$Span, KibanaMetricLog$DefaultLogPayload kibanaMetricLog$DefaultLogPayload, KibanaMetrics.Log.Metadata metadata, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            kibanaMetricLog$DefaultLogPayload = kibanaMetricLog$Span.logPayload;
        }
        if ((i13 & 2) != 0) {
            metadata = kibanaMetricLog$Span.meta;
        }
        if ((i13 & 4) != 0) {
            str = kibanaMetricLog$Span.userId;
        }
        return kibanaMetricLog$Span.copy(kibanaMetricLog$DefaultLogPayload, metadata, str);
    }

    /* renamed from: component1, reason: from getter */
    public final KibanaMetricLog$DefaultLogPayload getLogPayload() {
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
    public final KibanaMetricLog$Span copy(KibanaMetricLog$DefaultLogPayload logPayload, KibanaMetrics.Log.Metadata meta, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new KibanaMetricLog$Span(logPayload, meta, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KibanaMetricLog$Span)) {
            return false;
        }
        KibanaMetricLog$Span kibanaMetricLog$Span = (KibanaMetricLog$Span) other;
        return Intrinsics.d(this.logPayload, kibanaMetricLog$Span.logPayload) && Intrinsics.d(this.meta, kibanaMetricLog$Span.meta) && Intrinsics.d(this.userId, kibanaMetricLog$Span.userId);
    }

    public KibanaMetricLog$DefaultLogPayload getLogPayload() {
        return this.logPayload;
    }

    public KibanaMetrics.Log.Metadata getMeta() {
        return this.meta;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        KibanaMetricLog$DefaultLogPayload kibanaMetricLog$DefaultLogPayload = this.logPayload;
        int hashCode = (kibanaMetricLog$DefaultLogPayload == null ? 0 : kibanaMetricLog$DefaultLogPayload.hashCode()) * 31;
        KibanaMetrics.Log.Metadata metadata = this.meta;
        return this.userId.hashCode() + ((hashCode + (metadata != null ? metadata.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        KibanaMetricLog$DefaultLogPayload kibanaMetricLog$DefaultLogPayload = this.logPayload;
        KibanaMetrics.Log.Metadata metadata = this.meta;
        String str = this.userId;
        StringBuilder sb3 = new StringBuilder("Span(logPayload=");
        sb3.append(kibanaMetricLog$DefaultLogPayload);
        sb3.append(", meta=");
        sb3.append(metadata);
        sb3.append(", userId=");
        return a.p(sb3, str, ")");
    }
}
