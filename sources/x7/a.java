package x7;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import d7.n0;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n8.h f134000b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f134001c;

    public /* synthetic */ a(l lVar, n8.h hVar, int i13) {
        this.f133999a = i13;
        this.f134001c = lVar;
        this.f134000b = hVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j13, long j14) {
        n8.h hVar = this.f134000b;
        int i13 = this.f133999a;
        l lVar = this.f134001c;
        switch (i13) {
            case 0:
                ((c) lVar).getClass();
                hVar.getClass();
                if (n0.f53866a >= 30) {
                    hVar.a(j13);
                    break;
                } else {
                    Handler handler = hVar.f89811a;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j13 >> 32), (int) j13));
                    break;
                }
            default:
                ((w) lVar).getClass();
                hVar.getClass();
                if (n0.f53866a >= 30) {
                    hVar.a(j13);
                    break;
                } else {
                    Handler handler2 = hVar.f89811a;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j13 >> 32), (int) j13));
                    break;
                }
        }
    }
}
