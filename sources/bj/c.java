package bj;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {
    public static final c BANNER;
    public static final c CUSTOM_NATIVE;
    public static final c NATIVE;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ c[] f22900a;

    static {
        c cVar = new c("NATIVE", 0);
        NATIVE = cVar;
        c cVar2 = new c("CUSTOM_NATIVE", 1);
        CUSTOM_NATIVE = cVar2;
        c cVar3 = new c("BANNER", 2);
        BANNER = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        f22900a = cVarArr;
        l0.b0(cVarArr);
    }

    private c(String str, int i13) {
    }

    public static c[] values() {
        return (c[]) f22900a.clone();
    }
}
