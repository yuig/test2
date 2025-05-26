package com.pinterest.feature.pear.screen;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import b01.l;
import com.pinterest.feature.board.permissions.b;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import iz0.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import lh0.c2;
import nz0.d;
import org.jetbrains.annotations.NotNull;
import rz0.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/pinterest/feature/pear/screen/PearLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Llh0/c2;", "getExperiments", "()Llh0/c2;", "experiments", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/pear/screen/a", "PEAR_STYLE_SUMMARY", "PEAR_RELATED_STYLES", "PEAR_RELATED_PINS", "PEAR_STYLE_EXPLORER", "PEAR_QUIZ", "PEAR_QUIZ_RESULT_V2", "pear_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class PearLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ PearLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<PearLocation> CREATOR;

    @NotNull
    public static final a Companion;
    public static final PearLocation PEAR_STYLE_SUMMARY = new PearLocation() { // from class: com.pinterest.feature.pear.screen.PearLocation.PEAR_STYLE_SUMMARY

        /* renamed from: a, reason: collision with root package name */
        public final Class f46868a = l.class;

        @Override // com.pinterest.feature.pear.screen.PearLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45893a() {
            return this.f46868a;
        }

        @Override // com.pinterest.feature.pear.screen.PearLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final PearLocation PEAR_RELATED_STYLES = new PearLocation() { // from class: com.pinterest.feature.pear.screen.PearLocation.PEAR_RELATED_STYLES

        /* renamed from: a, reason: collision with root package name */
        public final Class f46865a = c.class;

        @Override // com.pinterest.feature.pear.screen.PearLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45893a() {
            return this.f46865a;
        }

        @Override // com.pinterest.feature.pear.screen.PearLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final PearLocation PEAR_RELATED_PINS = new PearLocation() { // from class: com.pinterest.feature.pear.screen.PearLocation.PEAR_RELATED_PINS

        /* renamed from: a, reason: collision with root package name */
        public final Class f46864a = d.class;

        @Override // com.pinterest.feature.pear.screen.PearLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45893a() {
            return this.f46864a;
        }

        @Override // com.pinterest.feature.pear.screen.PearLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final PearLocation PEAR_STYLE_EXPLORER = new PearLocation() { // from class: com.pinterest.feature.pear.screen.PearLocation.PEAR_STYLE_EXPLORER

        /* renamed from: a, reason: collision with root package name */
        public final Class f46866a = vz0.a.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f46867b = true;

        @Override // com.pinterest.feature.pear.screen.PearLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45893a() {
            return this.f46866a;
        }

        @Override // com.pinterest.feature.pear.screen.PearLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation, reason: from getter */
        public final boolean getF45109b() {
            return this.f46867b;
        }
    };
    public static final PearLocation PEAR_QUIZ = new PearLocation() { // from class: com.pinterest.feature.pear.screen.PearLocation.PEAR_QUIZ

        /* renamed from: a, reason: collision with root package name */
        public final Class f46862a = fz0.l.class;

        @Override // com.pinterest.feature.pear.screen.PearLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45893a() {
            return this.f46862a;
        }

        @Override // com.pinterest.feature.pear.screen.PearLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final PearLocation PEAR_QUIZ_RESULT_V2 = new PearLocation() { // from class: com.pinterest.feature.pear.screen.PearLocation.PEAR_QUIZ_RESULT_V2

        /* renamed from: a, reason: collision with root package name */
        public final Class f46863a = n.class;

        @Override // com.pinterest.feature.pear.screen.PearLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45893a() {
            return this.f46863a;
        }

        @Override // com.pinterest.feature.pear.screen.PearLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };

    private static final /* synthetic */ PearLocation[] $values() {
        return new PearLocation[]{PEAR_STYLE_SUMMARY, PEAR_RELATED_STYLES, PEAR_RELATED_PINS, PEAR_STYLE_EXPLORER, PEAR_QUIZ, PEAR_QUIZ_RESULT_V2};
    }

    static {
        PearLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new b(14);
    }

    public /* synthetic */ PearLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static PearLocation valueOf(String str) {
        return (PearLocation) Enum.valueOf(PearLocation.class, str);
    }

    public static PearLocation[] values() {
        return (PearLocation[]) $VALUES.clone();
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
    public abstract /* synthetic */ Class getF45893a();

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

    private PearLocation(String str, int i13) {
    }
}
