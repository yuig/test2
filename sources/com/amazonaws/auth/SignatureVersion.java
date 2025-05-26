package com.amazonaws.auth;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;

/* loaded from: classes3.dex */
public enum SignatureVersion {
    V1(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE),
    V2("2");

    private String value;

    SignatureVersion(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
