package com.pinterest.education.user.signals;

import android.os.Parcel;
import android.os.Parcelable;
import el2.a;
import fg0.b;
import h32.a4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import m60.x0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u001bB)\b\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017j\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/pinterest/education/user/signals/UserSignalFields;", "", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "titleId", "I", "getTitleId", "detailId", "getDetailId", "hintId", "getHintId", "Lh32/a4;", "viewParameterType", "Lh32/a4;", "getViewParameterType", "()Lh32/a4;", "<init>", "(Ljava/lang/String;IIIILh32/a4;)V", "CREATOR", "fg0/b", "NAME", "SURNAME", "AGE", "GENDER", "userSignalsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class UserSignalFields implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UserSignalFields[] $VALUES;
    public static final UserSignalFields AGE;

    @NotNull
    public static final b CREATOR;
    public static final UserSignalFields GENDER;
    public static final UserSignalFields NAME;
    public static final UserSignalFields SURNAME;
    private final int detailId;
    private final int hintId;
    private final int titleId;

    @NotNull
    private final a4 viewParameterType;

    private static final /* synthetic */ UserSignalFields[] $values() {
        return new UserSignalFields[]{NAME, SURNAME, AGE, GENDER};
    }

    static {
        int i13 = x0.without_name_title;
        int i14 = x0.name_usage_detail;
        int i15 = x0.name_hint;
        a4 a4Var = a4.USER_SIGNAL_NAME;
        NAME = new UserSignalFields("NAME", 0, i13, i14, i15, a4Var);
        SURNAME = new UserSignalFields("SURNAME", 1, x0.update_name_title, x0.name_usage_detail, x0.name_hint, a4Var);
        AGE = new UserSignalFields("AGE", 2, x0.without_age_title, x0.age_usage_detail, x0.age_hint, a4.USER_SIGNAL_AGE);
        GENDER = new UserSignalFields("GENDER", 3, x0.without_gender_title, x0.gender_usage_detail, x0.gender_hint, a4.USER_SIGNAL_GENDER);
        UserSignalFields[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        CREATOR = new b();
    }

    private UserSignalFields(String str, int i13, int i14, int i15, int i16, a4 a4Var) {
        this.titleId = i14;
        this.detailId = i15;
        this.hintId = i16;
        this.viewParameterType = a4Var;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static UserSignalFields valueOf(String str) {
        return (UserSignalFields) Enum.valueOf(UserSignalFields.class, str);
    }

    public static UserSignalFields[] values() {
        return (UserSignalFields[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getDetailId() {
        return this.detailId;
    }

    public final int getHintId() {
        return this.hintId;
    }

    public final int getTitleId() {
        return this.titleId;
    }

    @NotNull
    public final a4 getViewParameterType() {
        return this.viewParameterType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.titleId);
        parcel.writeInt(this.detailId);
        parcel.writeInt(this.hintId);
    }
}
