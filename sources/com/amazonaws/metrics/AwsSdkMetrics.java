package com.amazonaws.metrics;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.MetricCollector;
import com.amazonaws.regions.Regions;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSServiceMetrics;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public enum AwsSdkMetrics {
    ;

    public static final String AWS_CREDENTAIL_PROPERTIES_FILE = "credentialFile";
    public static final String CLOUDWATCH_REGION = "cloudwatchRegion";
    private static final boolean DEFAULT_METRICS_ENABLED;
    private static final String DEFAULT_METRIC_COLLECTOR_FACTORY = "com.amazonaws.metrics.internal.cloudwatch.DefaultMetricCollectorFactory";
    public static final String DEFAULT_METRIC_NAMESPACE = "AWSSDK/Java";
    public static final String EXCLUDE_MACHINE_METRICS = "excludeMachineMetrics";
    public static final String HOST_METRIC_NAME = "hostMetricName";
    public static final String INCLUDE_PER_HOST_METRICS = "includePerHostMetrics";
    public static final String JVM_METRIC_NAME = "jvmMetricName";
    private static final String MBEAN_OBJECT_NAME = "com.amazonaws.management:type=AwsSdkMetrics";
    public static final String METRIC_NAME_SPACE = "metricNameSpace";
    public static final String METRIC_QUEUE_SIZE = "metricQueueSize";
    public static final String QUEUE_POLL_TIMEOUT_MILLI = "getQueuePollTimeoutMilli";
    private static final int QUEUE_POLL_TIMEOUT_MILLI_MINUMUM = 1000;
    private static final MetricRegistry REGISTRY;
    public static final String USE_SINGLE_METRIC_NAMESPACE = "useSingleMetricNamespace";
    private static volatile String credentialFile = null;
    private static volatile AWSCredentialsProvider credentialProvider = null;
    private static boolean dirtyEnabling = false;
    private static volatile String hostMetricName = null;
    private static volatile String jvmMetricName = null;
    private static volatile boolean machineMetricsExcluded = false;

    /* renamed from: mc, reason: collision with root package name */
    private static volatile MetricCollector f28628mc = null;
    private static volatile String metricNameSpace = "AWSSDK/Java";
    private static volatile Integer metricQueueSize;
    private static volatile boolean perHostMetricsIncluded;
    private static volatile Long queuePollTimeoutMilli;
    private static volatile Regions region;
    private static volatile boolean singleMetricNamespace;

    public static class MetricRegistry {

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f28630a;

        /* renamed from: b, reason: collision with root package name */
        public volatile Set f28631b;

        public MetricRegistry() {
            HashSet hashSet = new HashSet();
            this.f28630a = hashSet;
            hashSet.add(AWSRequestMetrics.Field.ClientExecuteTime);
            hashSet.add(AWSRequestMetrics.Field.Exception);
            hashSet.add(AWSRequestMetrics.Field.HttpClientRetryCount);
            hashSet.add(AWSRequestMetrics.Field.HttpRequestTime);
            hashSet.add(AWSRequestMetrics.Field.RequestCount);
            hashSet.add(AWSRequestMetrics.Field.RetryCount);
            hashSet.add(AWSRequestMetrics.Field.HttpClientSendRequestTime);
            hashSet.add(AWSRequestMetrics.Field.HttpClientReceiveResponseTime);
            hashSet.add(AWSServiceMetrics.HttpClientGetConnectionTime);
            a();
        }

        public final void a() {
            this.f28631b = Collections.unmodifiableSet(new HashSet(this.f28630a));
        }
    }

    static {
        String property = System.getProperty("com.amazonaws.sdk.enableDefaultMetrics");
        boolean z13 = property != null;
        DEFAULT_METRICS_ENABLED = z13;
        if (z13) {
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            for (String str : property.split(",")) {
                String trim = str.trim();
                if (!z14 && EXCLUDE_MACHINE_METRICS.equals(trim)) {
                    z14 = true;
                } else if (!z15 && INCLUDE_PER_HOST_METRICS.equals(trim)) {
                    z15 = true;
                } else if (z16 || !USE_SINGLE_METRIC_NAMESPACE.equals(trim)) {
                    String[] split = trim.split("=");
                    if (split.length == 2) {
                        String trim2 = split[0].trim();
                        String trim3 = split[1].trim();
                        try {
                            if (AWS_CREDENTAIL_PROPERTIES_FILE.equals(trim2)) {
                                setCredentialFile0(trim3);
                            } else if (CLOUDWATCH_REGION.equals(trim2)) {
                                region = Regions.fromName(trim3);
                            } else if (METRIC_QUEUE_SIZE.equals(trim2)) {
                                Integer num = new Integer(trim3);
                                if (num.intValue() < 1) {
                                    throw new IllegalArgumentException("metricQueueSize must be at least 1");
                                }
                                metricQueueSize = num;
                            } else if (QUEUE_POLL_TIMEOUT_MILLI.equals(trim2)) {
                                Long l13 = new Long(trim3);
                                if (l13.intValue() < QUEUE_POLL_TIMEOUT_MILLI_MINUMUM) {
                                    throw new IllegalArgumentException("getQueuePollTimeoutMilli must be at least 1000");
                                }
                                queuePollTimeoutMilli = l13;
                            } else if (METRIC_NAME_SPACE.equals(trim2)) {
                                metricNameSpace = trim3;
                            } else if (JVM_METRIC_NAME.equals(trim2)) {
                                jvmMetricName = trim3;
                            } else if (HOST_METRIC_NAME.equals(trim2)) {
                                hostMetricName = trim3;
                            } else {
                                LogFactory.a(AwsSdkMetrics.class).f("Ignoring unrecognized parameter: " + trim);
                            }
                        } catch (Exception e13) {
                            LogFactory.a(AwsSdkMetrics.class).a("Ignoring failure", e13);
                        }
                    } else {
                        continue;
                    }
                } else {
                    z16 = true;
                }
            }
            machineMetricsExcluded = z14;
            perHostMetricsIncluded = z15;
            singleMetricNamespace = z16;
        }
        REGISTRY = new MetricRegistry();
    }

    public static boolean add(MetricType metricType) {
        boolean add;
        if (metricType == null) {
            return false;
        }
        MetricRegistry metricRegistry = REGISTRY;
        synchronized (metricRegistry.f28630a) {
            try {
                add = metricRegistry.f28630a.add(metricType);
                if (add) {
                    metricRegistry.a();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return add;
    }

    public static <T extends MetricType> boolean addAll(Collection<T> collection) {
        boolean addAll;
        if (collection == null || collection.size() == 0) {
            return false;
        }
        MetricRegistry metricRegistry = REGISTRY;
        synchronized (metricRegistry.f28630a) {
            try {
                addAll = metricRegistry.f28630a.addAll(collection);
                if (addAll) {
                    metricRegistry.a();
                }
            } finally {
            }
        }
        return addAll;
    }

    public static void disableMetrics() {
        setMetricCollector(MetricCollector.f28635a);
    }

    public static synchronized boolean enableDefaultMetrics() {
        synchronized (AwsSdkMetrics.class) {
            try {
                if (f28628mc != null) {
                    f28628mc.getClass();
                }
                if (dirtyEnabling) {
                    throw new IllegalStateException("Reentrancy is not allowed");
                }
                dirtyEnabling = true;
                try {
                    try {
                        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(Class.forName(DEFAULT_METRIC_COLLECTOR_FACTORY).newInstance());
                        throw null;
                    } finally {
                        dirtyEnabling = false;
                    }
                } catch (Exception e13) {
                    LogFactory.a(AwsSdkMetrics.class).j("Failed to enable the default metrics", e13);
                    return false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static String getCredentailFile() {
        return credentialFile;
    }

    public static AWSCredentialsProvider getCredentialProvider() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getClassName().equals(DEFAULT_METRIC_COLLECTOR_FACTORY)) {
                return credentialProvider;
            }
        }
        SecurityException securityException = new SecurityException();
        LogFactory.a(AwsSdkMetrics.class).j("Illegal attempt to access the credential provider", securityException);
        throw securityException;
    }

    public static String getHostMetricName() {
        return hostMetricName;
    }

    public static MetricCollector getInternalMetricCollector() {
        return f28628mc;
    }

    public static String getJvmMetricName() {
        return jvmMetricName;
    }

    public static <T extends MetricCollector> T getMetricCollector() {
        if (f28628mc == null && isDefaultMetricsEnabled()) {
            enableDefaultMetrics();
        }
        return f28628mc == null ? (T) MetricCollector.f28635a : (T) f28628mc;
    }

    public static String getMetricNameSpace() {
        return metricNameSpace;
    }

    public static Integer getMetricQueueSize() {
        return metricQueueSize;
    }

    public static Set<MetricType> getPredefinedMetrics() {
        return REGISTRY.f28631b;
    }

    public static Long getQueuePollTimeoutMilli() {
        return queuePollTimeoutMilli;
    }

    public static Regions getRegion() {
        return region;
    }

    public static <T extends RequestMetricCollector> T getRequestMetricCollector() {
        if (f28628mc == null && isDefaultMetricsEnabled()) {
            enableDefaultMetrics();
        }
        if (f28628mc == null) {
            return (T) RequestMetricCollector.f28637a;
        }
        ((MetricCollector.AnonymousClass1) f28628mc).getClass();
        return (T) RequestMetricCollector.f28637a;
    }

    public static <T extends ServiceMetricCollector> T getServiceMetricCollector() {
        if (f28628mc == null && isDefaultMetricsEnabled()) {
            enableDefaultMetrics();
        }
        if (f28628mc == null) {
            return (T) ServiceMetricCollector.f28638a;
        }
        ((MetricCollector.AnonymousClass1) f28628mc).getClass();
        return (T) ServiceMetricCollector.f28638a;
    }

    public static boolean isDefaultMetricsEnabled() {
        return DEFAULT_METRICS_ENABLED;
    }

    public static boolean isMachineMetricExcluded() {
        return machineMetricsExcluded;
    }

    public static boolean isMetricsEnabled() {
        return false;
    }

    public static boolean isPerHostMetricEnabled() {
        if (perHostMetricsIncluded) {
            return true;
        }
        String str = hostMetricName;
        return (str == null ? "" : str.trim()).length() > 0;
    }

    public static boolean isPerHostMetricIncluded() {
        return perHostMetricsIncluded;
    }

    public static boolean isSingleMetricNamespace() {
        return singleMetricNamespace;
    }

    public static boolean remove(MetricType metricType) {
        boolean remove;
        if (metricType == null) {
            return false;
        }
        MetricRegistry metricRegistry = REGISTRY;
        synchronized (metricRegistry.f28630a) {
            try {
                remove = metricRegistry.f28630a.remove(metricType);
                if (remove) {
                    metricRegistry.a();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return remove;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x000e, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
    
        throw r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T extends com.amazonaws.metrics.MetricType> void set(java.util.Collection<T> r4) {
        /*
            com.amazonaws.metrics.AwsSdkMetrics$MetricRegistry r0 = com.amazonaws.metrics.AwsSdkMetrics.REGISTRY
            java.util.HashSet r1 = r0.f28630a
            monitor-enter(r1)
            if (r4 == 0) goto L10
            int r2 = r4.size()     // Catch: java.lang.Throwable -> Le
            if (r2 != 0) goto L20
            goto L10
        Le:
            r4 = move-exception
            goto L40
        L10:
            java.util.HashSet r2 = r0.f28630a     // Catch: java.lang.Throwable -> Le
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Le
            if (r2 != 0) goto L1a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            goto L3d
        L1a:
            if (r4 != 0) goto L20
            java.util.List r4 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> Le
        L20:
            java.util.HashSet r2 = r0.f28630a     // Catch: java.lang.Throwable -> Le
            r2.clear()     // Catch: java.lang.Throwable -> Le
            java.util.HashSet r2 = r0.f28630a     // Catch: java.lang.Throwable -> Le
            monitor-enter(r2)     // Catch: java.lang.Throwable -> Le
            java.util.HashSet r3 = r0.f28630a     // Catch: java.lang.Throwable -> L34
            boolean r4 = r3.addAll(r4)     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L36
            r0.a()     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r4 = move-exception
            goto L3e
        L36:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L3c
            r0.a()     // Catch: java.lang.Throwable -> Le
        L3c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
        L3d:
            return
        L3e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            throw r4     // Catch: java.lang.Throwable -> Le
        L40:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.metrics.AwsSdkMetrics.set(java.util.Collection):void");
    }

    public static void setCredentialFile(String str) {
        setCredentialFile0(str);
    }

    private static void setCredentialFile0(String str) {
        final PropertiesCredentials propertiesCredentials = new PropertiesCredentials(new File(str));
        synchronized (AwsSdkMetrics.class) {
            credentialProvider = new AWSCredentialsProvider() { // from class: com.amazonaws.metrics.AwsSdkMetrics.1
                @Override // com.amazonaws.auth.AWSCredentialsProvider
                public final AWSCredentials a() {
                    return PropertiesCredentials.this;
                }
            };
            credentialFile = str;
        }
    }

    public static synchronized void setCredentialProvider(AWSCredentialsProvider aWSCredentialsProvider) {
        synchronized (AwsSdkMetrics.class) {
            credentialProvider = aWSCredentialsProvider;
        }
    }

    public static void setHostMetricName(String str) {
        hostMetricName = str;
    }

    public static void setJvmMetricName(String str) {
        jvmMetricName = str;
    }

    public static void setMachineMetricsExcluded(boolean z13) {
        machineMetricsExcluded = z13;
    }

    public static synchronized void setMetricCollector(MetricCollector metricCollector) {
        synchronized (AwsSdkMetrics.class) {
            f28628mc = metricCollector;
        }
    }

    public static void setMetricNameSpace(String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException();
        }
        metricNameSpace = str;
    }

    public static void setMetricQueueSize(Integer num) {
        metricQueueSize = num;
    }

    public static void setPerHostMetricsIncluded(boolean z13) {
        perHostMetricsIncluded = z13;
    }

    public static void setQueuePollTimeoutMilli(Long l13) {
        queuePollTimeoutMilli = l13;
    }

    public static void setRegion(Regions regions) {
        region = regions;
    }

    public static void setSingleMetricNamespace(boolean z13) {
        singleMetricNamespace = z13;
    }
}
