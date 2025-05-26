package com.google.android.gms.fido.u2f.api.common;

import a.cb;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import vh.f;

@Deprecated
/* loaded from: classes3.dex */
public class KeyHandle extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<KeyHandle> CREATOR = new f(26);

    /* renamed from: f, reason: collision with root package name */
    public final int f31201f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f31202g;

    /* renamed from: h, reason: collision with root package name */
    public final ProtocolVersion f31203h;

    /* renamed from: i, reason: collision with root package name */
    public final List f31204i;

    public KeyHandle(int i13, byte[] bArr, String str, ArrayList arrayList) {
        this.f31201f = i13;
        this.f31202g = bArr;
        try {
            this.f31203h = ProtocolVersion.fromString(str);
            this.f31204i = arrayList;
        } catch (ProtocolVersion.UnsupportedProtocolException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        if (!Arrays.equals(this.f31202g, keyHandle.f31202g) || !this.f31203h.equals(keyHandle.f31203h)) {
            return false;
        }
        List list = this.f31204i;
        List list2 = keyHandle.f31204i;
        if (list == null && list2 == null) {
            return true;
        }
        return list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f31202g)), this.f31203h, this.f31204i});
    }

    public final String toString() {
        List list = this.f31204i;
        String obj = list == null ? "null" : list.toString();
        byte[] bArr = this.f31202g;
        StringBuilder o13 = cb.o("{keyHandle: ", bArr == null ? null : Base64.encodeToString(bArr, 0), ", version: ");
        o13.append(this.f31203h);
        o13.append(", transports: ");
        o13.append(obj);
        o13.append("}");
        return o13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31201f);
        c.B2(parcel, 2, this.f31202g, false);
        c.I2(parcel, 3, this.f31203h.toString(), false);
        c.L2(parcel, 4, this.f31204i, false);
        c.N2(parcel, M2);
    }
}
