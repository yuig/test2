package n7;

import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;

/* loaded from: classes3.dex */
public final /* synthetic */ class z implements d7.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f89593b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PlaybackException f89594c;

    public /* synthetic */ z(b bVar, ExoPlaybackException exoPlaybackException, int i13) {
        this.f89592a = i13;
        this.f89593b = bVar;
        this.f89594c = exoPlaybackException;
    }

    @Override // d7.r
    /* renamed from: invoke */
    public final void mo0invoke(Object obj) {
        c cVar = (c) obj;
        switch (this.f89592a) {
            case 0:
                cVar.getClass();
                break;
            default:
                cVar.F(this.f89593b, this.f89594c);
                break;
        }
    }
}
