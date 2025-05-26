package ads_mobile_sdk;

import a.p6;

/* loaded from: classes2.dex */
public final class v61 extends p6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12372a;

    /* renamed from: b, reason: collision with root package name */
    public final ju1 f12373b;

    public v61(String str, ju1 ju1Var) {
        this.f12372a = str;
        this.f12373b = ju1Var;
    }

    @Override // a.p6
    public final boolean a() {
        return this.f12373b != ju1.RAW;
    }

    public final String toString() {
        String str = this.f12372a;
        int ordinal = this.f12373b.ordinal();
        return a.a.m("(typeUrl=", str, ", outputPrefixType=", ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}
