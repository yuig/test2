package kotlin.text;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f80484a = 0;

    static {
        int[] iArr = new int[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN];
        int i13 = 0;
        for (int i14 = 0; i14 < 128; i14++) {
            iArr[i14] = -1;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < "0123456789abcdef".length()) {
            iArr["0123456789abcdef".charAt(i15)] = i16;
            i15++;
            i16++;
        }
        int i17 = 0;
        while (i13 < "0123456789ABCDEF".length()) {
            iArr["0123456789ABCDEF".charAt(i13)] = i17;
            i13++;
            i17++;
        }
    }
}
