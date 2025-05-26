package org.chromium.net;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.DnsOptions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g extends ICronetEngineBuilder {

    /* renamed from: d, reason: collision with root package name */
    public static final Set f97336d = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 3)));

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f97337a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f97338b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ICronetEngineBuilder f97339c;

    public g(ICronetEngineBuilder iCronetEngineBuilder) {
        this.f97339c = iCronetEngineBuilder;
    }

    public static JSONObject a(String str, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            try {
                jSONObject.put(str, optJSONObject);
            } catch (JSONException e13) {
                throw new IllegalArgumentException(a.a.k("Failed adding a default object for key [", str, "]"), e13);
            }
        }
        return optJSONObject;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z13, Date date) {
        this.f97339c.addPublicKeyPins(str, set, z13, date);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addQuicHint(String str, int i13, int i14) {
        this.f97339c.addQuicHint(str, i13, i14);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        JSONObject jSONObject = this.f97337a;
        ArrayList arrayList = this.f97338b;
        ICronetEngineBuilder iCronetEngineBuilder = this.f97339c;
        if (jSONObject == null && arrayList.isEmpty()) {
            return iCronetEngineBuilder.build();
        }
        if (this.f97337a == null) {
            this.f97337a = new JSONObject();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((f) it.next()).a(this.f97337a);
            } catch (JSONException e13) {
                throw new IllegalStateException("Unable to apply JSON patch!", e13);
            }
        }
        iCronetEngineBuilder.setExperimentalOptions(this.f97337a.toString());
        return iCronetEngineBuilder.build();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableBrotli(boolean z13) {
        this.f97339c.enableBrotli(z13);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttp2(boolean z13) {
        this.f97339c.enableHttp2(z13);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttpCache(int i13, long j13) {
        this.f97339c.enableHttpCache(i13, j13);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableNetworkQualityEstimator(boolean z13) {
        this.f97339c.enableNetworkQualityEstimator(z13);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z13) {
        this.f97339c.enablePublicKeyPinningBypassForLocalTrustAnchors(z13);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableQuic(boolean z13) {
        this.f97339c.enableQuic(z13);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableSdch(boolean z13) {
        this.f97339c.enableSdch(z13);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return this.f97339c.getDefaultUserAgent();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final Set getSupportedConfigOptions() {
        return f97336d;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setConnectionMigrationOptions(ConnectionMigrationOptions connectionMigrationOptions) {
        ICronetEngineBuilder iCronetEngineBuilder = this.f97339c;
        if (iCronetEngineBuilder.getSupportedConfigOptions().contains(1)) {
            iCronetEngineBuilder.setConnectionMigrationOptions(connectionMigrationOptions);
            return this;
        }
        this.f97338b.add(new e(connectionMigrationOptions, 0));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setDnsOptions(final DnsOptions dnsOptions) {
        ICronetEngineBuilder iCronetEngineBuilder = this.f97339c;
        if (iCronetEngineBuilder.getSupportedConfigOptions().contains(2)) {
            iCronetEngineBuilder.setDnsOptions(dnsOptions);
            return this;
        }
        this.f97338b.add(new f() { // from class: org.chromium.net.d
            @Override // org.chromium.net.f
            public final void a(JSONObject jSONObject) {
                JSONObject a13 = g.a("AsyncDNS", jSONObject);
                DnsOptions dnsOptions2 = DnsOptions.this;
                if (dnsOptions2.getUseBuiltInDnsResolver() != null) {
                    a13.put("enable", dnsOptions2.getUseBuiltInDnsResolver());
                }
                JSONObject a14 = g.a("StaleDNS", jSONObject);
                if (dnsOptions2.getEnableStaleDns() != null) {
                    a14.put("enable", dnsOptions2.getEnableStaleDns());
                }
                if (dnsOptions2.getPersistHostCache() != null) {
                    a14.put("persist_to_disk", dnsOptions2.getPersistHostCache());
                }
                if (dnsOptions2.getPersistHostCachePeriodMillis() != null) {
                    a14.put("persist_delay_ms", dnsOptions2.getPersistHostCachePeriodMillis());
                }
                if (dnsOptions2.getStaleDnsOptions() != null) {
                    DnsOptions.StaleDnsOptions staleDnsOptions = dnsOptions2.getStaleDnsOptions();
                    if (staleDnsOptions.getAllowCrossNetworkUsage() != null) {
                        a14.put("allow_other_network", staleDnsOptions.getAllowCrossNetworkUsage());
                    }
                    if (staleDnsOptions.getFreshLookupTimeoutMillis() != null) {
                        a14.put("delay_ms", staleDnsOptions.getFreshLookupTimeoutMillis());
                    }
                    if (staleDnsOptions.getUseStaleOnNameNotResolved() != null) {
                        a14.put("use_stale_on_name_not_resolved", staleDnsOptions.getUseStaleOnNameNotResolved());
                    }
                    if (staleDnsOptions.getMaxExpiredDelayMillis() != null) {
                        a14.put("max_expired_time_ms", staleDnsOptions.getMaxExpiredDelayMillis());
                    }
                }
                JSONObject a15 = g.a("QUIC", jSONObject);
                if (dnsOptions2.getPreestablishConnectionsToStaleDnsResults() != null) {
                    a15.put("race_stale_dns_on_connection", dnsOptions2.getPreestablishConnectionsToStaleDnsResults());
                }
            }
        });
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setExperimentalOptions(String str) {
        if (str == null || str.isEmpty()) {
            this.f97337a = null;
        } else {
            try {
                this.f97337a = new JSONObject(str);
            } catch (JSONException e13) {
                throw new IllegalArgumentException("Experimental options parsing failed", e13);
            }
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        this.f97339c.setLibraryLoader(libraryLoader);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setQuicOptions(QuicOptions quicOptions) {
        ICronetEngineBuilder iCronetEngineBuilder = this.f97339c;
        if (iCronetEngineBuilder.getSupportedConfigOptions().contains(3)) {
            iCronetEngineBuilder.setQuicOptions(quicOptions);
            return this;
        }
        this.f97338b.add(new e(quicOptions, 1));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setStoragePath(String str) {
        this.f97339c.setStoragePath(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setThreadPriority(int i13) {
        this.f97339c.setThreadPriority(i13);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setUserAgent(String str) {
        this.f97339c.setUserAgent(str);
        return this;
    }
}
