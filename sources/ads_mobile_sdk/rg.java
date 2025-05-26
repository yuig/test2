package ads_mobile_sdk;

import android.net.Uri;
import android.view.InputEvent;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class rg extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f10605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sg f10606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f10607c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InputEvent f10608d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg(sg sgVar, Uri uri, InputEvent inputEvent, bl2.c cVar) {
        super(2, cVar);
        this.f10606b = sgVar;
        this.f10607c = uri;
        this.f10608d = inputEvent;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new rg(this.f10606b, this.f10607c, this.f10608d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rg) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f10605a;
        int i14 = 6;
        yx0 yx0Var = null;
        byte b13 = 0;
        byte b14 = 0;
        byte b15 = 0;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                fa.b r03 = g4.u.r0(this.f10606b.f11084a);
                if (r03 == null) {
                    return new kk0(new IllegalStateException(), yx0Var, b15 == true ? 1 : 0, i14);
                }
                Uri uri = this.f10607c;
                InputEvent inputEvent = this.f10608d;
                this.f10605a = 1;
                if (r03.c(uri, inputEvent, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            return new pk0(Unit.f80348a);
        } catch (Exception e13) {
            return new kk0(e13, b14 == true ? 1 : 0, b13 == true ? 1 : 0, i14);
        }
    }
}
