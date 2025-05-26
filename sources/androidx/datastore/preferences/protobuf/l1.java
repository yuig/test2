package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class l1 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f18099a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18100b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f18101c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18102d;

    public l1(g0 g0Var, String str, Object[] objArr) {
        this.f18099a = g0Var;
        this.f18100b = str;
        this.f18101c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f18102d = charAt;
            return;
        }
        int i13 = charAt & 8191;
        int i14 = 1;
        int i15 = 13;
        while (true) {
            int i16 = i14 + 1;
            char charAt2 = str.charAt(i14);
            if (charAt2 < 55296) {
                this.f18102d = i13 | (charAt2 << i15);
                return;
            } else {
                i13 |= (charAt2 & 8191) << i15;
                i15 += 13;
                i14 = i16;
            }
        }
    }

    public final b a() {
        return this.f18099a;
    }

    public final Object[] b() {
        return this.f18101c;
    }

    public final String c() {
        return this.f18100b;
    }

    public final i1 d() {
        return (this.f18102d & 1) == 1 ? i1.PROTO2 : i1.PROTO3;
    }
}
