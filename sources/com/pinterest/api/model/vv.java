package com.pinterest.api.model;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0003\tBK\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0013\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R*\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\t\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/pinterest/api/model/vv;", "", "", "a", "I", "getVersion", "()I", "version", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "adapterEndpoint", "Lcom/pinterest/api/model/vv$b;", "c", "Lcom/pinterest/api/model/vv$b;", "d", "()Lcom/pinterest/api/model/vv$b;", "timeout", "", "Ljava/util/Map;", "()Ljava/util/Map;", "ids", "", "Lcom/pinterest/api/model/vv$a;", "e", "Ljava/util/List;", "()Ljava/util/List;", "endpoints", "<init>", "(ILjava/lang/String;Lcom/pinterest/api/model/vv$b;Ljava/util/Map;Ljava/util/List;)V", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class vv {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("version")
    private final int version;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("adapter_endpoint")
    private final String adapterEndpoint;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("timeouts")
    private final b timeout;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("ids")
    private final Map<String, String> ids;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("endpoints")
    private final List<a> endpoints;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/pinterest/api/model/vv$a;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "id", "", "I", "()I", "attempts", "<init>", "(Ljava/lang/String;I)V", "models_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @om.b("endpoint_id")
        private final String id;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @om.b("attempts")
        private final int attempts;

        public a(String str, int i13) {
            this.id = str;
            this.attempts = i13;
        }

        /* renamed from: a, reason: from getter */
        public final int getAttempts() {
            return this.attempts;
        }

        /* renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.id, aVar.id) && this.attempts == aVar.attempts;
        }

        public final int hashCode() {
            String str = this.id;
            return Integer.hashCode(this.attempts) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "Endpoint(id=" + this.id + ", attempts=" + this.attempts + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/pinterest/api/model/vv$b;", "", "", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "absoluteTimeout", "<init>", "(Ljava/lang/Long;)V", "models_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @om.b("absolute_timeout")
        private final Long absoluteTimeout;

        public b(Long l13) {
            this.absoluteTimeout = l13;
        }

        /* renamed from: a, reason: from getter */
        public final Long getAbsoluteTimeout() {
            return this.absoluteTimeout;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.absoluteTimeout, ((b) obj).absoluteTimeout);
        }

        public final int hashCode() {
            Long l13 = this.absoluteTimeout;
            if (l13 == null) {
                return 0;
            }
            return l13.hashCode();
        }

        public final String toString() {
            return "Timeout(absoluteTimeout=" + this.absoluteTimeout + ")";
        }
    }

    public vv(int i13, String str, b bVar, Map<String, String> map, List<a> list) {
        this.version = i13;
        this.adapterEndpoint = str;
        this.timeout = bVar;
        this.ids = map;
        this.endpoints = list;
    }

    /* renamed from: a, reason: from getter */
    public final String getAdapterEndpoint() {
        return this.adapterEndpoint;
    }

    /* renamed from: b, reason: from getter */
    public final List getEndpoints() {
        return this.endpoints;
    }

    /* renamed from: c, reason: from getter */
    public final Map getIds() {
        return this.ids;
    }

    /* renamed from: d, reason: from getter */
    public final b getTimeout() {
        return this.timeout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv)) {
            return false;
        }
        vv vvVar = (vv) obj;
        return this.version == vvVar.version && Intrinsics.d(this.adapterEndpoint, vvVar.adapterEndpoint) && Intrinsics.d(this.timeout, vvVar.timeout) && Intrinsics.d(this.ids, vvVar.ids) && Intrinsics.d(this.endpoints, vvVar.endpoints);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.version) * 31;
        String str = this.adapterEndpoint;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.timeout;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Map<String, String> map = this.ids;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        List<a> list = this.endpoints;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        int i13 = this.version;
        String str = this.adapterEndpoint;
        b bVar = this.timeout;
        Map<String, String> map = this.ids;
        List<a> list = this.endpoints;
        StringBuilder sb3 = new StringBuilder("MetricsConfiguration(version=");
        sb3.append(i13);
        sb3.append(", adapterEndpoint=");
        sb3.append(str);
        sb3.append(", timeout=");
        sb3.append(bVar);
        sb3.append(", ids=");
        sb3.append(map);
        sb3.append(", endpoints=");
        return a.c.j(sb3, list, ")");
    }
}
