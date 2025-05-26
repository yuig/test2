package jf2;

import ao2.j0;
import ao2.q0;
import ao2.v0;
import dl2.j;
import info.mqtt.android.service.room.MqMessageDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.f0;

/* loaded from: classes4.dex */
public final class e extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f75882r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f75883s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f0 f75884t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ MqMessageDatabase f75885u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f75886v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f75887w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f0 f0Var, MqMessageDatabase mqMessageDatabase, String str, String str2, bl2.c cVar) {
        super(2, cVar);
        this.f75884t = f0Var;
        this.f75885u = mqMessageDatabase;
        this.f75886v = str;
        this.f75887w = str2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        e eVar = new e(this.f75884t, this.f75885u, this.f75886v, this.f75887w, cVar);
        eVar.f75883s = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        f0 f0Var;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f75882r;
        if (i13 == 0) {
            ue.c.H(obj);
            j0 j0Var = (j0) this.f75883s;
            ko2.f fVar = v0.f20219a;
            q0 d2 = kotlin.jvm.internal.j.d(j0Var, ko2.e.f80326c, new d(this.f75885u, this.f75886v, this.f75887w, null), 2);
            f0 f0Var2 = this.f75884t;
            this.f75883s = f0Var2;
            this.f75882r = 1;
            obj = d2.v(this);
            if (obj == aVar) {
                return aVar;
            }
            f0Var = f0Var2;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f0Var = (f0) this.f75883s;
            ue.c.H(obj);
        }
        f0Var.f80424a = ((Boolean) obj).booleanValue();
        return Unit.f80348a;
    }
}
