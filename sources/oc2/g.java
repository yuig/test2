package oc2;

import hc2.q;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f94084a;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.CLOSEUP_ADJACENT_UI_PAGE_PREFETCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.PLAYER_AHEAD_OF_UI_CREATION_PREFETCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q.GRID_PREFETCH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[q.GRID_TO_CLOSEUP_PLAYER_REUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f94084a = iArr;
    }
}
