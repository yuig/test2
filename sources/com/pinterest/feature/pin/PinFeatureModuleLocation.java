package com.pinterest.feature.pin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import e21.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/pinterest/feature/pin/PinFeatureModuleLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/pin/k", "ADD_WEBSITE", "PIN_EDIT_BOARD_SECTION_PICKER", "PIN_EDIT_PIN", "USER_PIN_REACTIONS_LIST", "USER_PIN_REACTIONS_LIST_MODAL", "SCHEDULE_PIN_DATE_TIME_PICKER", "SCHEDULE_PIN_DATE_TIME_PICKER_MODAL", "pin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class PinFeatureModuleLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ PinFeatureModuleLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<PinFeatureModuleLocation> CREATOR;

    @NotNull
    public static final k Companion;
    public static final PinFeatureModuleLocation ADD_WEBSITE = new PinFeatureModuleLocation() { // from class: com.pinterest.feature.pin.PinFeatureModuleLocation.ADD_WEBSITE

        /* renamed from: a, reason: collision with root package name */
        public final Class f46886a = p11.c.class;

        @Override // com.pinterest.feature.pin.PinFeatureModuleLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46894a() {
            return this.f46886a;
        }
    };
    public static final PinFeatureModuleLocation PIN_EDIT_BOARD_SECTION_PICKER = new PinFeatureModuleLocation() { // from class: com.pinterest.feature.pin.PinFeatureModuleLocation.PIN_EDIT_BOARD_SECTION_PICKER

        /* renamed from: a, reason: collision with root package name */
        public final Class f46887a = x11.c.class;

        @Override // com.pinterest.feature.pin.PinFeatureModuleLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46894a() {
            return this.f46887a;
        }

        @Override // com.pinterest.feature.pin.PinFeatureModuleLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final PinFeatureModuleLocation PIN_EDIT_PIN = new PinFeatureModuleLocation() { // from class: com.pinterest.feature.pin.PinFeatureModuleLocation.PIN_EDIT_PIN

        /* renamed from: a, reason: collision with root package name */
        public final Class f46888a = u11.c.class;

        @Override // com.pinterest.feature.pin.PinFeatureModuleLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46894a() {
            return this.f46888a;
        }

        @Override // com.pinterest.feature.pin.PinFeatureModuleLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final PinFeatureModuleLocation USER_PIN_REACTIONS_LIST = new PinFeatureModuleLocation() { // from class: com.pinterest.feature.pin.PinFeatureModuleLocation.USER_PIN_REACTIONS_LIST

        /* renamed from: a, reason: collision with root package name */
        public final Class f46892a = v.class;

        /* renamed from: b, reason: collision with root package name */
        public final com.pinterest.framework.screens.g f46893b = com.pinterest.framework.screens.g.MODAL;

        @Override // com.pinterest.feature.pin.PinFeatureModuleLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final com.pinterest.framework.screens.g getF46895b() {
            return this.f46893b;
        }

        @Override // com.pinterest.feature.pin.PinFeatureModuleLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46894a() {
            return this.f46892a;
        }
    };
    public static final PinFeatureModuleLocation USER_PIN_REACTIONS_LIST_MODAL = new PinFeatureModuleLocation() { // from class: com.pinterest.feature.pin.PinFeatureModuleLocation.USER_PIN_REACTIONS_LIST_MODAL

        /* renamed from: a, reason: collision with root package name */
        public final Class f46894a = v.class;

        /* renamed from: b, reason: collision with root package name */
        public final com.pinterest.framework.screens.g f46895b = com.pinterest.framework.screens.g.MODAL;

        @Override // com.pinterest.feature.pin.PinFeatureModuleLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final com.pinterest.framework.screens.g getF46895b() {
            return this.f46895b;
        }

        @Override // com.pinterest.feature.pin.PinFeatureModuleLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46894a() {
            return this.f46894a;
        }
    };
    public static final PinFeatureModuleLocation SCHEDULE_PIN_DATE_TIME_PICKER = new PinFeatureModuleLocation() { // from class: com.pinterest.feature.pin.PinFeatureModuleLocation.SCHEDULE_PIN_DATE_TIME_PICKER

        /* renamed from: a, reason: collision with root package name */
        public final Class f46889a = p11.l.class;

        @Override // com.pinterest.feature.pin.PinFeatureModuleLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46894a() {
            return this.f46889a;
        }

        @Override // com.pinterest.feature.pin.PinFeatureModuleLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final PinFeatureModuleLocation SCHEDULE_PIN_DATE_TIME_PICKER_MODAL = new PinFeatureModuleLocation() { // from class: com.pinterest.feature.pin.PinFeatureModuleLocation.SCHEDULE_PIN_DATE_TIME_PICKER_MODAL

        /* renamed from: a, reason: collision with root package name */
        public final com.pinterest.framework.screens.g f46890a = com.pinterest.framework.screens.g.MODAL;

        /* renamed from: b, reason: collision with root package name */
        public final Class f46891b = p11.l.class;

        @Override // com.pinterest.feature.pin.PinFeatureModuleLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final com.pinterest.framework.screens.g getF46895b() {
            return this.f46890a;
        }

        @Override // com.pinterest.feature.pin.PinFeatureModuleLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46894a() {
            return this.f46891b;
        }

        @Override // com.pinterest.feature.pin.PinFeatureModuleLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };

    private static final /* synthetic */ PinFeatureModuleLocation[] $values() {
        return new PinFeatureModuleLocation[]{ADD_WEBSITE, PIN_EDIT_BOARD_SECTION_PICKER, PIN_EDIT_PIN, USER_PIN_REACTIONS_LIST, USER_PIN_REACTIONS_LIST_MODAL, SCHEDULE_PIN_DATE_TIME_PICKER, SCHEDULE_PIN_DATE_TIME_PICKER_MODAL};
    }

    static {
        PinFeatureModuleLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new k();
        CREATOR = new com.pinterest.feature.board.permissions.b(15);
    }

    public /* synthetic */ PinFeatureModuleLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static PinFeatureModuleLocation valueOf(String str) {
        return (PinFeatureModuleLocation) Enum.valueOf(PinFeatureModuleLocation.class, str);
    }

    public static PinFeatureModuleLocation[] values() {
        return (PinFeatureModuleLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public com.pinterest.framework.screens.g getF46895b() {
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
    public abstract /* synthetic */ Class getF46894a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF51725b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF51715d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF49203a() {
        return super.getF49203a();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF51723b() {
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

    private PinFeatureModuleLocation(String str, int i13) {
    }
}
