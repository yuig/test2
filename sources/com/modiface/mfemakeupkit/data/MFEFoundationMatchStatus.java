package com.modiface.mfemakeupkit.data;

/* loaded from: classes7.dex */
public enum MFEFoundationMatchStatus {
    Matched,
    Mismatched,
    Unavailable;

    private static String[] getEnumNames() {
        MFEFoundationMatchStatus[] values = values();
        String[] strArr = new String[values.length];
        for (int i13 = 0; i13 < values.length; i13++) {
            strArr[i13] = values[i13].name();
        }
        return strArr;
    }
}
