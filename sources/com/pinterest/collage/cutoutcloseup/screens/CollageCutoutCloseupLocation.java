package com.pinterest.collage.cutoutcloseup.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import g90.n;
import h90.r;
import k90.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import nx.f1;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/pinterest/collage/cutoutcloseup/screens/CollageCutoutCloseupLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/collage/cutoutcloseup/screens/a", "COLLAGES_BOTTOM_SHEET_FRAGMENT", "COLLAGE_CUTOUT_CLOSEUP", "COLLAGE_CUTOUT_CLOSEUP_ITEM", "cutoutCloseup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class CollageCutoutCloseupLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ CollageCutoutCloseupLocation[] $VALUES;
    public static final CollageCutoutCloseupLocation COLLAGES_BOTTOM_SHEET_FRAGMENT = new CollageCutoutCloseupLocation() { // from class: com.pinterest.collage.cutoutcloseup.screens.CollageCutoutCloseupLocation.COLLAGES_BOTTOM_SHEET_FRAGMENT

        /* renamed from: a, reason: collision with root package name */
        public final Class f44616a = c.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f44617b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f44618c = true;

        @Override // com.pinterest.collage.cutoutcloseup.screens.CollageCutoutCloseupLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44622a() {
            return this.f44616a;
        }

        @Override // com.pinterest.collage.cutoutcloseup.screens.CollageCutoutCloseupLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF44620b() {
            return this.f44617b;
        }

        @Override // com.pinterest.collage.cutoutcloseup.screens.CollageCutoutCloseupLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF44621c() {
            return this.f44618c;
        }

        @Override // com.pinterest.collage.cutoutcloseup.screens.CollageCutoutCloseupLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };
    public static final CollageCutoutCloseupLocation COLLAGE_CUTOUT_CLOSEUP = new CollageCutoutCloseupLocation() { // from class: com.pinterest.collage.cutoutcloseup.screens.CollageCutoutCloseupLocation.COLLAGE_CUTOUT_CLOSEUP

        /* renamed from: a, reason: collision with root package name */
        public final Class f44619a = n.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f44620b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f44621c = true;

        @Override // com.pinterest.collage.cutoutcloseup.screens.CollageCutoutCloseupLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44622a() {
            return this.f44619a;
        }

        @Override // com.pinterest.collage.cutoutcloseup.screens.CollageCutoutCloseupLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF44620b() {
            return this.f44620b;
        }

        @Override // com.pinterest.collage.cutoutcloseup.screens.CollageCutoutCloseupLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF44621c() {
            return this.f44621c;
        }

        @Override // com.pinterest.collage.cutoutcloseup.screens.CollageCutoutCloseupLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };
    public static final CollageCutoutCloseupLocation COLLAGE_CUTOUT_CLOSEUP_ITEM = new CollageCutoutCloseupLocation() { // from class: com.pinterest.collage.cutoutcloseup.screens.CollageCutoutCloseupLocation.COLLAGE_CUTOUT_CLOSEUP_ITEM

        /* renamed from: a, reason: collision with root package name */
        public final Class f44622a = r.class;

        @Override // com.pinterest.collage.cutoutcloseup.screens.CollageCutoutCloseupLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44622a() {
            return this.f44622a;
        }

        @Override // com.pinterest.collage.cutoutcloseup.screens.CollageCutoutCloseupLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };

    @NotNull
    public static final Parcelable.Creator<CollageCutoutCloseupLocation> CREATOR;

    @NotNull
    public static final a Companion;

    private static final /* synthetic */ CollageCutoutCloseupLocation[] $values() {
        return new CollageCutoutCloseupLocation[]{COLLAGES_BOTTOM_SHEET_FRAGMENT, COLLAGE_CUTOUT_CLOSEUP, COLLAGE_CUTOUT_CLOSEUP_ITEM};
    }

    static {
        CollageCutoutCloseupLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new f1(8);
    }

    public /* synthetic */ CollageCutoutCloseupLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static CollageCutoutCloseupLocation valueOf(String str) {
        return (CollageCutoutCloseupLocation) Enum.valueOf(CollageCutoutCloseupLocation.class, str);
    }

    public static CollageCutoutCloseupLocation[] values() {
        return (CollageCutoutCloseupLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF45247b() {
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
    public abstract /* synthetic */ Class getF44622a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF44620b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF44621c() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF44665b() {
        return super.getF44665b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF48116c() {
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

    private CollageCutoutCloseupLocation(String str, int i13) {
    }
}
