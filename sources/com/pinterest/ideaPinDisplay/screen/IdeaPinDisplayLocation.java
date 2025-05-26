package com.pinterest.ideaPinDisplay.screen;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import jq1.c;
import jq1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import nq1.e;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/pinterest/ideaPinDisplay/screen/IdeaPinDisplayLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/ideaPinDisplay/screen/a", "IDEA_PIN_LIST_BOTTOM_SHEET", "ADS_IDEA_PIN_CREATOR_SPONSOR_BOTTOM_SHEET", "IDEA_PIN_INGREDIENT_OR_SUPPLY_BOTTOM_SHEET", "IDEA_PIN_FULL_SCREEN", "ideaPinDisplay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class IdeaPinDisplayLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ IdeaPinDisplayLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<IdeaPinDisplayLocation> CREATOR;

    @NotNull
    public static final a Companion;
    public static final IdeaPinDisplayLocation IDEA_PIN_LIST_BOTTOM_SHEET = new IdeaPinDisplayLocation() { // from class: com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation.IDEA_PIN_LIST_BOTTOM_SHEET

        /* renamed from: a, reason: collision with root package name */
        public final Class f49751a = n.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f49752b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f49753c = true;

        @Override // com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF49751a() {
            return this.f49751a;
        }

        @Override // com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF49752b() {
            return this.f49752b;
        }

        @Override // com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF49753c() {
            return this.f49753c;
        }

        @Override // com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final IdeaPinDisplayLocation ADS_IDEA_PIN_CREATOR_SPONSOR_BOTTOM_SHEET = new IdeaPinDisplayLocation() { // from class: com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation.ADS_IDEA_PIN_CREATOR_SPONSOR_BOTTOM_SHEET

        /* renamed from: a, reason: collision with root package name */
        public final Class f49742a = c.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f49743b = g.MODAL;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f49744c = true;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f49745d = true;

        @Override // com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF49743b() {
            return this.f49743b;
        }

        @Override // com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF49751a() {
            return this.f49742a;
        }

        @Override // com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF49752b() {
            return this.f49744c;
        }

        @Override // com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF49753c() {
            return this.f49745d;
        }
    };
    public static final IdeaPinDisplayLocation IDEA_PIN_INGREDIENT_OR_SUPPLY_BOTTOM_SHEET = new IdeaPinDisplayLocation() { // from class: com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation.IDEA_PIN_INGREDIENT_OR_SUPPLY_BOTTOM_SHEET

        /* renamed from: a, reason: collision with root package name */
        public final Class f49748a = e.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f49749b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f49750c = true;

        @Override // com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF49751a() {
            return this.f49748a;
        }

        @Override // com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF49752b() {
            return this.f49749b;
        }

        @Override // com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF49753c() {
            return this.f49750c;
        }

        @Override // com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final IdeaPinDisplayLocation IDEA_PIN_FULL_SCREEN = new IdeaPinDisplayLocation() { // from class: com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation.IDEA_PIN_FULL_SCREEN

        /* renamed from: a, reason: collision with root package name */
        public final Class f49746a = oq1.e.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f49747b = true;

        @Override // com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF49751a() {
            return this.f49746a;
        }

        @Override // com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }

        @Override // com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF49747b() {
            return this.f49747b;
        }
    };

    private static final /* synthetic */ IdeaPinDisplayLocation[] $values() {
        return new IdeaPinDisplayLocation[]{IDEA_PIN_LIST_BOTTOM_SHEET, ADS_IDEA_PIN_CREATOR_SPONSOR_BOTTOM_SHEET, IDEA_PIN_INGREDIENT_OR_SUPPLY_BOTTOM_SHEET, IDEA_PIN_FULL_SCREEN};
    }

    static {
        IdeaPinDisplayLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new com.pinterest.feature.todaytab.a(5);
    }

    public /* synthetic */ IdeaPinDisplayLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static IdeaPinDisplayLocation valueOf(String str) {
        return (IdeaPinDisplayLocation) Enum.valueOf(IdeaPinDisplayLocation.class, str);
    }

    public static IdeaPinDisplayLocation[] values() {
        return (IdeaPinDisplayLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF49743b() {
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
    public abstract /* synthetic */ Class getF49751a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF49752b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF49753c() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF45109b() {
        return super.getF45109b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF49747b() {
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

    private IdeaPinDisplayLocation(String str, int i13) {
    }
}
