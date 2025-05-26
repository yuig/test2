package dj;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {
    public static final b INTERNAL_ERROR;
    public static final b INVALID_REQUEST;
    public static final b TIMEOUT;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ b[] f55116b;

    /* renamed from: a, reason: collision with root package name */
    private final int f55117a;

    static {
        b bVar = new b("INTERNAL_ERROR", 0, 0);
        INTERNAL_ERROR = bVar;
        b bVar2 = new b("INVALID_REQUEST", 1, 1);
        INVALID_REQUEST = bVar2;
        b bVar3 = new b("TIMEOUT", 2, 2);
        TIMEOUT = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f55116b = bVarArr;
        l0.b0(bVarArr);
    }

    private b(String str, int i13, int i14) {
        this.f55117a = i14;
    }

    public static b[] values() {
        return (b[]) f55116b.clone();
    }

    public final int getValue() {
        return this.f55117a;
    }
}
