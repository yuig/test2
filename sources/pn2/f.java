package pn2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f100788i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a1 f100789j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ sn2.k f100790k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ sn2.g f100791l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ArrayList arrayList, a1 a1Var, sn2.k kVar, sn2.g gVar) {
        super(1);
        this.f100788i = arrayList;
        this.f100789j = a1Var;
        this.f100790k = kVar;
        this.f100791l = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        v0 runForkingPoint = (v0) obj;
        Intrinsics.checkNotNullParameter(runForkingPoint, "$this$runForkingPoint");
        Iterator it = this.f100788i.iterator();
        while (it.hasNext()) {
            e block = new e(this.f100789j, this.f100790k, (sn2.g) it.next(), this.f100791l);
            runForkingPoint.getClass();
            Intrinsics.checkNotNullParameter(block, "block");
            if (!runForkingPoint.f100852a) {
                runForkingPoint.f100852a = ((Boolean) block.invoke()).booleanValue();
            }
        }
        return Unit.f80348a;
    }
}
