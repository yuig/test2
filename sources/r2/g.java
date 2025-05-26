package r2;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f106044i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar) {
        super(1);
        this.f106044i = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k kVar = this.f106044i.f106051c;
        return Boolean.valueOf(kVar != null ? kVar.b(obj) : true);
    }
}
