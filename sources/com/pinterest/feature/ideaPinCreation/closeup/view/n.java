package com.pinterest.feature.ideaPinCreation.closeup.view;

import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46254i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f46255j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(q qVar, int i13) {
        super(1);
        this.f46254i = i13;
        this.f46255j = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f46254i;
        q qVar = this.f46255j;
        switch (i13) {
            case 0:
                Throwable throwable = (Throwable) obj;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                qVar.b6().q(throwable, "IdeaPinCreationCloseupFragment: generate adjusted image for draft thumbnail", tb0.p.IDEA_PINS_CREATION);
                return Unit.f80348a;
            case 1:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = q.R0;
                return yl1.b.f(it, bs1.c.j2(new String[0], qVar.X8() ? m60.x0.done : m60.x0.next), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Navigation navigation = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                int i15 = q.R0;
                qVar.b9(navigation);
                return Unit.f80348a;
        }
    }
}
