package ui2;

import io.opentelemetry.api.trace.StatusCode;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class i implements j {

    /* renamed from: b, reason: collision with root package name */
    public static final i f122314b = new i(ri2.b.f108392g);

    /* renamed from: a, reason: collision with root package name */
    public final l f122315a;

    public i(l lVar) {
        this.f122315a = lVar;
    }

    @Override // ui2.j
    public final boolean b() {
        return false;
    }

    @Override // ui2.j
    public final j d(String str) {
        return this;
    }

    @Override // ui2.j
    public final j e(String str, qi2.a aVar, long j13, TimeUnit timeUnit) {
        return this;
    }

    @Override // ui2.j
    public final void f(String str, String str2) {
    }

    @Override // ui2.j
    public final void g(long j13, TimeUnit timeUnit) {
    }

    @Override // ui2.j
    public final l h() {
        return this.f122315a;
    }

    @Override // ui2.j
    public final j i(StatusCode statusCode, String str) {
        return this;
    }

    @Override // ui2.j
    public final j o(ri2.e eVar, Object obj) {
        return this;
    }

    public final String toString() {
        return "PropagatedSpan{" + this.f122315a + '}';
    }
}
