package com.pinterest.feature.ideaPinCreation.closeup.view;

import com.pinterest.api.model.aq0;
import com.pinterest.api.model.er;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class e2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f46131a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f46132b;

    static {
        int[] iArr = new int[aq0.values().length];
        try {
            iArr[aq0.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[aq0.LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[aq0.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f46131a = iArr;
        int[] iArr2 = new int[er.values().length];
        try {
            iArr2[er.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f46132b = iArr2;
    }
}
