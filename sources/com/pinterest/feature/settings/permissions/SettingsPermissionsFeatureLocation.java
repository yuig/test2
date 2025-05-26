package com.pinterest.feature.settings.permissions;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.framework.screens.ScreenLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import lh0.c2;
import org.jetbrains.annotations.NotNull;
import ub1.o;
import x91.s;
import yb1.j;
import yb1.m;
import yb1.t;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/pinterest/feature/settings/permissions/SettingsPermissionsFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Llh0/c2;", "getExperiments", "()Llh0/c2;", "experiments", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/settings/permissions/g", "MESSAGE_LEVEL_SETTINGS_PERMISSIONS", "SETTINGS_PERMISSIONS_DATA", "SETTINGS_CONTENT_PERMISSIONS", "MESSAGE_SETTINGS_PERMISSIONS", "MENTIONS_CONTROL_SETTINGS", "BLOCKED_ACCOUNTS_SETTINGS", "permissions_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class SettingsPermissionsFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ SettingsPermissionsFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<SettingsPermissionsFeatureLocation> CREATOR;

    @NotNull
    public static final g Companion;
    public static final SettingsPermissionsFeatureLocation MESSAGE_LEVEL_SETTINGS_PERMISSIONS = new SettingsPermissionsFeatureLocation() { // from class: com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation.MESSAGE_LEVEL_SETTINGS_PERMISSIONS

        /* renamed from: a, reason: collision with root package name */
        public final Class f48312a = m.class;

        @Override // com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48315a() {
            return this.f48312a;
        }
    };
    public static final SettingsPermissionsFeatureLocation SETTINGS_PERMISSIONS_DATA = new SettingsPermissionsFeatureLocation() { // from class: com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation.SETTINGS_PERMISSIONS_DATA

        /* renamed from: a, reason: collision with root package name */
        public final Class f48315a = t.class;

        @Override // com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48315a() {
            return this.f48315a;
        }

        @Override // com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final SettingsPermissionsFeatureLocation SETTINGS_CONTENT_PERMISSIONS = new SettingsPermissionsFeatureLocation() { // from class: com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation.SETTINGS_CONTENT_PERMISSIONS

        /* renamed from: a, reason: collision with root package name */
        public final Class f48314a = o.class;

        @Override // com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48315a() {
            return this.f48314a;
        }

        @Override // com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final SettingsPermissionsFeatureLocation MESSAGE_SETTINGS_PERMISSIONS = new SettingsPermissionsFeatureLocation() { // from class: com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation.MESSAGE_SETTINGS_PERMISSIONS

        /* renamed from: a, reason: collision with root package name */
        public final Class f48313a = j.class;

        @Override // com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48315a() {
            return this.f48313a;
        }

        @Override // com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final SettingsPermissionsFeatureLocation MENTIONS_CONTROL_SETTINGS = new SettingsPermissionsFeatureLocation() { // from class: com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation.MENTIONS_CONTROL_SETTINGS

        /* renamed from: a, reason: collision with root package name */
        public final Class f48311a = yb1.g.class;

        @Override // com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48315a() {
            return this.f48311a;
        }
    };
    public static final SettingsPermissionsFeatureLocation BLOCKED_ACCOUNTS_SETTINGS = new SettingsPermissionsFeatureLocation() { // from class: com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation.BLOCKED_ACCOUNTS_SETTINGS

        /* renamed from: a, reason: collision with root package name */
        public final Class f48310a = s.class;

        @Override // com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48315a() {
            return this.f48310a;
        }

        @Override // com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };

    private static final /* synthetic */ SettingsPermissionsFeatureLocation[] $values() {
        return new SettingsPermissionsFeatureLocation[]{MESSAGE_LEVEL_SETTINGS_PERMISSIONS, SETTINGS_PERMISSIONS_DATA, SETTINGS_CONTENT_PERMISSIONS, MESSAGE_SETTINGS_PERMISSIONS, MENTIONS_CONTROL_SETTINGS, BLOCKED_ACCOUNTS_SETTINGS};
    }

    static {
        SettingsPermissionsFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new g();
        CREATOR = new com.pinterest.feature.board.permissions.b(27);
    }

    public /* synthetic */ SettingsPermissionsFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static SettingsPermissionsFeatureLocation valueOf(String str) {
        return (SettingsPermissionsFeatureLocation) Enum.valueOf(SettingsPermissionsFeatureLocation.class, str);
    }

    public static SettingsPermissionsFeatureLocation[] values() {
        return (SettingsPermissionsFeatureLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public com.pinterest.framework.screens.g getF46913c() {
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
    public abstract /* synthetic */ Class getF48315a();

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

    private SettingsPermissionsFeatureLocation(String str, int i13) {
    }
}
