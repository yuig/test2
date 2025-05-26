package xi;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    public static final a COMPLETE;
    public static final a FAILED;
    public static final a INITIALIZING;
    public static final a NOT_STARTED;
    public static final a TIMED_OUT;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ a[] f134991b;

    /* renamed from: a, reason: collision with root package name */
    private final int f134992a;

    static {
        a aVar = new a("NOT_STARTED", 0, 0);
        NOT_STARTED = aVar;
        a aVar2 = new a("INITIALIZING", 1, 1);
        INITIALIZING = aVar2;
        a aVar3 = new a("COMPLETE", 2, 2);
        COMPLETE = aVar3;
        a aVar4 = new a("TIMED_OUT", 3, 3);
        TIMED_OUT = aVar4;
        a aVar5 = new a("FAILED", 4, 4);
        FAILED = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        f134991b = aVarArr;
        l0.b0(aVarArr);
    }

    private a(String str, int i13, int i14) {
        this.f134992a = i14;
    }

    public static a[] values() {
        return (a[]) f134991b.clone();
    }

    public final int getState() {
        return this.f134992a;
    }
}
