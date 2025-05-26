package wi;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    public static final d BOTTOM_LEFT;
    public static final d BOTTOM_RIGHT;
    public static final d TOP_LEFT;
    public static final d TOP_RIGHT;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ d[] f129934b;

    /* renamed from: a, reason: collision with root package name */
    private final int f129935a;

    static {
        d dVar = new d("TOP_LEFT", 0, 0);
        TOP_LEFT = dVar;
        d dVar2 = new d("TOP_RIGHT", 1, 1);
        TOP_RIGHT = dVar2;
        d dVar3 = new d("BOTTOM_RIGHT", 2, 2);
        BOTTOM_RIGHT = dVar3;
        d dVar4 = new d("BOTTOM_LEFT", 3, 3);
        BOTTOM_LEFT = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        f129934b = dVarArr;
        l0.b0(dVarArr);
    }

    private d(String str, int i13, int i14) {
        this.f129935a = i14;
    }

    public static d[] values() {
        return (d[]) f129934b.clone();
    }

    public final int getValue() {
        return this.f129935a;
    }
}
