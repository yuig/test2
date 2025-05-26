package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class COSEAlgorithmIdentifier implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public final a f31114a;

    public static class UnsupportedAlgorithmIdentifierException extends Exception {
    }

    public COSEAlgorithmIdentifier(a aVar) {
        com.bumptech.glide.d.t(aVar);
        this.f31114a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static COSEAlgorithmIdentifier a(int i13) {
        vh.e eVar;
        if (i13 == vh.e.LEGACY_RS1.getAlgoValue()) {
            eVar = vh.e.RS1;
        } else {
            vh.e[] values = vh.e.values();
            int length = values.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    for (vh.e eVar2 : vh.b.values()) {
                        if (eVar2.getAlgoValue() == i13) {
                            eVar = eVar2;
                        }
                    }
                    throw new UnsupportedAlgorithmIdentifierException(a.a.e("Algorithm with COSE value ", i13, " not supported"));
                }
                vh.e eVar3 = values[i14];
                if (eVar3.getAlgoValue() == i13) {
                    eVar = eVar3;
                    break;
                }
                i14++;
            }
        }
        return new COSEAlgorithmIdentifier(eVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.f31114a.getAlgoValue() == ((COSEAlgorithmIdentifier) obj).f31114a.getAlgoValue();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31114a});
    }

    public final String toString() {
        return a.a.k("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.f31114a), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f31114a.getAlgoValue());
    }
}
