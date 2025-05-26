package com.pinterest.feature.pin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/pinterest/feature/pin/RepinFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/pin/s", "BOARD_PICKER", "MOVE_PINS_SECTION_PICKER", "REPIN_SECTION_PICKER", "AUTO_ORG_MOVE_BOARD_PICKER", "repin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class RepinFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ RepinFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<RepinFeatureLocation> CREATOR;

    @NotNull
    public static final s Companion;
    public static final RepinFeatureLocation BOARD_PICKER = new RepinFeatureLocation() { // from class: com.pinterest.feature.pin.RepinFeatureLocation.BOARD_PICKER

        /* renamed from: a, reason: collision with root package name */
        public final boolean f46904a = true;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f46905b = true;

        /* renamed from: c, reason: collision with root package name */
        public final Class f46906c = l11.j.class;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f46907d = true;

        @Override // com.pinterest.feature.pin.RepinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46912b() {
            return this.f46906c;
        }

        @Override // com.pinterest.feature.pin.RepinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF46911a() {
            return this.f46904a;
        }

        @Override // com.pinterest.feature.pin.RepinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF46905b() {
            return this.f46905b;
        }

        @Override // com.pinterest.feature.pin.RepinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }

        @Override // com.pinterest.feature.pin.RepinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF46907d() {
            return this.f46907d;
        }
    };
    public static final RepinFeatureLocation MOVE_PINS_SECTION_PICKER = new RepinFeatureLocation() { // from class: com.pinterest.feature.pin.RepinFeatureLocation.MOVE_PINS_SECTION_PICKER

        /* renamed from: a, reason: collision with root package name */
        public final boolean f46908a = true;

        /* renamed from: b, reason: collision with root package name */
        public final Class f46909b = ho0.k.class;

        /* renamed from: c, reason: collision with root package name */
        public final com.pinterest.framework.screens.g f46910c = com.pinterest.framework.screens.g.MODAL;

        @Override // com.pinterest.feature.pin.RepinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final com.pinterest.framework.screens.g getF46913c() {
            return this.f46910c;
        }

        @Override // com.pinterest.feature.pin.RepinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46912b() {
            return this.f46909b;
        }

        @Override // com.pinterest.feature.pin.RepinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF46911a() {
            return this.f46908a;
        }

        @Override // com.pinterest.feature.pin.RepinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final RepinFeatureLocation REPIN_SECTION_PICKER = new RepinFeatureLocation() { // from class: com.pinterest.feature.pin.RepinFeatureLocation.REPIN_SECTION_PICKER

        /* renamed from: a, reason: collision with root package name */
        public final boolean f46911a = true;

        /* renamed from: b, reason: collision with root package name */
        public final Class f46912b = ho0.m.class;

        /* renamed from: c, reason: collision with root package name */
        public final com.pinterest.framework.screens.g f46913c = com.pinterest.framework.screens.g.MODAL;

        @Override // com.pinterest.feature.pin.RepinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final com.pinterest.framework.screens.g getF46913c() {
            return this.f46913c;
        }

        @Override // com.pinterest.feature.pin.RepinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46912b() {
            return this.f46912b;
        }

        @Override // com.pinterest.feature.pin.RepinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF46911a() {
            return this.f46911a;
        }

        @Override // com.pinterest.feature.pin.RepinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final RepinFeatureLocation AUTO_ORG_MOVE_BOARD_PICKER = new RepinFeatureLocation() { // from class: com.pinterest.feature.pin.RepinFeatureLocation.AUTO_ORG_MOVE_BOARD_PICKER

        /* renamed from: a, reason: collision with root package name */
        public final boolean f46901a = true;

        /* renamed from: b, reason: collision with root package name */
        public final Class f46902b = l11.j.class;

        /* renamed from: c, reason: collision with root package name */
        public final com.pinterest.framework.screens.g f46903c = com.pinterest.framework.screens.g.MODAL;

        @Override // com.pinterest.feature.pin.RepinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final com.pinterest.framework.screens.g getF46913c() {
            return this.f46903c;
        }

        @Override // com.pinterest.feature.pin.RepinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46912b() {
            return this.f46902b;
        }

        @Override // com.pinterest.feature.pin.RepinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF46911a() {
            return this.f46901a;
        }

        @Override // com.pinterest.feature.pin.RepinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };

    private static final /* synthetic */ RepinFeatureLocation[] $values() {
        return new RepinFeatureLocation[]{BOARD_PICKER, MOVE_PINS_SECTION_PICKER, REPIN_SECTION_PICKER, AUTO_ORG_MOVE_BOARD_PICKER};
    }

    static {
        RepinFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new s();
        CREATOR = new com.pinterest.feature.board.permissions.b(16);
    }

    public /* synthetic */ RepinFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static RepinFeatureLocation valueOf(String str) {
        return (RepinFeatureLocation) Enum.valueOf(RepinFeatureLocation.class, str);
    }

    public static RepinFeatureLocation[] values() {
        return (RepinFeatureLocation[]) $VALUES.clone();
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

    private RepinFeatureLocation(String str, int i13) {
    }
}
