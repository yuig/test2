package wi;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class z {
    public static final z TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE;
    public static final z TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE;
    public static final z TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ z[] f129994b;

    /* renamed from: a, reason: collision with root package name */
    private final int f129995a;

    static {
        z zVar = new z("TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED", 0, -1);
        TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = zVar;
        z zVar2 = new z("TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE", 1, 0);
        TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = zVar2;
        z zVar3 = new z("TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE", 2, 1);
        TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = zVar3;
        z[] zVarArr = {zVar, zVar2, zVar3};
        f129994b = zVarArr;
        l0.b0(zVarArr);
    }

    private z(String str, int i13, int i14) {
        this.f129995a = i14;
    }

    public static z[] values() {
        return (z[]) f129994b.clone();
    }

    public final int getValue() {
        return this.f129995a;
    }
}
