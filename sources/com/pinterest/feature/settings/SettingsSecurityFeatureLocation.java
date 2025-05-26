package com.pinterest.feature.settings;

import android.os.Parcel;
import android.os.Parcelable;
import bb1.i;
import bb1.l;
import bb1.p;
import bb1.s;
import bb1.w;
import bb1.z;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import lh0.c2;
import ma1.n;
import org.jetbrains.annotations.NotNull;
import ua1.d;
import wc1.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/pinterest/feature/settings/SettingsSecurityFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Llh0/c2;", "getExperiments", "()Llh0/c2;", "experiments", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/settings/b", "SETTINGS_MFA_CONFIRM_EMAIL", "SETTINGS_MFA_PASSWORD", "SETTINGS_MFA_PHONE", "SETTINGS_MFA_VERIFICATION_CODE", "SETTINGS_MFA_BACKUP_CODE", "SETTINGS_MFA_DISABLE", "SETTINGS_LOGIN_OPTIONS", "SETTINGS_SECURITY", "SETTINGS_CONNECTED_DEVICES", "security_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class SettingsSecurityFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ SettingsSecurityFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<SettingsSecurityFeatureLocation> CREATOR;

    @NotNull
    public static final b Companion;
    public static final SettingsSecurityFeatureLocation SETTINGS_MFA_CONFIRM_EMAIL = new SettingsSecurityFeatureLocation() { // from class: com.pinterest.feature.settings.SettingsSecurityFeatureLocation.SETTINGS_MFA_CONFIRM_EMAIL

        /* renamed from: a, reason: collision with root package name */
        public final Class f48099a = p.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48100b = true;

        /* renamed from: c, reason: collision with root package name */
        public final g f48101c = g.MODAL;

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF48107c() {
            return this.f48101c;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48112a() {
            return this.f48099a;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48113b() {
            return this.f48100b;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final SettingsSecurityFeatureLocation SETTINGS_MFA_PASSWORD = new SettingsSecurityFeatureLocation() { // from class: com.pinterest.feature.settings.SettingsSecurityFeatureLocation.SETTINGS_MFA_PASSWORD

        /* renamed from: a, reason: collision with root package name */
        public final Class f48105a = s.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48106b = true;

        /* renamed from: c, reason: collision with root package name */
        public final g f48107c = g.MODAL;

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF48107c() {
            return this.f48107c;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48112a() {
            return this.f48105a;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48113b() {
            return this.f48106b;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final SettingsSecurityFeatureLocation SETTINGS_MFA_PHONE = new SettingsSecurityFeatureLocation() { // from class: com.pinterest.feature.settings.SettingsSecurityFeatureLocation.SETTINGS_MFA_PHONE

        /* renamed from: a, reason: collision with root package name */
        public final Class f48108a = w.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48109b = true;

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48112a() {
            return this.f48108a;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48113b() {
            return this.f48109b;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final SettingsSecurityFeatureLocation SETTINGS_MFA_VERIFICATION_CODE = new SettingsSecurityFeatureLocation() { // from class: com.pinterest.feature.settings.SettingsSecurityFeatureLocation.SETTINGS_MFA_VERIFICATION_CODE

        /* renamed from: a, reason: collision with root package name */
        public final Class f48110a = l.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48111b = true;

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48112a() {
            return this.f48110a;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48113b() {
            return this.f48111b;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final SettingsSecurityFeatureLocation SETTINGS_MFA_BACKUP_CODE = new SettingsSecurityFeatureLocation() { // from class: com.pinterest.feature.settings.SettingsSecurityFeatureLocation.SETTINGS_MFA_BACKUP_CODE

        /* renamed from: a, reason: collision with root package name */
        public final Class f48096a = z.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48097b = true;

        /* renamed from: c, reason: collision with root package name */
        public final g f48098c = g.MODAL;

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF48107c() {
            return this.f48098c;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48112a() {
            return this.f48096a;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48113b() {
            return this.f48097b;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final SettingsSecurityFeatureLocation SETTINGS_MFA_DISABLE = new SettingsSecurityFeatureLocation() { // from class: com.pinterest.feature.settings.SettingsSecurityFeatureLocation.SETTINGS_MFA_DISABLE

        /* renamed from: a, reason: collision with root package name */
        public final Class f48102a = i.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48103b = true;

        /* renamed from: c, reason: collision with root package name */
        public final g f48104c = g.MODAL;

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF48107c() {
            return this.f48104c;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48112a() {
            return this.f48102a;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48113b() {
            return this.f48103b;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final SettingsSecurityFeatureLocation SETTINGS_LOGIN_OPTIONS = new SettingsSecurityFeatureLocation() { // from class: com.pinterest.feature.settings.SettingsSecurityFeatureLocation.SETTINGS_LOGIN_OPTIONS

        /* renamed from: a, reason: collision with root package name */
        public final Class f48094a = d.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48095b = true;

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48112a() {
            return this.f48094a;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48113b() {
            return this.f48095b;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final SettingsSecurityFeatureLocation SETTINGS_SECURITY = new SettingsSecurityFeatureLocation() { // from class: com.pinterest.feature.settings.SettingsSecurityFeatureLocation.SETTINGS_SECURITY

        /* renamed from: a, reason: collision with root package name */
        public final Class f48112a = e.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48113b = true;

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48112a() {
            return this.f48112a;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48113b() {
            return this.f48113b;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final SettingsSecurityFeatureLocation SETTINGS_CONNECTED_DEVICES = new SettingsSecurityFeatureLocation() { // from class: com.pinterest.feature.settings.SettingsSecurityFeatureLocation.SETTINGS_CONNECTED_DEVICES

        /* renamed from: a, reason: collision with root package name */
        public final Class f48092a = n.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48093b = true;

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48112a() {
            return this.f48092a;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48113b() {
            return this.f48093b;
        }

        @Override // com.pinterest.feature.settings.SettingsSecurityFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };

    private static final /* synthetic */ SettingsSecurityFeatureLocation[] $values() {
        return new SettingsSecurityFeatureLocation[]{SETTINGS_MFA_CONFIRM_EMAIL, SETTINGS_MFA_PASSWORD, SETTINGS_MFA_PHONE, SETTINGS_MFA_VERIFICATION_CODE, SETTINGS_MFA_BACKUP_CODE, SETTINGS_MFA_DISABLE, SETTINGS_LOGIN_OPTIONS, SETTINGS_SECURITY, SETTINGS_CONNECTED_DEVICES};
    }

    static {
        SettingsSecurityFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new b();
        CREATOR = new com.pinterest.feature.board.permissions.b(23);
    }

    public /* synthetic */ SettingsSecurityFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static SettingsSecurityFeatureLocation valueOf(String str) {
        return (SettingsSecurityFeatureLocation) Enum.valueOf(SettingsSecurityFeatureLocation.class, str);
    }

    public static SettingsSecurityFeatureLocation[] values() {
        return (SettingsSecurityFeatureLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF48107c() {
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
    public abstract /* synthetic */ Class getF48112a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF48113b() {
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

    private SettingsSecurityFeatureLocation(String str, int i13) {
    }
}
