package n60;

import android.app.Application;
import ao2.j0;
import com.pinterest.typeaheadroom.AppDatabase;
import ja.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f89252r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f89252r = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f89252r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        Application context = this.f89252r.f89259a;
        Intrinsics.checkNotNullParameter(context, "context");
        a0 a13 = se.l.a(context, AppDatabase.class, "search-typeahead");
        a13.f75161j = true;
        a13.f75163l = false;
        a13.f75164m = true;
        x92.c.f134369b = (AppDatabase) a13.b();
        return Unit.f80348a;
    }
}
