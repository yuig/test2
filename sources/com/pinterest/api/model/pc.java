package com.pinterest.api.model;

import java.util.Locale;

/* loaded from: classes3.dex */
public enum pc {
    ACCEPTED,
    NEW,
    DENIED,
    OWNER,
    PENDING_APPROVAL,
    CONTACT_REQUEST_NOT_APPROVED;

    public static pc parseString(String str, pc pcVar) {
        String upperCase;
        if (str == null) {
            upperCase = null;
        } else {
            try {
                upperCase = str.toUpperCase(Locale.US);
            } catch (IllegalArgumentException unused) {
                return pcVar;
            }
        }
        return valueOf(upperCase);
    }
}
