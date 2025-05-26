package ir1;

import java.util.ArrayList;
import kk2.m;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import so.k9;
import u5.y;
import uj2.b0;
import uj2.q;

/* loaded from: classes4.dex */
public final class h extends e {

    /* renamed from: m, reason: collision with root package name */
    public final String f73524m;

    /* renamed from: n, reason: collision with root package name */
    public final k9 f73525n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(mr1.c activityProvider, q resultsFeed, String logValue, k9 googleConnectionFactory) {
        super(activityProvider, resultsFeed);
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(resultsFeed, "resultsFeed");
        Intrinsics.checkNotNullParameter(logValue, "logValue");
        Intrinsics.checkNotNullParameter(googleConnectionFactory, "googleConnectionFactory");
        this.f73524m = logValue;
        this.f73525n = googleConnectionFactory;
    }

    public static final y j(h hVar) {
        hVar.getClass();
        ArrayList arrayList = new ArrayList();
        String serverClientId = hVar.f73520l;
        Intrinsics.checkNotNullParameter(serverClientId, "serverClientId");
        ej.b credentialOption = new ej.b(serverClientId, null, null);
        Intrinsics.checkNotNullParameter(credentialOption, "credentialOption");
        arrayList.add(credentialOption);
        return new y(CollectionsKt.F0(arrayList), null, false, null, false);
    }

    @Override // or1.p
    public final String a() {
        return this.f73524m;
    }

    @Override // lr1.g
    public final m c() {
        m mVar = new m(new m(g(true), new oo1.d(22, new f(this, 0)), 0), new oo1.d(23, new f(this, 1)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    @Override // lr1.g
    public final b0 d() {
        m mVar = new m(new m(g(true), new oo1.d(24, new f(this, 2)), 0), new oo1.d(25, g.f73523i), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    @Override // lr1.g
    public final b0 f() {
        m mVar = new m(new m(g(true), new oo1.d(26, new f(this, 3)), 0), new oo1.d(27, new f(this, 4)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }
}
