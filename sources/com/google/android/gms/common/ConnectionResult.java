package com.google.android.gms.common;

import a.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.q4;
import i2.u1;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final int SUCCESS = 0;

    /* renamed from: f */
    public final int f30731f;

    /* renamed from: g */
    public final int f30732g;

    /* renamed from: h */
    public final PendingIntent f30733h;

    /* renamed from: i */
    public final String f30734i;

    /* renamed from: j */
    public static final ConnectionResult f30730j = new ConnectionResult(0);

    @NonNull
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new u1(14);

    public ConnectionResult(int i13, int i14, PendingIntent pendingIntent, String str) {
        this.f30731f = i13;
        this.f30732g = i14;
        this.f30733h = pendingIntent;
        this.f30734i = str;
    }

    public static String x1(int i13) {
        if (i13 == 99) {
            return "UNFINISHED";
        }
        if (i13 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i13) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i13) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return a.e("UNKNOWN_ERROR_CODE(", i13, ")");
                }
        }
    }

    public final int e() {
        return this.f30732g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f30732g == connectionResult.f30732g && c.x(this.f30733h, connectionResult.f30733h) && c.x(this.f30734i, connectionResult.f30734i);
    }

    public final String f() {
        return this.f30734i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f30732g), this.f30733h, this.f30734i});
    }

    public final boolean k1() {
        return (this.f30732g == 0 || this.f30733h == null) ? false : true;
    }

    public final String toString() {
        q4 q4Var = new q4(this);
        q4Var.m(x1(this.f30732g), "statusCode");
        q4Var.m(this.f30733h, "resolution");
        q4Var.m(this.f30734i, "message");
        return q4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30731f);
        bs1.c.O2(parcel, 2, 4);
        parcel.writeInt(this.f30732g);
        bs1.c.H2(parcel, 3, this.f30733h, i13, false);
        bs1.c.I2(parcel, 4, this.f30734i, false);
        bs1.c.N2(parcel, M2);
    }

    public ConnectionResult(int i13) {
        this(1, i13, null, null);
    }

    public ConnectionResult(int i13, PendingIntent pendingIntent) {
        this(1, i13, pendingIntent, null);
    }
}
