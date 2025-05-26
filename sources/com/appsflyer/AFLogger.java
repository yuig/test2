package com.appsflyer;

import com.appsflyer.internal.AFh1rSDK;
import com.appsflyer.internal.AFh1sSDK;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import xk2.d;
import xk2.k;
import xk2.m;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0013\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001;B\t\b\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ7\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u0017J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0017J#\u0010\u0011\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0011\u0010\u001bJ#\u0010\u001c\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ+\u0010\u001c\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001eJ+\u0010\u0011\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u001eJ3\u0010\u0011\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u001fJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0017J!\u0010\"\u001a\u00020\u00062\u0012\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010 \"\u00020\u0001¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u00020\u00062\u0012\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010 \"\u00020\u0001¢\u0006\u0004\b$\u0010#J'\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010)JG\u0010,\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010-J'\u0010.\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b.\u0010)J'\u0010/\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u0010)J'\u00100\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u0010)J\u001f\u00101\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u00102R\u001b\u00106\u001a\b\u0012\u0004\u0012\u00020\u0001038BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b4\u00105R\u0019\u00108\u001a\u0006*\u000207078BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b8\u00105"}, d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/internal/AFh1rSDK;", "", "logMessage", "", "shouldRemoteDebug", "", "afInfoLog", "(Ljava/lang/String;Z)V", "debugLogMessage", "afDebugLog", "message", "", "ex", "printMessage", "printThrowable", "shouldReportToExManager", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V", "warningLogMessage", "afWarnLog", "rdLogMessage", "afVerboseLog", "(Ljava/lang/String;)V", "afRDLog", "afLogForce", "errorLogMessage", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "afErrorLogForExcManagerOnly", "disableReporting", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V", "", "client", "registerClient", "([Lcom/appsflyer/internal/AFh1rSDK;)V", "unregisterClient", "Lcom/appsflyer/internal/AFh1sSDK;", "tag", "msg", "d", "(Lcom/appsflyer/internal/AFh1sSDK;Ljava/lang/String;Z)V", "throwable", "printMsg", "e", "(Lcom/appsflyer/internal/AFh1sSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "i", "w", "v", "force", "(Lcom/appsflyer/internal/AFh1sSDK;Ljava/lang/String;)V", "", "getCurrencyIso4217Code", "Lxk2/k;", "getMonetizationNetwork", "Ljava/util/concurrent/ExecutorService;", "getMediationNetwork", "<init>", "()V", "LogLevel"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AFLogger extends AFh1rSDK {

    @NotNull
    public static final AFLogger INSTANCE = new AFLogger();

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    private static final k getMonetizationNetwork = m.b(AnonymousClass6.AFAdRevenueData);

    @NotNull
    private static final k getMediationNetwork = m.b(AnonymousClass2.AFAdRevenueData);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1rSDK;", "p0", "", "AFAdRevenueData", "(Lcom/appsflyer/internal/AFh1rSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$1 */
    public static final class AnonymousClass1 extends s implements Function1<AFh1rSDK, Unit> {
        private /* synthetic */ boolean $AFAdRevenueData;
        private /* synthetic */ AFh1sSDK $getCurrencyIso4217Code;
        private /* synthetic */ String $getMediationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AFh1sSDK aFh1sSDK, String str, boolean z13) {
            super(1);
            this.$getCurrencyIso4217Code = aFh1sSDK;
            this.$getMediationNetwork = str;
            this.$AFAdRevenueData = z13;
        }

        public final void AFAdRevenueData(@NotNull AFh1rSDK aFh1rSDK) {
            Intrinsics.checkNotNullParameter(aFh1rSDK, "");
            aFh1rSDK.i(this.$getCurrencyIso4217Code, this.$getMediationNetwork, this.$AFAdRevenueData);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFAdRevenueData((AFh1rSDK) obj);
            return Unit.f80348a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1rSDK;", "p0", "", "getMediationNetwork", "(Lcom/appsflyer/internal/AFh1rSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$10 */
    public static final class AnonymousClass10 extends s implements Function1<AFh1rSDK, Unit> {
        private /* synthetic */ boolean $getCurrencyIso4217Code;
        private /* synthetic */ AFh1sSDK $getMediationNetwork;
        private /* synthetic */ String $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(AFh1sSDK aFh1sSDK, String str, boolean z13) {
            super(1);
            this.$getMediationNetwork = aFh1sSDK;
            this.$getMonetizationNetwork = str;
            this.$getCurrencyIso4217Code = z13;
        }

        public final void getMediationNetwork(@NotNull AFh1rSDK aFh1rSDK) {
            Intrinsics.checkNotNullParameter(aFh1rSDK, "");
            aFh1rSDK.w(this.$getMediationNetwork, this.$getMonetizationNetwork, this.$getCurrencyIso4217Code);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMediationNetwork((AFh1rSDK) obj);
            return Unit.f80348a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "getMediationNetwork", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$2 */
    public static final class AnonymousClass2 extends s implements Function0<ExecutorService> {
        public static final AnonymousClass2 AFAdRevenueData = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1rSDK;", "p0", "", "getRevenue", "(Lcom/appsflyer/internal/AFh1rSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$3 */
    public static final class AnonymousClass3 extends s implements Function1<AFh1rSDK, Unit> {
        private /* synthetic */ AFh1sSDK $AFAdRevenueData;
        private /* synthetic */ boolean $component1;
        private /* synthetic */ boolean $component2;
        private /* synthetic */ Throwable $getCurrencyIso4217Code;
        private /* synthetic */ boolean $getMediationNetwork;
        private /* synthetic */ String $getMonetizationNetwork;
        private /* synthetic */ boolean $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AFh1sSDK aFh1sSDK, String str, Throwable th3, boolean z13, boolean z14, boolean z15, boolean z16) {
            super(1);
            this.$AFAdRevenueData = aFh1sSDK;
            this.$getMonetizationNetwork = str;
            this.$getCurrencyIso4217Code = th3;
            this.$getRevenue = z13;
            this.$getMediationNetwork = z14;
            this.$component2 = z15;
            this.$component1 = z16;
        }

        public final void getRevenue(@NotNull AFh1rSDK aFh1rSDK) {
            Intrinsics.checkNotNullParameter(aFh1rSDK, "");
            aFh1rSDK.e(this.$AFAdRevenueData, this.$getMonetizationNetwork, this.$getCurrencyIso4217Code, this.$getRevenue, this.$getMediationNetwork, this.$component2, this.$component1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getRevenue((AFh1rSDK) obj);
            return Unit.f80348a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1rSDK;", "p0", "", "getRevenue", "(Lcom/appsflyer/internal/AFh1rSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$4 */
    public static final class AnonymousClass4 extends s implements Function1<AFh1rSDK, Unit> {
        private /* synthetic */ String $getCurrencyIso4217Code;
        private /* synthetic */ boolean $getMediationNetwork;
        private /* synthetic */ AFh1sSDK $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AFh1sSDK aFh1sSDK, String str, boolean z13) {
            super(1);
            this.$getRevenue = aFh1sSDK;
            this.$getCurrencyIso4217Code = str;
            this.$getMediationNetwork = z13;
        }

        public final void getRevenue(@NotNull AFh1rSDK aFh1rSDK) {
            Intrinsics.checkNotNullParameter(aFh1rSDK, "");
            aFh1rSDK.d(this.$getRevenue, this.$getCurrencyIso4217Code, this.$getMediationNetwork);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getRevenue((AFh1rSDK) obj);
            return Unit.f80348a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1rSDK;", "p0", "", "getRevenue", "(Lcom/appsflyer/internal/AFh1rSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$5 */
    public static final class AnonymousClass5 extends s implements Function1<AFh1rSDK, Unit> {
        private /* synthetic */ String $AFAdRevenueData;
        private /* synthetic */ AFh1sSDK $getCurrencyIso4217Code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(AFh1sSDK aFh1sSDK, String str) {
            super(1);
            this.$getCurrencyIso4217Code = aFh1sSDK;
            this.$AFAdRevenueData = str;
        }

        public final void getRevenue(@NotNull AFh1rSDK aFh1rSDK) {
            Intrinsics.checkNotNullParameter(aFh1rSDK, "");
            aFh1rSDK.force(this.$getCurrencyIso4217Code, this.$AFAdRevenueData);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getRevenue((AFh1rSDK) obj);
            return Unit.f80348a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\u0010\u0003\u001a\u001a\u0012\b\u0012\u0006*\u00020\u00010\u0001*\f\u0012\b\u0012\u0006*\u00020\u00010\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/appsflyer/internal/AFh1rSDK;", "", "AFAdRevenueData", "()Ljava/util/Set;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$6 */
    public static final class AnonymousClass6 extends s implements Function0<Set<AFh1rSDK>> {
        public static final AnonymousClass6 AFAdRevenueData = new AnonymousClass6();

        public AnonymousClass6() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFAdRevenueData */
        public final Set<AFh1rSDK> invoke() {
            return Collections.synchronizedSet(new LinkedHashSet());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1rSDK;", "p0", "", "getRevenue", "(Lcom/appsflyer/internal/AFh1rSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$7 */
    public static final class AnonymousClass7 extends s implements Function1<AFh1rSDK, Unit> {
        private /* synthetic */ String $getMediationNetwork;
        private /* synthetic */ AFh1sSDK $getMonetizationNetwork;
        private /* synthetic */ boolean $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(AFh1sSDK aFh1sSDK, String str, boolean z13) {
            super(1);
            this.$getMonetizationNetwork = aFh1sSDK;
            this.$getMediationNetwork = str;
            this.$getRevenue = z13;
        }

        public final void getRevenue(@NotNull AFh1rSDK aFh1rSDK) {
            Intrinsics.checkNotNullParameter(aFh1rSDK, "");
            aFh1rSDK.v(this.$getMonetizationNetwork, this.$getMediationNetwork, this.$getRevenue);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getRevenue((AFh1rSDK) obj);
            return Unit.f80348a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "level", "I", "getLevel", "()I", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private final int level;

        LogLevel(int i13) {
            this.level = i13;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    @d
    public static final void afDebugLog(@NotNull String debugLogMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(debugLogMessage, "");
        INSTANCE.d(AFh1sSDK.OTHER, debugLogMessage, shouldRemoteDebug);
    }

    @d
    public static final void afErrorLog(@NotNull String message, @NotNull Throwable ex2, boolean printMessage, boolean printThrowable, boolean shouldReportToExManager) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(ex2, "");
        AFh1rSDK.e$default(INSTANCE, AFh1sSDK.OTHER, message, ex2, printMessage, printThrowable, shouldReportToExManager, false, 64, null);
    }

    @d
    public static final void afErrorLogForExcManagerOnly(String errorLogMessage, Throwable ex2) {
        AFLogger aFLogger = INSTANCE;
        AFh1sSDK aFh1sSDK = AFh1sSDK.OTHER;
        if (errorLogMessage == null || z.j(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex2 == null) {
            ex2 = new NullPointerException("Invoked with null Throwable");
        }
        AFh1rSDK.e$default(aFLogger, aFh1sSDK, str, ex2, false, false, true, false, 64, null);
    }

    @d
    public static final void afInfoLog(@NotNull String logMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.i(AFh1sSDK.OTHER, logMessage, shouldRemoteDebug);
    }

    @d
    public static final void afLogForce(@NotNull String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.force(AFh1sSDK.OTHER, logMessage);
    }

    @d
    public static final void afRDLog(@NotNull String rdLogMessage) {
        Intrinsics.checkNotNullParameter(rdLogMessage, "");
        INSTANCE.v(AFh1sSDK.OTHER, rdLogMessage, true);
    }

    @d
    public static final void afVerboseLog(@NotNull String rdLogMessage) {
        Intrinsics.checkNotNullParameter(rdLogMessage, "");
        INSTANCE.v(AFh1sSDK.OTHER, rdLogMessage, false);
    }

    @d
    public static final void afWarnLog(@NotNull String warningLogMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(warningLogMessage, "");
        INSTANCE.w(AFh1sSDK.OTHER, warningLogMessage, shouldRemoteDebug);
    }

    public static final void getCurrencyIso4217Code(AFh1rSDK[] aFh1rSDKArr) {
        Intrinsics.checkNotNullParameter(aFh1rSDKArr, "");
        k kVar = getMonetizationNetwork;
        Object value = kVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = kVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            k0.v((Set) value2, aFh1rSDKArr);
            Unit unit = Unit.f80348a;
        }
    }

    public static final void getMediationNetwork(AFh1rSDK[] aFh1rSDKArr) {
        Intrinsics.checkNotNullParameter(aFh1rSDKArr, "");
        k kVar = getMonetizationNetwork;
        Object value = kVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = kVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            ((Set) value2).removeAll(c0.f0(aFh1rSDKArr));
            Unit unit = Unit.f80348a;
        }
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final void d(@NotNull AFh1sSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getMediationNetwork.getValue()).execute(new a(4, new AnonymousClass4(tag, msg, shouldRemoteDebug)));
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final void e(@NotNull AFh1sSDK tag, @NotNull String msg, @NotNull Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        Intrinsics.checkNotNullParameter(throwable, "");
        ((ExecutorService) getMediationNetwork.getValue()).execute(new a(5, new AnonymousClass3(tag, msg, throwable, printMsg, printThrowable, shouldReportToExManager, shouldRemoteDebug)));
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final void force(@NotNull AFh1sSDK tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getMediationNetwork.getValue()).execute(new a(0, new AnonymousClass5(tag, msg)));
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final void i(@NotNull AFh1sSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getMediationNetwork.getValue()).execute(new a(1, new AnonymousClass1(tag, msg, shouldRemoteDebug)));
    }

    public final void registerClient(@NotNull AFh1rSDK... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) getMediationNetwork.getValue()).execute(new b(client, 0));
    }

    public final void unregisterClient(@NotNull AFh1rSDK... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) getMediationNetwork.getValue()).execute(new b(client, 1));
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final void v(@NotNull AFh1sSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getMediationNetwork.getValue()).execute(new a(3, new AnonymousClass7(tag, msg, shouldRemoteDebug)));
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final void w(@NotNull AFh1sSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getMediationNetwork.getValue()).execute(new a(2, new AnonymousClass10(tag, msg, shouldRemoteDebug)));
    }

    @d
    public static final void afDebugLog(@NotNull String debugLogMessage) {
        Intrinsics.checkNotNullParameter(debugLogMessage, "");
        INSTANCE.d(AFh1sSDK.OTHER, debugLogMessage, true);
    }

    @d
    public static final void afInfoLog(@NotNull String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.i(AFh1sSDK.OTHER, logMessage, true);
    }

    @d
    public static final void afWarnLog(@NotNull String warningLogMessage) {
        Intrinsics.checkNotNullParameter(warningLogMessage, "");
        AFh1rSDK.w$default(INSTANCE, AFh1sSDK.OTHER, warningLogMessage, false, 4, null);
    }

    @d
    public static final void afErrorLog(String errorLogMessage, Throwable ex2) {
        AFLogger aFLogger = INSTANCE;
        AFh1sSDK aFh1sSDK = AFh1sSDK.OTHER;
        if (errorLogMessage == null || z.j(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex2 == null) {
            ex2 = new NullPointerException("Invoked with null Throwable");
        }
        AFh1rSDK.e$default(aFLogger, aFh1sSDK, str, ex2, false, false, false, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL, null);
    }

    @d
    public static final void afErrorLogForExcManagerOnly(String errorLogMessage, Throwable ex2, boolean disableReporting) {
        AFLogger aFLogger = INSTANCE;
        AFh1sSDK aFh1sSDK = AFh1sSDK.OTHER;
        if (errorLogMessage == null || z.j(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex2 == null) {
            ex2 = new NullPointerException("Invoked with null Throwable");
        }
        AFh1rSDK.e$default(aFLogger, aFh1sSDK, str, ex2, false, false, !disableReporting, false, 64, null);
    }

    public static final void getCurrencyIso4217Code(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        k kVar = getMonetizationNetwork;
        Object value = kVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            try {
                Object value2 = kVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "");
                Iterator it = ((Set) value2).iterator();
                while (it.hasNext()) {
                    function1.invoke((AFh1rSDK) it.next());
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @d
    public static final void afErrorLog(String errorLogMessage, Throwable ex2, boolean printThrowable) {
        AFLogger aFLogger = INSTANCE;
        AFh1sSDK aFh1sSDK = AFh1sSDK.OTHER;
        if (errorLogMessage == null || z.j(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex2 == null) {
            ex2 = new NullPointerException("Invoked with null Throwable");
        }
        AFh1rSDK.e$default(aFLogger, aFh1sSDK, str, ex2, false, printThrowable, false, false, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE, null);
    }

    @d
    public static final void afErrorLog(String errorLogMessage, Throwable ex2, boolean printThrowable, boolean shouldReportToExManager) {
        AFLogger aFLogger = INSTANCE;
        AFh1sSDK aFh1sSDK = AFh1sSDK.OTHER;
        if (errorLogMessage == null || z.j(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex2 == null) {
            ex2 = new NullPointerException("Invoked with null Throwable");
        }
        AFh1rSDK.e$default(aFLogger, aFh1sSDK, str, ex2, false, printThrowable, shouldReportToExManager, false, 72, null);
    }
}
