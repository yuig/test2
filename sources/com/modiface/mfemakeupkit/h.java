package com.modiface.mfemakeupkit;

import com.modiface.mfemakeupkit.rendering.a;

/* loaded from: classes7.dex */
public final class h implements a.o {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f34504a;

    public h(i iVar) {
        this.f34504a = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    @Override // com.modiface.mfemakeupkit.rendering.a.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(boolean r3, java.util.ArrayList<java.lang.Throwable> r4, com.modiface.mfemakeupkit.utils.d r5, com.modiface.mfecommon.utils.MFEGLFramebuffer r6) {
        /*
            r2 = this;
            r5 = 0
            if (r3 == 0) goto L16
            if (r6 == 0) goto L16
            android.graphics.Bitmap r3 = r6.captureToBitmap()
            boolean r0 = r6.hasError()
            if (r0 == 0) goto L17
            java.util.ArrayList r3 = r6.getAndClearErrors()
            r4.addAll(r3)
        L16:
            r3 = r5
        L17:
            if (r3 == 0) goto L23
            com.modiface.mfemakeupkit.i r6 = r2.f34504a
            com.modiface.mfemakeupkit.MFEMakeupEngine$ApplyMakeupToPhotoCompletionHandler r0 = r6.f34505a
            android.graphics.Bitmap r6 = r6.f34506b
            r0.onMakeupAppliedToPhoto(r6, r3, r5)
            goto L33
        L23:
            com.modiface.mfemakeupkit.i r3 = r2.f34504a
            com.modiface.mfemakeupkit.MFEMakeupEngine$ApplyMakeupToPhotoCompletionHandler r6 = r3.f34505a
            android.graphics.Bitmap r3 = r3.f34506b
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "failed to apply makeup to photo"
            r0.<init>(r1)
            r6.onMakeupAppliedToPhoto(r3, r5, r0)
        L33:
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L50
            com.modiface.mfemakeupkit.i r3 = r2.f34504a
            com.modiface.mfemakeupkit.MFEMakeupEngine r3 = r3.f34507c
            java.lang.ref.WeakReference r3 = com.modiface.mfemakeupkit.MFEMakeupEngine.access$1000(r3)
            java.lang.Object r3 = r3.get()
            com.modiface.mfemakeupkit.MFEMakeupEngine$MFEMakeupEngineErrorCallback r3 = (com.modiface.mfemakeupkit.MFEMakeupEngine.MFEMakeupEngineErrorCallback) r3
            if (r3 == 0) goto L50
            com.modiface.mfemakeupkit.MFEMakeupEngine$ErrorSeverity r5 = com.modiface.mfemakeupkit.MFEMakeupEngine.ErrorSeverity.Recoverable
            com.modiface.mfemakeupkit.MFEMakeupEngine$ErrorType r6 = com.modiface.mfemakeupkit.MFEMakeupEngine.ErrorType.RenderInBackground
            r3.onMakeupEngineError(r5, r6, r4)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.modiface.mfemakeupkit.h.a(boolean, java.util.ArrayList, com.modiface.mfemakeupkit.utils.d, com.modiface.mfecommon.utils.MFEGLFramebuffer):void");
    }
}
