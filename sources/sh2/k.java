package sh2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class k extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112985i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f112986j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j f112987k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, j jVar, int i13) {
        super(0);
        this.f112985i = i13;
        this.f112986j = lVar;
        this.f112987k = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f112985i;
        j jVar = this.f112987k;
        l lVar = this.f112986j;
        switch (i13) {
            case 0:
                try {
                    c0.d.M2("otel-logger-init");
                    Object value = lVar.f112990c.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "<get-sdk>(...)");
                    yi2.a aVar = ((yi2.d) value).f139180d;
                    jVar.getClass();
                    return aVar.f139173a.a("io.embrace.android.embracesdk.core").build();
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            default:
                try {
                    c0.d.M2("otel-tracer-init");
                    Object value2 = lVar.f112990c.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "<get-sdk>(...)");
                    jVar.getClass();
                    return ((yi2.d) value2).f139178b.b();
                } finally {
                }
        }
    }
}
