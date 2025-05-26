package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import oi.e7;

/* loaded from: classes3.dex */
public class LineApiError implements Parcelable {
    public static final Parcelable.Creator<LineApiError> CREATOR = new e7(11);

    /* renamed from: d, reason: collision with root package name */
    public static final LineApiError f34025d = new LineApiError(-1, "", rn.a.NOT_DEFINED);

    /* renamed from: a, reason: collision with root package name */
    public final int f34026a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34027b;

    /* renamed from: c, reason: collision with root package name */
    public final rn.a f34028c;

    public LineApiError(String str) {
        this(-1, str, rn.a.NOT_DEFINED);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineApiError)) {
            return false;
        }
        LineApiError lineApiError = (LineApiError) obj;
        return this.f34026a == lineApiError.f34026a && Objects.equals(this.f34027b, lineApiError.f34027b) && this.f34028c == lineApiError.f34028c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f34026a), this.f34027b, this.f34028c);
    }

    public final String toString() {
        return "LineApiError{httpResponseCode=" + this.f34026a + ", message='" + this.f34027b + "', errorCode='" + this.f34028c + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f34026a);
        parcel.writeString(this.f34027b);
        rn.a aVar = this.f34028c;
        parcel.writeInt(aVar == null ? -1 : aVar.ordinal());
    }

    public LineApiError(int i13, String str, rn.a aVar) {
        this.f34026a = i13;
        this.f34027b = str;
        this.f34028c = aVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LineApiError(java.lang.Exception r3) {
        /*
            r2 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            r3.printStackTrace(r1)
            java.lang.String r3 = r0.toString()
            rn.a r0 = rn.a.NOT_DEFINED
            r1 = -1
            r2.<init>(r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.linecorp.linesdk.LineApiError.<init>(java.lang.Exception):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LineApiError(java.lang.Exception r3, rn.a r4) {
        /*
            r2 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            r3.printStackTrace(r1)
            java.lang.String r3 = r0.toString()
            r0 = -1
            r2.<init>(r0, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.linecorp.linesdk.LineApiError.<init>(java.lang.Exception, rn.a):void");
    }

    public LineApiError(Parcel parcel) {
        this.f34026a = parcel.readInt();
        this.f34027b = parcel.readString();
        int readInt = parcel.readInt();
        this.f34028c = readInt == -1 ? null : rn.a.values()[readInt];
    }
}
