package androidx.media3.exoplayer.offline;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.offline.DownloadRequest;

/* loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new DownloadRequest.ByteRange(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new DownloadRequest.ByteRange[i13];
    }
}
