package br0;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import rm1.q;
import rn1.k;
import u50.k0;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f23732j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f23733k = new b(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23734i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f23734i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f23734i) {
            case 0:
                k bind = (k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                fm1.a importantForAccessibility = fm1.a.NO;
                bind.getClass();
                Intrinsics.checkNotNullParameter(importantForAccessibility, "importantForAccessibility");
                bind.f108905t = importantForAccessibility;
                return Unit.f80348a;
            default:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                q qVar = q.CANCEL;
                om1.f fVar = om1.f.TRANSPARENT_DARK_GRAY;
                om1.e eVar = om1.e.MD;
                int i13 = x0.cancel;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return om1.c.e(it, qVar, eVar, fVar, null, new k0(i13, new ArrayList(0)), false, 0, 1000);
        }
    }
}
