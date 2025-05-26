package o7;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import m7.p0;

/* loaded from: classes3.dex */
public final class d0 extends AudioTrack$StreamEventCallback {

    /* renamed from: a */
    public final /* synthetic */ e0 f93032a;

    public d0(e0 e0Var) {
        this.f93032a = e0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i13) {
        f0 f0Var;
        h1.b bVar;
        p0 p0Var;
        if (audioTrack.equals(this.f93032a.f93045c.f93085w) && (bVar = (f0Var = this.f93032a.f93045c).f93081s) != null && f0Var.W && (p0Var = ((h0) bVar.f66449b).G) != null) {
            p0Var.a();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f93032a.f93045c.f93085w)) {
            this.f93032a.f93045c.V = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        f0 f0Var;
        h1.b bVar;
        p0 p0Var;
        if (audioTrack.equals(this.f93032a.f93045c.f93085w) && (bVar = (f0Var = this.f93032a.f93045c).f93081s) != null && f0Var.W && (p0Var = ((h0) bVar.f66449b).G) != null) {
            p0Var.a();
        }
    }
}
