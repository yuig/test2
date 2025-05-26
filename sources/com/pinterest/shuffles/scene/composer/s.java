package com.pinterest.shuffles.scene.composer;

import r72.f1;
import r72.h1;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class s {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f52142a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f52143b;

    static {
        int[] iArr = new int[f1.values().length];
        try {
            iArr[f1.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f1.LOOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f1.AUTO_REVERSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f52142a = iArr;
        int[] iArr2 = new int[h1.values().length];
        try {
            iArr2[h1.LINEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[h1.SMOOTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[h1.SPRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[h1.BOUNCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f52143b = iArr2;
    }
}
