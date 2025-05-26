package sh2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class i extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112974i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f112975j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i13) {
        super(0);
        this.f112974i = i13;
        this.f112975j = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f112974i;
        j jVar = this.f112975j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(jVar.f112981f);
            default:
                Function0 function0 = jVar.f112976a;
                try {
                    c0.d.M2("process-identifier-init");
                    Object invoke = function0.invoke();
                    c0.d.N();
                    return (String) invoke;
                } finally {
                }
        }
    }
}
