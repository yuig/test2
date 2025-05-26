package com.pinterest.feature.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import ct0.s;
import dt0.n;
import ht0.m;
import ht0.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import lh0.a4;
import lh0.c2;
import lh0.g1;
import lh0.z3;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/pinterest/feature/home/model/HomeFeedTunerLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Llh0/c2;", "getExperiments", "()Llh0/c2;", "experiments", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/home/model/l", "HOMEFEED_TUNER", "HOMEFEED_TUNER_BOARD_RECOMMENDATIONS", "HOMEFEED_TUNER_INTERESTS", "HOMEFEED_TUNER_PIN_ACTIVITY", "HOMEFEED_TUNER_FOLLOWING", "GESTALT_SHEET_HOMEFEED_TUNER_DEMO", "homeFeedTuner_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class HomeFeedTunerLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ HomeFeedTunerLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<HomeFeedTunerLocation> CREATOR;

    @NotNull
    public static final l Companion;
    public static final HomeFeedTunerLocation HOMEFEED_TUNER = new HomeFeedTunerLocation() { // from class: com.pinterest.feature.home.model.HomeFeedTunerLocation.HOMEFEED_TUNER

        /* renamed from: a, reason: collision with root package name */
        public final Class f45774a = m.class;

        @Override // com.pinterest.feature.home.model.HomeFeedTunerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45778a() {
            return this.f45774a;
        }

        @Override // com.pinterest.feature.home.model.HomeFeedTunerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final HomeFeedTunerLocation HOMEFEED_TUNER_BOARD_RECOMMENDATIONS = new HomeFeedTunerLocation() { // from class: com.pinterest.feature.home.model.HomeFeedTunerLocation.HOMEFEED_TUNER_BOARD_RECOMMENDATIONS

        /* renamed from: a, reason: collision with root package name */
        public final Class f45775a;

        {
            c2 experiments = getExperiments();
            experiments.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) experiments.f83317a;
            this.f45775a = (g1Var.o("android_curation_sba_hft_boards_tab", "enabled", z3Var) || g1Var.l("android_curation_sba_hft_boards_tab")) ? ys0.h.class : ht0.g.class;
        }

        @Override // com.pinterest.feature.home.model.HomeFeedTunerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45778a() {
            return this.f45775a;
        }

        @Override // com.pinterest.feature.home.model.HomeFeedTunerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final HomeFeedTunerLocation HOMEFEED_TUNER_INTERESTS = new HomeFeedTunerLocation() { // from class: com.pinterest.feature.home.model.HomeFeedTunerLocation.HOMEFEED_TUNER_INTERESTS

        /* renamed from: a, reason: collision with root package name */
        public final Class f45777a;

        {
            c2 experiments = getExperiments();
            experiments.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) experiments.f83317a;
            this.f45777a = (g1Var.o("android_curation_sba_hft_interest_tab", "enabled", z3Var) || g1Var.l("android_curation_sba_hft_interest_tab")) ? s.class : r.class;
        }

        @Override // com.pinterest.feature.home.model.HomeFeedTunerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45778a() {
            return this.f45777a;
        }

        @Override // com.pinterest.feature.home.model.HomeFeedTunerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final HomeFeedTunerLocation HOMEFEED_TUNER_PIN_ACTIVITY = new HomeFeedTunerLocation() { // from class: com.pinterest.feature.home.model.HomeFeedTunerLocation.HOMEFEED_TUNER_PIN_ACTIVITY

        /* renamed from: a, reason: collision with root package name */
        public final Class f45778a;

        {
            c2 experiments = getExperiments();
            experiments.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) experiments.f83317a;
            this.f45778a = (g1Var.o("android_curation_sba_hft_pins_tab", "enabled", z3Var) || g1Var.l("android_curation_sba_hft_pins_tab")) ? n.class : it0.c.class;
        }

        @Override // com.pinterest.feature.home.model.HomeFeedTunerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45778a() {
            return this.f45778a;
        }

        @Override // com.pinterest.feature.home.model.HomeFeedTunerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final HomeFeedTunerLocation HOMEFEED_TUNER_FOLLOWING = new HomeFeedTunerLocation() { // from class: com.pinterest.feature.home.model.HomeFeedTunerLocation.HOMEFEED_TUNER_FOLLOWING

        /* renamed from: a, reason: collision with root package name */
        public final Class f45776a;

        {
            c2 experiments = getExperiments();
            experiments.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) experiments.f83317a;
            this.f45776a = (g1Var.o("android_curation_sba_hft_following_tab", "enabled", z3Var) || g1Var.l("android_curation_sba_hft_following_tab")) ? bt0.j.class : ht0.i.class;
        }

        @Override // com.pinterest.feature.home.model.HomeFeedTunerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45778a() {
            return this.f45776a;
        }

        @Override // com.pinterest.feature.home.model.HomeFeedTunerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final HomeFeedTunerLocation GESTALT_SHEET_HOMEFEED_TUNER_DEMO = new HomeFeedTunerLocation() { // from class: com.pinterest.feature.home.model.HomeFeedTunerLocation.GESTALT_SHEET_HOMEFEED_TUNER_DEMO

        /* renamed from: a, reason: collision with root package name */
        public final Class f45771a = jt0.d.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f45772b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f45773c = true;

        @Override // com.pinterest.feature.home.model.HomeFeedTunerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45778a() {
            return this.f45771a;
        }

        @Override // com.pinterest.feature.home.model.HomeFeedTunerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF45772b() {
            return this.f45772b;
        }

        @Override // com.pinterest.feature.home.model.HomeFeedTunerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }

        @Override // com.pinterest.feature.home.model.HomeFeedTunerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF45773c() {
            return this.f45773c;
        }
    };

    private static final /* synthetic */ HomeFeedTunerLocation[] $values() {
        return new HomeFeedTunerLocation[]{HOMEFEED_TUNER, HOMEFEED_TUNER_BOARD_RECOMMENDATIONS, HOMEFEED_TUNER_INTERESTS, HOMEFEED_TUNER_PIN_ACTIVITY, HOMEFEED_TUNER_FOLLOWING, GESTALT_SHEET_HOMEFEED_TUNER_DEMO};
    }

    static {
        HomeFeedTunerLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new l();
        CREATOR = new com.pinterest.feature.board.permissions.b(9);
    }

    public /* synthetic */ HomeFeedTunerLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static HomeFeedTunerLocation valueOf(String str) {
        return (HomeFeedTunerLocation) Enum.valueOf(HomeFeedTunerLocation.class, str);
    }

    public static HomeFeedTunerLocation[] values() {
        return (HomeFeedTunerLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public com.pinterest.framework.screens.g getF45386b() {
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
    public abstract /* synthetic */ Class getF45778a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45772b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45388d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF45109b() {
        return super.getF45109b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF45773c() {
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

    private HomeFeedTunerLocation(String str, int i13) {
    }
}
