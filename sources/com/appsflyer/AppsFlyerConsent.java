package com.appsflyer;

import a.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\r\u0010\t"}, d2 = {"Lcom/appsflyer/AppsFlyerConsent;", "", "", "p0", "p1", "p2", "<init>", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Z", "component2", "()Ljava/lang/Boolean;", "component3", "isUserSubjectToGDPR", "hasConsentForDataUsage", "hasConsentForAdsPersonalization", "copy", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;)Lcom/appsflyer/AppsFlyerConsent;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getHasConsentForAdsPersonalization", "getHasConsentForDataUsage", "Z", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AppsFlyerConsent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean hasConsentForAdsPersonalization;
    private final Boolean hasConsentForDataUsage;
    private final boolean isUserSubjectToGDPR;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/appsflyer/AppsFlyerConsent$Companion;", "", "<init>", "()V", "", "hasConsentForDataUsage", "hasConsentForAdsPersonalization", "Lcom/appsflyer/AppsFlyerConsent;", "forGDPRUser", "(ZZ)Lcom/appsflyer/AppsFlyerConsent;", "forNonGDPRUser", "()Lcom/appsflyer/AppsFlyerConsent;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AppsFlyerConsent forGDPRUser(boolean hasConsentForDataUsage, boolean hasConsentForAdsPersonalization) {
            return new AppsFlyerConsent(true, Boolean.valueOf(hasConsentForDataUsage), Boolean.valueOf(hasConsentForAdsPersonalization), null);
        }

        @NotNull
        public final AppsFlyerConsent forNonGDPRUser() {
            return new AppsFlyerConsent(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }
    }

    private AppsFlyerConsent(boolean z13, Boolean bool, Boolean bool2) {
        this.isUserSubjectToGDPR = z13;
        this.hasConsentForDataUsage = bool;
        this.hasConsentForAdsPersonalization = bool2;
    }

    public static /* synthetic */ AppsFlyerConsent copy$default(AppsFlyerConsent appsFlyerConsent, boolean z13, Boolean bool, Boolean bool2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = appsFlyerConsent.isUserSubjectToGDPR;
        }
        if ((i13 & 2) != 0) {
            bool = appsFlyerConsent.hasConsentForDataUsage;
        }
        if ((i13 & 4) != 0) {
            bool2 = appsFlyerConsent.hasConsentForAdsPersonalization;
        }
        return appsFlyerConsent.copy(z13, bool, bool2);
    }

    @NotNull
    public static final AppsFlyerConsent forGDPRUser(boolean z13, boolean z14) {
        return INSTANCE.forGDPRUser(z13, z14);
    }

    @NotNull
    public static final AppsFlyerConsent forNonGDPRUser() {
        return INSTANCE.forNonGDPRUser();
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsUserSubjectToGDPR() {
        return this.isUserSubjectToGDPR;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getHasConsentForDataUsage() {
        return this.hasConsentForDataUsage;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getHasConsentForAdsPersonalization() {
        return this.hasConsentForAdsPersonalization;
    }

    @NotNull
    public final AppsFlyerConsent copy(boolean isUserSubjectToGDPR, Boolean hasConsentForDataUsage, Boolean hasConsentForAdsPersonalization) {
        return new AppsFlyerConsent(isUserSubjectToGDPR, hasConsentForDataUsage, hasConsentForAdsPersonalization);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppsFlyerConsent)) {
            return false;
        }
        AppsFlyerConsent appsFlyerConsent = (AppsFlyerConsent) other;
        return this.isUserSubjectToGDPR == appsFlyerConsent.isUserSubjectToGDPR && Intrinsics.d(this.hasConsentForDataUsage, appsFlyerConsent.hasConsentForDataUsage) && Intrinsics.d(this.hasConsentForAdsPersonalization, appsFlyerConsent.hasConsentForAdsPersonalization);
    }

    public final Boolean getHasConsentForAdsPersonalization() {
        return this.hasConsentForAdsPersonalization;
    }

    public final Boolean getHasConsentForDataUsage() {
        return this.hasConsentForDataUsage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z13 = this.isUserSubjectToGDPR;
        ?? r03 = z13;
        if (z13) {
            r03 = 1;
        }
        int i13 = r03 * 31;
        Boolean bool = this.hasConsentForDataUsage;
        int hashCode = (i13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasConsentForAdsPersonalization;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final boolean isUserSubjectToGDPR() {
        return this.isUserSubjectToGDPR;
    }

    @NotNull
    public final String toString() {
        boolean z13 = this.isUserSubjectToGDPR;
        Boolean bool = this.hasConsentForDataUsage;
        Boolean bool2 = this.hasConsentForAdsPersonalization;
        StringBuilder sb3 = new StringBuilder("AppsFlyerConsent(isUserSubjectToGDPR=");
        sb3.append(z13);
        sb3.append(", hasConsentForDataUsage=");
        sb3.append(bool);
        sb3.append(", hasConsentForAdsPersonalization=");
        return c.h(sb3, bool2, ")");
    }

    public /* synthetic */ AppsFlyerConsent(boolean z13, Boolean bool, Boolean bool2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z13, bool, bool2);
    }
}
