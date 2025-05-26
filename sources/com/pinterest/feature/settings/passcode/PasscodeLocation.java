package com.pinterest.feature.settings.passcode;

import android.os.Parcel;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import jb1.i;
import kb1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import pb1.d0;
import rb1.k;
import sb1.l;
import tb1.h;
import tb1.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/pinterest/feature/settings/passcode/PasscodeLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "parcel", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "CREATOR", "com/pinterest/feature/settings/passcode/b", "PASSCODE_SUMMARY", "PASSCODE_SUMMARY_SBA", "PASSCODE_REQUIRED", "PASSCODE_REQUIRED_SBA", "PASSCODE_SETTINGS", "PASSCODE_SETUP_INSTRUCTIONS", "PASSCODE_SETUP_CODE", "PASSCODE_SETUP_EMAIL", "PASSCODE_SUCCESS", "passcode_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class PasscodeLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ PasscodeLocation[] $VALUES;

    @NotNull
    public static final b CREATOR;
    public static final PasscodeLocation PASSCODE_SUMMARY = new PasscodeLocation() { // from class: com.pinterest.feature.settings.passcode.PasscodeLocation.PASSCODE_SUMMARY

        /* renamed from: a, reason: collision with root package name */
        public final Class f48306a = j.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48307b = true;

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47612a() {
            return this.f48306a;
        }

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF47613b() {
            return this.f48307b;
        }

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        public final boolean getShouldShowMainNavigation() {
            return false;
        }
    };
    public static final PasscodeLocation PASSCODE_SUMMARY_SBA = new PasscodeLocation() { // from class: com.pinterest.feature.settings.passcode.PasscodeLocation.PASSCODE_SUMMARY_SBA

        /* renamed from: a, reason: collision with root package name */
        public final Class f48308a = l.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48309b = true;

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47612a() {
            return this.f48308a;
        }

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF47613b() {
            return this.f48309b;
        }

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        public final boolean getShouldShowMainNavigation() {
            return false;
        }
    };
    public static final PasscodeLocation PASSCODE_REQUIRED = new PasscodeLocation() { // from class: com.pinterest.feature.settings.passcode.PasscodeLocation.PASSCODE_REQUIRED

        /* renamed from: a, reason: collision with root package name */
        public final Class f48292a = h.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48293b = true;

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47612a() {
            return this.f48292a;
        }

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF47613b() {
            return this.f48293b;
        }

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        public final boolean getShouldShowMainNavigation() {
            return false;
        }
    };
    public static final PasscodeLocation PASSCODE_REQUIRED_SBA = new PasscodeLocation() { // from class: com.pinterest.feature.settings.passcode.PasscodeLocation.PASSCODE_REQUIRED_SBA

        /* renamed from: a, reason: collision with root package name */
        public final Class f48294a = d0.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48295b = true;

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47612a() {
            return this.f48294a;
        }

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF47613b() {
            return this.f48295b;
        }

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        public final boolean getShouldShowMainNavigation() {
            return false;
        }
    };
    public static final PasscodeLocation PASSCODE_SETTINGS = new PasscodeLocation() { // from class: com.pinterest.feature.settings.passcode.PasscodeLocation.PASSCODE_SETTINGS

        /* renamed from: a, reason: collision with root package name */
        public final Class f48296a = k.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48297b = true;

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47612a() {
            return this.f48296a;
        }

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF47613b() {
            return this.f48297b;
        }

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        public final boolean getShouldShowMainNavigation() {
            return false;
        }
    };
    public static final PasscodeLocation PASSCODE_SETUP_INSTRUCTIONS = new PasscodeLocation() { // from class: com.pinterest.feature.settings.passcode.PasscodeLocation.PASSCODE_SETUP_INSTRUCTIONS

        /* renamed from: a, reason: collision with root package name */
        public final Class f48302a = mb1.b.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48303b = true;

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47612a() {
            return this.f48302a;
        }

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF47613b() {
            return this.f48303b;
        }

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        public final boolean getShouldShowMainNavigation() {
            return false;
        }
    };
    public static final PasscodeLocation PASSCODE_SETUP_CODE = new PasscodeLocation() { // from class: com.pinterest.feature.settings.passcode.PasscodeLocation.PASSCODE_SETUP_CODE

        /* renamed from: a, reason: collision with root package name */
        public final Class f48298a = i.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48299b = true;

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47612a() {
            return this.f48298a;
        }

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF47613b() {
            return this.f48299b;
        }

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        public final boolean getShouldShowMainNavigation() {
            return false;
        }
    };
    public static final PasscodeLocation PASSCODE_SETUP_EMAIL = new PasscodeLocation() { // from class: com.pinterest.feature.settings.passcode.PasscodeLocation.PASSCODE_SETUP_EMAIL

        /* renamed from: a, reason: collision with root package name */
        public final Class f48300a = n.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48301b = true;

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47612a() {
            return this.f48300a;
        }

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF47613b() {
            return this.f48301b;
        }

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        public final boolean getShouldShowMainNavigation() {
            return false;
        }
    };
    public static final PasscodeLocation PASSCODE_SUCCESS = new PasscodeLocation() { // from class: com.pinterest.feature.settings.passcode.PasscodeLocation.PASSCODE_SUCCESS

        /* renamed from: a, reason: collision with root package name */
        public final Class f48304a = nb1.b.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48305b = true;

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47612a() {
            return this.f48304a;
        }

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF47613b() {
            return this.f48305b;
        }

        @Override // com.pinterest.feature.settings.passcode.PasscodeLocation, com.pinterest.framework.screens.ScreenLocation
        public final boolean getShouldShowMainNavigation() {
            return false;
        }
    };

    private static final /* synthetic */ PasscodeLocation[] $values() {
        return new PasscodeLocation[]{PASSCODE_SUMMARY, PASSCODE_SUMMARY_SBA, PASSCODE_REQUIRED, PASSCODE_REQUIRED_SBA, PASSCODE_SETTINGS, PASSCODE_SETUP_INSTRUCTIONS, PASSCODE_SETUP_CODE, PASSCODE_SETUP_EMAIL, PASSCODE_SUCCESS};
    }

    static {
        PasscodeLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        CREATOR = new b();
    }

    public /* synthetic */ PasscodeLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static PasscodeLocation valueOf(String str) {
        return (PasscodeLocation) Enum.valueOf(PasscodeLocation.class, str);
    }

    public static PasscodeLocation[] values() {
        return (PasscodeLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF47611b() {
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
    public abstract /* synthetic */ Class getF47612a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF47613b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF47614c() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public /* bridge */ /* synthetic */ boolean getShouldShowMainNavigation() {
        return super.getShouldShowMainNavigation();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF47609b() {
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
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(name());
    }

    private PasscodeLocation(String str, int i13) {
    }
}
