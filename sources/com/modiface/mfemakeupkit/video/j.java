package com.modiface.mfemakeupkit.video;

import com.modiface.mfemakeupkit.video.MFEVideoRecordingError;
import java.io.IOException;
import java.util.List;

/* loaded from: classes7.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f34717a;

    public j(e eVar) {
        this.f34717a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list;
        b bVar;
        o oVar;
        o oVar2;
        boolean z13;
        this.f34717a.a();
        try {
            oVar2 = this.f34717a.f34698f;
            String absolutePath = this.f34717a.f34702j.getAbsolutePath();
            z13 = this.f34717a.f34704l;
            oVar2.a(absolutePath, z13);
        } catch (IOException | IllegalArgumentException e13) {
            list = this.f34717a.f34705m;
            list.add(new MFEVideoRecordingError(e13, MFEVideoRecordingError.Consequence.RecordingFailed));
        }
        bVar = this.f34717a.f34696d;
        if (bVar.e()) {
            return;
        }
        oVar = this.f34717a.f34698f;
        oVar.a(false);
    }
}
