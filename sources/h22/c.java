package h22;

import a.cb;
import ck2.i;
import com.pinterest.api.model.f30;
import java.util.List;
import jk2.a0;
import jk2.i1;
import jk2.j1;
import k1.b0;
import kh2.u2;
import kotlin.jvm.internal.Intrinsics;
import lh0.d3;
import uj2.q;
import x02.e0;
import x02.i2;
import xk2.m;
import xk2.v;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f66575a;

    /* renamed from: b, reason: collision with root package name */
    public final f f66576b;

    /* renamed from: c, reason: collision with root package name */
    public final e f66577c;

    /* renamed from: d, reason: collision with root package name */
    public final d3 f66578d;

    /* renamed from: e, reason: collision with root package name */
    public final uk2.f f66579e;

    /* renamed from: f, reason: collision with root package name */
    public final v f66580f;

    public c(i2 pinRepository, f storyPinService, e storyPinRemoteManager, d3 repositoryExperiments) {
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(storyPinService, "storyPinService");
        Intrinsics.checkNotNullParameter(storyPinRemoteManager, "storyPinRemoteManager");
        Intrinsics.checkNotNullParameter(repositoryExperiments, "repositoryExperiments");
        this.f66575a = pinRepository;
        this.f66576b = storyPinService;
        this.f66577c = storyPinRemoteManager;
        this.f66578d = repositoryExperiments;
        this.f66579e = cb.r("create(...)");
        this.f66580f = m.b(b.f66574i);
    }

    public static i1 a(f30 f30Var, List list) {
        i1 y13 = q.y(new d(f30Var, u2.e1(f30Var, list)));
        Intrinsics.checkNotNullExpressionValue(y13, "just(...)");
        return y13;
    }

    public final j1 b(String id3, List existingPages, boolean z13) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(existingPages, "existingPages");
        q u13 = this.f66576b.h(id3, "0.16.0", n00.b.a(n00.c.STORY_PIN_DISPLAY_FIELDS)).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        int i13 = 0;
        int i14 = 1;
        j1 j1Var = new j1(new j1(new a0(u13.H(tk2.e.f118017c), new e0(19, new a(this, i13)), i.f27924d, i.f27923c).t(new b22.f(3, new a(this, i14))), new b22.f(4, new b0(this, id3, existingPages, z13)), i14), new b22.f(5, new a(this, 2)), i13);
        Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
        return j1Var;
    }
}
