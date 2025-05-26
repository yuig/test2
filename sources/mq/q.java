package mq;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88012i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u f88013j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(u uVar, int i13) {
        super(1);
        this.f88012i = i13;
        this.f88013j = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u uVar = this.f88013j;
        int i13 = this.f88012i;
        switch (i13) {
            case 0:
                f30 currentPin = (f30) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(currentPin, "currentPin");
                        u.c8(uVar, currentPin);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(currentPin, "deletedPin");
                        u.b8(uVar, currentPin);
                        break;
                }
                break;
            default:
                f30 currentPin2 = (f30) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(currentPin2, "currentPin");
                        u.c8(uVar, currentPin2);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(currentPin2, "deletedPin");
                        u.b8(uVar, currentPin2);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
