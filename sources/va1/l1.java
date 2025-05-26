package va1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class l1 extends j1 implements b {
    public l1() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ l1(Integer num, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : str);
    }

    public l1(Integer num, String str) {
        super(num, str);
    }
}
