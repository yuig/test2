package de0;

import h32.f1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.s;
import nx.d0;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54550i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f54551j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0 f54552k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, i0 i0Var, int i13) {
        super(1);
        this.f54550i = i13;
        this.f54551j = dVar;
        this.f54552k = i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f54550i;
        i0 i0Var = this.f54552k;
        d dVar = this.f54551j;
        switch (i13) {
            case 0:
                d0 d0Var = dVar.f54557b;
                f1 f1Var = f1.IDEA_PIN_MULTI_DRAFT_EXPIRATION;
                HashMap hashMap = new HashMap();
                hashMap.put("num_of_drafts", String.valueOf((Integer) obj));
                hashMap.put("drafts_deletion_time", String.valueOf(System.currentTimeMillis() - i0Var.f80432a));
                Unit unit = Unit.f80348a;
                d0Var.g(f1Var, null, hashMap, false);
                break;
            default:
                d0 d0Var2 = dVar.f54557b;
                f1 f1Var2 = f1.IDEA_PIN_MULTI_DRAFT_EXPIRATION;
                HashMap o13 = ep.b.o("num_of_drafts", "-1");
                o13.put("drafts_deletion_time", String.valueOf(System.currentTimeMillis() - i0Var.f80432a));
                Unit unit2 = Unit.f80348a;
                d0Var2.g(f1Var2, null, o13, false);
                break;
        }
        return Unit.f80348a;
    }
}
