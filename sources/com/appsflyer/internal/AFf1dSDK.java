package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFf1zSDK;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u001c\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\"\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010,"}, d2 = {"Lcom/appsflyer/internal/AFf1dSDK;", "Lcom/appsflyer/internal/AFe1aSDK;", "", "Lcom/appsflyer/internal/AFf1zSDK;", "p0", "Ljava/util/concurrent/Executor;", "p1", "Lcom/appsflyer/internal/AFd1nSDK;", "p2", "Lcom/appsflyer/internal/AFd1oSDK;", "p3", "Lcom/appsflyer/internal/AFg1gSDK;", "p4", "Lcom/appsflyer/internal/AFg1qSDK;", "p5", "Lkotlin/Function1;", "Lcom/appsflyer/internal/AFf1wSDK;", "p6", "<init>", "(Lcom/appsflyer/internal/AFf1zSDK;Ljava/util/concurrent/Executor;Lcom/appsflyer/internal/AFd1nSDK;Lcom/appsflyer/internal/AFd1oSDK;Lcom/appsflyer/internal/AFg1gSDK;Lcom/appsflyer/internal/AFg1qSDK;Lkotlin/jvm/functions/Function1;)V", "", "getMonetizationNetwork", "()J", "getCurrencyIso4217Code", "()Lcom/appsflyer/internal/AFf1wSDK;", "getMediationNetwork", "()V", "", "getRevenue", "()Z", "component1", "Ljava/util/concurrent/Executor;", "component4", "Lcom/appsflyer/internal/AFd1oSDK;", "component2", "Lcom/appsflyer/internal/AFf1zSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFg1gSDK;", "AFAdRevenueData", "component3", "Lcom/appsflyer/internal/AFd1nSDK;", "copy", "Lkotlin/jvm/functions/Function1;", "equals", "Lcom/appsflyer/internal/AFg1qSDK;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFf1dSDK extends AFe1aSDK<Unit> {

    /* renamed from: areAllFieldsValid, reason: from kotlin metadata */
    @NotNull
    public AFg1gSDK AFAdRevenueData;

    /* renamed from: component1, reason: from kotlin metadata */
    @NotNull
    public Executor getCurrencyIso4217Code;

    /* renamed from: component2, reason: from kotlin metadata */
    @NotNull
    public AFf1zSDK getMonetizationNetwork;

    /* renamed from: component3, reason: from kotlin metadata */
    @NotNull
    public AFd1nSDK getRevenue;

    /* renamed from: component4, reason: from kotlin metadata */
    @NotNull
    public AFd1oSDK getMediationNetwork;

    /* renamed from: copy, reason: from kotlin metadata */
    @NotNull
    public Function1<AFf1wSDK, Unit> component3;

    /* renamed from: equals, reason: from kotlin metadata */
    @NotNull
    public AFg1qSDK component2;

    public static final class AFa1ySDK implements OutcomeReceiver {
        private /* synthetic */ j0 getMediationNetwork;
        private /* synthetic */ AFf1dSDK getMonetizationNetwork;
        private /* synthetic */ CountDownLatch getRevenue;

        public AFa1ySDK(j0 j0Var, CountDownLatch countDownLatch, AFf1dSDK aFf1dSDK) {
            this.getMediationNetwork = j0Var;
            this.getRevenue = countDownLatch;
            this.getMonetizationNetwork = aFf1dSDK;
        }

        public final /* synthetic */ void onError(Throwable th3) {
            Exception exc = (Exception) th3;
            Intrinsics.checkNotNullParameter(exc, "");
            AFf1dSDK.getMediationNetwork(exc);
            this.getRevenue.countDown();
        }

        public final void onResult(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.getMediationNetwork.f80434a = AFf1wSDK.SUCCESS;
            AFLogger.INSTANCE.d(AFh1sSDK.PRIVACY_SANDBOX, "Privacy Sandbox trigger has been registered successfully. ", true);
            this.getRevenue.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFf1dSDK(@NotNull AFf1zSDK aFf1zSDK, @NotNull Executor executor, @NotNull AFd1nSDK aFd1nSDK, @NotNull AFd1oSDK aFd1oSDK, @NotNull AFg1gSDK aFg1gSDK, @NotNull AFg1qSDK aFg1qSDK, @NotNull Function1<? super AFf1wSDK, Unit> function1) {
        super(AFf1rSDK.REGISTER_TRIGGER, new AFf1rSDK[]{AFf1rSDK.RC_CDN, AFf1rSDK.FETCH_ADVERTISING_ID}, null);
        Intrinsics.checkNotNullParameter(aFf1zSDK, "");
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(aFd1oSDK, "");
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.getMonetizationNetwork = aFf1zSDK;
        this.getCurrencyIso4217Code = executor;
        this.getRevenue = aFd1nSDK;
        this.getMediationNetwork = aFd1oSDK;
        this.AFAdRevenueData = aFg1gSDK;
        this.component2 = aFg1qSDK;
        this.component3 = function1;
        if (aFf1zSDK instanceof AFf1zSDK.AFa1zSDK) {
            this.getMonetizationNetwork.add(AFf1rSDK.CONVERSION);
        }
        if (this.getMonetizationNetwork instanceof AFf1zSDK.AFa1ySDK) {
            this.getMediationNetwork.add(AFf1rSDK.CONVERSION);
        }
        if (this.getMonetizationNetwork instanceof AFf1zSDK.AFa1uSDK) {
            this.getMediationNetwork.add(AFf1rSDK.INAPP);
        }
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    @SuppressLint({"NewApi"})
    @NotNull
    public final AFf1wSDK getCurrencyIso4217Code() {
        MeasurementManager a13;
        j0 j0Var = new j0();
        j0Var.f80434a = AFf1wSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.getMediationNetwork.getMonetizationNetwork;
            if (context != null && (a13 = a.a(context.getSystemService(a.b()))) != null) {
                new AFj1bSDK(this.getRevenue, null, 2, null);
                Uri.Builder buildUpon = Uri.parse(AFj1bSDK.AFAdRevenueData()).buildUpon();
                String currencyIso4217Code = this.getRevenue.getCurrencyIso4217Code();
                if (currencyIso4217Code == null) {
                    currencyIso4217Code = "";
                }
                Context context2 = this.getRevenue.getRevenue.getMonetizationNetwork;
                LinkedHashMap h10 = z0.h(new Pair("event_name", this.getMonetizationNetwork.AFAdRevenueData), new Pair("app_id", this.getRevenue.getRevenue.getMonetizationNetwork.getPackageName()), new Pair("app_version", AFb1qSDK.getRevenue(context2, context2.getPackageName())), new Pair("sdk_version", AFd1nSDK.AFAdRevenueData()), new Pair("api_version", AFd1nSDK.getMonetizationNetwork()), new Pair("timestamp", String.valueOf(this.AFAdRevenueData.getMonetizationNetwork())), new Pair("request_id", AFd1nSDK.getRevenue()), new Pair("gaid", currencyIso4217Code));
                AFd1nSDK aFd1nSDK = this.getRevenue;
                String mediationNetwork = AFb1iSDK.getMediationNetwork(aFd1nSDK.getRevenue, aFd1nSDK.getCurrencyIso4217Code);
                if (mediationNetwork != null) {
                    h10.put("appsflyer_id", mediationNetwork);
                }
                Long revenue = this.AFAdRevenueData.getRevenue();
                if (revenue != null) {
                    h10.put("install_time", String.valueOf(revenue.longValue()));
                }
                AFf1zSDK aFf1zSDK = this.getMonetizationNetwork;
                if (aFf1zSDK instanceof AFf1zSDK.AFa1uSDK) {
                    Float f13 = ((AFf1zSDK.AFa1uSDK) aFf1zSDK).getMediationNetwork;
                    if (f13 != null) {
                        h10.put("event_revenue", String.valueOf(f13.floatValue()));
                    }
                    Integer num = ((AFf1zSDK.AFa1uSDK) this.getMonetizationNetwork).getRevenue;
                    if (num != null) {
                        h10.put("event_count", String.valueOf(num.intValue()));
                    }
                }
                for (Map.Entry entry : h10.entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri build = buildUpon.build();
                Intrinsics.checkNotNullExpressionValue(build, "");
                a13.registerTrigger(build, this.getCurrencyIso4217Code, new AFa1ySDK(j0Var, countDownLatch, this));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            j0Var.f80434a = AFf1wSDK.TIMEOUT;
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFh1sSDK.PRIVACY_SANDBOX, a.a.j("Error occurred: ", th3.getMessage()), th3, false, false, false, true);
        }
        return (AFf1wSDK) j0Var.f80434a;
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    public final void getMediationNetwork() {
        super.getMediationNetwork();
        AFf1wSDK aFf1wSDK = this.AFAdRevenueData;
        if (aFf1wSDK != null) {
            this.component3.invoke(aFf1wSDK);
        }
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    public final long getMonetizationNetwork() {
        return 20000L;
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    public final boolean getRevenue() {
        return false;
    }

    public static final /* synthetic */ void getMediationNetwork(Throwable th3) {
        AFLogger.INSTANCE.e(AFh1sSDK.PRIVACY_SANDBOX, a.a.j("Error occurred: ", th3.getMessage()), th3, false, false, false, true);
    }
}
