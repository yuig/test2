package ru0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import pu0.o;
import pu0.y;

/* loaded from: classes5.dex */
public final /* synthetic */ class c extends p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109977a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Object obj, int i13) {
        super(1, obj, f.class, "transitionActions", "transitionActions(Lcom/pinterest/feature/ideaPinCreation/duration/TransitionAction;)V", 0);
        this.f109977a = i13;
        if (i13 == 1) {
            super(1, obj, j.class, "send", "send(Lcom/pinterest/feature/ideaPinCreation/duration/OverlayTransitionSelectionAction;)V", 0);
        } else if (i13 != 2) {
        } else {
            super(1, obj, j.class, "send", "send(Lcom/pinterest/feature/ideaPinCreation/duration/OverlayTransitionSelectionAction;)V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f109977a;
        switch (i13) {
            case 0:
                y p03 = (y) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((f) this.receiver).F3(p03);
                break;
            case 1:
                o p04 = (o) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(p04, "p0");
                        ((j) this.receiver).t3(p04);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(p04, "p0");
                        ((j) this.receiver).t3(p04);
                        break;
                }
                break;
            default:
                o p05 = (o) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(p05, "p0");
                        ((j) this.receiver).t3(p05);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(p05, "p0");
                        ((j) this.receiver).t3(p05);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
