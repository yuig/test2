package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;

/* loaded from: classes.dex */
public final class i implements k {
    @Override // com.google.android.play.core.integrity.k
    public final ApiException a(Bundle bundle) {
        int i13 = bundle.getInt("error");
        if (i13 == 0) {
            return null;
        }
        return new IntegrityServiceException(i13, null);
    }
}
