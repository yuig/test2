package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dh.b;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
/* loaded from: classes3.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @NonNull
    public static final Parcelable.Creator<DataHolder> CREATOR = new b(19);

    /* renamed from: f, reason: collision with root package name */
    public final int f30919f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f30920g;

    /* renamed from: h, reason: collision with root package name */
    public Bundle f30921h;

    /* renamed from: i, reason: collision with root package name */
    public final CursorWindow[] f30922i;

    /* renamed from: j, reason: collision with root package name */
    public final int f30923j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f30924k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f30925l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f30926m = false;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f30927n = true;

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i13, String[] strArr, CursorWindow[] cursorWindowArr, int i14, Bundle bundle) {
        this.f30919f = i13;
        this.f30920g = strArr;
        this.f30922i = cursorWindowArr;
        this.f30923j = i14;
        this.f30924k = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                if (!this.f30926m) {
                    this.f30926m = true;
                    int i13 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f30922i;
                        if (i13 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i13].close();
                        i13++;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void finalize() {
        boolean z13;
        try {
            if (this.f30927n && this.f30922i.length > 0) {
                synchronized (this) {
                    z13 = this.f30926m;
                }
                if (!z13) {
                    close();
                    Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        String[] strArr = this.f30920g;
        if (strArr != null) {
            int M22 = c.M2(parcel, 1);
            parcel.writeStringArray(strArr);
            c.N2(parcel, M22);
        }
        c.K2(parcel, 2, this.f30922i, i13);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f30923j);
        c.A2(parcel, 4, this.f30924k);
        c.O2(parcel, 1000, 4);
        parcel.writeInt(this.f30919f);
        c.N2(parcel, M2);
        if ((i13 & 1) != 0) {
            close();
        }
    }
}
