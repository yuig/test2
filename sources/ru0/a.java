package ru0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pu0.u;
import pu0.w;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109973i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f109974j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(f fVar, int i13) {
        super(1);
        this.f109973i = i13;
        this.f109974j = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f109973i;
        f fVar = this.f109974j;
        switch (i13) {
            case 0:
                pu0.a it = (pu0.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                fVar.F3(new u(it));
                break;
            default:
                pu0.b it2 = (pu0.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                fVar.F3(new w(it2));
                break;
        }
        return Unit.f80348a;
    }
}
