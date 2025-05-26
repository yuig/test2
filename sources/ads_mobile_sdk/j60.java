package ads_mobile_sdk;

import android.app.AlertDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class j60 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlertDialog.Builder f6703a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j60(AlertDialog.Builder builder, bl2.c cVar) {
        super(2, cVar);
        this.f6703a = builder;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j60(this.f6703a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new j60(this.f6703a, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f6703a.create().show();
        return Unit.f80348a;
    }
}
