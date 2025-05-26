package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class UvmEntries extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UvmEntries> CREATOR = new vh.f(5);

    /* renamed from: f, reason: collision with root package name */
    public final List f31172f;

    public UvmEntries(ArrayList arrayList) {
        this.f31172f = arrayList;
    }

    public final JSONArray e() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.f31172f;
            if (list != null) {
                for (int i13 = 0; i13 < list.size(); i13++) {
                    UvmEntry uvmEntry = (UvmEntry) list.get(i13);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) uvmEntry.f31175h);
                    jSONArray2.put((int) uvmEntry.f31174g);
                    jSONArray2.put((int) uvmEntry.f31175h);
                    jSONArray.put(i13, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e13) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e13);
        }
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        UvmEntries uvmEntries = (UvmEntries) obj;
        List list2 = this.f31172f;
        return (list2 == null && uvmEntries.f31172f == null) || (list2 != null && (list = uvmEntries.f31172f) != null && list2.containsAll(list) && uvmEntries.f31172f.containsAll(list2));
    }

    public final int hashCode() {
        Object[] objArr = new Object[1];
        List list = this.f31172f;
        objArr[0] = list == null ? null : new HashSet(list);
        return Arrays.hashCode(objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.L2(parcel, 1, this.f31172f, false);
        bs1.c.N2(parcel, M2);
    }
}
