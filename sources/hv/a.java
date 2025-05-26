package hv;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70429i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f70430j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(e eVar, int i13) {
        super(0);
        this.f70429i = i13;
        this.f70430j = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f70429i;
        e eVar = this.f70430j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(eVar.f70437d);
            case 1:
                return Boolean.valueOf(eVar.f70442i);
            default:
                return Boolean.valueOf(eVar.f70438e);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f70429i) {
        }
        return invoke();
    }
}
