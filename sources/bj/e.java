package bj;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {
    public static final e DOWN;
    public static final e LEFT;
    public static final e RIGHT;
    public static final e UP;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ e[] f22902b;

    /* renamed from: a, reason: collision with root package name */
    private final int f22903a;

    static {
        e eVar = new e("RIGHT", 0, 1);
        RIGHT = eVar;
        e eVar2 = new e("LEFT", 1, 2);
        LEFT = eVar2;
        e eVar3 = new e("UP", 2, 4);
        UP = eVar3;
        e eVar4 = new e("DOWN", 3, 8);
        DOWN = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        f22902b = eVarArr;
        l0.b0(eVarArr);
    }

    private e(String str, int i13, int i14) {
        this.f22903a = i14;
    }

    public static e[] values() {
        return (e[]) f22902b.clone();
    }

    public final int getValue() {
        return this.f22903a;
    }
}
