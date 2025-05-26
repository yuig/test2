package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l2 {

    /* renamed from: b, reason: collision with root package name */
    public static final c50.c1 f67137b = new c50.c1(20);

    /* renamed from: a, reason: collision with root package name */
    public final Long f67138a;

    public l2(Long l13) {
        this.f67138a = l13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2) && Intrinsics.d(this.f67138a, ((l2) obj).f67138a);
    }

    public final int hashCode() {
        Long l13 = this.f67138a;
        if (l13 == null) {
            return 0;
        }
        return l13.hashCode();
    }

    public final String toString() {
        return "QuizEventData(resultPinId=" + this.f67138a + ")";
    }
}
