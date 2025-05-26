package yq;

import android.content.Context;
import df.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import m60.f0;

/* loaded from: classes3.dex */
public final class b extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f139627j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f139628k = new b(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139629i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(0);
        this.f139629i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f139629i) {
            case 0:
                Context context = kb0.a.f79058b;
                return (a) j1.b0(a.class, f0.W());
            default:
                return Unit.f80348a;
        }
    }
}
