package s80;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b7 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b7[] $VALUES;
    public static final b7 AddCutoutInstruct;
    public static final b7 AllDone;
    public static final b7 ChangeBackgroundColorActive;
    public static final b7 ChangeBackgroundColorComplete;
    public static final b7 ChangeBackgroundColorInstruct;
    public static final b7 ChangeBackgroundColorWelcome;
    public static final b7 InitialWelcome;
    public static final b7 None = new b7("None", 0, null, false, 3, null);
    public static final b7 ReorderCutoutInstruct;
    public static final b7 ReorderCutoutInstructTryAgain;
    public static final b7 ReorderCutoutInstructWhilePressing;
    public static final b7 ReorderCutoutWelcome;
    public static final b7 RevisitWelcome;
    public static final b7 Tips;
    public static final b7 TipsGoBack;

    @NotNull
    private final a7 alignment;
    private final boolean isBackgroundDimmed;

    private static final /* synthetic */ b7[] $values() {
        return new b7[]{None, InitialWelcome, RevisitWelcome, AddCutoutInstruct, ReorderCutoutWelcome, ReorderCutoutInstruct, ReorderCutoutInstructWhilePressing, ReorderCutoutInstructTryAgain, ChangeBackgroundColorWelcome, ChangeBackgroundColorInstruct, ChangeBackgroundColorActive, ChangeBackgroundColorComplete, AllDone, Tips, TipsGoBack};
    }

    static {
        a7 a7Var = a7.CanvasBottom;
        InitialWelcome = new b7("InitialWelcome", 1, a7Var, false, 2, null);
        RevisitWelcome = new b7("RevisitWelcome", 2, a7Var, false, 2, null);
        AddCutoutInstruct = new b7("AddCutoutInstruct", 3, a7Var, true);
        ReorderCutoutWelcome = new b7("ReorderCutoutWelcome", 4, 0 == true ? 1 : 0, false, 3, null);
        a7 a7Var2 = a7.Top;
        ReorderCutoutInstruct = new b7("ReorderCutoutInstruct", 5, a7Var2, false, 2, null);
        boolean z13 = false;
        int i13 = 2;
        ReorderCutoutInstructWhilePressing = new b7("ReorderCutoutInstructWhilePressing", 6, a7Var2, z13, i13, 0 == true ? 1 : 0);
        ReorderCutoutInstructTryAgain = new b7("ReorderCutoutInstructTryAgain", 7, a7Var2, z13, i13, 0 == true ? 1 : 0);
        ChangeBackgroundColorWelcome = new b7("ChangeBackgroundColorWelcome", 8, null, false, 3, null);
        a7 a7Var3 = null;
        int i14 = 3;
        ChangeBackgroundColorInstruct = new b7("ChangeBackgroundColorInstruct", 9, a7Var3, z13, i14, 0 == true ? 1 : 0);
        a7 a7Var4 = null;
        boolean z14 = false;
        int i15 = 3;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ChangeBackgroundColorActive = new b7("ChangeBackgroundColorActive", 10, a7Var4, z14, i15, defaultConstructorMarker);
        ChangeBackgroundColorComplete = new b7("ChangeBackgroundColorComplete", 11, a7Var3, z13, i14, 0 == true ? 1 : 0);
        AllDone = new b7("AllDone", 12, a7Var4, z14, i15, defaultConstructorMarker);
        Tips = new b7("Tips", 13, a7Var3, true, 1, 0 == true ? 1 : 0);
        TipsGoBack = new b7("TipsGoBack", 14, a7Var4, true, 1, defaultConstructorMarker);
        b7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    public /* synthetic */ b7(String str, int i13, a7 a7Var, boolean z13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, (i14 & 1) != 0 ? a7.Bottom : a7Var, (i14 & 2) != 0 ? false : z13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b7 valueOf(String str) {
        return (b7) Enum.valueOf(b7.class, str);
    }

    public static b7[] values() {
        return (b7[]) $VALUES.clone();
    }

    @NotNull
    public final a7 getAlignment() {
        return this.alignment;
    }

    public final boolean isBackgroundDimmed() {
        return this.isBackgroundDimmed;
    }

    private b7(String str, int i13, a7 a7Var, boolean z13) {
        this.alignment = a7Var;
        this.isBackgroundDimmed = z13;
    }
}
