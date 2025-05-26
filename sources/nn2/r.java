package nn2;

import am2.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.k0;
import kotlin.collections.s0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r extends q {

    /* renamed from: g, reason: collision with root package name */
    public final i0 f91634g;

    /* renamed from: h, reason: collision with root package name */
    public final String f91635h;

    /* renamed from: i, reason: collision with root package name */
    public final ym2.c f91636i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r(am2.i0 r17, tm2.e0 r18, vm2.f r19, vm2.a r20, nn2.l r21, ln2.o r22, java.lang.String r23, kotlin.jvm.functions.Function0 r24) {
        /*
            r16 = this;
            r6 = r16
            r14 = r17
            r0 = r18
            r15 = r23
            java.lang.String r1 = "packageDescriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            java.lang.String r1 = "proto"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "nameResolver"
            r2 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.lang.String r1 = "metadataVersion"
            r3 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            java.lang.String r1 = "components"
            r4 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            java.lang.String r1 = "debugName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            java.lang.String r1 = "classNames"
            r5 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            vm2.i r10 = new vm2.i
            tm2.y0 r1 = r0.f118228g
            java.lang.String r7 = "getTypeTable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r7)
            r10.<init>(r1)
            vm2.j r1 = vm2.j.f126249b
            tm2.f1 r1 = r0.f118229h
            java.lang.String r7 = "getVersionRequirementTable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r7)
            vm2.j r11 = re2.h.h(r1)
            r7 = r22
            r8 = r17
            r9 = r19
            r12 = r20
            r13 = r21
            lb.p0 r1 = r7.a(r8, r9, r10, r11, r12, r13)
            java.util.List r2 = r0.f118225d
            java.lang.String r3 = "getFunctionList(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.util.List r3 = r0.f118226e
            java.lang.String r4 = "getPropertyList(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.util.List r4 = r0.f118227f
            java.lang.String r0 = "getTypeAliasList(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            r0 = r16
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f91634g = r14
            r6.f91635h = r15
            r0 = r14
            dm2.k0 r0 = (dm2.k0) r0
            ym2.c r0 = r0.f55454e
            r6.f91636i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nn2.r.<init>(am2.i0, tm2.e0, vm2.f, vm2.a, nn2.l, ln2.o, java.lang.String, kotlin.jvm.functions.Function0):void");
    }

    @Override // nn2.q, in2.o, in2.p
    public final am2.j e(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        dl2.b.q2(((ln2.o) this.f91630b.f82653b).f84115h, location, this.f91634g, name);
        return super.e(name, location);
    }

    @Override // in2.o, in2.p
    public final Collection g(in2.g kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Collection i13 = i(kindFilter, nameFilter, hm2.e.WHEN_GET_ALL_DESCRIPTORS);
        Iterable iterable = ((ln2.o) this.f91630b.f82653b).f84117j;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            k0.u(((cm2.c) it.next()).a(this.f91636i), arrayList);
        }
        return CollectionsKt.l0(arrayList, i13);
    }

    @Override // nn2.q
    public final void h(ArrayList result, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
    }

    @Override // nn2.q
    public final ym2.b l(ym2.g name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ym2.b(this.f91636i, name);
    }

    @Override // nn2.q
    public final Set n() {
        return s0.f80394a;
    }

    @Override // nn2.q
    public final Set o() {
        return s0.f80394a;
    }

    @Override // nn2.q
    public final Set p() {
        return s0.f80394a;
    }

    @Override // nn2.q
    public final boolean q(ym2.g name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!super.q(name)) {
            Iterable iterable = ((ln2.o) this.f91630b.f82653b).f84117j;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (((cm2.c) it.next()).b(this.f91636i, name)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f91635h;
    }
}
