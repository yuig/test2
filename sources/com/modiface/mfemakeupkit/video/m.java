package com.modiface.mfemakeupkit.video;

import com.modiface.mfemakeupkit.video.MFEVideoRecordingError;
import java.util.List;

/* loaded from: classes7.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f34720a;

    public m(e eVar) {
        this.f34720a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfecommon.utils.p pVar;
        com.modiface.mfecommon.utils.p pVar2;
        List list;
        o oVar;
        o oVar2;
        q qVar;
        pVar = this.f34720a.f34693a;
        pVar.b().removeMessages(52);
        pVar2 = this.f34720a.f34693a;
        pVar2.b().removeMessages(51);
        try {
            qVar = this.f34720a.f34695c;
            qVar.g();
        } catch (IllegalStateException e13) {
            list = this.f34720a.f34705m;
            list.add(new MFEVideoRecordingError(e13, new MFEVideoRecordingError.Consequence[0]));
        }
        this.f34720a.j();
        this.f34720a.b();
        oVar = this.f34720a.f34698f;
        oVar.b();
        e eVar = this.f34720a;
        oVar2 = eVar.f34698f;
        eVar.f34703k = oVar2.a();
    }
}
