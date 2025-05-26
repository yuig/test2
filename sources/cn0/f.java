package cn0;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import co2.b0;
import co2.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;

/* loaded from: classes5.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public j0 f28056r;

    /* renamed from: s, reason: collision with root package name */
    public j0 f28057s;

    /* renamed from: t, reason: collision with root package name */
    public MediaCodec f28058t;

    /* renamed from: u, reason: collision with root package name */
    public int f28059u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f28060v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f28061w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b0 f28062x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, b0 b0Var, bl2.c cVar) {
        super(2, cVar);
        this.f28061w = iVar;
        this.f28062x = b0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f fVar = new f(this.f28061w, this.f28062x, cVar);
        fVar.f28060v = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((z) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        z zVar;
        j0 j0Var;
        j0 j0Var2;
        MediaCodec mediaCodec;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f28059u;
        i iVar = this.f28061w;
        if (i13 == 0) {
            ue.c.H(obj);
            zVar = (z) this.f28060v;
            bn0.c cVar = new bn0.c(zVar);
            j0Var = new j0();
            j0 j0Var3 = new j0();
            MediaCodec mediaCodec2 = iVar.f28076i;
            if (mediaCodec2 == null) {
                Intrinsics.r("encoder");
                throw null;
            }
            mediaCodec2.reset();
            mediaCodec2.setCallback(cVar);
            MediaFormat mediaFormat = iVar.f28072e;
            if (mediaFormat == null) {
                Intrinsics.r("outputFormat");
                throw null;
            }
            mediaCodec2.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            Surface createInputSurface = mediaCodec2.createInputSurface();
            Intrinsics.checkNotNullExpressionValue(createInputSurface, "createInputSurface(...)");
            j0Var.f80434a = createInputSurface;
            e eVar = new e(iVar, createInputSurface, j0Var3, null);
            this.f28060v = zVar;
            this.f28056r = j0Var;
            this.f28057s = j0Var3;
            this.f28058t = mediaCodec2;
            this.f28059u = 1;
            if (kotlin.jvm.internal.j.M(this, iVar.f28078k, eVar) == aVar) {
                return aVar;
            }
            j0Var2 = j0Var3;
            mediaCodec = mediaCodec2;
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            mediaCodec = this.f28058t;
            j0Var2 = this.f28057s;
            j0Var = this.f28056r;
            zVar = (z) this.f28060v;
            ue.c.H(obj);
        }
        mediaCodec.start();
        kotlin.jvm.internal.j.z(zVar, iVar.f28078k, null, new b(this.f28062x, iVar, (be2.b) j0Var2.f80434a, null), 2);
        k1.q qVar = new k1.q(iVar, j0Var, j0Var2);
        this.f28060v = null;
        this.f28056r = null;
        this.f28057s = null;
        this.f28058t = null;
        this.f28059u = 2;
        if (dl2.b.w(zVar, qVar, this) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}
