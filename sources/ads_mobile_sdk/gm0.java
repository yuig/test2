package ads_mobile_sdk;

import ao2.j0;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class gm0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym0 f5610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UUID f5612c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f5614e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm0(ym0 ym0Var, String str, UUID uuid, String str2, String str3, bl2.c cVar) {
        super(2, cVar);
        this.f5610a = ym0Var;
        this.f5611b = str;
        this.f5612c = uuid;
        this.f5613d = str2;
        this.f5614e = str3;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new gm0(this.f5610a, this.f5611b, this.f5612c, this.f5613d, this.f5614e, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gm0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f5610a.evaluateJavascript(this.f5611b + "({\"id\": \"" + this.f5612c + "\", \"args\": " + this.f5613d + ", \"use_javascript_interface\": \"" + this.f5614e + "\"});", null);
        return Unit.f80348a;
    }
}
