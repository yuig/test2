package pq2;

import java.util.Optional;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public final class h0 implements p {

    /* renamed from: a, reason: collision with root package name */
    public final p f101036a;

    public h0(p pVar) {
        this.f101036a = pVar;
    }

    @Override // pq2.p
    public final Object a(Object obj) {
        return Optional.ofNullable(this.f101036a.a((ResponseBody) obj));
    }
}
