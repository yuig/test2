package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gi.j1;
import gi.k1;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new vh.f(11);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31188f;

    /* renamed from: g, reason: collision with root package name */
    public final j1 f31189g;

    public zzh(boolean z13, k1 k1Var) {
        this.f31188f = z13;
        this.f31189g = k1Var;
    }

    public final JSONObject e() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f31188f) {
                jSONObject.put("enabled", true);
            }
            j1 j1Var = this.f31189g;
            byte[] n13 = j1Var == null ? null : j1Var.n();
            if (n13 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(n13, 32), 11));
                if (n13.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(n13, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e13) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e13);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return this.f31188f == zzhVar.f31188f && com.bumptech.glide.c.x(this.f31189g, zzhVar.f31189g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f31188f), this.f31189g});
    }

    public final String toString() {
        return a.a.k("AuthenticationExtensionsPrfOutputs{", e().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31188f ? 1 : 0);
        j1 j1Var = this.f31189g;
        bs1.c.B2(parcel, 2, j1Var == null ? null : j1Var.n(), false);
        bs1.c.N2(parcel, M2);
    }
}
