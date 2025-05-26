package bq0;

import a.h5;
import fk2.f0;
import jk2.j1;
import kk2.m;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;

/* loaded from: classes5.dex */
public final class d extends xk1.c {

    /* renamed from: k, reason: collision with root package name */
    public final String f23683k;

    /* renamed from: l, reason: collision with root package name */
    public final no1.e f23684l;

    /* renamed from: m, reason: collision with root package name */
    public final q12.b f23685m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String conversationId, no1.e conversationDataSource, q12.b conversationService) {
        super(null);
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(conversationDataSource, "conversationDataSource");
        Intrinsics.checkNotNullParameter(conversationService, "conversationService");
        this.f23683k = conversationId;
        this.f23684l = conversationDataSource;
        this.f23685m = conversationService;
        o(9, new b(this, 0));
        o(7, new b(this, 1));
        o(8, new pk0.b(5));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        Object obj = CollectionsKt.F0(this.f135191h).get(i13);
        i iVar = obj instanceof i ? (i) obj : null;
        Integer valueOf = iVar != null ? Integer.valueOf(iVar.getViewType()) : null;
        if (valueOf != null) {
            return valueOf.intValue();
        }
        String concat = "Item must be of type: ".concat(i.class.getSimpleName());
        vb0.j.f125466a.H(new IllegalStateException(concat));
        throw new IllegalStateException(concat);
    }

    @Override // xk1.c
    public final q k() {
        int i13 = xc0.i.conversation_settings_notifications;
        int i14 = xc0.i.conversation_settings_privacy_and_support;
        int i15 = 1;
        f0 f0Var = new f0(new m(this.f23685m.f(this.f23683k).r(tk2.e.f118017c).l(wj2.c.a()), new qk0.b(16, c.f23682i), 0), new h5(i15), null, 2);
        Intrinsics.checkNotNullExpressionValue(f0Var, "onErrorReturn(...)");
        j1 j1Var = new j1(f0Var.u(), new qk0.b(17, new ck0.a(i13, i14, i15)), 0);
        Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
        return j1Var;
    }
}
