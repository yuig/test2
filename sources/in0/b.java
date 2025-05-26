package in0;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.view.Surface;
import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MediaFormat f72800r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SurfaceTexture f72801s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MediaFormat mediaFormat, SurfaceTexture surfaceTexture, bl2.c cVar) {
        super(2, cVar);
        this.f72800r = mediaFormat;
        this.f72801s = surfaceTexture;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f72800r, this.f72801s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        h hVar = new h();
        hVar.d(this.f72800r, new Surface(this.f72801s));
        return hVar;
    }
}
