package com.pinterest.feature.search;

import android.os.Parcel;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import d91.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l81.l;
import lb.l0;
import lh0.c2;
import org.jetbrains.annotations.NotNull;
import u81.r;
import x81.f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/pinterest/feature/search/VisualSearchLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "onScreenNavigation", "()V", "describeContents", "()I", "Llh0/c2;", "getExperiments", "()Llh0/c2;", "experiments", "<init>", "(Ljava/lang/String;I)V", "CREATOR", "com/pinterest/feature/search/d", "CAMERA_SEARCH", "PINCH_TO_ZOOM_FLASHLIGHT", "VIRTUAL_TRY_ON", "VTO_PRODUCT_TAGGING", "COLLAGE_CANVAS_EDITOR_PAGE", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class VisualSearchLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ VisualSearchLocation[] $VALUES;

    @NotNull
    public static final d CREATOR;
    public static final VisualSearchLocation CAMERA_SEARCH = new VisualSearchLocation() { // from class: com.pinterest.feature.search.VisualSearchLocation.CAMERA_SEARCH

        /* renamed from: a, reason: collision with root package name */
        public final Class f47604a = r.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f47605b = true;

        @Override // com.pinterest.feature.search.VisualSearchLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47612a() {
            return this.f47604a;
        }

        @Override // com.pinterest.feature.search.VisualSearchLocation, com.pinterest.framework.screens.ScreenLocation
        public final boolean getShouldShowMainNavigation() {
            return false;
        }

        @Override // com.pinterest.feature.search.VisualSearchLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF47609b() {
            return this.f47605b;
        }
    };
    public static final VisualSearchLocation PINCH_TO_ZOOM_FLASHLIGHT = new VisualSearchLocation() { // from class: com.pinterest.feature.search.VisualSearchLocation.PINCH_TO_ZOOM_FLASHLIGHT

        /* renamed from: a, reason: collision with root package name */
        public final Class f47608a = l.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f47609b = true;

        @Override // com.pinterest.feature.search.VisualSearchLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47612a() {
            return this.f47608a;
        }

        @Override // com.pinterest.feature.search.VisualSearchLocation, com.pinterest.framework.screens.ScreenLocation
        public final boolean getShouldShowMainNavigation() {
            return false;
        }

        @Override // com.pinterest.feature.search.VisualSearchLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF47609b() {
            return this.f47609b;
        }
    };
    public static final VisualSearchLocation VIRTUAL_TRY_ON = new VisualSearchLocation() { // from class: com.pinterest.feature.search.VisualSearchLocation.VIRTUAL_TRY_ON

        /* renamed from: a, reason: collision with root package name */
        public final Class f47610a = f0.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f47611b = g.MODAL;

        @Override // com.pinterest.feature.search.VisualSearchLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF47611b() {
            return this.f47611b;
        }

        @Override // com.pinterest.feature.search.VisualSearchLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47612a() {
            return this.f47610a;
        }

        @Override // com.pinterest.feature.search.VisualSearchLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible */
        public final boolean getF47613b() {
            return false;
        }

        @Override // com.pinterest.feature.search.VisualSearchLocation, com.pinterest.framework.screens.ScreenLocation
        public final boolean getShouldShowMainNavigation() {
            return false;
        }
    };
    public static final VisualSearchLocation VTO_PRODUCT_TAGGING = new VisualSearchLocation() { // from class: com.pinterest.feature.search.VisualSearchLocation.VTO_PRODUCT_TAGGING

        /* renamed from: a, reason: collision with root package name */
        public final Class f47612a = j.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f47613b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f47614c = true;

        @Override // com.pinterest.feature.search.VisualSearchLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47612a() {
            return this.f47612a;
        }

        @Override // com.pinterest.feature.search.VisualSearchLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF47613b() {
            return this.f47613b;
        }

        @Override // com.pinterest.feature.search.VisualSearchLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF47614c() {
            return this.f47614c;
        }

        @Override // com.pinterest.feature.search.VisualSearchLocation, com.pinterest.framework.screens.ScreenLocation
        public final boolean getShouldShowMainNavigation() {
            return false;
        }
    };
    public static final VisualSearchLocation COLLAGE_CANVAS_EDITOR_PAGE = new VisualSearchLocation() { // from class: com.pinterest.feature.search.VisualSearchLocation.COLLAGE_CANVAS_EDITOR_PAGE

        /* renamed from: a, reason: collision with root package name */
        public final Class f47606a = e81.d.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f47607b = true;

        @Override // com.pinterest.feature.search.VisualSearchLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF47612a() {
            return this.f47606a;
        }

        @Override // com.pinterest.feature.search.VisualSearchLocation, com.pinterest.framework.screens.ScreenLocation
        public final boolean getShouldShowMainNavigation() {
            return false;
        }

        @Override // com.pinterest.feature.search.VisualSearchLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF47609b() {
            return this.f47607b;
        }
    };

    private static final /* synthetic */ VisualSearchLocation[] $values() {
        return new VisualSearchLocation[]{CAMERA_SEARCH, PINCH_TO_ZOOM_FLASHLIGHT, VIRTUAL_TRY_ON, VTO_PRODUCT_TAGGING, COLLAGE_CANVAS_EDITOR_PAGE};
    }

    static {
        VisualSearchLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        CREATOR = new d();
    }

    public /* synthetic */ VisualSearchLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static VisualSearchLocation valueOf(String str) {
        return (VisualSearchLocation) Enum.valueOf(VisualSearchLocation.class, str);
    }

    public static VisualSearchLocation[] values() {
        return (VisualSearchLocation[]) $VALUES.clone();
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

    private VisualSearchLocation(String str, int i13) {
    }
}
