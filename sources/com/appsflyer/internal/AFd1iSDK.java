package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFd1iSDK implements AFd1gSDK {
    private static final int getMediationNetwork = (int) TimeUnit.SECONDS.toMillis(30);
    private ExecutorService AFAdRevenueData;
    private AFd1bSDK AFInAppEventParameterName;
    private AFe1eSDK AFInAppEventType;
    private AFj1lSDK AFKeystoreWrapper;
    private AFc1kSDK AFLogger;
    private AFf1xSDK afDebugLog;
    private AFg1oSDK afErrorLog;
    private AFc1fSDK afInfoLog;
    private AFg1mSDK afLogForce;
    private AFi1eSDK afRDLog;
    private AFg1bSDK afVerboseLog;
    private AFe1tSDK areAllFieldsValid;
    private PurchaseHandler component1;
    private AFd1nSDK component2;
    private AFd1sSDK component3;
    private AFg1vSDK component4;
    private AFj1iSDK copy;
    private AFh1jSDK copydefault;

    /* renamed from: d, reason: collision with root package name */
    private AFi1lSDK f29084d;

    /* renamed from: e, reason: collision with root package name */
    private AFd1wSDK f29085e;
    private AFb1gSDK equals;
    private AFc1gSDK force;
    private ExecutorService getCurrencyIso4217Code;
    private AFd1lSDK getLevel;
    private ScheduledExecutorService getMonetizationNetwork;
    private AFg1gSDK hashCode;

    /* renamed from: i, reason: collision with root package name */
    private AFh1qSDK f29086i;
    private AFd1rSDK registerClient;
    private AFf1uSDK toString;
    private AFi1gSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private AFa1aSDK f29087v;
    private AFg1qSDK valueOf;
    private AFb1rSDK values;

    /* renamed from: w, reason: collision with root package name */
    private AFi1jSDK f29088w;
    private String afWarnLog = null;
    public final AFd1oSDK getRevenue = new AFd1oSDK();

    public static class AFa1zSDK implements ThreadFactory {
        private static final AtomicInteger getMediationNetwork = new AtomicInteger();
        private final AtomicInteger getCurrencyIso4217Code = new AtomicInteger();

        public AFa1zSDK() {
            getMediationNetwork.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i13 = getMediationNetwork.get();
            int incrementAndGet = this.getCurrencyIso4217Code.incrementAndGet();
            StringBuilder sb3 = new StringBuilder("queue-");
            sb3.append(i13);
            sb3.append("-");
            sb3.append(incrementAndGet);
            return new Thread(runnable, sb3.toString());
        }
    }

    @NonNull
    private synchronized AFg1mSDK AFLoggerLogLevel() {
        try {
            if (this.afLogForce == null) {
                this.afLogForce = new AFg1mSDK(AFInAppEventType(), getMonetizationNetwork());
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.afLogForce;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    /* renamed from: afErrorLogForExcManagerOnly, reason: merged with bridge method [inline-methods] */
    public synchronized AFd1bSDK afErrorLog() {
        try {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = new AFd1bSDK(this);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.AFInAppEventParameterName;
    }

    @NonNull
    private String afRDLog() {
        if (this.afWarnLog == null) {
            this.afWarnLog = new AFb1cSDK().getMonetizationNetwork();
        }
        return this.afWarnLog;
    }

    @NonNull
    private synchronized AFe1tSDK afWarnLog() {
        try {
            if (this.areAllFieldsValid == null) {
                this.areAllFieldsValid = new AFe1tSDK(new AFe1oSDK(getMediationNetwork), getMediationNetwork());
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.areAllFieldsValid;
    }

    @NonNull
    private synchronized ExecutorService getLevel() {
        try {
            if (this.getCurrencyIso4217Code == null) {
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
                this.getCurrencyIso4217Code = newSingleThreadExecutor;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.getCurrencyIso4217Code;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SharedPreferences u_() {
        Context context = this.getRevenue.getMonetizationNetwork;
        if (context != null) {
            return AFb1tSDK.h_(context);
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final AFe1sSDK AFAdRevenueData() {
        return new AFe1sSDK(afWarnLog(), getMonetizationNetwork(), AppsFlyerProperties.getInstance(), values());
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final synchronized AFj1lSDK AFInAppEventParameterName() {
        try {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = new AFj1lSDK(this);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final synchronized AFd1oSDK AFInAppEventType() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final synchronized AFg1qSDK AFKeystoreWrapper() {
        try {
            if (this.valueOf == null) {
                this.valueOf = new AFg1qSDK(AFInAppEventType(), new AFg1nSDK());
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.valueOf;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final AFi1gSDK AFLogger() {
        if (this.unregisterClient == null) {
            this.unregisterClient = new AFi1bSDK();
        }
        return this.unregisterClient;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final AFc1gSDK afDebugLog() {
        if (this.force == null) {
            this.force = new AFc1iSDK(component2());
        }
        return this.force;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final AFh1qSDK afInfoLog() {
        if (this.f29086i == null) {
            this.f29086i = new AFh1oSDK(this);
        }
        return this.f29086i;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final AFd1ySDK afVerboseLog() {
        if (this.getLevel == null) {
            this.getLevel = new AFd1lSDK();
        }
        return new AFd1xSDK(this.getLevel, AFInAppEventType(), AFKeystoreWrapper());
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final synchronized PurchaseHandler areAllFieldsValid() {
        try {
            if (this.component1 == null) {
                this.component1 = new PurchaseHandler(this);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.component1;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final AFg1gSDK component1() {
        if (this.hashCode == null) {
            String afRDLog = afRDLog();
            Context context = this.getRevenue.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.unregisterClient == null) {
                this.unregisterClient = new AFi1bSDK();
            }
            AFi1gSDK aFi1gSDK = this.unregisterClient;
            if (this.registerClient == null) {
                this.registerClient = new AFa1tSDK();
            }
            AFd1rSDK aFd1rSDK = this.registerClient;
            if (this.copy == null) {
                Context context2 = this.getRevenue.getMonetizationNetwork;
                if (context2 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.copy = new AFj1jSDK(context2, getLevel());
            }
            AFj1iSDK aFj1iSDK = this.copy;
            if (this.f29087v == null) {
                this.f29087v = new AFb1zSDK();
            }
            AFa1aSDK aFa1aSDK = this.f29087v;
            AFh1jSDK component4 = component4();
            AFd1pSDK component2 = component2();
            AFd1nSDK monetizationNetwork = getMonetizationNetwork();
            if (this.f29084d == null) {
                Context context3 = this.getRevenue.getMonetizationNetwork;
                if (context3 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.f29084d = new AFi1lSDK(context3);
            }
            AFi1lSDK aFi1lSDK = this.f29084d;
            AFg1qSDK AFKeystoreWrapper = AFKeystoreWrapper();
            AFd1oSDK AFInAppEventType = AFInAppEventType();
            AFg1mSDK AFLoggerLogLevel = AFLoggerLogLevel();
            if (this.getLevel == null) {
                this.getLevel = new AFd1lSDK();
            }
            this.hashCode = new AFg1fSDK(afRDLog, context, aFi1gSDK, aFd1rSDK, aFj1iSDK, aFa1aSDK, component4, component2, monetizationNetwork, aFi1lSDK, AFKeystoreWrapper, AFInAppEventType, AFLoggerLogLevel, this.getLevel);
        }
        return this.hashCode;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final AFd1pSDK component2() {
        if (this.component3 == null) {
            this.component3 = new AFd1sSDK(new AFd1jSDK(new Function0() { // from class: com.appsflyer.internal.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    SharedPreferences u_;
                    u_ = AFd1iSDK.this.u_();
                    return u_;
                }
            }));
        }
        return this.component3;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final synchronized AFg1vSDK component3() {
        try {
            if (this.component4 == null) {
                AFg1rSDK aFg1rSDK = new AFg1rSDK(component2());
                this.component4 = new AFg1vSDK(new AFg1uSDK(), getMonetizationNetwork(), AFKeystoreWrapper(), aFg1rSDK, new AFe1sSDK(afWarnLog(), getMonetizationNetwork(), AppsFlyerProperties.getInstance(), values()), new AFg1pSDK(getMonetizationNetwork(), aFg1rSDK), copy());
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.component4;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final synchronized AFh1jSDK component4() {
        try {
            if (this.copydefault == null) {
                this.copydefault = new AFh1jSDK(component2());
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.copydefault;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final synchronized AFf1uSDK copy() {
        try {
            if (this.toString == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFd1iSDK.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                    /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
                    public boolean offer(Runnable runnable) {
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, new AFa1zSDK());
                threadPoolExecutor.setRejectedExecutionHandler(new i());
                this.toString = new AFf1uSDK(threadPoolExecutor);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.toString;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final synchronized AFb1gSDK copydefault() {
        try {
            if (this.equals == null) {
                this.equals = new AFb1hSDK(this);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.equals;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final AFi1jSDK d() {
        if (this.f29088w == null) {
            this.f29088w = new AFi1fSDK();
        }
        return this.f29088w;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final AFi1lSDK e() {
        if (this.f29084d == null) {
            Context context = this.getRevenue.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.f29084d = new AFi1lSDK(context);
        }
        return this.f29084d;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final AFj1iSDK equals() {
        if (this.copy == null) {
            Context context = this.getRevenue.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.copy = new AFj1jSDK(context, getLevel());
        }
        return this.copy;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final AFg1oSDK force() {
        if (this.afErrorLog == null) {
            Context context = this.getRevenue.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            AFg1jSDK aFg1jSDK = new AFg1jSDK(context, AppsFlyerProperties.getInstance());
            if (this.getLevel == null) {
                this.getLevel = new AFd1lSDK();
            }
            this.afErrorLog = new AFg1lSDK(aFg1jSDK, this.getLevel, AppsFlyerProperties.getInstance());
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final AFf1xSDK getCurrencyIso4217Code() {
        if (this.afDebugLog == null) {
            AFd1pSDK component2 = component2();
            AFd1oSDK AFInAppEventType = AFInAppEventType();
            AFd1nSDK monetizationNetwork = getMonetizationNetwork();
            ExecutorService mediationNetwork = getMediationNetwork();
            AFg1gSDK component1 = component1();
            AFg1qSDK AFKeystoreWrapper = AFKeystoreWrapper();
            if (this.afVerboseLog == null) {
                this.afVerboseLog = new AFh1zSDK(new AFh1ySDK(component2()));
            }
            this.afDebugLog = new AFf1xSDK(component2, AFInAppEventType, monetizationNetwork, mediationNetwork, component1, AFKeystoreWrapper, this.afVerboseLog, copy());
        }
        return this.afDebugLog;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final synchronized ExecutorService getMediationNetwork() {
        try {
            if (this.AFAdRevenueData == null) {
                this.AFAdRevenueData = new AFd1qSDK(0, 5, 60L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final synchronized AFd1nSDK getMonetizationNetwork() {
        try {
            if (this.component2 == null) {
                AFd1oSDK AFInAppEventType = AFInAppEventType();
                AFd1pSDK component2 = component2();
                if (this.getLevel == null) {
                    this.getLevel = new AFd1lSDK();
                }
                this.component2 = new AFd1nSDK(AFInAppEventType, component2, this.getLevel, getMediationNetwork());
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.component2;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final synchronized ScheduledExecutorService getRevenue() {
        try {
            if (this.getMonetizationNetwork == null) {
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(2);
                Intrinsics.checkNotNullExpressionValue(newScheduledThreadPool, "");
                this.getMonetizationNetwork = newScheduledThreadPool;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.getMonetizationNetwork;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final AFd1lSDK i() {
        if (this.getLevel == null) {
            this.getLevel = new AFd1lSDK();
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final synchronized AFc1kSDK registerClient() {
        try {
            if (this.AFLogger == null) {
                this.AFLogger = new AFc1kSDK(this);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.AFLogger;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final synchronized AFc1fSDK unregisterClient() {
        try {
            if (this.afInfoLog == null) {
                this.afInfoLog = new AFc1eSDK(AFInAppEventType());
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final AFi1eSDK v() {
        try {
            if (this.afRDLog == null) {
                try {
                    Object[] objArr = {getMonetizationNetwork(), AFInAppEventType(), AFKeystoreWrapper()};
                    Map map = AFi1dSDK.registerClient;
                    Object obj = map.get(-1916847760);
                    if (obj == null) {
                        obj = ((Class) AFi1dSDK.AFAdRevenueData((char) TextUtils.getCapsMode("", 0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37)).getDeclaredConstructor(AFd1nSDK.class, AFd1oSDK.class, AFg1qSDK.class);
                        map.put(-1916847760, obj);
                    }
                    this.afRDLog = (AFi1eSDK) ((Constructor) obj).newInstance(objArr);
                } catch (Throwable th3) {
                    Throwable cause = th3.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            AFLogger.INSTANCE.e(AFh1sSDK.PLAY_INTEGRITY_API, th4.getMessage() != null ? th4.getMessage() : "", th4, false, false);
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final synchronized AFb1rSDK valueOf() {
        try {
            if (this.values == null) {
                this.values = new AFb1lSDK(AFInAppEventType());
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.values;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final synchronized AFe1eSDK values() {
        try {
            if (this.AFInAppEventType == null) {
                this.AFInAppEventType = new AFe1eSDK(getMonetizationNetwork(), component2());
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NonNull
    public final AFd1wSDK w() {
        if (this.f29085e == null) {
            ExecutorService level = getLevel();
            ScheduledExecutorService revenue = getRevenue();
            AFc1kSDK registerClient = registerClient();
            if (this.f29088w == null) {
                this.f29088w = new AFi1fSDK();
            }
            this.f29085e = new AFd1vSDK(level, revenue, registerClient, this.f29088w);
        }
        return this.f29085e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getCurrencyIso4217Code(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e13) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e13);
            Thread.currentThread().interrupt();
        }
    }
}
