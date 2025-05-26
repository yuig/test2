package com.google.android.engage.service;

import a.a;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* loaded from: classes3.dex */
public class AppEngageException extends ApiException {
    public AppEngageException(int i13) {
        super(new Status(i13, String.format(Locale.getDefault(), "App Engage Service Error: %d", Integer.valueOf(i13)), null, null));
        if (i13 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    public final int getErrorCode() {
        return super.getStatusCode();
    }

    @Override // com.google.android.gms.common.api.ApiException
    public final int getStatusCode() {
        return super.getStatusCode();
    }

    public AppEngageException(int i13, String str) {
        super(new Status(i13, a.D(String.format(Locale.getDefault(), "App Engage Service Error: %d", Integer.valueOf(i13)), "\n", str), null, null));
        if (i13 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
