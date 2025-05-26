package ic1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class v implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final int f72091a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72092b;

    /* renamed from: c, reason: collision with root package name */
    public final String f72093c;

    public /* synthetic */ v(int i13, int i14, String str, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, (i15 & 4) != 0 ? ol2.f.f96454a.toString() : str, null);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f72093c;
    }

    public /* synthetic */ v(int i13, int i14, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, str);
    }

    private v(int i13, int i14, String str) {
        this.f72091a = i13;
        this.f72092b = i14;
        this.f72093c = str;
    }
}
