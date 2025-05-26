package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* loaded from: classes3.dex */
public class IntegrityServiceException extends ApiException {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f33387a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegrityServiceException(int i13, Throwable th3) {
        super(new Status(i13, "Integrity API error (" + i13 + "): " + com.google.android.play.core.integrity.model.a.a(i13) + ".", null, null));
        Locale locale = Locale.ROOT;
        if (i13 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f33387a = th3;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f33387a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
