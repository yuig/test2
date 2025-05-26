package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFj1cSDK {

    @NotNull
    final Intent getRevenue;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AFAdRevenueData", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1cSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends s implements Function0<Boolean> {
        private /* synthetic */ String $AFAdRevenueData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$AFAdRevenueData = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AFj1cSDK.this.getRevenue.hasExtra(this.$AFAdRevenueData));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getMediationNetwork", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1cSDK$2, reason: invalid class name */
    public static final class AnonymousClass2 extends s implements Function0<String> {
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(0);
            this.$getRevenue = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AFj1cSDK.this.getRevenue.getStringExtra(this.$getRevenue);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Parcelable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "L_", "()Landroid/os/Parcelable;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1cSDK$4, reason: invalid class name */
    public static final class AnonymousClass4<T> extends s implements Function0<T> {
        private /* synthetic */ String $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str) {
            super(0);
            this.$getMonetizationNetwork = str;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: L_, reason: merged with bridge method [inline-methods] */
        public final Parcelable invoke() {
            return AFj1cSDK.this.getRevenue.getParcelableExtra(this.$getMonetizationNetwork);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Intent;", "M_", "()Landroid/content/Intent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1cSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends s implements Function0<Intent> {
        private /* synthetic */ String $getMediationNetwork;
        private /* synthetic */ long $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, long j13) {
            super(0);
            this.$getMediationNetwork = str;
            this.$getMonetizationNetwork = j13;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: M_, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return AFj1cSDK.this.getRevenue.putExtra(this.$getMediationNetwork, this.$getMonetizationNetwork);
        }
    }

    public AFj1cSDK(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.getRevenue = intent;
    }

    private final <T> T AFAdRevenueData(Function0<? extends T> function0, String str, T t13, boolean z13) {
        T m13;
        Object m14;
        synchronized (this.getRevenue) {
            try {
                xk2.q qVar = xk2.s.f135225b;
                m13 = function0.invoke();
            } catch (Throwable th3) {
                xk2.q qVar2 = xk2.s.f135225b;
                m13 = ue.c.m(th3);
            }
            l0 l0Var = k0.f80436a;
            rl2.d[] dVarArr = {l0Var.b(ConcurrentModificationException.class), l0Var.b(ArrayIndexOutOfBoundsException.class)};
            Throwable a13 = xk2.s.a(m13);
            if (a13 != null) {
                try {
                } catch (Throwable th4) {
                    xk2.q qVar3 = xk2.s.f135225b;
                    m14 = ue.c.m(th4);
                }
                if (!c0.y(dVarArr, l0Var.b(a13.getClass()))) {
                    throw a13;
                }
                if (z13) {
                    m14 = AFAdRevenueData(function0, str, t13, false);
                } else {
                    AFLogger.afErrorLog(str, a13, false, false);
                    m14 = t13;
                }
                m13 = m14;
            }
            l0 l0Var2 = k0.f80436a;
            rl2.d[] dVarArr2 = {l0Var2.b(RuntimeException.class)};
            Throwable a14 = xk2.s.a(m13);
            if (a14 != null) {
                try {
                } catch (Throwable th5) {
                    xk2.q qVar4 = xk2.s.f135225b;
                    t13 = (T) ue.c.m(th5);
                }
                if (!c0.y(dVarArr2, l0Var2.b(a14.getClass()))) {
                    throw a14;
                }
                AFLogger.afErrorLog(str, a14, false, false);
                m13 = t13;
            }
            ue.c.H(m13);
        }
        return (T) m13;
    }

    public final <T extends Parcelable> T J_(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) AFAdRevenueData(new AnonymousClass4(str), a.a.k("Error while trying to read ", str, " extra from intent"), null, true);
    }

    public final Intent K_(@NotNull String str, long j13) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) AFAdRevenueData(new AnonymousClass5(str, j13), a.a.k("Error while trying to write ", str, " extra to intent"), null, true);
    }

    public final boolean getCurrencyIso4217Code(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) AFAdRevenueData(new AnonymousClass1(str), a.a.k("Error while trying to check presence of ", str, " extra from intent"), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final String getMonetizationNetwork(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) AFAdRevenueData(new AnonymousClass2(str), a.a.k("Error while trying to read ", str, " extra from intent"), null, true);
    }
}
