package ug1;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.m0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f122154j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f122155k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f122156l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f122157m = new c(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c f122158n = new c(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122159i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f122159i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f122159i) {
            case 0:
                return Unit.f80348a;
            case 1:
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(list, "list");
                return CollectionsKt.d0(list) instanceof gb2.i ? m0.F(list, gb2.i.class) : q0.f80391a;
            case 2:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.isEmpty());
            case 3:
                List it2 = (List) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return (gb2.i) d7.b.j0(it2);
            default:
                return Unit.f80348a;
        }
    }
}
