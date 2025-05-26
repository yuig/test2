package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class sf1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nm.u f11081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ if1 f11082b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf1(nm.u uVar, if1 if1Var, bl2.c cVar) {
        super(2, cVar);
        this.f11081a = uVar;
        this.f11082b = if1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new sf1(this.f11081a, this.f11082b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new sf1(this.f11081a, this.f11082b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        nm.u uVar = this.f11081a;
        Intrinsics.checkNotNullParameter("watermark_overlay_png_base64", "key");
        String str = "";
        Intrinsics.checkNotNullParameter("", "default");
        if (uVar != null) {
            try {
                Intrinsics.checkNotNullParameter(uVar, "<this>");
                Intrinsics.checkNotNullParameter("watermark_overlay_png_base64", "key");
                String p13 = uVar.v("watermark_overlay_png_base64").p();
                Intrinsics.checkNotNullExpressionValue(p13, "getAsString(...)");
                str = p13;
            } catch (Exception unused) {
            }
        }
        this.f11082b.f6389v = str;
        return Unit.f80348a;
    }
}
