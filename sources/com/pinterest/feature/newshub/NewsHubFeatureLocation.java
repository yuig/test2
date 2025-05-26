package com.pinterest.feature.newshub;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import i2.u1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kx0.o;
import lb.l0;
import lh0.a4;
import lh0.c2;
import lh0.g1;
import lh0.z3;
import org.jetbrains.annotations.NotNull;
import sx0.g;
import zx0.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/pinterest/feature/newshub/NewsHubFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Llh0/c2;", "getExperiments", "()Llh0/c2;", "experiments", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/newshub/a", "NOTIFICATIONS_HOST", "NEWS_HUB", "NOTIFICATIONS", "newsHub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class NewsHubFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ NewsHubFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<NewsHubFeatureLocation> CREATOR;

    @NotNull
    public static final a Companion;
    public static final NewsHubFeatureLocation NOTIFICATIONS_HOST = new NewsHubFeatureLocation() { // from class: com.pinterest.feature.newshub.NewsHubFeatureLocation.NOTIFICATIONS_HOST

        /* renamed from: a, reason: collision with root package name */
        public final Class f46780a = f.class;

        @Override // com.pinterest.feature.newshub.NewsHubFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46780a() {
            return this.f46780a;
        }
    };
    public static final NewsHubFeatureLocation NEWS_HUB = new NewsHubFeatureLocation() { // from class: com.pinterest.feature.newshub.NewsHubFeatureLocation.NEWS_HUB

        /* renamed from: a, reason: collision with root package name */
        public final Class f46779a = o.class;

        @Override // com.pinterest.feature.newshub.NewsHubFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46780a() {
            return this.f46779a;
        }
    };
    public static final NewsHubFeatureLocation NOTIFICATIONS = new NOTIFICATIONS("NOTIFICATIONS", 2, null);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/newshub/NewsHubFeatureLocation$NOTIFICATIONS;", "Lcom/pinterest/feature/newshub/NewsHubFeatureLocation;", "newsHub_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class NOTIFICATIONS extends NewsHubFeatureLocation {
        @Override // com.pinterest.feature.newshub.NewsHubFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        public final kl1.a getEarlyAccessKey() {
            return kl1.a.NotificationsKey;
        }

        @Override // com.pinterest.feature.newshub.NewsHubFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass */
        public final Class getF46780a() {
            c2 experiments = getExperiments();
            experiments.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) experiments.f83317a;
            return (g1Var.o("android_news_hub_sba", "enabled", z3Var) || g1Var.l("android_news_hub_sba")) ? tx0.o.class : g.class;
        }
    }

    private static final /* synthetic */ NewsHubFeatureLocation[] $values() {
        return new NewsHubFeatureLocation[]{NOTIFICATIONS_HOST, NEWS_HUB, NOTIFICATIONS};
    }

    static {
        NewsHubFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new u1(24);
    }

    public /* synthetic */ NewsHubFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static NewsHubFeatureLocation valueOf(String str) {
        return (NewsHubFeatureLocation) Enum.valueOf(NewsHubFeatureLocation.class, str);
    }

    public static NewsHubFeatureLocation[] values() {
        return (NewsHubFeatureLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public com.pinterest.framework.screens.g getF45359b() {
        return com.pinterest.framework.screens.g.DEFAULT;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    public kl1.a getEarlyAccessKey() {
        return kl1.a.LateAccessScreenKey;
    }

    @NotNull
    public final c2 getExperiments() {
        return c2.f83314b.c();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getScreenClass */
    public abstract /* synthetic */ Class getF46780a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF35551c() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF35552d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF45109b() {
        return super.getF45109b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF35550b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public /* bridge */ /* synthetic */ boolean getSupportsStateRestorationOnlyUseInEmergencies() {
        return true;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public void onScreenNavigation() {
    }

    @Override // com.pinterest.framework.screens.ScreenLocation, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    private NewsHubFeatureLocation(String str, int i13) {
    }
}
