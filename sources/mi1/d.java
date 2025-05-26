package mi1;

import com.pinterest.api.model.rj0;
import qa2.g0;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f87216a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f87217b;

    static {
        int[] iArr = new int[g0.values().length];
        try {
            iArr[g0.SHOW_PROMOTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g0.SHOW_SPONSORSHIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g0.SHOW_AFFILIATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g0.DO_NOT_SHOW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f87216a = iArr;
        int[] iArr2 = new int[rj0.a.values().length];
        try {
            iArr2[rj0.a.APPROVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[rj0.a.REJECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[rj0.a.REQUESTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[rj0.a.UNAFFILIATED.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f87217b = iArr2;
    }
}
