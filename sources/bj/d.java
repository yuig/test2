package bj;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    public static final d ANY;
    public static final d LANDSCAPE;
    public static final d PORTRAIT;
    public static final d SQUARE;
    public static final d UNKNOWN;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ d[] f22901a;

    static {
        d dVar = new d("UNKNOWN", 0);
        UNKNOWN = dVar;
        d dVar2 = new d("ANY", 1);
        ANY = dVar2;
        d dVar3 = new d("LANDSCAPE", 2);
        LANDSCAPE = dVar3;
        d dVar4 = new d("PORTRAIT", 3);
        PORTRAIT = dVar4;
        d dVar5 = new d("SQUARE", 4);
        SQUARE = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        f22901a = dVarArr;
        l0.b0(dVarArr);
    }

    private d(String str, int i13) {
    }

    public static d[] values() {
        return (d[]) f22901a.clone();
    }
}
