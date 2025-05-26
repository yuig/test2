package yw;

import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public final class e extends j implements Function1 {

    /* renamed from: r, reason: collision with root package name */
    public int f140254r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f140255s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function1 f140256t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Function1 function1, bl2.c cVar) {
        super(1, cVar);
        this.f140255s = fVar;
        this.f140256t = function1;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new e(this.f140255s, this.f140256t, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((e) create((bl2.c) obj)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f140254r;
        if (i13 == 0) {
            ue.c.H(obj);
            tw.a aVar2 = this.f140255s.f140259a;
            this.f140254r = 1;
            obj = aVar2.a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        String string = ((ResponseBody) obj).string();
        this.f140256t.invoke(string);
        return new xz.b(string);
    }
}
