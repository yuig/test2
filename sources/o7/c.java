package o7;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import d7.n0;

/* loaded from: classes.dex */
public final class c extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f93027a;

    public c(e eVar) {
        this.f93027a = eVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f93027a;
        eVar.a(b.b(eVar.f93033a, eVar.f93041i, eVar.f93040h));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f93027a;
        if (n0.l(audioDeviceInfoArr, eVar.f93040h)) {
            eVar.f93040h = null;
        }
        eVar.a(b.b(eVar.f93033a, eVar.f93041i, eVar.f93040h));
    }
}
