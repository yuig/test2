package m90;

import com.pinterest.collagesCoreLibrary.model.CutoutPickerOrigin;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f86720a;

    static {
        int[] iArr = new int[CutoutPickerOrigin.values().length];
        try {
            iArr[CutoutPickerOrigin.CutoutsForYou.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CutoutPickerOrigin.Boards.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CutoutPickerOrigin.YourCutouts.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CutoutPickerOrigin.RecentSaves.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f86720a = iArr;
    }
}
