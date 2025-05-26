package com.pinterest.settingsPersonalInformation.framework.screens;

import android.os.Parcel;
import android.os.Parcelable;
import cc1.d;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import q91.a1;
import q91.d1;
import q91.i0;
import q91.o0;
import q91.p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/pinterest/settingsPersonalInformation/framework/screens/SettingsPersonalInformationFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/settingsPersonalInformation/framework/screens/a", "SETTINGS_COUNTRY", "SETTINGS_BIRTHDAY", "SETTINGS_LANGUAGE", "SETTINGS_LANGUAGE_SELECTION", "SETTINGS_PERSONAL_INFORMATION", "POLICY_CONVERSION_TO_PERSONAL", "personalInformation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class SettingsPersonalInformationFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ SettingsPersonalInformationFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<SettingsPersonalInformationFeatureLocation> CREATOR;

    @NotNull
    public static final a Companion;
    public static final SettingsPersonalInformationFeatureLocation SETTINGS_COUNTRY = new SettingsPersonalInformationFeatureLocation() { // from class: com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation.SETTINGS_COUNTRY

        /* renamed from: a, reason: collision with root package name */
        public final Class f51831a = p.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51832b = true;

        @Override // com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51837a() {
            return this.f51831a;
        }

        @Override // com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF51838b() {
            return this.f51832b;
        }

        @Override // com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final SettingsPersonalInformationFeatureLocation SETTINGS_BIRTHDAY = new SettingsPersonalInformationFeatureLocation() { // from class: com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation.SETTINGS_BIRTHDAY

        /* renamed from: a, reason: collision with root package name */
        public final Class f51829a = o0.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f51830b = g.MODAL;

        @Override // com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF46913c() {
            return this.f51830b;
        }

        @Override // com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46912b() {
            return this.f51829a;
        }
    };
    public static final SettingsPersonalInformationFeatureLocation SETTINGS_LANGUAGE = new SettingsPersonalInformationFeatureLocation() { // from class: com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation.SETTINGS_LANGUAGE

        /* renamed from: a, reason: collision with root package name */
        public final Class f51833a = a1.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f51834b = g.MODAL;

        @Override // com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF46913c() {
            return this.f51834b;
        }

        @Override // com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46912b() {
            return this.f51833a;
        }
    };
    public static final SettingsPersonalInformationFeatureLocation SETTINGS_LANGUAGE_SELECTION = new SettingsPersonalInformationFeatureLocation() { // from class: com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation.SETTINGS_LANGUAGE_SELECTION

        /* renamed from: a, reason: collision with root package name */
        public final Class f51835a = d1.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f51836b = g.MODAL;

        @Override // com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF46913c() {
            return this.f51836b;
        }

        @Override // com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46912b() {
            return this.f51835a;
        }
    };
    public static final SettingsPersonalInformationFeatureLocation SETTINGS_PERSONAL_INFORMATION = new SettingsPersonalInformationFeatureLocation() { // from class: com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation.SETTINGS_PERSONAL_INFORMATION

        /* renamed from: a, reason: collision with root package name */
        public final Class f51837a = d.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51838b = true;

        @Override // com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46912b() {
            return this.f51837a;
        }

        @Override // com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF46911a() {
            return this.f51838b;
        }

        @Override // com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final SettingsPersonalInformationFeatureLocation POLICY_CONVERSION_TO_PERSONAL = new SettingsPersonalInformationFeatureLocation() { // from class: com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation.POLICY_CONVERSION_TO_PERSONAL

        /* renamed from: a, reason: collision with root package name */
        public final Class f51826a = i0.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51827b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f51828c = true;

        @Override // com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46912b() {
            return this.f51826a;
        }

        @Override // com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF46911a() {
            return this.f51827b;
        }

        @Override // com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }

        @Override // com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF46907d() {
            return this.f51828c;
        }
    };

    private static final /* synthetic */ SettingsPersonalInformationFeatureLocation[] $values() {
        return new SettingsPersonalInformationFeatureLocation[]{SETTINGS_COUNTRY, SETTINGS_BIRTHDAY, SETTINGS_LANGUAGE, SETTINGS_LANGUAGE_SELECTION, SETTINGS_PERSONAL_INFORMATION, POLICY_CONVERSION_TO_PERSONAL};
    }

    static {
        SettingsPersonalInformationFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new com.pinterest.feature.todaytab.a(21);
    }

    public /* synthetic */ SettingsPersonalInformationFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static SettingsPersonalInformationFeatureLocation valueOf(String str) {
        return (SettingsPersonalInformationFeatureLocation) Enum.valueOf(SettingsPersonalInformationFeatureLocation.class, str);
    }

    public static SettingsPersonalInformationFeatureLocation[] values() {
        return (SettingsPersonalInformationFeatureLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF46913c() {
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
    public abstract /* synthetic */ Class getF46912b();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF46911a() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF46905b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF45109b() {
        return super.getF45109b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF46907d() {
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

    private SettingsPersonalInformationFeatureLocation(String str, int i13) {
    }
}
