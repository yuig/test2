package wp0;

import h32.d4;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f PinComments;
    public static final f PinTries;
    public static final f StoryPinCreate;

    @NotNull
    private final d4 viewType;
    public static final f Pin = new f("Pin", 0, d4.PIN);
    public static final f PinCreate = new f("PinCreate", 1, d4.PIN_CREATE);
    public static final f PinEdit = new f("PinEdit", 2, d4.PIN_EDIT);

    private static final /* synthetic */ f[] $values() {
        return new f[]{Pin, PinCreate, PinEdit, PinComments, PinTries, StoryPinCreate};
    }

    static {
        d4 d4Var = d4.PIN_COMMENTS;
        PinComments = new f("PinComments", 3, d4Var);
        PinTries = new f("PinTries", 4, d4Var);
        StoryPinCreate = new f("StoryPinCreate", 5, d4.STORY_PIN);
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private f(String str, int i13, d4 d4Var) {
        this.viewType = d4Var;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    @NotNull
    public final d4 getViewType() {
        return this.viewType;
    }
}
