package ads_mobile_sdk;

import a.zb;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import ao2.j0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class bh extends tl {

    /* renamed from: j, reason: collision with root package name */
    public final Context f2876j;

    /* renamed from: k, reason: collision with root package name */
    public final oh0 f2877k;

    /* renamed from: l, reason: collision with root package name */
    public final hf f2878l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(Context context, oh0 flags, hf appSettings, j0 backgroundScope, zb clock) {
        super(flags.l(), clock, backgroundScope, flags.j(), flags.k(), 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(appSettings, "appSettings");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f2876j = context;
        this.f2877k = flags;
        this.f2878l = appSettings;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.AUDIO;
    }

    @Override // a.t5
    public final Object c(bl2.c cVar) {
        Pair pair;
        Double d2;
        Double d13;
        AudioManager audioManager = (AudioManager) this.f2876j.getSystemService(AudioManager.class);
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) this.f2877k.a("gads:normalized_device_volume:enabled", Boolean.TRUE, oh0.f9281e)).booleanValue()) {
            int streamMinVolume = Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0;
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (streamMinVolume > streamVolume || streamVolume > streamMaxVolume) {
                d13 = new Double(-2.0d);
            } else {
                d13 = new Double(streamMinVolume == streamMaxVolume ? 1.0d : ((int) (((streamVolume - streamMinVolume) / (streamMaxVolume - streamMinVolume)) * 100.0d)) / 100.0d);
            }
            pair = new Pair(new Integer(streamMinVolume), new Integer(streamMaxVolume));
            d2 = d13;
        } else {
            pair = null;
            d2 = null;
        }
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int ringerMode = audioManager.getRingerMode();
        int streamVolume2 = audioManager.getStreamVolume(2);
        hf hfVar = this.f2878l;
        return new pk0(new ah(mode, isMusicActive, isSpeakerphoneOn, streamVolume, pair, ringerMode, streamVolume2, hfVar.f5944c, hfVar.f5945d, d2));
    }
}
