package l81;

import android.content.Context;
import h32.i0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import x02.i2;

/* loaded from: classes5.dex */
public final class f extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82131i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f82132j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(l lVar, int i13) {
        super(0);
        this.f82131i = i13;
        this.f82132j = lVar;
    }

    public final i0 b() {
        int i13 = this.f82131i;
        l lVar = this.f82132j;
        switch (i13) {
            case 0:
                return lVar.generateLoggingContext();
            case 1:
                return lVar.generateLoggingContext();
            default:
                return com.bumptech.glide.d.i0(null, lVar.getD0(), lVar.getF111517j0(), "");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        if (((lh0.g1) r0.f83453a).o("android_visual_search_immersive_layout", "employees", r2) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0100, code lost:
    
        if (r0.l("android_uk_descriptor") == false) goto L61;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean invoke() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l81.f.invoke():java.lang.Boolean");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f82131i;
        l lVar = this.f82132j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return invoke();
            case 3:
                return b();
            case 4:
                Context requireContext = lVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new je1.a(requireContext);
            case 5:
                Context requireContext2 = lVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                i2 i2Var = lVar.R0;
                if (i2Var != null) {
                    return new ld1.b(requireContext2, i2Var);
                }
                Intrinsics.r("pinRepository");
                throw null;
            case 6:
                return invoke();
            case 7:
                return invoke();
            default:
                return invoke();
        }
    }
}
