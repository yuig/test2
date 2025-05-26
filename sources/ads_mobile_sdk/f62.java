package ads_mobile_sdk;

import a.od;

/* loaded from: classes2.dex */
public final class f62 implements od {

    /* renamed from: a, reason: collision with root package name */
    public final a.xe f5068a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5069b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f5070c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5071d;

    public f62(sj0 sj0Var, String str, Object[] objArr) {
        this.f5068a = sj0Var;
        this.f5069b = str;
        this.f5070c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f5071d = charAt;
            return;
        }
        int i13 = charAt & 8191;
        int i14 = 13;
        int i15 = 1;
        while (true) {
            int i16 = i15 + 1;
            char charAt2 = str.charAt(i15);
            if (charAt2 < 55296) {
                this.f5071d = i13 | (charAt2 << i14);
                return;
            } else {
                i13 |= (charAt2 & 8191) << i14;
                i14 += 13;
                i15 = i16;
            }
        }
    }

    public final a.xe a() {
        return this.f5068a;
    }

    public final Object[] b() {
        return this.f5070c;
    }

    public final String c() {
        return this.f5069b;
    }

    public final int d() {
        int i13 = this.f5071d;
        if ((i13 & 1) != 0) {
            return 1;
        }
        return (i13 & 4) == 4 ? 3 : 2;
    }
}
