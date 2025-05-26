package a11;

import kotlin.jvm.internal.Intrinsics;
import x02.m2;
import x02.n2;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final n2 f369a;

    public y(n2 urlInfoRepository) {
        Intrinsics.checkNotNullParameter(urlInfoRepository, "urlInfoRepository");
        this.f369a = urlInfoRepository;
    }

    public final jk2.m a(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        n2 n2Var = this.f369a;
        n2Var.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        return (jk2.m) n2Var.b(new m2(url, str));
    }
}
