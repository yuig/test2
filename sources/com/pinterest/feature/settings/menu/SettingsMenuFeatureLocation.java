package com.pinterest.feature.settings.menu;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import lh0.c2;
import org.jetbrains.annotations.NotNull;
import xa1.f;
import xa1.l;
import xa1.t;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/pinterest/feature/settings/menu/SettingsMenuFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Llh0/c2;", "getExperiments", "()Llh0/c2;", "experiments", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/settings/menu/c", "SETTINGS_APP_ABOUT", "SETTINGS_MAIN", "SETTINGS_PRIVACY_MODAL", "menu_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class SettingsMenuFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ SettingsMenuFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<SettingsMenuFeatureLocation> CREATOR;

    @NotNull
    public static final c Companion;
    public static final SettingsMenuFeatureLocation SETTINGS_APP_ABOUT = new SettingsMenuFeatureLocation() { // from class: com.pinterest.feature.settings.menu.SettingsMenuFeatureLocation.SETTINGS_APP_ABOUT

        /* renamed from: a, reason: collision with root package name */
        public final Class f48142a = f.class;

        @Override // com.pinterest.feature.settings.menu.SettingsMenuFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48145a() {
            return this.f48142a;
        }

        @Override // com.pinterest.feature.settings.menu.SettingsMenuFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final SettingsMenuFeatureLocation SETTINGS_MAIN = new SettingsMenuFeatureLocation() { // from class: com.pinterest.feature.settings.menu.SettingsMenuFeatureLocation.SETTINGS_MAIN

        /* renamed from: a, reason: collision with root package name */
        public final Class f48143a = l.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f48144b = g.DEFAULT;

        @Override // com.pinterest.feature.settings.menu.SettingsMenuFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF48146b() {
            return this.f48144b;
        }

        @Override // com.pinterest.feature.settings.menu.SettingsMenuFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48145a() {
            return this.f48143a;
        }
    };
    public static final SettingsMenuFeatureLocation SETTINGS_PRIVACY_MODAL = new SettingsMenuFeatureLocation() { // from class: com.pinterest.feature.settings.menu.SettingsMenuFeatureLocation.SETTINGS_PRIVACY_MODAL

        /* renamed from: a, reason: collision with root package name */
        public final Class f48145a = t.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f48146b = g.MODAL;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f48147c = true;

        @Override // com.pinterest.feature.settings.menu.SettingsMenuFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF52826c() {
            return this.f48146b;
        }

        @Override // com.pinterest.feature.settings.menu.SettingsMenuFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF52824a() {
            return this.f48145a;
        }

        @Override // com.pinterest.feature.settings.menu.SettingsMenuFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF52825b() {
            return this.f48147c;
        }
    };

    private static final /* synthetic */ SettingsMenuFeatureLocation[] $values() {
        return new SettingsMenuFeatureLocation[]{SETTINGS_APP_ABOUT, SETTINGS_MAIN, SETTINGS_PRIVACY_MODAL};
    }

    static {
        SettingsMenuFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new c();
        CREATOR = new com.pinterest.feature.board.permissions.b(25);
    }

    public /* synthetic */ SettingsMenuFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static SettingsMenuFeatureLocation valueOf(String str) {
        return (SettingsMenuFeatureLocation) Enum.valueOf(SettingsMenuFeatureLocation.class, str);
    }

    public static SettingsMenuFeatureLocation[] values() {
        return (SettingsMenuFeatureLocation[]) $VALUES.clone();
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
    public abstract /* synthetic */ Class getF52824a();

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

    private SettingsMenuFeatureLocation(String str, int i13) {
    }
}
