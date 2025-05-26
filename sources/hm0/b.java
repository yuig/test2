package hm0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import m60.x0;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69560i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f69561j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i13) {
        super(1);
        this.f69560i = i13;
        this.f69561j = cVar;
    }

    public final void b(Throwable th3) {
        int i13 = this.f69560i;
        c cVar = this.f69561j;
        switch (i13) {
            case 1:
                cVar.f69565d.m(((yk1.a) cVar.f69566e).f139224a.getString(x0.generic_error));
                break;
            default:
                cVar.f69565d.m(((yk1.a) cVar.f69566e).f139224a.getString(x0.generic_error));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f69560i
            switch(r0) {
                case 0: goto L15;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            r7.b(r8)
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        Ld:
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            r7.b(r8)
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        L15:
            com.pinterest.api.model.v7 r8 = (com.pinterest.api.model.v7) r8
            hm0.c r0 = r7.f69561j
            r0.f69571j = r8
            boolean[] r1 = r8.f42764n0
            int r2 = r1.length
            r3 = 0
            r4 = 1
            r5 = 14
            if (r2 <= r5) goto L39
            boolean r1 = r1[r5]
            if (r1 == 0) goto L39
            java.lang.Boolean r1 = r8.K0()
            java.lang.String r2 = "getCollaboratorInvitesEnabled(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L39
            r1 = r4
            goto L3a
        L39:
            r1 = r3
        L3a:
            r0.f69568g = r1
            boolean[] r1 = r8.f42764n0
            int r2 = r1.length
            r5 = 17
            if (r2 <= r5) goto L57
            boolean r1 = r1[r5]
            if (r1 == 0) goto L57
            java.lang.Boolean r1 = r8.P0()
            java.lang.String r2 = "getCollaboratorRequestsEnabled(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L57
            r3 = r4
        L57:
            r0.f69569h = r3
            boolean r1 = kh2.d.M0(r8)
            r0.f69570i = r1
            yk1.n r1 = r0.getView()
            gm0.a r1 = (gm0.a) r1
            gi.m r2 = r0.f69564c
            r2.getClass()
            y22.f r8 = gi.m.E(r8)
            r0.q3(r8)
            boolean r8 = r0.f69568g
            im0.d r1 = (im0.d) r1
            com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel r2 = r1.f72612p0
            r3 = 0
            if (r2 == 0) goto Lad
            jc0.m r5 = new jc0.m
            r6 = 26
            r5.<init>(r8, r6)
            r2.T(r5)
            boolean r8 = r0.f69569h
            boolean r0 = r0.f69570i
            java.lang.String r2 = "peopleCanRequestToJoinSwitch"
            if (r0 == 0) goto L9a
            com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel r5 = r1.f72613q0
            if (r5 == 0) goto L96
            im0.b r6 = im0.b.f72600j
            r5.T(r6)
            goto L9a
        L96:
            kotlin.jvm.internal.Intrinsics.r(r2)
            throw r3
        L9a:
            com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel r1 = r1.f72613q0
            if (r1 == 0) goto La9
            zp.c0 r2 = new zp.c0
            r2.<init>(r4, r8, r0)
            r1.T(r2)
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        La9:
            kotlin.jvm.internal.Intrinsics.r(r2)
            throw r3
        Lad:
            java.lang.String r8 = "collaboratorsCanInviteOthersSwitch"
            kotlin.jvm.internal.Intrinsics.r(r8)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hm0.b.invoke(java.lang.Object):java.lang.Object");
    }
}
