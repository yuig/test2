package com.google.android.gms.common.api;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class ApiException extends Exception {

    @NonNull
    @Deprecated
    protected final Status mStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ApiException(com.google.android.gms.common.api.Status r4) {
        /*
            r3 = this;
            int r0 = r4.f30751f
            java.lang.String r1 = r4.f30752g
            if (r1 == 0) goto L7
            goto L9
        L7:
            java.lang.String r1 = ""
        L9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r3.<init>(r0)
            r3.mStatus = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.ApiException.<init>(com.google.android.gms.common.api.Status):void");
    }

    @NonNull
    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.f30751f;
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.f30752g;
    }
}
