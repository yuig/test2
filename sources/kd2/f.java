package kd2;

import android.content.Context;
import ao2.j0;
import dl2.j;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class f extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f79267r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f79268s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f79267r = context;
        this.f79268s = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f79267r, this.f79268s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        File file = new File(this.f79267r.getFilesDir(), "overlay_assets");
        i iVar = this.f79268s;
        iVar.getClass();
        if (!file.exists()) {
            file.mkdirs();
        }
        iVar.f79278f = file.getAbsolutePath();
        return Unit.f80348a;
    }
}
