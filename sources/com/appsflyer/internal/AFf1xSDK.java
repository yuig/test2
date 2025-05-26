package com.appsflyer.internal;

import android.annotation.SuppressLint;
import com.appsflyer.internal.AFf1uSDK.AnonymousClass3;
import com.appsflyer.internal.AFf1zSDK;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFf1xSDK {

    @NotNull
    public final AFd1pSDK AFAdRevenueData;

    @NotNull
    private final AFf1uSDK areAllFieldsValid;

    @NotNull
    private final AFg1gSDK component2;

    @NotNull
    private final AFg1qSDK component4;

    @NotNull
    private final ExecutorService getCurrencyIso4217Code;

    @NotNull
    public final AFg1bSDK getMediationNetwork;

    @NotNull
    private final AFd1nSDK getMonetizationNetwork;

    @NotNull
    public final AFd1oSDK getRevenue;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFf1wSDK;", "p0", "", "getMediationNetwork", "(Lcom/appsflyer/internal/AFf1wSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFf1xSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends s implements Function1<AFf1wSDK, Unit> {
        public AnonymousClass3() {
            super(1);
        }

        public final void getMediationNetwork(@NotNull AFf1wSDK aFf1wSDK) {
            Intrinsics.checkNotNullParameter(aFf1wSDK, "");
            if (aFf1wSDK == AFf1wSDK.SUCCESS) {
                AFf1xSDK.this.AFAdRevenueData.getRevenue("didSendRevenueTriggerOnLastBackground", true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMediationNetwork((AFf1wSDK) obj);
            return Unit.f80348a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFf1wSDK;", "p0", "", "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFf1wSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFf1xSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends s implements Function1<AFf1wSDK, Unit> {
        public static final AnonymousClass5 getMediationNetwork = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        public final void getMonetizationNetwork(@NotNull AFf1wSDK aFf1wSDK) {
            Intrinsics.checkNotNullParameter(aFf1wSDK, "");
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMonetizationNetwork((AFf1wSDK) obj);
            return Unit.f80348a;
        }
    }

    public AFf1xSDK(@NotNull AFd1pSDK aFd1pSDK, @NotNull AFd1oSDK aFd1oSDK, @NotNull AFd1nSDK aFd1nSDK, @NotNull ExecutorService executorService, @NotNull AFg1gSDK aFg1gSDK, @NotNull AFg1qSDK aFg1qSDK, @NotNull AFg1bSDK aFg1bSDK, @NotNull AFf1uSDK aFf1uSDK) {
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        Intrinsics.checkNotNullParameter(aFd1oSDK, "");
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(aFf1uSDK, "");
        this.AFAdRevenueData = aFd1pSDK;
        this.getRevenue = aFd1oSDK;
        this.getMonetizationNetwork = aFd1nSDK;
        this.getCurrencyIso4217Code = executorService;
        this.component2 = aFg1gSDK;
        this.component4 = aFg1qSDK;
        this.getMediationNetwork = aFg1bSDK;
        this.areAllFieldsValid = aFf1uSDK;
    }

    @SuppressLint({"NewApi"})
    public final void getMonetizationNetwork() {
        if (this.AFAdRevenueData.getMediationNetwork("didSendRevenueTriggerOnLastBackground", true)) {
            return;
        }
        getMonetizationNetwork(AFf1zSDK.AFa1ySDK.INSTANCE, new AnonymousClass3());
    }

    @SuppressLint({"NewApi"})
    public final void getMonetizationNetwork(@NotNull AFf1zSDK aFf1zSDK, @NotNull Function1<? super AFf1wSDK, Unit> function1) {
        Intrinsics.checkNotNullParameter(aFf1zSDK, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AFf1dSDK aFf1dSDK = new AFf1dSDK(aFf1zSDK, this.getCurrencyIso4217Code, this.getMonetizationNetwork, this.getRevenue, this.component2, this.component4, function1);
        AFf1uSDK aFf1uSDK = this.areAllFieldsValid;
        aFf1uSDK.getCurrencyIso4217Code.execute(aFf1uSDK.new AnonymousClass3(aFf1dSDK));
    }
}
