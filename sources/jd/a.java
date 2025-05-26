package jd;

import com.bugsnag.android.BreadcrumbType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f75478a;

    static {
        int[] iArr = new int[BreadcrumbType.values().length];
        iArr[BreadcrumbType.ERROR.ordinal()] = 1;
        iArr[BreadcrumbType.LOG.ordinal()] = 2;
        iArr[BreadcrumbType.MANUAL.ordinal()] = 3;
        iArr[BreadcrumbType.NAVIGATION.ordinal()] = 4;
        iArr[BreadcrumbType.PROCESS.ordinal()] = 5;
        iArr[BreadcrumbType.REQUEST.ordinal()] = 6;
        iArr[BreadcrumbType.STATE.ordinal()] = 7;
        iArr[BreadcrumbType.USER.ordinal()] = 8;
        f75478a = iArr;
    }
}
