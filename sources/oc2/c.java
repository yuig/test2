package oc2;

import ao2.j0;
import com.pinterest.video.view.SimplePlayerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SimplePlayerView f94066r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SimplePlayerView simplePlayerView, bl2.c cVar) {
        super(2, cVar);
        this.f94066r = simplePlayerView;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f94066r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if ((!r0.isEmpty()) != false) goto L8;
     */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            ue.c.H(r4)
            com.pinterest.video.view.SimplePlayerView r4 = r3.f94066r
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L32
            r1 = 1
            java.util.List r0 = r0.getEnabledAccessibilityServiceList(r1)
            java.lang.String r2 = "getEnabledAccessibilityServiceList(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r1
            if (r0 == 0) goto L32
            goto L33
        L32:
            r1 = 0
        L33:
            r4.I = r1
            kotlin.Unit r4 = kotlin.Unit.f80348a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: oc2.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
