package ads_mobile_sdk;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class yx0 {

    /* renamed from: a, reason: collision with root package name */
    public static final yx0 f14443a;

    /* renamed from: b, reason: collision with root package name */
    public static final yx0 f14444b;

    /* renamed from: c, reason: collision with root package name */
    public static final yx0 f14445c;

    /* renamed from: d, reason: collision with root package name */
    public static final yx0 f14446d;

    /* renamed from: e, reason: collision with root package name */
    public static final yx0 f14447e;

    /* renamed from: f, reason: collision with root package name */
    public static final yx0 f14448f;

    /* renamed from: g, reason: collision with root package name */
    public static final yx0 f14449g;

    /* renamed from: h, reason: collision with root package name */
    public static final yx0 f14450h;

    /* renamed from: i, reason: collision with root package name */
    public static final yx0 f14451i;

    /* renamed from: j, reason: collision with root package name */
    public static final yx0 f14452j;

    /* renamed from: k, reason: collision with root package name */
    public static final yx0 f14453k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ yx0[] f14454l;

    static {
        yx0 yx0Var = new yx0("INTERNAL_ERROR", 0);
        f14443a = yx0Var;
        yx0 yx0Var2 = new yx0("INVALID_REQUEST", 1);
        f14444b = yx0Var2;
        yx0 yx0Var3 = new yx0("NO_FILL", 2);
        f14445c = yx0Var3;
        yx0 yx0Var4 = new yx0("APP_ID_MISSING", 3);
        f14446d = yx0Var4;
        yx0 yx0Var5 = new yx0("NETWORK_ERROR", 4);
        f14447e = yx0Var5;
        yx0 yx0Var6 = new yx0("INVALID_AD_UNIT_ID", 5);
        yx0 yx0Var7 = new yx0("INVALID_AD_SIZE", 6);
        yx0 yx0Var8 = new yx0("MEDIATION_SHOW_ERROR", 7);
        yx0 yx0Var9 = new yx0("NOT_READY", 8);
        yx0 yx0Var10 = new yx0("AD_RESPONSE_ALREADY_USED", 9);
        f14448f = yx0Var10;
        yx0 yx0Var11 = new yx0("APP_NOT_FOREGROUND", 10);
        yx0 yx0Var12 = new yx0("INTERNAL_SHOW_ERROR", 11);
        yx0 yx0Var13 = new yx0("MEDIATION_NO_FILL", 12);
        f14449g = yx0Var13;
        yx0 yx0Var14 = new yx0("INVALID_AD_RESPONSE", 13);
        f14450h = yx0Var14;
        yx0 yx0Var15 = new yx0("REQUEST_ID_MISMATCH", 14);
        f14451i = yx0Var15;
        yx0 yx0Var16 = new yx0("TIMEOUT", 15);
        f14452j = yx0Var16;
        yx0 yx0Var17 = new yx0("ADAPTER_INITIALIZATION_ERROR", 16);
        f14453k = yx0Var17;
        yx0[] yx0VarArr = {yx0Var, yx0Var2, yx0Var3, yx0Var4, yx0Var5, yx0Var6, yx0Var7, yx0Var8, yx0Var9, yx0Var10, yx0Var11, yx0Var12, yx0Var13, yx0Var14, yx0Var15, yx0Var16, yx0Var17};
        f14454l = yx0VarArr;
        l0.b0(yx0VarArr);
    }

    public yx0(String str, int i13) {
    }

    public static yx0[] values() {
        return (yx0[]) f14454l.clone();
    }

    public final wi.q a() {
        switch (ordinal()) {
            case 0:
                return wi.q.INTERNAL_ERROR;
            case 1:
                return wi.q.INVALID_REQUEST;
            case 2:
                return wi.q.NO_FILL;
            case 3:
                return wi.q.APP_ID_MISSING;
            case 4:
                return wi.q.NETWORK_ERROR;
            case 5:
                return wi.q.INVALID_REQUEST;
            case 6:
                return wi.q.INVALID_REQUEST;
            case 7:
                return wi.q.INTERNAL_ERROR;
            case 8:
                return wi.q.INTERNAL_ERROR;
            case 9:
                return wi.q.AD_RESPONSE_ALREADY_USED;
            case 10:
                return wi.q.INTERNAL_ERROR;
            case 11:
                return wi.q.INTERNAL_ERROR;
            case 12:
                return wi.q.NO_FILL;
            case 13:
                return wi.q.INVALID_AD_RESPONSE;
            case 14:
                return wi.q.REQUEST_ID_MISMATCH;
            case 15:
                return wi.q.TIMEOUT;
            case 16:
                return wi.q.INTERNAL_ERROR;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
