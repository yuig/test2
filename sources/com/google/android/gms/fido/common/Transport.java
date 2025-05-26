package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import gi.v1;
import gi.w1;
import gi.x1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    HYBRID("cable"),
    HYBRID_V2("hybrid");


    @NonNull
    public static final Parcelable.Creator<Transport> CREATOR = new a();
    private final String zzc;

    public static class UnsupportedTransportException extends Exception {
    }

    Transport(String str) {
        this.zzc = str;
    }

    @NonNull
    public static Transport fromString(@NonNull String str) {
        if (str.equals("hybrid")) {
            ((x1) ((w1) v1.f65124b.f65125a.f65109a)).getClass();
            x1.f65132a.h();
            throw null;
        }
        for (Transport transport : values()) {
            if (str.equals(transport.zzc)) {
                return transport;
            }
        }
        throw new UnsupportedTransportException(a.a.k("Transport ", str, " not supported"));
    }

    @NonNull
    public static List<Transport> parseTransports(@NonNull JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        HashSet hashSet = new HashSet(jSONArray.length());
        for (int i13 = 0; i13 < jSONArray.length(); i13++) {
            String string = jSONArray.getString(i13);
            if (string != null && !string.isEmpty()) {
                try {
                    hashSet.add(fromString(string));
                } catch (UnsupportedTransportException unused) {
                    Log.w("Transport", "Ignoring unrecognized transport ".concat(string));
                }
            }
        }
        return new ArrayList(hashSet);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i13) {
        parcel.writeString(this.zzc);
    }
}
