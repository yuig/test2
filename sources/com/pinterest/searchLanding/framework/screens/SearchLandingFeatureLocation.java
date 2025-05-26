package com.pinterest.searchLanding.framework.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import c61.i;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import lh0.c2;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/pinterest/searchLanding/framework/screens/SearchLandingFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Llh0/c2;", "getExperiments", "()Llh0/c2;", "experiments", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/searchLanding/framework/screens/a", "SEARCH_LANDING", "landing_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class SearchLandingFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ SearchLandingFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<SearchLandingFeatureLocation> CREATOR;

    @NotNull
    public static final a Companion;
    public static final SearchLandingFeatureLocation SEARCH_LANDING = new SearchLandingFeatureLocation() { // from class: com.pinterest.searchLanding.framework.screens.SearchLandingFeatureLocation.SEARCH_LANDING

        /* renamed from: a, reason: collision with root package name */
        public final Class f51708a = i.class;

        @Override // com.pinterest.searchLanding.framework.screens.SearchLandingFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51708a() {
            return this.f51708a;
        }
    };

    private static final /* synthetic */ SearchLandingFeatureLocation[] $values() {
        return new SearchLandingFeatureLocation[]{SEARCH_LANDING};
    }

    static {
        SearchLandingFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new com.pinterest.feature.todaytab.a(17);
    }

    public /* synthetic */ SearchLandingFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static SearchLandingFeatureLocation valueOf(String str) {
        return (SearchLandingFeatureLocation) Enum.valueOf(SearchLandingFeatureLocation.class, str);
    }

    public static SearchLandingFeatureLocation[] values() {
        return (SearchLandingFeatureLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF52826c() {
        return g.DEFAULT;
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
    public abstract /* synthetic */ Class getF51708a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF52825b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF52827d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF45109b() {
        return super.getF45109b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF50296c() {
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

    private SearchLandingFeatureLocation(String str, int i13) {
    }
}
