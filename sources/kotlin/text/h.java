package kotlin.text;

import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f80491i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(1);
        this.f80491i = iVar;
    }

    public final MatchGroup b(int i13) {
        return this.f80491i.c(i13);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
