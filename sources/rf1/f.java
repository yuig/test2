package rf1;

import com.pinterest.api.model.cp0;
import com.pinterest.api.model.yp0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f107745a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f107746b;

    static {
        int[] iArr = new int[yp0.values().length];
        try {
            iArr[yp0.RECIPE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yp0.DIY_HOME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f107745a = iArr;
        int[] iArr2 = new int[cp0.values().length];
        try {
            iArr2[cp0.INGREDIENTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[cp0.SUPPLIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f107746b = iArr2;
    }
}
