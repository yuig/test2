package com.modiface.mfemakeupkit.widgets;

/* loaded from: classes7.dex */
public enum MFEMakeupZoomArea {
    None,
    LeftEye,
    RightEye,
    LeftCheek,
    RightCheek,
    Lips,
    LeftBrow,
    RightBrow;

    public static String[] getEnumNames() {
        MFEMakeupZoomArea[] values = values();
        String[] strArr = new String[values.length];
        for (int i13 = 0; i13 < values.length; i13++) {
            strArr[i13] = values[i13].name();
        }
        return strArr;
    }
}
