package com.pinterest.feature.unauth.sba;

import android.os.Parcel;
import com.pinterest.framework.screens.ScreenLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/pinterest/feature/unauth/sba/UnauthPreloadExperienceLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "(Ljava/lang/String;I)V", "describeContents", "", "onScreenNavigation", "", "UNAUTH_PRELOAD_EXPERIENCE_LANDING_SCREEN", "identity_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class UnauthPreloadExperienceLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ UnauthPreloadExperienceLocation[] $VALUES;
    public static final UnauthPreloadExperienceLocation UNAUTH_PRELOAD_EXPERIENCE_LANDING_SCREEN = new UnauthPreloadExperienceLocation() { // from class: com.pinterest.feature.unauth.sba.UnauthPreloadExperienceLocation.UNAUTH_PRELOAD_EXPERIENCE_LANDING_SCREEN

        /* renamed from: a, reason: collision with root package name */
        public final Class f48754a = w.class;

        /* renamed from: b, reason: collision with root package name */
        public final com.pinterest.framework.screens.g f48755b = com.pinterest.framework.screens.g.MODAL;

        @Override // com.pinterest.feature.unauth.sba.UnauthPreloadExperienceLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final com.pinterest.framework.screens.g getF48755b() {
            return this.f48755b;
        }

        @Override // com.pinterest.feature.unauth.sba.UnauthPreloadExperienceLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF34948a() {
            return this.f48754a;
        }
    };

    private static final /* synthetic */ UnauthPreloadExperienceLocation[] $values() {
        return new UnauthPreloadExperienceLocation[]{UNAUTH_PRELOAD_EXPERIENCE_LANDING_SCREEN};
    }

    static {
        UnauthPreloadExperienceLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    public /* synthetic */ UnauthPreloadExperienceLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static UnauthPreloadExperienceLocation valueOf(String str) {
        return (UnauthPreloadExperienceLocation) Enum.valueOf(UnauthPreloadExperienceLocation.class, str);
    }

    public static UnauthPreloadExperienceLocation[] values() {
        return (UnauthPreloadExperienceLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public com.pinterest.framework.screens.g getF48755b() {
        return com.pinterest.framework.screens.g.DEFAULT;
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
    public abstract /* synthetic */ Class getF34948a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF44779c() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45113d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF45109b() {
        return super.getF45109b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF44778b() {
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
    public /* bridge */ /* synthetic */ void writeToParcel(@NotNull Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
    }

    private UnauthPreloadExperienceLocation(String str, int i13) {
    }
}
