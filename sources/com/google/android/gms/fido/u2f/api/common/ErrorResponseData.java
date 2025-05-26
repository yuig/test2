package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.bumptech.glide.c;
import gi.m;
import java.util.Arrays;
import kh2.r;
import vh.f;

@Deprecated
/* loaded from: classes3.dex */
public class ErrorResponseData extends ResponseData {

    @NonNull
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new f(25);

    /* renamed from: f, reason: collision with root package name */
    public final ErrorCode f31199f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31200g;

    public ErrorResponseData(int i13, String str) {
        this.f31199f = ErrorCode.toErrorCode(i13);
        this.f31200g = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        return c.x(this.f31199f, errorResponseData.f31199f) && c.x(this.f31200g, errorResponseData.f31200g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31199f, this.f31200g});
    }

    public final String toString() {
        m w13 = r.w1(this);
        String valueOf = String.valueOf(this.f31199f.getCode());
        gi.f fVar = new gi.f(0, 0);
        ((m) w13.f65095d).f65094c = fVar;
        w13.f65095d = fVar;
        fVar.f65095d = valueOf;
        fVar.f65093b = "errorCode";
        String str = this.f31200g;
        if (str != null) {
            w13.I(str, "errorMessage");
        }
        return w13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        int code = this.f31199f.getCode();
        bs1.c.O2(parcel, 2, 4);
        parcel.writeInt(code);
        bs1.c.I2(parcel, 3, this.f31200g, false);
        bs1.c.N2(parcel, M2);
    }
}
