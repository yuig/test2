package hx1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f70544i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ gx1.d f70545j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gx1.d dVar) {
        super(1);
        this.f70544i = jVar;
        this.f70545j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f70544i.p3(this.f70545j);
        return Unit.f80348a;
    }
}
