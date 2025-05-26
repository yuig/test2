package n7;

import android.content.ClipData;
import android.media.AudioProfile;
import android.media.MediaDrm;
import android.view.ContentInfo;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class g0 {
    public static /* bridge */ /* synthetic */ AudioProfile f(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent h(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    public static /* synthetic */ ContentInfo.Builder j(ClipData clipData, int i13) {
        return new ContentInfo.Builder(clipData, i13);
    }

    public static /* bridge */ /* synthetic */ ContentInfo l(Object obj) {
        return (ContentInfo) obj;
    }
}
