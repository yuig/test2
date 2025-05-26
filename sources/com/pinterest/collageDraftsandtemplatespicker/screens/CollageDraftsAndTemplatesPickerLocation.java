package com.pinterest.collageDraftsandtemplatespicker.screens;

import android.os.Parcel;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import el2.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import pa0.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/pinterest/collageDraftsandtemplatespicker/screens/CollageDraftsAndTemplatesPickerLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "(Ljava/lang/String;I)V", "describeContents", "", "onScreenNavigation", "", "COLLAGE_DRAFTS_AND_TEMPLATES_PICKER", "draftsAndTemplatesPicker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CollageDraftsAndTemplatesPickerLocation implements ScreenLocation {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CollageDraftsAndTemplatesPickerLocation[] $VALUES;
    public static final CollageDraftsAndTemplatesPickerLocation COLLAGE_DRAFTS_AND_TEMPLATES_PICKER = new CollageDraftsAndTemplatesPickerLocation() { // from class: com.pinterest.collageDraftsandtemplatespicker.screens.CollageDraftsAndTemplatesPickerLocation.COLLAGE_DRAFTS_AND_TEMPLATES_PICKER

        /* renamed from: a, reason: collision with root package name */
        public final Class f44667a = c.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f44668b = g.MODAL;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f44669c = true;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f44670d = true;

        @Override // com.pinterest.collageDraftsandtemplatespicker.screens.CollageDraftsAndTemplatesPickerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF44668b() {
            return this.f44668b;
        }

        @Override // com.pinterest.collageDraftsandtemplatespicker.screens.CollageDraftsAndTemplatesPickerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44667a() {
            return this.f44667a;
        }

        @Override // com.pinterest.collageDraftsandtemplatespicker.screens.CollageDraftsAndTemplatesPickerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF44669c() {
            return this.f44669c;
        }

        @Override // com.pinterest.collageDraftsandtemplatespicker.screens.CollageDraftsAndTemplatesPickerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }

        @Override // com.pinterest.collageDraftsandtemplatespicker.screens.CollageDraftsAndTemplatesPickerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF44670d() {
            return this.f44670d;
        }
    };

    private static final /* synthetic */ CollageDraftsAndTemplatesPickerLocation[] $values() {
        return new CollageDraftsAndTemplatesPickerLocation[]{COLLAGE_DRAFTS_AND_TEMPLATES_PICKER};
    }

    static {
        CollageDraftsAndTemplatesPickerLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    public /* synthetic */ CollageDraftsAndTemplatesPickerLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static CollageDraftsAndTemplatesPickerLocation valueOf(String str) {
        return (CollageDraftsAndTemplatesPickerLocation) Enum.valueOf(CollageDraftsAndTemplatesPickerLocation.class, str);
    }

    public static CollageDraftsAndTemplatesPickerLocation[] values() {
        return (CollageDraftsAndTemplatesPickerLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF44668b() {
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
    public abstract /* synthetic */ Class getF44667a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF44669c() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45101d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF45109b() {
        return super.getF45109b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF44670d() {
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
    public /* bridge */ /* synthetic */ void writeToParcel(@NotNull Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
    }

    private CollageDraftsAndTemplatesPickerLocation(String str, int i13) {
    }
}
