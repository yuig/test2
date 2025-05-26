package com.pinterest.ads.screen;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import du.d;
import eu.e;
import ev.h;
import fu.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.c;
import lb.l0;
import lu.k;
import mt.y;
import oi.e7;
import org.jetbrains.annotations.NotNull;
import vs.u;
import vu.i;
import ws.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/pinterest/ads/screen/AdsLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/ads/screen/a", "ADS_REASONS", "ADS_CORE", "ADS_PROFILE", "ADS_BOARD", "ADS_STORY", "ADS_COLLECTION", "ADS_SHOWCASE", "ADS_QUIZ", "ADS_STANDARD_MDL_PLAYSTORE", "ADS_SHOPPING", "ADS_LEAD_GEN_SBA", "ADS_CARTING", "ADS_DEBUGGER", "ADS_COLLAGE", "ADS_STANDARD_SBA", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class AdsLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ AdsLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<AdsLocation> CREATOR;

    @NotNull
    public static final a Companion;
    public static final AdsLocation ADS_REASONS = new AdsLocation() { // from class: com.pinterest.ads.screen.AdsLocation.ADS_REASONS

        /* renamed from: a, reason: collision with root package name */
        public final Class f35449a = h.class;

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f35449a;
        }

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final AdsLocation ADS_CORE = new AdsLocation() { // from class: com.pinterest.ads.screen.AdsLocation.ADS_CORE

        /* renamed from: a, reason: collision with root package name */
        public final Class f35444a = fu.h.class;

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f35444a;
        }

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final AdsLocation ADS_PROFILE = new AdsLocation() { // from class: com.pinterest.ads.screen.AdsLocation.ADS_PROFILE

        /* renamed from: a, reason: collision with root package name */
        public final Class f35447a = c.class;

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f35447a;
        }

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final AdsLocation ADS_BOARD = new AdsLocation() { // from class: com.pinterest.ads.screen.AdsLocation.ADS_BOARD

        /* renamed from: a, reason: collision with root package name */
        public final Class f35440a = d.class;

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f35440a;
        }

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final AdsLocation ADS_STORY = new AdsLocation() { // from class: com.pinterest.ads.screen.AdsLocation.ADS_STORY

        /* renamed from: a, reason: collision with root package name */
        public final Class f35454a = av.d.class;

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f35454a;
        }

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final AdsLocation ADS_COLLECTION = new AdsLocation() { // from class: com.pinterest.ads.screen.AdsLocation.ADS_COLLECTION

        /* renamed from: a, reason: collision with root package name */
        public final Class f35443a = e.class;

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f35443a;
        }

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final AdsLocation ADS_SHOWCASE = new AdsLocation() { // from class: com.pinterest.ads.screen.AdsLocation.ADS_SHOWCASE

        /* renamed from: a, reason: collision with root package name */
        public final Class f35451a = wu.d.class;

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f35451a;
        }

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final AdsLocation ADS_QUIZ = new AdsLocation() { // from class: com.pinterest.ads.screen.AdsLocation.ADS_QUIZ

        /* renamed from: a, reason: collision with root package name */
        public final Class f35448a = k.class;

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f35448a;
        }

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final AdsLocation ADS_STANDARD_MDL_PLAYSTORE = new AdsLocation() { // from class: com.pinterest.ads.screen.AdsLocation.ADS_STANDARD_MDL_PLAYSTORE

        /* renamed from: a, reason: collision with root package name */
        public final Class f35452a = j.class;

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f35452a;
        }

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final AdsLocation ADS_SHOPPING = new AdsLocation() { // from class: com.pinterest.ads.screen.AdsLocation.ADS_SHOPPING

        /* renamed from: a, reason: collision with root package name */
        public final Class f35450a = i.class;

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f35450a;
        }

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final AdsLocation ADS_LEAD_GEN_SBA = new AdsLocation() { // from class: com.pinterest.ads.screen.AdsLocation.ADS_LEAD_GEN_SBA

        /* renamed from: a, reason: collision with root package name */
        public final Class f35446a = y.class;

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f35446a;
        }

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final AdsLocation ADS_CARTING = new AdsLocation() { // from class: com.pinterest.ads.screen.AdsLocation.ADS_CARTING

        /* renamed from: a, reason: collision with root package name */
        public final Class f35441a = o.class;

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f35441a;
        }

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final AdsLocation ADS_DEBUGGER = new AdsLocation() { // from class: com.pinterest.ads.screen.AdsLocation.ADS_DEBUGGER

        /* renamed from: a, reason: collision with root package name */
        public final Class f35445a = u.class;

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f35445a;
        }

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final AdsLocation ADS_COLLAGE = new AdsLocation() { // from class: com.pinterest.ads.screen.AdsLocation.ADS_COLLAGE

        /* renamed from: a, reason: collision with root package name */
        public final Class f35442a = ou.h.class;

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f35442a;
        }

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final AdsLocation ADS_STANDARD_SBA = new AdsLocation() { // from class: com.pinterest.ads.screen.AdsLocation.ADS_STANDARD_SBA

        /* renamed from: a, reason: collision with root package name */
        public final Class f35453a = uu.h.class;

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45169a() {
            return this.f35453a;
        }

        @Override // com.pinterest.ads.screen.AdsLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };

    private static final /* synthetic */ AdsLocation[] $values() {
        return new AdsLocation[]{ADS_REASONS, ADS_CORE, ADS_PROFILE, ADS_BOARD, ADS_STORY, ADS_COLLECTION, ADS_SHOWCASE, ADS_QUIZ, ADS_STANDARD_MDL_PLAYSTORE, ADS_SHOPPING, ADS_LEAD_GEN_SBA, ADS_CARTING, ADS_DEBUGGER, ADS_COLLAGE, ADS_STANDARD_SBA};
    }

    static {
        AdsLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new e7(28);
    }

    public /* synthetic */ AdsLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static AdsLocation valueOf(String str) {
        return (AdsLocation) Enum.valueOf(AdsLocation.class, str);
    }

    public static AdsLocation[] values() {
        return (AdsLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF48461b() {
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
    public abstract /* synthetic */ Class getF45169a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45170b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45172d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF46867b() {
        return super.getF46867b();
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

    private AdsLocation(String str, int i13) {
    }
}
