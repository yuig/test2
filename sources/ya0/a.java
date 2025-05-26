package ya0;

import com.pinterest.collagesCoreLibrary.model.CutoutPickerOrigin;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f138314a;

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
            iArr[CutoutPickerOrigin.RecentSaves.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f138314a = iArr;
    }
}
