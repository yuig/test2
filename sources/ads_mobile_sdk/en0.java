package ads_mobile_sdk;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import ao2.j0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class en0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kn0 f4899b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f4900c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WebResourceRequest f4901d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en0(kn0 kn0Var, Uri uri, WebResourceRequest webResourceRequest, bl2.c cVar) {
        super(2, cVar);
        this.f4899b = kn0Var;
        this.f4900c = uri;
        this.f4901d = webResourceRequest;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new en0(this.f4899b, this.f4900c, this.f4901d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((en0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f4898a;
        if (i13 == 0) {
            ue.c.H(obj);
            ed2 ed2Var = this.f4899b.f7412r;
            if (ed2Var != null) {
                String uri = this.f4900c.toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                px pxVar = px.AD_RESOURCE_CREATIVE;
                Map<String, String> requestHeaders = this.f4901d.getRequestHeaders();
                if (requestHeaders == null) {
                    requestHeaders = kotlin.collections.z0.d();
                }
                this.f4898a = 1;
                if (ed2Var.a(uri, pxVar, requestHeaders, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
