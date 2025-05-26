package u0;

import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f119777b;

    public /* synthetic */ k(m mVar, int i13) {
        this.f119776a = i13;
        this.f119777b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f119776a) {
            case 0:
                m mVar = this.f119777b;
                mVar.f119792k.set(false);
                mVar.f119788g.stop();
                synchronized (mVar.f119786e) {
                    mVar.f119787f = null;
                    mVar.f119784c.clear();
                }
                return;
            case 1:
                m mVar2 = this.f119777b;
                mVar2.getClass();
                try {
                    mVar2.f119788g.start();
                    if (mVar2.f119792k.getAndSet(true)) {
                        return;
                    }
                    mVar2.d();
                    return;
                } catch (AudioStream$AudioStreamException e13) {
                    throw new RuntimeException(e13);
                }
            case 2:
                this.f119777b.d();
                return;
            default:
                m mVar3 = this.f119777b;
                mVar3.f119792k.set(false);
                mVar3.f119788g.a();
                synchronized (mVar3.f119786e) {
                    mVar3.f119787f = null;
                    mVar3.f119784c.clear();
                }
                return;
        }
    }
}
