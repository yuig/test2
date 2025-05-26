package y1;

import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f136601i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f136602j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        super(1);
        this.f136601i = h0Var;
        this.f136602j = h0Var2;
    }

    public final void b(MatchResult matchResult) {
        kotlin.jvm.internal.h0 h0Var = this.f136601i;
        if (h0Var.f80426a == -1) {
            h0Var.f80426a = matchResult.a().f80453a;
        }
        this.f136602j.f80426a = matchResult.a().f80454b + 1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((MatchResult) obj);
        return "";
    }
}
