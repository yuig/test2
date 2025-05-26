package nv;

import es.h;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import lh0.j;

/* loaded from: classes.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92335i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f92336j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i13) {
        super(0);
        this.f92335i = i13;
        this.f92336j = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f92335i;
        b bVar = this.f92336j;
        switch (i13) {
            case 0:
                return Float.valueOf(bVar.f92341e.h(0, "android_ads_pin_validation") / 100.0f);
            default:
                j jVar = bVar.f92337a;
                h hVar = bVar.f92339c;
                es.a aVar = bVar.f92340d;
                return f0.l(new ov.a(jVar, hVar, aVar), new ov.b(bVar.f92337a, aVar));
        }
    }
}
