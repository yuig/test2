package androidx.fragment.app.strictmode;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/strictmode/WrongNestedHierarchyViolation;", "Landroidx/fragment/app/strictmode/Violation;", "fragment_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class WrongNestedHierarchyViolation extends Violation {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public WrongNestedHierarchyViolation(androidx.fragment.app.Fragment r3, androidx.fragment.app.Fragment r4, int r5) {
        /*
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "expectedParentFragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Attempting to nest fragment "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = " within the view of parent fragment "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " via container with ID "
            r0.append(r4)
            java.lang.String r4 = " without using parent's childFragmentManager"
            java.lang.String r4 = a.a.n(r0, r5, r4)
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.strictmode.WrongNestedHierarchyViolation.<init>(androidx.fragment.app.Fragment, androidx.fragment.app.Fragment, int):void");
    }
}
