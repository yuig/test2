package vn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i0 extends q {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f126326c;

    /* renamed from: d, reason: collision with root package name */
    public final int f126327d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i0(int r4, int r5) {
        /*
            r3 = this;
            r3.f126326c = r5
            r0 = 0
            r1 = 1
            if (r5 == r1) goto L23
            java.lang.String r5 = "must have at least "
            java.lang.String r2 = " value parameter"
            java.lang.StringBuilder r5 = a.a.s(r5, r4, r2)
            if (r4 <= r1) goto L14
            java.lang.String r2 = "s"
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            r3.<init>(r5, r1, r0)
            r3.f126327d = r4
            return
        L23:
            java.lang.String r5 = "must have exactly "
            java.lang.String r2 = " value parameters"
            java.lang.String r5 = a.a.e(r5, r4, r2)
            r3.<init>(r5, r1, r0)
            r3.f126327d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vn2.i0.<init>(int, int):void");
    }

    @Override // vn2.e
    public final boolean a(am2.x functionDescriptor) {
        int i13 = this.f126326c;
        int i14 = this.f126327d;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
                if (functionDescriptor.x().size() >= i14) {
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
                if (functionDescriptor.x().size() == i14) {
                    break;
                }
                break;
        }
        return true;
    }
}
