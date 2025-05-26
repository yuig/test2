package yp0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.f0;
import vb0.j;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f139606j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f139607k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139608i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f139608i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f0 f0Var = j.f125466a;
        int i13 = this.f139608i;
        switch (i13) {
            case 0:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.f(th3);
                        f0Var.H(th3);
                        break;
                    default:
                        Intrinsics.f(th3);
                        f0Var.H(th3);
                        break;
                }
                break;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.f(th4);
                        f0Var.H(th4);
                        break;
                    default:
                        Intrinsics.f(th4);
                        f0Var.H(th4);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
