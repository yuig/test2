package am2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15599a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15600b;

    public u1(String name, boolean z13) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f15599a = name;
        this.f15600b = z13;
    }

    public Integer a(u1 second) {
        Intrinsics.checkNotNullParameter(second, "visibility");
        yk2.g gVar = t1.f15591a;
        Intrinsics.checkNotNullParameter(this, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (this == second) {
            return 0;
        }
        yk2.g gVar2 = t1.f15591a;
        Integer num = (Integer) gVar2.get(this);
        Integer num2 = (Integer) gVar2.get(second);
        if (num == null || num2 == null || Intrinsics.d(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public String b() {
        return this.f15599a;
    }

    public u1 c() {
        return this;
    }

    public final String toString() {
        return b();
    }
}
