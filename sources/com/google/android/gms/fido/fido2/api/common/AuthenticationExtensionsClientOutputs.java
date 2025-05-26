package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new vh.f(7);

    /* renamed from: f, reason: collision with root package name */
    public final UvmEntries f31086f;

    /* renamed from: g, reason: collision with root package name */
    public final zzf f31087g;

    /* renamed from: h, reason: collision with root package name */
    public final AuthenticationExtensionsCredPropsOutputs f31088h;

    /* renamed from: i, reason: collision with root package name */
    public final zzh f31089i;

    /* renamed from: j, reason: collision with root package name */
    public final String f31090j;

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzfVar, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzhVar, String str) {
        this.f31086f = uvmEntries;
        this.f31087g = zzfVar;
        this.f31088h = authenticationExtensionsCredPropsOutputs;
        this.f31089i = zzhVar;
        this.f31090j = str;
    }

    public final JSONObject e() {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.f31088h;
            if (authenticationExtensionsCredPropsOutputs != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", authenticationExtensionsCredPropsOutputs.f31091f);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e13) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e13);
                }
            }
            UvmEntries uvmEntries = this.f31086f;
            if (uvmEntries != null) {
                jSONObject.put("uvm", uvmEntries.e());
            }
            zzh zzhVar = this.f31089i;
            if (zzhVar != null) {
                jSONObject.put("prf", zzhVar.e());
            }
            String str = this.f31090j;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e14) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e14);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return com.bumptech.glide.c.x(this.f31086f, authenticationExtensionsClientOutputs.f31086f) && com.bumptech.glide.c.x(this.f31087g, authenticationExtensionsClientOutputs.f31087g) && com.bumptech.glide.c.x(this.f31088h, authenticationExtensionsClientOutputs.f31088h) && com.bumptech.glide.c.x(this.f31089i, authenticationExtensionsClientOutputs.f31089i) && com.bumptech.glide.c.x(this.f31090j, authenticationExtensionsClientOutputs.f31090j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31086f, this.f31087g, this.f31088h, this.f31089i, this.f31090j});
    }

    public final String toString() {
        return a.a.k("AuthenticationExtensionsClientOutputs{", e().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.H2(parcel, 1, this.f31086f, i13, false);
        bs1.c.H2(parcel, 2, this.f31087g, i13, false);
        bs1.c.H2(parcel, 3, this.f31088h, i13, false);
        bs1.c.H2(parcel, 4, this.f31089i, i13, false);
        bs1.c.I2(parcel, 5, this.f31090j, false);
        bs1.c.N2(parcel, M2);
    }
}
