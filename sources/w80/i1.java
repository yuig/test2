package w80;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class i1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128307i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ac.b f128308j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(ac.b bVar, int i13) {
        super(0);
        this.f128307i = i13;
        this.f128308j = bVar;
    }

    public final Float b() {
        int i13 = this.f128307i;
        ac.b bVar = this.f128308j;
        switch (i13) {
        }
        return Float.valueOf(((Number) ((ac.j) bVar).getValue()).floatValue());
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f128307i) {
        }
        return b();
    }
}
