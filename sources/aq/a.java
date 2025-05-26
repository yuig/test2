package aq;

import androidx.appcompat.widget.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20337i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f20338j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(q qVar, int i13) {
        super(1);
        this.f20337i = i13;
        this.f20338j = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g gVar = this.f20338j;
        int i13 = this.f20337i;
        switch (i13) {
            case 0:
                Throwable throwable = (Throwable) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.f(throwable);
                        switch (((q) gVar).f16668a) {
                            case 0:
                                Intrinsics.checkNotNullParameter(throwable, "throwable");
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(throwable, "throwable");
                                break;
                        }
                    default:
                        Intrinsics.f(throwable);
                        switch (((q) gVar).f16668a) {
                            case 0:
                                Intrinsics.checkNotNullParameter(throwable, "throwable");
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(throwable, "throwable");
                                break;
                        }
                }
                break;
            default:
                Throwable throwable2 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.f(throwable2);
                        switch (((q) gVar).f16668a) {
                            case 0:
                                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                                break;
                        }
                    default:
                        Intrinsics.f(throwable2);
                        switch (((q) gVar).f16668a) {
                            case 0:
                                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                                break;
                        }
                }
                break;
        }
        return Unit.f80348a;
    }
}
