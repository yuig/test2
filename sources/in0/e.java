package in0;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import co2.z;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f72806r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f72807s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f72808t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, bl2.c cVar) {
        super(2, cVar);
        this.f72808t = fVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        e eVar = new e(this.f72808t, cVar);
        eVar.f72807s = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((z) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f72806r;
        if (i13 == 0) {
            ue.c.H(obj);
            z zVar = (z) this.f72807s;
            bn0.c cVar = new bn0.c(zVar);
            f fVar = this.f72808t;
            fVar.f72811c = cVar;
            zn2.h.f142318a.getClass();
            zn2.f.f142316a.getClass();
            long a13 = zn2.f.a();
            MediaCodec mediaCodec = fVar.f72810b;
            if (mediaCodec == null) {
                Intrinsics.r("decoder");
                throw null;
            }
            mediaCodec.reset();
            bn0.c cVar2 = fVar.f72811c;
            if (cVar2 == null) {
                Intrinsics.r("callback");
                throw null;
            }
            mediaCodec.setCallback(cVar2);
            fn0.e eVar = fVar.f72809a;
            if (eVar == null) {
                Intrinsics.r("mediaExtractor");
                throw null;
            }
            MediaFormat a14 = eVar.a();
            h hVar = fVar.f72812d;
            if (hVar == null) {
                Intrinsics.r("renderer");
                throw null;
            }
            mediaCodec.configure(a14, hVar.a().f65805d, (MediaCrypto) null, 0);
            mediaCodec.start();
            zn2.b.e(zn2.g.a(a13));
            d dVar = d.f72805i;
            this.f72806r = 1;
            if (dl2.b.w(zVar, dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
