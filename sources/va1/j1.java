package va1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class j1 implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f125194a;

    /* renamed from: b, reason: collision with root package name */
    public final String f125195b;

    /* renamed from: c, reason: collision with root package name */
    public final String f125196c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f125197d;

    public j1() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getPath() {
        return this.f125196c;
    }

    public boolean h() {
        return this.f125197d;
    }

    public /* synthetic */ j1(Integer num, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : str);
    }

    public j1(Integer num, String str) {
        this.f125194a = num;
        this.f125195b = str;
        this.f125196c = ol2.f.f96454a.toString();
        this.f125197d = true;
    }
}
