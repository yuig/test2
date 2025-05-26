package mm2;

import am2.a1;
import am2.z0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends pn2.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f87675c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final on2.l f87676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dm2.b f87677e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(iVar.f87684k.c());
        this.f87677e = iVar;
        on2.u c13 = iVar.f87684k.c();
        g gVar = new g(iVar, 0);
        on2.q qVar = (on2.q) c13;
        qVar.getClass();
        this.f87676d = new on2.l(qVar, gVar);
    }

    @Override // pn2.b, pn2.b1
    public final am2.j b() {
        switch (this.f87675c) {
            case 0:
                return b();
            default:
                return (nn2.j) this.f87677e;
        }
    }

    @Override // pn2.b1
    public final boolean d() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x021b, code lost:
    
        if (r10 == null) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x036d  */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    @Override // pn2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection e() {
        /*
            Method dump skipped, instructions count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.h.e():java.util.Collection");
    }

    @Override // pn2.b1
    public final List getParameters() {
        on2.l lVar = this.f87676d;
        switch (this.f87675c) {
        }
        return (List) lVar.invoke();
    }

    @Override // pn2.l
    public final a1 j() {
        switch (this.f87675c) {
            case 0:
                return ((lm2.a) ((i) this.f87677e).f87684k.f107929a).f83943m;
            default:
                return z0.f15606a;
        }
    }

    @Override // pn2.b
    /* renamed from: q */
    public final am2.g b() {
        int i13 = this.f87675c;
        dm2.b bVar = this.f87677e;
        switch (i13) {
            case 0:
                return (i) bVar;
            default:
                return (nn2.j) bVar;
        }
    }

    public final String toString() {
        int i13 = this.f87675c;
        dm2.b bVar = this.f87677e;
        switch (i13) {
            case 0:
                String b13 = ((i) bVar).getName().b();
                Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
                return b13;
            default:
                String str = ((nn2.j) bVar).getName().f139478a;
                Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
                return str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(nn2.j jVar) {
        super(jVar.f91601l.d());
        this.f87677e = jVar;
        on2.u d2 = jVar.f91601l.d();
        nn2.g gVar = new nn2.g(jVar, 0);
        on2.q qVar = (on2.q) d2;
        qVar.getClass();
        this.f87676d = new on2.l(qVar, gVar);
    }
}
