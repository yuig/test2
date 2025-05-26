package mt1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    public Long f88150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f88151b;

    public g(h hVar) {
        this.f88151b = hVar;
    }

    @Override // mt1.a
    public final void a(Object obj) {
        long longValue = ((Number) obj).longValue();
        h hVar = this.f88151b;
        Long a13 = hVar.a();
        this.f88150a = Long.valueOf(longValue);
        Long a14 = hVar.a();
        if (a14 == null) {
            return;
        }
        long longValue2 = a14.longValue();
        while (true) {
            if ((a13 != null && a13.longValue() == longValue2) || hVar.f88156e || hVar.f88157f) {
                return;
            }
            try {
                hVar.f88156e = true;
                hVar.f88154c.e(Long.valueOf(longValue2));
                a13 = Long.valueOf(longValue2);
                Long a15 = hVar.a();
                Intrinsics.f(a15);
                longValue2 = a15.longValue();
            } finally {
                hVar.f88156e = false;
            }
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "MinimumConsumer inputValue=[" + this.f88150a + "]";
    }

    @Override // mt1.a
    public final void g() {
        h hVar = this.f88151b;
        boolean z13 = !hVar.f88157f;
        hVar.f88157f = true;
        if (z13) {
            hVar.f88154c.f();
        }
    }
}
