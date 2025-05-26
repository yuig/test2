package ue;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f121971a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f121972b;

    public n(String str, boolean z13) {
        this.f121971a = str;
        this.f121972b = z13;
    }

    public final String toString() {
        String str = this.f121972b ? "Applink" : "Unclassified";
        String str2 = this.f121971a;
        if (str2 == null) {
            return str;
        }
        return str + '(' + ((Object) str2) + ')';
    }
}
