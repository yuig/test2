package com.pinterest.collage.cutoutpicker.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import m90.i0;
import m90.w;
import nx.f1;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/pinterest/collage/cutoutpicker/screens/CollageCutoutPickerLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/collage/cutoutpicker/screens/a", "COLLAGE_CUTOUT_PICKER", "COLLAGE_CUTOUT_PICKER_BOTTOMSHEET", "COLLAGE_CUTOUT_PICKER_CLOSEUP", "cutoutPicker_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class CollageCutoutPickerLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ CollageCutoutPickerLocation[] $VALUES;
    public static final CollageCutoutPickerLocation COLLAGE_CUTOUT_PICKER = new CollageCutoutPickerLocation() { // from class: com.pinterest.collage.cutoutpicker.screens.CollageCutoutPickerLocation.COLLAGE_CUTOUT_PICKER

        /* renamed from: a, reason: collision with root package name */
        public final Class f44631a = w.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f44632b = g.MODAL;

        @Override // com.pinterest.collage.cutoutpicker.screens.CollageCutoutPickerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF44632b() {
            return this.f44632b;
        }

        @Override // com.pinterest.collage.cutoutpicker.screens.CollageCutoutPickerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44636a() {
            return this.f44631a;
        }

        @Override // com.pinterest.collage.cutoutpicker.screens.CollageCutoutPickerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final CollageCutoutPickerLocation COLLAGE_CUTOUT_PICKER_BOTTOMSHEET = new CollageCutoutPickerLocation() { // from class: com.pinterest.collage.cutoutpicker.screens.CollageCutoutPickerLocation.COLLAGE_CUTOUT_PICKER_BOTTOMSHEET

        /* renamed from: a, reason: collision with root package name */
        public final Class f44633a = i0.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f44634b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f44635c = true;

        @Override // com.pinterest.collage.cutoutpicker.screens.CollageCutoutPickerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44636a() {
            return this.f44633a;
        }

        @Override // com.pinterest.collage.cutoutpicker.screens.CollageCutoutPickerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF44634b() {
            return this.f44634b;
        }

        @Override // com.pinterest.collage.cutoutpicker.screens.CollageCutoutPickerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }

        @Override // com.pinterest.collage.cutoutpicker.screens.CollageCutoutPickerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF44635c() {
            return this.f44635c;
        }
    };
    public static final CollageCutoutPickerLocation COLLAGE_CUTOUT_PICKER_CLOSEUP = new CollageCutoutPickerLocation() { // from class: com.pinterest.collage.cutoutpicker.screens.CollageCutoutPickerLocation.COLLAGE_CUTOUT_PICKER_CLOSEUP

        /* renamed from: a, reason: collision with root package name */
        public final Class f44636a = p90.w.class;

        @Override // com.pinterest.collage.cutoutpicker.screens.CollageCutoutPickerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44636a() {
            return this.f44636a;
        }

        @Override // com.pinterest.collage.cutoutpicker.screens.CollageCutoutPickerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };

    @NotNull
    public static final Parcelable.Creator<CollageCutoutPickerLocation> CREATOR;

    @NotNull
    public static final a Companion;

    private static final /* synthetic */ CollageCutoutPickerLocation[] $values() {
        return new CollageCutoutPickerLocation[]{COLLAGE_CUTOUT_PICKER, COLLAGE_CUTOUT_PICKER_BOTTOMSHEET, COLLAGE_CUTOUT_PICKER_CLOSEUP};
    }

    static {
        CollageCutoutPickerLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new f1(9);
    }

    public /* synthetic */ CollageCutoutPickerLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static CollageCutoutPickerLocation valueOf(String str) {
        return (CollageCutoutPickerLocation) Enum.valueOf(CollageCutoutPickerLocation.class, str);
    }

    public static CollageCutoutPickerLocation[] values() {
        return (CollageCutoutPickerLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF44632b() {
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
    public abstract /* synthetic */ Class getF44636a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF44634b() {
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
    public /* bridge */ /* synthetic */ boolean getF44635c() {
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

    private CollageCutoutPickerLocation(String str, int i13) {
    }
}
