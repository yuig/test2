package wi;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class v {
    public static final v ESTIMATED;
    public static final v PRECISE;
    public static final v PUBLISHER_PROVIDED;
    public static final v UNKNOWN;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ v[] f129987a;

    static {
        v vVar = new v("UNKNOWN", 0);
        UNKNOWN = vVar;
        v vVar2 = new v("ESTIMATED", 1);
        ESTIMATED = vVar2;
        v vVar3 = new v("PUBLISHER_PROVIDED", 2);
        PUBLISHER_PROVIDED = vVar3;
        v vVar4 = new v("PRECISE", 3);
        PRECISE = vVar4;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4};
        f129987a = vVarArr;
        l0.b0(vVarArr);
    }

    private v(String str, int i13) {
    }

    public static v[] values() {
        return (v[]) f129987a.clone();
    }
}
