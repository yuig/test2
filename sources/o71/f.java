package o71;

import java.util.Set;
import kotlin.collections.h1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93273i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f93274j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, int i13) {
        super(0);
        this.f93273i = i13;
        this.f93274j = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f93273i;
        i iVar = this.f93274j;
        switch (i13) {
            case 0:
                m mVar = iVar.f93301l;
                Set typesToFilterOut = h1.f(br.c.AUTO_COMPLETE_UPSELL, br.c.SEARCH_FILTER_QUERY);
                Intrinsics.checkNotNullParameter(mVar, "<this>");
                w screenNavigatorManager = iVar.f93400k;
                Intrinsics.checkNotNullParameter(screenNavigatorManager, "screenNavigatorManager");
                Intrinsics.checkNotNullParameter(typesToFilterOut, "typesToFilterOut");
                m60.w wVar = mVar.f93338f;
                boolean a13 = mVar.f93341i.a();
                ((hf0.b) mVar.f93344l).getClass();
                boolean q13 = hf0.b.q();
                m71.a aVar = (m71.a) mVar.f93348p.getValue();
                return new l71.m(wVar, screenNavigatorManager, mVar.f93339g, mVar.f93334b, mVar.f93337e, mVar.f93343k, mVar.f93336d, mVar.f93342j, mVar.f93346n, a13, aVar, mVar.f93335c, q13, typesToFilterOut);
            default:
                m mVar2 = iVar.f93301l;
                Intrinsics.checkNotNullParameter(mVar2, "<this>");
                w screenNavigatorManager2 = iVar.f93400k;
                Intrinsics.checkNotNullParameter(screenNavigatorManager2, "screenNavigatorManager");
                m60.w wVar2 = mVar2.f93338f;
                ((hf0.b) mVar2.f93344l).getClass();
                boolean q14 = hf0.b.q();
                return new l71.n(wVar2, screenNavigatorManager2, mVar2.f93339g, mVar2.f93334b, mVar2.f93337e, mVar2.f93343k, mVar2.f93336d, mVar2.f93342j, q14);
        }
    }
}
