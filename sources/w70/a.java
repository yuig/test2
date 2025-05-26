package w70;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f128155j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f128156k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128157i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(0);
        this.f128157i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f128157i) {
            case 0:
                return new b();
            default:
                Context context = kb0.a.f79058b;
                return (c) ep.b.g(c.class);
        }
    }
}
