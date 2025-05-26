package com.pinterest.collagesCoreLibrary.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import nx.f1;
import org.jetbrains.annotations.NotNull;
import qa0.f;
import za0.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0018B\u001b\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\u0005R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0005j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lcom/pinterest/collagesCoreLibrary/model/CutoutPickerOrigin;", "", "Landroid/os/Parcelable;", "", "id", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "titleResId", "I", "getTitleResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "Companion", "za0/e", "None", "CutoutsForYou", "Boards", "YourCutouts", "RecentSaves", "collagesCoreLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CutoutPickerOrigin implements Parcelable {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ CutoutPickerOrigin[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<CutoutPickerOrigin> CREATOR;

    @NotNull
    public static final e Companion;
    private final int titleResId;

    @NotNull
    private final String type;
    public static final CutoutPickerOrigin None = new CutoutPickerOrigin("None", 0, "", 0);
    public static final CutoutPickerOrigin CutoutsForYou = new CutoutPickerOrigin("CutoutsForYou", 1, "collage_composer_card_cutouts_for_you", f.collage_content_recommended_title_cutouts_for_you);
    public static final CutoutPickerOrigin Boards = new CutoutPickerOrigin("Boards", 2, "collage_composer_card_your_boards", f.collage_content_recommended_title_your_boards);
    public static final CutoutPickerOrigin YourCutouts = new CutoutPickerOrigin("YourCutouts", 3, "collage_composer_card_your_cutouts", f.collage_content_recommended_title_your_cutouts);
    public static final CutoutPickerOrigin RecentSaves = new CutoutPickerOrigin("RecentSaves", 4, "collage_composer_card_recent_saves", f.collage_content_recommended_title_recent_saves);

    private static final /* synthetic */ CutoutPickerOrigin[] $values() {
        return new CutoutPickerOrigin[]{None, CutoutsForYou, Boards, YourCutouts, RecentSaves};
    }

    static {
        CutoutPickerOrigin[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new e();
        CREATOR = new f1(15);
    }

    private CutoutPickerOrigin(String str, int i13, String str2, int i14) {
        this.type = str2;
        this.titleResId = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static CutoutPickerOrigin valueOf(String str) {
        return (CutoutPickerOrigin) Enum.valueOf(CutoutPickerOrigin.class, str);
    }

    public static CutoutPickerOrigin[] values() {
        return (CutoutPickerOrigin[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final int id() {
        return ordinal();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(ordinal());
    }
}
