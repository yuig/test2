package e70;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import lh0.z0;
import so.oa;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f57611j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f57612k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f57613i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(0);
        this.f57613i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f57613i) {
            case 0:
                Context context = kb0.a.f79058b;
                return (c) ep.b.g(c.class);
            default:
                return new lh0.s((z0) ((oa) ((c) b.f57614a.getValue())).D0.get());
        }
    }
}
