package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import bs1.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes3.dex */
public class RegisteredKey extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RegisteredKey> CREATOR = new wh.a(0);

    /* renamed from: f, reason: collision with root package name */
    public final KeyHandle f31219f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31220g;

    /* renamed from: h, reason: collision with root package name */
    public final String f31221h;

    public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
        d.t(keyHandle);
        this.f31219f = keyHandle;
        this.f31221h = str;
        this.f31220g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = this.f31221h;
        if (str == null) {
            if (registeredKey.f31221h != null) {
                return false;
            }
        } else if (!str.equals(registeredKey.f31221h)) {
            return false;
        }
        if (!this.f31219f.equals(registeredKey.f31219f)) {
            return false;
        }
        String str2 = registeredKey.f31220g;
        String str3 = this.f31220g;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f31221h;
        int hashCode = this.f31219f.hashCode() + (((str == null ? 0 : str.hashCode()) + 31) * 31);
        String str2 = this.f31220g;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        KeyHandle keyHandle = this.f31219f;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(keyHandle.f31202g, 11));
            ProtocolVersion protocolVersion = keyHandle.f31203h;
            if (protocolVersion != ProtocolVersion.UNKNOWN) {
                jSONObject.put("version", protocolVersion.toString());
            }
            List list = keyHandle.f31204i;
            if (list != null) {
                jSONObject.put("transports", list.toString());
            }
            String str = this.f31221h;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f31220g;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e13) {
            throw new RuntimeException(e13);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.H2(parcel, 2, this.f31219f, i13, false);
        c.I2(parcel, 3, this.f31221h, false);
        c.I2(parcel, 4, this.f31220g, false);
        c.N2(parcel, M2);
    }
}
