package wi;

import lb.l0;

/* loaded from: classes3.dex */
public final class y extends Enum {
    public static final y TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE;
    public static final y TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE;
    public static final y TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED;

    /* renamed from: b */
    private static final /* synthetic */ y[] f129992b;

    /* renamed from: a */
    private final int f129993a;

    static {
        y yVar = new y("TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED", 0, -1);
        TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = yVar;
        y yVar2 = new y("TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE", 1, 0);
        TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = yVar2;
        y yVar3 = new y("TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE", 2, 1);
        TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = yVar3;
        y[] yVarArr = {yVar, yVar2, yVar3};
        f129992b = yVarArr;
        l0.b0(yVarArr);
    }

    private y(String str, int i13, int i14) {
        super(str, i13);
        this.f129993a = i14;
    }

    public static y[] values() {
        return (y[]) f129992b.clone();
    }

    public final int getValue() {
        return this.f129993a;
    }
}
