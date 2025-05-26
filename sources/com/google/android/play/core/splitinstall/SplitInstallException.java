package com.google.android.play.core.splitinstall;

import com.google.android.gms.common.api.ApiException;

/* loaded from: classes3.dex */
public class SplitInstallException extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SplitInstallException(int r7) {
        /*
            r6 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r3 = 0
            r1[r3] = r2
            java.util.HashMap r2 = lk.a.f83633a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            boolean r4 = r2.containsKey(r3)
            if (r4 == 0) goto L36
            java.util.HashMap r4 = lk.a.f83634b
            boolean r5 = r4.containsKey(r3)
            if (r5 != 0) goto L21
            goto L36
        L21:
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = " (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html#"
            java.lang.String r5 = ")"
            java.lang.String r2 = a.a.l(r2, r4, r3, r5)
            goto L38
        L36:
            java.lang.String r2 = ""
        L38:
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "Split Install Error(%d): %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r2 = 0
            r0.<init>(r7, r1, r2, r2)
            r6.<init>(r0)
            if (r7 == 0) goto L4b
            return
        L4b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "errorCode should not be 0."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.SplitInstallException.<init>(int):void");
    }

    public final int getErrorCode() {
        return super.getStatusCode();
    }
}
