package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.util.Locale;

/* loaded from: classes.dex */
public enum AFi1pSDK {
    SUCCESS,
    FAILURE,
    NA,
    INTERNAL_ERROR;

    @Override // java.lang.Enum
    @NonNull
    public final String toString() {
        return super.toString().toLowerCase(Locale.getDefault());
    }
}
