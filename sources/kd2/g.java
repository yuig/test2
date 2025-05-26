package kd2;

import android.content.Context;
import ao2.j0;
import dl2.j;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class g extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f79269r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f79270s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f79269r = context;
        this.f79270s = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f79269r, this.f79270s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        File file = new File(this.f79269r.getCacheDir(), "video_export");
        this.f79270s.getClass();
        if (!file.exists()) {
            file.mkdirs();
        }
        file.getAbsolutePath();
        return Unit.f80348a;
    }
}
