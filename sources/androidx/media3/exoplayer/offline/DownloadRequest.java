package androidx.media3.exoplayer.offline;

import a.d;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.StreamKey;
import bf.b;
import d7.n0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new d(29);

    /* renamed from: a, reason: collision with root package name */
    public final String f18829a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f18830b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18831c;

    /* renamed from: d, reason: collision with root package name */
    public final List f18832d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f18833e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18834f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f18835g;

    /* renamed from: h, reason: collision with root package name */
    public final ByteRange f18836h;

    public static final class ByteRange implements Parcelable {
        public static final Parcelable.Creator<ByteRange> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final long f18837a;

        /* renamed from: b, reason: collision with root package name */
        public final long f18838b;

        public ByteRange(Parcel parcel) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            boolean z13 = true;
            b.i(readLong >= 0);
            if (readLong2 < 0 && readLong2 != -1) {
                z13 = false;
            }
            b.i(z13);
            this.f18837a = readLong;
            this.f18838b = readLong2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ByteRange)) {
                return false;
            }
            ByteRange byteRange = (ByteRange) obj;
            return this.f18837a == byteRange.f18837a && this.f18838b == byteRange.f18838b;
        }

        public final int hashCode() {
            return (((int) this.f18837a) * 961) + ((int) this.f18838b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.writeLong(this.f18837a);
            parcel.writeLong(this.f18838b);
        }
    }

    public static class UnsupportedRequestException extends IOException {
    }

    public DownloadRequest(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, ByteRange byteRange) {
        int O = n0.O(uri, str2);
        if (O == 0 || O == 2 || O == 1) {
            b.h("customCacheKey must be null for type: " + O, str3 == null);
            this.f18836h = null;
        } else {
            this.f18836h = byteRange;
        }
        this.f18829a = str;
        this.f18830b = uri;
        this.f18831c = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f18832d = Collections.unmodifiableList(arrayList);
        this.f18833e = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f18834f = str3;
        this.f18835g = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : n0.f53868c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f18829a.equals(downloadRequest.f18829a) && this.f18830b.equals(downloadRequest.f18830b) && Objects.equals(this.f18831c, downloadRequest.f18831c) && this.f18832d.equals(downloadRequest.f18832d) && Arrays.equals(this.f18833e, downloadRequest.f18833e) && Objects.equals(this.f18834f, downloadRequest.f18834f) && Arrays.equals(this.f18835g, downloadRequest.f18835g) && Objects.equals(this.f18836h, downloadRequest.f18836h);
    }

    public final int hashCode() {
        int hashCode = (this.f18830b.hashCode() + (this.f18829a.hashCode() * 961)) * 31;
        String str = this.f18831c;
        int hashCode2 = (Arrays.hashCode(this.f18833e) + ((this.f18832d.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f18834f;
        int hashCode3 = (Arrays.hashCode(this.f18835g) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        ByteRange byteRange = this.f18836h;
        return hashCode3 + (byteRange != null ? byteRange.hashCode() : 0);
    }

    public final String toString() {
        return this.f18831c + ":" + this.f18829a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f18829a);
        parcel.writeString(this.f18830b.toString());
        parcel.writeString(this.f18831c);
        List list = this.f18832d;
        parcel.writeInt(list.size());
        for (int i14 = 0; i14 < list.size(); i14++) {
            parcel.writeParcelable((Parcelable) list.get(i14), 0);
        }
        parcel.writeByteArray(this.f18833e);
        parcel.writeString(this.f18834f);
        parcel.writeByteArray(this.f18835g);
        parcel.writeParcelable(this.f18836h, 0);
    }

    public DownloadRequest(Parcel parcel) {
        String readString = parcel.readString();
        int i13 = n0.f53866a;
        this.f18829a = readString;
        this.f18830b = Uri.parse(parcel.readString());
        this.f18831c = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i14 = 0; i14 < readInt; i14++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f18832d = Collections.unmodifiableList(arrayList);
        this.f18833e = parcel.createByteArray();
        this.f18834f = parcel.readString();
        this.f18835g = parcel.createByteArray();
        this.f18836h = (ByteRange) parcel.readParcelable(ByteRange.class.getClassLoader());
    }
}
