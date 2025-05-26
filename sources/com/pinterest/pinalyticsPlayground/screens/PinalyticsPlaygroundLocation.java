package com.pinterest.pinalyticsPlayground.screens;

import android.os.Parcel;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import el2.a;
import ez1.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/pinterest/pinalyticsPlayground/screens/PinalyticsPlaygroundLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "(Ljava/lang/String;I)V", "CONTEXT_LOG_DETAILS", "pinalyticsPlayground_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PinalyticsPlaygroundLocation implements ScreenLocation {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PinalyticsPlaygroundLocation[] $VALUES;
    public static final PinalyticsPlaygroundLocation CONTEXT_LOG_DETAILS = new PinalyticsPlaygroundLocation() { // from class: com.pinterest.pinalyticsPlayground.screens.PinalyticsPlaygroundLocation.CONTEXT_LOG_DETAILS

        /* renamed from: a, reason: collision with root package name */
        public final Class f50236a = d.class;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.pinterest.pinalyticsPlayground.screens.PinalyticsPlaygroundLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF50236a() {
            return this.f50236a;
        }

        @Override // com.pinterest.pinalyticsPlayground.screens.PinalyticsPlaygroundLocation, com.pinterest.framework.screens.ScreenLocation
        public final void onScreenNavigation() {
        }
    };

    private static final /* synthetic */ PinalyticsPlaygroundLocation[] $values() {
        return new PinalyticsPlaygroundLocation[]{CONTEXT_LOG_DETAILS};
    }

    static {
        PinalyticsPlaygroundLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    public /* synthetic */ PinalyticsPlaygroundLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static PinalyticsPlaygroundLocation valueOf(String str) {
        return (PinalyticsPlaygroundLocation) Enum.valueOf(PinalyticsPlaygroundLocation.class, str);
    }

    public static PinalyticsPlaygroundLocation[] values() {
        return (PinalyticsPlaygroundLocation[]) $VALUES.clone();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF48904c() {
        return g.DEFAULT;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    public kl1.a getEarlyAccessKey() {
        return kl1.a.LateAccessScreenKey;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getScreenClass */
    public abstract /* synthetic */ Class getF50236a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45103b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45101d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF45109b() {
        return super.getF45109b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF45104c() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public /* bridge */ /* synthetic */ boolean getSupportsStateRestorationOnlyUseInEmergencies() {
        return true;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public abstract /* synthetic */ void onScreenNavigation();

    @Override // com.pinterest.framework.screens.ScreenLocation, android.os.Parcelable
    public /* bridge */ /* synthetic */ void writeToParcel(@NotNull Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
    }

    private PinalyticsPlaygroundLocation(String str, int i13) {
    }
}
