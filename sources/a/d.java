package a;

import ads_mobile_sdk.b22;
import ads_mobile_sdk.h70;
import ads_mobile_sdk.kj0;
import ads_mobile_sdk.mj0;
import ads_mobile_sdk.z12;
import ads_mobile_sdk.zb0;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.compose.runtime.ParcelableSnapshotMutableDoubleState;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableByte;
import androidx.databinding.ObservableChar;
import androidx.databinding.ObservableDouble;
import androidx.databinding.ObservableFloat;
import androidx.databinding.ObservableInt;
import androidx.databinding.ObservableLong;
import androidx.databinding.ObservableParcelable;
import androidx.databinding.ObservableShort;
import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.offline.DownloadRequest;

/* loaded from: classes2.dex */
public final class d implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f31a;

    public /* synthetic */ d(int i13) {
        this.f31a = i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a7  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createFromParcel(final android.os.Parcel r15) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f31a) {
            case 0:
                return new z12[i13];
            case 1:
                return new zb0[i13];
            case 2:
                return new b22[i13];
            case 3:
                return new h70[i13];
            case 4:
                return new kj0[i13];
            case 5:
                return new mj0[i13];
            case 6:
                return new MediaBrowserCompat$MediaItem[i13];
            case 7:
                return new MediaDescriptionCompat[i13];
            case 8:
                return new MediaMetadataCompat[i13];
            case 9:
                return new RatingCompat[i13];
            case 10:
                return new MediaSessionCompat$QueueItem[i13];
            case 11:
                return new MediaSessionCompat$ResultReceiverWrapper[i13];
            case 12:
                return new MediaSessionCompat$Token[i13];
            case 13:
                return new ParcelableVolumeInfo[i13];
            case 14:
                return new PlaybackStateCompat[i13];
            case 15:
                return new ResultReceiver[i13];
            case 16:
                return new ActivityResult[i13];
            case 17:
                return new IntentSenderRequest[i13];
            case 18:
                return new ParcelableSnapshotMutableDoubleState[i13];
            case 19:
                return new ObservableBoolean[i13];
            case 20:
                return new ObservableByte[i13];
            case 21:
                return new ObservableChar[i13];
            case 22:
                return new ObservableDouble[i13];
            case 23:
                return new ObservableFloat[i13];
            case 24:
                return new ObservableInt[i13];
            case 25:
                return new ObservableLong[i13];
            case 26:
                return new ObservableParcelable[i13];
            case 27:
                return new ObservableShort[i13];
            case 28:
                return new StreamKey[i13];
            default:
                return new DownloadRequest[i13];
        }
    }
}
