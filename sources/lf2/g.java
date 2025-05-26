package lf2;

import kh2.d1;
import kh2.m;
import kh2.o2;
import kh2.r0;
import kh2.y2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f83147i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f83148j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, int i13) {
        super(0);
        this.f83147i = i13;
        this.f83148j = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f83147i;
        i iVar = this.f83148j;
        switch (i13) {
            case 0:
                return ((r0) iVar.f83150a.g()).a();
            case 1:
                return ((kh2.i) iVar.f83150a.b()).a();
            case 2:
                return ((m) iVar.f83150a.c()).b();
            case 3:
                return ((d1) iVar.f83150a.f79550b).f79456b;
            case 4:
                y2 y2Var = (y2) iVar.f83150a.k();
                return (gg2.e) y2Var.f79760j.a(y2Var, y2.f79750l[9]);
            case 5:
                return ((o2) iVar.f83150a.j()).a();
            case 6:
                o2 o2Var = (o2) iVar.f83150a.j();
                return (qf2.d) o2Var.f79634c.a(o2Var, o2.f79631e[2]);
            case 7:
                return ((r0) iVar.f83150a.g()).d();
            case 8:
                return ((d1) iVar.f83150a.f79550b).f79455a;
            case 9:
                o2 o2Var2 = (o2) iVar.f83150a.j();
                return (oh2.f) o2Var2.f79635d.a(o2Var2, o2.f79631e[3]);
            default:
                return Boolean.valueOf(iVar.f83157h.a());
        }
    }
}
