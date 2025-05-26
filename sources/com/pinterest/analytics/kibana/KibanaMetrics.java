package com.pinterest.analytics.kibana;

import androidx.annotation.Keep;
import com.appsflyer.AdRevenueScheme;
import com.pinterest.analytics.kibana.KibanaMetrics.Log;
import ff0.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/pinterest/analytics/kibana/KibanaMetrics;", "Lcom/pinterest/analytics/kibana/KibanaMetrics$Log;", "L", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "logs", "<init>", "()V", "Log", "kibanaMetrics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class KibanaMetrics<L extends Log> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("logs")
    @NotNull
    private final ArrayList<L> logs = new ArrayList<>();

    public final void b(Log log) {
        Intrinsics.checkNotNullParameter(log, "log");
        this.logs.add(log);
    }

    public final void c(List bulk) {
        Intrinsics.checkNotNullParameter(bulk, "bulk");
        this.logs.addAll(bulk);
    }

    public final void d() {
        this.logs.clear();
    }

    public final int e() {
        return this.logs.size();
    }

    @Keep
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\b'\u0018\u00002\u00020\u0001:\u0004\u0011\"\u0016\fBE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/pinterest/analytics/kibana/KibanaMetrics$Log;", "", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/pinterest/analytics/kibana/KibanaMetrics$Log$Metadata;", "metadata", "Lcom/pinterest/analytics/kibana/KibanaMetrics$Log$Metadata;", "getMetadata", "()Lcom/pinterest/analytics/kibana/KibanaMetrics$Log$Metadata;", "Lcom/pinterest/analytics/kibana/e;", "payload", "Lcom/pinterest/analytics/kibana/e;", "getPayload", "()Lcom/pinterest/analytics/kibana/e;", "Lcom/pinterest/analytics/kibana/b;", "dimensions", "Lcom/pinterest/analytics/kibana/b;", "getDimensions", "()Lcom/pinterest/analytics/kibana/b;", "Lcom/pinterest/analytics/kibana/d;", "metrics", "Lcom/pinterest/analytics/kibana/d;", "getMetrics", "()Lcom/pinterest/analytics/kibana/d;", "", "timestamp", "J", "getTimestamp", "()J", "<init>", "(Ljava/lang/String;Lcom/pinterest/analytics/kibana/KibanaMetrics$Log$Metadata;Lcom/pinterest/analytics/kibana/e;Lcom/pinterest/analytics/kibana/b;Lcom/pinterest/analytics/kibana/d;J)V", "Metadata", "kibanaMetrics_release"}, k = 1, mv = {1, 9, 0})
    public static abstract class Log {
        private final b dimensions;

        @NotNull
        private final Metadata metadata;
        private final d metrics;

        @NotNull
        private final String name;
        private final e payload;
        private final long timestamp;

        public Log(@NotNull String name, @NotNull Metadata metadata, e eVar, b bVar, d dVar, long j13) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            this.name = name;
            this.metadata = metadata;
            this.payload = eVar;
            this.dimensions = bVar;
            this.metrics = dVar;
            this.timestamp = j13;
        }

        public final b getDimensions() {
            return this.dimensions;
        }

        @NotNull
        public final Metadata getMetadata() {
            return this.metadata;
        }

        public final d getMetrics() {
            return this.metrics;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final e getPayload() {
            return this.payload;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public /* synthetic */ Log(String str, Metadata metadata, e eVar, b bVar, d dVar, long j13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, metadata, (i13 & 4) != 0 ? null : eVar, (i13 & 8) != 0 ? null : bVar, (i13 & 16) != 0 ? null : dVar, (i13 & 32) != 0 ? System.currentTimeMillis() : j13);
        }

        @Keep
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0017\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087D¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006¨\u0006\u001c"}, d2 = {"Lcom/pinterest/analytics/kibana/KibanaMetrics$Log$Metadata;", "", "", "userId", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "Lay/a;", "commonProperties", "Lay/a;", "getCommonProperties", "()Lay/a;", "commonPropertiesOverride", "getCommonPropertiesOverride", "buildType", "getBuildType", "appVersion", "getAppVersion", AdRevenueScheme.COUNTRY, "getCountry", "osVersion", "getOsVersion", "deviceModel", "getDeviceModel", "platform", "getPlatform", "<init>", "(Ljava/lang/String;Lay/a;)V", "kibanaMetrics_release"}, k = 1, mv = {1, 9, 0})
        public static class Metadata {

            @om.b("app_version")
            @NotNull
            private final String appVersion;

            @om.b("build_type")
            private final String buildType;

            @NotNull
            private final transient ay.a commonProperties;

            @NotNull
            private final transient ay.a commonPropertiesOverride;

            @om.b(AdRevenueScheme.COUNTRY)
            @NotNull
            private final String country;

            @om.b("device_model")
            @NotNull
            private final String deviceModel;

            @om.b("os_version")
            @NotNull
            private final String osVersion;

            @om.b("platform")
            @NotNull
            private final String platform;

            @om.b("user_id")
            private final String userId;

            public Metadata(String str, @NotNull ay.a commonProperties) {
                Intrinsics.checkNotNullParameter(commonProperties, "commonProperties");
                this.userId = str;
                this.commonProperties = commonProperties;
                commonProperties = j.f62104b ? new c(this) : commonProperties;
                this.commonPropertiesOverride = commonProperties;
                this.buildType = commonProperties.d();
                this.appVersion = commonProperties.c();
                this.country = commonProperties.b();
                this.osVersion = commonProperties.a();
                this.deviceModel = commonProperties.e();
                this.platform = "Android";
            }

            @NotNull
            public final String getAppVersion() {
                return this.appVersion;
            }

            public final String getBuildType() {
                return this.buildType;
            }

            @NotNull
            public final ay.a getCommonProperties() {
                return this.commonProperties;
            }

            @NotNull
            public final ay.a getCommonPropertiesOverride() {
                return this.commonPropertiesOverride;
            }

            @NotNull
            public final String getCountry() {
                return this.country;
            }

            @NotNull
            public final String getDeviceModel() {
                return this.deviceModel;
            }

            @NotNull
            public final String getOsVersion() {
                return this.osVersion;
            }

            @NotNull
            public final String getPlatform() {
                return this.platform;
            }

            public final String getUserId() {
                return this.userId;
            }

            public Metadata(String str, ay.a aVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i13 & 2) != 0 ? new ay.b() : aVar);
            }
        }
    }
}
