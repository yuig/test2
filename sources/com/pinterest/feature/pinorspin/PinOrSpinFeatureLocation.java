package com.pinterest.feature.pinorspin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.feature.board.permissions.b;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import u21.h;
import v21.j;
import w21.i;
import w21.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/pinterest/feature/pinorspin/PinOrSpinFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/pinorspin/a", "PIN_OR_SPIN_REWARD", "PIN_OR_SPIN_REWARD_PREVIEW", "PIN_OR_SPIN_SELECTION", "PIN_OR_SPIN_SELECTION_CTA_MODAL", "comments_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class PinOrSpinFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ PinOrSpinFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<PinOrSpinFeatureLocation> CREATOR;

    @NotNull
    public static final a Companion;
    public static final PinOrSpinFeatureLocation PIN_OR_SPIN_REWARD = new PinOrSpinFeatureLocation() { // from class: com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation.PIN_OR_SPIN_REWARD

        /* renamed from: a, reason: collision with root package name */
        public final Class f47446a = h.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f47447b = true;

        @Override // com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48906a() {
            return this.f47446a;
        }

        @Override // com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible */
        public final boolean getF48903b() {
            return false;
        }

        @Override // com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF48905d() {
            return this.f47447b;
        }

        @Override // com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final PinOrSpinFeatureLocation PIN_OR_SPIN_REWARD_PREVIEW = new PinOrSpinFeatureLocation() { // from class: com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation.PIN_OR_SPIN_REWARD_PREVIEW

        /* renamed from: a, reason: collision with root package name */
        public final Class f47448a = j.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f47449b = true;

        @Override // com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48906a() {
            return this.f47448a;
        }

        @Override // com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible */
        public final boolean getF48903b() {
            return false;
        }

        @Override // com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF48905d() {
            return this.f47449b;
        }

        @Override // com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final PinOrSpinFeatureLocation PIN_OR_SPIN_SELECTION = new PinOrSpinFeatureLocation() { // from class: com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation.PIN_OR_SPIN_SELECTION

        /* renamed from: a, reason: collision with root package name */
        public final Class f47450a = x.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f47451b = true;

        @Override // com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48906a() {
            return this.f47450a;
        }

        @Override // com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible */
        public final boolean getF48903b() {
            return false;
        }

        @Override // com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF48905d() {
            return this.f47451b;
        }

        @Override // com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final PinOrSpinFeatureLocation PIN_OR_SPIN_SELECTION_CTA_MODAL = new PinOrSpinFeatureLocation() { // from class: com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation.PIN_OR_SPIN_SELECTION_CTA_MODAL

        /* renamed from: a, reason: collision with root package name */
        public final Class f47452a = i.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f47453b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f47454c = true;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f47455d = true;

        @Override // com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48906a() {
            return this.f47452a;
        }

        @Override // com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48903b() {
            return this.f47453b;
        }

        @Override // com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF48905d() {
            return this.f47454c;
        }

        @Override // com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }

        @Override // com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF48898c() {
            return this.f47455d;
        }
    };

    private static final /* synthetic */ PinOrSpinFeatureLocation[] $values() {
        return new PinOrSpinFeatureLocation[]{PIN_OR_SPIN_REWARD, PIN_OR_SPIN_REWARD_PREVIEW, PIN_OR_SPIN_SELECTION, PIN_OR_SPIN_SELECTION_CTA_MODAL};
    }

    static {
        PinOrSpinFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new b(17);
    }

    public /* synthetic */ PinOrSpinFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static PinOrSpinFeatureLocation valueOf(String str) {
        return (PinOrSpinFeatureLocation) Enum.valueOf(PinOrSpinFeatureLocation.class, str);
    }

    public static PinOrSpinFeatureLocation[] values() {
        return (PinOrSpinFeatureLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
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
    public abstract /* synthetic */ Class getF48906a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF48903b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF48905d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF46867b() {
        return super.getF46867b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF48898c() {
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

    private PinOrSpinFeatureLocation(String str, int i13) {
    }
}
