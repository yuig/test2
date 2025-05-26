package com.modiface.mfemakeupkit;

import java.util.ArrayList;

/* loaded from: classes7.dex */
public interface m0 {
    void onMFEMakeupSurfaceRenderFrameError(c cVar, Throwable th3);

    void onMFEMakeupSurfaceSetSurfaceError(c cVar, ArrayList<Throwable> arrayList);

    void requestToRender(c cVar);
}
