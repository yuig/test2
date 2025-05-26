package u0;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class g extends AudioManager.AudioRecordingCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f119754a;

    public g(h hVar) {
        this.f119754a = hVar;
    }

    @Override // android.media.AudioManager.AudioRecordingCallback
    public final void onRecordingConfigChanged(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) it.next();
            int clientAudioSessionId = audioRecordingConfiguration.getClientAudioSessionId();
            h hVar = this.f119754a;
            if (clientAudioSessionId == hVar.f119757a.getAudioSessionId()) {
                hVar.e(v0.a.c(audioRecordingConfiguration));
                return;
            }
        }
    }
}
