package tb;

import kb.c0;
import kb.l0;
import kb.s0;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f116955a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f116956b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f116957c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int[] f116958d;

    static {
        int[] iArr = new int[s0.values().length];
        try {
            iArr[s0.ENQUEUED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s0.RUNNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s0.SUCCEEDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[s0.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[s0.BLOCKED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[s0.CANCELLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f116955a = iArr;
        int[] iArr2 = new int[kb.a.values().length];
        try {
            iArr2[kb.a.EXPONENTIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[kb.a.LINEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f116956b = iArr2;
        int[] iArr3 = new int[c0.values().length];
        try {
            iArr3[c0.NOT_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[c0.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[c0.UNMETERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[c0.NOT_ROAMING.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[c0.METERED.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        f116957c = iArr3;
        int[] iArr4 = new int[l0.values().length];
        try {
            iArr4[l0.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[l0.DROP_WORK_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        f116958d = iArr4;
    }
}
