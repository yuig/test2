package th2;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public enum g {
    NATIVE(1),
    REACT_NATIVE(2),
    UNITY(3),
    FLUTTER(4);


    @NotNull
    public static final f Companion = new f();
    private final int value;

    g(int i13) {
        this.value = i13;
    }

    public final int getValue() {
        return this.value;
    }
}
