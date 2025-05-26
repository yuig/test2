package com.pinterest.closeup.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import lh0.a4;
import lh0.c2;
import lh0.g1;
import lh0.z3;
import mq.h0;
import mq.u;
import nx.f1;
import org.jetbrains.annotations.NotNull;
import q01.p;
import xk2.k;
import xk2.m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/pinterest/closeup/screens/PinFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Llh0/c2;", "experiments$delegate", "Lxk2/k;", "getExperiments", "()Llh0/c2;", "experiments", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/closeup/screens/a", "PIN_PAGER", "PIN", "RELATED_PINS_FILTER_OPTIONS_SHEET", "closeup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class PinFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ PinFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<PinFeatureLocation> CREATOR;

    @NotNull
    public static final a Companion;

    /* renamed from: experiments$delegate, reason: from kotlin metadata */
    @NotNull
    private final k experiments;
    public static final PinFeatureLocation PIN_PAGER = new PinFeatureLocation() { // from class: com.pinterest.closeup.screens.PinFeatureLocation.PIN_PAGER

        /* renamed from: a, reason: collision with root package name */
        public final Class f44607a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f44608b;

        {
            boolean z13 = false;
            c2 experiments = getExperiments();
            experiments.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) experiments.f83317a;
            this.f44607a = (g1Var.o("android_sba_pin_swipe_fragment", "enabled", z3Var) || g1Var.l("android_sba_pin_swipe_fragment")) ? h0.class : u.class;
            c2 experiments2 = getExperiments();
            experiments2.getClass();
            z3 z3Var2 = a4.f83297a;
            g1 g1Var2 = (g1) experiments2.f83317a;
            if (!g1Var2.o("closeup_redesign_letterboxing_and_visit_cta_android", "enabled", z3Var2) && !g1Var2.l("closeup_redesign_letterboxing_and_visit_cta_android") && hf0.b.q()) {
                z13 = true;
            }
            this.f44608b = z13;
        }

        @Override // com.pinterest.closeup.screens.PinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44609a() {
            return this.f44607a;
        }

        @Override // com.pinterest.closeup.screens.PinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation, reason: from getter */
        public final boolean getF44608b() {
            return this.f44608b;
        }
    };
    public static final PinFeatureLocation PIN = new PinFeatureLocation() { // from class: com.pinterest.closeup.screens.PinFeatureLocation.PIN

        /* renamed from: a, reason: collision with root package name */
        public final Class f44606a = PinCloseupFragment.class;

        @Override // com.pinterest.closeup.screens.PinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44609a() {
            return this.f44606a;
        }

        @Override // com.pinterest.closeup.screens.PinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44608b() {
            return false;
        }
    };
    public static final PinFeatureLocation RELATED_PINS_FILTER_OPTIONS_SHEET = new PinFeatureLocation() { // from class: com.pinterest.closeup.screens.PinFeatureLocation.RELATED_PINS_FILTER_OPTIONS_SHEET

        /* renamed from: a, reason: collision with root package name */
        public final Class f44609a = p.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f44610b = true;

        @Override // com.pinterest.closeup.screens.PinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44609a() {
            return this.f44609a;
        }

        @Override // com.pinterest.closeup.screens.PinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF44610b() {
            return this.f44610b;
        }

        @Override // com.pinterest.closeup.screens.PinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible */
        public final boolean getF45172d() {
            return false;
        }

        @Override // com.pinterest.closeup.screens.PinFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44608b() {
            return false;
        }
    };

    private static final /* synthetic */ PinFeatureLocation[] $values() {
        return new PinFeatureLocation[]{PIN_PAGER, PIN, RELATED_PINS_FILTER_OPTIONS_SHEET};
    }

    static {
        PinFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new f1(6);
    }

    public /* synthetic */ PinFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static PinFeatureLocation valueOf(String str) {
        return (PinFeatureLocation) Enum.valueOf(PinFeatureLocation.class, str);
    }

    public static PinFeatureLocation[] values() {
        return (PinFeatureLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF45517b() {
        return g.DEFAULT;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    public kl1.a getEarlyAccessKey() {
        return kl1.a.LateAccessScreenKey;
    }

    @NotNull
    public final c2 getExperiments() {
        return (c2) this.experiments.getValue();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getScreenClass */
    public abstract /* synthetic */ Class getF44609a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF44610b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45172d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF44608b() {
        return super.getF44608b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF45171c() {
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

    private PinFeatureLocation(String str, int i13) {
        this.experiments = m.b(b.f44611i);
    }
}
